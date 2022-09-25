/**
 */
package Guides.lostarkguides.impl;

import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.Tripod;
import Guides.lostarkguides.TripodTier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tripod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.impl.TripodImpl#getName <em>Name</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.TripodImpl#getTier <em>Tier</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.TripodImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.TripodImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripodImpl extends MinimalEObjectImpl.Container implements Tripod {
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
	 * The default value of the '{@link #getTier() <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTier()
	 * @generated
	 * @ordered
	 */
	protected static final TripodTier TIER_EDEFAULT = TripodTier.TIER1;

	/**
	 * The cached value of the '{@link #getTier() <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTier()
	 * @generated
	 * @ordered
	 */
	protected TripodTier tier = TIER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LostarkguidesPackage.Literals.TRIPOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripodTier getTier() {
		return tier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTier(TripodTier newTier) {
		TripodTier oldTier = tier;
		tier = newTier == null ? TIER_EDEFAULT : newTier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD__TIER, oldTier, tier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill getSkill() {
		if (eContainerFeatureID() != LostarkguidesPackage.TRIPOD__SKILL) return null;
		return (Skill)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkill(Skill newSkill, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSkill, LostarkguidesPackage.TRIPOD__SKILL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(Skill newSkill) {
		if (newSkill != eInternalContainer() || (eContainerFeatureID() != LostarkguidesPackage.TRIPOD__SKILL && newSkill != null)) {
			if (EcoreUtil.isAncestor(this, newSkill))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSkill != null)
				msgs = ((InternalEObject)newSkill).eInverseAdd(this, LostarkguidesPackage.SKILL__TRIPODS, Skill.class, msgs);
			msgs = basicSetSkill(newSkill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD__SKILL, newSkill, newSkill));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LostarkguidesPackage.TRIPOD__SKILL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSkill((Skill)otherEnd, msgs);
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
			case LostarkguidesPackage.TRIPOD__SKILL:
				return basicSetSkill(null, msgs);
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
			case LostarkguidesPackage.TRIPOD__SKILL:
				return eInternalContainer().eInverseRemove(this, LostarkguidesPackage.SKILL__TRIPODS, Skill.class, msgs);
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
			case LostarkguidesPackage.TRIPOD__NAME:
				return getName();
			case LostarkguidesPackage.TRIPOD__TIER:
				return getTier();
			case LostarkguidesPackage.TRIPOD__SKILL:
				return getSkill();
			case LostarkguidesPackage.TRIPOD__DESCRIPTION:
				return getDescription();
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
			case LostarkguidesPackage.TRIPOD__NAME:
				setName((String)newValue);
				return;
			case LostarkguidesPackage.TRIPOD__TIER:
				setTier((TripodTier)newValue);
				return;
			case LostarkguidesPackage.TRIPOD__SKILL:
				setSkill((Skill)newValue);
				return;
			case LostarkguidesPackage.TRIPOD__DESCRIPTION:
				setDescription((String)newValue);
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
			case LostarkguidesPackage.TRIPOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LostarkguidesPackage.TRIPOD__TIER:
				setTier(TIER_EDEFAULT);
				return;
			case LostarkguidesPackage.TRIPOD__SKILL:
				setSkill((Skill)null);
				return;
			case LostarkguidesPackage.TRIPOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case LostarkguidesPackage.TRIPOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LostarkguidesPackage.TRIPOD__TIER:
				return tier != TIER_EDEFAULT;
			case LostarkguidesPackage.TRIPOD__SKILL:
				return getSkill() != null;
			case LostarkguidesPackage.TRIPOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", Tier: ");
		result.append(tier);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TripodImpl
