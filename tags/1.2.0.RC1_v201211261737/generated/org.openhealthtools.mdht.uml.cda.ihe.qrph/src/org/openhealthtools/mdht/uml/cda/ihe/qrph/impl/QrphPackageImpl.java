/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphFactory;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.util.QrphValidator;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QrphPackageImpl extends EPackageImpl implements QrphPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass earlyHearingCarePlanDocumentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riskIndicatorsForHearingLossSectionEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningCodedResultsSectionEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private QrphPackageImpl()
    {
        super(eNS_URI, QrphFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link QrphPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static QrphPackage init()
    {
        if (isInited) return (QrphPackage)EPackage.Registry.INSTANCE.getEPackage(QrphPackage.eNS_URI);

        // Obtain or create and register package
        QrphPackageImpl theQrphPackage = (QrphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QrphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QrphPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IHEPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theQrphPackage.createPackageContents();

        // Initialize created meta-data
        theQrphPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theQrphPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return QrphValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theQrphPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.ihe.qrph", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theQrphPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(QrphPackage.eNS_URI, theQrphPackage);
        return theQrphPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEarlyHearingCarePlanDocument()
    {
        return earlyHearingCarePlanDocumentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiskIndicatorsForHearingLossSection()
    {
        return riskIndicatorsForHearingLossSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningCodedResultsSection()
    {
        return hearingScreeningCodedResultsSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QrphFactory getQrphFactory()
    {
        return (QrphFactory)getEFactoryInstance();
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
        earlyHearingCarePlanDocumentEClass = createEClass(EARLY_HEARING_CARE_PLAN_DOCUMENT);

        riskIndicatorsForHearingLossSectionEClass = createEClass(RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);

        hearingScreeningCodedResultsSectionEClass = createEClass(HEARING_SCREENING_CODED_RESULTS_SECTION);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        earlyHearingCarePlanDocumentEClass.getESuperTypes().add(theIHEPackage.getMedicalDocument());
        riskIndicatorsForHearingLossSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        hearingScreeningCodedResultsSectionEClass.getESuperTypes().add(theIHEPackage.getCodedResultsSection());

        // Initialize classes and features; add operations and parameters
        initEClass(earlyHearingCarePlanDocumentEClass, EarlyHearingCarePlanDocument.class, "EarlyHearingCarePlanDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(earlyHearingCarePlanDocumentEClass, ecorePackage.getEBoolean(), "validateEarlyHearingCarePlanDocumentCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(earlyHearingCarePlanDocumentEClass, ecorePackage.getEBoolean(), "validateEarlyHearingCarePlanDocumentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(earlyHearingCarePlanDocumentEClass, this.getRiskIndicatorsForHearingLossSection(), "getRiskIndicatorsForHearingLossSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(earlyHearingCarePlanDocumentEClass, theIHEPackage.getActiveProblemsSection(), "getActiveProblemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(earlyHearingCarePlanDocumentEClass, theIHEPackage.getPhysicalExamSection(), "getPhysicalExamSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(earlyHearingCarePlanDocumentEClass, theIHEPackage.getReviewOfSystemsSection(), "getReviewOfSystemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(earlyHearingCarePlanDocumentEClass, theIHEPackage.getProceduresAndInterventionsSection(), "getProceduresAndInterventionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(earlyHearingCarePlanDocumentEClass, this.getHearingScreeningCodedResultsSection(), "getHearingScreeningCodedResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(riskIndicatorsForHearingLossSectionEClass, RiskIndicatorsForHearingLossSection.class, "RiskIndicatorsForHearingLossSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningCodedResultsSectionEClass, HearingScreeningCodedResultsSection.class, "HearingScreeningCodedResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(hearingScreeningCodedResultsSectionEClass, theIHEPackage.getProcedureEntry(), "getQrphProcedureEntry", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hearingScreeningCodedResultsSectionEClass, theIHEPackage.getExternalReference(), "getQrphExternalReference", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hearingScreeningCodedResultsSectionEClass, theIHEPackage.getSimpleObservation(), "getQrphSimpleObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
             "initializers", "org.openhealthtools.mdht.uml.cda.ihe.qrph"
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
          (earlyHearingCarePlanDocumentEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "EarlyHearingCarePlanDocumentTemplateId EarlyHearingCarePlanDocumentCode EarlyHearingCarePlanDocumentCodeP",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.15.4.1",
             "code.code", "34817-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Otorhinolaryngology Evaluation and management",
             "constraints.validation.dependOn.EarlyHearingCarePlanDocumentCode", "EarlyHearingCarePlanDocumentCodeP"
           });                          
        addAnnotation
          (riskIndicatorsForHearingLossSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "RiskIndicatorsForHearingLossSectionTemplateId",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.15.3.1"
           });         
        addAnnotation
          (hearingScreeningCodedResultsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HearingScreeningCodedResultsSectionTemplateId",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.15.3.2"
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
          (earlyHearingCarePlanDocumentEClass, 
           source, 
           new String[] {
           });                               
        addAnnotation
          (hearingScreeningCodedResultsSectionEClass, 
           source, 
           new String[] {
           });      
    }

} //QrphPackageImpl
