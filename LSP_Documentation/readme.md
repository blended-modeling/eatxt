# LSP Documentation
## Xtext LSP 
#### General Operating Principle
Xtext as of version 2.11 ships with a built-in LSP support.
For this purpose, it has a dependency to [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (which has to be installed separately) and provides an Xtext-specific implementation of the <code>LanguageServer</code> interface provided by LSP4J.
The entry point to start this LS implementation is the class <code>org.eclipse.ide.server.ServerLauncher</code>, which provides a <code>main</code>-method and hence serves as executable.

#### LSP Versions 
Before setting up the environment, one should check which LSP versions the client and the server are/shall be compliant to.
The LSP4J version determines which LSP version is supported, so that the Xtext version with its dependency to a concrete LSP4J version determines the supported protocol version.
This also means, that you have to install the LSP4J version fitting to the Xtext version, as LSP4J is not shipped with Xtext.
For example, the current Xtext versions 2.24 and 2.25 [with its dependencies to LSP4J versions 0.10.0-0.12.0 support LSP V3.16](https://www.eclipse.org/Xtext/documentation/340_lsp_support.html#language-features).
Regarding such version choices, one should also keep in mind that only Xtext versions [up to 2.22.0 still natively support Java 8](https://www.eclipse.org/Xtext/releasenotes.html#/releasenotes/2020/09/01/version-2-23-0).

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
