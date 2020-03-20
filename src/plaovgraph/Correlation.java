/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Correlation#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getCorrelation()
 * @model
 * @generated
 */
public interface Correlation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.CorrelationCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see plaovgraph.CorrelationCategory
	 * @see #setLabel(CorrelationCategory)
	 * @see plaovgraph.PlaovgraphPackage#getCorrelation_Label()
	 * @model required="true"
	 * @generated
	 */
	CorrelationCategory getLabel();

	/**
	 * Sets the value of the '{@link plaovgraph.Correlation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see plaovgraph.CorrelationCategory
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(CorrelationCategory value);

} // Correlation
