# User Manual of EATXT

## Preface

This document describes how to install and use the EATXT editor. EATXT is a textual concrete syntax designed for EAST-ADL, and we have developed a matching editor for it. EAST-ADL is a domain-specific language used to describe the structure of automotive embedded systems.
In this folder, we provide EATXT in the form of source code (including its grammar definition and editor generation code). This article will introduce how to install and use it.

## Prerequisites

1.	You must have installed Eclipse and Java on your computer, **with Java version no less than 17**.

2.	EMF is installed or You use the Eclipse Modeling Tools.

3.	You must have installed Xtext for your Eclipse (You can simply install it via Eclipse Marketplace).

## Installation and Usage

1. Download the code of projects

	a. Paste the link https://github.com/blended-modeling/eatxt into the browser and open the page.
	
	b. Log into a Github account which has been invited to the project.
	
	c. Open a terminal/shell and navigate to a folder where you would like to store the project locally.
	
	d. Type `git clone https://github.com/blended-modeling/eatxt`. The source code will now be cloned in the sub-folder `eatxt`.

2. Open the code in Eclipse
	
	a. If you do not have Eclipse installed on your system, download an Eclipse RCP from https://eclipse.org/download and install it.
	
	b. Start Eclipse and select a suitable workspace. We recommend creating a new one.
	
	c. In the `File` menu, choose `Import...`
	
	d. Select `Existing projects into workspace`
	
	e. Select the folder into which you cloned the source code 
	
	**(Once you have imported the code, you will see a lot of errors which is normal and they will be disappeared in the later steps).**
	
3. Reload the target definition
	
	a. Find the project "org.bumble.eatxt.target"
	
	b. Double click on the file "org.bumble.eatxt.target.target" to open it in the target definition editor.
	
	c. In the right-top corner, click "Set as Active Target Platform"

	This can take a couple of minutes. Afterwards, most of compilation errors should have disappeared and a few of them will still be remaining **(This is normal, and the remaining errors will be fixed in the later steps)**.

4.	Generate the EATXT editor

	a. Go the directory “plugins\org.eclipse.eatop.eastadl22\model” where you will see two genmodel files and they usually contain “.xml” in their names, please remove “.xml” from their names (i.e., their extensions should be .genmodel).
	
	b. Open the project `src/org.bumble.eatxt` folder in the `org.bumble.eatxt` project **(Please check the java version in the “Java Build Path”, and it should be no lower than 17)**.
	
	c. Right click on the `.mwe2` file and choose `Run As` -> `MWE2 workflow` from the context menu. Because Eclipse may still display a few errors at this time, you may be asked if you want to continue. Please click “Proceed”. 
	
	**Then all the errors will be disappeared.**
	
	(Once you have completed the above steps, now the editor can be generated.)
	
5. Use the EAText editor.

Here, we will start the EATXT editor in runtime mode. The steps are as follows:

	a. Find the project `org.bumble.eatxt`.
	
	b. Right click on it and select `Run As` -> `Eclipse Application` in the context menu. A new Eclipse RCP instance starts.
	
	c. Click `Create a project` or `File` -> `Project` and create a generic project.
	
	d. Create a new file with the extension `.eatxt` in the new project. On double click, it opens in the EATXT editor.
	
	e. Alternatively, import the `org.bumble.eatxt.example` project into your runtime Eclipse RCP and we have provided two files there, i.e., example.eatxt and example.eaxml.
	
	(the project `org.bumble.eatxt.example` is in the folder “examples”)
	
You can right click on the file and click "Convert to ..." to serialize EATXT model to EAXML or the other way round.
