/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SalmonellosisPackageImpl extends EPackageImpl implements SalmonellosisPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisCaseReportEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisPHCRSocialHistorySectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisPossibleExposureLocationAndTypeActEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hivStatusObservationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisPHCRRelevantDxTestsSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisResultOrganizerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisResultObservationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisPHCRClinicalInformationSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisCaseObservationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salmonellosisSignsAndSymptomsObservationEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SalmonellosisPackageImpl()
    {
        super(eNS_URI, SalmonellosisFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SalmonellosisPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SalmonellosisPackage init()
    {
        if (isInited) return (SalmonellosisPackage)EPackage.Registry.INSTANCE.getEPackage(SalmonellosisPackage.eNS_URI);

        // Obtain or create and register package
        SalmonellosisPackageImpl theSalmonellosisPackage = (SalmonellosisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SalmonellosisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SalmonellosisPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PhcrPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSalmonellosisPackage.createPackageContents();

        // Initialize created meta-data
        theSalmonellosisPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSalmonellosisPackage, 
             new EValidator.Descriptor()
             {
                 public EValidator getEValidator()
                 {
                     return SalmonellosisValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theSalmonellosisPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.phcr.salmonellosis", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theSalmonellosisPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SalmonellosisPackage.eNS_URI, theSalmonellosisPackage);
        return theSalmonellosisPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisCaseReport()
    {
        return salmonellosisCaseReportEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisPHCRSocialHistorySection()
    {
        return salmonellosisPHCRSocialHistorySectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisPossibleExposureLocationAndTypeAct()
    {
        return salmonellosisPossibleExposureLocationAndTypeActEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHIVStatusObservation()
    {
        return hivStatusObservationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisPHCRRelevantDxTestsSection()
    {
        return salmonellosisPHCRRelevantDxTestsSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisResultOrganizer()
    {
        return salmonellosisResultOrganizerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisResultObservation()
    {
        return salmonellosisResultObservationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisPHCRClinicalInformationSection()
    {
        return salmonellosisPHCRClinicalInformationSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisCaseObservation()
    {
        return salmonellosisCaseObservationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalmonellosisSignsAndSymptomsObservation()
    {
        return salmonellosisSignsAndSymptomsObservationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SalmonellosisFactory getSalmonellosisFactory()
    {
        return (SalmonellosisFactory)getEFactoryInstance();
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
        salmonellosisCaseReportEClass = createEClass(SALMONELLOSIS_CASE_REPORT);

        salmonellosisPHCRSocialHistorySectionEClass = createEClass(SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION);

        salmonellosisPossibleExposureLocationAndTypeActEClass = createEClass(SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);

        hivStatusObservationEClass = createEClass(HIV_STATUS_OBSERVATION);

        salmonellosisPHCRRelevantDxTestsSectionEClass = createEClass(SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);

        salmonellosisResultOrganizerEClass = createEClass(SALMONELLOSIS_RESULT_ORGANIZER);

        salmonellosisResultObservationEClass = createEClass(SALMONELLOSIS_RESULT_OBSERVATION);

        salmonellosisPHCRClinicalInformationSectionEClass = createEClass(SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION);

        salmonellosisCaseObservationEClass = createEClass(SALMONELLOSIS_CASE_OBSERVATION);

        salmonellosisSignsAndSymptomsObservationEClass = createEClass(SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);
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
        PhcrPackage thePhcrPackage = (PhcrPackage)EPackage.Registry.INSTANCE.getEPackage(PhcrPackage.eNS_URI);
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        salmonellosisCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
        salmonellosisPHCRSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
        salmonellosisPossibleExposureLocationAndTypeActEClass.getESuperTypes().add(theCDAPackage.getAct());
        hivStatusObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        salmonellosisPHCRRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
        salmonellosisResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
        salmonellosisResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
        salmonellosisPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
        salmonellosisCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
        salmonellosisSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());

        // Initialize classes and features; add operations and parameters
        initEClass(salmonellosisCaseReportEClass, SalmonellosisCaseReport.class, "SalmonellosisCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(salmonellosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseReportSalmonellosisSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(salmonellosisCaseReportEClass, this.getSalmonellosisPHCRSocialHistorySection(), "getSalmonellosisSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(salmonellosisCaseReportEClass, this.getSalmonellosisPHCRRelevantDxTestsSection(), "getSalmonellosisRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(salmonellosisCaseReportEClass, this.getSalmonellosisPHCRClinicalInformationSection(), "getSalmonellosisPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(salmonellosisPHCRSocialHistorySectionEClass, SalmonellosisPHCRSocialHistorySection.class, "SalmonellosisPHCRSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(salmonellosisPHCRSocialHistorySectionEClass, this.getSalmonellosisPossibleExposureLocationAndTypeAct(), "getSalmonellosisPossibleExposureLocationAndTypeActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(salmonellosisPHCRSocialHistorySectionEClass, this.getHIVStatusObservation(), "getHIVStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(salmonellosisPossibleExposureLocationAndTypeActEClass, SalmonellosisPossibleExposureLocationAndTypeAct.class, "SalmonellosisPossibleExposureLocationAndTypeAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPossibleExposureLocationAndTypeActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPossibleExposureLocationAndTypeActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hivStatusObservationEClass, HIVStatusObservation.class, "HIVStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(salmonellosisPHCRRelevantDxTestsSectionEClass, SalmonellosisPHCRRelevantDxTestsSection.class, "SalmonellosisPHCRRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(salmonellosisPHCRRelevantDxTestsSectionEClass, this.getSalmonellosisResultOrganizer(), "getSalmonellosisResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(salmonellosisPHCRRelevantDxTestsSectionEClass, this.getSalmonellosisResultObservation(), "getSalmonellosisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(salmonellosisResultOrganizerEClass, SalmonellosisResultOrganizer.class, "SalmonellosisResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisResultOrganizerEClass, ecorePackage.getEBoolean(), "validateSalmonellosisResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisResultOrganizerEClass, ecorePackage.getEBoolean(), "validateSalmonellosisResultOrganizerSalmonellosisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(salmonellosisResultOrganizerEClass, this.getSalmonellosisResultObservation(), "getSalmonellosisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(salmonellosisResultObservationEClass, SalmonellosisResultObservation.class, "SalmonellosisResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisResultObservationEClass, ecorePackage.getEBoolean(), "validateSalmonellosisResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(salmonellosisPHCRClinicalInformationSectionEClass, SalmonellosisPHCRClinicalInformationSection.class, "SalmonellosisPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(salmonellosisPHCRClinicalInformationSectionEClass, this.getSalmonellosisCaseObservation(), "getSalmonellosisCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(salmonellosisCaseObservationEClass, SalmonellosisCaseObservation.class, "SalmonellosisCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseObservationTargetSiteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(salmonellosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(salmonellosisCaseObservationEClass, this.getSalmonellosisSignsAndSymptomsObservation(), "getSalmonellosisSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(salmonellosisSignsAndSymptomsObservationEClass, SalmonellosisSignsAndSymptomsObservation.class, "SalmonellosisSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(salmonellosisSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateSalmonellosisSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
           new String[] 
           {
             "initializers", "org.openhealthtools.mdht.uml.cda.phcr.salmonellosis"
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
          (salmonellosisCaseReportEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisCaseReportTemplateId SalmonellosisCaseReportTitle SalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection",
             "templateId.root", "2.16.840.1.113883.10.20.15.1.9",
             "title.mixed", "Public Health Case Report -  Salmonellosis",
             "constraints.validation.warning", "SalmonellosisCaseReportSalmonellosisSocialHistorySection SalmonellosisCaseReportSalmonellosisRelevantDxTestsSection"
           });                     
        addAnnotation
          (salmonellosisPHCRSocialHistorySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisPHCRSocialHistorySectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.36",
             "constraints.validation.warning", "SalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct SalmonellosisPHCRSocialHistorySectionHIVStatusObservation"
           });              
        addAnnotation
          (salmonellosisPossibleExposureLocationAndTypeActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisPossibleExposureLocationAndTypeActTemplateId SalmonellosisPossibleExposureLocationAndTypeActCode SalmonellosisPossibleExposureLocationAndTypeActStatusCode SalmonellosisPossibleExposureLocationAndTypeActStatusCodeP SalmonellosisPossibleExposureLocationAndTypeActClassCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.115",
             "code.code", "413350009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Finding with explicit context",
             "statusCode.code", "completed",
             "moodCode", "EVN",
             "classCode", "ACT"
           });                    
        addAnnotation
          (hivStatusObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HIVStatusObservationTemplateId HIVStatusObservationCode HIVStatusObservationCodeP HIVStatusObservationStatusCode HIVStatusObservationValue HIVStatusObservationClassCode HIVStatusObservationMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.4",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "HL7ActCode",
             "constraints.validation.dependOn.HIVStatusObservationCode", "HIVStatusObservationCodeP",
             "statusCode.code", "completed",
             "classCode", "OBS",
             "moodCode", "EVN"
           });                          
        addAnnotation
          (salmonellosisPHCRRelevantDxTestsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisPHCRRelevantDxTestsSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.38",
             "constraints.validation.info", "SalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer",
             "constraints.validation.warning", "SalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation"
           });              
        addAnnotation
          (salmonellosisResultOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisResultOrganizerTemplateId SalmonellosisResultOrganizerCode SalmonellosisResultOrganizerSalmonellosisResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.118"
           });             
        addAnnotation
          (salmonellosisResultObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisResultObservationTemplateId SalmonellosisResultObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.119"
           });         
        addAnnotation
          (salmonellosisPHCRClinicalInformationSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisPHCRClinicalInformationSectionTemplateId SalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.37"
           });          
        addAnnotation
          (salmonellosisCaseObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisCaseObservationTemplateId SalmonellosisCaseObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.116",
             "constraints.validation.warning", "SalmonellosisCaseObservationTargetSiteCode SalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation"
           });                
        addAnnotation
          (salmonellosisSignsAndSymptomsObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SalmonellosisSignsAndSymptomsObservationTemplateId SalmonellosisSignsAndSymptomsObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.117"
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
          (salmonellosisCaseReportEClass, 
           source, 
           new String[] 
           {
           });                     
        addAnnotation
          (salmonellosisPHCRSocialHistorySectionEClass, 
           source, 
           new String[] 
           {
           });                                                    
        addAnnotation
          (salmonellosisPHCRRelevantDxTestsSectionEClass, 
           source, 
           new String[] 
           {
           });              
        addAnnotation
          (salmonellosisResultOrganizerEClass, 
           source, 
           new String[] 
           {
           });             
        addAnnotation
          (salmonellosisResultObservationEClass, 
           source, 
           new String[] 
           {
           });         
        addAnnotation
          (salmonellosisPHCRClinicalInformationSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (salmonellosisCaseObservationEClass, 
           source, 
           new String[] 
           {
           });                
        addAnnotation
          (salmonellosisSignsAndSymptomsObservationEClass, 
           source, 
           new String[] 
           {
           });   
    }

} //SalmonellosisPackageImpl
