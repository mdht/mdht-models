/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Mu2consolPackageImpl extends EPackageImpl implements
		Mu2consolPackage {
	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass generalHeaderConstraintsEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass summaryOfCareRecordEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass planOfCareSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass assessmentAndPlanSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass instructionsSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass clinicalOfficeVisitSummaryEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass transitionOfCareAmbulatorySummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionOfCareInpatientSummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass viewDownloadTransmitSummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdtInpatientSummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdtAmbulatorySummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultOrganizerEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultsSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass assessmentSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass hospitalAdmissionDiagnosisSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass hospitalDischargeDiagnosisSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass postoperativeDiagnosisSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass postprocedureDiagnosisSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalStatusSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass preoperativeDiagnosisSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass hospitalAdmissionMedicationsSectionEntriesOptionalEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass socialHistorySectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smokingStatusObservationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mu2consolPackageImpl() {
        super(eNS_URI, Mu2consolFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link Mu2consolPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mu2consolPackage init() {
        if (isInited) return (Mu2consolPackage)EPackage.Registry.INSTANCE.getEPackage(Mu2consolPackage.eNS_URI);

        // Obtain or create and register package
        Mu2consolPackageImpl theMu2consolPackage = (Mu2consolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Mu2consolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Mu2consolPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ConsolPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMu2consolPackage.createPackageContents();

        // Initialize created meta-data
        theMu2consolPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theMu2consolPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return Mu2consolValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theMu2consolPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.mu2consol", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theMu2consolPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Mu2consolPackage.eNS_URI, theMu2consolPackage);
        return theMu2consolPackage;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getGeneralHeaderConstraints() {
        return generalHeaderConstraintsEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getSummaryOfCareRecord() {
        return summaryOfCareRecordEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getPlanOfCareSection() {
        return planOfCareSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getAssessmentAndPlanSection() {
        return assessmentAndPlanSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getInstructionsSection() {
        return instructionsSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getClinicalOfficeVisitSummary() {
        return clinicalOfficeVisitSummaryEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransitionOfCareAmbulatorySummary() {
        return transitionOfCareAmbulatorySummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransitionOfCareInpatientSummary() {
        return transitionOfCareInpatientSummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getViewDownloadTransmitSummary() {
        return viewDownloadTransmitSummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDTInpatientSummary() {
        return vdtInpatientSummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDTAmbulatorySummary() {
        return vdtAmbulatorySummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultObservation() {
        return resultObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultOrganizer() {
        return resultOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultsSection() {
        return resultsSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getAssessmentSection() {
        return assessmentSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getHospitalAdmissionDiagnosisSection() {
        return hospitalAdmissionDiagnosisSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getHospitalDischargeDiagnosisSection() {
        return hospitalDischargeDiagnosisSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getPostoperativeDiagnosisSection() {
        return postoperativeDiagnosisSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getPostprocedureDiagnosisSection() {
        return postprocedureDiagnosisSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionalStatusSection() {
        return functionalStatusSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getPreoperativeDiagnosisSection() {
        return preoperativeDiagnosisSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getMedicationsAdministeredSection() {
        return medicationsAdministeredSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getHospitalAdmissionMedicationsSectionEntriesOptional() {
        return hospitalAdmissionMedicationsSectionEntriesOptionalEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getSocialHistorySection() {
        return socialHistorySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSmokingStatusObservation() {
        return smokingStatusObservationEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public Mu2consolFactory getMu2consolFactory() {
        return (Mu2consolFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        generalHeaderConstraintsEClass = createEClass(GENERAL_HEADER_CONSTRAINTS);

        summaryOfCareRecordEClass = createEClass(SUMMARY_OF_CARE_RECORD);

        planOfCareSectionEClass = createEClass(PLAN_OF_CARE_SECTION);

        assessmentAndPlanSectionEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION);

        assessmentSectionEClass = createEClass(ASSESSMENT_SECTION);

        hospitalAdmissionDiagnosisSectionEClass = createEClass(HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);

        hospitalDischargeDiagnosisSectionEClass = createEClass(HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION);

        postoperativeDiagnosisSectionEClass = createEClass(POSTOPERATIVE_DIAGNOSIS_SECTION);

        preoperativeDiagnosisSectionEClass = createEClass(PREOPERATIVE_DIAGNOSIS_SECTION);

        hospitalAdmissionMedicationsSectionEntriesOptionalEClass = createEClass(HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL);

        socialHistorySectionEClass = createEClass(SOCIAL_HISTORY_SECTION);

        smokingStatusObservationEClass = createEClass(SMOKING_STATUS_OBSERVATION);

        resultsSectionEClass = createEClass(RESULTS_SECTION);

        resultOrganizerEClass = createEClass(RESULT_ORGANIZER);

        resultObservationEClass = createEClass(RESULT_OBSERVATION);

        postprocedureDiagnosisSectionEClass = createEClass(POSTPROCEDURE_DIAGNOSIS_SECTION);

        functionalStatusSectionEClass = createEClass(FUNCTIONAL_STATUS_SECTION);

        instructionsSectionEClass = createEClass(INSTRUCTIONS_SECTION);

        medicationsAdministeredSectionEClass = createEClass(MEDICATIONS_ADMINISTERED_SECTION);

        clinicalOfficeVisitSummaryEClass = createEClass(CLINICAL_OFFICE_VISIT_SUMMARY);

        transitionOfCareAmbulatorySummaryEClass = createEClass(TRANSITION_OF_CARE_AMBULATORY_SUMMARY);

        transitionOfCareInpatientSummaryEClass = createEClass(TRANSITION_OF_CARE_INPATIENT_SUMMARY);

        viewDownloadTransmitSummaryEClass = createEClass(VIEW_DOWNLOAD_TRANSMIT_SUMMARY);

        vdtInpatientSummaryEClass = createEClass(VDT_INPATIENT_SUMMARY);

        vdtAmbulatorySummaryEClass = createEClass(VDT_AMBULATORY_SUMMARY);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        generalHeaderConstraintsEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
        summaryOfCareRecordEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        planOfCareSectionEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareSection());
        assessmentAndPlanSectionEClass.getESuperTypes().add(theConsolPackage.getAssessmentAndPlanSection());
        assessmentSectionEClass.getESuperTypes().add(theConsolPackage.getAssessmentSection());
        hospitalAdmissionDiagnosisSectionEClass.getESuperTypes().add(theConsolPackage.getHospitalAdmissionDiagnosisSection());
        hospitalDischargeDiagnosisSectionEClass.getESuperTypes().add(theConsolPackage.getHospitalDischargeDiagnosisSection());
        postoperativeDiagnosisSectionEClass.getESuperTypes().add(theConsolPackage.getPostoperativeDiagnosisSection());
        preoperativeDiagnosisSectionEClass.getESuperTypes().add(theConsolPackage.getPreoperativeDiagnosisSection());
        hospitalAdmissionMedicationsSectionEntriesOptionalEClass.getESuperTypes().add(theConsolPackage.getHospitalAdmissionMedicationsSectionEntriesOptional());
        socialHistorySectionEClass.getESuperTypes().add(theConsolPackage.getSocialHistorySection());
        smokingStatusObservationEClass.getESuperTypes().add(theConsolPackage.getTobaccoUse());
        resultsSectionEClass.getESuperTypes().add(theConsolPackage.getResultsSection());
        resultOrganizerEClass.getESuperTypes().add(theConsolPackage.getResultOrganizer());
        resultObservationEClass.getESuperTypes().add(theConsolPackage.getResultObservation());
        postprocedureDiagnosisSectionEClass.getESuperTypes().add(theConsolPackage.getPostprocedureDiagnosisSection());
        functionalStatusSectionEClass.getESuperTypes().add(theConsolPackage.getFunctionalStatusSection());
        instructionsSectionEClass.getESuperTypes().add(theConsolPackage.getInstructionsSection());
        medicationsAdministeredSectionEClass.getESuperTypes().add(theConsolPackage.getMedicationsAdministeredSection());
        clinicalOfficeVisitSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        transitionOfCareAmbulatorySummaryEClass.getESuperTypes().add(this.getSummaryOfCareRecord());
        transitionOfCareInpatientSummaryEClass.getESuperTypes().add(this.getSummaryOfCareRecord());
        viewDownloadTransmitSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        vdtInpatientSummaryEClass.getESuperTypes().add(this.getViewDownloadTransmitSummary());
        vdtAmbulatorySummaryEClass.getESuperTypes().add(this.getViewDownloadTransmitSummary());

        // Initialize classes and features; add operations and parameters
        initEClass(generalHeaderConstraintsEClass, GeneralHeaderConstraints.class, "GeneralHeaderConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMu2consolGeneralHeaderConstraintsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMu2consolGeneralHeaderConstraintsDocumentationOf", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsComponent1EncompassingEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(summaryOfCareRecordEClass, SummaryOfCareRecord.class, "SummaryOfCareRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordCarePlanning", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordHospitalDischargeMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordFunctionalStatusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordSocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordAssessmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPostoperativeDiagnosisSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolFunctionalStatusSectionCognitiveStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolFunctionalStatusSectionFunctionalStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordFunctionalStatusSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getEncountersSection(), "getEncountersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getInterventionsSection(), "getInterventionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getAssessmentSection(), "getAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getHospitalAdmissionDiagnosisSection(), "getHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getHospitalDischargeDiagnosisSection(), "getHospitalDischargeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPostoperativeDiagnosisSection(), "getPostoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHistoryOfPastIllnessSection(), "getHistoryOfPastIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPreoperativeDiagnosisSection(), "getPreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getHospitalAdmissionMedicationsSectionEntriesOptional(), "getHospitalAdmissionMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHospitalDischargeMedicationsSection(), "getHospitalDischargeMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPostprocedureDiagnosisSection(), "getPostprocedureDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(planOfCareSectionEClass, PlanOfCareSection.class, "PlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityAct(), "getMu2consolPlanOfCareActivityAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityEncounter(), "getMu2consolPlanOfCareActivityEncounter", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityObservation(), "getMu2consolPlanOfCareActivityObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentAndPlanSectionEClass, AssessmentAndPlanSection.class, "AssessmentAndPlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getPlanOfCareActivityProcedure(), "getPlanOfCareActivityProcedure", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getPlanOfCareActivitySubstanceAdministration(), "getPlanOfCareActivitySubstanceAdministration", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getPlanOfCareActivitySupply(), "getPlanOfCareActivitySupply", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getProblemObservation(), "getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentSectionEClass, AssessmentSection.class, "AssessmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(assessmentSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolAssessmentSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(assessmentSectionEClass, theConsolPackage.getProblemObservation(), "getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hospitalAdmissionDiagnosisSectionEClass, HospitalAdmissionDiagnosisSection.class, "HospitalAdmissionDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hospitalAdmissionDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hospitalAdmissionDiagnosisSectionEClass, theConsolPackage.getHospitalAdmissionDiagnosis(), "getMu2consolHospitalAdmissionDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hospitalDischargeDiagnosisSectionEClass, HospitalDischargeDiagnosisSection.class, "HospitalDischargeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hospitalDischargeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hospitalDischargeDiagnosisSectionEClass, theConsolPackage.getHospitalDischargeDiagnosis(), "getMu2consolHospitalDischargeDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(postoperativeDiagnosisSectionEClass, PostoperativeDiagnosisSection.class, "PostoperativeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(postoperativeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPostoperativeDiagnosisSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(postoperativeDiagnosisSectionEClass, theConsolPackage.getProblemObservation(), "getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(preoperativeDiagnosisSectionEClass, PreoperativeDiagnosisSection.class, "PreoperativeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(preoperativeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(preoperativeDiagnosisSectionEClass, theConsolPackage.getPreoperativeDiagnosis(), "getMu2consolPreoperativeDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hospitalAdmissionMedicationsSectionEntriesOptionalEClass, HospitalAdmissionMedicationsSectionEntriesOptional.class, "HospitalAdmissionMedicationsSectionEntriesOptional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hospitalAdmissionMedicationsSectionEntriesOptionalEClass, ecorePackage.getEBoolean(), "validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hospitalAdmissionMedicationsSectionEntriesOptionalEClass, theConsolPackage.getAdmissionMedication(), "getMu2consolAdmissionMedications", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(socialHistorySectionEClass, SocialHistorySection.class, "SocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(socialHistorySectionEClass, this.getSmokingStatusObservation(), "getMu2consolSmokingStatusObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(smokingStatusObservationEClass, SmokingStatusObservation.class, "SmokingStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(smokingStatusObservationEClass, ecorePackage.getEBoolean(), "validateSmokingStatusObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(smokingStatusObservationEClass, ecorePackage.getEBoolean(), "validateSmokingStatusObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(resultsSectionEClass, ResultsSection.class, "ResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolResultsSectionResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(resultsSectionEClass, this.getResultOrganizer(), "getMu2consolResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(resultOrganizerEClass, ResultOrganizer.class, "ResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateMu2consolResultOrganizerResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(resultOrganizerEClass, this.getResultObservation(), "getMu2consolResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(resultObservationEClass, ResultObservation.class, "ResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateMu2consolResultObservationResultObservationCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateMu2consolResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(postprocedureDiagnosisSectionEClass, PostprocedureDiagnosisSection.class, "PostprocedureDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(postprocedureDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(postprocedureDiagnosisSectionEClass, theConsolPackage.getPostprocedureDiagnosis(), "getMu2consolPostprocedureDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(functionalStatusSectionEClass, FunctionalStatusSection.class, "FunctionalStatusSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolFunctionalStatusSectionCognitiveStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolFunctionalStatusSectionFunctionalStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, theConsolPackage.getCognitiveStatusProblemObservation(), "getMu2consolCognitiveStatusProblemObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, theConsolPackage.getCognitiveStatusResultObservation(), "getMu2consolCognitiveStatusResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, theConsolPackage.getCognitiveStatusResultOrganizer(), "getMu2consolCognitiveStatusResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, theConsolPackage.getFunctionalStatusProblemObservation(), "getMu2consolFunctionalStatusProblemObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, theConsolPackage.getFunctionalStatusResultObservation(), "getMu2consolFunctionalStatusResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, theConsolPackage.getFunctionalStatusResultOrganizer(), "getMu2consolFunctionalStatusResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(instructionsSectionEClass, InstructionsSection.class, "InstructionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(instructionsSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolInstructionsSectionInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(instructionsSectionEClass, theConsolPackage.getInstructions(), "getMu2consolInstructionss", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(medicationsAdministeredSectionEClass, MedicationsAdministeredSection.class, "MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(medicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolMedicationsAdministeredSectionMedicationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(medicationsAdministeredSectionEClass, theConsolPackage.getMedicationActivity(), "getMu2consolMedicationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(clinicalOfficeVisitSummaryEClass, ClinicalOfficeVisitSummary.class, "ClinicalOfficeVisitSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryResponsibleParty", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryReasonForOfficeVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryCarePlanning", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsAdministeredSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummarySocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolMedicationsAdministeredSectionMedicationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolInstructionsSectionInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getPlanOfCareSection(), "retrievePlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getMedicationsAdministeredSection(), "getMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getReasonForVisitSection(), "getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getInstructionsSection(), "getInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(transitionOfCareAmbulatorySummaryEClass, TransitionOfCareAmbulatorySummary.class, "TransitionOfCareAmbulatorySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryResponsibleParty", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryReasonForReferralSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(transitionOfCareAmbulatorySummaryEClass, theConsolPackage.getReasonForReferralSection(), "getReasonForReferralSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(transitionOfCareInpatientSummaryEClass, TransitionOfCareInpatientSummary.class, "TransitionOfCareInpatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(viewDownloadTransmitSummaryEClass, ViewDownloadTransmitSummary.class, "ViewDownloadTransmitSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryCarePlanFields", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryHospitalDischargeMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummarySocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummarySocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getHospitalDischargeMedicationsSection(), "getHospitalDischargeMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(vdtInpatientSummaryEClass, VDTInpatientSummary.class, "VDTInpatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryChiefComplaintOrReasonForVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalDischargeInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, this.getHospitalAdmissionDiagnosisSection(), "getHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getReasonForVisitSection(), "getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(vdtAmbulatorySummaryEClass, VDTAmbulatorySummary.class, "VDTAmbulatorySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(vdtAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateVDTAmbulatorySummaryResponsibleParty", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget
        createMu2consolGeneralHeaderConstraintsRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole
        createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient
        createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf
        createMu2consolGeneralHeaderConstraintsDocumentationOfAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1Annotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1
        createMu2consolGeneralHeaderConstraintsComponent1Annotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter
        createMu2consolGeneralHeaderConstraintsComponent1EncompassingEncounterAnnotations();
        // duplicates
        createDuplicatesAnnotations();
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
             "initializers", "org.openhealthtools.mdht.uml.cda.mu2consol"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolGeneralHeaderConstraintsTemplateId Mu2consolGeneralHeaderConstraintsRecordTarget Mu2consolGeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent GeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant GeneralHeaderConstraintsComponent1EncompassingEncounter",
             "templateId.root", "2.16.840.1.113883.10.20.22.1.1",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent GeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant GeneralHeaderConstraintsComponent1EncompassingEncounter"
           });                                   
        addAnnotation
          (summaryOfCareRecordEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SummaryOfCareRecordMu2EncounterDiagnosesRequirements SummaryOfCareRecordCarePlanning SummaryOfCareRecordPlanOfCareSection SummaryOfCareRecordProblemSection SummaryOfCareRecordAllergiesSection SummaryOfCareRecordImmunizationsSection SummaryOfCareRecordMedicationsSection SummaryOfCareRecordHospitalDischargeMedicationsSection SummaryOfCareRecordSocialHistorySection SummaryOfCareRecordResultsSection SummaryOfCareRecordVitalSignsSection SummaryOfCareRecordProceduresSection SummaryOfCareRecordFunctionalStatusSection SummaryOfCareRecordSocialHistorySectionTemplateId SummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation SummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId SummaryOfCareRecordMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordPlanOfCareSectionTemplateId SummaryOfCareRecordAssessmentAndPlanSectionTemplateId SummaryOfCareRecordAssessmentSectionTemplateId SummaryOfCareRecordMu2consolAssessmentSectionProblemObservation SummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis SummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis SummaryOfCareRecordMu2consolFunctionalStatusSectionCognitiveStatus SummaryOfCareRecordMu2consolFunctionalStatusSectionFunctionalStatus SummaryOfCareRecordFunctionalStatusSectionTemplateId",
             "constraints.validation.query", "SummaryOfCareRecordSocialHistorySectionTemplateId SummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation SummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId SummaryOfCareRecordMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordPlanOfCareSectionTemplateId SummaryOfCareRecordAssessmentAndPlanSectionTemplateId SummaryOfCareRecordAssessmentSectionTemplateId SummaryOfCareRecordMu2consolAssessmentSectionProblemObservation SummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis SummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId SummaryOfCareRecordMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis SummaryOfCareRecordMu2consolFunctionalStatusSectionCognitiveStatus SummaryOfCareRecordMu2consolFunctionalStatusSectionFunctionalStatus SummaryOfCareRecordFunctionalStatusSectionTemplateId"
           });                                                                                                                                                                                                 
        addAnnotation
          (planOfCareSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolPlanOfCareSectionPlanOfCareActivityObservation Mu2consolPlanOfCareSectionTemplateId Mu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.10"
           });                    
        addAnnotation
          (assessmentAndPlanSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolAssessmentAndPlanSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.9"
           });              
        addAnnotation
          (assessmentSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolAssessmentSectionTemplateId Mu2consolAssessmentSectionProblemObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.8"
           });            
        addAnnotation
          (hospitalAdmissionDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolHospitalAdmissionDiagnosisSectionTemplateId Mu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.43"
           });            
        addAnnotation
          (hospitalDischargeDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolHospitalDischargeDiagnosisSectionTemplateId Mu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.24"
           });            
        addAnnotation
          (postoperativeDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolPostoperativeDiagnosisSectionTemplateId Mu2consolPostoperativeDiagnosisSectionProblemObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.35"
           });            
        addAnnotation
          (preoperativeDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolPreoperativeDiagnosisSectionTemplateId Mu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.34"
           });            
        addAnnotation
          (hospitalAdmissionMedicationsSectionEntriesOptionalEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId Mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.44"
           });            
        addAnnotation
          (socialHistorySectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolSocialHistorySectionTemplateId Mu2consolSocialHistorySectionSmokingStatusObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.17"
           });            
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SmokingStatusObservationTemplateId SmokingStatusObservationValue SmokingStatusObservationValueP",
             "templateId.root", "2.16.840.1.113883.10.22.4.78",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.SmokingStatusObservationValue", "SmokingStatusObservationValueP"
           });              
        addAnnotation
          (resultsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolResultsSectionTemplateId Mu2consolResultsSectionResultOrganizer",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.3.1"
           });            
        addAnnotation
          (resultOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolResultOrganizerTemplateId Mu2consolResultOrganizerResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.1"
           });            
        addAnnotation
          (resultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolResultObservationTemplateId Mu2consolResultObservationResultObservationCodeValue Mu2consolResultObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.2"
           });              
        addAnnotation
          (postprocedureDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolPostprocedureDiagnosisSectionTemplateId Mu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.36"
           });            
        addAnnotation
          (functionalStatusSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolFunctionalStatusSectionTemplateId Mu2consolFunctionalStatusSectionCognitiveStatus Mu2consolFunctionalStatusSectionFunctionalStatus",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.14"
           });                          
        addAnnotation
          (instructionsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolInstructionsSectionTemplateId Mu2consolInstructionsSectionInstructions",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.45"
           });            
        addAnnotation
          (medicationsAdministeredSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Mu2consolMedicationsAdministeredSectionTemplateId Mu2consolMedicationsAdministeredSectionMedicationActivity",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.38"
           });            
        addAnnotation
          (clinicalOfficeVisitSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.query", "ClinicalOfficeVisitSummaryResponsibleParty ClinicalOfficeVisitSummaryEffectiveTime ClinicalOfficeVisitSummaryLocation ClinicalOfficeVisitSummaryPlanOfCareActOrEncounter ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId ClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId ClinicalOfficeVisitSummaryMu2consolMedicationsAdministeredSectionMedicationActivity ClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId ClinicalOfficeVisitSummaryInstructionsSectionTemplateId ClinicalOfficeVisitSummaryMu2consolInstructionsSectionInstructions ClinicalOfficeVisitSummarySocialHistorySectionTemplateId ClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation",
             "constraints.validation.error", "ClinicalOfficeVisitSummaryResponsibleParty ClinicalOfficeVisitSummaryReasonForOfficeVisit ClinicalOfficeVisitSummaryCarePlanning ClinicalOfficeVisitSummaryEffectiveTime ClinicalOfficeVisitSummaryLocation ClinicalOfficeVisitSummaryPlanOfCareActOrEncounter ClinicalOfficeVisitSummaryProblemSection ClinicalOfficeVisitSummaryMedicationsSection ClinicalOfficeVisitSummaryAllergiesSection ClinicalOfficeVisitSummaryResultsSection ClinicalOfficeVisitSummaryVitalSignsSection ClinicalOfficeVisitSummaryPlanOfCareSection ClinicalOfficeVisitSummaryProceduresSection ClinicalOfficeVisitSummaryImmunizationsSection ClinicalOfficeVisitSummaryMedicationsAdministeredSection ClinicalOfficeVisitSummaryInstructionsSection ClinicalOfficeVisitSummarySocialHistorySection ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId ClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId ClinicalOfficeVisitSummaryMu2consolMedicationsAdministeredSectionMedicationActivity ClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId ClinicalOfficeVisitSummaryInstructionsSectionTemplateId ClinicalOfficeVisitSummaryMu2consolInstructionsSectionInstructions ClinicalOfficeVisitSummarySocialHistorySectionTemplateId ClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation"
           });                                                                                                                                                 
        addAnnotation
          (transitionOfCareAmbulatorySummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.query", "TransitionOfCareAmbulatorySummaryResponsibleParty",
             "constraints.validation.error", "TransitionOfCareAmbulatorySummaryResponsibleParty TransitionOfCareAmbulatorySummaryReasonForReferralSection"
           });               
        addAnnotation
          (transitionOfCareInpatientSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection"
           });           
        addAnnotation
          (viewDownloadTransmitSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ViewDownloadTransmitSummaryCarePlanFields ViewDownloadTransmitSummaryAllergiesSection ViewDownloadTransmitSummaryMedicationsSection ViewDownloadTransmitSummaryHospitalDischargeMedicationsSection ViewDownloadTransmitSummaryProblemSection ViewDownloadTransmitSummaryProceduresSection ViewDownloadTransmitSummaryVitalSignsSection ViewDownloadTransmitSummaryResultsSection ViewDownloadTransmitSummaryPlanOfCareSection ViewDownloadTransmitSummarySocialHistorySection ViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ViewDownloadTransmitSummaryPlanOfCareSectionTemplateId ViewDownloadTransmitSummarySocialHistorySectionTemplateId ViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation",
             "constraints.validation.query", "ViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ViewDownloadTransmitSummaryPlanOfCareSectionTemplateId ViewDownloadTransmitSummarySocialHistorySectionTemplateId ViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation"
           });                                                                                         
        addAnnotation
          (vdtInpatientSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.query", "VDTInpatientSummaryEffectiveTime VDTInpatientSummaryLocation VDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId VDTInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
             "constraints.validation.error", "VDTInpatientSummaryEffectiveTime VDTInpatientSummaryLocation VDTInpatientSummaryChiefComplaintOrReasonForVisit VDTInpatientSummaryHospitalDischargeInstructionsSection VDTInpatientSummaryHospitalAdmissionDiagnosisSection VDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId VDTInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis"
           });                                           
        addAnnotation
          (vdtAmbulatorySummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.query", "VDTAmbulatorySummaryResponsibleParty",
             "constraints.validation.error", "VDTAmbulatorySummaryResponsibleParty"
           });    
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml
	 * /cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget";       
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "RecordTargetPatientRole RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient",
             "constraints.validation.query", "RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole";        
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PatientRolePatient PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication",
             "constraints.validation.query", "PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/
	 * mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient";         
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "ethnicGroupCode.codeSystem", "2.16.840.1.113883.6.238",
             "ethnicGroupCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.error", "PatientEthnicGroupCode PatientEthnicGroupCodeP PatientRaceCode PatientRaceCodeP PatientLanguageCommunication",
             "raceCode.codeSystem", "2.16.840.1.113883.6.238",
             "raceCode.codeSystemName", "Race and Ethnicity - CDC"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected void createMu2consolGeneralHeaderConstraintsDocumentationOfAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf";          
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "DocumentationOfServiceEvent DocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson DocumentationOfServiceEventPerformer1AssignedEntity DocumentationOfServiceEventPerformer",
             "constraints.validation.query", "DocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson DocumentationOfServiceEventPerformer1AssignedEntity DocumentationOfServiceEventPerformer"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/
	 * mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent";           
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ServiceEventPerformer ServiceEventPerformer1AssignedEntityAssignedPerson ServiceEventPerformer1AssignedEntity",
             "constraints.validation.query", "ServiceEventPerformer1AssignedEntityAssignedPerson ServiceEventPerformer1AssignedEntity"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1Annotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1";            
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Performer1AssignedEntity Performer1AssignedEntityAssignedPerson",
             "constraints.validation.query", "Performer1AssignedEntityAssignedPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity";             
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AssignedEntityAssignedPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsComponent1Annotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1";              
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Component1EncompassingEncounter Component1EncompassingEncounterEncounterParticipant",
             "constraints.validation.query", "Component1EncompassingEncounterEncounterParticipant"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected void createMu2consolGeneralHeaderConstraintsComponent1EncompassingEncounterAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter";               
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "EncompassingEncounterEncounterParticipant"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }

	/**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected void createDuplicatesAnnotations() {
        String source = "duplicates";                
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
           });                                                                                                                                                                                                                       
        addAnnotation
          (planOfCareSectionEClass, 
           source, 
           new String[] {
           });                    
        addAnnotation
          (assessmentAndPlanSectionEClass, 
           source, 
           new String[] {
           });              
        addAnnotation
          (assessmentSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (hospitalAdmissionDiagnosisSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (hospitalDischargeDiagnosisSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (postoperativeDiagnosisSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (preoperativeDiagnosisSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (hospitalAdmissionMedicationsSectionEntriesOptionalEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (socialHistorySectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] {
           });              
        addAnnotation
          (resultsSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (resultOrganizerEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (resultObservationEClass, 
           source, 
           new String[] {
           });              
        addAnnotation
          (postprocedureDiagnosisSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (functionalStatusSectionEClass, 
           source, 
           new String[] {
           });                          
        addAnnotation
          (instructionsSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (medicationsAdministeredSectionEClass, 
           source, 
           new String[] {
           });                                                                                                                                                                                                                                                                                                      
    }

} // Mu2consolPackageImpl
