/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.Class#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.Class#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @see Guides.lostarkguides.LostarkguidesPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Guides.lostarkguides.LostarkguidesPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Guides.lostarkguides.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link Guides.lostarkguides.Skill}.
	 * It is bidirectional and its opposite is '{@link Guides.lostarkguides.Skill#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see Guides.lostarkguides.LostarkguidesPackage#getClass_Skills()
	 * @see Guides.lostarkguides.Skill#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<Skill> getSkills();

} // Class
