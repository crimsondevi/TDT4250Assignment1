/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>skills Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.skillsSelection#getAwakening <em>Awakening</em>}</li>
 *   <li>{@link Guides.lostarkguides.skillsSelection#getNormalSkills <em>Normal Skills</em>}</li>
 *   <li>{@link Guides.lostarkguides.skillsSelection#getTripods <em>Tripods</em>}</li>
 * </ul>
 *
 * @see Guides.lostarkguides.LostarkguidesPackage#getskillsSelection()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 awakeningSkill='self.awakening.Awakening'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='awakeningSkill'"
 * @generated
 */
public interface skillsSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Awakening</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awakening</em>' reference.
	 * @see #setAwakening(Skill)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getskillsSelection_Awakening()
	 * @model required="true"
	 * @generated
	 */
	Skill getAwakening();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.skillsSelection#getAwakening <em>Awakening</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awakening</em>' reference.
	 * @see #getAwakening()
	 * @generated
	 */
	void setAwakening(Skill value);

	/**
	 * Returns the value of the '<em><b>Normal Skills</b></em>' reference list.
	 * The list contents are of type {@link Guides.lostarkguides.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Skills</em>' reference list.
	 * @see Guides.lostarkguides.LostarkguidesPackage#getskillsSelection_NormalSkills()
	 * @model lower="8" upper="8"
	 * @generated
	 */
	EList<Skill> getNormalSkills();

	/**
	 * Returns the value of the '<em><b>Tripods</b></em>' containment reference list.
	 * The list contents are of type {@link Guides.lostarkguides.tripodSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tripods</em>' containment reference list.
	 * @see Guides.lostarkguides.LostarkguidesPackage#getskillsSelection_Tripods()
	 * @model containment="true" lower="8" upper="8"
	 * @generated
	 */
	EList<tripodSelection> getTripods();

} // skillsSelection
