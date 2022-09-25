/**
 */
package Guides.lostarkguides.impl;

import Guides.lostarkguides.Buildguide;
import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.skillsSelection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buildguide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.impl.BuildguideImpl#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.BuildguideImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.BuildguideImpl#getBuildSkills <em>Build Skills</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.BuildguideImpl#getTotalSkillPointCost <em>Total Skill Point Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildguideImpl extends MinimalEObjectImpl.Container implements Buildguide {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Guides.lostarkguides.Class class_;

	/**
	 * The cached value of the '{@link #getBuildSkills() <em>Build Skills</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildSkills()
	 * @generated
	 * @ordered
	 */
	protected skillsSelection buildSkills;

	/**
	 * The default value of the '{@link #getTotalSkillPointCost() <em>Total Skill Point Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSkillPointCost()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_SKILL_POINT_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalSkillPointCost() <em>Total Skill Point Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSkillPointCost()
	 * @generated
	 * @ordered
	 */
	protected int totalSkillPointCost = TOTAL_SKILL_POINT_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildguideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LostarkguidesPackage.Literals.BUILDGUIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.BUILDGUIDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guides.lostarkguides.Class getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(Guides.lostarkguides.Class newClass, NotificationChain msgs) {
		Guides.lostarkguides.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.BUILDGUIDE__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Guides.lostarkguides.Class newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LostarkguidesPackage.BUILDGUIDE__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LostarkguidesPackage.BUILDGUIDE__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.BUILDGUIDE__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public skillsSelection getBuildSkills() {
		return buildSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildSkills(skillsSelection newBuildSkills, NotificationChain msgs) {
		skillsSelection oldBuildSkills = buildSkills;
		buildSkills = newBuildSkills;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS, oldBuildSkills, newBuildSkills);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildSkills(skillsSelection newBuildSkills) {
		if (newBuildSkills != buildSkills) {
			NotificationChain msgs = null;
			if (buildSkills != null)
				msgs = ((InternalEObject)buildSkills).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS, null, msgs);
			if (newBuildSkills != null)
				msgs = ((InternalEObject)newBuildSkills).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS, null, msgs);
			msgs = basicSetBuildSkills(newBuildSkills, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS, newBuildSkills, newBuildSkills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getTotalSkillPointCost() {
		int totalSkillPointCost = 0;
		skillsSelection skills = getBuildSkills();
		for (Skill var : skills.getNormalSkills()) {
			totalSkillPointCost += (var.getSkillLevel() * (var.getSkillLevel() + 1)) / 2;
		}
		return totalSkillPointCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LostarkguidesPackage.BUILDGUIDE__CLASS:
				return basicSetClass(null, msgs);
			case LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS:
				return basicSetBuildSkills(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LostarkguidesPackage.BUILDGUIDE__NAME:
				return getName();
			case LostarkguidesPackage.BUILDGUIDE__CLASS:
				return getClass_();
			case LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS:
				return getBuildSkills();
			case LostarkguidesPackage.BUILDGUIDE__TOTAL_SKILL_POINT_COST:
				return getTotalSkillPointCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LostarkguidesPackage.BUILDGUIDE__NAME:
				setName((String)newValue);
				return;
			case LostarkguidesPackage.BUILDGUIDE__CLASS:
				setClass((Guides.lostarkguides.Class)newValue);
				return;
			case LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS:
				setBuildSkills((skillsSelection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LostarkguidesPackage.BUILDGUIDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LostarkguidesPackage.BUILDGUIDE__CLASS:
				setClass((Guides.lostarkguides.Class)null);
				return;
			case LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS:
				setBuildSkills((skillsSelection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LostarkguidesPackage.BUILDGUIDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LostarkguidesPackage.BUILDGUIDE__CLASS:
				return class_ != null;
			case LostarkguidesPackage.BUILDGUIDE__BUILD_SKILLS:
				return buildSkills != null;
			case LostarkguidesPackage.BUILDGUIDE__TOTAL_SKILL_POINT_COST:
				return totalSkillPointCost != TOTAL_SKILL_POINT_COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", totalSkillPointCost: ");
		result.append(totalSkillPointCost);
		result.append(')');
		return result.toString();
	}

} //BuildguideImpl
