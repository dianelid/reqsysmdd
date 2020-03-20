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
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link plaovgraph.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Goal_Model)
	 * @see plaovgraph.PlaovgraphPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	Goal_Model getSource();

	/**
	 * Sets the value of the '{@link plaovgraph.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Goal_Model value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Goal_Model)
	 * @see plaovgraph.PlaovgraphPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Goal_Model getTarget();

	/**
	 * Sets the value of the '{@link plaovgraph.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Goal_Model value);

} // Relationship
