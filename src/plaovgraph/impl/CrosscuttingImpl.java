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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import plaovgraph.Advice;
import plaovgraph.Crosscutting;
import plaovgraph.IntertypeDeclaration;
import plaovgraph.PlaovgraphPackage;
import plaovgraph.Pointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crosscutting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plaovgraph.impl.CrosscuttingImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link plaovgraph.impl.CrosscuttingImpl#getAdvice <em>Advice</em>}</li>
 *   <li>{@link plaovgraph.impl.CrosscuttingImpl#getIntertype <em>Intertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrosscuttingImpl extends RelationshipImpl implements Crosscutting {
	/**
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointcut> pointcut;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<Advice> advice;

	/**
	 * The cached value of the '{@link #getIntertype() <em>Intertype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntertype()
	 * @generated
	 * @ordered
	 */
	protected EList<IntertypeDeclaration> intertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrosscuttingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaovgraphPackage.Literals.CROSSCUTTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advice> getAdvice() {
		if (advice == null) {
			advice = new EObjectContainmentEList<Advice>(Advice.class, this, PlaovgraphPackage.CROSSCUTTING__ADVICE);
		}
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntertypeDeclaration> getIntertype() {
		if (intertype == null) {
			intertype = new EObjectContainmentEList<IntertypeDeclaration>(IntertypeDeclaration.class, this, PlaovgraphPackage.CROSSCUTTING__INTERTYPE);
		}
		return intertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointcut> getPointcut() {
		if (pointcut == null) {
			pointcut = new EObjectContainmentEList<Pointcut>(Pointcut.class, this, PlaovgraphPackage.CROSSCUTTING__POINTCUT);
		}
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaovgraphPackage.CROSSCUTTING__POINTCUT:
				return ((InternalEList<?>)getPointcut()).basicRemove(otherEnd, msgs);
			case PlaovgraphPackage.CROSSCUTTING__ADVICE:
				return ((InternalEList<?>)getAdvice()).basicRemove(otherEnd, msgs);
			case PlaovgraphPackage.CROSSCUTTING__INTERTYPE:
				return ((InternalEList<?>)getIntertype()).basicRemove(otherEnd, msgs);
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
			case PlaovgraphPackage.CROSSCUTTING__POINTCUT:
				return getPointcut();
			case PlaovgraphPackage.CROSSCUTTING__ADVICE:
				return getAdvice();
			case PlaovgraphPackage.CROSSCUTTING__INTERTYPE:
				return getIntertype();
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
			case PlaovgraphPackage.CROSSCUTTING__POINTCUT:
				getPointcut().clear();
				getPointcut().addAll((Collection<? extends Pointcut>)newValue);
				return;
			case PlaovgraphPackage.CROSSCUTTING__ADVICE:
				getAdvice().clear();
				getAdvice().addAll((Collection<? extends Advice>)newValue);
				return;
			case PlaovgraphPackage.CROSSCUTTING__INTERTYPE:
				getIntertype().clear();
				getIntertype().addAll((Collection<? extends IntertypeDeclaration>)newValue);
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
			case PlaovgraphPackage.CROSSCUTTING__POINTCUT:
				getPointcut().clear();
				return;
			case PlaovgraphPackage.CROSSCUTTING__ADVICE:
				getAdvice().clear();
				return;
			case PlaovgraphPackage.CROSSCUTTING__INTERTYPE:
				getIntertype().clear();
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
			case PlaovgraphPackage.CROSSCUTTING__POINTCUT:
				return pointcut != null && !pointcut.isEmpty();
			case PlaovgraphPackage.CROSSCUTTING__ADVICE:
				return advice != null && !advice.isEmpty();
			case PlaovgraphPackage.CROSSCUTTING__INTERTYPE:
				return intertype != null && !intertype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CrosscuttingImpl
