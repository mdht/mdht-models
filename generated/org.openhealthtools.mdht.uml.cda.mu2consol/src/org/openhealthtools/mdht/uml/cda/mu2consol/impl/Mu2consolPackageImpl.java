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
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class Mu2consolPackageImpl extends EPackageImpl implements
		Mu2consolPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass generalHeaderConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass summaryOfCareRecordEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vdtAmbulatoryPatientInfoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass clinicalOfficeVisitSummaryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assessmentAndPlanForCarePlanningEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass planOfCareSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assessmentAndPlanForConditionOrConcernEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assessmentAndPlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass instructionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assessmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass postoperativeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass postprocedureDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass encountersSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass preoperativeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass hospitalAdmissionMedicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass allergiesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vdtInpatientPatientInfoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass createTransmitSummaryOfCareRecordEClass = null;

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
	 * 
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
		if (isInited)
			return (Mu2consolPackage) EPackage.Registry.INSTANCE
					.getEPackage(Mu2consolPackage.eNS_URI);

		// Obtain or create and register package
		Mu2consolPackageImpl theMu2consolPackage = (Mu2consolPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Mu2consolPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new Mu2consolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConsolPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMu2consolPackage.createPackageContents();

		// Initialize created meta-data
		theMu2consolPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMu2consolPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return Mu2consolValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theMu2consolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mu2consolPackage.eNS_URI,
				theMu2consolPackage);
		return theMu2consolPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints() {
		return generalHeaderConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSummaryOfCareRecord() {
		return summaryOfCareRecordEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVDTAmbulatoryPatientInfo() {
		return vdtAmbulatoryPatientInfoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClinicalOfficeVisitSummary() {
		return clinicalOfficeVisitSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssessmentAndPlanForCarePlanning() {
		return assessmentAndPlanForCarePlanningEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssessmentAndPlanForConditionOrConcern() {
		return assessmentAndPlanForConditionOrConcernEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssessmentAndPlanSection() {
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInstructionsSection() {
		return instructionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssessmentSection() {
		return assessmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosisSection() {
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getHospitalDischargeDiagnosisSection() {
		return hospitalDischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPostoperativeDiagnosisSection() {
		return postoperativeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPostprocedureDiagnosisSection() {
		return postprocedureDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEncountersSection() {
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPreoperativeDiagnosisSection() {
		return preoperativeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getHospitalAdmissionMedicationsSectionEntriesOptional() {
		return hospitalAdmissionMedicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSection() {
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAllergiesSectionEntriesOptional() {
		return allergiesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVDTInpatientPatientInfo() {
		return vdtInpatientPatientInfoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCreateTransmitSummaryOfCareRecord() {
		return createTransmitSummaryOfCareRecordEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Mu2consolFactory getMu2consolFactory() {
		return (Mu2consolFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		generalHeaderConstraintsEClass = createEClass(GENERAL_HEADER_CONSTRAINTS);

		summaryOfCareRecordEClass = createEClass(SUMMARY_OF_CARE_RECORD);

		encountersSectionEClass = createEClass(ENCOUNTERS_SECTION);

		planOfCareSectionEClass = createEClass(PLAN_OF_CARE_SECTION);

		assessmentAndPlanSectionEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION);

		instructionsSectionEClass = createEClass(INSTRUCTIONS_SECTION);

		assessmentSectionEClass = createEClass(ASSESSMENT_SECTION);

		hospitalAdmissionDiagnosisSectionEClass = createEClass(HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);

		hospitalDischargeDiagnosisSectionEClass = createEClass(HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION);

		postoperativeDiagnosisSectionEClass = createEClass(POSTOPERATIVE_DIAGNOSIS_SECTION);

		preoperativeDiagnosisSectionEClass = createEClass(PREOPERATIVE_DIAGNOSIS_SECTION);

		medicationsAdministeredSectionEClass = createEClass(MEDICATIONS_ADMINISTERED_SECTION);

		hospitalAdmissionMedicationsSectionEntriesOptionalEClass = createEClass(HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL);

		hospitalDischargeMedicationsSectionEClass = createEClass(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);

		allergiesSectionEntriesOptionalEClass = createEClass(ALLERGIES_SECTION_ENTRIES_OPTIONAL);

		postprocedureDiagnosisSectionEClass = createEClass(POSTPROCEDURE_DIAGNOSIS_SECTION);

		vdtAmbulatoryPatientInfoEClass = createEClass(VDT_AMBULATORY_PATIENT_INFO);

		createTransmitSummaryOfCareRecordEClass = createEClass(CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD);

		vdtInpatientPatientInfoEClass = createEClass(VDT_INPATIENT_PATIENT_INFO);

		clinicalOfficeVisitSummaryEClass = createEClass(CLINICAL_OFFICE_VISIT_SUMMARY);

		assessmentAndPlanForCarePlanningEClass = createEClass(ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING);

		assessmentAndPlanForConditionOrConcernEClass = createEClass(ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CDAPackage theCDAPackage = (CDAPackage) EPackage.Registry.INSTANCE
				.getEPackage(CDAPackage.eNS_URI);
		ConsolPackage theConsolPackage = (ConsolPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConsolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		generalHeaderConstraintsEClass.getESuperTypes().add(
				theCDAPackage.getClinicalDocument());
		summaryOfCareRecordEClass.getESuperTypes().add(
				this.getGeneralHeaderConstraints());
		encountersSectionEClass.getESuperTypes().add(
				theConsolPackage.getEncountersSection());
		planOfCareSectionEClass.getESuperTypes().add(
				theConsolPackage.getPlanOfCareSection());
		assessmentAndPlanSectionEClass.getESuperTypes().add(
				theConsolPackage.getAssessmentAndPlanSection());
		instructionsSectionEClass.getESuperTypes().add(
				theConsolPackage.getInstructionsSection());
		assessmentSectionEClass.getESuperTypes().add(
				theConsolPackage.getAssessmentSection());
		hospitalAdmissionDiagnosisSectionEClass.getESuperTypes().add(
				theConsolPackage.getHospitalAdmissionDiagnosisSection());
		hospitalDischargeDiagnosisSectionEClass.getESuperTypes().add(
				theConsolPackage.getHospitalDischargeDiagnosisSection());
		postoperativeDiagnosisSectionEClass.getESuperTypes().add(
				theConsolPackage.getPostoperativeDiagnosisSection());
		preoperativeDiagnosisSectionEClass.getESuperTypes().add(
				theConsolPackage.getPreoperativeDiagnosisSection());
		medicationsAdministeredSectionEClass.getESuperTypes().add(
				theConsolPackage.getMedicationsAdministeredSection());
		hospitalAdmissionMedicationsSectionEntriesOptionalEClass
				.getESuperTypes()
				.add(theConsolPackage
						.getHospitalAdmissionMedicationsSectionEntriesOptional());
		hospitalDischargeMedicationsSectionEClass.getESuperTypes().add(
				theConsolPackage.getHospitalDischargeMedicationsSection());
		allergiesSectionEntriesOptionalEClass.getESuperTypes().add(
				theConsolPackage.getAllergiesSectionEntriesOptional());
		postprocedureDiagnosisSectionEClass.getESuperTypes().add(
				theConsolPackage.getPostprocedureDiagnosisSection());
		vdtAmbulatoryPatientInfoEClass.getESuperTypes().add(
				this.getGeneralHeaderConstraints());
		createTransmitSummaryOfCareRecordEClass.getESuperTypes().add(
				this.getGeneralHeaderConstraints());
		vdtInpatientPatientInfoEClass.getESuperTypes().add(
				this.getGeneralHeaderConstraints());
		clinicalOfficeVisitSummaryEClass.getESuperTypes().add(
				this.getGeneralHeaderConstraints());
		assessmentAndPlanForCarePlanningEClass.getESuperTypes().add(
				theConsolPackage.getAssessmentAndPlanSection());
		assessmentAndPlanForConditionOrConcernEClass.getESuperTypes().add(
				theConsolPackage.getAssessmentAndPlanSection());

		// Initialize classes and features; add operations and parameters
		initEClass(generalHeaderConstraintsEClass,
				GeneralHeaderConstraints.class, "GeneralHeaderConstraints",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(generalHeaderConstraintsEClass,
				ecorePackage.getEBoolean(),
				"validateGeneralHeaderConstraintsTemplateId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass,
				ecorePackage.getEBoolean(),
				"validateGeneralHeaderConstraintsRecordTarget", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				generalHeaderConstraintsEClass,
				ecorePackage.getEBoolean(),
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				generalHeaderConstraintsEClass,
				ecorePackage.getEBoolean(),
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatient",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass,
				ecorePackage.getEBoolean(),
				"validateGeneralHeaderConstraintsRecordTargetPatientRole", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(summaryOfCareRecordEClass, SummaryOfCareRecord.class,
				"SummaryOfCareRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordMedicationListConstraint", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordPlanOfCareSection", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordInstructionsSection", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordHospitalDischargeInstructionsSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordProblemSection", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordMedicationsAdministeredSection", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordSocialHistorySection", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordResultsSection", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordProceduresSection", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolEncountersSectionEncounterActivities",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				summaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass, this.getEncountersSection(),
				"getEncountersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass, this.getPlanOfCareSection(),
				"getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getAssessmentAndPlanSection(),
				"getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getInterventionsSection(),
				"getInterventionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass, this.getInstructionsSection(),
				"getInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getHospitalDischargeInstructionsSection(),
				"getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass, this.getAssessmentSection(),
				"getAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getHospitalAdmissionDiagnosisSection(),
				"getHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getHospitalDischargeDiagnosisSection(),
				"getHospitalDischargeDiagnosisSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getPostoperativeDiagnosisSection(),
				"getPostoperativeDiagnosisSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getProblemSection(), "getProblemSection", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getAllergiesSection(), "getAllergiesSection",
				1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getHistoryOfPastIllnessSection(),
				"getHistoryOfPastIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getReasonForVisitSection(),
				"getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getChiefComplaintSection(),
				"getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getChiefComplaintAndReasonForVisitSection(),
				"getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getPreoperativeDiagnosisSection(),
				"getPreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getImmunizationsSection(),
				"getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getMedicationsAdministeredSection(),
				"getMedicationsAdministeredSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getMedicationsSection(),
				"getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getHospitalAdmissionMedicationsSectionEntriesOptional(),
				"getHospitalAdmissionMedicationsSectionEntriesOptional", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getHospitalDischargeMedicationsSection(),
				"getHospitalDischargeMedicationsSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getSocialHistorySection(),
				"getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getResultsSection(), "getResultsSection", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getVitalSignsSection(),
				"getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getVitalSignsSectionEntriesOptional(),
				"getVitalSignsSectionEntriesOptional", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getProceduresSection(),
				"getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getAllergiesSectionEntriesOptional(),
				"getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				this.getPostprocedureDiagnosisSection(),
				"getPostprocedureDiagnosisSection", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(summaryOfCareRecordEClass,
				theConsolPackage.getReasonForReferralSection(),
				"getReasonForReferralSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(encountersSectionEClass, EncountersSection.class,
				"EncountersSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encountersSectionEClass, ecorePackage.getEBoolean(),
				"validateMu2consolEncountersSectionEncounterActivities", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(encountersSectionEClass,
				theConsolPackage.getEncounterActivities(),
				"getmu2consolEncounterActivitiess", 1, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(planOfCareSectionEClass, PlanOfCareSection.class,
				"PlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				planOfCareSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				planOfCareSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				planOfCareSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				planOfCareSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(planOfCareSectionEClass,
				theConsolPackage.getPlanOfCareActivityAct(),
				"getmu2consolPlanOfCareActivityAct", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(planOfCareSectionEClass,
				theConsolPackage.getPlanOfCareActivityEncounter(),
				"getmu2consolPlanOfCareActivityEncounter", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(planOfCareSectionEClass,
				theConsolPackage.getPlanOfCareActivityObservation(),
				"getmu2consolPlanOfCareActivityObservation", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(assessmentAndPlanSectionEClass,
				AssessmentAndPlanSection.class, "AssessmentAndPlanSection",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(assessmentAndPlanSectionEClass,
				theConsolPackage.getPlanOfCareActivityProcedure(),
				"getPlanOfCareActivityProcedure", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
				assessmentAndPlanSectionEClass,
				theConsolPackage.getPlanOfCareActivitySubstanceAdministration(),
				"getPlanOfCareActivitySubstanceAdministration", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(assessmentAndPlanSectionEClass,
				theConsolPackage.getPlanOfCareActivitySupply(),
				"getPlanOfCareActivitySupply", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(assessmentAndPlanSectionEClass,
				theConsolPackage.getProblemObservation(),
				"getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(instructionsSectionEClass, InstructionsSection.class,
				"InstructionsSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(instructionsSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolInstructionsSectionInstructions", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(instructionsSectionEClass,
				theConsolPackage.getInstructions(),
				"getmu2consolInstructionss", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(assessmentSectionEClass, AssessmentSection.class,
				"AssessmentSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assessmentSectionEClass, ecorePackage.getEBoolean(),
				"validateMu2consolAssessmentSectionProblemObservation", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(assessmentSectionEClass,
				theConsolPackage.getProblemObservation(),
				"getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hospitalAdmissionDiagnosisSectionEClass,
				HospitalAdmissionDiagnosisSection.class,
				"HospitalAdmissionDiagnosisSection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				hospitalAdmissionDiagnosisSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(hospitalAdmissionDiagnosisSectionEClass,
				theConsolPackage.getHospitalAdmissionDiagnosis(),
				"getmu2consolHospitalAdmissionDiagnosis", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(hospitalDischargeDiagnosisSectionEClass,
				HospitalDischargeDiagnosisSection.class,
				"HospitalDischargeDiagnosisSection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				hospitalDischargeDiagnosisSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(hospitalDischargeDiagnosisSectionEClass,
				theConsolPackage.getHospitalDischargeDiagnosis(),
				"getmu2consolHospitalDischargeDiagnosis", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(postoperativeDiagnosisSectionEClass,
				PostoperativeDiagnosisSection.class,
				"PostoperativeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				postoperativeDiagnosisSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPostoperativeDiagnosisSectionProblemObservation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(postoperativeDiagnosisSectionEClass,
				theConsolPackage.getProblemObservation(),
				"getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(preoperativeDiagnosisSectionEClass,
				PreoperativeDiagnosisSection.class,
				"PreoperativeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				preoperativeDiagnosisSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(preoperativeDiagnosisSectionEClass,
				theConsolPackage.getPreoperativeDiagnosis(),
				"getmu2consolPreoperativeDiagnosis", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(medicationsAdministeredSectionEClass,
				MedicationsAdministeredSection.class,
				"MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				medicationsAdministeredSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolMedicationsAdministeredSectionMedicationActivity",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(medicationsAdministeredSectionEClass,
				theConsolPackage.getMedicationActivity(),
				"getmu2consolMedicationActivities", 1, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(hospitalAdmissionMedicationsSectionEntriesOptionalEClass,
				HospitalAdmissionMedicationsSectionEntriesOptional.class,
				"HospitalAdmissionMedicationsSectionEntriesOptional",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				hospitalAdmissionMedicationsSectionEntriesOptionalEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				hospitalAdmissionMedicationsSectionEntriesOptionalEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(hospitalAdmissionMedicationsSectionEntriesOptionalEClass,
				theConsolPackage.getAdmissionMedication(),
				"getmu2consolAdmissionMedications", 1, -1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(hospitalAdmissionMedicationsSectionEntriesOptionalEClass,
				theConsolPackage.getMedicationActivity(),
				"getMedicationActivity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hospitalDischargeMedicationsSectionEClass,
				HospitalDischargeMedicationsSection.class,
				"HospitalDischargeMedicationsSection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				hospitalDischargeMedicationsSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				hospitalDischargeMedicationsSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(hospitalDischargeMedicationsSectionEClass,
				theConsolPackage.getDischargeMedication(),
				"getmu2consolDischargeMedications", 1, -1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(hospitalDischargeMedicationsSectionEClass,
				theConsolPackage.getMedicationActivity(),
				"getMedicationActivity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(allergiesSectionEntriesOptionalEClass,
				AllergiesSectionEntriesOptional.class,
				"AllergiesSectionEntriesOptional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				allergiesSectionEntriesOptionalEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(allergiesSectionEntriesOptionalEClass,
				theConsolPackage.getAllergyProblemAct(),
				"getmu2consolAllergyProblemAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(postprocedureDiagnosisSectionEClass,
				PostprocedureDiagnosisSection.class,
				"PostprocedureDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				postprocedureDiagnosisSectionEClass,
				ecorePackage.getEBoolean(),
				"validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(postprocedureDiagnosisSectionEClass,
				theConsolPackage.getPostprocedureDiagnosis(),
				"getmu2consolPostprocedureDiagnosis", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(vdtAmbulatoryPatientInfoEClass,
				VDTAmbulatoryPatientInfo.class, "VDTAmbulatoryPatientInfo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				vdtAmbulatoryPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				vdtAmbulatoryPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				vdtAmbulatoryPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vdtAmbulatoryPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTAmbulatoryPatientInfoMedicationListConstraint", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createTransmitSummaryOfCareRecordEClass,
				CreateTransmitSummaryOfCareRecord.class,
				"CreateTransmitSummaryOfCareRecord", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				createTransmitSummaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				createTransmitSummaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				createTransmitSummaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				createTransmitSummaryOfCareRecordEClass,
				ecorePackage.getEBoolean(),
				"validateCreateTransmitSummaryOfCareRecordMedicationListConstraint",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vdtInpatientPatientInfoEClass,
				VDTInpatientPatientInfo.class, "VDTInpatientPatientInfo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				vdtInpatientPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				vdtInpatientPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				vdtInpatientPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vdtInpatientPatientInfoEClass,
				ecorePackage.getEBoolean(),
				"validateVDTInpatientPatientInfoMedicationListConstraint", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clinicalOfficeVisitSummaryEClass,
				ClinicalOfficeVisitSummary.class, "ClinicalOfficeVisitSummary",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
				clinicalOfficeVisitSummaryEClass,
				ecorePackage.getEBoolean(),
				"validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				clinicalOfficeVisitSummaryEClass,
				ecorePackage.getEBoolean(),
				"validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
				clinicalOfficeVisitSummaryEClass,
				ecorePackage.getEBoolean(),
				"validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clinicalOfficeVisitSummaryEClass,
				ecorePackage.getEBoolean(),
				"validateClinicalOfficeVisitSummaryMedicationListConstraint",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assessmentAndPlanForCarePlanningEClass,
				AssessmentAndPlanForCarePlanning.class,
				"AssessmentAndPlanForCarePlanning", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(assessmentAndPlanForCarePlanningEClass,
				theConsolPackage.getPlanOfCareActivityProcedure(),
				"getPlanOfCareActivityProcedure", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
				assessmentAndPlanForCarePlanningEClass,
				theConsolPackage.getPlanOfCareActivitySubstanceAdministration(),
				"getPlanOfCareActivitySubstanceAdministration", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(assessmentAndPlanForCarePlanningEClass,
				theConsolPackage.getPlanOfCareActivitySupply(),
				"getPlanOfCareActivitySupply", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(assessmentAndPlanForConditionOrConcernEClass,
				AssessmentAndPlanForConditionOrConcern.class,
				"AssessmentAndPlanForConditionOrConcern", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(assessmentAndPlanForConditionOrConcernEClass,
				theConsolPackage.getProblemObservation(),
				"getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget
		createMu2consolGeneralHeaderConstraintsRecordTargetAnnotations();
		// http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole
		createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations();
		// http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient
		createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
		addAnnotation(
				generalHeaderConstraintsEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole",
						"templateId.root",
						"2.16.840.1.113883.10.20.22.1.1",
						"constraints.validation.query",
						"GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole" });
		addAnnotation(
				summaryOfCareRecordEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"SummaryOfCareRecordTemplateId SummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection SummaryOfCareRecordMu2EncounterDiagnosesRequirements SummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection SummaryOfCareRecordMedicationListConstraint SummaryOfCareRecordPlanOfCareSection SummaryOfCareRecordInstructionsSection SummaryOfCareRecordHospitalDischargeInstructionsSection SummaryOfCareRecordProblemSection SummaryOfCareRecordMedicationsAdministeredSection SummaryOfCareRecordSocialHistorySection SummaryOfCareRecordResultsSection SummaryOfCareRecordProceduresSection SummaryOfCareRecordmu2consolEncountersSectionEncounterActivities SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordmu2consolInstructionsSectionInstructions SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis SummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity SummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication SummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity SummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
						"templateId.root",
						"2.16.840.1.113883.11.11.11.1.1",
						"constraints.validation.query",
						"SummaryOfCareRecordmu2consolEncountersSectionEncounterActivities SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordmu2consolInstructionsSectionInstructions SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis SummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity SummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionDischargeMedication SummaryOfCareRecordmu2consolHospitalDischargeMedicationsSectionMedicationActivity SummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis" });
		addAnnotation(encountersSectionEClass, source, new String[] {
				"constraints.validation.error",
				"mu2consolEncountersSectionEncounterActivities" });
		addAnnotation(
				planOfCareSectionEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"mu2consolPlanOfCareSectionPlanOfCareActivityAct mu2consolPlanOfCareSectionPlanOfCareActivityEncounter mu2consolPlanOfCareSectionPlanOfCareActivityObservation mu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection mu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct mu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter mu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation" });
		addAnnotation(instructionsSectionEClass, source, new String[] {
				"constraints.validation.error",
				"mu2consolInstructionsSectionInstructions" });
		addAnnotation(assessmentSectionEClass, source, new String[] {
				"constraints.validation.error",
				"mu2consolAssessmentSectionProblemObservation" });
		addAnnotation(
				hospitalAdmissionDiagnosisSectionEClass,
				source,
				new String[] { "constraints.validation.error",
						"mu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis" });
		addAnnotation(
				hospitalDischargeDiagnosisSectionEClass,
				source,
				new String[] { "constraints.validation.error",
						"mu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis" });
		addAnnotation(
				postoperativeDiagnosisSectionEClass,
				source,
				new String[] { "constraints.validation.error",
						"mu2consolPostoperativeDiagnosisSectionProblemObservation" });
		addAnnotation(preoperativeDiagnosisSectionEClass, source, new String[] {
				"constraints.validation.error",
				"mu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis" });
		addAnnotation(
				medicationsAdministeredSectionEClass,
				source,
				new String[] { "constraints.validation.error",
						"mu2consolMedicationsAdministeredSectionMedicationActivity" });
		addAnnotation(
				hospitalAdmissionMedicationsSectionEntriesOptionalEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity" });
		addAnnotation(
				hospitalDischargeMedicationsSectionEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"mu2consolHospitalDischargeMedicationsSectionDischargeMedication mu2consolHospitalDischargeMedicationsSectionMedicationActivity" });
		addAnnotation(
				allergiesSectionEntriesOptionalEClass,
				source,
				new String[] { "constraints.validation.error",
						"mu2consolAllergiesSectionEntriesOptionalAllergyProblemAct" });
		addAnnotation(
				postprocedureDiagnosisSectionEClass,
				source,
				new String[] { "constraints.validation.error",
						"mu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis" });
		addAnnotation(
				vdtAmbulatoryPatientInfoEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"VDTAmbulatoryPatientInfoTemplateId VDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection VDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements VDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection VDTAmbulatoryPatientInfoMedicationListConstraint",
						"templateId.root", "2.16.840.1.113883.11.11.11.1.3" });
		addAnnotation(
				createTransmitSummaryOfCareRecordEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"CreateTransmitSummaryOfCareRecordTemplateId CreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection CreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements CreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection CreateTransmitSummaryOfCareRecordMedicationListConstraint",
						"templateId.root", "2.16.840.1.113883.11.11.11.1.2" });
		addAnnotation(
				vdtInpatientPatientInfoEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"VDTInpatientPatientInfoTemplateId VDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection VDTInpatientPatientInfoMu2EncounterDiagnosesRequirements VDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection VDTInpatientPatientInfoMedicationListConstraint",
						"templateId.root", "2.16.840.1.113883.11.11.11.1.4" });
		addAnnotation(
				clinicalOfficeVisitSummaryEClass,
				source,
				new String[] {
						"constraints.validation.error",
						"ClinicalOfficeVisitSummaryTemplateId ClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection ClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements ClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection ClinicalOfficeVisitSummaryMedicationListConstraint",
						"templateId.root", "2.16.840.1.113883.11.11.11.1.5" });
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
		addAnnotation(generalHeaderConstraintsEClass, source, new String[] {
				"constraints.validation.error", "RecordTargetPatientRole" });
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml
	 * /cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole
	 * </b>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole";
		addAnnotation(generalHeaderConstraintsEClass, source, new String[] {
				"constraints.validation.error", "PatientRolePatient" });
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
		addAnnotation(generalHeaderConstraintsEClass, source,
				new String[] { "constraints.validation.error",
						"PatientLanguageCommunication" });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation(summaryOfCareRecordEClass, source, new String[] {});
		addAnnotation(vdtAmbulatoryPatientInfoEClass, source, new String[] {});
		addAnnotation(createTransmitSummaryOfCareRecordEClass, source,
				new String[] {});
		addAnnotation(vdtInpatientPatientInfoEClass, source, new String[] {});
		addAnnotation(clinicalOfficeVisitSummaryEClass, source, new String[] {});
	}

} // Mu2consolPackageImpl
