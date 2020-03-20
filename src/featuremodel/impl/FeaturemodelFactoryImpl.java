/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package featuremodel.impl;

import featuremodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

//import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelFactoryImpl extends EFactoryImpl implements FeaturemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturemodelFactory init() {
		try {
			FeaturemodelFactory theFeaturemodelFactory = (FeaturemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://featuremodel/1.0"); 
			if (theFeaturemodelFactory != null) {
				return theFeaturemodelFactory;
			}
		}
		catch (Exception exception) {
			//EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelFactoryImpl() {
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
			case FeaturemodelPackage.FEATURE_MODEL: return createFeatureModel();
			case FeaturemodelPackage.FEATURE: return createFeature();
			case FeaturemodelPackage.ROOT_FEATURE: return createRootFeature();
			case FeaturemodelPackage.REFERENCE_FEATURE: return createReferenceFeature();
			case FeaturemodelPackage.GROUPED_FEATURE: return createGroupedFeature();
			case FeaturemodelPackage.GROUPED_REFERENCE: return createGroupedReference();
			case FeaturemodelPackage.MANDATORY: return createMandatory();
			case FeaturemodelPackage.OPTIONAL: return createOptional();
			case FeaturemodelPackage.ALTERNATIVE: return createAlternative();
			case FeaturemodelPackage.INCLUSIVE_OR: return createInclusive_Or();
			case FeaturemodelPackage.GROUP_CARDINALITY: return createGroupCardinality();
			case FeaturemodelPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel createFeatureModel() {
		FeatureModelImpl featureModel = new FeatureModelImpl();
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootFeature createRootFeature() {
		RootFeatureImpl rootFeature = new RootFeatureImpl();
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFeature createReferenceFeature() {
		ReferenceFeatureImpl referenceFeature = new ReferenceFeatureImpl();
		return referenceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedFeature createGroupedFeature() {
		GroupedFeatureImpl groupedFeature = new GroupedFeatureImpl();
		return groupedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedReference createGroupedReference() {
		GroupedReferenceImpl groupedReference = new GroupedReferenceImpl();
		return groupedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusive_Or createInclusive_Or() {
		Inclusive_OrImpl inclusive_Or = new Inclusive_OrImpl();
		return inclusive_Or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCardinality createGroupCardinality() {
		GroupCardinalityImpl groupCardinality = new GroupCardinalityImpl();
		return groupCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelPackage getFeaturemodelPackage() {
		return (FeaturemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturemodelPackage getPackage() {
		return FeaturemodelPackage.eINSTANCE;
	}

} //FeaturemodelFactoryImpl
