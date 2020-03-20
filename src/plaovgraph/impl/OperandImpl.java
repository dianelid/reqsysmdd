/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import plaovgraph.Element;
import plaovgraph.Operand;
import plaovgraph.Operator;
import plaovgraph.PlaovgraphPackage;
import plaovgraph.PrimitiveTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plaovgraph.impl.OperandImpl#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link plaovgraph.impl.OperandImpl#getJoinpointPointcut <em>Joinpoint Pointcut</em>}</li>
 *   <li>{@link plaovgraph.impl.OperandImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperandImpl extends EObjectImpl implements Operand {
	/**
	 * The default value of the '{@link #getPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveTypes PRIMITIVE_EDEFAULT = PrimitiveTypes.INCLUDE;

	/**
	 * The cached value of the '{@link #getPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitive()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypes primitive = PRIMITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJoinpointPointcut() <em>Joinpoint Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinpointPointcut()
	 * @generated
	 * @ordered
	 */
	protected Element joinpointPointcut;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaovgraphPackage.Literals.OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes getPrimitive() {
		return primitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitive(PrimitiveTypes newPrimitive) {
		PrimitiveTypes oldPrimitive = primitive;
		primitive = newPrimitive == null ? PRIMITIVE_EDEFAULT : newPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.OPERAND__PRIMITIVE, oldPrimitive, primitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getJoinpointPointcut() {
		if (joinpointPointcut != null && joinpointPointcut.eIsProxy()) {
			InternalEObject oldJoinpointPointcut = (InternalEObject)joinpointPointcut;
			joinpointPointcut = (Element)eResolveProxy(oldJoinpointPointcut);
			if (joinpointPointcut != oldJoinpointPointcut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaovgraphPackage.OPERAND__JOINPOINT_POINTCUT, oldJoinpointPointcut, joinpointPointcut));
			}
		}
		return joinpointPointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetJoinpointPointcut() {
		return joinpointPointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinpointPointcut(Element newJoinpointPointcut) {
		Element oldJoinpointPointcut = joinpointPointcut;
		joinpointPointcut = newJoinpointPointcut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.OPERAND__JOINPOINT_POINTCUT, oldJoinpointPointcut, joinpointPointcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		Operator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.OPERAND__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlaovgraphPackage.OPERAND__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlaovgraphPackage.OPERAND__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.OPERAND__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaovgraphPackage.OPERAND__OPERATOR:
				return basicSetOperator(null, msgs);
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
			case PlaovgraphPackage.OPERAND__PRIMITIVE:
				return getPrimitive();
			case PlaovgraphPackage.OPERAND__JOINPOINT_POINTCUT:
				if (resolve) return getJoinpointPointcut();
				return basicGetJoinpointPointcut();
			case PlaovgraphPackage.OPERAND__OPERATOR:
				return getOperator();
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
			case PlaovgraphPackage.OPERAND__PRIMITIVE:
				setPrimitive((PrimitiveTypes)newValue);
				return;
			case PlaovgraphPackage.OPERAND__JOINPOINT_POINTCUT:
				setJoinpointPointcut((Element)newValue);
				return;
			case PlaovgraphPackage.OPERAND__OPERATOR:
				setOperator((Operator)newValue);
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
			case PlaovgraphPackage.OPERAND__PRIMITIVE:
				setPrimitive(PRIMITIVE_EDEFAULT);
				return;
			case PlaovgraphPackage.OPERAND__JOINPOINT_POINTCUT:
				setJoinpointPointcut((Element)null);
				return;
			case PlaovgraphPackage.OPERAND__OPERATOR:
				setOperator((Operator)null);
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
			case PlaovgraphPackage.OPERAND__PRIMITIVE:
				return primitive != PRIMITIVE_EDEFAULT;
			case PlaovgraphPackage.OPERAND__JOINPOINT_POINTCUT:
				return joinpointPointcut != null;
			case PlaovgraphPackage.OPERAND__OPERATOR:
				return operator != null;
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
		result.append(" (primitive: ");
		result.append(primitive);
		result.append(')');
		return result.toString();
	}

} //OperandImpl
