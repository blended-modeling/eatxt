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
  
  **Remark:**
  "The Internet" says that this is very easy, but this is not the case (at least it wasn't easy for me).
  It gets more complicated, if as in our case an [existing metamodel is present in a dedicated plugin](https://github.com/cdietrich/xtext-existing-metamodel-gradle-example).
  Regarding the sections on exporting the Xtext LS executable and registering the VS Code extension, we need to find out a definitly working approach.
  In the end, I combined two different approaches that accidently worked for me.
  Thus, the sections are written quite vague.
  
  Most VS Code extensions should also run in current Eclipse Theia versions (I did not try it), as both IDEs share many concepts but unfortunately not all.
  However, you can find also many code examples that provide so-called Eclipse Theia extensions (also for GLSP), but these are only for older Theia versions---don't care about them.
  
#### Required Plugin Adaptations as Prerequisite
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
  I added it in the assumption it fixes a problem, but actually I don't know whether it had an effect or was really needed.
  
  
  
#### Exporting the Xtext LS as Executable
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
  
#### Registering the VS Code Extension
  If packaging the Xtext plugin was done properly (which is not that easy ;-)), registering the VS Code extension is comparably simple.
  There are two possible settings: [Spawn the Xtext LS server as an executable on opening the client extension](https://github.com/itemis/xtext-languageserver-example/tree/master/vscode-extension-self-contained), or [let the client extension communicate with an Xtext LS running in Eclipse via a websockdet](https://github.com/itemis/xtext-languageserver-example/tree/master/vscode-extension) (no experiences with this setting until now, unfortunately, but probably the better starting point for debugging).
  Due to the missing experience with the debugging websocket variant, the following hints focus on the standalone variant.
  Nevertheless, registering the extension should be very similar and only differ in the <code>extension.ts</code> and deploying the Xtext LS executable.
  
##### package.json
  The entry point for registering the VS Code client extension is the file [<code>package.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/package.json).
  You can adapt the linked file for your purposes, and particularly ignore and delete anything that has to do with commands (this is only relevant for the specific example).
  The important lines are:
  - <code>"main": "out/extension",</code>: This specifies where the compiled code of the extension can be found (where the <code>out</code> directory was set as the one that contains the compiled code is specified in ...???...)
  - <code>"id": "\<uniqueLanguageID\>",</code>: Register your language with an ID
  - <code>"aliases": [ "\<languageDisplayName\>" ],</code>: Text that will be shown in the bottomright corner of the VS Code client extension if properly registered and opened (e.g., "EAText", "EAST-ADL Text Editor", ...)
  - <code>"extensions": [ ".\<filenameSuffix\>" ],</code>: Most important, the registration of the filename suffix that you want to register the extension with (e.g., ".eatxt")
  - <code>"configuration": "./mydsl.configuration.json"</code>: Optional, for setting defaults like the definition of comments, auto-closing of brackets, etc. (see [mydsl.configuration.json](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension/mydsl.configuration.json) that is basically the same for all Xtext-based languages)
  - Regarding the parts <code>dependencies</code> and <code>devDependencies</code>, see the [section on LSP versions](#LSPVersionsVSCode).
  
  
  
#### LSP Versions <a name="LSPVersionsVSCode"></a>
  For implementing a VS Code LSP extension and integrating an Xtext LS, one needs the VS Code npm package [vscode-languageclient](https://www.npmjs.com/package/vscode-languageclient).
  Its version [7.0.0 supports the current LSP version 3.16, whereas 6.1.x supports LSP version 3.15](https://github.com/Microsoft/vscode-languageserver-node#readme).
VS Code typically installs the latest version.
  Thus, if downgrading is required, one has to deinstall it completely and install a specific version (e.g., via <code>npm uninstall vscode-languageclient</code> and <code>npm install vscode-languageclient@6.1.4</code>).

#### Syntax Highlighting
  Syntax highlighting also bases on TextMate, but is better [integrated in VS Code](https://vscode-eastus.azurewebsites.net/api/language-extensions/syntax-highlight-guide).
  Integrate in your [<code>package.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension-self-contained/package.json) and provide the referenced [<code>mydsl.tmLanguage.json</code>](https://github.com/itemis/xtext-languageserver-example/blob/master/vscode-extension/syntaxes/mydsl.tmLanguage.json):
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
### GLSP Server
### GLSP Client
