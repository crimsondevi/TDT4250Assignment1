/**
 */
package Guides.lostarkguides;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Guides.lostarkguides.LostarkguidesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface LostarkguidesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lostarkguides";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "lostarkguides";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lostarkguides";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LostarkguidesPackage eINSTANCE = Guides.lostarkguides.impl.LostarkguidesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.impl.BuildguideImpl <em>Buildguide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.impl.BuildguideImpl
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getBuildguide()
	 * @generated
	 */
	int BUILDGUIDE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDGUIDE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDGUIDE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Build Skills</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDGUIDE__BUILD_SKILLS = 2;

	/**
	 * The feature id for the '<em><b>Total Skill Point Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDGUIDE__TOTAL_SKILL_POINT_COST = 3;

	/**
	 * The number of structural features of the '<em>Buildguide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDGUIDE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Buildguide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDGUIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.impl.ClassImpl
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SKILLS = 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.impl.SkillImpl
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Awakening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__AWAKENING = 2;

	/**
	 * The feature id for the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__SKILL_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__OWNER = 4;

	/**
	 * The feature id for the '<em><b>Tripods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__TRIPODS = 5;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.impl.TripodImpl <em>Tripod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.impl.TripodImpl
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getTripod()
	 * @generated
	 */
	int TRIPOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD__TIER = 1;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD__SKILL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Tripod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tripod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.impl.skillsSelectionImpl <em>skills Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.impl.skillsSelectionImpl
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getskillsSelection()
	 * @generated
	 */
	int SKILLS_SELECTION = 4;

	/**
	 * The feature id for the '<em><b>Awakening</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_SELECTION__AWAKENING = 0;

	/**
	 * The feature id for the '<em><b>Normal Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_SELECTION__NORMAL_SKILLS = 1;

	/**
	 * The feature id for the '<em><b>Tripods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_SELECTION__TRIPODS = 2;

	/**
	 * The number of structural features of the '<em>skills Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_SELECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>skills Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.impl.tripodSelectionImpl <em>tripod Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.impl.tripodSelectionImpl
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#gettripodSelection()
	 * @generated
	 */
	int TRIPOD_SELECTION = 5;

	/**
	 * The feature id for the '<em><b>T1 Tripod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_SELECTION__T1_TRIPOD = 0;

	/**
	 * The feature id for the '<em><b>T2 Tripod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_SELECTION__T2_TRIPOD = 1;

	/**
	 * The feature id for the '<em><b>T3 Tripod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_SELECTION__T3_TRIPOD = 2;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_SELECTION__SKILL = 3;

	/**
	 * The number of structural features of the '<em>tripod Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_SELECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>tripod Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPOD_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Guides.lostarkguides.TripodTier <em>Tripod Tier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Guides.lostarkguides.TripodTier
	 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getTripodTier()
	 * @generated
	 */
	int TRIPOD_TIER = 6;


	/**
	 * Returns the meta object for class '{@link Guides.lostarkguides.Buildguide <em>Buildguide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buildguide</em>'.
	 * @see Guides.lostarkguides.Buildguide
	 * @generated
	 */
	EClass getBuildguide();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Buildguide#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Guides.lostarkguides.Buildguide#getName()
	 * @see #getBuildguide()
	 * @generated
	 */
	EAttribute getBuildguide_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Guides.lostarkguides.Buildguide#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see Guides.lostarkguides.Buildguide#getClass_()
	 * @see #getBuildguide()
	 * @generated
	 */
	EReference getBuildguide_Class();

	/**
	 * Returns the meta object for the containment reference '{@link Guides.lostarkguides.Buildguide#getBuildSkills <em>Build Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Skills</em>'.
	 * @see Guides.lostarkguides.Buildguide#getBuildSkills()
	 * @see #getBuildguide()
	 * @generated
	 */
	EReference getBuildguide_BuildSkills();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Buildguide#getTotalSkillPointCost <em>Total Skill Point Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Skill Point Cost</em>'.
	 * @see Guides.lostarkguides.Buildguide#getTotalSkillPointCost()
	 * @see #getBuildguide()
	 * @generated
	 */
	EAttribute getBuildguide_TotalSkillPointCost();

	/**
	 * Returns the meta object for class '{@link Guides.lostarkguides.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Guides.lostarkguides.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Guides.lostarkguides.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Guides.lostarkguides.Class#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see Guides.lostarkguides.Class#getSkills()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Skills();

	/**
	 * Returns the meta object for class '{@link Guides.lostarkguides.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see Guides.lostarkguides.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Skill#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Guides.lostarkguides.Skill#getName()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Name();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Guides.lostarkguides.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Skill#isAwakening <em>Awakening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Awakening</em>'.
	 * @see Guides.lostarkguides.Skill#isAwakening()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Awakening();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Skill#getSkillLevel <em>Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Level</em>'.
	 * @see Guides.lostarkguides.Skill#getSkillLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_SkillLevel();

	/**
	 * Returns the meta object for the container reference '{@link Guides.lostarkguides.Skill#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see Guides.lostarkguides.Skill#getOwner()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link Guides.lostarkguides.Skill#getTripods <em>Tripods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tripods</em>'.
	 * @see Guides.lostarkguides.Skill#getTripods()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Tripods();

	/**
	 * Returns the meta object for class '{@link Guides.lostarkguides.Tripod <em>Tripod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tripod</em>'.
	 * @see Guides.lostarkguides.Tripod
	 * @generated
	 */
	EClass getTripod();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Tripod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Guides.lostarkguides.Tripod#getName()
	 * @see #getTripod()
	 * @generated
	 */
	EAttribute getTripod_Name();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Tripod#getTier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tier</em>'.
	 * @see Guides.lostarkguides.Tripod#getTier()
	 * @see #getTripod()
	 * @generated
	 */
	EAttribute getTripod_Tier();

	/**
	 * Returns the meta object for the container reference '{@link Guides.lostarkguides.Tripod#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Skill</em>'.
	 * @see Guides.lostarkguides.Tripod#getSkill()
	 * @see #getTripod()
	 * @generated
	 */
	EReference getTripod_Skill();

	/**
	 * Returns the meta object for the attribute '{@link Guides.lostarkguides.Tripod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Guides.lostarkguides.Tripod#getDescription()
	 * @see #getTripod()
	 * @generated
	 */
	EAttribute getTripod_Description();

	/**
	 * Returns the meta object for class '{@link Guides.lostarkguides.skillsSelection <em>skills Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>skills Selection</em>'.
	 * @see Guides.lostarkguides.skillsSelection
	 * @generated
	 */
	EClass getskillsSelection();

	/**
	 * Returns the meta object for the reference '{@link Guides.lostarkguides.skillsSelection#getAwakening <em>Awakening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Awakening</em>'.
	 * @see Guides.lostarkguides.skillsSelection#getAwakening()
	 * @see #getskillsSelection()
	 * @generated
	 */
	EReference getskillsSelection_Awakening();

	/**
	 * Returns the meta object for the reference list '{@link Guides.lostarkguides.skillsSelection#getNormalSkills <em>Normal Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Normal Skills</em>'.
	 * @see Guides.lostarkguides.skillsSelection#getNormalSkills()
	 * @see #getskillsSelection()
	 * @generated
	 */
	EReference getskillsSelection_NormalSkills();

	/**
	 * Returns the meta object for the containment reference list '{@link Guides.lostarkguides.skillsSelection#getTripods <em>Tripods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tripods</em>'.
	 * @see Guides.lostarkguides.skillsSelection#getTripods()
	 * @see #getskillsSelection()
	 * @generated
	 */
	EReference getskillsSelection_Tripods();

	/**
	 * Returns the meta object for class '{@link Guides.lostarkguides.tripodSelection <em>tripod Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tripod Selection</em>'.
	 * @see Guides.lostarkguides.tripodSelection
	 * @generated
	 */
	EClass gettripodSelection();

	/**
	 * Returns the meta object for the reference '{@link Guides.lostarkguides.tripodSelection#getT1Tripod <em>T1 Tripod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T1 Tripod</em>'.
	 * @see Guides.lostarkguides.tripodSelection#getT1Tripod()
	 * @see #gettripodSelection()
	 * @generated
	 */
	EReference gettripodSelection_T1Tripod();

	/**
	 * Returns the meta object for the reference '{@link Guides.lostarkguides.tripodSelection#getT2Tripod <em>T2 Tripod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T2 Tripod</em>'.
	 * @see Guides.lostarkguides.tripodSelection#getT2Tripod()
	 * @see #gettripodSelection()
	 * @generated
	 */
	EReference gettripodSelection_T2Tripod();

	/**
	 * Returns the meta object for the reference '{@link Guides.lostarkguides.tripodSelection#getT3Tripod <em>T3 Tripod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T3 Tripod</em>'.
	 * @see Guides.lostarkguides.tripodSelection#getT3Tripod()
	 * @see #gettripodSelection()
	 * @generated
	 */
	EReference gettripodSelection_T3Tripod();

	/**
	 * Returns the meta object for the reference '{@link Guides.lostarkguides.tripodSelection#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill</em>'.
	 * @see Guides.lostarkguides.tripodSelection#getSkill()
	 * @see #gettripodSelection()
	 * @generated
	 */
	EReference gettripodSelection_Skill();

	/**
	 * Returns the meta object for enum '{@link Guides.lostarkguides.TripodTier <em>Tripod Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tripod Tier</em>'.
	 * @see Guides.lostarkguides.TripodTier
	 * @generated
	 */
	EEnum getTripodTier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LostarkguidesFactory getLostarkguidesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.impl.BuildguideImpl <em>Buildguide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.impl.BuildguideImpl
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getBuildguide()
		 * @generated
		 */
		EClass BUILDGUIDE = eINSTANCE.getBuildguide();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDGUIDE__NAME = eINSTANCE.getBuildguide_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDGUIDE__CLASS = eINSTANCE.getBuildguide_Class();

		/**
		 * The meta object literal for the '<em><b>Build Skills</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDGUIDE__BUILD_SKILLS = eINSTANCE.getBuildguide_BuildSkills();

		/**
		 * The meta object literal for the '<em><b>Total Skill Point Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDGUIDE__TOTAL_SKILL_POINT_COST = eINSTANCE.getBuildguide_TotalSkillPointCost();

		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.impl.ClassImpl
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SKILLS = eINSTANCE.getClass_Skills();

		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.impl.SkillImpl
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__NAME = eINSTANCE.getSkill_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__DESCRIPTION = eINSTANCE.getSkill_Description();

		/**
		 * The meta object literal for the '<em><b>Awakening</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__AWAKENING = eINSTANCE.getSkill_Awakening();

		/**
		 * The meta object literal for the '<em><b>Skill Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__SKILL_LEVEL = eINSTANCE.getSkill_SkillLevel();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__OWNER = eINSTANCE.getSkill_Owner();

		/**
		 * The meta object literal for the '<em><b>Tripods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__TRIPODS = eINSTANCE.getSkill_Tripods();

		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.impl.TripodImpl <em>Tripod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.impl.TripodImpl
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getTripod()
		 * @generated
		 */
		EClass TRIPOD = eINSTANCE.getTripod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPOD__NAME = eINSTANCE.getTripod_Name();

		/**
		 * The meta object literal for the '<em><b>Tier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPOD__TIER = eINSTANCE.getTripod_Tier();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPOD__SKILL = eINSTANCE.getTripod_Skill();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPOD__DESCRIPTION = eINSTANCE.getTripod_Description();

		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.impl.skillsSelectionImpl <em>skills Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.impl.skillsSelectionImpl
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getskillsSelection()
		 * @generated
		 */
		EClass SKILLS_SELECTION = eINSTANCE.getskillsSelection();

		/**
		 * The meta object literal for the '<em><b>Awakening</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILLS_SELECTION__AWAKENING = eINSTANCE.getskillsSelection_Awakening();

		/**
		 * The meta object literal for the '<em><b>Normal Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILLS_SELECTION__NORMAL_SKILLS = eINSTANCE.getskillsSelection_NormalSkills();

		/**
		 * The meta object literal for the '<em><b>Tripods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILLS_SELECTION__TRIPODS = eINSTANCE.getskillsSelection_Tripods();

		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.impl.tripodSelectionImpl <em>tripod Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.impl.tripodSelectionImpl
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#gettripodSelection()
		 * @generated
		 */
		EClass TRIPOD_SELECTION = eINSTANCE.gettripodSelection();

		/**
		 * The meta object literal for the '<em><b>T1 Tripod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPOD_SELECTION__T1_TRIPOD = eINSTANCE.gettripodSelection_T1Tripod();

		/**
		 * The meta object literal for the '<em><b>T2 Tripod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPOD_SELECTION__T2_TRIPOD = eINSTANCE.gettripodSelection_T2Tripod();

		/**
		 * The meta object literal for the '<em><b>T3 Tripod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPOD_SELECTION__T3_TRIPOD = eINSTANCE.gettripodSelection_T3Tripod();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPOD_SELECTION__SKILL = eINSTANCE.gettripodSelection_Skill();

		/**
		 * The meta object literal for the '{@link Guides.lostarkguides.TripodTier <em>Tripod Tier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Guides.lostarkguides.TripodTier
		 * @see Guides.lostarkguides.impl.LostarkguidesPackageImpl#getTripodTier()
		 * @generated
		 */
		EEnum TRIPOD_TIER = eINSTANCE.getTripodTier();

	}

} //LostarkguidesPackage
