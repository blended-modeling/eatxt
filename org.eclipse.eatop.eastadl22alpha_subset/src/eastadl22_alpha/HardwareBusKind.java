/**
 */
package eastadl22_alpha;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hardware Bus Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * HardwareBusKind is an enumeration type representing different kinds of busses.
 * 
 * Semantics:
 * HardwareBusKind represents the kind of a hardware connector as given by the definition of the respective Enumeration Literal.
 * 
 * Extension: 
 * Enumeration, no extension.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwareBusKind</b></em> 
 * <!-- end-model-doc -->
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwareBusKind()
 * @model annotation="MetaData guid='{60C5AC3B-B9C2-4381-84A6-7A931BE35EE1}' id='65' EA\040name='HardwareBusKind'"
 *        annotation="Stereotype Stereotype='enumeration'"
 *        extendedMetaData="name='HARDWARE-BUS-KIND'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-BUS-KINDS'"
 * @generated
 */
public enum HardwareBusKind implements Enumerator {
	/**
	 * The '<em><b>Time Triggered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_TRIGGERED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_TRIGGERED(0, "TimeTriggered", "TIMETRIGGERED"),

	/**
	 * The '<em><b>Event Triggered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_TRIGGERED_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_TRIGGERED(1, "EventTriggered", "EVENTTRIGGERED"),

	/**
	 * The '<em><b>Time And Event Triggered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_AND_EVENT_TRIGGERED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_AND_EVENT_TRIGGERED(2, "TimeAndEventTriggered", "TIMEANDEVENTTRIGGERED"),

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
	 * The '<em><b>Time Triggered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_TRIGGERED
	 * @model name="TimeTriggered" literal="TIMETRIGGERED"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TRIGGERED_VALUE = 0;

	/**
	 * The '<em><b>Event Triggered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_TRIGGERED
	 * @model name="EventTriggered" literal="EVENTTRIGGERED"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_TRIGGERED_VALUE = 1;

	/**
	 * The '<em><b>Time And Event Triggered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_AND_EVENT_TRIGGERED
	 * @model name="TimeAndEventTriggered" literal="TIMEANDEVENTTRIGGERED"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_AND_EVENT_TRIGGERED_VALUE = 2;

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
	 * An array of all the '<em><b>Hardware Bus Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HardwareBusKind[] VALUES_ARRAY =
		new HardwareBusKind[] {
			TIME_TRIGGERED,
			EVENT_TRIGGERED,
			TIME_AND_EVENT_TRIGGERED,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Hardware Bus Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HardwareBusKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hardware Bus Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardwareBusKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardwareBusKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardware Bus Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardwareBusKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardwareBusKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardware Bus Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardwareBusKind get(int value) {
		switch (value) {
			case TIME_TRIGGERED_VALUE: return TIME_TRIGGERED;
			case EVENT_TRIGGERED_VALUE: return EVENT_TRIGGERED;
			case TIME_AND_EVENT_TRIGGERED_VALUE: return TIME_AND_EVENT_TRIGGERED;
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
	private HardwareBusKind(int value, String name, String literal) {
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
	
} //HardwareBusKind
