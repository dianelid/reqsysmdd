/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import plaovgraph.Attribute;
import plaovgraph.Element;
import plaovgraph.IntertypeCategory;
import plaovgraph.IntertypeDeclaration;
import plaovgraph.PlaovgraphPackage;
import plaovgraph.Pointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intertype Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plaovgraph.impl.IntertypeDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link plaovgraph.impl.IntertypeDeclarationImpl#getNewElement <em>New Element</em>}</li>
 *   <li>{@link plaovgraph.impl.IntertypeDeclarationImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link plaovgraph.impl.IntertypeDeclarationImpl#getIdPointcut <em>Id Pointcut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntertypeDeclarationImpl extends EObjectImpl implements IntertypeDeclaration {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IntertypeCategory TYPE_EDEFAULT = IntertypeCategory.ELEMENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IntertypeCategory type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewElement() <em>New Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> newElement;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> newAttribute;

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
	protected IntertypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaovgraphPackage.Literals.INTERTYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntertypeCategory getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IntertypeCategory newType) {
		IntertypeCategory oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaovgraphPackage.INTERTYPE_DECLARATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getNewElement() {
		if (newElement == null) {
			newElement = new EObjectContainmentEList<Element>(Element.class, this, PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ELEMENT);
		}
		return newElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getNewAttribute() {
		if (newAttribute == null) {
			newAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ATTRIBUTE);
		}
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointcut> getIdPointcut() {
		if (idPointcut == null) {
			idPointcut = new EObjectResolvingEList<Pointcut>(Pointcut.class, this, PlaovgraphPackage.INTERTYPE_DECLARATION__ID_POINTCUT);
		}
		return idPointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ELEMENT:
				return ((InternalEList<?>)getNewElement()).basicRemove(otherEnd, msgs);
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ATTRIBUTE:
				return ((InternalEList<?>)getNewAttribute()).basicRemove(otherEnd, msgs);
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
			case PlaovgraphPackage.INTERTYPE_DECLARATION__TYPE:
				return getType();
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ELEMENT:
				return getNewElement();
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ATTRIBUTE:
				return getNewAttribute();
			case PlaovgraphPackage.INTERTYPE_DECLARATION__ID_POINTCUT:
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
			case PlaovgraphPackage.INTERTYPE_DECLARATION__TYPE:
				setType((IntertypeCategory)newValue);
				return;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ELEMENT:
				getNewElement().clear();
				getNewElement().addAll((Collection<? extends Element>)newValue);
				return;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ATTRIBUTE:
				getNewAttribute().clear();
				getNewAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__ID_POINTCUT:
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
			case PlaovgraphPackage.INTERTYPE_DECLARATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ELEMENT:
				getNewElement().clear();
				return;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ATTRIBUTE:
				getNewAttribute().clear();
				return;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__ID_POINTCUT:
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
			case PlaovgraphPackage.INTERTYPE_DECLARATION__TYPE:
				return type != TYPE_EDEFAULT;
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ELEMENT:
				return newElement != null && !newElement.isEmpty();
			case PlaovgraphPackage.INTERTYPE_DECLARATION__NEW_ATTRIBUTE:
				return newAttribute != null && !newAttribute.isEmpty();
			case PlaovgraphPackage.INTERTYPE_DECLARATION__ID_POINTCUT:
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

} //IntertypeDeclarationImpl
