/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Guides.lostarkguides.LostarkguidesPackage
 * @generated
 */
public interface LostarkguidesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LostarkguidesFactory eINSTANCE = Guides.lostarkguides.impl.LostarkguidesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Buildguide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buildguide</em>'.
	 * @generated
	 */
	Buildguide createBuildguide();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill</em>'.
	 * @generated
	 */
	Skill createSkill();

	/**
	 * Returns a new object of class '<em>Tripod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tripod</em>'.
	 * @generated
	 */
	Tripod createTripod();

	/**
	 * Returns a new object of class '<em>skills Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>skills Selection</em>'.
	 * @generated
	 */
	skillsSelection createskillsSelection();

	/**
	 * Returns a new object of class '<em>tripod Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tripod Selection</em>'.
	 * @generated
	 */
	tripodSelection createtripodSelection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LostarkguidesPackage getLostarkguidesPackage();

} //LostarkguidesFactory
