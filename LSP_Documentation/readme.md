# LSP Documentation
## Xtext LSP 
#### General Operating Principle
Xtext as of version 2.11 ships with a built-in LSP support.
For this purpose, it has a dependency to [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (which has to be installed separately) and provides an Xtext-specific implementation of the <code>LanguageServer</code> interface provided by LSP4J.
The entry point to start this LS implementation is the class <code>org.eclipse.ide.server.ServerLauncher</code>, which provides a <code>main</code>-method and thereby serves as executable.

#### LSP Versions
Before setting up the environment, one should check which LSP versions the client and the server are/shall be compliant to.
The LSP4J version determines which LSP version is supported, so that the Xtext version with its dependency to a concrete LSP4J version determines the supported protocol version.
This also means, that you have to install the LSP4J version fitting to the Xtext version, as LSP4J is not shipped with Xtext.
For example, the current Xtext versions 2.24 and 2.25 [with its dependencies to LSP4J versions 0.10.0-0.12.0 support LSP V3.16](https://www.eclipse.org/Xtext/documentation/340_lsp_support.html#language-features).
Regarding such version choices, one should also keep in mind that only the Xtext versions [up to 2.22.0 still natively support Java 8, where 2.23.0 should also be possible](https://www.eclipse.org/Xtext/releasenotes.html#/releasenotes/2020/09/01/version-2-23-0).
However, this [Gradle build script](https://github.com/itemis/xtext-languageserver-example/blob/master/build.gradle) runs with Xtext V2.23.0 and Java 8.
Unfortunately, this will only run with LSP V3.15, so that this older LSP version has to be configured in, e.g., VS Code (see below).
On the other hand, this could be irrelevant to Volvo as they only should care what they experience in VS Code.

#### Undocumented Prerequisites <a name="prerequisitesXtextGeneral"></a> 
Add the following plugin dependencies to your <code>\<yourXtextPluginsBasicName\>.ide</code> project:
  -  <code>org.eclipse.lsp4j</code>
  -  <code>org.eclipse.lsp4j.jsonrpc</code>
  -  <code>io.github.classgraph</code>
  -  <code>com.google.gson</code>


#### Syntax Highlighting 
  LSP (up to the current version 3.16) does not define syntax highlighting, which is intended to be rendered at client side. 
  I did not experiment with this, but it should be easily possible to add it by declaratively define the kewywords to be highlighted 
(cf. the following subsections on links how to define it for the particular contexts).



### Xtext LSP in Development Eclipse
  This approach is not really needed but can be used optionally to check whether the Xtext LS runs in general before exporting it to other IDEs.

#### Setting up an Xext LS in a Development Eclipse
  Additionally to LSP4J, this approach requires the installation of [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e).
  After you also incorporated the [undocumented prerequisites](#prerequisitesXtextGeneral), you can basically follow this [documentation](https://www.eclipse.org/Xtext/documentation/340_lsp_support.html#getting-started).
  Afterward, you are able to create a text file with the corresponding file suffix anywhere in your **development** Eclipse. 
  On opening this text file (I had the best experience with <code>Open with -> Generic Text Editor</code>), an Xtext LS is spawned that looks and feels quite similar to the Xtext IDE for this text file kind in your runtime Eclipse.


#### Syntax Highlighting
  Syntax highlighting can be added by means of [TextMate](https://projects.eclipse.org/projects/technology.tm4e) (e.g., see step 4 of the documentation).




### Xtext LSP in VS Code
  In this approach, you---simplifiedly speaking---export an executable of the Xtext LS server into VS Code and register a VS Code extension (basically acting as the language client) that registers a text file suffix with the action of starting the corresponding Xtext LS server.
  Alternatively, you can for debugging purposes start the Xtext LS in Eclipse and let it communicate via a websocket.
  I did not experiment with this latter variant until now, but after my experiences with this GLSP setting and the problems on exporting an Xtext LS executable should be the starting point.
  Note that for this latter case an own sort of [server launcher](https://github.com/itemis/xtext-languageserver-example/blob/master/org.xtext.example.mydsl.ide/src/org/xtext/example/mydsl/ide/RunServer.java) has to be provided (instead of the default <code>org.eclipse.ide.server.ServerLauncher</code>).
  However, using the latter case you should be able to skip the complete painful part of [exporting the Xtext LS as executable](#ExportXtextLS)
  
  
  #### Exporting the Xtext LS as Executable <a name="ExportXtextLS"></a>
  **Remark:**
  "The Internet" says that this is very easy, but this is not the case (at least it wasn't easy for me).
  It gets more complicated, if as in our case an [existing metamodel is present in a dedicated plugin](https://github.com/cdietrich/xtext-existing-metamodel-gradle-example).
  Regarding exporting the Xtext LS executable and registering the VS Code extension, we need to find out a definitly working approach.
  In the end, I combined two different approaches that accidently worked for me.
  Thus, the sections are written quite vague.
  
  Most VS Code extensions should also run in current Eclipse Theia versions (I did not try it), as both IDEs share many concepts but unfortunately not all.
  However, you can find also many code examples that provide so-called Eclipse Theia extensions (also for GLSP), but these are only for older Theia versions---don't care about them.  
  
  You have to bundle your Xtext plugins with Gradle or Maven, where people say it is easier with Gradle---so I used this approach.
  As a starting point, you can create new Xtext plugins from an Ecore metamodel with the following options and then adapt the Gradle scripts for your probably already existing plugins to your needs:
  
  ![image](https://user-images.githubusercontent.com/82101353/125102656-d15e2600-e0db-11eb-8118-97f627c2ef6b.png)
  
  The "Fat Jar" option uses the ["ShadowJar" Gradle plugin](https://github.com/johnrengelman/shadow) and should bundle **all** required compiled classes (including all dependencies to LSP4J etc.) to one Jar archive.
  For this purpose, this Xtext Wizard option creates a parent plugin that contains the main Gradle script as well as the actual Xtext plugins with dedicated Gradle settings.
  However, although the Jar archive looks fine at the first glance, it was not sufficient for me (see next section).
  
  Furthermore, if you infer the grammar from a metamodel that typically resides in an already existing plugin, this is not considered by the Gradle scripts.
  Thus, you have to adapt the main Gradle script as well as the particular plugins' Gradle settings to also include the base metamodel plugin as dependency.
  I prefer the following structure, similar to the one that the Xtext wizard proposes: 
  - Having the main Gradle scripts directly in the Eclipse development workspace, where <code>settings.gradle</code> includes all relevant plugins (particularly, <code>include '\<yourBaseMetamodelPlugin\>')</code>.
  - The main Gradle script is the <code>build.gradle</code> in the Eclipse development workspace. 
  This might be adapted from the initially generated Gradle scripts from the Xtext wizard using the "Generic IDE Support" and "Fat Jar" options (see above).
  However, as the deployment did not really work out for me (see below), we should in the future have a look into the [script applied in the Xtext LS example] (https://github.com/itemis/xtext-languageserver-example/blob/master/build.gradle), which still seems to be up-to-date.
  - Any of the packaged plugins (i.e., subfolders of the Eclipse development workspace) must have a dedicated <code>settings.gradle</code> that covers all the required dependencies.
  - During packaging the plugins with Gradle, keep the LSP and Java versions in mind!  
  
  ##### Required Plugin Adaptations as Prerequisite
  - In the plugin <code>\<yourXtextPluginsBasicName\></code>, [extend the class](https://github.com/cdietrich/xtext-existing-metamodel-gradle-example/blob/master/org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDslStandaloneSetup.xtend) <code>\<yourXtextPluginsBasicName\>.\<yourGrammarName\>StandaloneSetup</code> by overriding the method <code>register</code>. 
  This is required in VS Code for unknown reasons.
  Luckily, this causes no changes to the behavior of the conventional Xtext editor and hence can safely be added.
  ``` 
@Override
public void register(Injector injector) {
    if (!EPackage.Registry.INSTANCE.containsKey("\<yourBaseMetamodelNamespaceUri\>")) {
      EPackage.Registry.INSTANCE.put("\<yourBaseMetamodelNamespaceUri\>", \<yourBaseMetamodel\>Package.eINSTANCE);
    }
    super.register(injector);
}	
  ```
  
  - It might be also the case, that you have to [add an EMF-specific property](https://blogs.itemis.com/en/integrating-xtext-language-support-in-visual-studio-code) to the <code>\<yourXtextPluginsBasicName\>.ide/src/plugin.properties</code>, which is <code>_UI_DiagnosticRoot_diagnostic=foo</code> (or some other value of your choice).
  I added it in the assumption it fixes a problem, but actually I don't know whether it had an effect and was really needed.
  
  
#### Registering the VS Code Extension
  VS Code extensions can be compared to Eclipse plugins: One develops the extension in the development VS Code and executes it in a runtime VS Code in which the extension is loaded and can be used.
  If packaging the Xtext plugin was done properly (which is not that easy ;-)), registering the VS Code extension is comparably simple.
  There are two possible settings: [Spawn the Xtext LS server as an executable on opening the client extension](https://github.com/itemis/xtext-languageserver-example/tree/master/vscode-extension-self-contained), or [let the client extension communicate with an Xtext LS running in Eclipse via a websockdet](https://github.com/itemis/xtext-languageserver-example/tree/master/vscode-extension) (no experiences with this setting until now, unfortunately, but probably the better starting point for debugging).
  Due to the missing experience with the debugging websocket variant, the following hints focus on the standalone variant.
  Nevertheless, registering the extension should be very similar and only differ in the <code>extension.ts</code> and deploying the Xtext LS executable.
  
##### If Running the Standalone Approach: Deploying the Xtext LS Executable
  ... to be written after HDD is restored ...
  
##### package.json
  The entry point for registering the VS Code client extension is the file [<code>package.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/package.json).
  You can adapt the linked file for your purposes, and particularly ignore and delete anything that has to do with commands (this is only relevant for the specific example).
  The important lines are:
  - <code>"main": "out/extension",</code>: This specifies where the compiled code of the extension to be executed can be found (where the <code>out</code> directory was set as the one that contains code to compile to is specified in the [src/tsconfig.json](#tsconfigXtextLSVSCode))
  - <code>"id": "\<uniqueLanguageID\>",</code>: Register your language with an ID
  - <code>"aliases": [ "\<languageDisplayName\>" ],</code>: Text that will be shown in the bottomright corner of the VS Code client extension if properly registered and opened (e.g., "EAText", "EAST-ADL Text Editor", ...)
  - <code>"extensions": [ ".\<filenameSuffix\>" ],</code>: Most important, the registration of the filename suffix that you want to register the extension with (e.g., ".eatxt")
  - <code>"configuration": "./mydsl.configuration.json"</code>: Optional, for setting defaults like the definition of comments, auto-closing of brackets, etc. (see [mydsl.configuration.json](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension/mydsl.configuration.json) that is basically the same for all Xtext-based languages)
  - Regarding the parts <code>dependencies</code> and <code>devDependencies</code>, see the [section on LSP versions](#LSPVersionsVSCode).
  
##### src/tsconfig.json <a name="tsconfigXtextLSVSCode"></a>
  Check the [<code>src/tsconfig.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/src/tsconfig.json), where the most important line <code>"outDir": "../out"</code> specifying the directory the code shall be compiled to.
  
##### extension.ts
  The actual TypeScript code to start the extension, which gets executed (to be more precise, the compiled JavaScript code as part of the <code>outDir</code> gets executed) after a text file with the registered filename suffix is opened in the client extension (i.e., the VS Code runtime).
  The standalone variant with a compiled Xtext LS executable can be found (here)[https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/src/extension.ts], whereas the variant with an external server process in Eclipse (or running the executable in a dedicated process) can be found (here)[https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension/src/extension.ts].
  As one can see, both variants only differ in the variable <code>serverOptions</code>.
  As for the <code>package.json</code>, you can get rid of command (as well as context) stuff.
  This will result in very simple code looking like that:
```
let lc = new LanguageClient('Xtext Server', serverOptions, clientOptions);
lc.start();
``` 
  
##### launch.json
  To run the extension in a runtime VS Code, provide as part of the directory <code>.vscode</code> this or a similar [<code>launch.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/.vscode/launch.json), where the line <code>"type": "extensionHost",</code> is the most important part, defining to run the code as an VS Code extension.

  
#### LSP Versions <a name="LSPVersionsVSCode"></a>
  For implementing a VS Code LSP extension and integrating an Xtext LS, one needs the VS Code npm package [vscode-languageclient](https://www.npmjs.com/package/vscode-languageclient).
  Its version [7.0.0 supports the current LSP version 3.16, whereas 6.1.x supports LSP version 3.15](https://github.com/Microsoft/vscode-languageserver-node#readme).
VS Code typically installs the latest version.
  Thus, if downgrading is required, one has to deinstall it completely and install a specific version (e.g., via <code>npm uninstall vscode-languageclient</code> and <code>npm install vscode-languageclient@6.1.4</code>).
  

#### Syntax Highlighting
  Syntax highlighting also bases on TextMate, but is better [integrated in VS Code](https://vscode-eastus.azurewebsites.net/api/language-extensions/syntax-highlight-guide).
  Integrate in your [<code>package.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/package.json) the following part and provide the referenced [<code>mydsl.tmLanguage.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension/syntaxes/mydsl.tmLanguage.json):
  ``` 
"grammars": [
    {
        "language": "\<uniqueLanguageID\",
        "scopeName": "text.\<filenameSuffix\",
        "path": "./syntaxes/mydsl.tmLanguage.json" // or any other name
    }
],
  ``` 


## GLSP
  For getting GLSP to run, one has to configure/develop a server side (mainly for relating EMF object instantation/modification with GLSP nodes/edges and defining unique IDs for the domain-specific model element types) an d a client side (mainly for binding the domain-specific model element types to concrete GLSP node types to be rendered).
  
### GLSP Server
  My setting was to have the GLSP server side in the version 0.9.0.RC1 in the [source code version from GitHub](https://github.com/eclipse-glsp/glsp-server) running in a dedicated Eclipse instance.
  This way, one can easily debug and conduct changes on the running server.
  For getting into it, I initially ran [the workflow example](https://github.com/eclipse-glsp/glsp-server/tree/master/examples/org.eclipse.glsp.example.workflow) and built, based on that, a minimal version of an own domain-specific EMF language.
  
  [There are two run configurations, which are are also provided on GitHub. 
  Only one run configuration worked for me, to be described after HDD is restored]
  
#### Metamodel Preparations
  For getting an own EMF model into the GLSP world, one has to let its metamodel elements derive from the [GLSP graph types metamodel](https://github.com/eclipse-glsp/glsp-server/blob/master/examples/org.eclipse.glsp.example.workflow/model/workflow-graph.ecore) (cf. the [workflow metamodel](https://github.com/eclipse-glsp/glsp-server/blob/master/plugins/org.eclipse.glsp.graph/model/glsp-graph.ecore)).
  For example, metamodel classes that shall be rendered as nodes have to derive from <code>GNode</code>, classes that shall be rendered as edges have to derive from <code>GEdge</code>, etc. (there is even a class <code>GPort</code>, which we hopefully can use for EAST-ADL ports).
  
  The challenge here is, that one has to extend the base metamodel for this purpose, which we probably do not want for the EAST-ADL metamodel.
  However, I think I read somewhere that you can bind GLSP graph types to your domain-specific concepts in the code in a leightweight manner (i.e., without modifying the base metamodel), but I do not find this part at the moment.
  
  #### \<yourBasePackage\>.\<yourDSML\>GLSPModule <a name="GLSPServerModule"></a>
  Mandatory and the entry point: The configuration for binding your own classes, e.g., diagram configurations, operation handlers.
  Let it derive from either [<code>org.eclipse.glsp.server.di.DefaultGLSPModule</code>](https://github.com/eclipse-glsp/glsp-server/blob/0.9.0.RC01/plugins/org.eclipse.glsp.server/src/org/eclipse/glsp/server/di/DefaultGLSPModule.java) or [<code>org.eclipse.glsp.server.di.GLSPModule</code>](https://github.com/eclipse-glsp/glsp-server/blob/0.9.0.RC01/plugins/org.eclipse.glsp.server/src/org/eclipse/glsp/server/di/GLSPModule.java), and implement all abstract methods to get an initial and minimal configuration.
  See the [<code>WorkflowGLSPModule</code>](https://github.com/eclipse-glsp/glsp-server/blob/master/examples/org.eclipse.glsp.example.workflow/src/org/eclipse/glsp/example/workflow/WorkflowGLSPModule.java) for an example application.
  
  Important methods to override will be (cf. the following sections):
 ``` 
 @Override
 protected Class<? extends GraphExtension> bindGraphExtension() {
      return <yourDSML>GraphExtension.class;
 }

@Override
protected void configureDiagramConfigurations(final MultiBinding<DiagramConfiguration> binding) {
      binding.add(<yourDSML>DiagramConfiguration.class);
}

@Override
protected void configureOperationHandlers(final MultiBinding<OperationHandler> binding) {
      super.configureOperationHandlers(binding);
      binding.add(Create<oneSpecificModelElementType>Handler.class);
      ...
      binding.add(Edit<oneSpecificModelElementType>Handler.class);
      ...
}
  ``` 
  
  
  #### \<yourBasePackage\>.\<yourDSML\>GraphExtension
...

  #### \<yourBasePackage\>.\<yourDSML\>DiagramConfiguration
....

  #### \<yourBasePackage\>.handler.Create<oneSpecificModelElementType>Handler
...
  
  
  #### \<yourBasePackage\>.\<yourDSML\>GLSPServer
  Optional, check [this workflow server](https://github.com/eclipse-glsp/glsp-server/blob/master/examples/org.eclipse.glsp.example.workflow/src/org/eclipse/glsp/example/workflow/WorkflowGLSPServer.java) for adding logging capabilities.
  To be binded in [the GLSPModule](#GLSPServerModule) by overriding the method <code>bindGLSPServer()</code>. 
  
### GLSP Client
  #### Application Core
  
  #### VS Code Integration Glue Code
