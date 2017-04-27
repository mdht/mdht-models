/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage
 * @generated
 */
public class HPOCAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static HPOCPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HPOCAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = HPOCPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HPOCSwitch<Adapter> modelSwitch =
    new HPOCSwitch<Adapter>() {
			@Override
			public Adapter caseHearingPlanOfCareDocument(HearingPlanOfCareDocument object) {
				return createHearingPlanOfCareDocumentAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareHeader(HearingPlanOfCareHeader object) {
				return createHearingPlanOfCareHeaderAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareSection(HearingPlanOfCareSection object) {
				return createHearingPlanOfCareSectionAdapter();
			}
			@Override
			public Adapter caseHearingScreeningSection(HearingScreeningSection object) {
				return createHearingScreeningSectionAdapter();
			}
			@Override
			public Adapter caseRiskIndicatorsForHearingLossSection(RiskIndicatorsForHearingLossSection object) {
				return createRiskIndicatorsForHearingLossSectionAdapter();
			}
			@Override
			public Adapter caseProblemsSection(ProblemsSection object) {
				return createProblemsSectionAdapter();
			}
			@Override
			public Adapter caseProcedureSection(ProcedureSection object) {
				return createProcedureSectionAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareActivityAct(HearingPlanOfCareActivityAct object) {
				return createHearingPlanOfCareActivityActAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareActivityEncounter(HearingPlanOfCareActivityEncounter object) {
				return createHearingPlanOfCareActivityEncounterAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareActivityObservation(HearingPlanOfCareActivityObservation object) {
				return createHearingPlanOfCareActivityObservationAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareActivityProcedure(HearingPlanOfCareActivityProcedure object) {
				return createHearingPlanOfCareActivityProcedureAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareActivitySubstanceAdministration(HearingPlanOfCareActivitySubstanceAdministration object) {
				return createHearingPlanOfCareActivitySubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareInstructions(HearingPlanOfCareInstructions object) {
				return createHearingPlanOfCareInstructionsAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareActivityNonMedicinalSupply(HearingPlanOfCareActivityNonMedicinalSupply object) {
				return createHearingPlanOfCareActivityNonMedicinalSupplyAdapter();
			}
			@Override
			public Adapter caseHearingScreeningOrganizer(HearingScreeningOrganizer object) {
				return createHearingScreeningOrganizerAdapter();
			}
			@Override
			public Adapter caseHearingScreeningOutcomeObservationLeft(HearingScreeningOutcomeObservationLeft object) {
				return createHearingScreeningOutcomeObservationLeftAdapter();
			}
			@Override
			public Adapter caseReasonNotScreened(ReasonNotScreened object) {
				return createReasonNotScreenedAdapter();
			}
			@Override
			public Adapter caseHearingScreeningOutcomeObservationRight(HearingScreeningOutcomeObservationRight object) {
				return createHearingScreeningOutcomeObservationRightAdapter();
			}
			@Override
			public Adapter caseHearingScreeningResultsOrganizer(HearingScreeningResultsOrganizer object) {
				return createHearingScreeningResultsOrganizerAdapter();
			}
			@Override
			public Adapter caseHearingScreeningResultObservation(HearingScreeningResultObservation object) {
				return createHearingScreeningResultObservationAdapter();
			}
			@Override
			public Adapter caseRiskIndicatorForHearingLossObservation(RiskIndicatorForHearingLossObservation object) {
				return createRiskIndicatorForHearingLossObservationAdapter();
			}
			@Override
			public Adapter caseProblemConcern(ProblemConcern object) {
				return createProblemConcernAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareProblemConcern(HearingPlanOfCareProblemConcern object) {
				return createHearingPlanOfCareProblemConcernAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareProblemsSubSection(HearingPlanOfCareProblemsSubSection object) {
				return createHearingPlanOfCareProblemsSubSectionAdapter();
			}
			@Override
			public Adapter caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
				return createProcedureActivityProcedureAdapter();
			}
			@Override
			public Adapter caseProcedureActivityAct(ProcedureActivityAct object) {
				return createProcedureActivityActAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareRelevantProceduresSubSection(HearingPlanOfCareRelevantProceduresSubSection object) {
				return createHearingPlanOfCareRelevantProceduresSubSectionAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareProcedureActivityProcedure(HearingPlanOfCareProcedureActivityProcedure object) {
				return createHearingPlanOfCareProcedureActivityProcedureAdapter();
			}
			@Override
			public Adapter caseHearingPlanOfCareProcedureActivityAct(HearingPlanOfCareProcedureActivityAct object) {
				return createHearingPlanOfCareProcedureActivityActAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument <em>Hearing Plan Of Care Document</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument
	 * @generated
	 */
  public Adapter createHearingPlanOfCareDocumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader <em>Hearing Plan Of Care Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader
	 * @generated
	 */
	public Adapter createHearingPlanOfCareHeaderAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection <em>Risk Indicators For Hearing Loss Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection
	 * @generated
	 */
  public Adapter createRiskIndicatorsForHearingLossSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection <em>Problems Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection
	 * @generated
	 */
  public Adapter createProblemsSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern <em>Problem Concern</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern
	 * @generated
	 */
  public Adapter createProblemConcernAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern <em>Hearing Plan Of Care Problem Concern</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern
	 * @generated
	 */
  public Adapter createHearingPlanOfCareProblemConcernAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection <em>Hearing Plan Of Care Problems Sub Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection
	 * @generated
	 */
  public Adapter createHearingPlanOfCareProblemsSubSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityProcedure <em>Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityProcedure
	 * @generated
	 */
  public Adapter createProcedureActivityProcedureAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct <em>Procedure Activity Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct
	 * @generated
	 */
  public Adapter createProcedureActivityActAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection <em>Hearing Plan Of Care Relevant Procedures Sub Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection
	 * @generated
	 */
  public Adapter createHearingPlanOfCareRelevantProceduresSubSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure <em>Hearing Plan Of Care Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure
	 * @generated
	 */
  public Adapter createHearingPlanOfCareProcedureActivityProcedureAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityAct <em>Hearing Plan Of Care Procedure Activity Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityAct
	 * @generated
	 */
  public Adapter createHearingPlanOfCareProcedureActivityActAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection <em>Procedure Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection
	 * @generated
	 */
  public Adapter createProcedureSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection <em>Hearing Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection
	 * @generated
	 */
  public Adapter createHearingPlanOfCareSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct <em>Hearing Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct
	 * @generated
	 */
  public Adapter createHearingPlanOfCareActivityActAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter <em>Hearing Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter
	 * @generated
	 */
	public Adapter createHearingPlanOfCareActivityEncounterAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityObservation <em>Hearing Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityObservation
	 * @generated
	 */
	public Adapter createHearingPlanOfCareActivityObservationAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityProcedure <em>Hearing Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityProcedure
	 * @generated
	 */
  public Adapter createHearingPlanOfCareActivityProcedureAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration <em>Hearing Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
  public Adapter createHearingPlanOfCareActivitySubstanceAdministrationAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply <em>Hearing Plan Of Care Activity Non Medicinal Supply</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply
	 * @generated
	 */
  public Adapter createHearingPlanOfCareActivityNonMedicinalSupplyAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer <em>Hearing Screening Organizer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer
	 * @generated
	 */
  public Adapter createHearingScreeningOrganizerAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft <em>Hearing Screening Outcome Observation Left</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft
	 * @generated
	 */
  public Adapter createHearingScreeningOutcomeObservationLeftAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened <em>Reason Not Screened</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened
	 * @generated
	 */
  public Adapter createReasonNotScreenedAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight <em>Hearing Screening Outcome Observation Right</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight
	 * @generated
	 */
  public Adapter createHearingScreeningOutcomeObservationRightAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultsOrganizer <em>Hearing Screening Results Organizer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultsOrganizer
	 * @generated
	 */
  public Adapter createHearingScreeningResultsOrganizerAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation <em>Hearing Screening Result Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation
	 * @generated
	 */
  public Adapter createHearingScreeningResultObservationAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation <em>Risk Indicator For Hearing Loss Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation
	 * @generated
	 */
  public Adapter createRiskIndicatorForHearingLossObservationAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareInstructions <em>Hearing Plan Of Care Instructions</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareInstructions
	 * @generated
	 */
  public Adapter createHearingPlanOfCareInstructionsAdapter()
  {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection <em>Hearing Screening Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection
	 * @generated
	 */
  public Adapter createHearingScreeningSectionAdapter()
  {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
  public Adapter createInfrastructureRootAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Act
	 * @generated
	 */
  public Adapter createActAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
  public Adapter createClinicalDocumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //HPOCAdapterFactory
