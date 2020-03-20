/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Operand#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link plaovgraph.Operand#getJoinpointPointcut <em>Joinpoint Pointcut</em>}</li>
 *   <li>{@link plaovgraph.Operand#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see plaovgraph.PrimitiveTypes
	 * @see #setPrimitive(PrimitiveTypes)
	 * @see plaovgraph.PlaovgraphPackage#getOperand_Primitive()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypes getPrimitive();

	/**
	 * Sets the value of the '{@link plaovgraph.Operand#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see plaovgraph.PrimitiveTypes
	 * @see #getPrimitive()
	 * @generated
	 */
	void setPrimitive(PrimitiveTypes value);

	/**
	 * Returns the value of the '<em><b>Joinpoint Pointcut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joinpoint Pointcut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joinpoint Pointcut</em>' reference.
	 * @see #setJoinpointPointcut(Element)
	 * @see plaovgraph.PlaovgraphPackage#getOperand_JoinpointPointcut()
	 * @model required="true"
	 * @generated
	 */
	Element getJoinpointPointcut();

	/**
	 * Sets the value of the '{@link plaovgraph.Operand#getJoinpointPointcut <em>Joinpoint Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joinpoint Pointcut</em>' reference.
	 * @see #getJoinpointPointcut()
	 * @generated
	 */
	void setJoinpointPointcut(Element value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Operator)
	 * @see plaovgraph.PlaovgraphPackage#getOperand_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link plaovgraph.Operand#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // Operand
