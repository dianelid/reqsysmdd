/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.Contribution#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends Relationship {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.DecompositionCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see plaovgraph.DecompositionCategory
	 * @see #setLabel(DecompositionCategory)
	 * @see plaovgraph.PlaovgraphPackage#getContribution_Label()
	 * @model required="true"
	 * @generated
	 */
	DecompositionCategory getLabel();

	/**
	 * Sets the value of the '{@link plaovgraph.Contribution#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see plaovgraph.DecompositionCategory
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(DecompositionCategory value);

} // Contribution
