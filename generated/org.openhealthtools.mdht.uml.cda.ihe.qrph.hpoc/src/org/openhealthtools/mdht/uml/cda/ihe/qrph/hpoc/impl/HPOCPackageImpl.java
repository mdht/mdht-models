/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.CDAPackage;


import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.CommentActivity;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCFactory;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPoCProblemConcern;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPoCProblems;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPoCProblemsSubSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HPOCPackageImpl extends EPackageImpl implements HPOCPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareDocumentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareHeaderEClass = null;

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
    private EClass problemsSectionEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass problemConcernEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareProblemConcernEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareProblemsSubSectionEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass procedureActivityProcedureEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass procedureActivityActEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareRelevantProceduresSubSectionEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareProcedureActivityProcedureEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareProcedureActivityActEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass procedureSectionEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareSectionEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareActivityActEClass = null;

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareActivityEncounterEClass = null;

								/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareActivityObservationEClass = null;

								/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareActivityProcedureEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareActivitySubstanceAdministrationEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareActivityNonMedicinalSupplyEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningOrganizerEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningOutcomeObservationLeftEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reasonNotScreenedEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningOutcomeObservationRightEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningResultsOrganizerEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningResultObservationEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riskIndicatorForHearingLossObservationEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingPlanOfCareInstructionsEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hearingScreeningSectionEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private HPOCPackageImpl()
    {
        super(eNS_URI, HPOCFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link HPOCPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static HPOCPackage init()
    {
        if (isInited) return (HPOCPackage)EPackage.Registry.INSTANCE.getEPackage(HPOCPackage.eNS_URI);

        // Obtain or create and register package
        HPOCPackageImpl theHPOCPackage = (HPOCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HPOCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HPOCPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ConsolPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theHPOCPackage.createPackageContents();

        // Initialize created meta-data
        theHPOCPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theHPOCPackage, 
             new EValidator.Descriptor()
             {
                 public EValidator getEValidator()
                 {
                     return HPOCValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theHPOCPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theHPOCPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(HPOCPackage.eNS_URI, theHPOCPackage);
        return theHPOCPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareDocument()
    {
        return hearingPlanOfCareDocumentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareHeader() {
        return hearingPlanOfCareHeaderEClass;
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
    public EClass getProblemsSection()
    {
        return problemsSectionEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProblemConcern()
    {
        return problemConcernEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareProblemConcern()
    {
        return hearingPlanOfCareProblemConcernEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareProblemsSubSection()
    {
        return hearingPlanOfCareProblemsSubSectionEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureActivityProcedure()
    {
        return procedureActivityProcedureEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureActivityAct()
    {
        return procedureActivityActEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareRelevantProceduresSubSection()
    {
        return hearingPlanOfCareRelevantProceduresSubSectionEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareProcedureActivityProcedure()
    {
        return hearingPlanOfCareProcedureActivityProcedureEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareProcedureActivityAct()
    {
        return hearingPlanOfCareProcedureActivityActEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureSection()
    {
        return procedureSectionEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareSection()
    {
        return hearingPlanOfCareSectionEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareActivityAct()
    {
        return hearingPlanOfCareActivityActEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareActivityEncounter() {
        return hearingPlanOfCareActivityEncounterEClass;
    }

								/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareActivityObservation() {
        return hearingPlanOfCareActivityObservationEClass;
    }

								/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareActivityProcedure()
    {
        return hearingPlanOfCareActivityProcedureEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareActivitySubstanceAdministration()
    {
        return hearingPlanOfCareActivitySubstanceAdministrationEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareActivityNonMedicinalSupply()
    {
        return hearingPlanOfCareActivityNonMedicinalSupplyEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningOrganizer()
    {
        return hearingScreeningOrganizerEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningOutcomeObservationLeft()
    {
        return hearingScreeningOutcomeObservationLeftEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReasonNotScreened()
    {
        return reasonNotScreenedEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningOutcomeObservationRight()
    {
        return hearingScreeningOutcomeObservationRightEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningResultsOrganizer()
    {
        return hearingScreeningResultsOrganizerEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningResultObservation()
    {
        return hearingScreeningResultObservationEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiskIndicatorForHearingLossObservation()
    {
        return riskIndicatorForHearingLossObservationEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingPlanOfCareInstructions()
    {
        return hearingPlanOfCareInstructionsEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHearingScreeningSection()
    {
        return hearingScreeningSectionEClass;
    }

        /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HPOCFactory getHPOCFactory()
    {
        return (HPOCFactory)getEFactoryInstance();
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
        hearingPlanOfCareDocumentEClass = createEClass(HEARING_PLAN_OF_CARE_DOCUMENT);

        hearingPlanOfCareHeaderEClass = createEClass(HEARING_PLAN_OF_CARE_HEADER);

        hearingPlanOfCareSectionEClass = createEClass(HEARING_PLAN_OF_CARE_SECTION);

        hearingScreeningSectionEClass = createEClass(HEARING_SCREENING_SECTION);

        riskIndicatorsForHearingLossSectionEClass = createEClass(RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);

        problemsSectionEClass = createEClass(PROBLEMS_SECTION);

        procedureSectionEClass = createEClass(PROCEDURE_SECTION);

        hearingPlanOfCareActivityActEClass = createEClass(HEARING_PLAN_OF_CARE_ACTIVITY_ACT);

        hearingPlanOfCareActivityEncounterEClass = createEClass(HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);

        hearingPlanOfCareActivityObservationEClass = createEClass(HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION);

        hearingPlanOfCareActivityProcedureEClass = createEClass(HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE);

        hearingPlanOfCareActivitySubstanceAdministrationEClass = createEClass(HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);

        hearingPlanOfCareInstructionsEClass = createEClass(HEARING_PLAN_OF_CARE_INSTRUCTIONS);

        hearingPlanOfCareActivityNonMedicinalSupplyEClass = createEClass(HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);

        hearingScreeningOrganizerEClass = createEClass(HEARING_SCREENING_ORGANIZER);

        hearingScreeningOutcomeObservationLeftEClass = createEClass(HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);

        reasonNotScreenedEClass = createEClass(REASON_NOT_SCREENED);

        hearingScreeningOutcomeObservationRightEClass = createEClass(HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);

        hearingScreeningResultsOrganizerEClass = createEClass(HEARING_SCREENING_RESULTS_ORGANIZER);

        hearingScreeningResultObservationEClass = createEClass(HEARING_SCREENING_RESULT_OBSERVATION);

        riskIndicatorForHearingLossObservationEClass = createEClass(RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);

        problemConcernEClass = createEClass(PROBLEM_CONCERN);

        hearingPlanOfCareProblemConcernEClass = createEClass(HEARING_PLAN_OF_CARE_PROBLEM_CONCERN);

        hearingPlanOfCareProblemsSubSectionEClass = createEClass(HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);

        procedureActivityProcedureEClass = createEClass(PROCEDURE_ACTIVITY_PROCEDURE);

        procedureActivityActEClass = createEClass(PROCEDURE_ACTIVITY_ACT);

        hearingPlanOfCareRelevantProceduresSubSectionEClass = createEClass(HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);

        hearingPlanOfCareProcedureActivityProcedureEClass = createEClass(HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE);

        hearingPlanOfCareProcedureActivityActEClass = createEClass(HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT);
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
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
        ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        hearingPlanOfCareDocumentEClass.getESuperTypes().add(this.getHearingPlanOfCareHeader());
        hearingPlanOfCareHeaderEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
        hearingPlanOfCareSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        hearingScreeningSectionEClass.getESuperTypes().add(theConsolPackage.getResultsSection());
        riskIndicatorsForHearingLossSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        problemsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        procedureSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        hearingPlanOfCareActivityActEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityAct());
        hearingPlanOfCareActivityEncounterEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityEncounter());
        hearingPlanOfCareActivityObservationEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityObservation());
        hearingPlanOfCareActivityProcedureEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityProcedure());
        hearingPlanOfCareActivitySubstanceAdministrationEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivitySubstanceAdministration());
        hearingPlanOfCareInstructionsEClass.getESuperTypes().add(theConsolPackage.getInstructions());
        hearingPlanOfCareActivityNonMedicinalSupplyEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivitySupply());
        hearingScreeningOrganizerEClass.getESuperTypes().add(theConsolPackage.getResultOrganizer());
        hearingScreeningOutcomeObservationLeftEClass.getESuperTypes().add(theCDAPackage.getObservation());
        reasonNotScreenedEClass.getESuperTypes().add(theCDAPackage.getAct());
        hearingScreeningOutcomeObservationRightEClass.getESuperTypes().add(theCDAPackage.getObservation());
        hearingScreeningResultsOrganizerEClass.getESuperTypes().add(theConsolPackage.getResultOrganizer());
        hearingScreeningResultObservationEClass.getESuperTypes().add(theConsolPackage.getResultObservation());
        riskIndicatorForHearingLossObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        problemConcernEClass.getESuperTypes().add(theConsolPackage.getProblemConcernAct());
        hearingPlanOfCareProblemConcernEClass.getESuperTypes().add(theConsolPackage.getProblemConcernAct());
        hearingPlanOfCareProblemsSubSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        procedureActivityProcedureEClass.getESuperTypes().add(theConsolPackage.getProcedureActivityProcedure());
        procedureActivityActEClass.getESuperTypes().add(theConsolPackage.getProcedureActivityAct());
        hearingPlanOfCareRelevantProceduresSubSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        hearingPlanOfCareProcedureActivityProcedureEClass.getESuperTypes().add(theConsolPackage.getProcedureActivityProcedure());
        hearingPlanOfCareProcedureActivityActEClass.getESuperTypes().add(theConsolPackage.getProcedureActivityAct());

        // Initialize classes and features; add operations and parameters
        initEClass(hearingPlanOfCareDocumentEClass, HearingPlanOfCareDocument.class, "HearingPlanOfCareDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentTypeIdRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentTypeIdExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentSetIdAndVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentSetId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentHearingPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentHearingScreeningSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentProblemsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareDocumentProcedureSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hearingPlanOfCareDocumentEClass, this.getHearingPlanOfCareSection(), "getHearingPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hearingPlanOfCareDocumentEClass, this.getHearingScreeningSection(), "getHearingScreeningSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hearingPlanOfCareDocumentEClass, this.getRiskIndicatorsForHearingLossSection(), "getRiskIndicatorsForHearingLossSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hearingPlanOfCareDocumentEClass, this.getProblemsSection(), "getProblemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hearingPlanOfCareDocumentEClass, this.getProcedureSection(), "getProcedureSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hearingPlanOfCareHeaderEClass, HearingPlanOfCareHeader.class, "HearingPlanOfCareHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareHeaderEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareHeaderTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareHeaderEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareHeaderRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareHeaderEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareHeaderCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareHeaderEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareHeaderComponentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareHeaderEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareHeaderDocumentationOf", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareHeaderEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareHeaderAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareSectionEClass, HearingPlanOfCareSection.class, "HearingPlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntryAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntryEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntryObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntryProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntrySubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntrySupply", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareSectionEntryInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningSectionEClass, HearingScreeningSection.class, "HearingScreeningSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingScreeningSectionEClass, ecorePackage.getEBoolean(), "validateHearingScreeningSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningSectionEClass, ecorePackage.getEBoolean(), "validateHearingScreeningSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningSectionEClass, ecorePackage.getEBoolean(), "validateHearingScreeningSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningSectionEClass, ecorePackage.getEBoolean(), "validateHearingScreeningSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningSectionEClass, ecorePackage.getEBoolean(), "validateHearingScreeningSectionEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(riskIndicatorsForHearingLossSectionEClass, RiskIndicatorsForHearingLossSection.class, "RiskIndicatorsForHearingLossSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorsForHearingLossSectionEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorsForHearingLossSectionEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(problemsSectionEClass, ProblemsSection.class, "ProblemsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionComponentHpocProblems", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(problemsSectionEClass, ecorePackage.getEBoolean(), "validateProblemsSectionEntryProblemConcern", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(procedureSectionEClass, ProcedureSection.class, "ProcedureSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionEntryProcedureActivityProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureSectionEClass, ecorePackage.getEBoolean(), "validateProcedureSectionEntryProcedureActivityAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareActivityActEClass, HearingPlanOfCareActivityAct.class, "HearingPlanOfCareActivityAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityActEffectiveTimeLowHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityActCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityActText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityActEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareActivityEncounterEClass, HearingPlanOfCareActivityEncounter.class, "HearingPlanOfCareActivityEncounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityEncounterCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityEncounterCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityEncounterStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityEncounterText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareActivityObservationEClass, HearingPlanOfCareActivityObservation.class, "HearingPlanOfCareActivityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityObservationText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareActivityProcedureEClass, HearingPlanOfCareActivityProcedure.class, "HearingPlanOfCareActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityProcedureEffectiveTimeLowHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityProcedureCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityProcedureCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityProcedureEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityProcedureStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityProcedureText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareActivitySubstanceAdministrationEClass, HearingPlanOfCareActivitySubstanceAdministration.class, "HearingPlanOfCareActivitySubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationConsumable", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareInstructionsEClass, HearingPlanOfCareInstructions.class, "HearingPlanOfCareInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareInstructionsEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareInstructionsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareInstructionsEClass, ecorePackage.getEBoolean(), "validateInstructionsStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareActivityNonMedicinalSupplyEClass, HearingPlanOfCareActivityNonMedicinalSupply.class, "HearingPlanOfCareActivityNonMedicinalSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareActivityNonMedicinalSupplyEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityNonMedicinalSupplyCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityNonMedicinalSupplyEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityNonMedicinalSupplyEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityNonMedicinalSupplyText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityNonMedicinalSupplyEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityNonMedicinalSupplyEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareActivityNonMedicinalSupplyEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningOrganizerEClass, HearingScreeningOrganizer.class, "HearingScreeningOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingScreeningOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOrganizerEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOrganizerComponentLeftEar", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOrganizerEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOrganizerComponentRightEar", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOrganizerEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOrganizerComponentResultsOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningOutcomeObservationLeftEClass, HearingScreeningOutcomeObservationLeft.class, "HearingScreeningOutcomeObservationLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftMethodCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftMethodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftTargetSiteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationLeftEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationLeftAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(reasonNotScreenedEClass, ReasonNotScreened.class, "ReasonNotScreened", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(reasonNotScreenedEClass, ecorePackage.getEBoolean(), "validateReasonNotScreenedTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reasonNotScreenedEClass, ecorePackage.getEBoolean(), "validateReasonNotScreenedClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reasonNotScreenedEClass, ecorePackage.getEBoolean(), "validateReasonNotScreenedMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reasonNotScreenedEClass, ecorePackage.getEBoolean(), "validateReasonNotScreenedCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reasonNotScreenedEClass, ecorePackage.getEBoolean(), "validateReasonNotScreenedCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reasonNotScreenedEClass, ecorePackage.getEBoolean(), "validateReasonNotScreenedText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningOutcomeObservationRightEClass, HearingScreeningOutcomeObservationRight.class, "HearingScreeningOutcomeObservationRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightMethodCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightMethodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightTargetSiteCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightTargetSiteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningOutcomeObservationRightEClass, ecorePackage.getEBoolean(), "validateHearingScreeningOutcomeObservationRightAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningResultsOrganizerEClass, HearingScreeningResultsOrganizer.class, "HearingScreeningResultsOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingScreeningResultsOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultsOrganizerEClass, ecorePackage.getEBoolean(), "validateHearingScreeningResultsOrganizerComponentResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingScreeningResultObservationEClass, HearingScreeningResultObservation.class, "HearingScreeningResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationMethodCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationTargetSiteCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateHearingScreeningResultObservationAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingScreeningResultObservationEClass, ecorePackage.getEBoolean(), "validateHearingScreeningResultObservationPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(riskIndicatorForHearingLossObservationEClass, RiskIndicatorForHearingLossObservation.class, "RiskIndicatorForHearingLossObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(riskIndicatorForHearingLossObservationEClass, ecorePackage.getEBoolean(), "validateRiskIndicatorForHearingLossObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(problemConcernEClass, ProblemConcern.class, "ProblemConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(problemConcernEClass, ecorePackage.getEBoolean(), "validateProblemConcernText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareProblemConcernEClass, HearingPlanOfCareProblemConcern.class, "HearingPlanOfCareProblemConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareProblemConcernEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemConcernText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareProblemsSubSectionEClass, HearingPlanOfCareProblemsSubSection.class, "HearingPlanOfCareProblemsSubSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareProblemsSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemsSubSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareProblemsSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemsSubSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareProblemsSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemsSubSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareProblemsSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemsSubSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareProblemsSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemsSubSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareProblemsSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(procedureActivityProcedureEClass, ProcedureActivityProcedure.class, "ProcedureActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(procedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityProcedureText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(procedureActivityActEClass, ProcedureActivityAct.class, "ProcedureActivityAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityActText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityActEntryRelationshipEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityActEntryRelationshipInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityActEntryRelationshipIndication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityActEntryRelationshipMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateHPOCProcedureActivityActEntryRelationshipProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareRelevantProceduresSubSectionEClass, HearingPlanOfCareRelevantProceduresSubSection.class, "HearingPlanOfCareRelevantProceduresSubSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareRelevantProceduresSubSectionEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareProcedureActivityProcedureEClass, HearingPlanOfCareProcedureActivityProcedure.class, "HearingPlanOfCareProcedureActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareProcedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProcedureActivityProcedureId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hearingPlanOfCareProcedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProcedureActivityProcedureText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hearingPlanOfCareProcedureActivityActEClass, HearingPlanOfCareProcedureActivityAct.class, "HearingPlanOfCareProcedureActivityAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hearingPlanOfCareProcedureActivityActEClass, ecorePackage.getEBoolean(), "validateHearingPlanOfCareProcedureActivityActText", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOf
        createHpocHearingPlanOfCareHeaderComponentOfAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounter
        createHpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocation
        createHpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacility
        createHpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacilityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOf
        createHpocHearingPlanOfCareHeaderDocumentationOfAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEvent
        createHpocHearingPlanOfCareHeaderDocumentationOfServiceEventAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformer
        createHpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntity
        createHpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTarget
        createHpocHearingPlanOfCareHeaderRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRole
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatient
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardian
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPerson
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplace
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplaceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlace
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlaceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunication
        createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthor
        createHpocHearingPlanOfCareHeaderAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthor
        createHpocHearingPlanOfCareHeaderAuthorAssignedAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorPerson
        createHpocHearingPlanOfCareHeaderAuthorAssignedAuthorPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDevice
        createHpocHearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDeviceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodian
        createHpocHearingPlanOfCareHeaderCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodian
        createHpocHearingPlanOfCareHeaderCustodianAssignedCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganization
        createHpocHearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryAct
        createHpocHearingPlanOfCareSectionEntryActAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryEncounter
        createHpocHearingPlanOfCareSectionEntryEncounterAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryObservation
        createHpocHearingPlanOfCareSectionEntryObservationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryProcedure
        createHpocHearingPlanOfCareSectionEntryProcedureAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntrySubstanceAdministration
        createHpocHearingPlanOfCareSectionEntrySubstanceAdministrationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntrySupply
        createHpocHearingPlanOfCareSectionEntrySupplyAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryInstructions
        createHpocHearingPlanOfCareSectionEntryInstructionsAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningSectionEntry
        createHpocHearingScreeningSectionEntryAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationConsumable
        createHpocHearingPlanOfCareActivitySubstanceAdministrationConsumableAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationParticipant2
        createHpocHearingPlanOfCareActivitySubstanceAdministrationParticipant2Annotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication
        createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndicationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions
        createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructionsAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply
        createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupplyAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense
        createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispenseAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction
        createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReactionAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationPrecondition
        createHpocHearingPlanOfCareActivitySubstanceAdministrationPreconditionAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivityNonMedicinalSupplyParticipant
        createHpocHearingPlanOfCareActivityNonMedicinalSupplyParticipantAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentLeftEar
        createHpocHearingScreeningOrganizerComponentLeftEarAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentRightEar
        createHpocHearingScreeningOrganizerComponentRightEarAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentResultsOrganizer
        createHpocHearingScreeningOrganizerComponentResultsOrganizerAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationLeftEntryRelationship
        createHpocHearingScreeningOutcomeObservationLeftEntryRelationshipAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationRightEntryRelationship
        createHpocHearingScreeningOutcomeObservationRightEntryRelationshipAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultsOrganizerComponentResultObservation
        createHpocHearingScreeningResultsOrganizerComponentResultObservationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipReasonNotScreened
        createHpocHearingScreeningResultObservationEntryRelationshipReasonNotScreenedAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipRefer
        createHpocHearingScreeningResultObservationEntryRelationshipReferAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern
        createHpocHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcernAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounter
        createHpocProcedureActivityActEntryRelationshipEncounterAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounterEncounter
        createHpocProcedureActivityActEntryRelationshipEncounterEncounterAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipInstructions
        createHpocProcedureActivityActEntryRelationshipInstructionsAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipIndication
        createHpocProcedureActivityActEntryRelationshipIndicationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipMedication
        createHpocProcedureActivityActEntryRelationshipMedicationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipProcedure
        createHpocProcedureActivityActEntryRelationshipProcedureAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure
        createHpocHearingPlanOfCareRelevantProceduresSubSectionEntryProcedureAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareRelevantProceduresSubSectionEntryAct
        createHpocHearingPlanOfCareRelevantProceduresSubSectionEntryActAnnotations();
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
             "initializers", "org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc"
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
          (hearingPlanOfCareDocumentEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderTemplateId HearingPlanOfCareDocumentTypeIdRoot HearingPlanOfCareDocumentTypeIdExtension HearingPlanOfCareDocumentSetIdAndVersionNumber HearingPlanOfCareDocumentRealmCode HearingPlanOfCareDocumentRealmCodeP HearingPlanOfCareDocumentTypeId HearingPlanOfCareDocumentId HearingPlanOfCareDocumentCode HearingPlanOfCareDocumentTitle HearingPlanOfCareDocumentEffectiveTime HearingPlanOfCareDocumentConfidentialityCode HearingPlanOfCareDocumentLanguageCode HearingPlanOfCareDocumentHearingPlanOfCareSection HearingPlanOfCareDocumentHearingScreeningSection",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.1",
             "realmCode.code", "US",
             "code.code", "34817-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Hearing Screening Evaluation and Management Note",
             "title.mixed", "Hearing Screening Evaluation and Management Note",
             "confidentialityCode.codeSystem", "2.16.840.1.113883.5.25",
             "confidentialityCode.codeSystemName", "ConfidentialityCode",
             "constraints.validation.info", "HearingPlanOfCareDocumentSetId HearingPlanOfCareDocumentVersionNumber HearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection",
             "constraints.validation.warning", "HearingPlanOfCareDocumentProblemsSection HearingPlanOfCareDocumentProcedureSection"
           });                                                                    
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderTemplateId HearingPlanOfCareHeaderRecordTarget HearingPlanOfCareHeaderCustodian HearingPlanOfCareHeaderAuthor",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.2.1",
             "constraints.validation.info", "HearingPlanOfCareHeaderComponentOf HearingPlanOfCareHeaderDocumentationOf"
           });                                              
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionTemplateId HearingPlanOfCareSectionCode HearingPlanOfCareSectionCodeP HearingPlanOfCareSectionTitle HearingPlanOfCareSectionText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.1",
             "code.code", "18776-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Plan of Care for Hearing",
             "constraints.validation.info", "HearingPlanOfCareSectionEntryAct HearingPlanOfCareSectionEntryEncounter HearingPlanOfCareSectionEntryObservation HearingPlanOfCareSectionEntryProcedure HearingPlanOfCareSectionEntrySubstanceAdministration HearingPlanOfCareSectionEntrySupply HearingPlanOfCareSectionEntryInstructions"
           });                                                
        addAnnotation
          (hearingScreeningSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ResultsSectionEntriesOptionalTemplateId HearingScreeningSectionCode HearingScreeningSectionCodeP HearingScreeningSectionText HearingScreeningSectionTitle HearingScreeningSectionEntry",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.2",
             "code.code", "30954-2-HPOC",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Relevant diagnostic tests and/or laboratory data for Hearing Screening",
             "constraints.validation.dependOn.HearingScreeningSectionCode", "HearingScreeningSectionCodeP"
           });                      
        addAnnotation
          (riskIndicatorsForHearingLossSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "RiskIndicatorsForHearingLossSectionTemplateId RiskIndicatorsForHearingLossSectionCode RiskIndicatorsForHearingLossSectionCodeP RiskIndicatorsForHearingLossSectionTitle RiskIndicatorsForHearingLossSectionText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.3",
             "code.code", "58232-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Hearing Loss Risk Indicators",
             "constraints.validation.warning", "RiskIndicatorsForHearingLossSectionEntry"
           });                       
        addAnnotation
          (problemsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProblemsSectionTemplateId ProblemsSectionCode ProblemsSectionCodeP ProblemsSectionTitle ProblemsSectionText ProblemsSectionEntryProblemConcern",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.4",
             "code.code", "11450-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Problem List",
             "constraints.validation.info", "ProblemsSectionComponentHpocProblems"
           });                          
        addAnnotation
          (procedureSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProcedureSectionTemplateId ProcedureSectionCode ProcedureSectionCodeP ProcedureSectionTitle ProcedureSectionText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.6",
             "code.code", "47519-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "constraints.validation.info", "ProcedureSectionEntryProcedureActivityProcedure ProcedureSectionEntryProcedureActivityAct"
           });                          
        addAnnotation
          (hearingPlanOfCareActivityActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PlanOfCareActivityActTemplateId HearingPlanOfCareActivityActEffectiveTimeLowHigh HearingPlanOfCareActivityActCode HearingPlanOfCareActivityActCodeP HearingPlanOfCareActivityActText HearingPlanOfCareActivityActStatusCode HearingPlanOfCareActivityActEffectiveTime",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.2",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.HearingPlanOfCareActivityActCode", "HearingPlanOfCareActivityActCodeP"
           });                        
        addAnnotation
          (hearingPlanOfCareActivityEncounterEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PlanOfCareActivityEncounterTemplateId HearingPlanOfCareActivityEncounterEffectiveTimeLowHigh HearingPlanOfCareActivityEncounterCode HearingPlanOfCareActivityEncounterCodeP HearingPlanOfCareActivityEncounterStatusCode HearingPlanOfCareActivityEncounterText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.3",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT"
           });                     
        addAnnotation
          (hearingPlanOfCareActivityObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PlanOfCareActivityObservationTemplateId HearingPlanOfCareActivityObservationEffectiveTimeLowHigh HearingPlanOfCareActivityObservationCode HearingPlanOfCareActivityObservationCodeP HearingPlanOfCareActivityObservationEffectiveTime HearingPlanOfCareActivityObservationStatusCode HearingPlanOfCareActivityObservationText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.4",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.HearingPlanOfCareActivityObservationCode", "HearingPlanOfCareActivityObservationCodeP"
           });                        
        addAnnotation
          (hearingPlanOfCareActivityProcedureEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PlanOfCareActivityProcedureTemplateId HearingPlanOfCareActivityProcedureEffectiveTimeLowHigh HearingPlanOfCareActivityProcedureCode HearingPlanOfCareActivityProcedureCodeP HearingPlanOfCareActivityProcedureEffectiveTime HearingPlanOfCareActivityProcedureStatusCode HearingPlanOfCareActivityProcedureText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.5",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT"
           });                        
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PlanOfCareActivitySubstanceAdministrationTemplateId HearingPlanOfCareActivitySubstanceAdministrationCode HearingPlanOfCareActivitySubstanceAdministrationText HearingPlanOfCareActivitySubstanceAdministrationStatusCode HearingPlanOfCareActivitySubstanceAdministrationRouteCode HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode HearingPlanOfCareActivitySubstanceAdministrationConsumable",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.6",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.info", "HearingPlanOfCareActivitySubstanceAdministrationRepeatNumber HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP HearingPlanOfCareActivitySubstanceAdministrationRateQuantity HearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity HearingPlanOfCareActivitySubstanceAdministrationPerformer HearingPlanOfCareActivitySubstanceAdministrationParticipant HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction HearingPlanOfCareActivitySubstanceAdministrationPrecondition",
             "routeCode.codeSystem", "2.16.840.1.113883.3.26.1.1",
             "routeCode.codeSystemName", "NCI Thesaurus",
             "constraints.validation.dependOn.HearingPlanOfCareActivitySubstanceAdministrationRouteCode", "HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP",
             "administrationUnitCode.codeSystem", "2.16.840.1.113883.3.26.1.1",
             "administrationUnitCode.codeSystemName", "NCI Thesaurus",
             "constraints.validation.dependOn.HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode", "HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP",
             "constraints.validation.warning", "HearingPlanOfCareActivitySubstanceAdministrationEffectiveTime HearingPlanOfCareActivitySubstanceAdministrationDoseQuantity",
             "approachSiteCode.codeSystem", "2.16.840.1.113883.6.96",
             "approachSiteCode.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode", "HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP"
           });                                                                                   
        addAnnotation
          (hearingPlanOfCareInstructionsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "InstructionsTemplateId InstructionsCode InstructionsCodeP InstructionsText HearingPlanOfCareInstructionsEffectiveTime InstructionsStatusCode InstructionsStatusCodeP",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.1",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.InstructionsCode", "InstructionsCodeP",
             "statusCode.code", "completed",
             "constraints.validation.dependOn.InstructionsStatusCode", "InstructionsStatusCodeP"
           });            
        addAnnotation
          (hearingPlanOfCareActivityNonMedicinalSupplyEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PlanOfCareActivitySupplyTemplateId HearingPlanOfCareActivityNonMedicinalSupplyCode HearingPlanOfCareActivityNonMedicinalSupplyCodeP HearingPlanOfCareActivityNonMedicinalSupplyText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.7",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.warning", "HearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime HearingPlanOfCareActivityNonMedicinalSupplyQuantity",
             "constraints.validation.info", "HearingPlanOfCareActivityNonMedicinalSupplyParticipant"
           });                         
        addAnnotation
          (hearingScreeningOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ResultOrganizerTemplateId ResultOrganizerClassCode ResultOrganizerCode ResultOrganizerCodeP HearingScreeningOrganizerComponentLeftEar HearingScreeningOrganizerComponentRightEar HearingScreeningOrganizerComponentResultsOrganizer",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.8",
             "classCode", "CLUSTER",
             "code.code", "54111-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Newborn Hearing Loss Panel",
             "constraints.validation.dependOn.ResultOrganizerCode", "ResultOrganizerCodeP"
           });                     
        addAnnotation
          (hearingScreeningOutcomeObservationLeftEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningOutcomeObservationLeftTemplateId HearingScreeningOutcomeObservationLeftClassCode HearingScreeningOutcomeObservationLeftMoodCode HearingScreeningOutcomeObservationLeftId HearingScreeningOutcomeObservationLeftCode HearingScreeningOutcomeObservationLeftCodeP HearingScreeningOutcomeObservationLeftText HearingScreeningOutcomeObservationLeftStatusCode HearingScreeningOutcomeObservationLeftEffectiveTime HearingScreeningOutcomeObservationLeftValue HearingScreeningOutcomeObservationLeftValueP HearingScreeningOutcomeObservationLeftMethodCode HearingScreeningOutcomeObservationLeftTargetSiteCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.9",
             "classCode", "OBS",
             "moodCode", "EVN",
             "constraints.validation.info", "HearingScreeningOutcomeObservationLeftNegationInd HearingScreeningOutcomeObservationLeftMethodCodeP HearingScreeningOutcomeObservationLeftTargetSiteCodeP HearingScreeningOutcomeObservationLeftEntryRelationship HearingScreeningOutcomeObservationLeftAuthor",
             "code.code", "73741-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Newborn Hearing screen panel of Ear - left",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationLeftCode", "HearingScreeningOutcomeObservationLeftCodeP",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "methodCode.codeSystem", "2.16.840.1.113883.6.1",
             "methodCode.codeSystemName", "LOINC",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationLeftMethodCode", "HearingScreeningOutcomeObservationLeftMethodCodeP",
             "targetSiteCode.codeSystem", "2.16.840.1.113883.6.96",
             "targetSiteCode.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationLeftTargetSiteCode", "HearingScreeningOutcomeObservationLeftTargetSiteCodeP"
           });                                                            
        addAnnotation
          (reasonNotScreenedEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ReasonNotScreenedTemplateId ReasonNotScreenedClassCode ReasonNotScreenedMoodCode ReasonNotScreenedCode ReasonNotScreenedCodeP ReasonNotScreenedText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.10",
             "classCode", "ACT",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.ReasonNotScreenedCode", "ReasonNotScreenedCodeP"
           });                       
        addAnnotation
          (hearingScreeningOutcomeObservationRightEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningOutcomeObservationRightTemplateId HearingScreeningOutcomeObservationRightClassCode HearingScreeningOutcomeObservationRightMoodCode HearingScreeningOutcomeObservationRightId HearingScreeningOutcomeObservationRightCode HearingScreeningOutcomeObservationRightCodeP HearingScreeningOutcomeObservationRightText HearingScreeningOutcomeObservationRightStatusCode HearingScreeningOutcomeObservationRightStatusCodeP HearingScreeningOutcomeObservationRightEffectiveTime HearingScreeningOutcomeObservationRightValue HearingScreeningOutcomeObservationRightMethodCode HearingScreeningOutcomeObservationRightTargetSiteCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.11",
             "classCode", "OBS",
             "moodCode", "EVN",
             "constraints.validation.info", "HearingScreeningOutcomeObservationRightNegationInd HearingScreeningOutcomeObservationRightMethodCodeP HearingScreeningOutcomeObservationRightTargetSiteCodeP HearingScreeningOutcomeObservationRightEntryRelationship HearingScreeningOutcomeObservationRightAuthor",
             "code.code", "73744-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Newborn Hearing screen panel of Ear - right",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationRightCode", "HearingScreeningOutcomeObservationRightCodeP",
             "methodCode.codeSystem", "2.16.840.1.113883.6.1",
             "methodCode.codeSystemName", "LOINC",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationRightMethodCode", "HearingScreeningOutcomeObservationRightMethodCodeP",
             "targetSiteCode.codeSystem", "2.16.840.1.113883.6.96",
             "targetSiteCode.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationRightTargetSiteCode", "HearingScreeningOutcomeObservationRightTargetSiteCodeP"
           });                                                            
        addAnnotation
          (hearingScreeningResultsOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ResultOrganizerTemplateId ResultOrganizerClassCode ResultOrganizerCode ResultOrganizerCodeP ResultOrganizerStatusCode ResultOrganizerStatusCodeP HearingScreeningResultsOrganizerComponentResultObservation",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.12",
             "classCode", "CLUSTER",
             "code.code", "417491009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Neonatal Hearing Test (Procedure)",
             "constraints.validation.dependOn.ResultOrganizerCode", "ResultOrganizerCodeP",
             "constraints.validation.dependOn.ResultOrganizerStatusCode", "ResultOrganizerStatusCodeP"
           });             
        addAnnotation
          (hearingScreeningResultObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ResultObservationTemplateId ResultObservationCode ResultObservationCodeP ResultObservationText ResultObservationEffectiveTime ResultObservationValue ResultObservationValueP ResultObservationMethodCode ResultObservationMethodCodeP ResultObservationTargetSiteCode ResultObservationTargetSiteCodeP HearingScreeningResultObservationEntryRelationshipReasonNotScreened",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.13",
             "code.code", "417491009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Neonatal Hearing Test (Procedure)",
             "constraints.validation.dependOn.ResultObservationCode", "ResultObservationCodeP",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "methodCode.codeSystem", "2.16.840.1.113883.6.1",
             "methodCode.codeSystemName", "LOINC",
             "constraints.validation.dependOn.ResultObservationMethodCode", "ResultObservationMethodCodeP",
             "targetSiteCode.codeSystem", "2.16.840.1.113883.6.96",
             "targetSiteCode.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.ResultObservationTargetSiteCode", "ResultObservationTargetSiteCodeP",
             "constraints.validation.info", "HearingScreeningResultObservationAuthor",
             "constraints.validation.warning", "HearingScreeningResultObservationPerformer"
           });                             
        addAnnotation
          (riskIndicatorForHearingLossObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "RiskIndicatorForHearingLossObservationTemplateId RiskIndicatorForHearingLossObservationClassCode RiskIndicatorForHearingLossObservationMoodCode RiskIndicatorForHearingLossObservationCode RiskIndicatorForHearingLossObservationText RiskIndicatorForHearingLossObservationStatusCode RiskIndicatorForHearingLossObservationStatusCodeP RiskIndicatorForHearingLossObservationValue RiskIndicatorForHearingLossObservationId",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.1.4.15",
             "classCode", "OBS",
             "moodCode", "EVN",
             "statusCode.code", "completed",
             "constraints.validation.warning", "RiskIndicatorForHearingLossObservationEffectiveTime"
           });                                   
        addAnnotation
          (problemConcernEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProblemConcernActTemplateId ProblemConcernText ProblemConcernActEffectiveTime",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.16"
           });         
        addAnnotation
          (hearingPlanOfCareProblemConcernEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProblemConcernActTemplateId ProblemConcernActId HearingPlanOfCareProblemConcernText ProblemConcernActEffectiveTime",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.17"
           });         
        addAnnotation
          (hearingPlanOfCareProblemsSubSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareProblemsSubSectionTemplateId HearingPlanOfCareProblemsSubSectionCode HearingPlanOfCareProblemsSubSectionCodeP HearingPlanOfCareProblemsSubSectionText HearingPlanOfCareProblemsSubSectionTitle HearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.5",
             "code.code", "11450-4-HPOC",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "HPOC Problem List"
           });                        
        addAnnotation
          (procedureActivityProcedureEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProcedureActivityProcedureTemplateId HPOCProcedureActivityProcedureText ProcedureActivityProcedureId ProcedureActivityProcedureCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.18"
           });         
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProcedureActivityActTemplateId HPOCProcedureActivityActText ProcedureActivityActCode",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.19",
             "constraints.validation.info", "HPOCProcedureActivityActEntryRelationshipEncounter HPOCProcedureActivityActEntryRelationshipInstructions HPOCProcedureActivityActEntryRelationshipIndication HPOCProcedureActivityActEntryRelationshipMedication HPOCProcedureActivityActEntryRelationshipProcedure"
           });                              
        addAnnotation
          (hearingPlanOfCareRelevantProceduresSubSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareRelevantProceduresSubSectionTemplateId HearingPlanOfCareRelevantProceduresSubSectionCode HearingPlanOfCareRelevantProceduresSubSectionCodeP HearingPlanOfCareRelevantProceduresSubSectionText HearingPlanOfCareRelevantProceduresSubSectionTitle",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.7",
             "code.code", "47519-4-HPOC",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "HPOC History of Procedures",
             "constraints.validation.dependOn.HearingPlanOfCareRelevantProceduresSubSectionCode", "HearingPlanOfCareRelevantProceduresSubSectionCodeP",
             "constraints.validation.info", "HearingPlanOfCareRelevantProceduresSubSectionEntryProcedure HearingPlanOfCareRelevantProceduresSubSectionEntryAct"
           });                            
        addAnnotation
          (hearingPlanOfCareProcedureActivityProcedureEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProcedureActivityProcedureTemplateId HearingPlanOfCareProcedureActivityProcedureId ProcedureActivityProcedureCode HearingPlanOfCareProcedureActivityProcedureText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.20"
           });            
        addAnnotation
          (hearingPlanOfCareProcedureActivityActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ProcedureActivityActTemplateId ProcedureActivityActId ProcedureActivityActCode HearingPlanOfCareProcedureActivityActText",
             "templateId.root", "1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.21"
           });    
    }

				/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounter</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounter";                                                                        
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.error", "HearingPlanOfCareHeaderComponentOfEncompassingEncounterCode HearingPlanOfCareHeaderComponentOfEncompassingEncounterId HearingPlanOfCareHeaderComponentOfEncompassingEncounterEffectiveTime HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocation";                                                                         
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacility"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacility</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacilityAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacility";                                                                          
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacilityLocation HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacilityServiceProviderOrganization"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOf</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderDocumentationOfAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOf";                                                                           
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderDocumentationOfServiceEvent"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEvent</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderDocumentationOfServiceEventAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEvent";                                                                            
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.error", "HearingPlanOfCareHeaderDocumentationOfServiceEventCode HearingPlanOfCareHeaderDocumentationOfServiceEventCodeP HearingPlanOfCareHeaderDocumentationOfServiceEventEffectiveTime",
             "constraints.validation.warning", "HearingPlanOfCareHeaderDocumentationOfServiceEventPerformer"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformer</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformer";                                                                             
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCode HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCodeP HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerFunctionCode HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerFunctionCodeP HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntity",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCode", "HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCodeP",
             "functionCode.codeSystem", "2.16.840.1.113883.5.88",
             "functionCode.codeSystemName", "ParticipationFunction"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntity</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntity";                                                                              
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityId HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCode",
             "code.codeSystem", "2.16.840.1.113883.6.101",
             "code.codeSystemName", "NUCC Health Care Provider Taxonomy",
             "constraints.validation.warning", "HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCodeP",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCode", "HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTarget</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTarget";                                                                               
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRoleAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRole";                                                                                
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRoleAddr HearingPlanOfCareHeaderRecordTargetPatientRoleId HearingPlanOfCareHeaderRecordTargetPatientRoleTelecom HearingPlanOfCareHeaderRecordTargetPatientRolePatient"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatient</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatient";                                                                                 
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientName HearingPlanOfCareHeaderRecordTargetPatientRolePatientAdministrativeGenderCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthTime HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCode",
             "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
             "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode",
             "maritalStatusCode.codeSystem", "2.16.840.1.113883.5.2",
             "maritalStatusCode.codeSystemName", "MaritalStatus",
             "constraints.validation.warning", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardian HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunication",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCode", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCodeP",
             "religiousAffiliationCode.codeSystem", "2.16.840.1.113883.5.1076",
             "religiousAffiliationCode.codeSystemName", "ReligiousAffiliation",
             "constraints.validation.info", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplace",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCode", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCodeP",
             "raceCode.codeSystem", "2.16.840.1.113883.6.238",
             "raceCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCode", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCodeP",
             "ethnicGroupCode.codeSystem", "2.16.840.1.113883.6.238",
             "ethnicGroupCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCode", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardian</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardian";                                                                                  
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.warning", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianAddr HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianTelecom"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPerson</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPersonAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPerson";                                                                                   
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPersonName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplace</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplaceAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplace";                                                                                    
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlace"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlace</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlaceAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlace";                                                                                     
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlaceAddr"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunication</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunication";                                                                                      
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationLanguageCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode",
             "modeCode.codeSystem", "2.16.840.1.113883.5.60",
             "modeCode.codeSystemName", "LanguageAbilityMode",
             "constraints.validation.info", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCode", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCodeP",
             "proficiencyLevelCode.codeSystem", "2.16.840.1.113883.5.61",
             "proficiencyLevelCode.codeSystemName", "LanguageAbilityProficiency",
             "constraints.validation.warning", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode", "HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthor</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderAuthorAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthor";                                                                                       
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderAuthorTime HearingPlanOfCareHeaderAuthorAssignedAuthor"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthor</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderAuthorAssignedAuthorAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthor";                                                                                        
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderAuthorAssignedAuthorAddr HearingPlanOfCareHeaderAuthorAssignedAuthorCode HearingPlanOfCareHeaderAuthorAssignedAuthorId HearingPlanOfCareHeaderAuthorAssignedAuthorTelecom",
             "code.codeSystem", "2.16.840.1.113883.5.53",
             "code.codeSystemName", "Healthcare Provider Taxonomy (HIPAA)",
             "constraints.validation.warning", "HearingPlanOfCareHeaderAuthorAssignedAuthorCodeP HearingPlanOfCareHeaderAuthorAssignedAuthorAssignedAuthoringDevice HearingPlanOfCareHeaderAuthorAssignedAuthorAssignedPerson",
             "constraints.validation.dependOn.HearingPlanOfCareHeaderAuthorAssignedAuthorCode", "HearingPlanOfCareHeaderAuthorAssignedAuthorCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorPerson</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderAuthorAssignedAuthorPersonAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorPerson";                                                                                         
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderAuthorAssignedAuthorPersonName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDevice</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDeviceAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDevice";                                                                                          
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName HearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodian</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderCustodianAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodian";                                                                                           
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderCustodianAssignedCustodian"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodian</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderCustodianAssignedCustodianAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodian";                                                                                            
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderCustodianAssignedCustodianRepresentedCustodianOrganization"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganization</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganization";                                                                                             
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationAddr HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationId HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationName HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationTelecom"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryAct</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntryActAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryAct";                                                                                                                 
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntryActAct"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryEncounter</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntryEncounterAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryEncounter";                                                                                                                  
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntryEncounterEncounter"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryObservation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntryObservationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryObservation";                                                                                                                   
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntryObservationObservation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryProcedure</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntryProcedureAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryProcedure";                                                                                                                    
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntryProcedureProcedure"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntrySubstanceAdministration</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntrySubstanceAdministrationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntrySubstanceAdministration";                                                                                                                     
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntrySubstanceAdministrationSubstanceAdministration"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntrySupply</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntrySupplyAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntrySupply";                                                                                                                      
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntrySupplySupply"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryInstructions</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareSectionEntryInstructionsAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareSectionEntryInstructions";                                                                                                                       
        addAnnotation
          (hearingPlanOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareSectionEntryInstructionsAct"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningSectionEntry</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningSectionEntryAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningSectionEntry";                                                                                                                                                             
        addAnnotation
          (hearingScreeningSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningSectionEntryOrganizer"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationConsumable</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationConsumableAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationConsumable";                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationConsumableManufacturedProduct"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationParticipant2</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationParticipant2Annotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationParticipant2";                                                                                                                                                                                                                                                                                                                            
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "CSM",
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationParticipant2TypeCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndicationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication";                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RSON",
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndicationTypeCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructionsAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions";                                                                                                                                                                                                                                                                                                                              
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "inversionInd", "true",
             "typeCode", "SUBJ",
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructionsTypeCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupplyAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply";                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "REFR",
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupplyTypeCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispenseAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense";                                                                                                                                                                                                                                                                                                                                
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "REFR",
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispenseTypeCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReactionAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction";                                                                                                                                                                                                                                                                                                                                 
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "CAUS",
             "constraints.validation.error", "HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReactionTypeCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationPrecondition</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivitySubstanceAdministrationPreconditionAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationPrecondition";                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "PRCN"
           });                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivityNonMedicinalSupplyParticipant</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareActivityNonMedicinalSupplyParticipantAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivityNonMedicinalSupplyParticipant";                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (hearingPlanOfCareActivityNonMedicinalSupplyEClass, 
           source, 
           new String[] 
           {
             "typeCode", "PRD",
             "constraints.validation.error", "HearingPlanOfCareActivityNonMedicinalSupplyParticipantTypeCode HearingPlanOfCareActivityNonMedicinalSupplyParticipantParticipantRole"
           });                                                                                                                                                                                                                                                                                                                                          
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentLeftEar</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningOrganizerComponentLeftEarAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentLeftEar";                                                                                                                                                                                                                                                                                                                                                                                                                                       
        addAnnotation
          (hearingScreeningOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningOrganizerComponentLeftEarObservation"
           });                                                                                                                                                                                                                                                                                                                     
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentRightEar</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningOrganizerComponentRightEarAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentRightEar";                                                                                                                                                                                                                                                                                                                                                                                                                                        
        addAnnotation
          (hearingScreeningOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningOrganizerComponentRightEarObservation"
           });                                                                                                                                                                                                                                                                                                                    
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentResultsOrganizer</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningOrganizerComponentResultsOrganizerAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOrganizerComponentResultsOrganizer";                                                                                                                                                                                                                                                                                                                                                                                                                                         
        addAnnotation
          (hearingScreeningOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningOrganizerComponentResultsOrganizerOrganizer"
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
          (hearingPlanOfCareDocumentEClass, 
           source, 
           new String[] 
           {
           });                                                                                                                                                           
        addAnnotation
          (hearingScreeningSectionEClass, 
           source, 
           new String[] 
           {
           });                                                                                    
        addAnnotation
          (hearingPlanOfCareActivityActEClass, 
           source, 
           new String[] 
           {
           });                        
        addAnnotation
          (hearingPlanOfCareActivityEncounterEClass, 
           source, 
           new String[] 
           {
           });                     
        addAnnotation
          (hearingPlanOfCareActivityObservationEClass, 
           source, 
           new String[] 
           {
           });                        
        addAnnotation
          (hearingPlanOfCareActivityProcedureEClass, 
           source, 
           new String[] 
           {
           });                                
        addAnnotation
          (hearingPlanOfCareActivitySubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
           });                                                                           
        addAnnotation
          (hearingPlanOfCareInstructionsEClass, 
           source, 
           new String[] 
           {
           });             
        addAnnotation
          (hearingPlanOfCareActivityNonMedicinalSupplyEClass, 
           source, 
           new String[] 
           {
           });                           
        addAnnotation
          (hearingScreeningOrganizerEClass, 
           source, 
           new String[] 
           {
           });                                                                                                                                                      
        addAnnotation
          (hearingScreeningResultsOrganizerEClass, 
           source, 
           new String[] 
           {
           });              
        addAnnotation
          (hearingScreeningResultObservationEClass, 
           source, 
           new String[] 
           {
           });                                                          
        addAnnotation
          (problemConcernEClass, 
           source, 
           new String[] 
           {
           });         
        addAnnotation
          (hearingPlanOfCareProblemConcernEClass, 
           source, 
           new String[] 
           {
           });                             
        addAnnotation
          (procedureActivityProcedureEClass, 
           source, 
           new String[] 
           {
           });               
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
           });                                                
        addAnnotation
          (hearingPlanOfCareProcedureActivityProcedureEClass, 
           source, 
           new String[] 
           {
           });            
        addAnnotation
          (hearingPlanOfCareProcedureActivityActEClass, 
           source, 
           new String[] 
           {
           });   
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOf</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareHeaderComponentOfAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOf";                                                                       
        addAnnotation
          (hearingPlanOfCareHeaderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareHeaderComponentOfEncompassingEncounter"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationLeftEntryRelationship</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningOutcomeObservationLeftEntryRelationshipAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationLeftEntryRelationship";                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        addAnnotation
          (hearingScreeningOutcomeObservationLeftEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RSON",
             "constraints.validation.error", "HearingScreeningOutcomeObservationLeftEntryRelationshipTypeCode HearingScreeningOutcomeObservationLeftEntryRelationshipAct"
           });                                                                                                                                                                                                                                                                                                    
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationRightEntryRelationship</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningOutcomeObservationRightEntryRelationshipAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationRightEntryRelationship";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (hearingScreeningOutcomeObservationRightEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RSON",
             "constraints.validation.error", "HearingScreeningOutcomeObservationRightEntryRelationshipTypeCode HearingScreeningOutcomeObservationRightEntryRelationshipTypeCodeP HearingScreeningOutcomeObservationRightEntryRelationshipAct",
             "constraints.validation.dependOn.HearingScreeningOutcomeObservationRightEntryRelationshipTypeCode", "HearingScreeningOutcomeObservationRightEntryRelationshipTypeCodeP"
           });                                                                                                                                                                                                                         
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultsOrganizerComponentResultObservation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningResultsOrganizerComponentResultObservationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultsOrganizerComponentResultObservation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (hearingScreeningResultsOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingScreeningResultsOrganizerComponentResultObservationObservation"
           });                                                                                                                                                                 
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipReasonNotScreened</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningResultObservationEntryRelationshipReasonNotScreenedAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipReasonNotScreened";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (hearingScreeningResultObservationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RSON",
             "constraints.validation.error", "HearingScreeningResultObservationEntryRelationshipReasonNotScreenedTypeCode HearingScreeningResultObservationEntryRelationshipReasonNotScreenedAct"
           });                                                                                                                                                        
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipRefer</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingScreeningResultObservationEntryRelationshipReferAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipRefer";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        addAnnotation
          (hearingScreeningResultObservationEClass, 
           source, 
           new String[] 
           {
             "typeCode", "REFR",
             "constraints.validation.error", "HearingScreeningResultObservationEntryRelationshipReferTypeCode HearingScreeningResultObservationEntryRelationshipReferAct"
           });                                                                                                                                                       
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcernAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        addAnnotation
          (hearingPlanOfCareProblemsSubSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareProblemsSubSectionEntryHpocProblemConcernAct"
           });                                                                                      
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounter</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocProcedureActivityActEntryRelationshipEncounterAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounter";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "ProcedureActivityActEntryRelationshipTypeCode ProcedureActivityActEntryRelationshipInversionInd",
             "inversionInd", "true"
           });                                                             
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounterEncounter</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocProcedureActivityActEntryRelationshipEncounterEncounterAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounterEncounter";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "classCode", "ENC",
             "constraints.validation.error", "ProcedureActivityActEntryRelationshipEncounterEncounterClassCode ProcedureActivityActEntryRelationshipEncounterEncounterClassCodeP ProcedureActivityActEntryRelationshipEncounterEncounterMoodCode ProcedureActivityActEntryRelationshipEncounterEncounterMoodCodeP ProcedureActivityActEntryRelationshipEncounterEncounterId",
             "constraints.validation.dependOn.ProcedureActivityActEntryRelationshipEncounterEncounterClassCode", "ProcedureActivityActEntryRelationshipEncounterEncounterClassCodeP",
             "moodCode", "EVN",
             "constraints.validation.dependOn.ProcedureActivityActEntryRelationshipEncounterEncounterMoodCode", "ProcedureActivityActEntryRelationshipEncounterEncounterMoodCodeP"
           });                                                            
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipInstructions</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocProcedureActivityActEntryRelationshipInstructionsAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipInstructions";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "typeCode", "SUBJ",
             "constraints.validation.error", "ProcedureActivityActEntryRelationshipTypeCode ProcedureActivityActEntryRelationshipInversionInd",
             "inversionInd", "true"
           });                                                           
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipIndication</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocProcedureActivityActEntryRelationshipIndicationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipIndication";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RSON",
             "constraints.validation.error", "ProcedureActivityActEntryRelationshipTypeCode"
           });                                                          
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipMedication</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocProcedureActivityActEntryRelationshipMedicationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipMedication";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "ProcedureActivityActEntryRelationshipTypeCode"
           });                                                         
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipProcedure</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocProcedureActivityActEntryRelationshipProcedureAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipProcedure";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (procedureActivityActEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "ProcedureActivityActEntryRelationshipTypeCode"
           });                                                        
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareRelevantProceduresSubSectionEntryProcedureAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        addAnnotation
          (hearingPlanOfCareRelevantProceduresSubSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareRelevantProceduresSubSectionEntryProcedureProcedure"
           });                                   
    }

        /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareRelevantProceduresSubSectionEntryAct</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createHpocHearingPlanOfCareRelevantProceduresSubSectionEntryActAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareRelevantProceduresSubSectionEntryAct";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        addAnnotation
          (hearingPlanOfCareRelevantProceduresSubSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "HearingPlanOfCareRelevantProceduresSubSectionEntryActAct"
           });                                  
    }

} //HPOCPackageImpl
