/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import plaovgraph.Advice;
import plaovgraph.AdviceCategory;
import plaovgraph.Aspect_Oriented_Model;
import plaovgraph.Attribute;
import plaovgraph.Cardinality;
import plaovgraph.Contribution;
import plaovgraph.Correlation;
import plaovgraph.CorrelationCategory;
import plaovgraph.Crosscutting;
import plaovgraph.DecompositionCategory;
import plaovgraph.Element;
import plaovgraph.ElementTypes;
import plaovgraph.Generic_Property;
import plaovgraph.Goal_Model;
import plaovgraph.GroupFeature;
import plaovgraph.IntertypeCategory;
import plaovgraph.IntertypeDeclaration;
import plaovgraph.IsFeature;
import plaovgraph.IsFeatureTypes;
import plaovgraph.Operand;
import plaovgraph.Operator;
import plaovgraph.OperatorTypes;
import plaovgraph.PlaovgraphFactory;
import plaovgraph.PlaovgraphPackage;
import plaovgraph.Pointcut;
import plaovgraph.PrimitiveTypes;
import plaovgraph.Property;
import plaovgraph.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaovgraphPackageImpl extends EPackageImpl implements PlaovgraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspect_Oriented_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generic_PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crosscuttingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intertypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decompositionCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isFeatureTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum correlationCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adviceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intertypeCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see plaovgraph.PlaovgraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlaovgraphPackageImpl() {
		super(eNS_URI, PlaovgraphFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PlaovgraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlaovgraphPackage init() {
		if (isInited) return (PlaovgraphPackage)EPackage.Registry.INSTANCE.getEPackage(PlaovgraphPackage.eNS_URI);

		// Obtain or create and register package
		PlaovgraphPackageImpl thePlaovgraphPackage = (PlaovgraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlaovgraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlaovgraphPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePlaovgraphPackage.createPackageContents();

		// Initialize created meta-data
		thePlaovgraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlaovgraphPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlaovgraphPackage.eNS_URI, thePlaovgraphPackage);
		return thePlaovgraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect_Oriented_Model() {
		return aspect_Oriented_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Oriented_Model_Goalmodel() {
		return (EReference)aspect_Oriented_ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal_Model() {
		return goal_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Model_Name() {
		return (EAttribute)goal_ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Model_Element() {
		return (EReference)goal_ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Model_Relationship() {
		return (EReference)goal_ModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Model_Property() {
		return (EReference)goal_ModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Type() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsFeature() {
		return isFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsFeature_Label() {
		return (EAttribute)isFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinality_Source() {
		return (EReference)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinality_Target() {
		return (EReference)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_CardinalityMin() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_CardinalityMax() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupFeature() {
		return groupFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupFeature_Source() {
		return (EReference)groupFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupFeature_Target() {
		return (EReference)groupFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupFeature_CardinalityGroupMin() {
		return (EAttribute)groupFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupFeature_CardinalityGroupMax() {
		return (EAttribute)groupFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneric_Property() {
		return generic_PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneric_Property_Name() {
		return (EAttribute)generic_PropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneric_Property_Value() {
		return (EAttribute)generic_PropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Label() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelation() {
		return correlationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Label() {
		return (EAttribute)correlationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrosscutting() {
		return crosscuttingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrosscutting_Advice() {
		return (EReference)crosscuttingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrosscutting_Intertype() {
		return (EReference)crosscuttingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrosscutting_Pointcut() {
		return (EReference)crosscuttingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointcut() {
		return pointcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointcut_Name() {
		return (EAttribute)pointcutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcut_Operand() {
		return (EReference)pointcutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperand_Primitive() {
		return (EAttribute)operandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperand_JoinpointPointcut() {
		return (EReference)operandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperand_Operator() {
		return (EReference)operandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperator_Operator() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvice() {
		return adviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvice_Type() {
		return (EAttribute)adviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvice_JoinpointAdvice() {
		return (EReference)adviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvice_IdPointcut() {
		return (EReference)adviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntertypeDeclaration() {
		return intertypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntertypeDeclaration_Type() {
		return (EAttribute)intertypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntertypeDeclaration_NewElement() {
		return (EReference)intertypeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntertypeDeclaration_NewAttribute() {
		return (EReference)intertypeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntertypeDeclaration_IdPointcut() {
		return (EReference)intertypeDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecompositionCategory() {
		return decompositionCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsFeatureTypes() {
		return isFeatureTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCorrelationCategory() {
		return correlationCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdviceCategory() {
		return adviceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntertypeCategory() {
		return intertypeCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveTypes() {
		return primitiveTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorTypes() {
		return operatorTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementTypes() {
		return elementTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaovgraphFactory getPlaovgraphFactory() {
		return (PlaovgraphFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aspect_Oriented_ModelEClass = createEClass(ASPECT_ORIENTED_MODEL);
		createEReference(aspect_Oriented_ModelEClass, ASPECT_ORIENTED_MODEL__GOALMODEL);

		goal_ModelEClass = createEClass(GOAL_MODEL);
		createEAttribute(goal_ModelEClass, GOAL_MODEL__NAME);
		createEReference(goal_ModelEClass, GOAL_MODEL__ELEMENT);
		createEReference(goal_ModelEClass, GOAL_MODEL__RELATIONSHIP);
		createEReference(goal_ModelEClass, GOAL_MODEL__PROPERTY);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__TYPE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		propertyEClass = createEClass(PROPERTY);

		isFeatureEClass = createEClass(IS_FEATURE);
		createEAttribute(isFeatureEClass, IS_FEATURE__LABEL);

		cardinalityEClass = createEClass(CARDINALITY);
		createEReference(cardinalityEClass, CARDINALITY__SOURCE);
		createEReference(cardinalityEClass, CARDINALITY__TARGET);
		createEAttribute(cardinalityEClass, CARDINALITY__CARDINALITY_MIN);
		createEAttribute(cardinalityEClass, CARDINALITY__CARDINALITY_MAX);

		groupFeatureEClass = createEClass(GROUP_FEATURE);
		createEReference(groupFeatureEClass, GROUP_FEATURE__SOURCE);
		createEReference(groupFeatureEClass, GROUP_FEATURE__TARGET);
		createEAttribute(groupFeatureEClass, GROUP_FEATURE__CARDINALITY_GROUP_MIN);
		createEAttribute(groupFeatureEClass, GROUP_FEATURE__CARDINALITY_GROUP_MAX);

		generic_PropertyEClass = createEClass(GENERIC_PROPERTY);
		createEAttribute(generic_PropertyEClass, GENERIC_PROPERTY__NAME);
		createEAttribute(generic_PropertyEClass, GENERIC_PROPERTY__VALUE);

		contributionEClass = createEClass(CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__LABEL);

		correlationEClass = createEClass(CORRELATION);
		createEAttribute(correlationEClass, CORRELATION__LABEL);

		crosscuttingEClass = createEClass(CROSSCUTTING);
		createEReference(crosscuttingEClass, CROSSCUTTING__POINTCUT);
		createEReference(crosscuttingEClass, CROSSCUTTING__ADVICE);
		createEReference(crosscuttingEClass, CROSSCUTTING__INTERTYPE);

		pointcutEClass = createEClass(POINTCUT);
		createEAttribute(pointcutEClass, POINTCUT__NAME);
		createEReference(pointcutEClass, POINTCUT__OPERAND);

		operandEClass = createEClass(OPERAND);
		createEAttribute(operandEClass, OPERAND__PRIMITIVE);
		createEReference(operandEClass, OPERAND__JOINPOINT_POINTCUT);
		createEReference(operandEClass, OPERAND__OPERATOR);

		operatorEClass = createEClass(OPERATOR);
		createEAttribute(operatorEClass, OPERATOR__OPERATOR);

		adviceEClass = createEClass(ADVICE);
		createEAttribute(adviceEClass, ADVICE__TYPE);
		createEReference(adviceEClass, ADVICE__JOINPOINT_ADVICE);
		createEReference(adviceEClass, ADVICE__ID_POINTCUT);

		intertypeDeclarationEClass = createEClass(INTERTYPE_DECLARATION);
		createEAttribute(intertypeDeclarationEClass, INTERTYPE_DECLARATION__TYPE);
		createEReference(intertypeDeclarationEClass, INTERTYPE_DECLARATION__NEW_ELEMENT);
		createEReference(intertypeDeclarationEClass, INTERTYPE_DECLARATION__NEW_ATTRIBUTE);
		createEReference(intertypeDeclarationEClass, INTERTYPE_DECLARATION__ID_POINTCUT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		// Create enums
		decompositionCategoryEEnum = createEEnum(DECOMPOSITION_CATEGORY);
		isFeatureTypesEEnum = createEEnum(IS_FEATURE_TYPES);
		correlationCategoryEEnum = createEEnum(CORRELATION_CATEGORY);
		adviceCategoryEEnum = createEEnum(ADVICE_CATEGORY);
		intertypeCategoryEEnum = createEEnum(INTERTYPE_CATEGORY);
		primitiveTypesEEnum = createEEnum(PRIMITIVE_TYPES);
		operatorTypesEEnum = createEEnum(OPERATOR_TYPES);
		elementTypesEEnum = createEEnum(ELEMENT_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(this.getGoal_Model());
		isFeatureEClass.getESuperTypes().add(this.getProperty());
		cardinalityEClass.getESuperTypes().add(this.getProperty());
		groupFeatureEClass.getESuperTypes().add(this.getProperty());
		generic_PropertyEClass.getESuperTypes().add(this.getProperty());
		contributionEClass.getESuperTypes().add(this.getRelationship());
		correlationEClass.getESuperTypes().add(this.getRelationship());
		crosscuttingEClass.getESuperTypes().add(this.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(aspect_Oriented_ModelEClass, Aspect_Oriented_Model.class, "Aspect_Oriented_Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_Oriented_Model_Goalmodel(), this.getGoal_Model(), null, "goalmodel", null, 1, -1, Aspect_Oriented_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goal_ModelEClass, Goal_Model.class, "Goal_Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Model_Name(), ecorePackage.getEString(), "name", null, 1, 1, Goal_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Model_Element(), this.getElement(), null, "element", null, 0, -1, Goal_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Model_Relationship(), this.getRelationship(), null, "relationship", null, 0, -1, Goal_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Model_Property(), this.getProperty(), null, "property", null, 0, -1, Goal_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Type(), this.getElementTypes(), "type", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Source(), this.getGoal_Model(), null, "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getGoal_Model(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isFeatureEClass, IsFeature.class, "IsFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsFeature_Label(), this.getIsFeatureTypes(), "label", null, 1, 1, IsFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinality_Source(), this.getElement(), null, "source", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardinality_Target(), this.getGoal_Model(), null, "target", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_CardinalityMin(), ecorePackage.getEString(), "cardinalityMin", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_CardinalityMax(), ecorePackage.getEString(), "cardinalityMax", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupFeatureEClass, GroupFeature.class, "GroupFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupFeature_Source(), this.getElement(), null, "source", null, 1, -1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupFeature_Target(), this.getGoal_Model(), null, "target", null, 0, 1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupFeature_CardinalityGroupMin(), ecorePackage.getEString(), "cardinalityGroupMin", null, 1, 1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupFeature_CardinalityGroupMax(), ecorePackage.getEString(), "cardinalityGroupMax", null, 1, 1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generic_PropertyEClass, Generic_Property.class, "Generic_Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneric_Property_Name(), ecorePackage.getEString(), "name", null, 1, 1, Generic_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneric_Property_Value(), ecorePackage.getEString(), "value", null, 1, 1, Generic_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContribution_Label(), this.getDecompositionCategory(), "label", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correlationEClass, Correlation.class, "Correlation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrelation_Label(), this.getCorrelationCategory(), "label", null, 1, 1, Correlation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crosscuttingEClass, Crosscutting.class, "Crosscutting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrosscutting_Pointcut(), this.getPointcut(), null, "pointcut", null, 1, -1, Crosscutting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCrosscutting_Pointcut().getEKeys().add(this.getPointcut_Name());
		initEReference(getCrosscutting_Advice(), this.getAdvice(), null, "advice", null, 0, -1, Crosscutting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrosscutting_Intertype(), this.getIntertypeDeclaration(), null, "intertype", null, 0, -1, Crosscutting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointcut_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointcut_Operand(), this.getOperand(), null, "operand", null, 1, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandEClass, Operand.class, "Operand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperand_Primitive(), this.getPrimitiveTypes(), "primitive", null, 1, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperand_JoinpointPointcut(), this.getElement(), null, "joinpointPointcut", null, 1, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperand_Operator(), this.getOperator(), null, "operator", null, 0, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperator_Operator(), this.getOperatorTypes(), "operator", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdvice_Type(), this.getAdviceCategory(), "type", null, 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvice_JoinpointAdvice(), this.getElement(), null, "joinpointAdvice", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvice_IdPointcut(), this.getPointcut(), null, "idPointcut", null, 1, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAdvice_IdPointcut().getEKeys().add(this.getPointcut_Name());

		initEClass(intertypeDeclarationEClass, IntertypeDeclaration.class, "IntertypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntertypeDeclaration_Type(), this.getIntertypeCategory(), "type", null, 1, 1, IntertypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntertypeDeclaration_NewElement(), this.getElement(), null, "newElement", null, 0, -1, IntertypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntertypeDeclaration_NewAttribute(), this.getAttribute(), null, "newAttribute", null, 0, -1, IntertypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntertypeDeclaration_IdPointcut(), this.getPointcut(), null, "idPointcut", null, 1, -1, IntertypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(decompositionCategoryEEnum, DecompositionCategory.class, "DecompositionCategory");
		addEEnumLiteral(decompositionCategoryEEnum, DecompositionCategory.AND);
		addEEnumLiteral(decompositionCategoryEEnum, DecompositionCategory.OR);
		addEEnumLiteral(decompositionCategoryEEnum, DecompositionCategory.XOR);
		addEEnumLiteral(decompositionCategoryEEnum, DecompositionCategory.INC_OR);

		initEEnum(isFeatureTypesEEnum, IsFeatureTypes.class, "IsFeatureTypes");
		addEEnumLiteral(isFeatureTypesEEnum, IsFeatureTypes.NO);
		addEEnumLiteral(isFeatureTypesEEnum, IsFeatureTypes.YES);

		initEEnum(correlationCategoryEEnum, CorrelationCategory.class, "CorrelationCategory");
		addEEnumLiteral(correlationCategoryEEnum, CorrelationCategory.MAKE);
		addEEnumLiteral(correlationCategoryEEnum, CorrelationCategory.BREAK);
		addEEnumLiteral(correlationCategoryEEnum, CorrelationCategory.HELP);
		addEEnumLiteral(correlationCategoryEEnum, CorrelationCategory.HURT);
		addEEnumLiteral(correlationCategoryEEnum, CorrelationCategory.UNKNOWN);

		initEEnum(adviceCategoryEEnum, AdviceCategory.class, "AdviceCategory");
		addEEnumLiteral(adviceCategoryEEnum, AdviceCategory.AROUND);
		addEEnumLiteral(adviceCategoryEEnum, AdviceCategory.BEFORE);
		addEEnumLiteral(adviceCategoryEEnum, AdviceCategory.AFTER);

		initEEnum(intertypeCategoryEEnum, IntertypeCategory.class, "IntertypeCategory");
		addEEnumLiteral(intertypeCategoryEEnum, IntertypeCategory.ELEMENT);
		addEEnumLiteral(intertypeCategoryEEnum, IntertypeCategory.ATTRIBUTE);

		initEEnum(primitiveTypesEEnum, PrimitiveTypes.class, "PrimitiveTypes");
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INCLUDE);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.SUBSTITUTE);

		initEEnum(operatorTypesEEnum, OperatorTypes.class, "OperatorTypes");
		addEEnumLiteral(operatorTypesEEnum, OperatorTypes.AND);
		addEEnumLiteral(operatorTypesEEnum, OperatorTypes.OR);
		addEEnumLiteral(operatorTypesEEnum, OperatorTypes.NOT);

		initEEnum(elementTypesEEnum, ElementTypes.class, "ElementTypes");
		addEEnumLiteral(elementTypesEEnum, ElementTypes.TASK);
		addEEnumLiteral(elementTypesEEnum, ElementTypes.GOAL);
		addEEnumLiteral(elementTypesEEnum, ElementTypes.SOFTGOAL);
		addEEnumLiteral(elementTypesEEnum, ElementTypes.TASK_REF);
		addEEnumLiteral(elementTypesEEnum, ElementTypes.GOAL_REF);
		addEEnumLiteral(elementTypesEEnum, ElementTypes.SOFTGOAL_REF);

		// Create resource
		createResource(eNS_URI);
	}

} //PlaovgraphPackageImpl
