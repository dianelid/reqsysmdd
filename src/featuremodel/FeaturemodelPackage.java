/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see featuremodel.FeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://featuremodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featuremodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemodelPackage eINSTANCE = featuremodel.impl.FeaturemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link featuremodel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.FeatureModelImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Contains Root</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONTAINS_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link featuremodel.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.RelationshipImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link featuremodel.impl.RootFeatureImpl <em>Root Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.RootFeatureImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getRootFeature()
	 * @generated
	 */
	int ROOT_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Contains Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE__CONTAINS_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Contains Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE__CONTAINS_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Root Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.FeatureImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = ROOT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ANNOTATION = ROOT_FEATURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Contains Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTAINS_RELATION = ROOT_FEATURE__CONTAINS_RELATION;

	/**
	 * The feature id for the '<em><b>Contains Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTAINS_FEATURE = ROOT_FEATURE__CONTAINS_FEATURE;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = ROOT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featuremodel.impl.ReferenceFeatureImpl <em>Reference Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.ReferenceFeatureImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getReferenceFeature()
	 * @generated
	 */
	int REFERENCE_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE__ANNOTATION = FEATURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Contains Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE__CONTAINS_RELATION = FEATURE__CONTAINS_RELATION;

	/**
	 * The feature id for the '<em><b>Contains Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE__CONTAINS_FEATURE = FEATURE__CONTAINS_FEATURE;

	/**
	 * The number of structural features of the '<em>Reference Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featuremodel.impl.GroupedFeatureImpl <em>Grouped Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.GroupedFeatureImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getGroupedFeature()
	 * @generated
	 */
	int GROUPED_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__ANNOTATION = FEATURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Contains Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__CONTAINS_RELATION = FEATURE__CONTAINS_RELATION;

	/**
	 * The feature id for the '<em><b>Contains Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__CONTAINS_FEATURE = FEATURE__CONTAINS_FEATURE;

	/**
	 * The number of structural features of the '<em>Grouped Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featuremodel.impl.GroupedReferenceImpl <em>Grouped Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.GroupedReferenceImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getGroupedReference()
	 * @generated
	 */
	int GROUPED_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_REFERENCE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_REFERENCE__ANNOTATION = FEATURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Contains Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_REFERENCE__CONTAINS_RELATION = FEATURE__CONTAINS_RELATION;

	/**
	 * The feature id for the '<em><b>Contains Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_REFERENCE__CONTAINS_FEATURE = FEATURE__CONTAINS_FEATURE;

	/**
	 * The number of structural features of the '<em>Grouped Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featuremodel.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.MandatoryImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CARDINALITY_MIN = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CARDINALITY_MAX = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featuremodel.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.OptionalImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CARDINALITY_MIN = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CARDINALITY_MAX = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featuremodel.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.AlternativeImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featuremodel.impl.Inclusive_OrImpl <em>Inclusive Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.Inclusive_OrImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getInclusive_Or()
	 * @generated
	 */
	int INCLUSIVE_OR = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Inclusive Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featuremodel.impl.GroupCardinalityImpl <em>Group Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.GroupCardinalityImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getGroupCardinality()
	 * @generated
	 */
	int GROUP_CARDINALITY = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CARDINALITY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CARDINALITY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CARDINALITY__CARDINALITY_MIN = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CARDINALITY__CARDINALITY_MAX = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CARDINALITY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featuremodel.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featuremodel.impl.AnnotationImpl
	 * @see featuremodel.impl.FeaturemodelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link featuremodel.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see featuremodel.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link featuremodel.FeatureModel#getContainsRoot <em>Contains Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Root</em>'.
	 * @see featuremodel.FeatureModel#getContainsRoot()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_ContainsRoot();

	/**
	 * Returns the meta object for class '{@link featuremodel.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see featuremodel.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link featuremodel.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see featuremodel.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link featuremodel.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see featuremodel.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link featuremodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see featuremodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link featuremodel.RootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Feature</em>'.
	 * @see featuremodel.RootFeature
	 * @generated
	 */
	EClass getRootFeature();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.RootFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featuremodel.RootFeature#getName()
	 * @see #getRootFeature()
	 * @generated
	 */
	EAttribute getRootFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link featuremodel.RootFeature#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see featuremodel.RootFeature#getAnnotation()
	 * @see #getRootFeature()
	 * @generated
	 */
	EReference getRootFeature_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link featuremodel.RootFeature#getContainsRelation <em>Contains Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Relation</em>'.
	 * @see featuremodel.RootFeature#getContainsRelation()
	 * @see #getRootFeature()
	 * @generated
	 */
	EReference getRootFeature_ContainsRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link featuremodel.RootFeature#getContainsFeature <em>Contains Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Feature</em>'.
	 * @see featuremodel.RootFeature#getContainsFeature()
	 * @see #getRootFeature()
	 * @generated
	 */
	EReference getRootFeature_ContainsFeature();

	/**
	 * Returns the meta object for class '{@link featuremodel.ReferenceFeature <em>Reference Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Feature</em>'.
	 * @see featuremodel.ReferenceFeature
	 * @generated
	 */
	EClass getReferenceFeature();

	/**
	 * Returns the meta object for class '{@link featuremodel.GroupedFeature <em>Grouped Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouped Feature</em>'.
	 * @see featuremodel.GroupedFeature
	 * @generated
	 */
	EClass getGroupedFeature();

	/**
	 * Returns the meta object for class '{@link featuremodel.GroupedReference <em>Grouped Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouped Reference</em>'.
	 * @see featuremodel.GroupedReference
	 * @generated
	 */
	EClass getGroupedReference();

	/**
	 * Returns the meta object for class '{@link featuremodel.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see featuremodel.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.Mandatory#getCardinalityMin <em>Cardinality Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Min</em>'.
	 * @see featuremodel.Mandatory#getCardinalityMin()
	 * @see #getMandatory()
	 * @generated
	 */
	EAttribute getMandatory_CardinalityMin();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.Mandatory#getCardinalityMax <em>Cardinality Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Max</em>'.
	 * @see featuremodel.Mandatory#getCardinalityMax()
	 * @see #getMandatory()
	 * @generated
	 */
	EAttribute getMandatory_CardinalityMax();

	/**
	 * Returns the meta object for class '{@link featuremodel.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see featuremodel.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.Optional#getCardinalityMin <em>Cardinality Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Min</em>'.
	 * @see featuremodel.Optional#getCardinalityMin()
	 * @see #getOptional()
	 * @generated
	 */
	EAttribute getOptional_CardinalityMin();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.Optional#getCardinalityMax <em>Cardinality Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Max</em>'.
	 * @see featuremodel.Optional#getCardinalityMax()
	 * @see #getOptional()
	 * @generated
	 */
	EAttribute getOptional_CardinalityMax();

	/**
	 * Returns the meta object for class '{@link featuremodel.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see featuremodel.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for class '{@link featuremodel.Inclusive_Or <em>Inclusive Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Or</em>'.
	 * @see featuremodel.Inclusive_Or
	 * @generated
	 */
	EClass getInclusive_Or();

	/**
	 * Returns the meta object for class '{@link featuremodel.GroupCardinality <em>Group Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Cardinality</em>'.
	 * @see featuremodel.GroupCardinality
	 * @generated
	 */
	EClass getGroupCardinality();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.GroupCardinality#getCardinalityMin <em>Cardinality Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Min</em>'.
	 * @see featuremodel.GroupCardinality#getCardinalityMin()
	 * @see #getGroupCardinality()
	 * @generated
	 */
	EAttribute getGroupCardinality_CardinalityMin();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.GroupCardinality#getCardinalityMax <em>Cardinality Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Max</em>'.
	 * @see featuremodel.GroupCardinality#getCardinalityMax()
	 * @see #getGroupCardinality()
	 * @generated
	 */
	EAttribute getGroupCardinality_CardinalityMax();

	/**
	 * Returns the meta object for class '{@link featuremodel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see featuremodel.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link featuremodel.Annotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see featuremodel.Annotation#getDescription()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturemodelFactory getFeaturemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link featuremodel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.FeatureModelImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Contains Root</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONTAINS_ROOT = eINSTANCE.getFeatureModel_ContainsRoot();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.RelationshipImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.FeatureImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.RootFeatureImpl <em>Root Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.RootFeatureImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getRootFeature()
		 * @generated
		 */
		EClass ROOT_FEATURE = eINSTANCE.getRootFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_FEATURE__NAME = eINSTANCE.getRootFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_FEATURE__ANNOTATION = eINSTANCE.getRootFeature_Annotation();

		/**
		 * The meta object literal for the '<em><b>Contains Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_FEATURE__CONTAINS_RELATION = eINSTANCE.getRootFeature_ContainsRelation();

		/**
		 * The meta object literal for the '<em><b>Contains Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_FEATURE__CONTAINS_FEATURE = eINSTANCE.getRootFeature_ContainsFeature();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.ReferenceFeatureImpl <em>Reference Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.ReferenceFeatureImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getReferenceFeature()
		 * @generated
		 */
		EClass REFERENCE_FEATURE = eINSTANCE.getReferenceFeature();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.GroupedFeatureImpl <em>Grouped Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.GroupedFeatureImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getGroupedFeature()
		 * @generated
		 */
		EClass GROUPED_FEATURE = eINSTANCE.getGroupedFeature();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.GroupedReferenceImpl <em>Grouped Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.GroupedReferenceImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getGroupedReference()
		 * @generated
		 */
		EClass GROUPED_REFERENCE = eINSTANCE.getGroupedReference();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.MandatoryImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '<em><b>Cardinality Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY__CARDINALITY_MIN = eINSTANCE.getMandatory_CardinalityMin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY__CARDINALITY_MAX = eINSTANCE.getMandatory_CardinalityMax();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.OptionalImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '<em><b>Cardinality Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL__CARDINALITY_MIN = eINSTANCE.getOptional_CardinalityMin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL__CARDINALITY_MAX = eINSTANCE.getOptional_CardinalityMax();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.AlternativeImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.Inclusive_OrImpl <em>Inclusive Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.Inclusive_OrImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getInclusive_Or()
		 * @generated
		 */
		EClass INCLUSIVE_OR = eINSTANCE.getInclusive_Or();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.GroupCardinalityImpl <em>Group Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.GroupCardinalityImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getGroupCardinality()
		 * @generated
		 */
		EClass GROUP_CARDINALITY = eINSTANCE.getGroupCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_CARDINALITY__CARDINALITY_MIN = eINSTANCE.getGroupCardinality_CardinalityMin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_CARDINALITY__CARDINALITY_MAX = eINSTANCE.getGroupCardinality_CardinalityMax();

		/**
		 * The meta object literal for the '{@link featuremodel.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featuremodel.impl.AnnotationImpl
		 * @see featuremodel.impl.FeaturemodelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__DESCRIPTION = eINSTANCE.getAnnotation_Description();

	}

} //FeaturemodelPackage
