/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel.impl;

import featuremodel.FeatureModel;
import featuremodel.FeaturemodelPackage;
import featuremodel.RootFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featuremodel.impl.FeatureModelImpl#getContainsRoot <em>Contains Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureModelImpl extends EObjectImpl implements FeatureModel {
	/**
	 * The cached value of the '{@link #getContainsRoot() <em>Contains Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<RootFeature> containsRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootFeature> getContainsRoot() {
		if (containsRoot == null) {
			containsRoot = new EObjectContainmentEList<RootFeature>(RootFeature.class, this, FeaturemodelPackage.FEATURE_MODEL__CONTAINS_ROOT);
		}
		return containsRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE_MODEL__CONTAINS_ROOT:
				return ((InternalEList<?>)getContainsRoot()).basicRemove(otherEnd, msgs);
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
			case FeaturemodelPackage.FEATURE_MODEL__CONTAINS_ROOT:
				return getContainsRoot();
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
			case FeaturemodelPackage.FEATURE_MODEL__CONTAINS_ROOT:
				getContainsRoot().clear();
				getContainsRoot().addAll((Collection<? extends RootFeature>)newValue);
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
			case FeaturemodelPackage.FEATURE_MODEL__CONTAINS_ROOT:
				getContainsRoot().clear();
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
			case FeaturemodelPackage.FEATURE_MODEL__CONTAINS_ROOT:
				return containsRoot != null && !containsRoot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelImpl
