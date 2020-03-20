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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import plaovgraph.Advice;
import plaovgraph.AdviceCategory;
import plaovgraph.Element;
import plaovgraph.PlaovgraphPackage;
import plaovgraph.Pointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plaovgraph.impl.AdviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link plaovgraph.impl.AdviceImpl#getJoinpointAdvice <em>Joinpoint Advice</em>}</li>
 *   <li>{@link plaovgraph.impl.AdviceImpl#getIdPointcut <em>Id Pointcut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdviceImpl extends EObjectImpl implements Advice {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AdviceCategory TYPE_EDEFAULT = AdviceCategory.AROUND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AdviceCategory type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJoinpointAdvice() <em>Joinpoint Advice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinpointAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> joinpointAdvice;

	/**
	 * The cached value of the '{@link #getIdPointcut() <em>Id Pointcut</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPointcut()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointcut> idPointcut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaovgraphPackage.Literals.ADVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceCategory getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AdviceCategory newType) {
		AdviceCategory oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.ADVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getJoinpointAdvice() {
		if (joinpointAdvice == null) {
			joinpointAdvice = new EObjectResolvingEList<Element>(Element.class, this, PlaovgraphPackage.ADVICE__JOINPOINT_ADVICE);
		}
		return joinpointAdvice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointcut> getIdPointcut() {
		if (idPointcut == null) {
			idPointcut = new EObjectResolvingEList<Pointcut>(Pointcut.class, this, PlaovgraphPackage.ADVICE__ID_POINTCUT);
		}
		return idPointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaovgraphPackage.ADVICE__TYPE:
				return getType();
			case PlaovgraphPackage.ADVICE__JOINPOINT_ADVICE:
				return getJoinpointAdvice();
			case PlaovgraphPackage.ADVICE__ID_POINTCUT:
				return getIdPointcut();
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
			case PlaovgraphPackage.ADVICE__TYPE:
				setType((AdviceCategory)newValue);
				return;
			case PlaovgraphPackage.ADVICE__JOINPOINT_ADVICE:
				getJoinpointAdvice().clear();
				getJoinpointAdvice().addAll((Collection<? extends Element>)newValue);
				return;
			case PlaovgraphPackage.ADVICE__ID_POINTCUT:
				getIdPointcut().clear();
				getIdPointcut().addAll((Collection<? extends Pointcut>)newValue);
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
			case PlaovgraphPackage.ADVICE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PlaovgraphPackage.ADVICE__JOINPOINT_ADVICE:
				getJoinpointAdvice().clear();
				return;
			case PlaovgraphPackage.ADVICE__ID_POINTCUT:
				getIdPointcut().clear();
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
			case PlaovgraphPackage.ADVICE__TYPE:
				return type != TYPE_EDEFAULT;
			case PlaovgraphPackage.ADVICE__JOINPOINT_ADVICE:
				return joinpointAdvice != null && !joinpointAdvice.isEmpty();
			case PlaovgraphPackage.ADVICE__ID_POINTCUT:
				return idPointcut != null && !idPointcut.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AdviceImpl
