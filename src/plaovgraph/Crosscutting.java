/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crosscutting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Crosscutting#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link plaovgraph.Crosscutting#getAdvice <em>Advice</em>}</li>
 *   <li>{@link plaovgraph.Crosscutting#getIntertype <em>Intertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getCrosscutting()
 * @model
 * @generated
 */
public interface Crosscutting extends Relationship {
	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference list.
	 * The list contents are of type {@link plaovgraph.Advice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference list.
	 * @see plaovgraph.PlaovgraphPackage#getCrosscutting_Advice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Advice> getAdvice();

	/**
	 * Returns the value of the '<em><b>Intertype</b></em>' containment reference list.
	 * The list contents are of type {@link plaovgraph.IntertypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intertype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intertype</em>' containment reference list.
	 * @see plaovgraph.PlaovgraphPackage#getCrosscutting_Intertype()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntertypeDeclaration> getIntertype();

	/**
	 * Returns the value of the '<em><b>Pointcut</b></em>' containment reference list.
	 * The list contents are of type {@link plaovgraph.Pointcut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' containment reference list.
	 * @see plaovgraph.PlaovgraphPackage#getCrosscutting_Pointcut()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	EList<Pointcut> getPointcut();

} // Crosscutting
