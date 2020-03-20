/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intertype Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.IntertypeDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link plaovgraph.IntertypeDeclaration#getNewElement <em>New Element</em>}</li>
 *   <li>{@link plaovgraph.IntertypeDeclaration#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link plaovgraph.IntertypeDeclaration#getIdPointcut <em>Id Pointcut</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getIntertypeDeclaration()
 * @model
 * @generated
 */
public interface IntertypeDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.IntertypeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see plaovgraph.IntertypeCategory
	 * @see #setType(IntertypeCategory)
	 * @see plaovgraph.PlaovgraphPackage#getIntertypeDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	IntertypeCategory getType();

	/**
	 * Sets the value of the '{@link plaovgraph.IntertypeDeclaration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see plaovgraph.IntertypeCategory
	 * @see #getType()
	 * @generated
	 */
	void setType(IntertypeCategory value);

	/**
	 * Returns the value of the '<em><b>New Element</b></em>' containment reference list.
	 * The list contents are of type {@link plaovgraph.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Element</em>' containment reference list.
	 * @see plaovgraph.PlaovgraphPackage#getIntertypeDeclaration_NewElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getNewElement();

	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link plaovgraph.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' containment reference list.
	 * @see plaovgraph.PlaovgraphPackage#getIntertypeDeclaration_NewAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getNewAttribute();

	/**
	 * Returns the value of the '<em><b>Id Pointcut</b></em>' reference list.
	 * The list contents are of type {@link plaovgraph.Pointcut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pointcut</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pointcut</em>' reference list.
	 * @see plaovgraph.PlaovgraphPackage#getIntertypeDeclaration_IdPointcut()
	 * @model required="true"
	 * @generated
	 */
	EList<Pointcut> getIdPointcut();

} // IntertypeDeclaration
