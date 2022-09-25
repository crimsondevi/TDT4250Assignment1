/**
 */
package Guides.lostarkguides.impl;

import Guides.lostarkguides.Buildguide;
import Guides.lostarkguides.LostarkguidesFactory;
import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.Tripod;
import Guides.lostarkguides.TripodTier;
import Guides.lostarkguides.skillsSelection;
import Guides.lostarkguides.tripodSelection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LostarkguidesFactoryImpl extends EFactoryImpl implements LostarkguidesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LostarkguidesFactory init() {
		try {
			LostarkguidesFactory theLostarkguidesFactory = (LostarkguidesFactory)EPackage.Registry.INSTANCE.getEFactory(LostarkguidesPackage.eNS_URI);
			if (theLostarkguidesFactory != null) {
				return theLostarkguidesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LostarkguidesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LostarkguidesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LostarkguidesPackage.BUILDGUIDE: return createBuildguide();
			case LostarkguidesPackage.CLASS: return createClass();
			case LostarkguidesPackage.SKILL: return createSkill();
			case LostarkguidesPackage.TRIPOD: return createTripod();
			case LostarkguidesPackage.SKILLS_SELECTION: return createskillsSelection();
			case LostarkguidesPackage.TRIPOD_SELECTION: return createtripodSelection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LostarkguidesPackage.TRIPOD_TIER:
				return createTripodTierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LostarkguidesPackage.TRIPOD_TIER:
				return convertTripodTierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buildguide createBuildguide() {
		BuildguideImpl buildguide = new BuildguideImpl();
		return buildguide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guides.lostarkguides.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod createTripod() {
		TripodImpl tripod = new TripodImpl();
		return tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public skillsSelection createskillsSelection() {
		skillsSelectionImpl skillsSelection = new skillsSelectionImpl();
		return skillsSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tripodSelection createtripodSelection() {
		tripodSelectionImpl tripodSelection = new tripodSelectionImpl();
		return tripodSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripodTier createTripodTierFromString(EDataType eDataType, String initialValue) {
		TripodTier result = TripodTier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripodTierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LostarkguidesPackage getLostarkguidesPackage() {
		return (LostarkguidesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LostarkguidesPackage getPackage() {
		return LostarkguidesPackage.eINSTANCE;
	}

} //LostarkguidesFactoryImpl
