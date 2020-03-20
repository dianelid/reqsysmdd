/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plaovgraph.IsFeature#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see plaovgraph.PlaovgraphPackage#getIsFeature()
 * @model
 * @generated
 */
public interface IsFeature extends Property {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The literals are from the enumeration {@link plaovgraph.IsFeatureTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see plaovgraph.IsFeatureTypes
	 * @see #setLabel(IsFeatureTypes)
	 * @see plaovgraph.PlaovgraphPackage#getIsFeature_Label()
	 * @model required="true"
	 * @generated
	 */
	IsFeatureTypes getLabel();

	/**
	 * Sets the value of the '{@link plaovgraph.IsFeature#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see plaovgraph.IsFeatureTypes
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(IsFeatureTypes value);

} // IsFeature
