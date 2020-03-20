/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Cardinality#getSource <em>Source</em>}</li>
 *   <li>{@link plaovgraph.Cardinality#getTarget <em>Target</em>}</li>
 *   <li>{@link plaovgraph.Cardinality#getCardinalityMin <em>Cardinality Min</em>}</li>
 *   <li>{@link plaovgraph.Cardinality#getCardinalityMax <em>Cardinality Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends Property {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see plaovgraph.PlaovgraphPackage#getCardinality_Source()
	 * @model
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link plaovgraph.Cardinality#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

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
	 * @see plaovgraph.PlaovgraphPackage#getCardinality_Target()
	 * @model
	 * @generated
	 */
	Goal_Model getTarget();

	/**
	 * Sets the value of the '{@link plaovgraph.Cardinality#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Goal_Model value);

	/**
	 * Returns the value of the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Min</em>' attribute.
	 * @see #setCardinalityMin(String)
	 * @see plaovgraph.PlaovgraphPackage#getCardinality_CardinalityMin()
	 * @model required="true"
	 * @generated
	 */
	String getCardinalityMin();

	/**
	 * Sets the value of the '{@link plaovgraph.Cardinality#getCardinalityMin <em>Cardinality Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Min</em>' attribute.
	 * @see #getCardinalityMin()
	 * @generated
	 */
	void setCardinalityMin(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Max</em>' attribute.
	 * @see #setCardinalityMax(String)
	 * @see plaovgraph.PlaovgraphPackage#getCardinality_CardinalityMax()
	 * @model required="true"
	 * @generated
	 */
	String getCardinalityMax();

	/**
	 * Sets the value of the '{@link plaovgraph.Cardinality#getCardinalityMax <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Max</em>' attribute.
	 * @see #getCardinalityMax()
	 * @generated
	 */
	void setCardinalityMax(String value);

} // Cardinality
