/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel.impl;

import featuremodel.Annotation;
import featuremodel.Feature;
import featuremodel.FeaturemodelPackage;
import featuremodel.Relationship;
import featuremodel.RootFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featuremodel.impl.RootFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link featuremodel.impl.RootFeatureImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link featuremodel.impl.RootFeatureImpl#getContainsRelation <em>Contains Relation</em>}</li>
 *   <li>{@link featuremodel.impl.RootFeatureImpl#getContainsFeature <em>Contains Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootFeatureImpl extends EObjectImpl implements RootFeature {
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
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The cached value of the '{@link #getContainsRelation() <em>Contains Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> containsRelation;

	/**
	 * The cached value of the '{@link #getContainsFeature() <em>Contains Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> containsFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.ROOT_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.ROOT_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, FeaturemodelPackage.ROOT_FEATURE__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getContainsRelation() {
		if (containsRelation == null) {
			containsRelation = new EObjectContainmentEList<Relationship>(Relationship.class, this, FeaturemodelPackage.ROOT_FEATURE__CONTAINS_RELATION);
		}
		return containsRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getContainsFeature() {
		if (containsFeature == null) {
			containsFeature = new EObjectContainmentEList<Feature>(Feature.class, this, FeaturemodelPackage.ROOT_FEATURE__CONTAINS_FEATURE);
		}
		return containsFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemodelPackage.ROOT_FEATURE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_RELATION:
				return ((InternalEList<?>)getContainsRelation()).basicRemove(otherEnd, msgs);
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_FEATURE:
				return ((InternalEList<?>)getContainsFeature()).basicRemove(otherEnd, msgs);
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
			case FeaturemodelPackage.ROOT_FEATURE__NAME:
				return getName();
			case FeaturemodelPackage.ROOT_FEATURE__ANNOTATION:
				return getAnnotation();
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_RELATION:
				return getContainsRelation();
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_FEATURE:
				return getContainsFeature();
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
			case FeaturemodelPackage.ROOT_FEATURE__NAME:
				setName((String)newValue);
				return;
			case FeaturemodelPackage.ROOT_FEATURE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_RELATION:
				getContainsRelation().clear();
				getContainsRelation().addAll((Collection<? extends Relationship>)newValue);
				return;
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_FEATURE:
				getContainsFeature().clear();
				getContainsFeature().addAll((Collection<? extends Feature>)newValue);
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
			case FeaturemodelPackage.ROOT_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturemodelPackage.ROOT_FEATURE__ANNOTATION:
				getAnnotation().clear();
				return;
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_RELATION:
				getContainsRelation().clear();
				return;
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_FEATURE:
				getContainsFeature().clear();
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
			case FeaturemodelPackage.ROOT_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturemodelPackage.ROOT_FEATURE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_RELATION:
				return containsRelation != null && !containsRelation.isEmpty();
			case FeaturemodelPackage.ROOT_FEATURE__CONTAINS_FEATURE:
				return containsFeature != null && !containsFeature.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RootFeatureImpl
