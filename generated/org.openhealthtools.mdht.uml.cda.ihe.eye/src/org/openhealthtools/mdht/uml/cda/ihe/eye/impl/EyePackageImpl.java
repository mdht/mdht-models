/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyeFactory;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;

import org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.RoutineEyeExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EyePackageImpl extends EPackageImpl implements EyePackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ocularListOfSurgeriesSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ocularCodedListOfSurgeriesSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ocularHistorySectionEClass = null;
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ophthalmicMedicationsSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass routineEyeExamSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ocularPhysicalExamSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalEyeEvaluationEClass = null;
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
     * @see org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EyePackageImpl()
    {
        super(eNS_URI, EyeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link EyePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EyePackage init()
    {
        if (isInited) return (EyePackage)EPackage.Registry.INSTANCE.getEPackage(EyePackage.eNS_URI);

        // Obtain or create and register package
        EyePackageImpl theEyePackage = (EyePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EyePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EyePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IHEPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theEyePackage.createPackageContents();

        // Initialize created meta-data
        theEyePackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theEyePackage, 
             new EValidator.Descriptor() {
                 @Override
				public EValidator getEValidator() {
                     return EyeValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theEyePackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.ihe.eye", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theEyePackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(EyePackage.eNS_URI, theEyePackage);
        return theEyePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getOcularListOfSurgeriesSection() {
        return ocularListOfSurgeriesSectionEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getOcularCodedListOfSurgeriesSection() {
        return ocularCodedListOfSurgeriesSectionEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getOcularHistorySection() {
        return ocularHistorySectionEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getOphthalmicMedicationsSection() {
        return ophthalmicMedicationsSectionEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getRoutineEyeExamSection() {
        return routineEyeExamSectionEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getOcularPhysicalExamSection() {
        return ocularPhysicalExamSectionEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getGeneralEyeEvaluation() {
        return generalEyeEvaluationEClass;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EyeFactory getEyeFactory()
    {
        return (EyeFactory)getEFactoryInstance();
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
    public void createPackageContents()
    {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        ocularListOfSurgeriesSectionEClass = createEClass(OCULAR_LIST_OF_SURGERIES_SECTION);

        ocularCodedListOfSurgeriesSectionEClass = createEClass(OCULAR_CODED_LIST_OF_SURGERIES_SECTION);

        ocularHistorySectionEClass = createEClass(OCULAR_HISTORY_SECTION);

        ophthalmicMedicationsSectionEClass = createEClass(OPHTHALMIC_MEDICATIONS_SECTION);

        routineEyeExamSectionEClass = createEClass(ROUTINE_EYE_EXAM_SECTION);

        ocularPhysicalExamSectionEClass = createEClass(OCULAR_PHYSICAL_EXAM_SECTION);

        generalEyeEvaluationEClass = createEClass(GENERAL_EYE_EVALUATION);
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
    public void initializePackageContents()
    {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        IHEPackage theIHEPackage = (IHEPackage)EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI);
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
        CDTPackage theCDTPackage = (CDTPackage)EPackage.Registry.INSTANCE.getEPackage(CDTPackage.eNS_URI);
        CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        ocularListOfSurgeriesSectionEClass.getESuperTypes().add(theIHEPackage.getSurgeriesSection());
        ocularCodedListOfSurgeriesSectionEClass.getESuperTypes().add(theIHEPackage.getCodedSurgeriesSection());
        ocularHistorySectionEClass.getESuperTypes().add(theIHEPackage.getHistoryOfPastIllnessSection());
        ophthalmicMedicationsSectionEClass.getESuperTypes().add(theIHEPackage.getMedicationsSection());
        routineEyeExamSectionEClass.getESuperTypes().add(theIHEPackage.getEyesSection());
        ocularPhysicalExamSectionEClass.getESuperTypes().add(theIHEPackage.getPhysicalExamSection());
        generalEyeEvaluationEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());

        // Initialize classes and features; add operations and parameters
        initEClass(ocularListOfSurgeriesSectionEClass, OcularListOfSurgeriesSection.class, "OcularListOfSurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(ocularListOfSurgeriesSectionEClass, ecorePackage.getEBoolean(), "validateOcularListOfSurgeriesSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ocularListOfSurgeriesSectionEClass, ecorePackage.getEBoolean(), "validateOcularListOfSurgeriesSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ocularListOfSurgeriesSectionEClass, ecorePackage.getEBoolean(), "validateOcularListOfSurgeriesSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(ocularCodedListOfSurgeriesSectionEClass, OcularCodedListOfSurgeriesSection.class, "OcularCodedListOfSurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(ocularCodedListOfSurgeriesSectionEClass, ecorePackage.getEBoolean(), "validateOcularCodedListOfSurgeriesSectionProcedureEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ocularCodedListOfSurgeriesSectionEClass, ecorePackage.getEBoolean(), "validateOcularCodedListOfSurgeriesSectionExternalReference", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(ocularCodedListOfSurgeriesSectionEClass, theIHEPackage.getProcedureEntry(), "getProcedureEntry", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(ocularCodedListOfSurgeriesSectionEClass, theIHEPackage.getExternalReference(), "getEyeExternalReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(ocularHistorySectionEClass, OcularHistorySection.class, "OcularHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(ocularHistorySectionEClass, ecorePackage.getEBoolean(), "validateOcularHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ocularHistorySectionEClass, ecorePackage.getEBoolean(), "validateOcularHistorySectionOcularListOfSurgeriesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ocularHistorySectionEClass, ecorePackage.getEBoolean(), "validateOcularHistorySectionOcularCodedListOfSurgeriesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(ocularHistorySectionEClass, this.getOcularListOfSurgeriesSection(), "getOcularListOfSurgeriesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(ocularHistorySectionEClass, this.getOcularCodedListOfSurgeriesSection(), "getOcularCodedListOfSurgeriesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(ophthalmicMedicationsSectionEClass, OphthalmicMedicationsSection.class, "OphthalmicMedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(ophthalmicMedicationsSectionEClass, ecorePackage.getEBoolean(), "validateOphthalmicMedicationsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ophthalmicMedicationsSectionEClass, ecorePackage.getEBoolean(), "validateOphthalmicMedicationsSectionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(ophthalmicMedicationsSectionEClass, theIHEPackage.getMedication(), "getEyeMedication", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(routineEyeExamSectionEClass, RoutineEyeExamSection.class, "RoutineEyeExamSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ocularPhysicalExamSectionEClass, OcularPhysicalExamSection.class, "OcularPhysicalExamSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(ocularPhysicalExamSectionEClass, ecorePackage.getEBoolean(), "validateOcularPhysicalExamSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(ocularPhysicalExamSectionEClass, ecorePackage.getEBoolean(), "validateOcularPhysicalExamSectionRoutineEyeExamSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(ocularPhysicalExamSectionEClass, this.getRoutineEyeExamSection(), "getRoutineEyeExamSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(generalEyeEvaluationEClass, GeneralEyeEvaluation.class, "GeneralEyeEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationChiefComplaintSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationOcularHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationHistoryOfPastIllnessSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationSurgeriesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationCodedSurgeriesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationOphthalmicMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationAllergiesReactionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationActiveProblemsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationFamilyMedicalHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationOcularPhysicalExamSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationAssessmentAndPlanSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationHistoryOfPresentIllness", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationReviewOfSystemsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationCodedSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationFunctionalStatusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalEyeEvaluationEClass, ecorePackage.getEBoolean(), "validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, this.getOcularHistorySection(), "getOcularHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getHistoryOfPastIllnessSection(), "getHistoryOfPastIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getSurgeriesSection(), "getSurgeriesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getCodedSurgeriesSection(), "getCodedSurgeriesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, this.getOphthalmicMedicationsSection(), "getOphthalmicMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getAllergiesReactionsSection(), "getAllergiesReactionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getActiveProblemsSection(), "getActiveProblemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getFamilyMedicalHistorySection(), "getFamilyMedicalHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, this.getOcularPhysicalExamSection(), "getOcularPhysicalExamSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theCDTPackage.getHistoryOfPresentIllness(), "getHistoryOfPresentIllness", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getReviewOfSystemsSection(), "getReviewOfSystemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getCodedSocialHistorySection(), "getCodedSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theCCDPackage.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(generalEyeEvaluationEClass, theIHEPackage.getCodedFamilyMedicalHistorySection(), "getCodedFamilyMedicalHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.openhealthtools.org/mdht/uml
        createUmlAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation
        createAnnotationAnnotations();
        // duplicates
        createDuplicatesAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createUmlAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.openhealthtools.mdht.uml.cda.ihe.eye"
           });                                                                                                                                     
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createAnnotationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (ocularListOfSurgeriesSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SurgeriesSectionTemplateId OcularListOfSurgeriesSectionCode OcularListOfSurgeriesSectionCodeP OcularListOfSurgeriesSectionText",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.2.1",
             "code.code", "47519-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "History of procedures",
             "constraints.validation.dependOn.OcularListOfSurgeriesSectionCode", "OcularListOfSurgeriesSectionCodeP"
           });               
        addAnnotation
          (ocularCodedListOfSurgeriesSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "CodedSurgeriesSectionTemplateId OcularCodedListOfSurgeriesSectionProcedureEntry",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.2.2",
             "constraints.validation.warning", "OcularCodedListOfSurgeriesSectionExternalReference"
           });              
        addAnnotation
          (ocularHistorySectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HistoryOfPastIllnessSectionTemplateId OcularHistorySectionCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.2.3",
             "code.code", "70934-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Ocular history",
             "constraints.validation.warning", "OcularHistorySectionOcularListOfSurgeriesSection",
             "constraints.validation.info", "OcularHistorySectionOcularCodedListOfSurgeriesSection"
           });                 
        addAnnotation
          (ophthalmicMedicationsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "IHEMedicationsSectionTemplateId OphthalmicMedicationsSectionCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.2.4",
             "code.code", "70935-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Ophthalmic medications",
             "constraints.validation.warning", "OphthalmicMedicationsSectionMedication"
           });             
        addAnnotation
          (routineEyeExamSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "EyesSectionTemplateId",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.2.6"
           });      
        addAnnotation
          (ocularPhysicalExamSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PhysicalExamSectionTemplateId OcularPhysicalExamSectionCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.2.5",
             "code.code", "70948-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Ocular physical exam",
             "constraints.validation.warning", "OcularPhysicalExamSectionRoutineEyeExamSection"
           });             
        addAnnotation
          (generalEyeEvaluationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "GeneralEyeEvaluationTemplateId GeneralEyeEvaluationCode GeneralEyeEvaluationChiefComplaintSection GeneralEyeEvaluationOcularPhysicalExamSection",
             "templateId.root", "1.3.6.1.4.1.19376.1.12.1.1.1",
             "code.code", "70947-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "General eye evaluation",
             "constraints.validation.warning", "GeneralEyeEvaluationOcularHistorySection GeneralEyeEvaluationHistoryOfPastIllnessSection GeneralEyeEvaluationSurgeriesSection GeneralEyeEvaluationMedicationsSection GeneralEyeEvaluationOphthalmicMedicationsSection GeneralEyeEvaluationAllergiesReactionsSection GeneralEyeEvaluationActiveProblemsSection GeneralEyeEvaluationFamilyMedicalHistorySection GeneralEyeEvaluationSocialHistorySection GeneralEyeEvaluationAssessmentAndPlanSection GeneralEyeEvaluationHistoryOfPresentIllness GeneralEyeEvaluationReviewOfSystemsSection GeneralEyeEvaluationFunctionalStatusSection GeneralEyeEvaluationCodedFamilyMedicalHistorySection",
             "constraints.validation.info", "GeneralEyeEvaluationCodedSurgeriesSection GeneralEyeEvaluationCodedSocialHistorySection"
           });                                                                              
    }

    /**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createDuplicatesAnnotations()
    {
        String source = "duplicates";       
        addAnnotation
          (ocularListOfSurgeriesSectionEClass, 
           source, 
           new String[] {
           });               
        addAnnotation
          (ocularCodedListOfSurgeriesSectionEClass, 
           source, 
           new String[] {
           });              
        addAnnotation
          (ocularHistorySectionEClass, 
           source, 
           new String[] {
           });                 
        addAnnotation
          (ophthalmicMedicationsSectionEClass, 
           source, 
           new String[] {
           });             
        addAnnotation
          (routineEyeExamSectionEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (ocularPhysicalExamSectionEClass, 
           source, 
           new String[] {
           });                                                                                      
    }

} //EyePackageImpl
