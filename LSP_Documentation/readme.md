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
Regarding such version choices, one should also keep in mind that only the Xtext versions [up to 2.22.0 still natively support Java 8](https://www.eclipse.org/Xtext/releasenotes.html#/releasenotes/2020/09/01/version-2-23-0).

#### Undocumented Prerequisites <a name="prerequisites"></a> 
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
  After you also incorporated the [undocumented prerequisites](#prerequisites), you can basically follow this [documentation](https://www.eclipse.org/Xtext/documentation/340_lsp_support.html#getting-started).
  Afterward, you are able to create a text file with the corresponding file suffix anywhere in your **development** Eclipse. 
  On opening this text file (I had the best experience with <code>Open with -> Generic Text Editor</code>), an Xtext LS is spawned that looks and feels quite similar to the Xtext IDE for this text file kind in your runtime Eclipse.


#### Syntax Highlighting
  Syntax highlighting can be added by means of [TextMate](https://projects.eclipse.org/projects/technology.tm4e) (e.g., see step 4 of the documentation).




### Xtext LSP in VS Code
  In this approach, you---simplifiedly speaking---export an executable of the Xtext LS server into VS Code and register a VS Code extension (basically acting as the language client) that registers a text file suffix with the action of starting the corresponding Xtext LS server.
  
  **Remark:**
  "The Internet" says that this is very easy, but this is not the case (at least it wasn't easy for me).
  Regarding the sections on exporting the Xtext LS executable and registering the VS Code extension, we need to find out a definitly working approach.
  In the end, I combined two different approaches that accidently worked for me.
  Thus, the sections are written quite vague.
  
  Most VS Code extensions should also run in current Eclipse Theia versions (I did not try it), as both IDEs share many concepts but unfortunately not all.
  However, you can find also many code examples that provide so-called Eclipse Theia extensions (also for GLSP), but these are only for older Theia versions---don't care about them.
  
#### Required Plugin Adaptations as Prerequisite
  In the plugin <code>\<yourXtextPluginsBasicName\></code>, extend the class <code>\<yourXtextPluginsBasicName\>.\<yourGrammarName\>StandaloneSetup</code> by overriding the method <code>register</code>:
  ``` 
@Override
public void register(Injector injector) {
    if (!EPackage.Registry.INSTANCE.containsKey("\<yourBaseMetamodelNamespaceUri\>")) {
      EPackage.Registry.INSTANCE.put("\<yourBaseMetamodelNamespaceUri\>", \<yourBaseMetamodel\>Package.eINSTANCE);
    }
    super.register(injector);
}	
  ```
  This is required in VS Code for unknown reasons.
  Luckily, this causes no changes to the behavior of the conventional Xtext editor and hence can safely be added.
  
  
#### Exporting the Xtext LS as Executable
  You have to bundle your Xtext plugins with Gradle or Maven, where people says it is easier with Gradle---so I used this approach.
  As a starting point, you can create new Xtext plugins from an Ecore metamodel with the following options and then adapt the Gradle scripts for your probably already existing plugins to your needs:
  
  ![image](https://user-images.githubusercontent.com/82101353/125102656-d15e2600-e0db-11eb-8118-97f627c2ef6b.png)
  
  The "Fat Jar" option uses a "Shadow Jar" Gradle plugin and should bundle *all* required compiled classes (including all dependencies to LSP4J etc.) to one Jar archive.
  For this purpose, this Xtext Wizard option creates a parent plugin that contains the main Gradle script as well as the actual Xtext plugins with dedicated Gradle settings.
  However, although the Jar archive looks fine at the first glance, it was not sufficient for me (see next section).
  
  Furthermore, if you infer the grammar from a metamodel, this is not considered by the Gradle scripts.
  Thus, you have to adapt the main Gradle script as well as the particular plugins' Gradle settings to also include the base metamodel plugin as dependency.
  
  
#### Registering the VS Code Extension
  ...
  
  
#### LSP Versions
  For implementing a VS Code LSP extension and integrating an Xtext LS, one needs the VS Code npm package [vscode-languageclient](https://www.npmjs.com/package/vscode-languageclient).
  Its version [7.0.0 supports the current LSP version 3.16, whereas 6.1.x supports LSP version 3.15](https://github.com/Microsoft/vscode-languageserver-node#readme).
VS Code typically installs the latest version.
  Thus, if downgrading is required, one has to deinstall it completely and install a specific version (e.g., via <code>npm uninstall vscode-languageclient</code> and <code>npm install vscode-languageclient@6.1.4</code>).

#### Syntax Highlighting
  Syntax highlighting also bases on TextMate, but is better [integrated in VS Code](https://vscode-eastus.azurewebsites.net/api/language-extensions/syntax-highlight-guide).


## GLSP
### GLSP Server
### GLSP Client
