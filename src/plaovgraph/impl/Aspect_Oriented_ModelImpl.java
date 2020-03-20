/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import plaovgraph.Aspect_Oriented_Model;
import plaovgraph.Goal_Model;
import plaovgraph.PlaovgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Oriented Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plaovgraph.impl.Aspect_Oriented_ModelImpl#getGoalmodel <em>Goalmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Aspect_Oriented_ModelImpl extends EObjectImpl implements Aspect_Oriented_Model {
	/**
	 * The cached value of the '{@link #getGoalmodel() <em>Goalmodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal_Model> goalmodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aspect_Oriented_ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaovgraphPackage.Literals.ASPECT_ORIENTED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal_Model> getGoalmodel() {
		if (goalmodel == null) {
			goalmodel = new EObjectContainmentEList<Goal_Model>(Goal_Model.class, this, PlaovgraphPackage.ASPECT_ORIENTED_MODEL__GOALMODEL);
		}
		return goalmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaovgraphPackage.ASPECT_ORIENTED_MODEL__GOALMODEL:
				return ((InternalEList<?>)getGoalmodel()).basicRemove(otherEnd, msgs);
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
			case PlaovgraphPackage.ASPECT_ORIENTED_MODEL__GOALMODEL:
				return getGoalmodel();
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
			case PlaovgraphPackage.ASPECT_ORIENTED_MODEL__GOALMODEL:
				getGoalmodel().clear();
				getGoalmodel().addAll((Collection<? extends Goal_Model>)newValue);
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
			case PlaovgraphPackage.ASPECT_ORIENTED_MODEL__GOALMODEL:
				getGoalmodel().clear();
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
			case PlaovgraphPackage.ASPECT_ORIENTED_MODEL__GOALMODEL:
				return goalmodel != null && !goalmodel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Aspect_Oriented_ModelImpl
