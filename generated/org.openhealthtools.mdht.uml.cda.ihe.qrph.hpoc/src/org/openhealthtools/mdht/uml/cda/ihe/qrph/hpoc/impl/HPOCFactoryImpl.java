/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HPOCFactoryImpl extends EFactoryImpl implements HPOCFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HPOCFactory init()
  {
    try
    {
      HPOCFactory theHPOCFactory = (HPOCFactory)EPackage.Registry.INSTANCE.getEFactory(HPOCPackage.eNS_URI);
      if (theHPOCFactory != null)
      {
        return theHPOCFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HPOCFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HPOCFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HPOCPackage.HEARING_PLAN_OF_CARE_DOCUMENT: return createHearingPlanOfCareDocument();
      case HPOCPackage.HEARING_PLAN_OF_CARE_HEADER: return createHearingPlanOfCareHeader();
      case HPOCPackage.HEARING_PLAN_OF_CARE_SECTION: return createHearingPlanOfCareSection();
      case HPOCPackage.HEARING_SCREENING_SECTION: return createHearingScreeningSection();
      case HPOCPackage.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION: return createRiskIndicatorsForHearingLossSection();
      case HPOCPackage.PROBLEMS_SECTION: return createProblemsSection();
      case HPOCPackage.PROCEDURE_SECTION: return createProcedureSection();
      case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_ACT: return createHearingPlanOfCareActivityAct();
      case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER: return createHearingPlanOfCareActivityEncounter();
      case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION: return createHearingPlanOfCareActivityObservation();
      case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE: return createHearingPlanOfCareActivityProcedure();
      case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: return createHearingPlanOfCareActivitySubstanceAdministration();
      case HPOCPackage.HEARING_PLAN_OF_CARE_INSTRUCTIONS: return createHearingPlanOfCareInstructions();
      case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY: return createHearingPlanOfCareActivityNonMedicinalSupply();
      case HPOCPackage.HEARING_SCREENING_ORGANIZER: return createHearingScreeningOrganizer();
      case HPOCPackage.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT: return createHearingScreeningOutcomeObservationLeft();
      case HPOCPackage.REASON_NOT_SCREENED: return createReasonNotScreened();
      case HPOCPackage.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT: return createHearingScreeningOutcomeObservationRight();
      case HPOCPackage.HEARING_SCREENING_RESULTS_ORGANIZER: return createHearingScreeningResultsOrganizer();
      case HPOCPackage.HEARING_SCREENING_RESULT_OBSERVATION: return createHearingScreeningResultObservation();
      case HPOCPackage.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION: return createRiskIndicatorForHearingLossObservation();
      case HPOCPackage.PROBLEM_CONCERN: return createProblemConcern();
      case HPOCPackage.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN: return createHearingPlanOfCareProblemConcern();
      case HPOCPackage.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION: return createHearingPlanOfCareProblemsSubSection();
      case HPOCPackage.PROCEDURE_ACTIVITY_PROCEDURE: return createProcedureActivityProcedure();
      case HPOCPackage.PROCEDURE_ACTIVITY_ACT: return createProcedureActivityAct();
      case HPOCPackage.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION: return createHearingPlanOfCareRelevantProceduresSubSection();
      case HPOCPackage.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE: return createHearingPlanOfCareProcedureActivityProcedure();
      case HPOCPackage.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT: return createHearingPlanOfCareProcedureActivityAct();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareDocument createHearingPlanOfCareDocument()
  {
    HearingPlanOfCareDocumentImpl hearingPlanOfCareDocument = new HearingPlanOfCareDocumentImpl();
    return hearingPlanOfCareDocument;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HearingPlanOfCareHeader createHearingPlanOfCareHeader() {
    HearingPlanOfCareHeaderImpl hearingPlanOfCareHeader = new HearingPlanOfCareHeaderImpl();
    return hearingPlanOfCareHeader;
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskIndicatorsForHearingLossSection createRiskIndicatorsForHearingLossSection()
  {
    RiskIndicatorsForHearingLossSectionImpl riskIndicatorsForHearingLossSection = new RiskIndicatorsForHearingLossSectionImpl();
    return riskIndicatorsForHearingLossSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProblemsSection createProblemsSection()
  {
    ProblemsSectionImpl problemsSection = new ProblemsSectionImpl();
    return problemsSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProblemConcern createProblemConcern()
  {
    ProblemConcernImpl problemConcern = new ProblemConcernImpl();
    return problemConcern;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareProblemConcern createHearingPlanOfCareProblemConcern()
  {
    HearingPlanOfCareProblemConcernImpl hearingPlanOfCareProblemConcern = new HearingPlanOfCareProblemConcernImpl();
    return hearingPlanOfCareProblemConcern;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareProblemsSubSection createHearingPlanOfCareProblemsSubSection()
  {
    HearingPlanOfCareProblemsSubSectionImpl hearingPlanOfCareProblemsSubSection = new HearingPlanOfCareProblemsSubSectionImpl();
    return hearingPlanOfCareProblemsSubSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureActivityProcedure createProcedureActivityProcedure()
  {
    ProcedureActivityProcedureImpl procedureActivityProcedure = new ProcedureActivityProcedureImpl();
    return procedureActivityProcedure;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureActivityAct createProcedureActivityAct()
  {
    ProcedureActivityActImpl procedureActivityAct = new ProcedureActivityActImpl();
    return procedureActivityAct;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareRelevantProceduresSubSection createHearingPlanOfCareRelevantProceduresSubSection()
  {
    HearingPlanOfCareRelevantProceduresSubSectionImpl hearingPlanOfCareRelevantProceduresSubSection = new HearingPlanOfCareRelevantProceduresSubSectionImpl();
    return hearingPlanOfCareRelevantProceduresSubSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareProcedureActivityProcedure createHearingPlanOfCareProcedureActivityProcedure()
  {
    HearingPlanOfCareProcedureActivityProcedureImpl hearingPlanOfCareProcedureActivityProcedure = new HearingPlanOfCareProcedureActivityProcedureImpl();
    return hearingPlanOfCareProcedureActivityProcedure;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareProcedureActivityAct createHearingPlanOfCareProcedureActivityAct()
  {
    HearingPlanOfCareProcedureActivityActImpl hearingPlanOfCareProcedureActivityAct = new HearingPlanOfCareProcedureActivityActImpl();
    return hearingPlanOfCareProcedureActivityAct;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureSection createProcedureSection()
  {
    ProcedureSectionImpl procedureSection = new ProcedureSectionImpl();
    return procedureSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareSection createHearingPlanOfCareSection()
  {
    HearingPlanOfCareSectionImpl hearingPlanOfCareSection = new HearingPlanOfCareSectionImpl();
    return hearingPlanOfCareSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivityAct createHearingPlanOfCareActivityAct()
  {
    HearingPlanOfCareActivityActImpl hearingPlanOfCareActivityAct = new HearingPlanOfCareActivityActImpl();
    return hearingPlanOfCareActivityAct;
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HearingPlanOfCareActivityEncounter createHearingPlanOfCareActivityEncounter() {
    HearingPlanOfCareActivityEncounterImpl hearingPlanOfCareActivityEncounter = new HearingPlanOfCareActivityEncounterImpl();
    return hearingPlanOfCareActivityEncounter;
  }

				/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HearingPlanOfCareActivityObservation createHearingPlanOfCareActivityObservation() {
    HearingPlanOfCareActivityObservationImpl hearingPlanOfCareActivityObservation = new HearingPlanOfCareActivityObservationImpl();
    return hearingPlanOfCareActivityObservation;
  }

				/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivityProcedure createHearingPlanOfCareActivityProcedure()
  {
    HearingPlanOfCareActivityProcedureImpl hearingPlanOfCareActivityProcedure = new HearingPlanOfCareActivityProcedureImpl();
    return hearingPlanOfCareActivityProcedure;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivitySubstanceAdministration createHearingPlanOfCareActivitySubstanceAdministration()
  {
    HearingPlanOfCareActivitySubstanceAdministrationImpl hearingPlanOfCareActivitySubstanceAdministration = new HearingPlanOfCareActivitySubstanceAdministrationImpl();
    return hearingPlanOfCareActivitySubstanceAdministration;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivityNonMedicinalSupply createHearingPlanOfCareActivityNonMedicinalSupply()
  {
    HearingPlanOfCareActivityNonMedicinalSupplyImpl hearingPlanOfCareActivityNonMedicinalSupply = new HearingPlanOfCareActivityNonMedicinalSupplyImpl();
    return hearingPlanOfCareActivityNonMedicinalSupply;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningOrganizer createHearingScreeningOrganizer()
  {
    HearingScreeningOrganizerImpl hearingScreeningOrganizer = new HearingScreeningOrganizerImpl();
    return hearingScreeningOrganizer;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningOutcomeObservationLeft createHearingScreeningOutcomeObservationLeft()
  {
    HearingScreeningOutcomeObservationLeftImpl hearingScreeningOutcomeObservationLeft = new HearingScreeningOutcomeObservationLeftImpl();
    return hearingScreeningOutcomeObservationLeft;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReasonNotScreened createReasonNotScreened()
  {
    ReasonNotScreenedImpl reasonNotScreened = new ReasonNotScreenedImpl();
    return reasonNotScreened;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningOutcomeObservationRight createHearingScreeningOutcomeObservationRight()
  {
    HearingScreeningOutcomeObservationRightImpl hearingScreeningOutcomeObservationRight = new HearingScreeningOutcomeObservationRightImpl();
    return hearingScreeningOutcomeObservationRight;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningResultsOrganizer createHearingScreeningResultsOrganizer()
  {
    HearingScreeningResultsOrganizerImpl hearingScreeningResultsOrganizer = new HearingScreeningResultsOrganizerImpl();
    return hearingScreeningResultsOrganizer;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningResultObservation createHearingScreeningResultObservation()
  {
    HearingScreeningResultObservationImpl hearingScreeningResultObservation = new HearingScreeningResultObservationImpl();
    return hearingScreeningResultObservation;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskIndicatorForHearingLossObservation createRiskIndicatorForHearingLossObservation()
  {
    RiskIndicatorForHearingLossObservationImpl riskIndicatorForHearingLossObservation = new RiskIndicatorForHearingLossObservationImpl();
    return riskIndicatorForHearingLossObservation;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareInstructions createHearingPlanOfCareInstructions()
  {
    HearingPlanOfCareInstructionsImpl hearingPlanOfCareInstructions = new HearingPlanOfCareInstructionsImpl();
    return hearingPlanOfCareInstructions;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningSection createHearingScreeningSection()
  {
    HearingScreeningSectionImpl hearingScreeningSection = new HearingScreeningSectionImpl();
    return hearingScreeningSection;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HPOCPackage getHPOCPackage()
  {
    return (HPOCPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HPOCPackage getPackage()
  {
    return HPOCPackage.eINSTANCE;
  }

} //HPOCFactoryImpl
