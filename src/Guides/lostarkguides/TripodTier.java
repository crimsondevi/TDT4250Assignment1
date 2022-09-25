/**
 */
package Guides.lostarkguides;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tripod Tier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Guides.lostarkguides.LostarkguidesPackage#getTripodTier()
 * @model
 * @generated
 */
public enum TripodTier implements Enumerator {
	/**
	 * The '<em><b>Tier1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER1_VALUE
	 * @generated
	 * @ordered
	 */
	TIER1(0, "Tier1", "Tier1"),

	/**
	 * The '<em><b>Tier2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER2_VALUE
	 * @generated
	 * @ordered
	 */
	TIER2(1, "Tier2", "Tier2"),

	/**
	 * The '<em><b>Tier3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER3_VALUE
	 * @generated
	 * @ordered
	 */
	TIER3(2, "Tier3", "Tier3");

	/**
	 * The '<em><b>Tier1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER1
	 * @model name="Tier1"
	 * @generated
	 * @ordered
	 */
	public static final int TIER1_VALUE = 0;

	/**
	 * The '<em><b>Tier2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER2
	 * @model name="Tier2"
	 * @generated
	 * @ordered
	 */
	public static final int TIER2_VALUE = 1;

	/**
	 * The '<em><b>Tier3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER3
	 * @model name="Tier3"
	 * @generated
	 * @ordered
	 */
	public static final int TIER3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tripod Tier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TripodTier[] VALUES_ARRAY =
		new TripodTier[] {
			TIER1,
			TIER2,
			TIER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Tripod Tier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TripodTier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tripod Tier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripodTier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TripodTier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tripod Tier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripodTier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TripodTier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tripod Tier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripodTier get(int value) {
		switch (value) {
			case TIER1_VALUE: return TIER1;
			case TIER2_VALUE: return TIER2;
			case TIER3_VALUE: return TIER3;
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
	private TripodTier(int value, String name, String literal) {
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
	
} //TripodTier
