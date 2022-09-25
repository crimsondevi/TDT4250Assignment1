/**
 */
package Guides.lostarkguides.impl;

import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.Tripod;
import Guides.lostarkguides.tripodSelection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tripod Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.impl.tripodSelectionImpl#getT1Tripod <em>T1 Tripod</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.tripodSelectionImpl#getT2Tripod <em>T2 Tripod</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.tripodSelectionImpl#getT3Tripod <em>T3 Tripod</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.tripodSelectionImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tripodSelectionImpl extends MinimalEObjectImpl.Container implements tripodSelection {
	/**
	 * The cached value of the '{@link #getT1Tripod() <em>T1 Tripod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT1Tripod()
	 * @generated
	 * @ordered
	 */
	protected Tripod t1Tripod;

	/**
	 * The cached value of the '{@link #getT2Tripod() <em>T2 Tripod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT2Tripod()
	 * @generated
	 * @ordered
	 */
	protected Tripod t2Tripod;

	/**
	 * The cached value of the '{@link #getT3Tripod() <em>T3 Tripod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT3Tripod()
	 * @generated
	 * @ordered
	 */
	protected Tripod t3Tripod;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected Skill skill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tripodSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LostarkguidesPackage.Literals.TRIPOD_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod getT1Tripod() {
		if (t1Tripod != null && t1Tripod.eIsProxy()) {
			InternalEObject oldT1Tripod = (InternalEObject)t1Tripod;
			t1Tripod = (Tripod)eResolveProxy(oldT1Tripod);
			if (t1Tripod != oldT1Tripod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LostarkguidesPackage.TRIPOD_SELECTION__T1_TRIPOD, oldT1Tripod, t1Tripod));
			}
		}
		return t1Tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod basicGetT1Tripod() {
		return t1Tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT1Tripod(Tripod newT1Tripod) {
		Tripod oldT1Tripod = t1Tripod;
		t1Tripod = newT1Tripod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD_SELECTION__T1_TRIPOD, oldT1Tripod, t1Tripod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod getT2Tripod() {
		if (t2Tripod != null && t2Tripod.eIsProxy()) {
			InternalEObject oldT2Tripod = (InternalEObject)t2Tripod;
			t2Tripod = (Tripod)eResolveProxy(oldT2Tripod);
			if (t2Tripod != oldT2Tripod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LostarkguidesPackage.TRIPOD_SELECTION__T2_TRIPOD, oldT2Tripod, t2Tripod));
			}
		}
		return t2Tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod basicGetT2Tripod() {
		return t2Tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT2Tripod(Tripod newT2Tripod) {
		Tripod oldT2Tripod = t2Tripod;
		t2Tripod = newT2Tripod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD_SELECTION__T2_TRIPOD, oldT2Tripod, t2Tripod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod getT3Tripod() {
		if (t3Tripod != null && t3Tripod.eIsProxy()) {
			InternalEObject oldT3Tripod = (InternalEObject)t3Tripod;
			t3Tripod = (Tripod)eResolveProxy(oldT3Tripod);
			if (t3Tripod != oldT3Tripod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LostarkguidesPackage.TRIPOD_SELECTION__T3_TRIPOD, oldT3Tripod, t3Tripod));
			}
		}
		return t3Tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tripod basicGetT3Tripod() {
		return t3Tripod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT3Tripod(Tripod newT3Tripod) {
		Tripod oldT3Tripod = t3Tripod;
		t3Tripod = newT3Tripod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD_SELECTION__T3_TRIPOD, oldT3Tripod, t3Tripod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill getSkill() {
		if (skill != null && skill.eIsProxy()) {
			InternalEObject oldSkill = (InternalEObject)skill;
			skill = (Skill)eResolveProxy(oldSkill);
			if (skill != oldSkill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LostarkguidesPackage.TRIPOD_SELECTION__SKILL, oldSkill, skill));
			}
		}
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill basicGetSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(Skill newSkill) {
		Skill oldSkill = skill;
		skill = newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.TRIPOD_SELECTION__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LostarkguidesPackage.TRIPOD_SELECTION__T1_TRIPOD:
				if (resolve) return getT1Tripod();
				return basicGetT1Tripod();
			case LostarkguidesPackage.TRIPOD_SELECTION__T2_TRIPOD:
				if (resolve) return getT2Tripod();
				return basicGetT2Tripod();
			case LostarkguidesPackage.TRIPOD_SELECTION__T3_TRIPOD:
				if (resolve) return getT3Tripod();
				return basicGetT3Tripod();
			case LostarkguidesPackage.TRIPOD_SELECTION__SKILL:
				if (resolve) return getSkill();
				return basicGetSkill();
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
			case LostarkguidesPackage.TRIPOD_SELECTION__T1_TRIPOD:
				setT1Tripod((Tripod)newValue);
				return;
			case LostarkguidesPackage.TRIPOD_SELECTION__T2_TRIPOD:
				setT2Tripod((Tripod)newValue);
				return;
			case LostarkguidesPackage.TRIPOD_SELECTION__T3_TRIPOD:
				setT3Tripod((Tripod)newValue);
				return;
			case LostarkguidesPackage.TRIPOD_SELECTION__SKILL:
				setSkill((Skill)newValue);
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
			case LostarkguidesPackage.TRIPOD_SELECTION__T1_TRIPOD:
				setT1Tripod((Tripod)null);
				return;
			case LostarkguidesPackage.TRIPOD_SELECTION__T2_TRIPOD:
				setT2Tripod((Tripod)null);
				return;
			case LostarkguidesPackage.TRIPOD_SELECTION__T3_TRIPOD:
				setT3Tripod((Tripod)null);
				return;
			case LostarkguidesPackage.TRIPOD_SELECTION__SKILL:
				setSkill((Skill)null);
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
			case LostarkguidesPackage.TRIPOD_SELECTION__T1_TRIPOD:
				return t1Tripod != null;
			case LostarkguidesPackage.TRIPOD_SELECTION__T2_TRIPOD:
				return t2Tripod != null;
			case LostarkguidesPackage.TRIPOD_SELECTION__T3_TRIPOD:
				return t3Tripod != null;
			case LostarkguidesPackage.TRIPOD_SELECTION__SKILL:
				return skill != null;
		}
		return super.eIsSet(featureID);
	}

} //tripodSelectionImpl
