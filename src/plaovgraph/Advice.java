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
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Advice#getType <em>Type</em>}</li>
 *   <li>{@link plaovgraph.Advice#getJoinpointAdvice <em>Joinpoint Advice</em>}</li>
 *   <li>{@link plaovgraph.Advice#getIdPointcut <em>Id Pointcut</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.AdviceCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see plaovgraph.AdviceCategory
	 * @see #setType(AdviceCategory)
	 * @see plaovgraph.PlaovgraphPackage#getAdvice_Type()
	 * @model required="true"
	 * @generated
	 */
	AdviceCategory getType();

	/**
	 * Sets the value of the '{@link plaovgraph.Advice#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see plaovgraph.AdviceCategory
	 * @see #getType()
	 * @generated
	 */
	void setType(AdviceCategory value);

	/**
	 * Returns the value of the '<em><b>Joinpoint Advice</b></em>' reference list.
	 * The list contents are of type {@link plaovgraph.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joinpoint Advice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joinpoint Advice</em>' reference list.
	 * @see plaovgraph.PlaovgraphPackage#getAdvice_JoinpointAdvice()
	 * @model
	 * @generated
	 */
	EList<Element> getJoinpointAdvice();

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
	 * @see plaovgraph.PlaovgraphPackage#getAdvice_IdPointcut()
	 * @model keys="name" required="true"
	 * @generated
	 */
	EList<Pointcut> getIdPointcut();

} // Advice
