/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrPackageImpl extends EPackageImpl implements EmspcrPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass patientCareReportEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsBillingSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsInjuryIncidentDescriptionSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsCurrentMedicationSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsCardiacArrestEventSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsAdvanceDirectivesSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsAllergiesAndAdverseReactionsSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsPastMedicalHistorySectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsSocialHistorySectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsPhysicalAssessmentSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsMedicationsAdministeredSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsProceduresPerformedSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsPatientCareNarrativeSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsSceneSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsDispatchSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsDispositionSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsPersonnelAdverseEventSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsProtocolSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsResponseSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsSituationSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsTimesSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass emsVitalSignsSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass derivedEntryEClass = null;

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
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private EmspcrPackageImpl() {
    super(eNS_URI, EmspcrFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EmspcrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static EmspcrPackage init() {
    if (isInited) return (EmspcrPackage)EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI);

    // Obtain or create and register package
    EmspcrPackageImpl theEmspcrPackage = (EmspcrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmspcrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmspcrPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ConsolPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEmspcrPackage.createPackageContents();

    // Initialize created meta-data
    theEmspcrPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theEmspcrPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return EmspcrValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theEmspcrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EmspcrPackage.eNS_URI, theEmspcrPackage);
    return theEmspcrPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getPatientCareReport() {
    return patientCareReportEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSBillingSection() {
    return emsBillingSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSInjuryIncidentDescriptionSection() {
    return emsInjuryIncidentDescriptionSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSCurrentMedicationSection() {
    return emsCurrentMedicationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSCardiacArrestEventSection() {
    return emsCardiacArrestEventSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSAdvanceDirectivesSection() {
    return emsAdvanceDirectivesSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSAllergiesAndAdverseReactionsSection() {
    return emsAllergiesAndAdverseReactionsSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSPastMedicalHistorySection() {
    return emsPastMedicalHistorySectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSSocialHistorySection() {
    return emsSocialHistorySectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSPhysicalAssessmentSection() {
    return emsPhysicalAssessmentSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSMedicationsAdministeredSection() {
    return emsMedicationsAdministeredSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSProceduresPerformedSection() {
    return emsProceduresPerformedSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSPatientCareNarrativeSection() {
    return emsPatientCareNarrativeSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSSceneSection() {
    return emsSceneSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSDispatchSection() {
    return emsDispatchSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSDispositionSection() {
    return emsDispositionSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSPersonnelAdverseEventSection() {
    return emsPersonnelAdverseEventSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSProtocolSection() {
    return emsProtocolSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSResponseSection() {
    return emsResponseSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSSituationSection() {
    return emsSituationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSTimesSection() {
    return emsTimesSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEMSVitalSignsSection() {
    return emsVitalSignsSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDerivedEntry() {
    return derivedEntryEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EmspcrFactory getEmspcrFactory() {
    return (EmspcrFactory)getEFactoryInstance();
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
    patientCareReportEClass = createEClass(PATIENT_CARE_REPORT);

    emsBillingSectionEClass = createEClass(EMS_BILLING_SECTION);

    emsInjuryIncidentDescriptionSectionEClass = createEClass(EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);

    emsCurrentMedicationSectionEClass = createEClass(EMS_CURRENT_MEDICATION_SECTION);

    emsCardiacArrestEventSectionEClass = createEClass(EMS_CARDIAC_ARREST_EVENT_SECTION);

    emsAdvanceDirectivesSectionEClass = createEClass(EMS_ADVANCE_DIRECTIVES_SECTION);

    emsAllergiesAndAdverseReactionsSectionEClass = createEClass(EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);

    emsPastMedicalHistorySectionEClass = createEClass(EMS_PAST_MEDICAL_HISTORY_SECTION);

    emsSocialHistorySectionEClass = createEClass(EMS_SOCIAL_HISTORY_SECTION);

    emsPhysicalAssessmentSectionEClass = createEClass(EMS_PHYSICAL_ASSESSMENT_SECTION);

    emsMedicationsAdministeredSectionEClass = createEClass(EMS_MEDICATIONS_ADMINISTERED_SECTION);

    emsProceduresPerformedSectionEClass = createEClass(EMS_PROCEDURES_PERFORMED_SECTION);

    emsPatientCareNarrativeSectionEClass = createEClass(EMS_PATIENT_CARE_NARRATIVE_SECTION);

    emsSceneSectionEClass = createEClass(EMS_SCENE_SECTION);

    emsDispatchSectionEClass = createEClass(EMS_DISPATCH_SECTION);

    emsDispositionSectionEClass = createEClass(EMS_DISPOSITION_SECTION);

    emsPersonnelAdverseEventSectionEClass = createEClass(EMS_PERSONNEL_ADVERSE_EVENT_SECTION);

    emsProtocolSectionEClass = createEClass(EMS_PROTOCOL_SECTION);

    emsResponseSectionEClass = createEClass(EMS_RESPONSE_SECTION);

    emsSituationSectionEClass = createEClass(EMS_SITUATION_SECTION);

    emsTimesSectionEClass = createEClass(EMS_TIMES_SECTION);

    emsVitalSignsSectionEClass = createEClass(EMS_VITAL_SIGNS_SECTION);

    derivedEntryEClass = createEClass(DERIVED_ENTRY);
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
    ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    patientCareReportEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    emsBillingSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsInjuryIncidentDescriptionSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsCurrentMedicationSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsCardiacArrestEventSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsAdvanceDirectivesSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsAllergiesAndAdverseReactionsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsPastMedicalHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsSocialHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsPhysicalAssessmentSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsMedicationsAdministeredSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsProceduresPerformedSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsPatientCareNarrativeSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsSceneSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsDispatchSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsDispositionSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsPersonnelAdverseEventSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsProtocolSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsResponseSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsSituationSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsTimesSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsVitalSignsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    derivedEntryEClass.getESuperTypes().add(theCDAPackage.getEntry());

    // Initialize classes and features; add operations and parameters
    initEClass(patientCareReportEClass, PatientCareReport.class, "PatientCareReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportBilling", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSCurrentMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSCardiacArrestEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSAdvanceDirectives", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSAllergiesAndAdverseReactionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPastMedicalHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSSocialHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPhysicalAssessmentSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSMedicationsAdministeredSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSProceduresPerformedSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPatientCareNarrative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSSceneSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportComponentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSDispatchSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSDispositionSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPersonnelAdverseEventSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSProtocolSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSResponseSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSSituationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSTimesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSHumanAuthorParticipation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportDocumentationOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportRelatedDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSBillingSection(), "getBilling", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSInjuryIncidentDescriptionSection(), "getSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSCurrentMedicationSection(), "getEMSCurrentMedication", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSCardiacArrestEventSection(), "getEMSCardiacArrestEvent", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSAdvanceDirectivesSection(), "getEMSAdvanceDirectives", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSAllergiesAndAdverseReactionsSection(), "getEMSAllergiesAndAdverseReactionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPastMedicalHistorySection(), "getEMSPastMedicalHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSSocialHistorySection(), "getEMSSocialHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPhysicalAssessmentSection(), "getEMSPhysicalAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSMedicationsAdministeredSection(), "getEMSMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSProceduresPerformedSection(), "getEMSProceduresPerformedSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPatientCareNarrativeSection(), "getEMSPatientCareNarrative", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSSceneSection(), "getEMSSceneSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSDispatchSection(), "getEMSDispatchSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSDispositionSection(), "getEMSDispositionSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPersonnelAdverseEventSection(), "getEMSPersonnelAdverseEventSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSProtocolSection(), "getEMSProtocolSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSResponseSection(), "getEMSResponseSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSSituationSection(), "getEMSSituationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSTimesSection(), "getEMSTimesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSVitalSignsSection(), "getEMSVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsBillingSectionEClass, EMSBillingSection.class, "EMSBillingSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionBillingConditionentry", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionLosentry", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsBillingSectionEClass, null, "getBillingConditionentry", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsBillingSectionEClass, null, "getLosentry", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsInjuryIncidentDescriptionSectionEClass, EMSInjuryIncidentDescriptionSection.class, "EMSInjuryIncidentDescriptionSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry8", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry9", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry10", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry11", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry12", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry4", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry5", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry6", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry7", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry8", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry9", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry10", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry11", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionSectionEClass, null, "getEntry12", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsCurrentMedicationSectionEClass, EMSCurrentMedicationSection.class, "EMSCurrentMedicationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsCurrentMedicationSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsCurrentMedicationSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsCurrentMedicationSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsCardiacArrestEventSectionEClass, EMSCardiacArrestEventSection.class, "EMSCardiacArrestEventSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsCardiacArrestEventSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsAdvanceDirectivesSectionEClass, EMSAdvanceDirectivesSection.class, "EMSAdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsAdvanceDirectivesSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsAllergiesAndAdverseReactionsSectionEClass, EMSAllergiesAndAdverseReactionsSection.class, "EMSAllergiesAndAdverseReactionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsPastMedicalHistorySectionEClass, EMSPastMedicalHistorySection.class, "EMSPastMedicalHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistorySectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsPastMedicalHistorySectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPastMedicalHistorySectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsSocialHistorySectionEClass, EMSSocialHistorySection.class, "EMSSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistorySectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistorySectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistorySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistorySectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsSocialHistorySectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsPhysicalAssessmentSectionEClass, EMSPhysicalAssessmentSection.class, "EMSPhysicalAssessmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsPhysicalAssessmentSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPhysicalAssessmentSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPhysicalAssessmentSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPhysicalAssessmentSectionEClass, null, "getEntry4", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPhysicalAssessmentSectionEClass, null, "getEntry5", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPhysicalAssessmentSectionEClass, null, "getEntry6", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsMedicationsAdministeredSectionEClass, EMSMedicationsAdministeredSection.class, "EMSMedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsMedicationsAdministeredSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsProceduresPerformedSectionEClass, EMSProceduresPerformedSection.class, "EMSProceduresPerformedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsProceduresPerformedSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsPatientCareNarrativeSectionEClass, EMSPatientCareNarrativeSection.class, "EMSPatientCareNarrativeSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPatientCareNarrativeSectionEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeSectionEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeSectionEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeSectionEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeSectionEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsSceneSectionEClass, EMSSceneSection.class, "EMSSceneSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsSceneSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSceneSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsDispatchSectionEClass, EMSDispatchSection.class, "EMSDispatchSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsDispatchSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispatchSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispatchSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispatchSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispatchSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispatchSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispatchSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsDispatchSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispatchSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsDispositionSectionEClass, EMSDispositionSection.class, "EMSDispositionSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, null, "getEntry5", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, null, "getEntry7", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, null, "getEntry6", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, theCDAPackage.getObservation(), "getemspcrEntry4", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsPersonnelAdverseEventSectionEClass, EMSPersonnelAdverseEventSection.class, "EMSPersonnelAdverseEventSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsPersonnelAdverseEventSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsPersonnelAdverseEventSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsProtocolSectionEClass, EMSProtocolSection.class, "EMSProtocolSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsProtocolSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsProtocolSectionEClass, null, "getEntry3s", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsResponseSectionEClass, EMSResponseSection.class, "EMSResponseSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseSectionEClass, ecorePackage.getEBoolean(), "validateEMSResponseSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsResponseSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsResponseSectionEClass, null, "getEntry2", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsResponseSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsResponseSectionEClass, null, "getEntry4", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsSituationSectionEClass, EMSSituationSection.class, "EMSSituationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry8", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry3", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry4", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry5", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry6", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry7", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsSituationSectionEClass, null, "getEntry8", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsTimesSectionEClass, EMSTimesSection.class, "EMSTimesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry9", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsTimesSectionEClass, null, "getEntry9", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsVitalSignsSectionEClass, EMSVitalSignsSection.class, "EMSVitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsVitalSignsSectionEClass, null, "getEntry1s", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(derivedEntryEClass, DerivedEntry.class, "DerivedEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(derivedEntryEClass, ecorePackage.getEBoolean(), "validateDerivedEntryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(derivedEntryEClass, ecorePackage.getEBoolean(), "validateDerivedEntryTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
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
    // http://www.openhealthtools.org/mdht/uml/cda/annotation
    createAnnotationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTarget
    createEmspcrPatientCareReportEMSRecordTargetAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole
    createEmspcrPatientCareReportEMSRecordTargetPatientRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient
    createEmspcrPatientCareReportEMSRecordTargetPatientRolePatientAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipation
    createEmspcrPatientCareReportEMSAuthorParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRole
    createEmspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSHumanAuthor
    createEmspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSHumanAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSAuthoringDevice
    createEmspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSAuthoringDeviceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipation
    createEmspcrPatientCareReportEMSCustodianParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipationEMSCustodianRole
    createEmspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleEMSCustodian
    createEmspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleEMSCustodianAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipation
    createEmspcrPatientCareReportEMSServiceEventParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleEMSPerformer
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleEMSPerformerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship
    createEmspcrPatientCareReportEMSParentDocumentRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationshipEMSParentDocument
    createEmspcrPatientCareReportEMSParentDocumentRelationshipEMSParentDocumentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation
    createEmspcrPatientCareReportEMSDestinationParticipantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole
    createEmspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleDestinationOrganization
    createEmspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleDestinationOrganizationAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry
    createEmspcrEMSBillingSectionBillingConditionEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition
    createEmspcrEMSBillingSectionBillingConditionEntryBillingConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntry
    createEmspcrEMSBillingSectionLevelOfServiceEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntryLevelOfServiceObservation
    createEmspcrEMSBillingSectionLevelOfServiceEntryLevelOfServiceObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryInjuryCauseCategory
    createEmspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryInjuryCauseCategoryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryInjuryMechanism
    createEmspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryInjuryMechanismAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryTraumaCenterCriteria
    createEmspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryTraumaCenterCriteriaAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryInjuryRiskFactor
    createEmspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryInjuryRiskFactorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryVehicleImpactArea
    createEmspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryVehicleImpactAreaAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryPatientLocationInVehicle
    createEmspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryPatientLocationInVehicleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipment
    createEmspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAirbagDeploymentStatus
    createEmspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAirbagDeploymentStatusAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryHeightOfFall
    createEmspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryHeightOfFallAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntry
    createEmspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryDisasterType
    createEmspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryDisasterTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntry
    createEmspcrEMSCurrentMedicationSectionOnMedicationEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntryCurrentlyOnMedication
    createEmspcrEMSCurrentMedicationSectionOnMedicationEntryCurrentlyOnMedicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntry
    createEmspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryPatientOnAnticoagulants
    createEmspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryPatientOnAnticoagulantsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntry
    createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedication
    createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumable
    createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProduct
    createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug
    createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrugAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntry
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistence
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTimingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCauseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipation
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProviderAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProviderAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationship
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm
    createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntry
    createEmspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation
    createEmspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntry
    createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSExistenceOfDrugAllergyObservation
    createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSExistenceOfDrugAllergyObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservation
    createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipation
    createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRole
    createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity
    createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntry
    createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergies
    createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy
    createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy
    createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntry
    createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizer
    createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponent
    createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfCondition
    createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponent
    createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentEMSHistoryOfCondition
    createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentEMSHistoryOfConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizer
    createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponent
    createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentEMSExistenceOfHistoryOfProcedures
    createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentEMSExistenceOfHistoryOfProceduresAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponent
    createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentEMSHistoryOfProcedure
    createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentEMSHistoryOfProcedureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntry
    createEmspcrEMSSocialHistorySectionEMSDrugUseEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSExistenceOfDrugUseIndication
    createEmspcrEMSSocialHistorySectionEMSDrugUseEntryEMSExistenceOfDrugUseIndicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSDrugUseIndication
    createEmspcrEMSSocialHistorySectionEMSDrugUseEntryEMSDrugUseIndicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionEMSNeurologicalAssessment
    createEmspcrEMSPhysicalAssessmentSectionEMSNeurologicalAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntry
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPhysicalAssessmentOrganizer
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPhysicalAssessmentOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryPatientBodyWeight
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryPatientBodyWeightAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryLengthBasedPatientBodyWeightClass
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryLengthBasedPatientBodyWeightClassAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSSkinAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSSkinAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeadAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeadAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSFaceAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSFaceAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSNeckAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSNeckAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSChestAndLungsAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSChestAndLungsAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeartAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeartAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSAbdomenAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSAbdomenAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPelvicAndGenitourinaryAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPelvicAndGenitourinaryAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSBackAndSpineAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSBackAndSpineAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSExtremitiesAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSExtremitiesAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSEyeAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSEyeAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSMentalStatusAssessment
    createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSMentalStatusAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntry
    createEmspcrEMSPhysicalAssessmentSectionPregnancyEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntryPatientPregnancy
    createEmspcrEMSPhysicalAssessmentSectionPregnancyEntryPatientPregnancyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntry
    createEmspcrEMSPhysicalAssessmentSectionOralIntakeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntryLastOralIntake
    createEmspcrEMSPhysicalAssessmentSectionOralIntakeEntryLastOralIntakeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntry
    createEmspcrEMSPhysicalAssessmentSectionPatientAgeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntryEMSPatientAge
    createEmspcrEMSPhysicalAssessmentSectionPatientAgeEntryEMSPatientAgeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntry
    createEmspcrEMSPhysicalAssessmentSectionThrombolyticEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntryEMSThrombolyticContraindications
    createEmspcrEMSPhysicalAssessmentSectionThrombolyticEntryEMSThrombolyticContraindicationsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntry
    createEmspcrEMSPhysicalAssessmentSectionBarrriersEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntryEMSBarriersToPatientCare
    createEmspcrEMSPhysicalAssessmentSectionBarrriersEntryEMSBarriersToPatientCareAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntry
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministered
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationship
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrugAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorizationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipant
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice
    createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDeviceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntry
    createEmspcrEMSProceduresPerformedSectionProceduresEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedure
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformer
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationship
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservation
    createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntry
    createEmspcrEMSSceneSectionEMSFirstUnitEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicator
    createEmspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnScene
    createEmspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnSceneAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntry
    createEmspcrEMSSceneSectionEMSScenePatientCountEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCount
    createEmspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCountAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicator
    createEmspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntry
    createEmspcrEMSDispatchSectionEMDEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntryEMSEmergencyMedicalDispatchObservation
    createEmspcrEMSDispatchSectionEMDEntryEMSEmergencyMedicalDispatchObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntry
    createEmspcrEMSDispatchSectionDispatchComplaintEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntryEMSComplaintReportedByDispatch
    createEmspcrEMSDispatchSectionDispatchComplaintEntryEMSComplaintReportedByDispatchAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntry
    createEmspcrEMSDispositionSectionNumberOfPatientsEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntryEMSNumberOfPatientsObservation
    createEmspcrEMSDispositionSectionNumberOfPatientsEntryEMSNumberOfPatientsObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntry
    createEmspcrEMSDispositionSectionIncidentDispositionEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntryEMSIncidentDispositionObservation
    createEmspcrEMSDispositionSectionIncidentDispositionEntryEMSIncidentDispositionObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntry
    createEmspcrEMSDispositionSectionTransportModeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntryEMSTransportModeObservation
    createEmspcrEMSDispositionSectionTransportModeEntryEMSTransportModeObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntry
    createEmspcrEMSDispositionSectionTransportMethodEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntryEMSTransportMethodObservation
    createEmspcrEMSDispositionSectionTransportMethodEntryEMSTransportMethodObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntry
    createEmspcrEMSDispositionSectionDestinationChoiceReasonEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservation
    createEmspcrEMSDispositionSectionDestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntry
    createEmspcrEMSDispositionSectionPrearrivalActivationEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntryEMSPrearrivalActivationObservation
    createEmspcrEMSDispositionSectionPrearrivalActivationEntryEMSPrearrivalActivationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntry
    createEmspcrEMSDispositionSectionPatientConditionChangeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservation
    createEmspcrEMSDispositionSectionPatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntry
    createEmspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryEMSAdverseEventIndicator
    createEmspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryEMSAdverseEventIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntry
    createEmspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryEMSAdverseEventTypeObservation
    createEmspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryEMSAdverseEventTypeObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntry
    createEmspcrEMSProtocolSectionEMSProtocolEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservation
    createEmspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationship
    createEmspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipEMSProtocolAgeCategory
    createEmspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipEMSProtocolAgeCategoryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSCandidatePatientRegistryEntry
    createEmspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryEMSCandidatePatientRegistryType
    createEmspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryEMSCandidatePatientRegistryTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntry
    createEmspcrEMSResponseSectionEMSDelayEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizer
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationship
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationship
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationship
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationship
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay
    createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizer
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationNameAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitudeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude
    createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitudeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntry
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizer
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading
    createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntry
    createEmspcrEMSResponseSectionEMSResponseModeEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToScene
    createEmspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToSceneAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntry
    createEmspcrEMSSituationSectionEMSComplaintEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaint
    createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintType
    createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration
    createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDurationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationship
    createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem
    createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystemAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntry
    createEmspcrEMSSituationSectionEMSPossibleInjuryEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjury
    createEmspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjuryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntry
    createEmspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression
    createEmspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpressionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntry
    createEmspcrEMSSituationSectionEMSPrimarySymptomEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptom
    createEmspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptomAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntry
    createEmspcrEMSSituationSectionEMSOtherSymptomEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptoms
    createEmspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptomsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntry
    createEmspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions
    createEmspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressionsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntry
    createEmspcrEMSSituationSectionEMSPatientAcuityEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuity
    createEmspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntry
    createEmspcrEMSTimesSectionEMSTimesEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSCallTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSCallTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitNotifiedTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitNotifiedTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitEnRouteTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitEnRouteTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitOnSceneTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitOnSceneTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitAtPatienttTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitAtPatienttTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitLeftSceneTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitLeftSceneTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSPatientArrivedAtDestinationTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSPatientArrivedAtDestinationTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitBackInServiceTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitBackInServiceTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSDispatchNotifiedTime
    createEmspcrEMSTimesSectionEMSTimesEntryEMSDispatchNotifiedTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntry
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizer
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRate
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRate
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperature
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturation
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponent
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponent
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponent
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponent
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponent
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitals
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitalsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCardiacRhythm
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCardiacRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonDioxide
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonDioxideAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonMonoxide
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonMonoxideAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSBloodGlucose
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSBloodGlucoseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSLevelOfResponsiveness
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSLevelOfResponsivenessAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPainScore
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPainScoreAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSStrokeScore
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSStrokeScoreAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScore
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowTotal
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowTotalAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowQualifier
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowQualifierAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowEye
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowEyeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowMotor
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowMotorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowVerbal
    createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowVerbalAnnotations();
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
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1",
       "code.displayName", "EMS Patient Care Report",
       "constraints.validation.error", "PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsCode PatientCareReportCode PatientCareReportTitle PatientCareReportId GeneralHeaderConstraintsConfidentialityCode PatientCareReportRecordTarget PatientCareReportBilling PatientCareReportEMSCurrentMedication PatientCareReportEMSAllergiesAndAdverseReactionsSection PatientCareReportEMSPastMedicalHistory PatientCareReportEMSSocialHistory PatientCareReportEMSPhysicalAssessmentSection PatientCareReportEMSProceduresPerformedSection PatientCareReportEMSPatientCareNarrative PatientCareReportEMSSceneSection PatientCareReportComponentOf PatientCareReportEMSDispatchSection PatientCareReportEMSPersonnelAdverseEventSection PatientCareReportEMSProtocolSection PatientCareReportEMSResponseSection PatientCareReportEMSSituationSection PatientCareReportEMSVitalSignsSection PatientCareReportCustodian PatientCareReportDocumentationOf PatientCareReportRelatedDocument PatientCareReportParticipant",
       "confidentialityCode.codeSystemName", "ConfidentialityCode",
       "code.code", "67796-3",
       "confidentialityCode.codeSystem", "2.16.840.1.113883.5.25",
       "constraints.validation.info", "PatientCareReportVersionNumber PatientCareReportSection PatientCareReportEMSCardiacArrestEvent PatientCareReportEMSMedicationsAdministeredSection PatientCareReportEMSDispositionSection PatientCareReportEMSTimesSection",
       "title.mixed", "EMS Patient Care Report",
       "code.codeSystemName", "LOINC",
       "constraints.validation.warning", "PatientCareReportEMSAdvanceDirectives PatientCareReportEMSHumanAuthorParticipation",
       "classCode", "DOCCLIN",
       "constraints.validation.dependOn.GeneralHeaderConstraintsCode", "PatientCareReportCode",
       "moodCode", "EVN"
       });																																																																																																																																																																																																														
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Billing Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Billing Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.5",
       "constraints.validation.error", "EMSBillingSectionTemplateId EMSBillingSectionCode EMSBillingSectionTitle EMSBillingSectionText EMSBillingSectionBillingConditionentry EMSBillingSectionLosentry",
       "code.codeSystemName", "LOINC",
       "code.code", "67659-3"
       });																																		
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "Injury Incident Description Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Injury Incident Description Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.17",
       "constraints.validation.error", "EMSInjuryIncidentDescriptionSectionTemplateId EMSInjuryIncidentDescriptionSectionCode EMSInjuryIncidentDescriptionSectionTitle EMSInjuryIncidentDescriptionSectionText",
       "code.codeSystemName", "LOINC",
       "code.code", "11374-6",
       "constraints.validation.info", "EMSInjuryIncidentDescriptionSectionEntry3 EMSInjuryIncidentDescriptionSectionEntry4 EMSInjuryIncidentDescriptionSectionEntry5 EMSInjuryIncidentDescriptionSectionEntry6 EMSInjuryIncidentDescriptionSectionEntry7 EMSInjuryIncidentDescriptionSectionEntry8 EMSInjuryIncidentDescriptionSectionEntry9 EMSInjuryIncidentDescriptionSectionEntry10 EMSInjuryIncidentDescriptionSectionEntry11 EMSInjuryIncidentDescriptionSectionEntry12"
       });																																																																																																		
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Current Medications Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Current Medications Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.15",
       "constraints.validation.error", "EMSCurrentMedicationSectionTemplateId EMSCurrentMedicationSectionCode EMSCurrentMedicationSectionTitle EMSCurrentMedicationSectionText EMSCurrentMedicationSectionEntry1 EMSCurrentMedicationSectionEntry2 EMSCurrentMedicationSectionEntry3",
       "code.codeSystemName", "LOINC",
       "code.code", "67844-1"
       });																																													
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "title.mixed", "EMS Cardiac Arrest Event",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Cardiac Arrest Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.14",
       "constraints.validation.error", "EMSCardiacArrestEventSectionTemplateId EMSCardiacArrestEventSectionCode EMSCardiacArrestEventSectionTitle EMSCardiacArrestEventSectionText EMSCardiacArrestEventSectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67799-7",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																														
    addAnnotation
      (emsAdvanceDirectivesSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Advance Directives Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Advance Directives Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.12",
       "constraints.validation.error", "EMSAdvanceDirectivesSectionTemplateId EMSAdvanceDirectivesSectionCode EMSAdvanceDirectivesSectionTitle EMSAdvanceDirectivesSectionText EMSAdvanceDirectivesSectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67840-9"
       });																										
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Allergies and Adverse Reactions",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Allergies and Adverse Reactions  Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.13",
       "constraints.validation.error", "EMSAllergiesAndAdverseReactionsSectionTemplateId EMSAllergiesAndAdverseReactionsSectionCode EMSAllergiesAndAdverseReactionsSectionTitle EMSAllergiesAndAdverseReactionsSectionText EMSAllergiesAndAdverseReactionsSectionEntry1 EMSAllergiesAndAdverseReactionsSectionEntry2",
       "code.codeSystemName", "LOINC",
       "code.code", "67841-7"
       });																																								
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Past Medical History",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Past Medical History Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.19",
       "constraints.validation.error", "EMSPastMedicalHistorySectionTemplateId EMSPastMedicalHistorySectionCode EMSPastMedicalHistorySectionCodeP EMSPastMedicalHistorySectionTitle EMSPastMedicalHistorySectionText EMSPastMedicalHistorySectionEntry1 EMSPastMedicalHistorySectionEntry2",
       "code.codeSystemName", "LOINC",
       "code.code", "67842-5"
       });																																													
    addAnnotation
      (emsSocialHistorySectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Social History",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Social History Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.22",
       "constraints.validation.error", "EMSSocialHistorySectionTemplateId EMSSocialHistorySectionCode EMSSocialHistorySectionCodeP EMSSocialHistorySectionTitle EMSSocialHistorySectionText EMSSocialHistorySectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67843-3"
       });																															
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Physical Assessment Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Physical Assessment Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.20",
       "constraints.validation.error", "EMSPhysicalAssessmentSectionTemplateId EMSPhysicalAssessmentSectionCode EMSPhysicalAssessmentSectionCodeP EMSPhysicalAssessmentSectionTitle EMSPhysicalAssessmentSectionText EMSPhysicalAssessmentSectionEntry1 EMSPhysicalAssessmentSectionEntry2 EMSPhysicalAssessmentSectionEntry3 EMSPhysicalAssessmentSectionEntry4 EMSPhysicalAssessmentSectionEntry5 EMSPhysicalAssessmentSectionEntry6",
       "code.codeSystemName", "LOINC",
       "code.code", "67668-4"
       });																																																																																					
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "Medications Administered Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Medications Administered Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.18",
       "constraints.validation.error", "EMSMedicationsAdministeredSectionTemplateId EMSMedicationsAdministeredSectionCode EMSMedicationsAdministeredSectionCodeP EMSMedicationsAdministeredSectionTitle EMSMedicationsAdministeredSectionText EMSMedicationsAdministeredSectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67849-0"
       });																																																
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Procedures Performed",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Procedures Performed Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.21",
       "constraints.validation.error", "EMSProceduresPerformedSectionTemplateId EMSProceduresPerformedSectionCode EMSProceduresPerformedSectionCodeP EMSProceduresPerformedSectionTitle EMSProceduresPerformedSectionText EMSProceduresPerformedSectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67802-9"
       });																																																			
    addAnnotation
      (emsPatientCareNarrativeSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Patient Care Report Narrative",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Patient Care Report Narrative Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.1",
       "constraints.validation.error", "EMSPatientCareNarrativeSectionTemplateId EMSPatientCareNarrativeSectionCode EMSPatientCareNarrativeSectionCodeP EMSPatientCareNarrativeSectionTitle EMSPatientCareNarrativeSectionText",
       "code.codeSystemName", "LOINC",
       "code.code", "67781-5"
       });																						
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Scene",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Scene Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.8",
       "constraints.validation.error", "EMSSceneSectionTemplateId EMSSceneSectionCode EMSSceneSectionTitle EMSSceneSectionText EMSSceneSectionEntry1 EMSSceneSectionEntry3",
       "code.codeSystemName", "LOINC",
       "code.code", "67665-0"
       });																																				
    addAnnotation
      (emsDispatchSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Dispatch",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Dispatch Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.2",
       "constraints.validation.error", "EMSDispatchSectionTemplateId EMSDispatchSectionCode EMSDispatchSectionTitle EMSDispatchSectionText EMSDispatchSectionEntry1 EMSDispatchSectionEntry2",
       "code.codeSystemName", "LOINC",
       "code.code", "67660-1"
       });																																		
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Disposition",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Disposition Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.4",
       "constraints.validation.error", "EMSDispositionSectionTemplateId EMSDispositionSectionCode EMSDispositionSectionCodeP EMSDispositionSectionTitle EMSDispositionSectionText",
       "code.codeSystemName", "LOINC",
       "code.code", "67796-3",
       "constraints.validation.info", "EMSDispositionSectionEntry1 EMSDispositionSectionEntry2 EMSDispositionSectionEntry3 EMSDispositionSectionEntry5 EMSDispositionSectionEntry7 EMSDispositionSectionEntry6 EMSDispositionSectionEntry4"
       });																																																																														
    addAnnotation
      (emsPersonnelAdverseEventSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "Exposures or Injuries of EMS Personnel",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Exposures or Injuries of EMS Personnel Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.6",
       "constraints.validation.error", "EMSPersonnelAdverseEventSectionTemplateId EMSPersonnelAdverseEventSectionCode EMSPersonnelAdverseEventSectionCodeP EMSPersonnelAdverseEventSectionTitle EMSPersonnelAdverseEventSectionText EMSPersonnelAdverseEventSectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67658-5",
       "constraints.validation.info", "EMSPersonnelAdverseEventSectionEntry2"
       });																																						
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Protocol Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Protocol Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.7",
       "constraints.validation.error", "EMSProtocolSectionTemplateId EMSProtocolSectionCode EMSProtocolSectionTitle EMSProtocolSectionText EMSProtocolSectionEntry1 EMSProtocolSectionEntry3",
       "code.codeSystemName", "LOINC",
       "code.code", "67537-1"
       });																																				
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Response",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Response Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.3",
       "constraints.validation.error", "EMSResponseSectionTemplateId EMSResponseSectionCode EMSResponseSectionCodeP EMSResponseSectionTitle EMSResponseSectionText EMSResponseSectionEntry1 EMSResponseSectionEntry2 EMSResponseSectionEntry3 EMSResponseSectionEntry4",
       "code.codeSystemName", "LOINC",
       "code.code", "67664-3"
       });																																																																													
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Situation Section",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Situation Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.9",
       "constraints.validation.error", "EMSSituationSectionTemplateId EMSSituationSectionCode EMSSituationSectionCodeP EMSSituationSectionTitle EMSSituationSectionText EMSSituationSectionEntry1 EMSSituationSectionEntry3 EMSSituationSectionEntry4 EMSSituationSectionEntry6 EMSSituationSectionEntry7 EMSSituationSectionEntry8",
       "code.codeSystemName", "LOINC",
       "code.code", "67666-8",
       "constraints.validation.info", "EMSSituationSectionEntry5"
       });																																																																																		
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Times",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Times Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.10",
       "constraints.validation.error", "EMSTimesSectionTemplateId EMSTimesSectionCode EMSTimesSectionTitle EMSTimesSectionText EMSTimesSectionEntry9",
       "code.codeSystemName", "LOINC",
       "code.code", "67667-6"
       });																																		
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Vital Signs",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Vital Signs Section",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.23",
       "constraints.validation.error", "EMSVitalSignsSectionTemplateId EMSVitalSignsSectionCode EMSVitalSignsSectionTitle EMSVitalSignsSectionText EMSVitalSignsSectionEntry1",
       "code.codeSystemName", "LOINC",
       "code.code", "67801-1"
       });																																																				
    addAnnotation
      (derivedEntryEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "2.16.840.1.1133883.17.3.10.1.24",
       "constraints.validation.error", "DerivedEntryTemplateId DerivedEntryTypeCode",
       "typeCode", "DRIV"
       });								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTarget</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSRecordTargetAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTarget";			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSRecordTargetPatientRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSRecordTargetPatientRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole";				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientRoleAddr PatientRoleId PatientRolePatient"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSRecordTargetPatientRolePatientAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient";					
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "raceCode.codeSystem", "2.16.840.1.113883.6.238",
       "raceCode.codeSystemName", "Race and Ethnicity - CDC",
       "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode",
       "ethnicGroupCode.codeSystemName", "Race and Ethnicity - CDC",
       "constraints.validation.error", "PatientEthnicGroupCode PatientName PatientRaceCode PatientSDTCRaceCode PatientAdministrativeGenderCode PatientAdministrativeGenderCodeP",
       "constraints.validation.warning", "PatientBirthTime",
       "ethnicGroupCode.codeSystem", "2.16.840.1.113883.6.238",
       "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
       "sDTCRaceCode.codeSystem", "2.16.840.1.113883.6.238",
       "sDTCRaceCode.codeSystemName", "Race and Ethnicity - CDC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipation</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSAuthorParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipation";						
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthorParticipationEMSAuthorRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRole</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRole";							
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthorRoleId EMSAuthorRoleAddr EMSAuthorRoleTelecom EMSAuthorRoleEMSHumanAuthor EMSAuthorRoleEMSAuthoringDevice"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSHumanAuthor</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSHumanAuthorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSHumanAuthor";								
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHumanAuthorName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSAuthoringDevice</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSAuthoringDeviceAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthorParticipationEMSAuthorRoleEMSAuthoringDevice";									
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthoringDeviceManufacturerModelName EMSAuthoringDeviceSoftwareName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship";										
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSEncompassingEncounterRelationshipTypeCode EMSEncompassingEncounterRelationshipEncompassingEncounter",
       "typeCode", "COMP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter";											
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EncompassingEncounterEffectiveTime"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation";												
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "LocationHealthCareFacility"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility";													
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "HealthCareFacilityId HealthCareFacilityCode HealthCareFacilityPlace",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace";														
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PlaceClassCode",
       "classCode", "PLC",
       "constraints.validation.info", "PlaceName PlaceAddr"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipation</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSCustodianParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipation";															
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCustodianParticipationEMSCustodianRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipationEMSCustodianRole</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipationEMSCustodianRole";																
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCustodianRoleEMSCustodian"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleEMSCustodian</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleEMSCustodianAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSCustodianParticipationEMSCustodianRoleEMSCustodian";																	
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCustodianAddr EMSCustodianId EMSCustodianName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSServiceEventParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipation";																		
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSServiceEventParticipationEMSServiceEvent"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent";																			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSServiceEventCode EMSServiceEventId EMSServiceEventEMSPerformerParticipation",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation";																				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "functionCode.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSPerformerParticipationFunctionCode EMSPerformerParticipationEMSPerformerRole",
       "functionCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole";																					
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSPerformerRoleCode EMSPerformerRoleCodeP EMSPerformerRoleId EMSPerformerRoleAddr EMSPerformerRoleTelecom EMSPerformerRoleEMSPerformer",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleEMSPerformer</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleEMSPerformerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleEMSPerformer";																						
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPerformerName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSParentDocumentRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship";																							
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RPLC",
       "constraints.validation.info", "EMSParentDocumentRelationshipEMSParentDocument"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationshipEMSParentDocument</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSParentDocumentRelationshipEMSParentDocumentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationshipEMSParentDocument";																								
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSParentDocumentId"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSDestinationParticipantParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation";																									
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDestinationParticipantParticipationTypeCode",
       "typeCode", "DST"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole";																										
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSDestinationRoleCode",
       "code.codeSystemName", "LOINC",
       "constraints.validation.warning", "EMSDestinationRoleAddr"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleDestinationOrganization</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleDestinationOrganizationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleDestinationOrganization";																											
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DestinationOrganizationName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>duplicates</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createDuplicatesAnnotations() {
    String source = "duplicates";																												
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSBillingSectionBillingConditionEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry";																																																																																																																																																																																																																
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "BillingConditionEntryObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSBillingSectionBillingConditionEntryBillingConditionAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition";																																																																																																																																																																																																																	
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "ICD-10 CM",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Billing condition",
       "constraints.validation.error", "BillingConditionCode BillingConditionCodeP BillingConditionValue BillingConditionValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67556-1",
       "value.codeSystem", "2.16.840.1.113883.6.90",
       "constraints.validation.dependOn.BillingConditionCode", "BillingConditionCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntry</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSBillingSectionLevelOfServiceEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntry";																																																																																																																																																																																																																		
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "LevelOfServiceEntryObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntryLevelOfServiceObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSBillingSectionLevelOfServiceEntryLevelOfServiceObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntryLevelOfServiceObservation";																																																																																																																																																																																																																			
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS level of service",
       "constraints.validation.dependOn.LevelOfServiceObservationCode", "LevelOfServiceObservationCodeP",
       "constraints.validation.error", "LevelOfServiceObservationCode LevelOfServiceObservationCodeP LevelOfServiceObservationValue LevelOfServiceObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "69464-6",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntry";																																																																																																																																																																																																																																																	
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "InjuryCauseEntryInjuryCauseCategory"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryInjuryCauseCategory</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryInjuryCauseCategoryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryInjuryCauseCategory";																																																																																																																																																																																																																																																		
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "ICD-10",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Injury Cause",
       "constraints.validation.error", "InjuryCauseCategoryCode InjuryCauseCategoryValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69543-7",
       "value.codeSystem", "2.16.840.1.113883.6.3.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntry";																																																																																																																																																																																																																																																			
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "InjuryMechanismEntryInjuryMechanism"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryInjuryMechanism</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryInjuryMechanismAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryInjuryMechanism";																																																																																																																																																																																																																																																				
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Injury Mechanism",
       "constraints.validation.error", "InjuryMechanismCode InjuryMechanismValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67494-5",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntry";																																																																																																																																																																																																																																																					
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TraumaCenterCriteriaEntryTraumaCenterCriteria"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryTraumaCenterCriteria</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryTraumaCenterCriteriaAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryTraumaCenterCriteria";																																																																																																																																																																																																																																																						
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Trauma Center Critieria",
       "constraints.validation.error", "TraumaCenterCriteriaCode TraumaCenterCriteriaValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67495-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntry";																																																																																																																																																																																																																																																							
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "InjuryRiskFactorEntryInjuryRiskFactor"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryInjuryRiskFactor</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryInjuryRiskFactorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryInjuryRiskFactor";																																																																																																																																																																																																																																																								
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Other injury risk factors",
       "constraints.validation.error", "InjuryRiskFactorCode InjuryRiskFactorValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67496-0",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntry";																																																																																																																																																																																																																																																									
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "VehicleImpactAreaEntryVehicleImpactArea"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryVehicleImpactArea</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryVehicleImpactAreaAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryVehicleImpactArea";																																																																																																																																																																																																																																																										
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Location of impact on the vehicle",
       "constraints.validation.error", "VehicleImpactAreaCode VehicleImpactAreaValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67497-8",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntry";																																																																																																																																																																																																																																																											
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientLocationInVehicleEntryPatientLocationInVehicle"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryPatientLocationInVehicle</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryPatientLocationInVehicleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryPatientLocationInVehicle";																																																																																																																																																																																																																																																												
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Location of patient in vehicle",
       "constraints.validation.error", "PatientLocationInVehicleCode PatientLocationInVehicleValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67498-6",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntry";																																																																																																																																																																																																																																																													
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "VehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipment"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipment";																																																																																																																																																																																																																																																														
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Safety equipment",
       "constraints.validation.error", "VehicleOccupantSafetyEquipmentCode VehicleOccupantSafetyEquipmentValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67499-4",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntry";																																																																																																																																																																																																																																																															
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AirbagDeploymentEntryAirbagDeploymentStatus"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAirbagDeploymentStatus</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAirbagDeploymentStatusAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAirbagDeploymentStatus";																																																																																																																																																																																																																																																																
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Airbag deployment",
       "constraints.validation.error", "AirbagDeploymentStatusCode AirbagDeploymentStatusValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67500-9",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntry";																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "FallHeightEntryHeightOfFall"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryHeightOfFall</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryHeightOfFallAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryHeightOfFall";																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Height of fall",
       "constraints.validation.error", "HeightOfFallCode HeightOfFallValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67501-7"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntry";																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DisasterTypeEntryDisasterType"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryDisasterType</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryDisasterTypeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryDisasterType";																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Suspected intentional or unintentional disaster",
       "constraints.validation.error", "DisasterTypeCode DisasterTypeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69463-8",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionOnMedicationEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntry";																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "OnMedicationEntryCurrentlyOnMedication"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntryCurrentlyOnMedication</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionOnMedicationEntryCurrentlyOnMedicationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntryCurrentlyOnMedication";																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Currently on medication",
       "constraints.validation.error", "CurrentlyOnMedicationCode CurrentlyOnMedicationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67791-4"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntry";																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "OnAnticoagulantsEntryPatientOnAnticoagulants"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryPatientOnAnticoagulants</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryPatientOnAnticoagulantsAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryPatientOnAnticoagulants";																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Patient on anticoagulants",
       "constraints.validation.error", "PatientOnAnticoagulantsCode PatientOnAnticoagulantsValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69749-0"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntry";																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "CurrentMedicationEntryEMSCurrentMedication"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedication</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedication";																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSCurrentMedicationRouteCode", "EMSCurrentMedicationRouteCodeP",
       "constraints.validation.error", "EMSCurrentMedicationRouteCode EMSCurrentMedicationEMSCurrentMedicationConsumable",
       "routeCode.codeSystem", "2.16.840.1.113883.3.26.1.1.1",
       "constraints.validation.warning", "EMSCurrentMedicationDoseQuantity EMSCurrentMedicationRouteCodeP",
       "routeCode.codeSystemName", "FDA Route of Administration",
       "constraints.validation.info", "EMSCurrentMedicationNegationInd EMSCurrentMedicationNullFlavor"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumable</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumable";																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCurrentMedicationConsumableManufacturedProduct"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProduct</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProduct";																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCurrentMedicationProductManufacturedLabeledDrug"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrugAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug";																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "constraints.validation.error", "EMSCurrentMedicationDrugCode EMSCurrentMedicationDrugCodeP",
       "code.codeSystemName", "RxNorm"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntry";																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "CardiacArrestEntryCardiacArrestExistence"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistence</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistence";																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.displayName", "cardiac arrest",
       "value.codeSystemName", "SNOMEDCT",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.displayName", "ASSERTION",
       "value.code", "410429000",
       "constraints.validation.error", "CardiacArrestExistenceCode CardiacArrestExistenceValue",
       "code.codeSystemName", "HL7ActCode",
       "constraints.validation.warning", "CardiacArrestExistenceEffectiveTime CardiacArrestExistenceNegationInd",
       "code.code", "ASSERTION",
       "constraints.validation.info", "CardiacArrestExistenceCardiacArrestCauseRelationship CardiacArrestExistenceCardiacArrestTimingRelationship CardiacArrestExistenceCardiacArrestInformantParticipation CardiacArrestExistencePriorCPRRelationship CardiacArrestExistencePriorAEDRelationship CardiacArrestExistenceSpontaneousCirculationRelationship CardiacArrestExistenceDestinationRhythmRelationship CardiacArrestExistenceArrestRhythmRelationship",
       "value.codeSystem", "2.16.840.1.113883.6.96"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "CardiacArrestTimingRelationshipInversionInd CardiacArrestTimingRelationshipTypeCode CardiacArrestTimingRelationshipCardiacArrestTiming",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTimingAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming";																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Cardiac arrest occurrence",
       "constraints.validation.error", "CardiacArrestTimingCode CardiacArrestTimingValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67502-5",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationship";																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "CardiacArrestCauseRelationshipInversionInd CardiacArrestCauseRelationshipTypeCode CardiacArrestCauseRelationshipCardiacArrestCause",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCauseAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause";																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Cardiac arrest cause",
       "constraints.validation.error", "CardiacArrestCauseCode CardiacArrestCauseValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67503-3",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipation";																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "CardiacArrestInformantParticipationTypeCode CardiacArrestInformantParticipationCardiacArrestInformantRole",
       "typeCode", "INF"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole";																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "CardiacArrestInformantRoleClassCode CardiacArrestInformantRoleCode",
       "code.codeSystemName", "LOINC",
       "classCode", "AGNT"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationship";																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "PriorCPRRelationshipInversionInd PriorCPRRelationshipTypeCode PriorCPRRelationshipPriorCPR",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR";																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "CPR prior to EMS arrival",
       "constraints.validation.error", "PriorCPRCode PriorCPRValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67506-6",
       "constraints.validation.info", "PriorCPRPriorCPRProviderParticipation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation";																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PriorCPRProviderParticipationPriorCPRProvider",
       "typeCode", "RESP",
       "constraints.validation.info", "PriorCPRProviderParticipationTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProviderAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider";																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "PriorCPRProviderCode",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationship";																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "PriorAEDRelationshipInversionInd PriorAEDRelationshipTypeCode PriorAEDRelationshipPriorAEDUse",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUseAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse";																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "AED use prior to EMS arrival",
       "constraints.validation.error", "PriorAEDUseCode PriorAEDUseValue PriorAEDUsePriorAEDProviderParticipation",
       "code.codeSystemName", "LOINC",
       "code.code", "67508-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation";																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PriorAEDProviderParticipationPriorAEDProvider",
       "typeCode", "RESP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProviderAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider";																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "PriorAEDProviderCode",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationship";																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "ArrestRhythmRelationshipInversionInd ArrestRhythmRelationshipTypeCode ArrestRhythmRelationshipObservation",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythmAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm";																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "First monitored rhythm",
       "constraints.validation.error", "ArrestRhythmCode ArrestRhythmValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67512-4",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "SpontaneousCirculationRelationshipInversionInd SpontaneousCirculationRelationshipTypeCode SpontaneousCirculationRelationshipReturnOfSpontaneousCirculation",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation";																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Return of spontaneous circulation",
       "constraints.validation.error", "ReturnOfSpontaneousCirculationCode ReturnOfSpontaneousCirculationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67513-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "DestinationRhythmRelationshipInversionInd DestinationRhythmRelationshipTypeCode DestinationRhythmRelationshipDestinationRhythm",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythmAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm";																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Cardiac rhythm",
       "constraints.validation.error", "DestinationRhythmCode DestinationRhythmValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67519-9",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsAdvanceDirectivesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsAdvanceDirectivesSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "null",
       "code.displayName", "Advanced directive",
       "constraints.validation.error", "EMSAdvancedDirectiveObservationTemplateId EMSAdvancedDirectiveObservationCode EMSAdvancedDirectiveObservationValue EMSAdvancedDirectiveObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67516-5",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "MedicationAllergyEntryEMSExistenceOfDrugAllergyObservation",
       "constraints.validation.info", "MedicationAllergyEntryEMSDrugAllergyObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSExistenceOfDrugAllergyObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSExistenceOfDrugAllergyObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSExistenceOfDrugAllergyObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Existence of drug allergy",
       "constraints.validation.error", "EMSExistenceOfDrugAllergyObservationCode EMSExistenceOfDrugAllergyObservationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67794-8"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSDrugAllergyObservationCode", "EMSDrugAllergyObservationCodeP",
       "value.displayName", "allergy",
       "value.codeSystemName", "SNOMEDCT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Drug allergy",
       "value.code", "106190000",
       "constraints.validation.error", "EMSDrugAllergyObservationCode EMSDrugAllergyObservationCodeP EMSDrugAllergyObservationValue EMSDrugAllergyObservationEMSDrugAllergyParticipation",
       "code.codeSystemName", "LOINC",
       "code.code", "67850-8",
       "value.codeSystem", "2.16.840.1.113883.6.96"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDrugAllergyParticipationEMSDrugAllergyParticipantRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDrugAllergyParticipantRoleEMSDrugAllergyEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity";																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "constraints.validation.error", "EMSDrugAllergyEntityCode",
       "code.codeSystemName", "RxNorm"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EnvironmentalAllergyEntryEMSEnvironmentalAllergies"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergies</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergies";																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy",
       "constraints.validation.info", "EMSEnvironmentalAllergiesEMSEnvironmentalAllergy"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergyAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy";																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Existence of environmental allergy",
       "constraints.validation.error", "EMSExistenceOfEnvironmentalAllergyCode EMSExistenceOfEnvironmentalAllergyValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69747-4"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergyAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy";																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Known allergies to food or environmental agents",
       "constraints.validation.error", "EMSEnvironmentalAllergyCode EMSEnvironmentalAllergyValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69748-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "HistoryOfConditionsEntryEMSHistoryOfConditions"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponent",
       "constraints.validation.info", "EMSHistoryOfConditionsOrganizerHistoryOfConditionComponent"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfCondition"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfCondition</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfConditionAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfCondition";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Has the patient had any significant medical conditions",
       "constraints.validation.error", "EMSExistenceOfHistoryOfConditionCode EMSExistenceOfHistoryOfConditionValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67793-0"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "HistoryOfConditionComponentEMSHistoryOfCondition"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentEMSHistoryOfCondition</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentEMSHistoryOfConditionAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentEMSHistoryOfCondition";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSHistoryOfConditionCode", "EMSHistoryOfConditionCodeP",
       "value.codeSystemName", "ICD-10 CM",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS History of Condition",
       "constraints.validation.error", "EMSHistoryOfConditionCode EMSHistoryOfConditionCodeP EMSHistoryOfConditionValue EMSHistoryOfConditionValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "68487-8",
       "value.codeSystem", "2.16.840.1.113883.6.90"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHistoryOfProceduresOrganizerComponent",
       "constraints.validation.info", "EMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponent"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSExistenceOfHistoryOfProcedureComponentProcedure"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentEMSExistenceOfHistoryOfProcedures</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentEMSExistenceOfHistoryOfProceduresAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentEMSExistenceOfHistoryOfProcedures";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS existence of history of procedures",
       "constraints.validation.error", "EMSExistenceOfHistoryOfProceduresCode EMSExistenceOfHistoryOfProceduresValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67792-2"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHistoryOfProceduresComponentEMSHistoryOfProcedure"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentEMSHistoryOfProcedure</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentEMSHistoryOfProcedureAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentEMSHistoryOfProcedure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsPastMedicalHistorySectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.4",
       "constraints.validation.error", "EMSHistoryOfProcedureCode",
       "code.codeSystemName", "ICD-10 PCS"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSocialHistorySectionEMSDrugUseEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsSocialHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDrugUseEntryEMSExistenceOfDrugUseIndicator",
       "constraints.validation.info", "EMSDrugUseEntryEMSDrugUseIndicator"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSExistenceOfDrugUseIndication</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSocialHistorySectionEMSDrugUseEntryEMSExistenceOfDrugUseIndicationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSExistenceOfDrugUseIndication";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsSocialHistorySectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Indications of drug or alcohol use by the patient",
       "constraints.validation.error", "EMSExistenceOfDrugUseIndicationCode EMSExistenceOfDrugUseIndicationCodeP EMSExistenceOfDrugUseIndicationValue",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSExistenceOfDrugUseIndicationCode", "EMSExistenceOfDrugUseIndicationCodeP",
       "code.code", "69757-3"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSDrugUseIndication</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSocialHistorySectionEMSDrugUseEntryEMSDrugUseIndicationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSDrugUseIndication";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsSocialHistorySectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Alcohol - drug use",
       "constraints.validation.error", "EMSDrugUseIndicationCode EMSDrugUseIndicationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67669-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionEMSNeurologicalAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionEMSNeurologicalAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionEMSNeurologicalAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSNeurologicalAssessmentCode", "EMSNeurologicalAssessmentCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Neurological status assessment",
       "constraints.validation.error", "EMSNeurologicalAssessmentCode EMSNeurologicalAssessmentCodeP EMSNeurologicalAssessmentValue EMSNeurologicalAssessmentValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67536-3",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PhysicalAssessmentEntryEMSPhysicalAssessmentOrganizer"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPhysicalAssessmentOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPhysicalAssessmentOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPhysicalAssessmentOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPhysicalAssessmentOrganizerEffectiveTime"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryPatientBodyWeight</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryPatientBodyWeightAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryPatientBodyWeight";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "null",
       "constraints.validation.error", "PatientBodyWeightTemplateId PatientBodyWeightCode PatientBodyWeightValue",
       "code.codeSystemName", "LOINC",
       "code.code", "8335-2"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryLengthBasedPatientBodyWeightClass</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryLengthBasedPatientBodyWeightClassAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryLengthBasedPatientBodyWeightClass";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.LengthBasedPatientBodyWeightClassCode", "LengthBasedPatientBodyWeightClassCodeP",
       "constraints.validation.error", "LengthBasedPatientBodyWeightClassCode LengthBasedPatientBodyWeightClassCodeP LengthBasedPatientBodyWeightClassValue LengthBasedPatientBodyWeightClassEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67670-0",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSSkinAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSSkinAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSSkinAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "null",
       "constraints.validation.error", "EMSSkinAssessmentTemplateId EMSSkinAssessmentCode EMSSkinAssessmentCodeP EMSSkinAssessmentValue EMSSkinAssessmentValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67524-9",
       "constraints.validation.dependOn.EMSSkinAssessmentCode", "EMSSkinAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeadAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeadAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeadAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSHeadAssessmentCode", "EMSHeadAssessmentCodeP",
       "constraints.validation.error", "EMSHeadAssessmentCode EMSHeadAssessmentCodeP EMSHeadAssessmentValue EMSHeadAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67525-6",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSFaceAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSFaceAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSFaceAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSFaceAssessmentCode EMSFaceAssessmentCodeP EMSFaceAssessmentValue EMSFaceAssessmentValueP EMSFaceAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67526-4",
       "constraints.validation.dependOn.EMSFaceAssessmentCode", "EMSFaceAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSNeckAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSNeckAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSNeckAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Neck assessment finding",
       "constraints.validation.error", "EMSNeckAssessmentCode EMSNeckAssessmentValue EMSNeckAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67527-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSChestAndLungsAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSChestAndLungsAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSChestAndLungsAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Chest and lungs assessment",
       "constraints.validation.error", "EMSChestAndLungsAssessmentCode EMSChestAndLungsAssessmentValue EMSChestAndLungsAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67528-0",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeartAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeartAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeartAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Heart assessment finding",
       "constraints.validation.error", "EMSHeartAssessmentCode EMSHeartAssessmentCodeP EMSHeartAssessmentValue EMSHeartAssessmentValueP EMSHeartAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67529-8",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSHeartAssessmentCode", "EMSHeartAssessmentCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSAbdomenAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSAbdomenAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSAbdomenAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Abdomen assessment",
       "constraints.validation.error", "EMSAbdomenAssessmentCode EMSAbdomenAssessmentValue EMSAbdomenAssessmentTargetSiteCode EMSAbdomenAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "code.code", "67530-6",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPelvicAndGenitourinaryAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPelvicAndGenitourinaryAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPelvicAndGenitourinaryAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Pelvic and genitourinary assessment",
       "constraints.validation.error", "EMSPelvicAndGenitourinaryAssessmentCode EMSPelvicAndGenitourinaryAssessmentValue EMSPelvicAndGenitourinaryAssessmentValueP EMSPelvicAndGenitourinaryAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "67531-4",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSBackAndSpineAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSBackAndSpineAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSBackAndSpineAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSBackAndSpineAssessmentCode", "EMSBackAndSpineAssessmentCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Back and spine assessment",
       "constraints.validation.error", "EMSBackAndSpineAssessmentCode EMSBackAndSpineAssessmentCodeP EMSBackAndSpineAssessmentTargetSiteCode EMSBackAndSpineAssessmentTargetSiteCodeP EMSBackAndSpineAssessmentValue EMSBackAndSpineAssessmentValueP EMSBackAndSpineAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "code.code", "67532-2",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSExtremitiesAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSExtremitiesAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSExtremitiesAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Extremities assessment",
       "constraints.validation.error", "EMSExtremitiesAssessmentCode EMSExtremitiesAssessmentCodeP EMSExtremitiesAssessmentTargetSiteCode EMSExtremitiesAssessmentValue EMSExtremitiesAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "code.code", "67533-0",
       "constraints.validation.dependOn.EMSExtremitiesAssessmentCode", "EMSExtremitiesAssessmentCodeP",
       "constraints.validation.info", "EMSExtremitiesAssessmentTargetSiteCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSEyeAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSEyeAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSEyeAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSEyeAssessmentCode", "EMSEyeAssessmentCodeP",
       "code.displayName", "Eye assessment",
       "constraints.validation.error", "EMSEyeAssessmentCode EMSEyeAssessmentCodeP EMSEyeAssessmentTargetSiteCode EMSEyeAssessmentTargetSiteCodeP EMSEyeAssessmentValue EMSEyeAssessmentValueP EMSEyeAssessmentEffectiveTime",
       "code.codeSystemName", "LOINC",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "code.code", "67534-8",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSMentalStatusAssessment</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSMentalStatusAssessmentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSMentalStatusAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Mental status assessment",
       "constraints.validation.error", "EMSMentalStatusAssessmentCode EMSMentalStatusAssessmentValue",
       "constraints.validation.dependOn.EMSMentalStatusAssessmentCode", "EMSMentalStatusAssessmentCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "67535-5",
       "constraints.validation.info", "EMSMentalStatusAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPregnancyEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "PregnancyEntryPatientPregnancy"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntryPatientPregnancy</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPregnancyEntryPatientPregnancyAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntryPatientPregnancy";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Patient Pregnancy",
       "constraints.validation.error", "PatientPregnancyCode PatientPregnancyCodeP PatientPregnancyValue PatientPregnancyValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67471-3",
       "constraints.validation.dependOn.PatientPregnancyCode", "PatientPregnancyCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionOralIntakeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "OralIntakeEntryLastOralIntake"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntryLastOralIntake</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionOralIntakeEntryLastOralIntakeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntryLastOralIntake";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.LastOralIntakeCode", "LastOralIntakeCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Last oral intake",
       "constraints.validation.error", "LastOralIntakeCode LastOralIntakeCodeP LastOralIntakeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67517-3"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPatientAgeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientAgeEntryEMSPatientAge"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntryEMSPatientAge</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionPatientAgeEntryEMSPatientAgeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntryEMSPatientAge";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Patient age",
       "constraints.validation.error", "EMSPatientAgeCode EMSPatientAgeCodeP EMSPatientAgeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "30525-0",
       "constraints.validation.dependOn.EMSPatientAgeCode", "EMSPatientAgeCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionThrombolyticEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "ThrombolyticEntryEMSThrombolyticContraindications"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntryEMSThrombolyticContraindications</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionThrombolyticEntryEMSThrombolyticContraindicationsAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntryEMSThrombolyticContraindications";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Contraindications to thrombolytic use",
       "constraints.validation.error", "EMSThrombolyticContraindicationsCode EMSThrombolyticContraindicationsCodeP EMSThrombolyticContraindicationsValue",
       "constraints.validation.dependOn.EMSThrombolyticContraindicationsCode", "EMSThrombolyticContraindicationsCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "67523-1",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionBarrriersEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "BarrriersEntryEMSBarriersToPatientCare"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntryEMSBarriersToPatientCare</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPhysicalAssessmentSectionBarrriersEntryEMSBarriersToPatientCareAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntryEMSBarriersToPatientCare";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSBarriersToPatientCareCode", "EMSBarriersToPatientCareCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Barriers to patient care",
       "constraints.validation.error", "EMSBarriersToPatientCareCode EMSBarriersToPatientCareCodeP EMSBarriersToPatientCareValue EMSBarriersToPatientCareValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67523-1",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "MedicationAdministeredEntryEMSMedicationAdministered"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministered</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministered";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "approachSiteCode.codeSystem", "2.16.840.1.113883.6.96",
       "constraints.validation.error", "EMSMedicationAdministeredClassCode EMSMedicationAdministeredDoseQuantity EMSMedicationAdministeredEffectiveTime EMSMedicationAdministeredRouteCode EMSMedicationAdministeredRouteCodeP EMSMedicationAdministeredEMSMedicationConsumable EMSMedicationAdministeredMedicationAdministeredResponseRelationship EMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship",
       "routeCode.codeSystem", "2.16.840.1.113883.3.26.1.1.1",
       "approachSiteCode.codeSystemName", "SNOMEDCT",
       "classCode", "SBADM",
       "routeCode.codeSystemName", "FDA Route of Administration",
       "constraints.validation.warning", "EMSMedicationAdministeredApproachSiteCode",
       "constraints.validation.dependOn.EMSMedicationAdministeredApproachSiteCode", "EMSMedicationAdministeredApproachSiteCodeP",
       "approachSiteCode.code", "15562006",
       "constraints.validation.info", "EMSMedicationAdministeredNegationInd EMSMedicationAdministeredApproachSiteCodeP EMSMedicationAdministeredMedicationNotAdministeredEntryRelationship EMSMedicationAdministeredEMSMedicationComplicationRelationship EMSMedicationAdministeredEMSMedicationPerformerParticipation EMSMedicationAdministeredEMSMedicationAuthorizationRelationship EMSMedicationAdministeredMedicationAdministrationDeviceParticipant",
       "approachSiteCode.displayName", "structure of respiratory region of nose",
       "constraints.validation.dependOn.EMSMedicationAdministeredRouteCode", "EMSMedicationAdministeredRouteCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "MedicationNotAdministeredReasonEntryRelationshipInversionInd MedicationNotAdministeredReasonEntryRelationshipTypeCode MedicationNotAdministeredReasonEntryRelationshipTypeCodeP MedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation",
       "typeCode", "RSON",
       "constraints.validation.dependOn.MedicationNotAdministeredReasonEntryRelationshipTypeCode", "MedicationNotAdministeredReasonEntryRelationshipTypeCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.displayName", "Assertion",
       "constraints.validation.error", "MedicationNotAdministeredReasonObservationCode MedicationNotAdministeredReasonObservationValue MedicationNotAdministeredReasonObservationValueP",
       "code.codeSystemName", "HL7ActCode",
       "code.code", "ASSERTION",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationManfacturedProductEMSMedicationLabeledDrug"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrugAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "constraints.validation.error", "EMSMedicationLabeledDrugCode",
       "code.codeSystemName", "RxNorm"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAdministeredResponseRelationshipMedicationResponseObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Response to medication",
       "constraints.validation.dependOn.MedicationResponseObservationCode", "MedicationResponseObservationCodeP",
       "constraints.validation.error", "MedicationResponseObservationCode MedicationResponseObservationCodeP MedicationResponseObservationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67540-5",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationComplicationRelationshipEMSMedicationComplicationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Medication complication",
       "constraints.validation.error", "EMSMedicationComplicationObservationCode EMSMedicationComplicationObservationCodeP EMSMedicationComplicationObservationValue EMSMedicationComplicationObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67541-3",
       "constraints.validation.dependOn.EMSMedicationComplicationObservationCode", "EMSMedicationComplicationObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Prior administration",
       "constraints.validation.error", "EMSMedicationPriorAdministrationObservationCode EMSMedicationPriorAdministrationObservationCodeP EMSMedicationPriorAdministrationObservationValue",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSMedicationPriorAdministrationObservationCode", "EMSMedicationPriorAdministrationObservationCodeP",
       "code.code", "67539-7"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationPerformerParticipationEMSMedicationPerformerRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSMedicationPerformerRoleCode EMSMedicationPerformerRoleCodeP EMSMedicationPerformerRoleId",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAuthorizationRelationshipEMSMedicationAuthorization"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorizationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSMedicationAuthorizationClassCode EMSMedicationAuthorizationClassCodeP EMSMedicationAuthorizationCode",
       "constraints.validation.dependOn.EMSMedicationAuthorizationClassCode", "EMSMedicationAuthorizationClassCodeP",
       "code.codeSystemName", "LOINC",
       "classCode", "INFRM"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipant</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipant";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "MedicationAdministrationDeviceParticipantTypeCode MedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole",
       "typeCode", "DEV"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "MedicationAdministrationDeviceRoleClassCode",
       "classCode", "MANU"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDeviceAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "MedicationAdministrationDeviceCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ProceduresEntryEMSProcedure"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedure</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "statusCode.code", "Aborted",
       "constraints.validation.dependOn.EMSProcedureStatusCode", "EMSProcedureStatusCodeP",
       "templateId.root", "null",
       "approachSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSProcedureTemplateId EMSProcedureCode EMSProcedureEffectiveTime EMSProcedureStatusCode EMSProcedureApproachSiteCode EMSProcedureEMSProcedurePriorRelationship EMSProcedureEMSProcedureNumberOfAttemptsRelationship EMSProcedureEMSProcedureSuccessfulRelationship EMSProcedureEMSProcedureComplicationsRelationship EMSProcedureEMSProcedurePatientResponseRelationship EMSProcedureEMSProcedurePerformer",
       "approachSiteCode.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSProcedureApproachSiteCode", "EMSProcedureApproachSiteCodeP",
       "constraints.validation.info", "EMSProcedureStatusCodeP EMSProcedureApproachSiteCodeP EMSProcedureNegationInd EMSProcedureEMSAbandonedProcedureRelationship EMSProcedureEMSAirwayConfirmationRelationship"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.displayName", "Assertion",
       "constraints.validation.error", "EMSAbandonedProcedureReasonObservationCode EMSAbandonedProcedureReasonObservationCodeP EMSAbandonedProcedureReasonObservationValue EMSAbandonedProcedureReasonObservationValueP",
       "code.codeSystemName", "HL7ActCode",
       "code.code", "ASSERTION",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSAbandonedProcedureReasonObservationCode", "EMSAbandonedProcedureReasonObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedurePriorRelationshipEMSProcedurePriorIndicator"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicatorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSProcedurePriorIndicatorCode", "EMSProcedurePriorIndicatorCodeP",
       "code.displayName", "Procedure performed prior to EMS arrival",
       "constraints.validation.error", "EMSProcedurePriorIndicatorCode EMSProcedurePriorIndicatorCodeP EMSProcedurePriorIndicatorValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67542-1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSProcedureNumberOfAttemptsObservationCode", "EMSProcedureNumberOfAttemptsObservationCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Number of procedure attempts",
       "constraints.validation.error", "EMSProcedureNumberOfAttemptsObservationCode EMSProcedureNumberOfAttemptsObservationCodeP EMSProcedureNumberOfAttemptsObservationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67543-9"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSProcedureSuccessfulObservationCode", "EMSProcedureSuccessfulObservationCodeP",
       "code.displayName", "Procedure successful indicator",
       "constraints.validation.error", "EMSProcedureSuccessfulObservationCode EMSProcedureSuccessfulObservationCodeP EMSProcedureSuccessfulObservationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67544-7"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "null",
       "code.displayName", "Procedure complication",
       "constraints.validation.error", "EMSProcedureComplicationsObservationTemplateId EMSProcedureComplicationsObservationCode EMSProcedureComplicationsObservationCodeP EMSProcedureComplicationsObservationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67545-4",
       "constraints.validation.dependOn.EMSProcedureComplicationsObservationCode", "EMSProcedureComplicationsObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSProcedurePatientResponseObservationCode", "EMSProcedurePatientResponseObservationCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Procedure patient response",
       "constraints.validation.error", "EMSProcedurePatientResponseObservationCode EMSProcedurePatientResponseObservationCodeP EMSProcedurePatientResponseObservationValue EMSProcedurePatientResponseObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67546-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedurePerformerEMSProcedurePerformerEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntityAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSProcedurePerformerEntityCode EMSProcedurePerformerEntityCodeP EMSProcedurePerformerEntityId",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSAirwayConfirmationObservationCode", "EMSAirwayConfirmationObservationCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "null",
       "constraints.validation.error", "EMSAirwayConfirmationObservationTemplateId EMSAirwayConfirmationObservationCode EMSAirwayConfirmationObservationCodeP EMSAirwayConfirmationObservationMethodCode EMSAirwayConfirmationObservationMethodCodeP EMSAirwayConfirmationObservationValue EMSAirwayConfirmationObservationEffectiveTime EMSAirwayConfirmationObservationEMSAirwayDeviceParticipant",
       "methodCode.codeSystemName", "LOINC",
       "code.codeSystemName", "LOINC",
       "code.code", "71576-3",
       "methodCode.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantTypeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "EMSAirwayDeviceParticipantTypeCode",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Reason Not Attempted",
       "constraints.validation.error", "EMSReasonProcedureNotAttemptedObservationCode EMSReasonProcedureNotAttemptedObservationValue EMSReasonProcedureNotAttemptedObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67504-1",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSceneSectionEMSFirstUnitEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSFirstUnitEntryEMSFirstUnitIndicator EMSFirstUnitEntryEMSFirstUnitOnScene"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicator</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicatorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS reporter is first unit on scene",
       "constraints.validation.error", "EMSFirstUnitIndicatorCode EMSFirstUnitIndicatorCodeP EMSFirstUnitIndicatorValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67665-0",
       "constraints.validation.dependOn.EMSFirstUnitIndicatorCode", "EMSFirstUnitIndicatorCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnScene</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnSceneAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnScene";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSFirstUnitOnSceneCode", "EMSFirstUnitOnSceneCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Name of first unit on scene",
       "constraints.validation.error", "EMSFirstUnitOnSceneCode EMSFirstUnitOnSceneCodeP EMSFirstUnitOnSceneValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67481-2"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSceneSectionEMSScenePatientCountEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSScenePatientCountEntryEMSScenePatientCount EMSScenePatientCountEntryEMSMassCasualtyIndicator"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCount</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCountAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCount";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Count of patients at scene",
       "constraints.validation.error", "EMSScenePatientCountCode EMSScenePatientCountCodeP EMSScenePatientCountValue",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSScenePatientCountCode", "EMSScenePatientCountCodeP",
       "code.code", "67489-5"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicator</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicatorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMassCasualtyIndicatorCode EMSMassCasualtyIndicatorValue"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispatchSectionEMDEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsDispatchSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMDEntryEMSEmergencyMedicalDispatchObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntryEMSEmergencyMedicalDispatchObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispatchSectionEMDEntryEMSEmergencyMedicalDispatchObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntryEMSEmergencyMedicalDispatchObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsDispatchSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMDPerformed",
       "constraints.validation.error", "EMSEmergencyMedicalDispatchObservationCode EMSEmergencyMedicalDispatchObservationCodeP EMSEmergencyMedicalDispatchObservationValue EMSEmergencyMedicalDispatchObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67488-7",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSEmergencyMedicalDispatchObservationCode", "EMSEmergencyMedicalDispatchObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispatchSectionDispatchComplaintEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsDispatchSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "DispatchComplaintEntryEMSComplaintReportedByDispatch"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntryEMSComplaintReportedByDispatch</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispatchSectionDispatchComplaintEntryEMSComplaintReportedByDispatchAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntryEMSComplaintReportedByDispatch";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsDispatchSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSComplaintReportedByDispatchCode", "EMSComplaintReportedByDispatchCodeP",
       "code.displayName", "Complaint reported by dispatch",
       "constraints.validation.error", "EMSComplaintReportedByDispatchCode EMSComplaintReportedByDispatchCodeP EMSComplaintReportedByDispatchValue EMSComplaintReportedByDispatchValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67570-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionNumberOfPatientsEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "NumberOfPatientsEntryEMSNumberOfPatientsObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntryEMSNumberOfPatientsObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionNumberOfPatientsEntryEMSNumberOfPatientsObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntryEMSNumberOfPatientsObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Number of patients",
       "constraints.validation.error", "EMSNumberOfPatientsObservationCode EMSNumberOfPatientsObservationCodeP EMSNumberOfPatientsObservationValue",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSNumberOfPatientsObservationCode", "EMSNumberOfPatientsObservationCodeP",
       "code.code", "67547-0"
       });																																																																																																																																																																																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionIncidentDispositionEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "IncidentDispositionEntryEMSIncidentDispositionObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntryEMSIncidentDispositionObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionIncidentDispositionEntryEMSIncidentDispositionObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntryEMSIncidentDispositionObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS incident disposition",
       "constraints.validation.error", "EMSIncidentDispositionObservationCode EMSIncidentDispositionObservationCodeP EMSIncidentDispositionObservationValue EMSIncidentDispositionObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67548-8",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSIncidentDispositionObservationCode", "EMSIncidentDispositionObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionTransportModeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TransportModeEntryEMSTransportModeObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntryEMSTransportModeObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionTransportModeEntryEMSTransportModeObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntryEMSTransportModeObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSTransportModeObservationCode", "EMSTransportModeObservationCodeP",
       "code.displayName", "EMS transport mode",
       "constraints.validation.error", "EMSTransportModeObservationCode EMSTransportModeObservationCodeP EMSTransportModeObservationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67550-4"
       });																																																																																																																																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionTransportMethodEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TransportMethodEntryEMSTransportModeObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntryEMSTransportMethodObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionTransportMethodEntryEMSTransportMethodObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntryEMSTransportMethodObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS transport method",
       "constraints.validation.error", "EMSTransportMethodObservationCode EMSTransportMethodObservationCodeP EMSTransportMethodObservationValue EMSTransportMethodObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67549-6",
       "constraints.validation.dependOn.EMSTransportMethodObservationCode", "EMSTransportMethodObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionDestinationChoiceReasonEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionDestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS reason for choosing destination",
       "constraints.validation.error", "EMSReasonForChoosingDestinationObservationCode EMSReasonForChoosingDestinationObservationCodeP EMSReasonForChoosingDestinationObservationValue EMSReasonForChoosingDestinationObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67552-0",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSReasonForChoosingDestinationObservationCode", "EMSReasonForChoosingDestinationObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionPrearrivalActivationEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PrearrivalActivationEntryEMSPrearrivalActivationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntryEMSPrearrivalActivationObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionPrearrivalActivationEntryEMSPrearrivalActivationObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntryEMSPrearrivalActivationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS prearrival activation performed",
       "constraints.validation.error", "EMSPrearrivalActivationObservationCode EMSPrearrivalActivationObservationCodeP EMSPrearrivalActivationObservationValue EMSPrearrivalActivationObservationEffectiveTime",
       "code.codeSystemName", "LOINC",
       "code.code", "69462-0",
       "constraints.validation.dependOn.EMSPrearrivalActivationObservationCode", "EMSPrearrivalActivationObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionPatientConditionChangeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSDispositionSectionPatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS patient condition change at destination",
       "constraints.validation.error", "EMSPatientConditionChangeAtDestinationObservationCode EMSPatientConditionChangeAtDestinationObservationCodeP EMSPatientConditionChangeAtDestinationObservationValue EMSPatientConditionChangeAtDestinationObservationValueP",
       "constraints.validation.dependOn.EMSPatientConditionChangeAtDestinationObservationCode", "EMSPatientConditionChangeAtDestinationObservationCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "67551-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsPersonnelAdverseEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSExposureOrInjuryEntryEMSExposureOrInjuryIndicator"
       });																																																																																																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryEMSAdverseEventIndicator</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryEMSAdverseEventIndicatorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryEMSAdverseEventIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsPersonnelAdverseEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS personnel exposed or injured",
       "constraints.validation.error", "EMSAdverseEventIndicatorCode EMSAdverseEventIndicatorCodeP EMSAdverseEventIndicatorValue",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSAdverseEventIndicatorCode", "EMSAdverseEventIndicatorCodeP",
       "code.code", "67554-6"
       });																																																																																																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsPersonnelAdverseEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AdverseEventTypeEntryEMSAdverseEventTypeObservation"
       });																																																																																																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryEMSAdverseEventTypeObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryEMSAdverseEventTypeObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryEMSAdverseEventTypeObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsPersonnelAdverseEventSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS personnel adverse event type",
       "constraints.validation.dependOn.EMSAdverseEventTypeObservationCode", "EMSAdverseEventTypeObservationCodeP",
       "constraints.validation.error", "EMSAdverseEventTypeObservationCode EMSAdverseEventTypeObservationCodeP EMSAdverseEventTypeObservationValue EMSAdverseEventTypeObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67555-3",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProtocolSectionEMSProtocolEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProtocolEntryEMSProtocolObservation"
       });																																																																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSProtocolObservationCode", "EMSProtocolObservationCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS protocol",
       "constraints.validation.error", "EMSProtocolObservationCode EMSProtocolObservationCodeP EMSProtocolObservationValue EMSProtocolObservationValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67537-1",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProtocolAgeCategoryRelationshipEMSProtocolAgeCategory"
       });																																																																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipEMSProtocolAgeCategory</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipEMSProtocolAgeCategoryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSProtocolEntryEMSProtocolObservationEMSProtocolAgeCategoryRelationshipEMSProtocolAgeCategory";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Protocol age category",
       "constraints.validation.error", "EMSProtocolAgeCategoryCode EMSProtocolAgeCategoryCodeP EMSProtocolAgeCategoryValue EMSProtocolAgeCategoryValueP",
       "constraints.validation.dependOn.EMSProtocolAgeCategoryCode", "EMSProtocolAgeCategoryCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "67538-9",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSCandidatePatientRegistryEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSCandidatePatientRegistryEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCandidatePatientRegistryEntryEMSCandidatePatientRegistryType"
       });																																																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryEMSCandidatePatientRegistryType</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryEMSCandidatePatientRegistryTypeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionEMSCandidatePatientRegistryEntryEMSCandidatePatientRegistryType";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS candidate patient registry",
       "constraints.validation.error", "EMSCandidatePatientRegistryTypeCode EMSCandidatePatientRegistryTypeCodeP EMSCandidatePatientRegistryTypeValue EMSCandidatePatientRegistryTypeValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67553-8",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSCandidatePatientRegistryTypeCode", "EMSCandidatePatientRegistryTypeCodeP"
       });																																																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDelayEntryEMSDelayOrganizer"
       });																																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDelayOrganizerEMSDispatchDelayRelationship EMSDelayOrganizerEMSResponseDelayRelationship EMSDelayOrganizerEMSSceneDelayRelationship EMSDelayOrganizerEMSTransportDelayRelationship EMSDelayOrganizerEMSTurnaoundDelayRelationship"
       });																																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispatchDelayRelationshipEMSDispatchDelay"
       });																																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelayAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Dispatch delay",
       "constraints.validation.error", "EMSDispatchDelayCode EMSDispatchDelayCodeP EMSDispatchDelayValue EMSDispatchDelayValueP",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSDispatchDelayCode", "EMSDispatchDelayCodeP",
       "code.code", "67480-4",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseDelayRelationshipEMSResponseDelay"
       });																																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelayAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Response delay",
       "constraints.validation.error", "EMSResponseDelayCode EMSResponseDelayCodeP EMSResponseDelayValue EMSResponseDelayValueP",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSResponseDelayCode", "EMSResponseDelayCodeP",
       "code.code", "67557-9",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSSceneDelayRelationshipEMSSceneDelay"
       });																																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelayAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Scene delay",
       "constraints.validation.error", "EMSSceneDelayCode EMSSceneDelayCodeP EMSSceneDelayValue EMSSceneDelayValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67558-7",
       "constraints.validation.dependOn.EMSSceneDelayCode", "EMSSceneDelayCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSTransportDelayRelationshipEMSTransportDelay"
       });																																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelayAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSTransportDelayCode", "EMSTransportDelayCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Transport delay",
       "constraints.validation.error", "EMSTransportDelayCode EMSTransportDelayCodeP EMSTransportDelayValue EMSTransportDelayValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67559-5",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSTurnaoundDelayRelationshipEMSTurnaroundDelay"
       });																																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelayAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Turnaround delay",
       "constraints.validation.dependOn.EMSTurnaroundDelayCode", "EMSTurnaroundDelayCodeP",
       "constraints.validation.error", "EMSTurnaroundDelayCode EMSTurnaroundDelayCodeP EMSTurnaroundDelayValue EMSTurnaroundDelayValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67560-3",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLongtudeRelationship"
       });																																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "null",
       "constraints.validation.error", "EMSDispatchLocationNameRelationshipTemplateId EMSDispatchLocationNameRelationshipEMSDispatchLocationName"
       });																																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationNameAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Dispatch Location Name",
       "constraints.validation.error", "EMSDispatchLocationNameCode EMSDispatchLocationNameValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69466-1"
       });																																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "null",
       "constraints.validation.error", "EMSDispatchLocationLatitudeRelationshipTemplateId EMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude"
       });																																																																																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitudeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Dispatch Location Latitude",
       "constraints.validation.error", "EMSDispatchLocationLatitudeCode EMSDispatchLocationLatitudeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "52002-3"
       });																																																																																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "null",
       "constraints.validation.error", "EMSDispatchLocationLongitudeRelationshipTemplateId EMSDispatchLocationLongitudeRelationshipObservation"
       });																																																																																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitudeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Dispatch Location Longitude",
       "constraints.validation.error", "EMSDispatchLocationLongitudeCode EMSDispatchLocationLongitudeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "52003-1"
       });																																																																																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSOdometerReadingEntryEMSResponseOdometerReadingsOrganizer"
       });																																																																																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship"
       });																																																																																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading"
       });																																																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReadingAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Response odometer beginning reading",
       "constraints.validation.error", "EMSResponseBeginningOdometerReadingCode EMSResponseBeginningOdometerReadingCodeP EMSResponseBeginningOdometerReadingValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67484-6",
       "constraints.validation.dependOn.EMSResponseBeginningOdometerReadingCode", "EMSResponseBeginningOdometerReadingCodeP"
       });																																																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading"
       });																																																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReadingAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Response odometer on-scene reading",
       "constraints.validation.error", "EMSResponseOnSceneOdometerReadingCode EMSResponseOnSceneOdometerReadingCodeP EMSResponseOnSceneOdometerReadingValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67485-3",
       "constraints.validation.dependOn.EMSResponseOnSceneOdometerReadingCode", "EMSResponseOnSceneOdometerReadingCodeP"
       });																																																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading"
       });																																																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReadingAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Response odometer destination reading",
       "constraints.validation.error", "EMSResponseDestinationOdometerReadingCode EMSResponseDestinationOdometerReadingCodeP EMSResponseDestinationOdometerReadingValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67486-1",
       "constraints.validation.dependOn.EMSResponseDestinationOdometerReadingCode", "EMSResponseDestinationOdometerReadingCodeP"
       });																																																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading"
       });																																																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReadingAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Response odometer ending reading",
       "constraints.validation.dependOn.EMSResponseEndingOdometerReadingCode", "EMSResponseEndingOdometerReadingCodeP",
       "constraints.validation.error", "EMSResponseEndingOdometerReadingCode EMSResponseEndingOdometerReadingCodeP EMSResponseEndingOdometerReadingValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67487-9"
       });																																																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSResponseModeEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseModeEntryEMSResponseModeToScene"
       });																																																																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToScene</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToSceneAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToScene";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsResponseSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Response mode to scene",
       "constraints.validation.error", "EMSResponseModeToSceneCode EMSResponseModeToSceneCodeP EMSResponseModeToSceneValue EMSResponseModeToSceneValueP",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSResponseModeToSceneCode", "EMSResponseModeToSceneCodeP",
       "code.code", "67482-0",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSComplaintEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMSComplaintEntryEMSComplaint"
       });																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaint</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaint";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS complaint",
       "constraints.validation.error", "EMSComplaintCode EMSComplaintCodeP EMSComplaintTargetSiteCode EMSComplaintEffectiveTime",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSComplaintCode", "EMSComplaintCodeP",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.warning", "EMSComplaintTargetSiteCodeP EMSComplaintEMSComplaintOrganSystemRelationship",
       "code.code", "10154-3",
       "constraints.validation.info", "EMSComplaintValue EMSComplaintEMSComplaintDurationRelationship EMSComplaintEMSComplaintTypeRelationship",
       "targetSiteCode.codeSystemName", "LOINC"
       });																																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintType</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintTypeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintType";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSComplaintTypeCode", "EMSComplaintTypeCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Complaint type",
       "constraints.validation.error", "EMSComplaintTypeCode EMSComplaintTypeCodeP EMSComplaintTypeValue EMSComplaintTypeValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "72114-2",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDurationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSComplaintDurationCode", "EMSComplaintDurationCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Complaint duration",
       "constraints.validation.error", "EMSComplaintDurationCode EMSComplaintDurationCodeP EMSComplaintDurationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67491-1"
       });																																																																																																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationship</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem"
       });																																																																																																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystemAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Organ system",
       "constraints.validation.error", "EMSComplaintOrganSystemCode EMSComplaintOrganSystemCodeP EMSComplaintOrganSystemValue EMSComplaintOrganSystemValueP",
       "constraints.validation.dependOn.EMSComplaintOrganSystemCode", "EMSComplaintOrganSystemCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "69468-7",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSPossibleInjuryEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPossibleInjuryEntryEMSPossibleInjury"
       });																																																																																																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjury</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjuryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjury";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Possible injury",
       "constraints.validation.error", "EMSPossibleInjuryCode EMSPossibleInjuryCodeP EMSPossibleInjuryValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69467-9",
       "constraints.validation.dependOn.EMSPossibleInjuryCode", "EMSPossibleInjuryCodeP"
       });																																																																																																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression"
       });																																																																																																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpressionAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "ICD-10 CM",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSProviderPrimaryImpressionCode", "EMSProviderPrimaryImpressionCodeP",
       "code.displayName", "Provider Primary Impression",
       "constraints.validation.error", "EMSProviderPrimaryImpressionCode EMSProviderPrimaryImpressionCodeP EMSProviderPrimaryImpressionValue EMSProviderPrimaryImpressionValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67492-9",
       "value.codeSystem", "2.16.840.1.113883.6.90"
       });																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSPrimarySymptomEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPrimarySymptomEntryEMSPrimarySymptom"
       });																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptom</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptomAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptom";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "ICD-10 CM",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Primary Symptom",
       "constraints.validation.dependOn.EMSPrimarySymptomCode", "EMSPrimarySymptomCodeP",
       "constraints.validation.error", "EMSPrimarySymptomCode EMSPrimarySymptomCodeP EMSPrimarySymptomValue EMSPrimarySymptomValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67774-0",
       "value.codeSystem", "2.16.840.1.113883.6.90"
       });																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSOtherSymptomEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSOtherSymptomEntryEMSOtherSymptoms"
       });																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptoms</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptomsAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptoms";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "ICD-10 CM",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Other symptoms",
       "constraints.validation.dependOn.EMSOtherSymptomsCode", "EMSOtherSymptomsCodeP",
       "constraints.validation.error", "EMSOtherSymptomsCode EMSOtherSymptomsCodeP EMSOtherSymptomsValue EMSOtherSymptomsValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67776-5",
       "value.codeSystem", "2.16.840.1.113883.6.90"
       });																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions"
       });																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressionsAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "ICD-10 CM",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Provider Secondary Impressions",
       "constraints.validation.error", "EMSProviderSecondaryImpressionsCode EMSProviderSecondaryImpressionsCodeP EMSProviderSecondaryImpressionsValue EMSProviderSecondaryImpressionsValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "69542-9",
       "value.codeSystem", "2.16.840.1.113883.6.90",
       "constraints.validation.dependOn.EMSProviderSecondaryImpressionsCode", "EMSProviderSecondaryImpressionsCodeP"
       });																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSPatientAcuityEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPatientAcuityEntryEMSInitialPatientAcuity"
       });																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuity</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuityAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuity";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Initial Patient Acuity",
       "constraints.validation.error", "EMSInitialPatientAcuityCode EMSInitialPatientAcuityCodeP EMSInitialPatientAcuityValue EMSInitialPatientAcuityValueP",
       "constraints.validation.dependOn.EMSInitialPatientAcuityCode", "EMSInitialPatientAcuityCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "67493-7",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSTimesEntryEMSCallTime EMSTimesEntryEMSUnitNotifiedTime EMSTimesEntryEMSUnitEnRouteTime EMSTimesEntryEMSUnitOnSceneTime EMSTimesEntryEMSUnitAtPatienttTime EMSTimesEntryEMSUnitLeftSceneTime EMSTimesEntryEMSPatientArrivedAtDestinationTime EMSTimesEntryEMSUnitBackInServiceTime EMSTimesEntryEMSDispatchNotifiedTime"
       });																																																																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSCallTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSCallTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSCallTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Call time",
       "constraints.validation.error", "EMSCallTimeCode EMSCallTimeCodeP EMSCallTimeValue",
       "constraints.validation.dependOn.EMSCallTimeCode", "EMSCallTimeCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "69469-5"
       });																																																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitNotifiedTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitNotifiedTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitNotifiedTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Unit notified time",
       "constraints.validation.error", "EMSUnitNotifiedTimeCode EMSUnitNotifiedTimeCodeP EMSUnitNotifiedTimeValue",
       "constraints.validation.dependOn.EMSUnitNotifiedTimeCode", "EMSUnitNotifiedTimeCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "69471-1"
       });																																																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitEnRouteTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitEnRouteTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitEnRouteTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSUnitEnRouteTimeCode", "EMSUnitEnRouteTimeCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Unit en route time",
       "constraints.validation.error", "EMSUnitEnRouteTimeCode EMSUnitEnRouteTimeCodeP EMSUnitEnRouteTimeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69472-9"
       });																																																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitOnSceneTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitOnSceneTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitOnSceneTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Unit on scene time",
       "constraints.validation.error", "EMSUnitOnSceneTimeCode EMSUnitOnSceneTimeCodeP EMSUnitOnSceneTimeValue",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSUnitOnSceneTimeCode", "EMSUnitOnSceneTimeCodeP",
       "code.code", "69473-7"
       });																																																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitAtPatienttTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitAtPatienttTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitAtPatienttTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Unit at patient time",
       "constraints.validation.error", "EMSUnitAtPatienttTimeCode EMSUnitAtPatienttTimeCodeP EMSUnitAtPatienttTimeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69474-5",
       "constraints.validation.dependOn.EMSUnitAtPatienttTimeCode", "EMSUnitAtPatienttTimeCodeP"
       });																																																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitLeftSceneTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitLeftSceneTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitLeftSceneTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Unit left scene time",
       "constraints.validation.error", "EMSUnitLeftSceneTimeCode EMSUnitLeftSceneTimeCodeP EMSUnitLeftSceneTimeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69475-2",
       "constraints.validation.dependOn.EMSUnitLeftSceneTimeCode", "EMSUnitLeftSceneTimeCodeP"
       });																																																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSPatientArrivedAtDestinationTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSPatientArrivedAtDestinationTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSPatientArrivedAtDestinationTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Patient arrived at destination time",
       "constraints.validation.error", "EMSPatientArrivedAtDestinationTimeCode EMSPatientArrivedAtDestinationTimeCodeP EMSPatientArrivedAtDestinationTimeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69476-0",
       "constraints.validation.dependOn.EMSPatientArrivedAtDestinationTimeCode", "EMSPatientArrivedAtDestinationTimeCodeP"
       });																																																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitBackInServiceTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSUnitBackInServiceTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSUnitBackInServiceTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSUnitBackInServiceTimeCode", "EMSUnitBackInServiceTimeCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Unit back in service time",
       "constraints.validation.error", "EMSUnitBackInServiceTimeCode EMSUnitBackInServiceTimeCodeP EMSUnitBackInServiceTimeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69477-8"
       });																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSDispatchNotifiedTime</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSTimesSectionEMSTimesEntryEMSDispatchNotifiedTimeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionEMSTimesEntryEMSDispatchNotifiedTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Dispatch notified time",
       "constraints.validation.error", "EMSDispatchNotifiedTimeCode EMSDispatchNotifiedTimeCodeP EMSDispatchNotifiedTimeValue",
       "code.codeSystemName", "LOINC",
       "code.code", "69470-3",
       "constraints.validation.dependOn.EMSDispatchNotifiedTimeCode", "EMSDispatchNotifiedTimeCodeP"
       });																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntry</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSVitalSignsEntryEMSVitalSignsOrganizer",
       "constraints.validation.info", "EMSVitalSignsEntryEMSPriorAidVitals EMSVitalSignsEntryEMSCardiacRhythm EMSVitalSignsEntryEMSCarbonDioxide EMSVitalSignsEntryEMSCarbonMonoxide EMSVitalSignsEntryEMSBloodGlucose EMSVitalSignsEntryEMSLevelOfResponsiveness EMSVitalSignsEntryEMSPainScore EMSVitalSignsEntryEMSStrokeScore"
       });																																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizer</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSVitalSignsOrganizerEffectiveTime",
       "constraints.validation.warning", "EMSVitalSignsOrganizerEMSSystolicBloodPressureComponent EMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent EMSVitalSignsOrganizerEMSHeartRateComponent EMSVitalSignsOrganizerEMSRespiratoryRateComponent EMSVitalSignsOrganizerEMSBodyTemperatureComponent EMSVitalSignsOrganizerEMSOxygenSaturationComponent"
       });																																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.23.1",
       "code.displayName", "Intravascular systolic",
       "constraints.validation.error", "EMSSystolicBloodPressureTemplateId VitalSignObservationCode EMSSystolicBloodPressureValue",
       "code.codeSystemName", "LOINC",
       "code.code", "8480-6"
       });																																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Intravascular diastolic",
       "constraints.validation.error", "EMSDiastolicBloodPressureCode EMSDiastolicBloodPressureValue",
       "code.codeSystemName", "LOINC",
       "code.code", "8462-4"
       });																																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRate</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRate";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Heart rate",
       "constraints.validation.dependOn.EMSHeartRateCode", "EMSHeartRateCodeP",
       "constraints.validation.error", "EMSHeartRateCode EMSHeartRateCodeP EMSHeartRateValue",
       "code.codeSystemName", "LOINC",
       "code.code", "8867-4"
       });																																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRate</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRate";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Breaths",
       "constraints.validation.error", "EMSRespiratoryRateCode EMSRespiratoryRateValue",
       "code.codeSystemName", "LOINC",
       "code.code", "9279-1"
       });																																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperature</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperature";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Body temperature",
       "constraints.validation.error", "EMSBodyTemperatureCode EMSBodyTemperatureValue",
       "code.codeSystemName", "LOINC",
       "code.code", "8310-5"
       });																																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturation</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Oxygen saturation",
       "constraints.validation.error", "EMSOxygenSaturationCode EMSOxygenSaturationValue",
       "code.codeSystemName", "LOINC",
       "code.code", "2710-2"
       });																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSSystolicBloodPressureComponentEMSSystolicBloodPressure"
       });																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDiastolicBloodPressureComponentEMSDiastolicBloodPressure"
       });																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHeartRateComponentEMSHeartRate"
       });																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSRespiratoryRateComponentEMSRespiratoryRate"
       });																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSBodyTemperatureComponentEMSBodyTemperature"
       });																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponent</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponentAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponent";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSOxygenSaturationComponentEMSOxygenSaturation"
       });																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitals</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitalsAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitals";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Obtained prior to units EMS care",
       "constraints.validation.error", "EMSPriorAidVitalsCode EMSPriorAidVitalsValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67518-1",
       "constraints.validation.info", "EMSPriorAidVitalsEffectiveTime"
       });																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCardiacRhythm</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCardiacRhythmAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCardiacRhythm";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Cardiac rhythm",
       "constraints.validation.error", "EMSCardiacRhythmCode EMSCardiacRhythmCodeP EMSCardiacRhythmMethodCode EMSCardiacRhythmMethodCodeP EMSCardiacRhythmValue EMSCardiacRhythmValueP",
       "constraints.validation.dependOn.EMSCardiacRhythmCode", "EMSCardiacRhythmCodeP",
       "methodCode.codeSystemName", "LOINC",
       "code.codeSystemName", "LOINC",
       "code.code", "67519-9",
       "methodCode.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																											
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonDioxide</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonDioxideAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonDioxide";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Carbon dioxide/Gas.total.at end expiration",
       "constraints.validation.error", "EMSCarbonDioxideCode EMSCarbonDioxideCodeP EMSCarbonDioxideValue",
       "code.codeSystemName", "LOINC",
       "code.code", "19889-5",
       "constraints.validation.dependOn.EMSCarbonDioxideCode", "EMSCarbonDioxideCodeP"
       });																																										
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonMonoxide</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonMonoxideAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonMonoxide";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Diffusion capacity.carbon monoxide",
       "constraints.validation.error", "EMSCarbonMonoxideCode EMSCarbonMonoxideCodeP EMSCarbonMonoxideValue",
       "code.codeSystemName", "LOINC",
       "code.code", "19911-7",
       "constraints.validation.dependOn.EMSCarbonMonoxideCode", "EMSCarbonMonoxideCodeP"
       });																																									
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSBloodGlucose</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSBloodGlucoseAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSBloodGlucose";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Glucose",
       "constraints.validation.error", "EMSBloodGlucoseCode EMSBloodGlucoseCodeP EMSBloodGlucoseValue",
       "code.codeSystemName", "LOINC",
       "code.code", "2339-0",
       "constraints.validation.dependOn.EMSBloodGlucoseCode", "EMSBloodGlucoseCodeP"
       });																																								
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSLevelOfResponsiveness</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSLevelOfResponsivenessAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSLevelOfResponsiveness";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Level of responsiveness",
       "constraints.validation.dependOn.EMSLevelOfResponsivenessCode", "EMSLevelOfResponsivenessCodeP",
       "constraints.validation.error", "EMSLevelOfResponsivenessCode EMSLevelOfResponsivenessCodeP EMSLevelOfResponsivenessValue EMSLevelOfResponsivenessValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67775-7",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																							
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPainScore</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPainScoreAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPainScore";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Pain severity verbal numeric scale",
       "constraints.validation.error", "EMSPainScoreCode",
       "code.codeSystemName", "LOINC",
       "code.code", "56840-2"
       });																																						
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSStrokeScore</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSStrokeScoreAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSStrokeScore";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSStrokeScoreCode", "EMSStrokeScoreCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Stroke scale overall interpretation",
       "constraints.validation.error", "EMSStrokeScoreCode EMSStrokeScoreCodeP EMSStrokeScoreValue EMSStrokeScoreValueP EMSStrokeScoreMethodCode EMSStrokeScoreMethodCodeP",
       "methodCode.codeSystemName", "LOINC",
       "code.codeSystemName", "LOINC",
       "code.code", "67520-7",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "methodCode.codeSystem", "2.16.840.1.113883.6.1"
       });																																					
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScore</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScore";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSGlasgowComaScoreEMSGlasgowEye EMSGlasgowComaScoreEMSGlasgowMotor EMSGlasgowComaScoreEMSGlasgowVerbal",
       "constraints.validation.warning", "EMSGlasgowComaScoreEMSGlasgowTotal",
       "constraints.validation.info", "EMSGlasgowComaScoreEMSGlasgowQualifier"
       });																																				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowTotal</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowTotalAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowTotal";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Glasgow coma score.total",
       "constraints.validation.error", "EMSGlasgowTotalCode EMSGlasgowTotalCodeP EMSGlasgowTotalValue",
       "code.codeSystemName", "LOINC",
       "code.code", "9269-2",
       "constraints.validation.dependOn.EMSGlasgowTotalCode", "EMSGlasgowTotalCodeP"
       });																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowQualifier</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowQualifierAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowQualifier";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Glasgow coma score special circumstances",
       "constraints.validation.error", "EMSGlasgowQualifierCode EMSGlasgowQualifierCodeP",
       "code.codeSystemName", "LOINC",
       "code.code", "55285-1",
       "constraints.validation.info", "EMSGlasgowQualifierValue",
       "constraints.validation.dependOn.EMSGlasgowQualifierCode", "EMSGlasgowQualifierCodeP"
       });																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowEye</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowEyeAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowEye";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSGlasgowEyeCode", "EMSGlasgowEyeCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Glasgow coma score.eye opening",
       "constraints.validation.error", "EMSGlasgowEyeCode EMSGlasgowEyeCodeP EMSGlasgowEyeValue EMSGlasgowEyeValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "9267-6",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowMotor</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowMotorAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowMotor";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "null",
       "code.displayName", "Glasgow coma score.motor",
       "constraints.validation.error", "EMSGlasgowMotorTemplateId EMSGlasgowMotorCode EMSGlasgowMotorCodeP EMSGlasgowMotorValue EMSGlasgowMotorValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "9268-4",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.dependOn.EMSGlasgowMotorCode", "EMSGlasgowMotorCodeP"
       });																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowVerbal</b>.
   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
   * @generated
   */
	protected void createEmspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowVerbalAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowVerbal";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.EMSGlasgowVerbalCode", "EMSGlasgowVerbalCodeP",
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Glasgow coma score.verbal",
       "constraints.validation.error", "EMSGlasgowVerbalCode EMSGlasgowVerbalCodeP EMSGlasgowVerbalValue EMSGlasgowVerbalValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "9270-0",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																															
  }

} // EmspcrPackageImpl
