/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsdrPackageImpl extends EPackageImpl implements VsdrPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deathReportDocumentBodyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateandTimeofDeathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass locationofDeathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass certifyingDeathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mannerofDeathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pregnancyStatusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tobaccoUseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass injuryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deathCausalInformationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass autopsyPerformanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass autopsyResultsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coronerReferralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coronerCaseTransferEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deathLocationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pronouncingDeathEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private VsdrPackageImpl() {
        super(eNS_URI, VsdrFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link VsdrPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static VsdrPackage init() {
        if (isInited) return (VsdrPackage)EPackage.Registry.INSTANCE.getEPackage(VsdrPackage.eNS_URI);

        // Obtain or create and register package
        VsdrPackageImpl theVsdrPackage = (VsdrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VsdrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VsdrPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CDAPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theVsdrPackage.createPackageContents();

        // Initialize created meta-data
        theVsdrPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theVsdrPackage, 
             new EValidator.Descriptor() {
                 @Override
				public EValidator getEValidator() {
                     return VsdrValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theVsdrPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.vsdr", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theVsdrPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VsdrPackage.eNS_URI, theVsdrPackage);
        return theVsdrPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getReportingDeathInformationfromaClinicalSettingtoVitalRecords() {
        return reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getDeathReportDocumentBody() {
        return deathReportDocumentBodyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getDateandTimeofDeath() {
        return dateandTimeofDeathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getLocationofDeath() {
        return locationofDeathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getCertifyingDeath() {
        return certifyingDeathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getMannerofDeath() {
        return mannerofDeathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getPregnancyStatus() {
        return pregnancyStatusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getTobaccoUse() {
        return tobaccoUseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getInjury() {
        return injuryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getDeathCausalInformation() {
        return deathCausalInformationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getAutopsyPerformance() {
        return autopsyPerformanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getAutopsyResults() {
        return autopsyResultsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getCoronerReferral() {
        return coronerReferralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getCoronerCaseTransfer() {
        return coronerCaseTransferEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getDeathLocationType() {
        return deathLocationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EClass getPronouncingDeath() {
        return pronouncingDeathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public VsdrFactory getVsdrFactory() {
        return (VsdrFactory)getEFactoryInstance();
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
        reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass = createEClass(REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);

        deathReportDocumentBodyEClass = createEClass(DEATH_REPORT_DOCUMENT_BODY);

        dateandTimeofDeathEClass = createEClass(DATEAND_TIMEOF_DEATH);

        locationofDeathEClass = createEClass(LOCATIONOF_DEATH);

        certifyingDeathEClass = createEClass(CERTIFYING_DEATH);

        mannerofDeathEClass = createEClass(MANNEROF_DEATH);

        pregnancyStatusEClass = createEClass(PREGNANCY_STATUS);

        tobaccoUseEClass = createEClass(TOBACCO_USE);

        injuryEClass = createEClass(INJURY);

        deathCausalInformationEClass = createEClass(DEATH_CAUSAL_INFORMATION);

        autopsyPerformanceEClass = createEClass(AUTOPSY_PERFORMANCE);

        autopsyResultsEClass = createEClass(AUTOPSY_RESULTS);

        coronerReferralEClass = createEClass(CORONER_REFERRAL);

        coronerCaseTransferEClass = createEClass(CORONER_CASE_TRANSFER);

        deathLocationTypeEClass = createEClass(DEATH_LOCATION_TYPE);

        pronouncingDeathEClass = createEClass(PRONOUNCING_DEATH);
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

        // Obtain other dependent packages
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
        deathReportDocumentBodyEClass.getESuperTypes().add(theCDAPackage.getSection());
        dateandTimeofDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
        locationofDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
        certifyingDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
        mannerofDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
        pregnancyStatusEClass.getESuperTypes().add(theCDAPackage.getObservation());
        tobaccoUseEClass.getESuperTypes().add(theCDAPackage.getObservation());
        injuryEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
        deathCausalInformationEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
        autopsyPerformanceEClass.getESuperTypes().add(theCDAPackage.getObservation());
        autopsyResultsEClass.getESuperTypes().add(theCDAPackage.getObservation());
        coronerReferralEClass.getESuperTypes().add(theCDAPackage.getObservation());
        coronerCaseTransferEClass.getESuperTypes().add(theCDAPackage.getObservation());
        deathLocationTypeEClass.getESuperTypes().add(theCDAPackage.getObservation());
        pronouncingDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());

        // Initialize classes and features; add operations and parameters
        initEClass(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ReportingDeathInformationfromaClinicalSettingtoVitalRecords.class, "ReportingDeathInformationfromaClinicalSettingtoVitalRecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, ecorePackage.getEBoolean(), "validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, this.getDeathReportDocumentBody(), "getDeathReportDocumentBody", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(deathReportDocumentBodyEClass, DeathReportDocumentBody.class, "DeathReportDocumentBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyTimeofDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyLocationOfDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCertifyingDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyMannerOfDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyPregnancyStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyTobaccoUse", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyInjury", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCauseOfDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyAutopsyPerformance", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyAutopsyResults", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCoronerReferral", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCoronerCaseTransfer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyDeathLocationType", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyPronouncingDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getDateandTimeofDeath(), "getTimeofDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getLocationofDeath(), "getLocationOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getCertifyingDeath(), "getCertifyingDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getMannerofDeath(), "getMannerOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getPregnancyStatus(), "getPregnancyStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getTobaccoUse(), "getTobaccoUse", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getInjury(), "getInjury", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getDeathCausalInformation(), "getCauseOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getAutopsyPerformance(), "getAutopsyPerformance", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getAutopsyResults(), "getAutopsyResults", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getCoronerReferral(), "getCoronerReferral", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getCoronerCaseTransfer(), "getCoronerCaseTransfer", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getDeathLocationType(), "getDeathLocationType", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(deathReportDocumentBodyEClass, this.getPronouncingDeath(), "getPronouncingDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(dateandTimeofDeathEClass, DateandTimeofDeath.class, "DateandTimeofDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateandTimeofDeathEClass, ecorePackage.getEBoolean(), "validateDateandTimeofDeathText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(locationofDeathEClass, LocationofDeath.class, "LocationofDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(certifyingDeathEClass, CertifyingDeath.class, "CertifyingDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(certifyingDeathEClass, ecorePackage.getEBoolean(), "validateCertifyingDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(certifyingDeathEClass, ecorePackage.getEBoolean(), "validateCertifyingDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(certifyingDeathEClass, ecorePackage.getEBoolean(), "validateCertifyingDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(certifyingDeathEClass, ecorePackage.getEBoolean(), "validateCertifyingDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(certifyingDeathEClass, ecorePackage.getEBoolean(), "validateCertifyingDeathEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(certifyingDeathEClass, ecorePackage.getEBoolean(), "validateCertifyingDeathCertificationPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mannerofDeathEClass, MannerofDeath.class, "MannerofDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pregnancyStatusEClass, PregnancyStatus.class, "PregnancyStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tobaccoUseEClass, TobaccoUse.class, "TobaccoUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(injuryEClass, Injury.class, "Injury", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(deathCausalInformationEClass, DeathCausalInformation.class, "DeathCausalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCause", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseSequenceNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCause", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(autopsyPerformanceEClass, AutopsyPerformance.class, "AutopsyPerformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(autopsyResultsEClass, AutopsyResults.class, "AutopsyResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsAutopsyReportRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(coronerReferralEClass, CoronerReferral.class, "CoronerReferral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(coronerCaseTransferEClass, CoronerCaseTransfer.class, "CoronerCaseTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferCoronerCase", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(deathLocationTypeEClass, DeathLocationType.class, "DeathLocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pronouncingDeathEClass, PronouncingDeath.class, "PronouncingDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRoleClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRoleId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRolePronouncingParty", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pronouncingDeathEClass, ecorePackage.getEBoolean(), "validatePronouncingDeathPronouncerPronouncerRole", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganization
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthor
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAuthoringPerson
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAuthoringPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatient
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientPerson
        createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformer
        createVsdrCertifyingDeathCertificationPerformerAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRole
        createVsdrCertifyingDeathCertificationPerformerCertifierRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRoleCertifyingParty
        createVsdrCertifyingDeathCertificationPerformerCertifierRoleCertifyingPartyAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation
        createVsdrInjuryComponentInjuryInformationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation
        createVsdrInjuryComponentInjuryInformationInjuryInformationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation
        createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole
        createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury
        createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation
        createVsdrInjuryComponentWorkAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation
        createVsdrInjuryComponentWorkAssociationWorkAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation
        createVsdrInjuryComponentTransportationAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation
        createVsdrInjuryComponentTransportationAssociationTransportationAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship
        createVsdrInjuryComponentTransportationRelationshipAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship
        createVsdrInjuryComponentTransportationRelationshipTransportationRelationshipAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition
        createVsdrDeathCausalInformationComponentOtherSignificantConditionAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition
        createVsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause
        createVsdrDeathCausalInformationComponentCauseAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause
        createVsdrDeathCausalInformationComponentCauseDeathCauseAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseInterval
        createVsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval
        createVsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer
        createVsdrAutopsyPerformanceAutopsyPerformerAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole
        createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician
        createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyResultsAutopsyReportRelationship
        createVsdrAutopsyResultsAutopsyReportRelationshipAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyResultsAutopsyReportRelationshipAutopsyReport
        createVsdrAutopsyResultsAutopsyReportRelationshipAutopsyReportAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCoronerCaseTransferCoronerCaseRelationship
        createVsdrCoronerCaseTransferCoronerCaseRelationshipAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCoronerCaseTransferCoronerCaseRelationshipCoronerCase
        createVsdrCoronerCaseTransferCoronerCaseRelationshipCoronerCaseAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncer
        createVsdrPronouncingDeathPronouncerAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncerPronouncerRole
        createVsdrPronouncingDeathPronouncerPronouncerRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncerPronouncerRolePronouncingParty
        createVsdrPronouncingDeathPronouncerPronouncerRolePronouncingPartyAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createUmlAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.openhealthtools.mdht.uml.cda.vsdr"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsTemplateId Reporting Death Information from a Clinical Setting to Vital RecordsClassCode Reporting Death Information from a Clinical Setting to Vital RecordsMoodCode Reporting Death Information from a Clinical Setting to Vital RecordsCode Reporting Death Information from a Clinical Setting to Vital RecordsCodeP Reporting Death Information from a Clinical Setting to Vital RecordsConfidentialityCode Reporting Death Information from a Clinical Setting to Vital RecordsConfidentialityCodeP Reporting Death Information from a Clinical Setting to Vital RecordsId Reporting Death Information from a Clinical Setting to Vital RecordsRealmCode Reporting Death Information from a Clinical Setting to Vital RecordsRealmCodeP Reporting Death Information from a Clinical Setting to Vital RecordsEffectiveTime Reporting Death Information from a Clinical Setting to Vital RecordsCustodian Reporting Death Information from a Clinical Setting to Vital RecordsDeathReportDocumentBody Reporting Death Information from a Clinical Setting to Vital RecordsAuthor Reporting Death Information from a Clinical Setting to Vital RecordsRecordTarget Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodian",
             "templateId.root", "2.16.840.1.113883.10.20.26.1",
             "classCode", "DOCCLIN",
             "moodCode", "EVN",
             "code.code", "69409-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "U.S. standard certificate of death - 2003 revision"
           });                                                                          
        addAnnotation
          (deathReportDocumentBodyEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Death Report Document BodyTemplateId Death Report Document BodyCode Death Report Document BodyCodeP Death Report Document BodyText Death Report Document BodyTime of Death Death Report Document BodyLocationOfDeath Death Report Document BodyMannerOfDeath Death Report Document BodyPregnancyStatus Death Report Document BodyTobaccoUse Death Report Document BodyCauseOfDeath Death Report Document BodyAutopsyPerformance Death Report Document BodyCoronerCaseTransfer Death Report Document BodyDeathLocationType Death Report Document BodyPronouncingDeath",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.1",
             "code.code", "69409-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "U.S. standard certificate of death - 2003 revision",
             "constraints.validation.warning", "Death Report Document BodyCertifyingDeath Death Report Document BodyInjury",
             "constraints.validation.info", "Death Report Document BodyAutopsyResults Death Report Document BodyCoronerReferral"
           });                                                                         
        addAnnotation
          (dateandTimeofDeathEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Date and Time of DeathTemplateId Date and Time of DeathClassCode Date and Time of DeathMoodCode Date and Time of DeathCode Date and Time of DeathCodeP Date and Time of DeathEffectiveTime",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.13",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "31211-6",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Date of Death"
           });                          
        addAnnotation
          (locationofDeathEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Location of DeathTemplateId Location of DeathClassCode Location of DeathMoodCode Location of DeathCode Location of DeathCodeP Location of DeathValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.10",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "58332-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Location of Death"
           });                          
        addAnnotation
          (certifyingDeathEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Certifying DeathTemplateId Certifying DeathClassCode Certifying DeathMoodCode Certifying DeathCode Certifying DeathEffectiveTime Certifying DeathCertificationPerformer",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.7",
             "code.code", "69437-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Death Certifier"
           });                          
        addAnnotation
          (mannerofDeathEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Manner of DeathTemplateId Manner of DeathClassCode Manner of DeathMoodCode Manner of DeathCode Manner of DeathCodeP Manner of DeathValue Manner of DeathValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.11",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "69449-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Manner of Death"
           });                          
        addAnnotation
          (pregnancyStatusEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Pregnancy StatusTemplateId Pregnancy StatusClassCode Pregnancy StatusMoodCode Pregnancy StatusCode Pregnancy StatusCodeP Pregnancy StatusValue Pregnancy StatusValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.12",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "69442-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Timing of recent pregancy related to death"
           });                          
        addAnnotation
          (tobaccoUseEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Tobacco UseTemplateId Tobacco UseClassCode Tobacco UseMoodCode Tobacco UseCode Tobacco UseValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.14",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "69443-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Tobacco Use"
           });                    
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "InjuryTemplateId InjuryClassCode InjuryMoodCode InjuryCode InjuryCodeP InjuryStatusCode InjuryComponentInjuryInformation InjuryComponentWorkAssociation InjuryComponentTransportationAssociation InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationTypeCode InjuryComponentInjuryInformationInjuryInformation InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociation InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTransportationRelationshipValueP InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.9",
             "classCode", "CLUSTER",
             "moodCode", "EVN",
             "code.code", "71481-6",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Did the death of this person involve injury of any kind?",
             "constraints.validation.info", "InjuryComponentTransportationRelationship",
             "constraints.validation.query", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationTypeCode InjuryComponentInjuryInformationInjuryInformation InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociation InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTransportationRelationshipValueP InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship",
             "constraints.validation.dependOn.InjuryComponentInjuryInformationInjuryInformationCode", "InjuryComponentInjuryInformationInjuryInformationCodeP",
             "constraints.validation.dependOn.InjuryComponentWorkAssociationWorkAssociationCode", "InjuryComponentWorkAssociationWorkAssociationCodeP",
             "constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode", "InjuryComponentTransportationAssociationTransportationAssociationCodeP",
             "constraints.validation.dependOn.InjuryComponentTransportationRelationshipTransportationRelationshipCode", "InjuryComponentTransportationRelationshipTransportationRelationshipCodeP"
           });                                                                                                                                                                      
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Death Causal InformationTemplateId Death Causal InformationClassCode Death Causal InformationMoodCode Death Causal InformationCode Death Causal InformationStatusCode Death Causal InformationStatusCodeP Death Causal InformationComponentCause Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.6",
             "classCode", "CLUSTER",
             "moodCode", "EVN",
             "code.code", "69453-9",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Cause Of Death (US Standard Certificate of Death)",
             "statusCode.code", "Active"
           });                                                                                                     
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Autopsy PerformanceTemplateId Autopsy PerformanceClassCode Autopsy PerformanceMoodCode Autopsy PerformanceCode Autopsy PerformanceCodeP Autopsy PerformanceEffectiveTime Autopsy PerformanceValue Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician Autopsy PerformanceAutopsyPerformerTypeCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRole",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.2",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "21986-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Autopsy Status"
           });                                                     
        addAnnotation
          (autopsyResultsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Autopsy ResultsTemplateId Autopsy ResultsClassCode Autopsy ResultsMoodCode Autopsy ResultsCode Autopsy ResultsCodeP Autopsy ResultsValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.3",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "69436-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Autopsy results available"
           });                            
        addAnnotation
          (coronerReferralEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Coroner ReferralTemplateId Coroner ReferralClassCode Coroner ReferralMoodCode Coroner ReferralCode Coroner ReferralCodeP Coroner ReferralValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.5",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "69438-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Referral note Forensic medicine"
           });                       
        addAnnotation
          (coronerCaseTransferEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Coroner Case TransferTemplateId Coroner Case TransferClassCode Coroner Case TransferMoodCode Coroner Case TransferCode Coroner Case TransferCodeP Coroner Case TransferValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.4",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "LOINC TBD",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Coroner Indicator"
           });                            
        addAnnotation
          (deathLocationTypeEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Death LocationTypeTemplateId Death LocationTypeClassCode Death LocationTypeMoodCode Death LocationTypeCode Death LocationTypeCodeP Death LocationTypeValue Death LocationTypeValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.8",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "58332-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Location of Death"
           });                          
        addAnnotation
          (pronouncingDeathEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Pronouncing DeathTemplateId Pronouncing DeathClassCode Pronouncing DeathMoodCode Pronouncing DeathCode Pronouncing DeathEffectiveTime Pronouncing DeathPronouncerPronouncerRolePronouncingPartyClassCode Pronouncing DeathPronouncerPronouncerRolePronouncingPartyDeterminerCode Pronouncing DeathPronouncerPronouncerRolePronouncingPartyName Pronouncing DeathPronouncerPronouncerRoleClassCode Pronouncing DeathPronouncerPronouncerRoleId Pronouncing DeathPronouncerPronouncerRolePronouncingParty Pronouncing DeathPronouncerTypeCode Pronouncing DeathPronouncerPronouncerRole",
             "templateId.root", "2.16.840.1.113883.10.20.26.1.15",
             "code.code", "LOINC TBD",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Death Pronouncer",
             "constraints.validation.info", "Pronouncing DeathPronouncer",
             "constraints.validation.query", "Pronouncing DeathPronouncerPronouncerRolePronouncingPartyClassCode Pronouncing DeathPronouncerPronouncerRolePronouncingPartyDeterminerCode Pronouncing DeathPronouncerPronouncerRolePronouncingPartyName Pronouncing DeathPronouncerPronouncerRoleClassCode Pronouncing DeathPronouncerPronouncerRoleId Pronouncing DeathPronouncerPronouncerRolePronouncingParty Pronouncing DeathPronouncerTypeCode Pronouncing DeathPronouncerPronouncerRole"
           });                                             
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian";       
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodian Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId",
             "constraints.validation.query", "Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganization</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganization";        
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor";         
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "typeCode", "AUT",
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsAuthorTypeCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorTime Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthor"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthor</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthor";          
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorClassCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorId Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAuthoringPerson</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAuthoringPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAuthoringPerson";           
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "classCode", "PSN",
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPersonClassCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPersonName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget";            
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "typeCode", "RCT",
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetTypeCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatient"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatient</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatient";             
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "classCode", "PAT",
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientClassCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientId Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientAddr Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientPerson</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientPerson";              
        addAnnotation
          (reportingDeathInformationfromaClinicalSettingtoVitalRecordsEClass, 
           source, 
           new String[] {
             "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
             "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode",
             "constraints.validation.error", "Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonAdministrativeGenderCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonAdministrativeGenderCodeP Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonClassCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonDeterminerCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonName",
             "classCode", "PSN",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformer</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrCertifyingDeathCertificationPerformerAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformer";                                                                                                                                                                                              
        addAnnotation
          (certifyingDeathEClass, 
           source, 
           new String[] {
             "typeCode", "PRF",
             "constraints.validation.error", "Certifying DeathCertificationPerformerTypeCode Certifying DeathCertificationPerformerCertifierRole Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName Certifying DeathCertificationPerformerCertifierRoleClassCode Certifying DeathCertificationPerformerCertifierRoleId Certifying DeathCertificationPerformerCertifierRoleCode Certifying DeathCertificationPerformerCertifierRoleCodeP Certifying DeathCertificationPerformerCertifierRoleAddr Certifying DeathCertificationPerformerCertifierRoleCertifyingParty",
             "constraints.validation.query", "Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName Certifying DeathCertificationPerformerCertifierRoleClassCode Certifying DeathCertificationPerformerCertifierRoleId Certifying DeathCertificationPerformerCertifierRoleCode Certifying DeathCertificationPerformerCertifierRoleCodeP Certifying DeathCertificationPerformerCertifierRoleAddr Certifying DeathCertificationPerformerCertifierRoleCertifyingParty"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrCertifyingDeathCertificationPerformerCertifierRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRole";                                                                                                                                                                                               
        addAnnotation
          (certifyingDeathEClass, 
           source, 
           new String[] {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "Certifying DeathCertificationPerformerCertifierRoleClassCode Certifying DeathCertificationPerformerCertifierRoleId Certifying DeathCertificationPerformerCertifierRoleCode Certifying DeathCertificationPerformerCertifierRoleCodeP Certifying DeathCertificationPerformerCertifierRoleAddr Certifying DeathCertificationPerformerCertifierRoleCertifyingParty Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName",
             "code.codeSystem", "2.16.840.1.114222.4.5.274",
             "code.codeSystemName", "PHIN VS (CDC Local Coding System)",
             "constraints.validation.query", "Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRoleCertifyingParty</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrCertifyingDeathCertificationPerformerCertifierRoleCertifyingPartyAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRoleCertifyingParty";                                                                                                                                                                                                
        addAnnotation
          (certifyingDeathEClass, 
           source, 
           new String[] {
             "classCode", "PSN",
             "constraints.validation.error", "Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentInjuryInformationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation";                                                                                                                                                                                                                                                                                
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "InjuryComponentInjuryInformationTypeCode InjuryComponentInjuryInformationInjuryInformation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentInjuryInformationInjuryInformationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation";                                                                                                                                                                                                                                                                                 
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole",
             "moodCode", "EVN",
             "code.code", "11374-6",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Injury incident description",
             "constraints.validation.dependOn.InjuryComponentInjuryInformationInjuryInformationCode", "InjuryComponentInjuryInformationInjuryInformationCodeP",
             "constraints.validation.query", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation";                                                                                                                                                                                                                                                                                  
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "typeCode", "LOC",
             "constraints.validation.error", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury",
             "constraints.validation.query", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole";                                                                                                                                                                                                                                                                                   
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc",
             "classCode", "ISDLOC",
             "constraints.validation.query", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury";                                                                                                                                                                                                                                                                                    
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "classCode", "PLC",
             "constraints.validation.error", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentWorkAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation";                                                                                                                                                                                                                                                                                     
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentWorkAssociationWorkAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation";                                                                                                                                                                                                                                                                                      
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationValue",
             "moodCode", "EVN",
             "code.code", "69444-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Did death result from injury at work",
             "constraints.validation.dependOn.InjuryComponentWorkAssociationWorkAssociationCode", "InjuryComponentWorkAssociationWorkAssociationCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentTransportationAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation";                                                                                                                                                                                                                                                                                       
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue",
             "constraints.validation.query", "InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue",
             "constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode", "InjuryComponentTransportationAssociationTransportationAssociationCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentTransportationAssociationTransportationAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation";                                                                                                                                                                                                                                                                                        
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationValue",
             "moodCode", "EVN",
             "code.code", "69448-9",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Injury leading to death associated with transportation event",
             "constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode", "InjuryComponentTransportationAssociationTransportationAssociationCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentTransportationRelationshipAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship";                                                                                                                                                                                                                                                                                         
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrInjuryComponentTransportationRelationshipTransportationRelationshipAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship";                                                                                                                                                                                                                                                                                          
        addAnnotation
          (injuryEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTransportationRelationshipValueP",
             "moodCode", "EVN",
             "code.code", "69451-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Transportation role of decedent",
             "constraints.validation.dependOn.InjuryComponentTransportationRelationshipTransportationRelationshipCode", "InjuryComponentTransportationRelationshipTransportationRelationshipCodeP",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrDeathCausalInformationComponentOtherSignificantConditionAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition";                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue",
             "constraints.validation.query", "Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue"
           });                                                                                                                                                                                                                                                                                       
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition";                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue",
             "moodCode", "EVN",
             "code.code", "69441-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Other Significant Condition"
           });                                                                                                                                                                                                                                                                                      
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrDeathCausalInformationComponentCauseAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause";                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue",
             "typeCode", "COMP",
             "constraints.validation.query", "Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue"
           });                                                                                                                                                                                                                                                                                     
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrDeathCausalInformationComponentCauseDeathCauseAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause";                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval",
             "code.code", "21984-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Cause of Death"
           });                                                                                                                                                                                                                                                                                    
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseInterval</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseInterval";                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue",
             "constraints.validation.query", "Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue"
           });                                                                                                                                                                                                                                                                                   
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval";                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        addAnnotation
          (deathCausalInformationEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue",
             "code.code", "69440-6",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Disease onset to death interval"
           });                                                                                                                                                                                                                                                                                  
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrAutopsyPerformanceAutopsyPerformerAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] {
             "typeCode", "PRF",
             "constraints.validation.error", "Autopsy PerformanceAutopsyPerformerTypeCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRole Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician",
             "constraints.validation.query", "Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician"
           });                                                                                                                                                                                      
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName",
             "constraints.validation.query", "Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName"
           });                                                                                                                                                                                     
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] {
             "classCode", "PSN",
             "constraints.validation.error", "Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                    
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyResultsAutopsyReportRelationship</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrAutopsyResultsAutopsyReportRelationshipAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyResultsAutopsyReportRelationship";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (autopsyResultsEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "Autopsy ResultsAutopsy Report RelationshipTypeCode Autopsy ResultsAutopsy Report RelationshipAutopsyReport"
           });                                                                                                                                     
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyResultsAutopsyReportRelationshipAutopsyReport</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrAutopsyResultsAutopsyReportRelationshipAutopsyReportAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyResultsAutopsyReportRelationshipAutopsyReport";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        addAnnotation
          (autopsyResultsEClass, 
           source, 
           new String[] {
             "classCode", "OBS",
             "constraints.validation.error", "Autopsy ResultsAutopsy Report RelationshipAutopsy ReportClassCode Autopsy ResultsAutopsy Report RelationshipAutopsy ReportMoodCode Autopsy ResultsAutopsy Report RelationshipAutopsy ReportCode Autopsy ResultsAutopsy Report RelationshipAutopsy ReportCodeP Autopsy ResultsAutopsy Report RelationshipAutopsy ReportValue",
             "moodCode", "EVN",
             "code.code", "18743-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Autopsy Report"
           });                                                                                                                                    
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCoronerCaseTransferCoronerCaseRelationship</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrCoronerCaseTransferCoronerCaseRelationshipAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCoronerCaseTransferCoronerCaseRelationship";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (coronerCaseTransferEClass, 
           source, 
           new String[] {
             "typeCode", "COMP",
             "constraints.validation.error", "Coroner Case TransferCoroner Case RelationshipTypeCode Coroner Case TransferCoroner Case RelationshipCoroner Case"
           });                                                                                          
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCoronerCaseTransferCoronerCaseRelationshipCoronerCase</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrCoronerCaseTransferCoronerCaseRelationshipCoronerCaseAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCoronerCaseTransferCoronerCaseRelationshipCoronerCase";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        addAnnotation
          (coronerCaseTransferEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Coroner Case TransferCoroner Case RelationshipCoroner CaseClassCode Coroner Case TransferCoroner Case RelationshipCoroner CaseCode Coroner Case TransferCoroner Case RelationshipCoroner CaseCodeP Coroner Case TransferCoroner Case RelationshipCoroner CaseValue",
             "code.code", "69452-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Coroner-medical examiner case number"
           });                                                                                         
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncer</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrPronouncingDeathPronouncerAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncer";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (pronouncingDeathEClass, 
           source, 
           new String[] {
             "typeCode", "PRF",
             "constraints.validation.error", "Pronouncing DeathPronouncerTypeCode Pronouncing DeathPronouncerPronouncerRole"
           });                                            
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncerPronouncerRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrPronouncingDeathPronouncerPronouncerRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncerPronouncerRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        addAnnotation
          (pronouncingDeathEClass, 
           source, 
           new String[] {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "Pronouncing DeathPronouncerPronouncerRoleClassCode Pronouncing DeathPronouncerPronouncerRoleId Pronouncing DeathPronouncerPronouncerRolePronouncingParty"
           });                                           
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncerPronouncerRolePronouncingParty</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsdrPronouncingDeathPronouncerPronouncerRolePronouncingPartyAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrPronouncingDeathPronouncerPronouncerRolePronouncingParty";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (pronouncingDeathEClass, 
           source, 
           new String[] {
             "classCode", "PSN",
             "constraints.validation.error", "Pronouncing DeathPronouncerPronouncerRolePronouncingPartyClassCode Pronouncing DeathPronouncerPronouncerRolePronouncingPartyDeterminerCode Pronouncing DeathPronouncerPronouncerRolePronouncingPartyName",
             "determinerCode", "INSTANCE"
           });                                          
    }

} //VsdrPackageImpl
