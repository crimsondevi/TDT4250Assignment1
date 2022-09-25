/**
 */
package Guides.lostarkguides.util;

import Guides.lostarkguides.Buildguide;
import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.Tripod;
import Guides.lostarkguides.skillsSelection;
import Guides.lostarkguides.tripodSelection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Guides.lostarkguides.LostarkguidesPackage
 * @generated
 */
public class LostarkguidesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LostarkguidesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LostarkguidesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LostarkguidesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LostarkguidesSwitch<Adapter> modelSwitch =
		new LostarkguidesSwitch<Adapter>() {
			@Override
			public Adapter caseBuildguide(Buildguide object) {
				return createBuildguideAdapter();
			}
			@Override
			public Adapter caseClass(Guides.lostarkguides.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseSkill(Skill object) {
				return createSkillAdapter();
			}
			@Override
			public Adapter caseTripod(Tripod object) {
				return createTripodAdapter();
			}
			@Override
			public Adapter caseskillsSelection(skillsSelection object) {
				return createskillsSelectionAdapter();
			}
			@Override
			public Adapter casetripodSelection(tripodSelection object) {
				return createtripodSelectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Guides.lostarkguides.Buildguide <em>Buildguide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Guides.lostarkguides.Buildguide
	 * @generated
	 */
	public Adapter createBuildguideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Guides.lostarkguides.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Guides.lostarkguides.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Guides.lostarkguides.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Guides.lostarkguides.Skill
	 * @generated
	 */
	public Adapter createSkillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Guides.lostarkguides.Tripod <em>Tripod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Guides.lostarkguides.Tripod
	 * @generated
	 */
	public Adapter createTripodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Guides.lostarkguides.skillsSelection <em>skills Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Guides.lostarkguides.skillsSelection
	 * @generated
	 */
	public Adapter createskillsSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Guides.lostarkguides.tripodSelection <em>tripod Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Guides.lostarkguides.tripodSelection
	 * @generated
	 */
	public Adapter createtripodSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LostarkguidesAdapterFactory
