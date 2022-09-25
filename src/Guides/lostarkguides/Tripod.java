/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tripod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.Tripod#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.Tripod#getTier <em>Tier</em>}</li>
 *   <li>{@link Guides.lostarkguides.Tripod#getSkill <em>Skill</em>}</li>
 *   <li>{@link Guides.lostarkguides.Tripod#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see Guides.lostarkguides.LostarkguidesPackage#getTripod()
 * @model
 * @generated
 */
public interface Tripod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getTripod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Tripod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tier</b></em>' attribute.
	 * The literals are from the enumeration {@link Guides.lostarkguides.TripodTier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tier</em>' attribute.
	 * @see Guides.lostarkguides.TripodTier
	 * @see #setTier(TripodTier)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getTripod_Tier()
	 * @model
	 * @generated
	 */
	TripodTier getTier();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Tripod#getTier <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier</em>' attribute.
	 * @see Guides.lostarkguides.TripodTier
	 * @see #getTier()
	 * @generated
	 */
	void setTier(TripodTier value);

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Guides.lostarkguides.Skill#getTripods <em>Tripods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' container reference.
	 * @see #setSkill(Skill)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getTripod_Skill()
	 * @see Guides.lostarkguides.Skill#getTripods
	 * @model opposite="Tripods" transient="false"
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Tripod#getSkill <em>Skill</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' container reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getTripod_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Tripod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Tripod
