/**
 */
package eastadl22_alpha;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IO Hardware Pin Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * IOHardwarePinKind is an enumeration type representing different kinds of I/O Hardware Ports.
 * 
 * Semantics:
 * IOHardwarePinKind represents the kind of IOHardwarePin as given by the definition of the respective Enumeration Literal.
 * 
 * Extension: 
 * Enumeration, no extension.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.IOHardwarePinKind</b></em> 
 * <!-- end-model-doc -->
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getIOHardwarePinKind()
 * @model annotation="MetaData guid='{B66B161C-B428-46a2-B8F0-6C9FCF8AA799}' id='75' EA\040name='IOHardwarePinKind'"
 *        annotation="Stereotype Stereotype='enumeration'"
 *        extendedMetaData="name='IO-HARDWARE-PIN-KIND'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IO-HARDWARE-PIN-KINDS'"
 * @generated
 */
public enum IOHardwarePinKind implements Enumerator {
	/**
	 * The '<em><b>Digital</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL(0, "digital", "DIGITAL"),

	/**
	 * The '<em><b>Analog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG(1, "analog", "ANALOG"),

	/**
	 * The '<em><b>Pwm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PWM_VALUE
	 * @generated
	 * @ordered
	 */
	PWM(2, "pwm", "PWM"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "OTHER");

	/**
	 * The '<em><b>Digital</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL
	 * @model name="digital" literal="DIGITAL"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_VALUE = 0;

	/**
	 * The '<em><b>Analog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG
	 * @model name="analog" literal="ANALOG"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE = 1;

	/**
	 * The '<em><b>Pwm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PWM
	 * @model name="pwm" literal="PWM"
	 * @generated
	 * @ordered
	 */
	public static final int PWM_VALUE = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other" literal="OTHER"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>IO Hardware Pin Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOHardwarePinKind[] VALUES_ARRAY =
		new IOHardwarePinKind[] {
			DIGITAL,
			ANALOG,
			PWM,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>IO Hardware Pin Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOHardwarePinKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IO Hardware Pin Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOHardwarePinKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOHardwarePinKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Hardware Pin Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOHardwarePinKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOHardwarePinKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Hardware Pin Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOHardwarePinKind get(int value) {
		switch (value) {
			case DIGITAL_VALUE: return DIGITAL;
			case ANALOG_VALUE: return ANALOG;
			case PWM_VALUE: return PWM;
			case OTHER_VALUE: return OTHER;
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
	private IOHardwarePinKind(int value, String name, String literal) {
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
	
} //IOHardwarePinKind
