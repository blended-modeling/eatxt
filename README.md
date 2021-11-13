# Xtext Editor for a simplified version of EAST-ADL

This repository contains an Xtext-based editor for a textual version of a subset of the EAST-ADL meta-model. The editor is used to explore what a textual syntax for EAST-ADL can look like and how the existing Eclipse infrastructure can be used to create a blended modelling environment for EAST-ADL which blends textual, graphical, and tree-based editors.

## Usage

1. Download the code of our simplified projects
	1) Open a browser and login an account which the username has been invited to the simplified project
	2) Paste the link https://github.com/blended-modeling/east-adl-simplified into the browser and enter this page
	3) click Code, and copy the HTTPS link
	4) find a place (i.e. a directory) you would like to store the project
	5) git clone + the link you just copied
	In this way, you have had the code of Simplified now.
2. Compile the code and reload the target definition
	1) download an Eclipse Modeling Tools
	2) extract it into a place you would like to
	If there is already Eclipse Modeling Tools existing in your computer, please ignore the previous two steps
	3) start the eclipse you just extracted
	4) when it is launching, you will be asked the Workspace, just select a place you would like to
	5) find the "Model Explorer" view and right click "import"
	6) Select "existing projects into workspace"
	7) then, in next view, select the directory that you store your code in previous step by clicking "Browser"
	now, all the projects have been imported.
3. Install xtext
	1) Help -> Eclipse Marketplace, and search xtext and then install it
	2) once finish installing, then restart the eclipse ide
4. Reload the target definition
	1) find the project "org.bumble.eastadl.simplified.target"
	2) click on the file "org.bumble.eastadl.simplified.target.target"
	3) In the right-top corner, click "Set as Active Target Platform" (this would take couple of minutes)
5. Generate the EAText tool
	1) Open project org.bumble.eastadl.simplified, 
	   then open src folder, 
	   then open org.bumble.eastadl.simplified
	   then right click the .mwe2 file and Run As -> 1 MWE2 workflow
5. Use the EAText tool
	Once you have finished all the above steps, now you can use EAText tool now
	1) find the project "org.bumble.eastadl.simplified" and right click -> Run As -> 1. Eclipse Application
	2) click "Create a project" or File -> Project, create a common project and name it as you like
	3) you can design the program as you like
	And there is also an example of eatxt which locates in project org.bumble.eastadl.simplified.example.
	