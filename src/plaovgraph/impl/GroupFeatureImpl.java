/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import plaovgraph.Element;
import plaovgraph.Goal_Model;
import plaovgraph.GroupFeature;
import plaovgraph.PlaovgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plaovgraph.impl.GroupFeatureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link plaovgraph.impl.GroupFeatureImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link plaovgraph.impl.GroupFeatureImpl#getCardinalityGroupMin <em>Cardinality Group Min</em>}</li>
 *   <li>{@link plaovgraph.impl.GroupFeatureImpl#getCardinalityGroupMax <em>Cardinality Group Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupFeatureImpl extends PropertyImpl implements GroupFeature {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Goal_Model target;

	/**
	 * The default value of the '{@link #getCardinalityGroupMin() <em>Cardinality Group Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityGroupMin()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_GROUP_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinalityGroupMin() <em>Cardinality Group Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityGroupMin()
	 * @generated
	 * @ordered
	 */
	protected String cardinalityGroupMin = CARDINALITY_GROUP_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinalityGroupMax() <em>Cardinality Group Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityGroupMax()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_GROUP_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinalityGroupMax() <em>Cardinality Group Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityGroupMax()
	 * @generated
	 * @ordered
	 */
	protected String cardinalityGroupMax = CARDINALITY_GROUP_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaovgraphPackage.Literals.GROUP_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, PlaovgraphPackage.GROUP_FEATURE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Model getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Goal_Model)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaovgraphPackage.GROUP_FEATURE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Model basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Goal_Model newTarget) {
		Goal_Model oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.GROUP_FEATURE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinalityGroupMin() {
		return cardinalityGroupMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityGroupMin(String newCardinalityGroupMin) {
		String oldCardinalityGroupMin = cardinalityGroupMin;
		cardinalityGroupMin = newCardinalityGroupMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MIN, oldCardinalityGroupMin, cardinalityGroupMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinalityGroupMax() {
		return cardinalityGroupMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityGroupMax(String newCardinalityGroupMax) {
		String oldCardinalityGroupMax = cardinalityGroupMax;
		cardinalityGroupMax = newCardinalityGroupMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MAX, oldCardinalityGroupMax, cardinalityGroupMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaovgraphPackage.GROUP_FEATURE__SOURCE:
				return getSource();
			case PlaovgraphPackage.GROUP_FEATURE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MIN:
				return getCardinalityGroupMin();
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MAX:
				return getCardinalityGroupMax();
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
			case PlaovgraphPackage.GROUP_FEATURE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case PlaovgraphPackage.GROUP_FEATURE__TARGET:
				setTarget((Goal_Model)newValue);
				return;
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MIN:
				setCardinalityGroupMin((String)newValue);
				return;
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MAX:
				setCardinalityGroupMax((String)newValue);
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
			case PlaovgraphPackage.GROUP_FEATURE__SOURCE:
				getSource().clear();
				return;
			case PlaovgraphPackage.GROUP_FEATURE__TARGET:
				setTarget((Goal_Model)null);
				return;
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MIN:
				setCardinalityGroupMin(CARDINALITY_GROUP_MIN_EDEFAULT);
				return;
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MAX:
				setCardinalityGroupMax(CARDINALITY_GROUP_MAX_EDEFAULT);
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
			case PlaovgraphPackage.GROUP_FEATURE__SOURCE:
				return source != null && !source.isEmpty();
			case PlaovgraphPackage.GROUP_FEATURE__TARGET:
				return target != null;
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MIN:
				return CARDINALITY_GROUP_MIN_EDEFAULT == null ? cardinalityGroupMin != null : !CARDINALITY_GROUP_MIN_EDEFAULT.equals(cardinalityGroupMin);
			case PlaovgraphPackage.GROUP_FEATURE__CARDINALITY_GROUP_MAX:
				return CARDINALITY_GROUP_MAX_EDEFAULT == null ? cardinalityGroupMax != null : !CARDINALITY_GROUP_MAX_EDEFAULT.equals(cardinalityGroupMax);
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
		result.append(" (cardinalityGroupMin: ");
		result.append(cardinalityGroupMin);
		result.append(", cardinalityGroupMax: ");
		result.append(cardinalityGroupMax);
		result.append(')');
		return result.toString();
	}

} //GroupFeatureImpl
