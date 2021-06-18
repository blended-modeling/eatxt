/**
 */
package eastadl22_alpha;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Client Server Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This element is an enumeration for the kind of the FunctionClientServerPort, which can either be a "client" or a "server".
 * 
 * Semantics:
 * The ClientServerKind is an enumeration with literals that are used to distinguish between client and server.
 * 
 * Extension: 
 * Enumeration, no extension.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.ClientServerKind</b></em> 
 * <!-- end-model-doc -->
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getClientServerKind()
 * @model annotation="MetaData guid='{04E14304-2B3D-40ed-91E7-13EE40A7AD2D}' id='35' EA\040name='ClientServerKind'"
 *        annotation="Stereotype Stereotype='enumeration'"
 *        extendedMetaData="name='CLIENT-SERVER-KIND'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CLIENT-SERVER-KINDS'"
 * @generated
 */
public enum ClientServerKind implements Enumerator {
	/**
	 * The '<em><b>Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT(0, "client", "CLIENT"),

	/**
	 * The '<em><b>Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER(1, "server", "SERVER");

	/**
	 * The '<em><b>Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT
	 * @model name="client" literal="CLIENT"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_VALUE = 0;

	/**
	 * The '<em><b>Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER
	 * @model name="server" literal="SERVER"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Client Server Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClientServerKind[] VALUES_ARRAY =
		new ClientServerKind[] {
			CLIENT,
			SERVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Client Server Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClientServerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Client Server Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientServerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientServerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Server Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientServerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientServerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Server Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientServerKind get(int value) {
		switch (value) {
			case CLIENT_VALUE: return CLIENT;
			case SERVER_VALUE: return SERVER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClientServerKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ClientServerKind
