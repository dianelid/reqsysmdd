/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.GroupCardinality#getCardinalityMin <em>Cardinality Min</em>}</li>
 *   <li>{@link featuremodel.GroupCardinality#getCardinalityMax <em>Cardinality Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getGroupCardinality()
 * @model
 * @generated
 */
public interface GroupCardinality extends Relationship {
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
	 * @see featuremodel.FeaturemodelPackage#getGroupCardinality_CardinalityMin()
	 * @model required="true"
	 * @generated
	 */
	String getCardinalityMin();

	/**
	 * Sets the value of the '{@link featuremodel.GroupCardinality#getCardinalityMin <em>Cardinality Min</em>}' attribute.
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
	 * @see featuremodel.FeaturemodelPackage#getGroupCardinality_CardinalityMax()
	 * @model required="true"
	 * @generated
	 */
	String getCardinalityMax();

	/**
	 * Sets the value of the '{@link featuremodel.GroupCardinality#getCardinalityMax <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Max</em>' attribute.
	 * @see #getCardinalityMax()
	 * @generated
	 */
	void setCardinalityMax(String value);

} // GroupCardinality
