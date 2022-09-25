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

import Guides.lostarkguides.util.LostarkguidesValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LostarkguidesPackageImpl extends EPackageImpl implements LostarkguidesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildguideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillsSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripodSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tripodTierEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Guides.lostarkguides.LostarkguidesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LostarkguidesPackageImpl() {
		super(eNS_URI, LostarkguidesFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LostarkguidesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LostarkguidesPackage init() {
		if (isInited) return (LostarkguidesPackage)EPackage.Registry.INSTANCE.getEPackage(LostarkguidesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLostarkguidesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LostarkguidesPackageImpl theLostarkguidesPackage = registeredLostarkguidesPackage instanceof LostarkguidesPackageImpl ? (LostarkguidesPackageImpl)registeredLostarkguidesPackage : new LostarkguidesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLostarkguidesPackage.createPackageContents();

		// Initialize created meta-data
		theLostarkguidesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLostarkguidesPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LostarkguidesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLostarkguidesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LostarkguidesPackage.eNS_URI, theLostarkguidesPackage);
		return theLostarkguidesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildguide() {
		return buildguideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildguide_Name() {
		return (EAttribute)buildguideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildguide_Class() {
		return (EReference)buildguideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildguide_BuildSkills() {
		return (EReference)buildguideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildguide_TotalSkillPointCost() {
		return (EAttribute)buildguideEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Skills() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_Name() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_Description() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_Awakening() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_SkillLevel() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkill_Owner() {
		return (EReference)skillEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkill_Tripods() {
		return (EReference)skillEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripod() {
		return tripodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripod_Name() {
		return (EAttribute)tripodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripod_Tier() {
		return (EAttribute)tripodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripod_Skill() {
		return (EReference)tripodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripod_Description() {
		return (EAttribute)tripodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getskillsSelection() {
		return skillsSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getskillsSelection_Awakening() {
		return (EReference)skillsSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getskillsSelection_NormalSkills() {
		return (EReference)skillsSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getskillsSelection_Tripods() {
		return (EReference)skillsSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettripodSelection() {
		return tripodSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettripodSelection_T1Tripod() {
		return (EReference)tripodSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettripodSelection_T2Tripod() {
		return (EReference)tripodSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettripodSelection_T3Tripod() {
		return (EReference)tripodSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettripodSelection_Skill() {
		return (EReference)tripodSelectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTripodTier() {
		return tripodTierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LostarkguidesFactory getLostarkguidesFactory() {
		return (LostarkguidesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		buildguideEClass = createEClass(BUILDGUIDE);
		createEAttribute(buildguideEClass, BUILDGUIDE__NAME);
		createEReference(buildguideEClass, BUILDGUIDE__CLASS);
		createEReference(buildguideEClass, BUILDGUIDE__BUILD_SKILLS);
		createEAttribute(buildguideEClass, BUILDGUIDE__TOTAL_SKILL_POINT_COST);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__NAME);
		createEReference(classEClass, CLASS__SKILLS);

		skillEClass = createEClass(SKILL);
		createEAttribute(skillEClass, SKILL__NAME);
		createEAttribute(skillEClass, SKILL__DESCRIPTION);
		createEAttribute(skillEClass, SKILL__AWAKENING);
		createEAttribute(skillEClass, SKILL__SKILL_LEVEL);
		createEReference(skillEClass, SKILL__OWNER);
		createEReference(skillEClass, SKILL__TRIPODS);

		tripodEClass = createEClass(TRIPOD);
		createEAttribute(tripodEClass, TRIPOD__NAME);
		createEAttribute(tripodEClass, TRIPOD__TIER);
		createEReference(tripodEClass, TRIPOD__SKILL);
		createEAttribute(tripodEClass, TRIPOD__DESCRIPTION);

		skillsSelectionEClass = createEClass(SKILLS_SELECTION);
		createEReference(skillsSelectionEClass, SKILLS_SELECTION__AWAKENING);
		createEReference(skillsSelectionEClass, SKILLS_SELECTION__NORMAL_SKILLS);
		createEReference(skillsSelectionEClass, SKILLS_SELECTION__TRIPODS);

		tripodSelectionEClass = createEClass(TRIPOD_SELECTION);
		createEReference(tripodSelectionEClass, TRIPOD_SELECTION__T1_TRIPOD);
		createEReference(tripodSelectionEClass, TRIPOD_SELECTION__T2_TRIPOD);
		createEReference(tripodSelectionEClass, TRIPOD_SELECTION__T3_TRIPOD);
		createEReference(tripodSelectionEClass, TRIPOD_SELECTION__SKILL);

		// Create enums
		tripodTierEEnum = createEEnum(TRIPOD_TIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(buildguideEClass, Buildguide.class, "Buildguide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildguide_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Buildguide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildguide_Class(), this.getClass_(), null, "Class", null, 1, 1, Buildguide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildguide_BuildSkills(), this.getskillsSelection(), null, "buildSkills", null, 0, 1, Buildguide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildguide_TotalSkillPointCost(), ecorePackage.getEInt(), "totalSkillPointCost", null, 0, 1, Buildguide.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, Guides.lostarkguides.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Guides.lostarkguides.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Skills(), this.getSkill(), this.getSkill_Owner(), "Skills", null, 0, -1, Guides.lostarkguides.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkill_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkill_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkill_Awakening(), ecorePackage.getEBoolean(), "Awakening", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkill_SkillLevel(), ecorePackage.getEInt(), "skillLevel", "0", 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Owner(), this.getClass_(), this.getClass_Skills(), "Owner", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Tripods(), this.getTripod(), this.getTripod_Skill(), "Tripods", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripodEClass, Tripod.class, "Tripod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTripod_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Tripod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripod_Tier(), this.getTripodTier(), "Tier", null, 0, 1, Tripod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripod_Skill(), this.getSkill(), this.getSkill_Tripods(), "Skill", null, 0, 1, Tripod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripod_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Tripod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillsSelectionEClass, skillsSelection.class, "skillsSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getskillsSelection_Awakening(), this.getSkill(), null, "awakening", null, 1, 1, skillsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getskillsSelection_NormalSkills(), this.getSkill(), null, "normalSkills", null, 8, 8, skillsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getskillsSelection_Tripods(), this.gettripodSelection(), null, "Tripods", null, 8, 8, skillsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripodSelectionEClass, tripodSelection.class, "tripodSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettripodSelection_T1Tripod(), this.getTripod(), null, "t1Tripod", null, 0, 1, tripodSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettripodSelection_T2Tripod(), this.getTripod(), null, "t2Tripod", null, 0, 1, tripodSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettripodSelection_T3Tripod(), this.getTripod(), null, "t3Tripod", null, 0, 1, tripodSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettripodSelection_Skill(), this.getSkill(), null, "Skill", null, 1, 1, tripodSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tripodTierEEnum, TripodTier.class, "TripodTier");
		addEEnumLiteral(tripodTierEEnum, TripodTier.TIER1);
		addEEnumLiteral(tripodTierEEnum, TripodTier.TIER2);
		addEEnumLiteral(tripodTierEEnum, TripodTier.TIER3);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (skillsSelectionEClass,
		   source,
		   new String[] {
			   "constraints", "awakeningSkill"
		   });
		addAnnotation
		  (tripodSelectionEClass,
		   source,
		   new String[] {
			   "constraints", "skillmatching tripodTiersValid"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (skillsSelectionEClass,
		   source,
		   new String[] {
			   "awakeningSkill", "self.awakening.Awakening"
		   });
	}

} //LostarkguidesPackageImpl
