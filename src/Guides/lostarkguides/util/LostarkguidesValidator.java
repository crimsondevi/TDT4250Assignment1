/**
 */
package Guides.lostarkguides.util;

import Guides.lostarkguides.Buildguide;
import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.Tripod;
import Guides.lostarkguides.TripodTier;
import Guides.lostarkguides.skillsSelection;
import Guides.lostarkguides.tripodSelection;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Guides.lostarkguides.LostarkguidesPackage
 * @generated
 */
public class LostarkguidesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LostarkguidesValidator INSTANCE = new LostarkguidesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Guides.lostarkguides";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LostarkguidesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LostarkguidesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LostarkguidesPackage.BUILDGUIDE:
				return validateBuildguide((Buildguide)value, diagnostics, context);
			case LostarkguidesPackage.CLASS:
				return validateClass((Guides.lostarkguides.Class)value, diagnostics, context);
			case LostarkguidesPackage.SKILL:
				return validateSkill((Skill)value, diagnostics, context);
			case LostarkguidesPackage.TRIPOD:
				return validateTripod((Tripod)value, diagnostics, context);
			case LostarkguidesPackage.SKILLS_SELECTION:
				return validateskillsSelection((skillsSelection)value, diagnostics, context);
			case LostarkguidesPackage.TRIPOD_SELECTION:
				return validatetripodSelection((tripodSelection)value, diagnostics, context);
			case LostarkguidesPackage.TRIPOD_TIER:
				return validateTripodTier((TripodTier)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildguide(Buildguide buildguide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildguide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(Guides.lostarkguides.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(class_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkill(Skill skill, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skill, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripod(Tripod tripod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tripod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateskillsSelection(skillsSelection skillsSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(skillsSelection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(skillsSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validateskillsSelection_awakeningSkill(skillsSelection, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the awakeningSkill constraint of '<em>skills Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SKILLS_SELECTION__AWAKENING_SKILL__EEXPRESSION = "self.awakening.Awakening";

	/**
	 * Validates the awakeningSkill constraint of '<em>skills Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateskillsSelection_awakeningSkill(skillsSelection skillsSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LostarkguidesPackage.Literals.SKILLS_SELECTION,
				 skillsSelection,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "awakeningSkill",
				 SKILLS_SELECTION__AWAKENING_SKILL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetripodSelection(tripodSelection tripodSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tripodSelection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validatetripodSelection_skillmatching(tripodSelection, diagnostics, context);
		if (result || diagnostics != null) result &= validatetripodSelection_tripodTiersValid(tripodSelection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the skillmatching constraint of '<em>tripod Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatetripodSelection_skillmatching(tripodSelection tripodSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = true;
		if (tripodSelection.getT1Tripod().getSkill() != tripodSelection.getSkill() |
			tripodSelection.getT2Tripod().getSkill() != tripodSelection.getSkill() | 
			tripodSelection.getT3Tripod().getSkill() != tripodSelection.getSkill()) {
			valid = false;
		}
			
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "skillmatching", getObjectLabel(tripodSelection, context) },
						 new Object[] { tripodSelection },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tripodTiersValid constraint of '<em>tripod Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatetripodSelection_tripodTiersValid(tripodSelection tripodSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = true;
		if (tripodSelection.getT1Tripod().getTier() != TripodTier.TIER1) {
			valid = false;
		}
		if (tripodSelection.getT2Tripod().getTier() != TripodTier.TIER1) {
			valid = false;
		}
		if (tripodSelection.getT3Tripod().getTier() != TripodTier.TIER1) {
			valid = false;
		}
			
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "tripodTiersValid", getObjectLabel(tripodSelection, context) },
						 new Object[] { tripodSelection },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripodTier(TripodTier tripodTier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LostarkguidesValidator
