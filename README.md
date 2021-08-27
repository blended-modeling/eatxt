# Xtext Editor for a simplified version of EAST-ADL

This repository contains an Xtext-based editor for a textual version of a subset of the EAST-ADL meta-model. The editor is used to explore what a textual syntax for EAST-ADL can look like and how the existing Eclipse infrastructure can be used to create a blended modelling environment for EAST-ADL which blends textual, graphical, and tree-based editors.

## Usage

* Clone this repository
* Import all projects into a new Eclipse workspace.
* Set the target platform in the `org.bumble.eastadl.simplified.target` project.
* Run the `Generate EastAdlSimplified (eatxt) Language Infrastructure` launch configuration.
* Use the `Launch Runtime Eclipse` launch configuration to start
* In the runtime Eclipse, create a new project and add a `.eatxt` file to it. It should automatically open with the `EastAdlSimplified` editor.