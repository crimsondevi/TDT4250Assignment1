/**
 */
package Guides.lostarkguides.impl;

import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.Tripod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.impl.SkillImpl#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.SkillImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.SkillImpl#isAwakening <em>Awakening</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.SkillImpl#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.SkillImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.SkillImpl#getTripods <em>Tripods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends MinimalEObjectImpl.Container implements Skill {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAwakening() <em>Awakening</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAwakening()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AWAKENING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAwakening() <em>Awakening</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAwakening()
	 * @generated
	 * @ordered
	 */
	protected boolean awakening = AWAKENING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkillLevel() <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int SKILL_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSkillLevel() <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected int skillLevel = SKILL_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTripods() <em>Tripods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripods()
	 * @generated
	 * @ordered
	 */
	protected EList<Tripod> tripods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LostarkguidesPackage.Literals.SKILL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.SKILL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.SKILL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAwakening() {
		return awakening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwakening(boolean newAwakening) {
		boolean oldAwakening = awakening;
		awakening = newAwakening;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.SKILL__AWAKENING, oldAwakening, awakening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSkillLevel() {
		return skillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillLevel(int newSkillLevel) {
		int oldSkillLevel = skillLevel;
		skillLevel = newSkillLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.SKILL__SKILL_LEVEL, oldSkillLevel, skillLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guides.lostarkguides.Class getOwner() {
		if (eContainerFeatureID() != LostarkguidesPackage.SKILL__OWNER) return null;
		return (Guides.lostarkguides.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Guides.lostarkguides.Class newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, LostarkguidesPackage.SKILL__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Guides.lostarkguides.Class newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != LostarkguidesPackage.SKILL__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, LostarkguidesPackage.CLASS__SKILLS, Guides.lostarkguides.Class.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.SKILL__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tripod> getTripods() {
		if (tripods == null) {
			tripods = new EObjectContainmentWithInverseEList<Tripod>(Tripod.class, this, LostarkguidesPackage.SKILL__TRIPODS, LostarkguidesPackage.TRIPOD__SKILL);
		}
		return tripods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LostarkguidesPackage.SKILL__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Guides.lostarkguides.Class)otherEnd, msgs);
			case LostarkguidesPackage.SKILL__TRIPODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTripods()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LostarkguidesPackage.SKILL__OWNER:
				return basicSetOwner(null, msgs);
			case LostarkguidesPackage.SKILL__TRIPODS:
				return ((InternalEList<?>)getTripods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LostarkguidesPackage.SKILL__OWNER:
				return eInternalContainer().eInverseRemove(this, LostarkguidesPackage.CLASS__SKILLS, Guides.lostarkguides.Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LostarkguidesPackage.SKILL__NAME:
				return getName();
			case LostarkguidesPackage.SKILL__DESCRIPTION:
				return getDescription();
			case LostarkguidesPackage.SKILL__AWAKENING:
				return isAwakening();
			case LostarkguidesPackage.SKILL__SKILL_LEVEL:
				return getSkillLevel();
			case LostarkguidesPackage.SKILL__OWNER:
				return getOwner();
			case LostarkguidesPackage.SKILL__TRIPODS:
				return getTripods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LostarkguidesPackage.SKILL__NAME:
				setName((String)newValue);
				return;
			case LostarkguidesPackage.SKILL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LostarkguidesPackage.SKILL__AWAKENING:
				setAwakening((Boolean)newValue);
				return;
			case LostarkguidesPackage.SKILL__SKILL_LEVEL:
				setSkillLevel((Integer)newValue);
				return;
			case LostarkguidesPackage.SKILL__OWNER:
				setOwner((Guides.lostarkguides.Class)newValue);
				return;
			case LostarkguidesPackage.SKILL__TRIPODS:
				getTripods().clear();
				getTripods().addAll((Collection<? extends Tripod>)newValue);
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
			case LostarkguidesPackage.SKILL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LostarkguidesPackage.SKILL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LostarkguidesPackage.SKILL__AWAKENING:
				setAwakening(AWAKENING_EDEFAULT);
				return;
			case LostarkguidesPackage.SKILL__SKILL_LEVEL:
				setSkillLevel(SKILL_LEVEL_EDEFAULT);
				return;
			case LostarkguidesPackage.SKILL__OWNER:
				setOwner((Guides.lostarkguides.Class)null);
				return;
			case LostarkguidesPackage.SKILL__TRIPODS:
				getTripods().clear();
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
			case LostarkguidesPackage.SKILL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LostarkguidesPackage.SKILL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LostarkguidesPackage.SKILL__AWAKENING:
				return awakening != AWAKENING_EDEFAULT;
			case LostarkguidesPackage.SKILL__SKILL_LEVEL:
				return skillLevel != SKILL_LEVEL_EDEFAULT;
			case LostarkguidesPackage.SKILL__OWNER:
				return getOwner() != null;
			case LostarkguidesPackage.SKILL__TRIPODS:
				return tripods != null && !tripods.isEmpty();
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
		result.append(", Description: ");
		result.append(description);
		result.append(", Awakening: ");
		result.append(awakening);
		result.append(", skillLevel: ");
		result.append(skillLevel);
		result.append(')');
		return result.toString();
	}

} //SkillImpl
