/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featuremodel.RootFeature#getName <em>Name</em>}</li>
 *   <li>{@link featuremodel.RootFeature#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link featuremodel.RootFeature#getContainsRelation <em>Contains Relation</em>}</li>
 *   <li>{@link featuremodel.RootFeature#getContainsFeature <em>Contains Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see featuremodel.FeaturemodelPackage#getRootFeature()
 * @model
 * @generated
 */
public interface RootFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see featuremodel.FeaturemodelPackage#getRootFeature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link featuremodel.RootFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getRootFeature_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Contains Relation</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Relation</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getRootFeature_ContainsRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getContainsRelation();

	/**
	 * Returns the value of the '<em><b>Contains Feature</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Feature</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getRootFeature_ContainsFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getContainsFeature();

} // RootFeature
