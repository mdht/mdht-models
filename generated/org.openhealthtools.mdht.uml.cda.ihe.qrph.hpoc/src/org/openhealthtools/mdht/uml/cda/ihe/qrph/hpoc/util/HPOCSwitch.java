/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage
 * @generated
 */
public class HPOCSwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static HPOCPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HPOCSwitch()
  {
		if (modelPackage == null) {
			modelPackage = HPOCPackage.eINSTANCE;
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  public T doSwitch(EObject theEObject)
  {
		return doSwitch(theEObject.eClass(), theEObject);
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case HPOCPackage.HEARING_PLAN_OF_CARE_DOCUMENT: {
				HearingPlanOfCareDocument hearingPlanOfCareDocument = (HearingPlanOfCareDocument)theEObject;
				T result = caseHearingPlanOfCareDocument(hearingPlanOfCareDocument);
				if (result == null) result = caseHearingPlanOfCareHeader(hearingPlanOfCareDocument);
				if (result == null) result = caseClinicalDocument(hearingPlanOfCareDocument);
				if (result == null) result = caseAct(hearingPlanOfCareDocument);
				if (result == null) result = caseInfrastructureRoot(hearingPlanOfCareDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_HEADER: {
				HearingPlanOfCareHeader hearingPlanOfCareHeader = (HearingPlanOfCareHeader)theEObject;
				T result = caseHearingPlanOfCareHeader(hearingPlanOfCareHeader);
				if (result == null) result = caseClinicalDocument(hearingPlanOfCareHeader);
				if (result == null) result = caseAct(hearingPlanOfCareHeader);
				if (result == null) result = caseInfrastructureRoot(hearingPlanOfCareHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_SECTION: {
				HearingPlanOfCareSection hearingPlanOfCareSection = (HearingPlanOfCareSection)theEObject;
				T result = caseHearingPlanOfCareSection(hearingPlanOfCareSection);
				if (result == null) result = caseSection(hearingPlanOfCareSection);
				if (result == null) result = caseAct(hearingPlanOfCareSection);
				if (result == null) result = caseInfrastructureRoot(hearingPlanOfCareSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_SCREENING_SECTION: {
				HearingScreeningSection hearingScreeningSection = (HearingScreeningSection)theEObject;
				T result = caseHearingScreeningSection(hearingScreeningSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION: {
				RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection = (RiskIndicatorsForHearingLossSection)theEObject;
				T result = caseRiskIndicatorsForHearingLossSection(riskIndicatorsForHearingLossSection);
				if (result == null) result = caseSection(riskIndicatorsForHearingLossSection);
				if (result == null) result = caseAct(riskIndicatorsForHearingLossSection);
				if (result == null) result = caseInfrastructureRoot(riskIndicatorsForHearingLossSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.PROBLEMS_SECTION: {
				ProblemsSection problemsSection = (ProblemsSection)theEObject;
				T result = caseProblemsSection(problemsSection);
				if (result == null) result = caseSection(problemsSection);
				if (result == null) result = caseAct(problemsSection);
				if (result == null) result = caseInfrastructureRoot(problemsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.PROCEDURE_SECTION: {
				ProcedureSection procedureSection = (ProcedureSection)theEObject;
				T result = caseProcedureSection(procedureSection);
				if (result == null) result = caseSection(procedureSection);
				if (result == null) result = caseAct(procedureSection);
				if (result == null) result = caseInfrastructureRoot(procedureSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_ACT: {
				HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct = (HearingPlanOfCareActivityAct)theEObject;
				T result = caseHearingPlanOfCareActivityAct(hearingPlanOfCareActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER: {
				HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter = (HearingPlanOfCareActivityEncounter)theEObject;
				T result = caseHearingPlanOfCareActivityEncounter(hearingPlanOfCareActivityEncounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION: {
				HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation = (HearingPlanOfCareActivityObservation)theEObject;
				T result = caseHearingPlanOfCareActivityObservation(hearingPlanOfCareActivityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure = (HearingPlanOfCareActivityProcedure)theEObject;
				T result = caseHearingPlanOfCareActivityProcedure(hearingPlanOfCareActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration = (HearingPlanOfCareActivitySubstanceAdministration)theEObject;
				T result = caseHearingPlanOfCareActivitySubstanceAdministration(hearingPlanOfCareActivitySubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_INSTRUCTIONS: {
				HearingPlanOfCareInstructions hearingPlanOfCareInstructions = (HearingPlanOfCareInstructions)theEObject;
				T result = caseHearingPlanOfCareInstructions(hearingPlanOfCareInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY: {
				HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply = (HearingPlanOfCareActivityNonMedicinalSupply)theEObject;
				T result = caseHearingPlanOfCareActivityNonMedicinalSupply(hearingPlanOfCareActivityNonMedicinalSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_SCREENING_ORGANIZER: {
				HearingScreeningOrganizer hearingScreeningOrganizer = (HearingScreeningOrganizer)theEObject;
				T result = caseHearingScreeningOrganizer(hearingScreeningOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT: {
				HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft = (HearingScreeningOutcomeObservationLeft)theEObject;
				T result = caseHearingScreeningOutcomeObservationLeft(hearingScreeningOutcomeObservationLeft);
				if (result == null) result = caseObservation(hearingScreeningOutcomeObservationLeft);
				if (result == null) result = caseClinicalStatement(hearingScreeningOutcomeObservationLeft);
				if (result == null) result = caseAct(hearingScreeningOutcomeObservationLeft);
				if (result == null) result = caseInfrastructureRoot(hearingScreeningOutcomeObservationLeft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.REASON_NOT_SCREENED: {
				ReasonNotScreened reasonNotScreened = (ReasonNotScreened)theEObject;
				T result = caseReasonNotScreened(reasonNotScreened);
				if (result == null) result = caseCDA_Act(reasonNotScreened);
				if (result == null) result = caseClinicalStatement(reasonNotScreened);
				if (result == null) result = caseAct(reasonNotScreened);
				if (result == null) result = caseInfrastructureRoot(reasonNotScreened);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT: {
				HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight = (HearingScreeningOutcomeObservationRight)theEObject;
				T result = caseHearingScreeningOutcomeObservationRight(hearingScreeningOutcomeObservationRight);
				if (result == null) result = caseObservation(hearingScreeningOutcomeObservationRight);
				if (result == null) result = caseClinicalStatement(hearingScreeningOutcomeObservationRight);
				if (result == null) result = caseAct(hearingScreeningOutcomeObservationRight);
				if (result == null) result = caseInfrastructureRoot(hearingScreeningOutcomeObservationRight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_SCREENING_RESULTS_ORGANIZER: {
				HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer = (HearingScreeningResultsOrganizer)theEObject;
				T result = caseHearingScreeningResultsOrganizer(hearingScreeningResultsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_SCREENING_RESULT_OBSERVATION: {
				HearingScreeningResultObservation hearingScreeningResultObservation = (HearingScreeningResultObservation)theEObject;
				T result = caseHearingScreeningResultObservation(hearingScreeningResultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION: {
				RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation = (RiskIndicatorForHearingLossObservation)theEObject;
				T result = caseRiskIndicatorForHearingLossObservation(riskIndicatorForHearingLossObservation);
				if (result == null) result = caseObservation(riskIndicatorForHearingLossObservation);
				if (result == null) result = caseClinicalStatement(riskIndicatorForHearingLossObservation);
				if (result == null) result = caseAct(riskIndicatorForHearingLossObservation);
				if (result == null) result = caseInfrastructureRoot(riskIndicatorForHearingLossObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.PROBLEM_CONCERN: {
				ProblemConcern problemConcern = (ProblemConcern)theEObject;
				T result = caseProblemConcern(problemConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN: {
				HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern = (HearingPlanOfCareProblemConcern)theEObject;
				T result = caseHearingPlanOfCareProblemConcern(hearingPlanOfCareProblemConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION: {
				HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection = (HearingPlanOfCareProblemsSubSection)theEObject;
				T result = caseHearingPlanOfCareProblemsSubSection(hearingPlanOfCareProblemsSubSection);
				if (result == null) result = caseSection(hearingPlanOfCareProblemsSubSection);
				if (result == null) result = caseAct(hearingPlanOfCareProblemsSubSection);
				if (result == null) result = caseInfrastructureRoot(hearingPlanOfCareProblemsSubSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure)theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.PROCEDURE_ACTIVITY_ACT: {
				ProcedureActivityAct procedureActivityAct = (ProcedureActivityAct)theEObject;
				T result = caseProcedureActivityAct(procedureActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION: {
				HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection = (HearingPlanOfCareRelevantProceduresSubSection)theEObject;
				T result = caseHearingPlanOfCareRelevantProceduresSubSection(hearingPlanOfCareRelevantProceduresSubSection);
				if (result == null) result = caseSection(hearingPlanOfCareRelevantProceduresSubSection);
				if (result == null) result = caseAct(hearingPlanOfCareRelevantProceduresSubSection);
				if (result == null) result = caseInfrastructureRoot(hearingPlanOfCareRelevantProceduresSubSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE: {
				HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure = (HearingPlanOfCareProcedureActivityProcedure)theEObject;
				T result = caseHearingPlanOfCareProcedureActivityProcedure(hearingPlanOfCareProcedureActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT: {
				HearingPlanOfCareProcedureActivityAct hearingPlanOfCareProcedureActivityAct = (HearingPlanOfCareProcedureActivityAct)theEObject;
				T result = caseHearingPlanOfCareProcedureActivityAct(hearingPlanOfCareProcedureActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareDocument(HearingPlanOfCareDocument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHearingPlanOfCareHeader(HearingPlanOfCareHeader object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRiskIndicatorsForHearingLossSection(RiskIndicatorsForHearingLossSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProblemsSection(ProblemsSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProblemConcern(ProblemConcern object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Problem Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareProblemConcern(HearingPlanOfCareProblemConcern object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareProblemsSubSection(HearingPlanOfCareProblemsSubSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcedureActivityProcedure(ProcedureActivityProcedure object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcedureActivityAct(ProcedureActivityAct object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareRelevantProceduresSubSection(HearingPlanOfCareRelevantProceduresSubSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareProcedureActivityProcedure(HearingPlanOfCareProcedureActivityProcedure object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareProcedureActivityAct(HearingPlanOfCareProcedureActivityAct object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcedureSection(ProcedureSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareSection(HearingPlanOfCareSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareActivityAct(HearingPlanOfCareActivityAct object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHearingPlanOfCareActivityEncounter(HearingPlanOfCareActivityEncounter object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHearingPlanOfCareActivityObservation(HearingPlanOfCareActivityObservation object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareActivityProcedure(HearingPlanOfCareActivityProcedure object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareActivitySubstanceAdministration(HearingPlanOfCareActivitySubstanceAdministration object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareActivityNonMedicinalSupply(HearingPlanOfCareActivityNonMedicinalSupply object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningOrganizer(HearingScreeningOrganizer object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningOutcomeObservationLeft(HearingScreeningOutcomeObservationLeft object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason Not Screened</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseReasonNotScreened(ReasonNotScreened object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningOutcomeObservationRight(HearingScreeningOutcomeObservationRight object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Results Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningResultsOrganizer(HearingScreeningResultsOrganizer object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningResultObservation(HearingScreeningResultObservation object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRiskIndicatorForHearingLossObservation(RiskIndicatorForHearingLossObservation object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Plan Of Care Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingPlanOfCareInstructions(HearingPlanOfCareInstructions object)
  {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningSection(HearingScreeningSection object)
  {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  public T defaultCase(EObject object)
  {
		return null;
	}

} //HPOCSwitch
