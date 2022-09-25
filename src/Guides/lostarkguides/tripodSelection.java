/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tripod Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.tripodSelection#getT1Tripod <em>T1 Tripod</em>}</li>
 *   <li>{@link Guides.lostarkguides.tripodSelection#getT2Tripod <em>T2 Tripod</em>}</li>
 *   <li>{@link Guides.lostarkguides.tripodSelection#getT3Tripod <em>T3 Tripod</em>}</li>
 *   <li>{@link Guides.lostarkguides.tripodSelection#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @see Guides.lostarkguides.LostarkguidesPackage#gettripodSelection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='skillmatching tripodTiersValid'"
 * @generated
 */
public interface tripodSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>T1 Tripod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T1 Tripod</em>' reference.
	 * @see #setT1Tripod(Tripod)
	 * @see Guides.lostarkguides.LostarkguidesPackage#gettripodSelection_T1Tripod()
	 * @model
	 * @generated
	 */
	Tripod getT1Tripod();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.tripodSelection#getT1Tripod <em>T1 Tripod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T1 Tripod</em>' reference.
	 * @see #getT1Tripod()
	 * @generated
	 */
	void setT1Tripod(Tripod value);

	/**
	 * Returns the value of the '<em><b>T2 Tripod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T2 Tripod</em>' reference.
	 * @see #setT2Tripod(Tripod)
	 * @see Guides.lostarkguides.LostarkguidesPackage#gettripodSelection_T2Tripod()
	 * @model
	 * @generated
	 */
	Tripod getT2Tripod();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.tripodSelection#getT2Tripod <em>T2 Tripod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T2 Tripod</em>' reference.
	 * @see #getT2Tripod()
	 * @generated
	 */
	void setT2Tripod(Tripod value);

	/**
	 * Returns the value of the '<em><b>T3 Tripod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T3 Tripod</em>' reference.
	 * @see #setT3Tripod(Tripod)
	 * @see Guides.lostarkguides.LostarkguidesPackage#gettripodSelection_T3Tripod()
	 * @model
	 * @generated
	 */
	Tripod getT3Tripod();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.tripodSelection#getT3Tripod <em>T3 Tripod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T3 Tripod</em>' reference.
	 * @see #getT3Tripod()
	 * @generated
	 */
	void setT3Tripod(Tripod value);

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' reference.
	 * @see #setSkill(Skill)
	 * @see Guides.lostarkguides.LostarkguidesPackage#gettripodSelection_Skill()
	 * @model required="true"
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.tripodSelection#getSkill <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

} // tripodSelection
