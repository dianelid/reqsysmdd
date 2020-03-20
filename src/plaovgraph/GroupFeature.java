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
 * A representation of the model object '<em><b>Group Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.GroupFeature#getSource <em>Source</em>}</li>
 *   <li>{@link plaovgraph.GroupFeature#getTarget <em>Target</em>}</li>
 *   <li>{@link plaovgraph.GroupFeature#getCardinalityGroupMin <em>Cardinality Group Min</em>}</li>
 *   <li>{@link plaovgraph.GroupFeature#getCardinalityGroupMax <em>Cardinality Group Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getGroupFeature()
 * @model
 * @generated
 */
public interface GroupFeature extends Property {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link plaovgraph.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see plaovgraph.PlaovgraphPackage#getGroupFeature_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getSource();

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
	 * @see plaovgraph.PlaovgraphPackage#getGroupFeature_Target()
	 * @model
	 * @generated
	 */
	Goal_Model getTarget();

	/**
	 * Sets the value of the '{@link plaovgraph.GroupFeature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Goal_Model value);

	/**
	 * Returns the value of the '<em><b>Cardinality Group Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Group Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Group Min</em>' attribute.
	 * @see #setCardinalityGroupMin(String)
	 * @see plaovgraph.PlaovgraphPackage#getGroupFeature_CardinalityGroupMin()
	 * @model required="true"
	 * @generated
	 */
	String getCardinalityGroupMin();

	/**
	 * Sets the value of the '{@link plaovgraph.GroupFeature#getCardinalityGroupMin <em>Cardinality Group Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Group Min</em>' attribute.
	 * @see #getCardinalityGroupMin()
	 * @generated
	 */
	void setCardinalityGroupMin(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality Group Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Group Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Group Max</em>' attribute.
	 * @see #setCardinalityGroupMax(String)
	 * @see plaovgraph.PlaovgraphPackage#getGroupFeature_CardinalityGroupMax()
	 * @model required="true"
	 * @generated
	 */
	String getCardinalityGroupMax();

	/**
	 * Sets the value of the '{@link plaovgraph.GroupFeature#getCardinalityGroupMax <em>Cardinality Group Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Group Max</em>' attribute.
	 * @see #getCardinalityGroupMax()
	 * @generated
	 */
	void setCardinalityGroupMax(String value);

} // GroupFeature
