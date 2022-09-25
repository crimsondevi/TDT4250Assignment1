/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.Skill#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.Skill#getDescription <em>Description</em>}</li>
 *   <li>{@link Guides.lostarkguides.Skill#isAwakening <em>Awakening</em>}</li>
 *   <li>{@link Guides.lostarkguides.Skill#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link Guides.lostarkguides.Skill#getOwner <em>Owner</em>}</li>
 *   <li>{@link Guides.lostarkguides.Skill#getTripods <em>Tripods</em>}</li>
 * </ul>
 *
 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Skill#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Skill#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Awakening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awakening</em>' attribute.
	 * @see #setAwakening(boolean)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill_Awakening()
	 * @model
	 * @generated
	 */
	boolean isAwakening();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Skill#isAwakening <em>Awakening</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awakening</em>' attribute.
	 * @see #isAwakening()
	 * @generated
	 */
	void setAwakening(boolean value);

	/**
	 * Returns the value of the '<em><b>Skill Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Level</em>' attribute.
	 * @see #setSkillLevel(int)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill_SkillLevel()
	 * @model default="0"
	 * @generated
	 */
	int getSkillLevel();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Skill#getSkillLevel <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Level</em>' attribute.
	 * @see #getSkillLevel()
	 * @generated
	 */
	void setSkillLevel(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Guides.lostarkguides.Class#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Guides.lostarkguides.Class)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill_Owner()
	 * @see Guides.lostarkguides.Class#getSkills
	 * @model opposite="Skills" transient="false"
	 * @generated
	 */
	Guides.lostarkguides.Class getOwner();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Skill#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Guides.lostarkguides.Class value);

	/**
	 * Returns the value of the '<em><b>Tripods</b></em>' containment reference list.
	 * The list contents are of type {@link Guides.lostarkguides.Tripod}.
	 * It is bidirectional and its opposite is '{@link Guides.lostarkguides.Tripod#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tripods</em>' containment reference list.
	 * @see Guides.lostarkguides.LostarkguidesPackage#getSkill_Tripods()
	 * @see Guides.lostarkguides.Tripod#getSkill
	 * @model opposite="Skill" containment="true"
	 * @generated
	 */
	EList<Tripod> getTripods();

} // Skill
