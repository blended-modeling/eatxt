#VS.Code extension for EAST-ADL Simplified

A simple VS.Code extension that is build upon the itemis example at https://github.com/itemis/xtext-languageserver-example/tree/master/vscode-extension. Uses an external language server that needs to listen on port 5007 for code completion.

## Package and Install

1. Install the VCSE tool that is used to package the extension:
```
npm install -g vsce
```

2. Install all dependencies of the extension:
```
npm install
```

3. Package the extension:
```
vcse package
```

4. Install the extension in VS.code by using the `Install from VSIX...` command. The window needs to be trusted for that.
