/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see plaovgraph.PlaovgraphFactory
 * @model kind="package"
 * @generated
 */
public interface PlaovgraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plaovgraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://plaovgraph/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "plaovgraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlaovgraphPackage eINSTANCE = plaovgraph.impl.PlaovgraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link plaovgraph.impl.Aspect_Oriented_ModelImpl <em>Aspect Oriented Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.Aspect_Oriented_ModelImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAspect_Oriented_Model()
	 * @generated
	 */
	int ASPECT_ORIENTED_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Goalmodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ORIENTED_MODEL__GOALMODEL = 0;

	/**
	 * The number of structural features of the '<em>Aspect Oriented Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ORIENTED_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.Goal_ModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.Goal_ModelImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getGoal_Model()
	 * @generated
	 */
	int GOAL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.ElementImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = GOAL_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT = GOAL_MODEL__ELEMENT;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATIONSHIP = GOAL_MODEL__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTY = GOAL_MODEL__PROPERTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = GOAL_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = GOAL_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.RelationshipImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
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
	 * The meta object id for the '{@link plaovgraph.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.PropertyImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.IsFeatureImpl <em>Is Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.IsFeatureImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIsFeature()
	 * @generated
	 */
	int IS_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FEATURE__LABEL = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FEATURE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.CardinalityImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__SOURCE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__TARGET = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CARDINALITY_MIN = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CARDINALITY_MAX = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.GroupFeatureImpl <em>Group Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.GroupFeatureImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getGroupFeature()
	 * @generated
	 */
	int GROUP_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE__SOURCE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE__TARGET = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality Group Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE__CARDINALITY_GROUP_MIN = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality Group Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE__CARDINALITY_GROUP_MAX = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.Generic_PropertyImpl <em>Generic Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.Generic_PropertyImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getGeneric_Property()
	 * @generated
	 */
	int GENERIC_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY__NAME = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.ContributionImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__LABEL = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.CorrelationImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__LABEL = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.CrosscuttingImpl <em>Crosscutting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.CrosscuttingImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCrosscutting()
	 * @generated
	 */
	int CROSSCUTTING = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__POINTCUT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__ADVICE = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intertype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__INTERTYPE = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Crosscutting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.PointcutImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__OPERAND = 1;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.OperandImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 13;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__PRIMITIVE = 0;

	/**
	 * The feature id for the '<em><b>Joinpoint Pointcut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__JOINPOINT_POINTCUT = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.OperatorImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.AdviceImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Joinpoint Advice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__JOINPOINT_ADVICE = 1;

	/**
	 * The feature id for the '<em><b>Id Pointcut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ID_POINTCUT = 2;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.IntertypeDeclarationImpl <em>Intertype Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.IntertypeDeclarationImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIntertypeDeclaration()
	 * @generated
	 */
	int INTERTYPE_DECLARATION = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERTYPE_DECLARATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>New Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERTYPE_DECLARATION__NEW_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERTYPE_DECLARATION__NEW_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Id Pointcut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERTYPE_DECLARATION__ID_POINTCUT = 3;

	/**
	 * The number of structural features of the '<em>Intertype Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERTYPE_DECLARATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link plaovgraph.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.impl.AttributeImpl
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link plaovgraph.DecompositionCategory <em>Decomposition Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.DecompositionCategory
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getDecompositionCategory()
	 * @generated
	 */
	int DECOMPOSITION_CATEGORY = 18;

	/**
	 * The meta object id for the '{@link plaovgraph.IsFeatureTypes <em>Is Feature Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.IsFeatureTypes
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIsFeatureTypes()
	 * @generated
	 */
	int IS_FEATURE_TYPES = 19;

	/**
	 * The meta object id for the '{@link plaovgraph.CorrelationCategory <em>Correlation Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.CorrelationCategory
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCorrelationCategory()
	 * @generated
	 */
	int CORRELATION_CATEGORY = 20;

	/**
	 * The meta object id for the '{@link plaovgraph.AdviceCategory <em>Advice Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.AdviceCategory
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAdviceCategory()
	 * @generated
	 */
	int ADVICE_CATEGORY = 21;

	/**
	 * The meta object id for the '{@link plaovgraph.IntertypeCategory <em>Intertype Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.IntertypeCategory
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIntertypeCategory()
	 * @generated
	 */
	int INTERTYPE_CATEGORY = 22;

	/**
	 * The meta object id for the '{@link plaovgraph.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.PrimitiveTypes
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 23;

	/**
	 * The meta object id for the '{@link plaovgraph.OperatorTypes <em>Operator Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.OperatorTypes
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getOperatorTypes()
	 * @generated
	 */
	int OPERATOR_TYPES = 24;

	/**
	 * The meta object id for the '{@link plaovgraph.ElementTypes <em>Element Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plaovgraph.ElementTypes
	 * @see plaovgraph.impl.PlaovgraphPackageImpl#getElementTypes()
	 * @generated
	 */
	int ELEMENT_TYPES = 25;


	/**
	 * Returns the meta object for class '{@link plaovgraph.Aspect_Oriented_Model <em>Aspect Oriented Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Oriented Model</em>'.
	 * @see plaovgraph.Aspect_Oriented_Model
	 * @generated
	 */
	EClass getAspect_Oriented_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Aspect_Oriented_Model#getGoalmodel <em>Goalmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goalmodel</em>'.
	 * @see plaovgraph.Aspect_Oriented_Model#getGoalmodel()
	 * @see #getAspect_Oriented_Model()
	 * @generated
	 */
	EReference getAspect_Oriented_Model_Goalmodel();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Goal_Model <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see plaovgraph.Goal_Model
	 * @generated
	 */
	EClass getGoal_Model();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Goal_Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plaovgraph.Goal_Model#getName()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EAttribute getGoal_Model_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Goal_Model#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see plaovgraph.Goal_Model#getElement()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EReference getGoal_Model_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Goal_Model#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see plaovgraph.Goal_Model#getRelationship()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EReference getGoal_Model_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Goal_Model#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see plaovgraph.Goal_Model#getProperty()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EReference getGoal_Model_Property();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see plaovgraph.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see plaovgraph.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see plaovgraph.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link plaovgraph.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see plaovgraph.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link plaovgraph.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see plaovgraph.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see plaovgraph.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link plaovgraph.IsFeature <em>Is Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Feature</em>'.
	 * @see plaovgraph.IsFeature
	 * @generated
	 */
	EClass getIsFeature();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.IsFeature#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see plaovgraph.IsFeature#getLabel()
	 * @see #getIsFeature()
	 * @generated
	 */
	EAttribute getIsFeature_Label();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see plaovgraph.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the reference '{@link plaovgraph.Cardinality#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see plaovgraph.Cardinality#getSource()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_Source();

	/**
	 * Returns the meta object for the reference '{@link plaovgraph.Cardinality#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see plaovgraph.Cardinality#getTarget()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_Target();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Cardinality#getCardinalityMin <em>Cardinality Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Min</em>'.
	 * @see plaovgraph.Cardinality#getCardinalityMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_CardinalityMin();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Cardinality#getCardinalityMax <em>Cardinality Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Max</em>'.
	 * @see plaovgraph.Cardinality#getCardinalityMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_CardinalityMax();

	/**
	 * Returns the meta object for class '{@link plaovgraph.GroupFeature <em>Group Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Feature</em>'.
	 * @see plaovgraph.GroupFeature
	 * @generated
	 */
	EClass getGroupFeature();

	/**
	 * Returns the meta object for the reference list '{@link plaovgraph.GroupFeature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see plaovgraph.GroupFeature#getSource()
	 * @see #getGroupFeature()
	 * @generated
	 */
	EReference getGroupFeature_Source();

	/**
	 * Returns the meta object for the reference '{@link plaovgraph.GroupFeature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see plaovgraph.GroupFeature#getTarget()
	 * @see #getGroupFeature()
	 * @generated
	 */
	EReference getGroupFeature_Target();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.GroupFeature#getCardinalityGroupMin <em>Cardinality Group Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Group Min</em>'.
	 * @see plaovgraph.GroupFeature#getCardinalityGroupMin()
	 * @see #getGroupFeature()
	 * @generated
	 */
	EAttribute getGroupFeature_CardinalityGroupMin();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.GroupFeature#getCardinalityGroupMax <em>Cardinality Group Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Group Max</em>'.
	 * @see plaovgraph.GroupFeature#getCardinalityGroupMax()
	 * @see #getGroupFeature()
	 * @generated
	 */
	EAttribute getGroupFeature_CardinalityGroupMax();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Generic_Property <em>Generic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Property</em>'.
	 * @see plaovgraph.Generic_Property
	 * @generated
	 */
	EClass getGeneric_Property();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Generic_Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plaovgraph.Generic_Property#getName()
	 * @see #getGeneric_Property()
	 * @generated
	 */
	EAttribute getGeneric_Property_Name();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Generic_Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see plaovgraph.Generic_Property#getValue()
	 * @see #getGeneric_Property()
	 * @generated
	 */
	EAttribute getGeneric_Property_Value();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see plaovgraph.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Contribution#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see plaovgraph.Contribution#getLabel()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Label();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see plaovgraph.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Correlation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see plaovgraph.Correlation#getLabel()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Label();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Crosscutting <em>Crosscutting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosscutting</em>'.
	 * @see plaovgraph.Crosscutting
	 * @generated
	 */
	EClass getCrosscutting();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Crosscutting#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advice</em>'.
	 * @see plaovgraph.Crosscutting#getAdvice()
	 * @see #getCrosscutting()
	 * @generated
	 */
	EReference getCrosscutting_Advice();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Crosscutting#getIntertype <em>Intertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intertype</em>'.
	 * @see plaovgraph.Crosscutting#getIntertype()
	 * @see #getCrosscutting()
	 * @generated
	 */
	EReference getCrosscutting_Intertype();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Crosscutting#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcut</em>'.
	 * @see plaovgraph.Crosscutting#getPointcut()
	 * @see #getCrosscutting()
	 * @generated
	 */
	EReference getCrosscutting_Pointcut();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see plaovgraph.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Pointcut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plaovgraph.Pointcut#getName()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.Pointcut#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see plaovgraph.Pointcut#getOperand()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Operand();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see plaovgraph.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Operand#getPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see plaovgraph.Operand#getPrimitive()
	 * @see #getOperand()
	 * @generated
	 */
	EAttribute getOperand_Primitive();

	/**
	 * Returns the meta object for the reference '{@link plaovgraph.Operand#getJoinpointPointcut <em>Joinpoint Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Joinpoint Pointcut</em>'.
	 * @see plaovgraph.Operand#getJoinpointPointcut()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_JoinpointPointcut();

	/**
	 * Returns the meta object for the containment reference '{@link plaovgraph.Operand#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see plaovgraph.Operand#getOperator()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Operator();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see plaovgraph.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Operator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see plaovgraph.Operator#getOperator()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Operator();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see plaovgraph.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Advice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see plaovgraph.Advice#getType()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_Type();

	/**
	 * Returns the meta object for the reference list '{@link plaovgraph.Advice#getJoinpointAdvice <em>Joinpoint Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Joinpoint Advice</em>'.
	 * @see plaovgraph.Advice#getJoinpointAdvice()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_JoinpointAdvice();

	/**
	 * Returns the meta object for the reference list '{@link plaovgraph.Advice#getIdPointcut <em>Id Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Id Pointcut</em>'.
	 * @see plaovgraph.Advice#getIdPointcut()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_IdPointcut();

	/**
	 * Returns the meta object for class '{@link plaovgraph.IntertypeDeclaration <em>Intertype Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intertype Declaration</em>'.
	 * @see plaovgraph.IntertypeDeclaration
	 * @generated
	 */
	EClass getIntertypeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.IntertypeDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see plaovgraph.IntertypeDeclaration#getType()
	 * @see #getIntertypeDeclaration()
	 * @generated
	 */
	EAttribute getIntertypeDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.IntertypeDeclaration#getNewElement <em>New Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Element</em>'.
	 * @see plaovgraph.IntertypeDeclaration#getNewElement()
	 * @see #getIntertypeDeclaration()
	 * @generated
	 */
	EReference getIntertypeDeclaration_NewElement();

	/**
	 * Returns the meta object for the containment reference list '{@link plaovgraph.IntertypeDeclaration#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Attribute</em>'.
	 * @see plaovgraph.IntertypeDeclaration#getNewAttribute()
	 * @see #getIntertypeDeclaration()
	 * @generated
	 */
	EReference getIntertypeDeclaration_NewAttribute();

	/**
	 * Returns the meta object for the reference list '{@link plaovgraph.IntertypeDeclaration#getIdPointcut <em>Id Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Id Pointcut</em>'.
	 * @see plaovgraph.IntertypeDeclaration#getIdPointcut()
	 * @see #getIntertypeDeclaration()
	 * @generated
	 */
	EReference getIntertypeDeclaration_IdPointcut();

	/**
	 * Returns the meta object for class '{@link plaovgraph.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see plaovgraph.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see plaovgraph.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link plaovgraph.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see plaovgraph.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.DecompositionCategory <em>Decomposition Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Category</em>'.
	 * @see plaovgraph.DecompositionCategory
	 * @generated
	 */
	EEnum getDecompositionCategory();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.IsFeatureTypes <em>Is Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Is Feature Types</em>'.
	 * @see plaovgraph.IsFeatureTypes
	 * @generated
	 */
	EEnum getIsFeatureTypes();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.CorrelationCategory <em>Correlation Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correlation Category</em>'.
	 * @see plaovgraph.CorrelationCategory
	 * @generated
	 */
	EEnum getCorrelationCategory();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.AdviceCategory <em>Advice Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Advice Category</em>'.
	 * @see plaovgraph.AdviceCategory
	 * @generated
	 */
	EEnum getAdviceCategory();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.IntertypeCategory <em>Intertype Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intertype Category</em>'.
	 * @see plaovgraph.IntertypeCategory
	 * @generated
	 */
	EEnum getIntertypeCategory();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.PrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Types</em>'.
	 * @see plaovgraph.PrimitiveTypes
	 * @generated
	 */
	EEnum getPrimitiveTypes();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.OperatorTypes <em>Operator Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Types</em>'.
	 * @see plaovgraph.OperatorTypes
	 * @generated
	 */
	EEnum getOperatorTypes();

	/**
	 * Returns the meta object for enum '{@link plaovgraph.ElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Types</em>'.
	 * @see plaovgraph.ElementTypes
	 * @generated
	 */
	EEnum getElementTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlaovgraphFactory getPlaovgraphFactory();

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
		 * The meta object literal for the '{@link plaovgraph.impl.Aspect_Oriented_ModelImpl <em>Aspect Oriented Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.Aspect_Oriented_ModelImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAspect_Oriented_Model()
		 * @generated
		 */
		EClass ASPECT_ORIENTED_MODEL = eINSTANCE.getAspect_Oriented_Model();

		/**
		 * The meta object literal for the '<em><b>Goalmodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_ORIENTED_MODEL__GOALMODEL = eINSTANCE.getAspect_Oriented_Model_Goalmodel();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.Goal_ModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.Goal_ModelImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getGoal_Model()
		 * @generated
		 */
		EClass GOAL_MODEL = eINSTANCE.getGoal_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__NAME = eINSTANCE.getGoal_Model_Name();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ELEMENT = eINSTANCE.getGoal_Model_Element();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__RELATIONSHIP = eINSTANCE.getGoal_Model_Relationship();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__PROPERTY = eINSTANCE.getGoal_Model_Property();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.ElementImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.RelationshipImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getRelationship()
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
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.PropertyImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.IsFeatureImpl <em>Is Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.IsFeatureImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIsFeature()
		 * @generated
		 */
		EClass IS_FEATURE = eINSTANCE.getIsFeature();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_FEATURE__LABEL = eINSTANCE.getIsFeature_Label();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.CardinalityImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__SOURCE = eINSTANCE.getCardinality_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__TARGET = eINSTANCE.getCardinality_Target();

		/**
		 * The meta object literal for the '<em><b>Cardinality Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__CARDINALITY_MIN = eINSTANCE.getCardinality_CardinalityMin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__CARDINALITY_MAX = eINSTANCE.getCardinality_CardinalityMax();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.GroupFeatureImpl <em>Group Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.GroupFeatureImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getGroupFeature()
		 * @generated
		 */
		EClass GROUP_FEATURE = eINSTANCE.getGroupFeature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_FEATURE__SOURCE = eINSTANCE.getGroupFeature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_FEATURE__TARGET = eINSTANCE.getGroupFeature_Target();

		/**
		 * The meta object literal for the '<em><b>Cardinality Group Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_FEATURE__CARDINALITY_GROUP_MIN = eINSTANCE.getGroupFeature_CardinalityGroupMin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Group Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_FEATURE__CARDINALITY_GROUP_MAX = eINSTANCE.getGroupFeature_CardinalityGroupMax();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.Generic_PropertyImpl <em>Generic Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.Generic_PropertyImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getGeneric_Property()
		 * @generated
		 */
		EClass GENERIC_PROPERTY = eINSTANCE.getGeneric_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PROPERTY__NAME = eINSTANCE.getGeneric_Property_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PROPERTY__VALUE = eINSTANCE.getGeneric_Property_Value();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.ContributionImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__LABEL = eINSTANCE.getContribution_Label();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.CorrelationImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__LABEL = eINSTANCE.getCorrelation_Label();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.CrosscuttingImpl <em>Crosscutting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.CrosscuttingImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCrosscutting()
		 * @generated
		 */
		EClass CROSSCUTTING = eINSTANCE.getCrosscutting();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING__ADVICE = eINSTANCE.getCrosscutting_Advice();

		/**
		 * The meta object literal for the '<em><b>Intertype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING__INTERTYPE = eINSTANCE.getCrosscutting_Intertype();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING__POINTCUT = eINSTANCE.getCrosscutting_Pointcut();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.PointcutImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__NAME = eINSTANCE.getPointcut_Name();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__OPERAND = eINSTANCE.getPointcut_Operand();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.OperandImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND__PRIMITIVE = eINSTANCE.getOperand_Primitive();

		/**
		 * The meta object literal for the '<em><b>Joinpoint Pointcut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__JOINPOINT_POINTCUT = eINSTANCE.getOperand_JoinpointPointcut();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__OPERATOR = eINSTANCE.getOperand_Operator();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.OperatorImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__OPERATOR = eINSTANCE.getOperator_Operator();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.AdviceImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__TYPE = eINSTANCE.getAdvice_Type();

		/**
		 * The meta object literal for the '<em><b>Joinpoint Advice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__JOINPOINT_ADVICE = eINSTANCE.getAdvice_JoinpointAdvice();

		/**
		 * The meta object literal for the '<em><b>Id Pointcut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__ID_POINTCUT = eINSTANCE.getAdvice_IdPointcut();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.IntertypeDeclarationImpl <em>Intertype Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.IntertypeDeclarationImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIntertypeDeclaration()
		 * @generated
		 */
		EClass INTERTYPE_DECLARATION = eINSTANCE.getIntertypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERTYPE_DECLARATION__TYPE = eINSTANCE.getIntertypeDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>New Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERTYPE_DECLARATION__NEW_ELEMENT = eINSTANCE.getIntertypeDeclaration_NewElement();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERTYPE_DECLARATION__NEW_ATTRIBUTE = eINSTANCE.getIntertypeDeclaration_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Id Pointcut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERTYPE_DECLARATION__ID_POINTCUT = eINSTANCE.getIntertypeDeclaration_IdPointcut();

		/**
		 * The meta object literal for the '{@link plaovgraph.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.impl.AttributeImpl
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link plaovgraph.DecompositionCategory <em>Decomposition Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.DecompositionCategory
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getDecompositionCategory()
		 * @generated
		 */
		EEnum DECOMPOSITION_CATEGORY = eINSTANCE.getDecompositionCategory();

		/**
		 * The meta object literal for the '{@link plaovgraph.IsFeatureTypes <em>Is Feature Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.IsFeatureTypes
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIsFeatureTypes()
		 * @generated
		 */
		EEnum IS_FEATURE_TYPES = eINSTANCE.getIsFeatureTypes();

		/**
		 * The meta object literal for the '{@link plaovgraph.CorrelationCategory <em>Correlation Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.CorrelationCategory
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getCorrelationCategory()
		 * @generated
		 */
		EEnum CORRELATION_CATEGORY = eINSTANCE.getCorrelationCategory();

		/**
		 * The meta object literal for the '{@link plaovgraph.AdviceCategory <em>Advice Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.AdviceCategory
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getAdviceCategory()
		 * @generated
		 */
		EEnum ADVICE_CATEGORY = eINSTANCE.getAdviceCategory();

		/**
		 * The meta object literal for the '{@link plaovgraph.IntertypeCategory <em>Intertype Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.IntertypeCategory
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getIntertypeCategory()
		 * @generated
		 */
		EEnum INTERTYPE_CATEGORY = eINSTANCE.getIntertypeCategory();

		/**
		 * The meta object literal for the '{@link plaovgraph.PrimitiveTypes <em>Primitive Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.PrimitiveTypes
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getPrimitiveTypes()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link plaovgraph.OperatorTypes <em>Operator Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.OperatorTypes
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getOperatorTypes()
		 * @generated
		 */
		EEnum OPERATOR_TYPES = eINSTANCE.getOperatorTypes();

		/**
		 * The meta object literal for the '{@link plaovgraph.ElementTypes <em>Element Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plaovgraph.ElementTypes
		 * @see plaovgraph.impl.PlaovgraphPackageImpl#getElementTypes()
		 * @generated
		 */
		EEnum ELEMENT_TYPES = eINSTANCE.getElementTypes();

	}

} //PlaovgraphPackage
