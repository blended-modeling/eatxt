# EATXT-EATOP Integration

This plug-in provides integration of the EATXT editor into EATOP by adding a context menu entry to the tree editor to convert a model element in an EAST-ADL model to EATXT. For the future, true roundtrip-engineering is planned, but this is not yet implemented. In addition, it is not yet possible to invoke the EATXT editing on anything but the root element.

To make the integration work, follow these steps:

1. Clone the EATOP repository from https://bitbucket.org/east-adl/east-adl/src/Revison/
1. Import the plugins from `org.eclipse.eatop/plugins` into a new workspace, but exclude the plugins `org.eclipse.eatop.eastadl2*`.
1. Import the plugins in the eatxt repository into the workspace. This includes the `org.eclipse.eatop.eastadl2*` plug-ins.
1. Set the target platform to `eatop-with-eatxt` from the `org.bumble.eatxt.target` plug-in.
1. You can now start EATOP as an Eclipse Application including the integration.