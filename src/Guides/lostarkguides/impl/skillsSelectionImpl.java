/**
 */
package Guides.lostarkguides.impl;

import Guides.lostarkguides.LostarkguidesPackage;
import Guides.lostarkguides.Skill;
import Guides.lostarkguides.skillsSelection;
import Guides.lostarkguides.tripodSelection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>skills Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Guides.lostarkguides.impl.skillsSelectionImpl#getAwakening <em>Awakening</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.skillsSelectionImpl#getNormalSkills <em>Normal Skills</em>}</li>
 *   <li>{@link Guides.lostarkguides.impl.skillsSelectionImpl#getTripods <em>Tripods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class skillsSelectionImpl extends MinimalEObjectImpl.Container implements skillsSelection {
	/**
	 * The cached value of the '{@link #getAwakening() <em>Awakening</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwakening()
	 * @generated
	 * @ordered
	 */
	protected Skill awakening;

	/**
	 * The cached value of the '{@link #getNormalSkills() <em>Normal Skills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> normalSkills;

	/**
	 * The cached value of the '{@link #getTripods() <em>Tripods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripods()
	 * @generated
	 * @ordered
	 */
	protected EList<tripodSelection> tripods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected skillsSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LostarkguidesPackage.Literals.SKILLS_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill getAwakening() {
		if (awakening != null && awakening.eIsProxy()) {
			InternalEObject oldAwakening = (InternalEObject)awakening;
			awakening = (Skill)eResolveProxy(oldAwakening);
			if (awakening != oldAwakening) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LostarkguidesPackage.SKILLS_SELECTION__AWAKENING, oldAwakening, awakening));
			}
		}
		return awakening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill basicGetAwakening() {
		return awakening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwakening(Skill newAwakening) {
		Skill oldAwakening = awakening;
		awakening = newAwakening;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LostarkguidesPackage.SKILLS_SELECTION__AWAKENING, oldAwakening, awakening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Skill> getNormalSkills() {
		if (normalSkills == null) {
			normalSkills = new EObjectResolvingEList<Skill>(Skill.class, this, LostarkguidesPackage.SKILLS_SELECTION__NORMAL_SKILLS);
		}
		return normalSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tripodSelection> getTripods() {
		if (tripods == null) {
			tripods = new EObjectContainmentEList<tripodSelection>(tripodSelection.class, this, LostarkguidesPackage.SKILLS_SELECTION__TRIPODS);
		}
		return tripods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LostarkguidesPackage.SKILLS_SELECTION__TRIPODS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LostarkguidesPackage.SKILLS_SELECTION__AWAKENING:
				if (resolve) return getAwakening();
				return basicGetAwakening();
			case LostarkguidesPackage.SKILLS_SELECTION__NORMAL_SKILLS:
				return getNormalSkills();
			case LostarkguidesPackage.SKILLS_SELECTION__TRIPODS:
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
			case LostarkguidesPackage.SKILLS_SELECTION__AWAKENING:
				setAwakening((Skill)newValue);
				return;
			case LostarkguidesPackage.SKILLS_SELECTION__NORMAL_SKILLS:
				getNormalSkills().clear();
				getNormalSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case LostarkguidesPackage.SKILLS_SELECTION__TRIPODS:
				getTripods().clear();
				getTripods().addAll((Collection<? extends tripodSelection>)newValue);
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
			case LostarkguidesPackage.SKILLS_SELECTION__AWAKENING:
				setAwakening((Skill)null);
				return;
			case LostarkguidesPackage.SKILLS_SELECTION__NORMAL_SKILLS:
				getNormalSkills().clear();
				return;
			case LostarkguidesPackage.SKILLS_SELECTION__TRIPODS:
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
			case LostarkguidesPackage.SKILLS_SELECTION__AWAKENING:
				return awakening != null;
			case LostarkguidesPackage.SKILLS_SELECTION__NORMAL_SKILLS:
				return normalSkills != null && !normalSkills.isEmpty();
			case LostarkguidesPackage.SKILLS_SELECTION__TRIPODS:
				return tripods != null && !tripods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //skillsSelectionImpl
