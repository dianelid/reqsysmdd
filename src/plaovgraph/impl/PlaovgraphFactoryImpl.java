/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import plaovgraph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaovgraphFactoryImpl extends EFactoryImpl implements PlaovgraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlaovgraphFactory init() {
		try {
			PlaovgraphFactory thePlaovgraphFactory = (PlaovgraphFactory)EPackage.Registry.INSTANCE.getEFactory("http://plaovgraph/1.0"); 
			if (thePlaovgraphFactory != null) {
				return thePlaovgraphFactory;
			}
		}
		catch (Exception exception) {
			//EcorePlugin.INSTANCE.log(exception);
		}
		return new PlaovgraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaovgraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlaovgraphPackage.ASPECT_ORIENTED_MODEL: return createAspect_Oriented_Model();
			case PlaovgraphPackage.GOAL_MODEL: return createGoal_Model();
			case PlaovgraphPackage.ELEMENT: return createElement();
			case PlaovgraphPackage.IS_FEATURE: return createIsFeature();
			case PlaovgraphPackage.CARDINALITY: return createCardinality();
			case PlaovgraphPackage.GROUP_FEATURE: return createGroupFeature();
			case PlaovgraphPackage.GENERIC_PROPERTY: return createGeneric_Property();
			case PlaovgraphPackage.CONTRIBUTION: return createContribution();
			case PlaovgraphPackage.CORRELATION: return createCorrelation();
			case PlaovgraphPackage.CROSSCUTTING: return createCrosscutting();
			case PlaovgraphPackage.POINTCUT: return createPointcut();
			case PlaovgraphPackage.OPERAND: return createOperand();
			case PlaovgraphPackage.OPERATOR: return createOperator();
			case PlaovgraphPackage.ADVICE: return createAdvice();
			case PlaovgraphPackage.INTERTYPE_DECLARATION: return createIntertypeDeclaration();
			case PlaovgraphPackage.ATTRIBUTE: return createAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlaovgraphPackage.DECOMPOSITION_CATEGORY:
				return createDecompositionCategoryFromString(eDataType, initialValue);
			case PlaovgraphPackage.IS_FEATURE_TYPES:
				return createIsFeatureTypesFromString(eDataType, initialValue);
			case PlaovgraphPackage.CORRELATION_CATEGORY:
				return createCorrelationCategoryFromString(eDataType, initialValue);
			case PlaovgraphPackage.ADVICE_CATEGORY:
				return createAdviceCategoryFromString(eDataType, initialValue);
			case PlaovgraphPackage.INTERTYPE_CATEGORY:
				return createIntertypeCategoryFromString(eDataType, initialValue);
			case PlaovgraphPackage.PRIMITIVE_TYPES:
				return createPrimitiveTypesFromString(eDataType, initialValue);
			case PlaovgraphPackage.OPERATOR_TYPES:
				return createOperatorTypesFromString(eDataType, initialValue);
			case PlaovgraphPackage.ELEMENT_TYPES:
				return createElementTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlaovgraphPackage.DECOMPOSITION_CATEGORY:
				return convertDecompositionCategoryToString(eDataType, instanceValue);
			case PlaovgraphPackage.IS_FEATURE_TYPES:
				return convertIsFeatureTypesToString(eDataType, instanceValue);
			case PlaovgraphPackage.CORRELATION_CATEGORY:
				return convertCorrelationCategoryToString(eDataType, instanceValue);
			case PlaovgraphPackage.ADVICE_CATEGORY:
				return convertAdviceCategoryToString(eDataType, instanceValue);
			case PlaovgraphPackage.INTERTYPE_CATEGORY:
				return convertIntertypeCategoryToString(eDataType, instanceValue);
			case PlaovgraphPackage.PRIMITIVE_TYPES:
				return convertPrimitiveTypesToString(eDataType, instanceValue);
			case PlaovgraphPackage.OPERATOR_TYPES:
				return convertOperatorTypesToString(eDataType, instanceValue);
			case PlaovgraphPackage.ELEMENT_TYPES:
				return convertElementTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect_Oriented_Model createAspect_Oriented_Model() {
		Aspect_Oriented_ModelImpl aspect_Oriented_Model = new Aspect_Oriented_ModelImpl();
		return aspect_Oriented_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Model createGoal_Model() {
		Goal_ModelImpl goal_Model = new Goal_ModelImpl();
		return goal_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsFeature createIsFeature() {
		IsFeatureImpl isFeature = new IsFeatureImpl();
		return isFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupFeature createGroupFeature() {
		GroupFeatureImpl groupFeature = new GroupFeatureImpl();
		return groupFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generic_Property createGeneric_Property() {
		Generic_PropertyImpl generic_Property = new Generic_PropertyImpl();
		return generic_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crosscutting createCrosscutting() {
		CrosscuttingImpl crosscutting = new CrosscuttingImpl();
		return crosscutting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcut createPointcut() {
		PointcutImpl pointcut = new PointcutImpl();
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand createOperand() {
		OperandImpl operand = new OperandImpl();
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntertypeDeclaration createIntertypeDeclaration() {
		IntertypeDeclarationImpl intertypeDeclaration = new IntertypeDeclarationImpl();
		return intertypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionCategory createDecompositionCategoryFromString(EDataType eDataType, String initialValue) {
		DecompositionCategory result = DecompositionCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecompositionCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsFeatureTypes createIsFeatureTypesFromString(EDataType eDataType, String initialValue) {
		IsFeatureTypes result = IsFeatureTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsFeatureTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationCategory createCorrelationCategoryFromString(EDataType eDataType, String initialValue) {
		CorrelationCategory result = CorrelationCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrelationCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceCategory createAdviceCategoryFromString(EDataType eDataType, String initialValue) {
		AdviceCategory result = AdviceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdviceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntertypeCategory createIntertypeCategoryFromString(EDataType eDataType, String initialValue) {
		IntertypeCategory result = IntertypeCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntertypeCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes createPrimitiveTypesFromString(EDataType eDataType, String initialValue) {
		PrimitiveTypes result = PrimitiveTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorTypes createOperatorTypesFromString(EDataType eDataType, String initialValue) {
		OperatorTypes result = OperatorTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypes createElementTypesFromString(EDataType eDataType, String initialValue) {
		ElementTypes result = ElementTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaovgraphPackage getPlaovgraphPackage() {
		return (PlaovgraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlaovgraphPackage getPackage() {
		return PlaovgraphPackage.eINSTANCE;
	}

} //PlaovgraphFactoryImpl
