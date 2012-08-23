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
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
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
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
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
	private EClass assessmentAndPlanForCarePlanningEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass planOfCareSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass assessmentAndPlanForConditionOrConcernEClass = null;

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
	private EClass allergiesSectionEntriesOptionalEClass = null;

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
	public EClass getAssessmentAndPlanForCarePlanning() {
        return assessmentAndPlanForCarePlanningEClass;
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
	public EClass getAssessmentAndPlanForConditionOrConcern() {
        return assessmentAndPlanForConditionOrConcernEClass;
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
	public EClass getAllergiesSectionEntriesOptional() {
        return allergiesSectionEntriesOptionalEClass;
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

        medicationsAdministeredSectionEClass = createEClass(MEDICATIONS_ADMINISTERED_SECTION);

        hospitalAdmissionMedicationsSectionEntriesOptionalEClass = createEClass(HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL);

        allergiesSectionEntriesOptionalEClass = createEClass(ALLERGIES_SECTION_ENTRIES_OPTIONAL);

        postprocedureDiagnosisSectionEClass = createEClass(POSTPROCEDURE_DIAGNOSIS_SECTION);

        assessmentAndPlanForCarePlanningEClass = createEClass(ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING);

        assessmentAndPlanForConditionOrConcernEClass = createEClass(ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN);

        instructionsSectionEClass = createEClass(INSTRUCTIONS_SECTION);
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
        medicationsAdministeredSectionEClass.getESuperTypes().add(theConsolPackage.getMedicationsAdministeredSection());
        hospitalAdmissionMedicationsSectionEntriesOptionalEClass.getESuperTypes().add(theConsolPackage.getHospitalAdmissionMedicationsSectionEntriesOptional());
        allergiesSectionEntriesOptionalEClass.getESuperTypes().add(theConsolPackage.getAllergiesSectionEntriesOptional());
        postprocedureDiagnosisSectionEClass.getESuperTypes().add(theConsolPackage.getPostprocedureDiagnosisSection());
        assessmentAndPlanForCarePlanningEClass.getESuperTypes().add(theConsolPackage.getAssessmentAndPlanSection());
        assessmentAndPlanForConditionOrConcernEClass.getESuperTypes().add(theConsolPackage.getAssessmentAndPlanSection());
        instructionsSectionEClass.getESuperTypes().add(theConsolPackage.getInstructionsSection());

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

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsDocumentationOfServiceEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(summaryOfCareRecordEClass, SummaryOfCareRecord.class, "SummaryOfCareRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMedicationListConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMedicationAllergy", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordReasonForHospitalization", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMedicationList", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordHospitalDischargeInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMedicationsAdministeredSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordInstructionsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getInstructionsSection(), "getInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getAssessmentSection(), "getAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getHospitalAdmissionDiagnosisSection(), "getHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getHospitalDischargeDiagnosisSection(), "getHospitalDischargeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPostoperativeDiagnosisSection(), "getPostoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHistoryOfPastIllnessSection(), "getHistoryOfPastIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getReasonForVisitSection(), "getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPreoperativeDiagnosisSection(), "getPreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getMedicationsAdministeredSection(), "getMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getHospitalAdmissionMedicationsSectionEntriesOptional(), "getHospitalAdmissionMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHospitalDischargeMedicationsSection(), "getHospitalDischargeMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getVitalSignsSectionEntriesOptional(), "getVitalSignsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getAllergiesSectionEntriesOptional(), "getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPostprocedureDiagnosisSection(), "getPostprocedureDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getReasonForReferralSection(), "getReasonForReferralSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(planOfCareSectionEClass, PlanOfCareSection.class, "PlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityAct(), "getmu2consolPlanOfCareActivityAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityEncounter(), "getmu2consolPlanOfCareActivityEncounter", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityObservation(), "getmu2consolPlanOfCareActivityObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

        addEOperation(hospitalAdmissionDiagnosisSectionEClass, theConsolPackage.getHospitalAdmissionDiagnosis(), "getmu2consolHospitalAdmissionDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hospitalDischargeDiagnosisSectionEClass, HospitalDischargeDiagnosisSection.class, "HospitalDischargeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hospitalDischargeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hospitalDischargeDiagnosisSectionEClass, theConsolPackage.getHospitalDischargeDiagnosis(), "getmu2consolHospitalDischargeDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

        addEOperation(preoperativeDiagnosisSectionEClass, theConsolPackage.getPreoperativeDiagnosis(), "getmu2consolPreoperativeDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(medicationsAdministeredSectionEClass, MedicationsAdministeredSection.class, "MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(medicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolMedicationsAdministeredSectionMedicationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(medicationsAdministeredSectionEClass, theConsolPackage.getMedicationActivity(), "getmu2consolMedicationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hospitalAdmissionMedicationsSectionEntriesOptionalEClass, HospitalAdmissionMedicationsSectionEntriesOptional.class, "HospitalAdmissionMedicationsSectionEntriesOptional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hospitalAdmissionMedicationsSectionEntriesOptionalEClass, ecorePackage.getEBoolean(), "validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hospitalAdmissionMedicationsSectionEntriesOptionalEClass, theConsolPackage.getAdmissionMedication(), "getmu2consolAdmissionMedications", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(allergiesSectionEntriesOptionalEClass, AllergiesSectionEntriesOptional.class, "AllergiesSectionEntriesOptional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(allergiesSectionEntriesOptionalEClass, ecorePackage.getEBoolean(), "validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(allergiesSectionEntriesOptionalEClass, theConsolPackage.getAllergyProblemAct(), "getmu2consolAllergyProblemAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(postprocedureDiagnosisSectionEClass, PostprocedureDiagnosisSection.class, "PostprocedureDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(postprocedureDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(postprocedureDiagnosisSectionEClass, theConsolPackage.getPostprocedureDiagnosis(), "getmu2consolPostprocedureDiagnosis", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentAndPlanForCarePlanningEClass, AssessmentAndPlanForCarePlanning.class, "AssessmentAndPlanForCarePlanning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(assessmentAndPlanForCarePlanningEClass, ecorePackage.getEBoolean(), "validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(assessmentAndPlanForCarePlanningEClass, theConsolPackage.getPlanOfCareActivityProcedure(), "getPlanOfCareActivityProcedure", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanForCarePlanningEClass, theConsolPackage.getPlanOfCareActivitySubstanceAdministration(), "getPlanOfCareActivitySubstanceAdministration", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanForCarePlanningEClass, theConsolPackage.getPlanOfCareActivitySupply(), "getPlanOfCareActivitySupply", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentAndPlanForConditionOrConcernEClass, AssessmentAndPlanForConditionOrConcern.class, "AssessmentAndPlanForConditionOrConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(assessmentAndPlanForConditionOrConcernEClass, ecorePackage.getEBoolean(), "validateAssessmentAndPlanForConditionOrConcernProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(assessmentAndPlanForConditionOrConcernEClass, theConsolPackage.getProblemObservation(), "getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(instructionsSectionEClass, InstructionsSection.class, "InstructionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(instructionsSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolInstructionsSectionInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(instructionsSectionEClass, theConsolPackage.getInstructions(), "getmu2consolInstructionss", 1, -1, IS_UNIQUE, !IS_ORDERED);

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
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
        createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf
        createMu2consolGeneralHeaderConstraintsDocumentationOfAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1Annotations();
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
             "constraints.validation.error", "mu2consolGeneralHeaderConstraintsRecordTarget mu2consolGeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent"
           });                                  
        addAnnotation
          (summaryOfCareRecordEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SummaryOfCareRecordTemplateId SummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection SummaryOfCareRecordMu2EncounterDiagnosesRequirements SummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns SummaryOfCareRecordMedicationListConstraint SummaryOfCareRecordCarePlanning SummaryOfCareRecordMedicationAllergy SummaryOfCareRecordReasonForHospitalization SummaryOfCareRecordMedicationList SummaryOfCareRecordPlanOfCareSection SummaryOfCareRecordInstructionsSection SummaryOfCareRecordHospitalDischargeInstructionsSection SummaryOfCareRecordProblemSection SummaryOfCareRecordMedicationsAdministeredSection SummaryOfCareRecordSocialHistorySection SummaryOfCareRecordResultsSection SummaryOfCareRecordProceduresSection SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity SummaryOfCareRecordInstructionsSectionTemplateId SummaryOfCareRecordmu2consolInstructionsSectionInstructions SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
             "templateId.root", "2.16.840.1.113883.11.11.11.1.1",
             "constraints.validation.query", "SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity SummaryOfCareRecordInstructionsSectionTemplateId SummaryOfCareRecordmu2consolInstructionsSectionInstructions SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis"
           });                                                                                                                                                                                  
        addAnnotation
          (planOfCareSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolPlanOfCareSectionCarePlanningForPlanOfCare"
           });                       
        addAnnotation
          (assessmentSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolAssessmentSectionProblemObservation"
           });           
        addAnnotation
          (hospitalAdmissionDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis"
           });           
        addAnnotation
          (hospitalDischargeDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis"
           });           
        addAnnotation
          (postoperativeDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolPostoperativeDiagnosisSectionProblemObservation"
           });           
        addAnnotation
          (preoperativeDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis"
           });           
        addAnnotation
          (medicationsAdministeredSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolMedicationsAdministeredSectionMedicationActivity"
           });           
        addAnnotation
          (hospitalAdmissionMedicationsSectionEntriesOptionalEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication"
           });           
        addAnnotation
          (allergiesSectionEntriesOptionalEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolAllergiesSectionEntriesOptionalAllergyProblemAct"
           });           
        addAnnotation
          (postprocedureDiagnosisSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis"
           });                     
        addAnnotation
          (assessmentAndPlanForConditionOrConcernEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AssessmentAndPlanForConditionOrConcernProblemObservation"
           });           
        addAnnotation
          (instructionsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "mu2consolInstructionsSectionTemplateId mu2consolInstructionsSectionInstructions",
             "templateId.root", "null"
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
             "constraints.validation.error", "RecordTargetPatientRole"
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
             "constraints.validation.error", "PatientRolePatient"
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
             "constraints.validation.error", "PatientName PatientAdministrativeGenderCode PatientEthnicGroupCode PatientRaceCode PatientBirthTime PatientLanguageCommunication"
           });                                                                                                                                                                                                                                                                                                                   
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication";          
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "LanguageCommunicationLanguageCode"
           });                                                                                                                                                                                                                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf";           
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "DocumentationOfServiceEvent"
           });                                                                                                                                                                                                                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent";            
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ServiceEventPerformer"
           });                                                                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1Annotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1";             
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "Performer1AssignedEntity"
           });                                                                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsComponent1EncompassingEncounterAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter";              
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "EncompassingEncounterEffectiveTime EncompassingEncounterLocation EncompassingEncounterResponsibleParty"
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
          (summaryOfCareRecordEClass, 
           source, 
           new String[] {
           });                                                                                                                                                                                                                                                                                     
        addAnnotation
          (instructionsSectionEClass, 
           source, 
           new String[] {
           });      
    }

} // Mu2consolPackageImpl
