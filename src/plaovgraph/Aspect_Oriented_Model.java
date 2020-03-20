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
 * A representation of the model object '<em><b>Aspect Oriented Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Aspect_Oriented_Model#getGoalmodel <em>Goalmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getAspect_Oriented_Model()
 * @model
 * @generated
 */
public interface Aspect_Oriented_Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Goalmodel</b></em>' containment reference list.
	 * The list contents are of type {@link plaovgraph.Goal_Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goalmodel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goalmodel</em>' containment reference list.
	 * @see plaovgraph.PlaovgraphPackage#getAspect_Oriented_Model_Goalmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal_Model> getGoalmodel();

} // Aspect_Oriented_Model
