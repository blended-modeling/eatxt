# Xtext Editor for a simplified version of EAST-ADL

This repository contains an Xtext-based editor for a textual version of a subset of the EAST-ADL meta-model. The editor is used to explore what a textual syntax for EAST-ADL can look like and how the existing Eclipse infrastructure can be used to create a blended modelling environment for EAST-ADL which blends textual, graphical, and tree-based editors.

## Installation and Usage

1. Download the code of projects

	1. Paste the link https://github.com/blended-modeling/east-adl-simplified into the browser and enter this page
	2. Log into a Github account which has been invited to the project
	3. Open a terminal/shell and navigate to a folder where you would like to store the project locally
	4. Type `git clone https://github.com/blended-modeling/east-adl-simplified.git`. The source code will now be cloned in the sub-folder `east-adl-simplified`.

2. Open the code in Eclipse
	
	1. If you do not have Eclipse installed on your system, download an Eclipse RCP from https://eclipse.org/download and install it.
	2. Start Eclipse and select a suitable workspace. We recommend creating a new one.
	3) In the `File` menu, choose `Import...`
	6) Select `Existing projects into workspace`
	7) Select the folder into which you cloned the source code 

3. Install Xtext

	1. In the `Help` menu, select `Eclipse Marketplace`
	2. Search "xtext" and then install it
	3. Once finished installing, restart the Eclipse IDE
	
4. Reload the target definition
	
	1. Find the project "org.bumble.eastadl.simplified.target"
	2. Double click on the file "org.bumble.eastadl.simplified.target.target" to open it in the target definition editor.
	3. In the right-top corner, click "Set as Active Target Platform"

	This can take a couple of minutes. Afterwards, all compilation errors should have disappeared.

5. Generate the EAText editor

	1. Open the project `src/org.bumble.eastadl.simplified` folder in the `org.bumble.eastadl.simplified` project.
	2. Right click on the `.mwe2` file and choose `Run As` -> `MWE2 workflow` from the context menu.
	
5. Use the EAText editor.

	1. Find the project `org.bumble.eastadl.simplified`.
	2. Right click on it and select `Run As` -> `Eclipse Application` in the context menu. A new Eclipse RCP instance starts.
	3. click `Create a project` or `File` -> `Project` and create a generic project.
	4. Create a new file with the extension `.eatxt` in the new project. On double click, it opens in the EAText editor.
   5. Alternatively, import the `org.bumble.eastadl.simplified.example` project into your runtime Eclipse RCP and use one of the files there.
	