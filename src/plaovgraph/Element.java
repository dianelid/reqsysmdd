/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Element#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends Goal_Model {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.ElementTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see plaovgraph.ElementTypes
	 * @see #setType(ElementTypes)
	 * @see plaovgraph.PlaovgraphPackage#getElement_Type()
	 * @model required="true"
	 * @generated
	 */
	ElementTypes getType();

	/**
	 * Sets the value of the '{@link plaovgraph.Element#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see plaovgraph.ElementTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ElementTypes value);

} // Element
