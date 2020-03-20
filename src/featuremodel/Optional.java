/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.Optional#getCardinalityMin <em>Cardinality Min</em>}</li>
 *   <li>{@link featuremodel.Optional#getCardinalityMax <em>Cardinality Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getOptional()
 * @model
 * @generated
 */
public interface Optional extends Relationship {
	/**
	 * Returns the value of the '<em><b>Cardinality Min</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Min</em>' attribute.
	 * @see #setCardinalityMin(String)
	 * @see featuremodel.FeaturemodelPackage#getOptional_CardinalityMin()
	 * @model default=""
	 * @generated
	 */
	String getCardinalityMin();

	/**
	 * Sets the value of the '{@link featuremodel.Optional#getCardinalityMin <em>Cardinality Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Min</em>' attribute.
	 * @see #getCardinalityMin()
	 * @generated
	 */
	void setCardinalityMin(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality Max</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Max</em>' attribute.
	 * @see #setCardinalityMax(String)
	 * @see featuremodel.FeaturemodelPackage#getOptional_CardinalityMax()
	 * @model default=""
	 * @generated
	 */
	String getCardinalityMax();

	/**
	 * Sets the value of the '{@link featuremodel.Optional#getCardinalityMax <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Max</em>' attribute.
	 * @see #getCardinalityMax()
	 * @generated
	 */
	void setCardinalityMax(String value);

} // Optional
