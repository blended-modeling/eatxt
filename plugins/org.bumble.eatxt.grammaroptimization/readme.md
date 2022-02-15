# General Usage
The post-processor is an independent Eclipse plugin implemented in Java. 
Before using it, you should make sure it has been imported into Eclipse, and its code is in the workspace where the project <code>org.bumble.eastadl.simplified</code> is located. 
Then the steps are:
1. Right click on the plugin project (i.e., <code>org.bumble.eatxt.grammaroptimization</code>).
2. Click <code>Run as -> Java Application</code> 

There will be console output once you run the plugin, which informs you about the post-processing status.

# Starting from a New EAST-ADL Grammar
Optionally, if you want to start from a freshly generated grammar instead of using the existing one: 
1. Import the project <code>org.eclipse.eatop.eastadl\<desiredVersionNumber\></code>
2. Start the grammar generation via <code>File -> new -> Other -> Xtext Project From Existing Ecore Models</code>
   1. Add <code>eastadl\<desiredVersionNumber\>.genmodel</code> and select <code>Identifiable</code> as entry rule
   2. Specify <code>org.bumble.eastadl.simplified</code> as project name, <code>org.bumble.eastadl.simplified.EastAdlSimplifiedText</code> as language name, and <code>eatxt</code> as extension
