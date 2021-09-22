# VS.Code extension for EAST-ADL Simplified

A simple VS.Code extension that is build upon the [itemis example](https://github.com/itemis/xtext-languageserver-example/tree/master/vscode-extension).  It offers syntax highlighting, code completion, and syntax checking for `.eatxt` files.

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

## Run Language Server

The VS.Code extension uses a language server listening on port 5007 for code completion and syntax checks. The easiest way is to use the "Run EAST-ADL Language Server" launcher configuration in `releng\org.bumble.eastadl.simplified.launchers` within Eclipse. Alternatively, you can find the class `org.bumble.eastadl.simplified.ide.server.RunServer` and select `Run As...` from the context menu in the Eclipse Project or Package explorer.