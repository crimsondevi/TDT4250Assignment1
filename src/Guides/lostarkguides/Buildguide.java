/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buildguide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.Buildguide#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.Buildguide#getClass_ <em>Class</em>}</li>
 *   <li>{@link Guides.lostarkguides.Buildguide#getBuildSkills <em>Build Skills</em>}</li>
 *   <li>{@link Guides.lostarkguides.Buildguide#getTotalSkillPointCost <em>Total Skill Point Cost</em>}</li>
 * </ul>
 *
 * @see Guides.lostarkguides.LostarkguidesPackage#getBuildguide()
 * @model
 * @generated
 */
public interface Buildguide extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getBuildguide_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Buildguide#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(Guides.lostarkguides.Class)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getBuildguide_Class()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Guides.lostarkguides.Class getClass_();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Buildguide#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Guides.lostarkguides.Class value);

	/**
	 * Returns the value of the '<em><b>Build Skills</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Skills</em>' containment reference.
	 * @see #setBuildSkills(skillsSelection)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getBuildguide_BuildSkills()
	 * @model containment="true"
	 * @generated
	 */
	skillsSelection getBuildSkills();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Buildguide#getBuildSkills <em>Build Skills</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Skills</em>' containment reference.
	 * @see #getBuildSkills()
	 * @generated
	 */
	void setBuildSkills(skillsSelection value);

	/**
	 * Returns the value of the '<em><b>Total Skill Point Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Skill Point Cost</em>' attribute.
	 * @see Guides.lostarkguides.LostarkguidesPackage#getBuildguide_TotalSkillPointCost()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	int getTotalSkillPointCost();

} // Buildguide
