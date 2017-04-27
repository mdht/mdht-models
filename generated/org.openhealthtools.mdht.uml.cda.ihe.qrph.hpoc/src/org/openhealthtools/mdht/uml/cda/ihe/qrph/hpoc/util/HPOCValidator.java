/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage
 * @generated
 */
public class HPOCValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final HPOCValidator INSTANCE = new HPOCValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Type Id Root' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Type Id Extension' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Set Id And Version Number' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Realm Code' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Realm Code P' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P = 5;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Type Id' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID = 6;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Id' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_ID = 7;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Code' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_CODE = 8;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Title' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TITLE = 9;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Effective Time' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME = 10;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Confidentiality Code' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE = 11;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Language Code' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE = 12;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Set Id' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID = 13;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Version Number' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER = 14;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Hearing Plan Of Care Section' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION = 15;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Hearing Screening Section' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION = 16;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Risk Indicators For Hearing Loss Section' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION = 17;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Problems Section' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION = 18;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Document Procedure Section' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION = 19;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Template Id' of 'Hearing Plan Of Care Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID = 20;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Template Id' of 'Hearing Plan Of Care Header'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID = 21;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Record Target' of 'Hearing Plan Of Care Header'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET = 22;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Custodian' of 'Hearing Plan Of Care Header'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN = 23;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Component Of' of 'Hearing Plan Of Care Header'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF = 24;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Documentation Of' of 'Hearing Plan Of Care Header'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF = 25;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Header Author' of 'Hearing Plan Of Care Header'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_AUTHOR = 26;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Act Code P' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_ACTIVITY_ACT_CODE_P = 67;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Act Code' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_ACTIVITY_ACT_CODE = 68;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Act Text' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_ACTIVITY_ACT_TEXT = 69;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Act Status Code' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_ACTIVITY_ACT_STATUS_CODE = 70;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Act Effective Time' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_ACTIVITY_ACT_EFFECTIVE_TIME = 71;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Template Id' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID = 66;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Encounter Effective Time Low High' of 'Hearing Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH = 72;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Encounter Code' of 'Hearing Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE = 74;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Encounter Code P' of 'Hearing Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P = 75;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Encounter Status Code' of 'Hearing Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE = 76;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Encounter Text' of 'Hearing Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT = 77;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Template Id' of 'Hearing Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID = 73;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Observation Effective Time Low High' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME_LOW_HIGH = 78;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Observation Code P' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_CODE_P = 80;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Observation Code' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_CODE = 81;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Observation Effective Time' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME = 82;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Observation Status Code' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_STATUS_CODE = 83;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Observation Text' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEXT = 84;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Template Id' of 'Hearing Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID = 79;

				/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Procedure Effective Time Low High' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME_LOW_HIGH = 85;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Procedure Code' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_CODE = 87;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Procedure Code P' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_CODE_P = 88;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Procedure Effective Time' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME = 89;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Procedure Status Code' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_STATUS_CODE = 90;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Procedure Text' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEXT = 91;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Template Id' of 'Hearing Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 86;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Code' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE = 93;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Text' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT = 94;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Status Code' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE = 95;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Repeat Number' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER = 96;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Route Code P' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P = 97;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Route Code' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE = 98;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code P' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P = 99;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE = 100;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Effective Time' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME = 101;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code P' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P = 102;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE = 103;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Dose Quantity' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY = 104;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Rate Quantity' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY = 105;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Max Dose Quantity' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY = 106;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Consumable' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE = 107;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Performer' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER = 108;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Participant' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT = 109;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Indication' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION = 110;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Instructions' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS = 111;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Supply' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY = 112;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Dispense' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE = 113;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Reaction' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION = 114;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Substance Administration Precondition' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION = 115;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Template Id' of 'Hearing Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 92;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Instructions Effective Time' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__HEARING_PLAN_OF_CARE_INSTRUCTIONS_EFFECTIVE_TIME = 120;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Status Code P' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__INSTRUCTIONS_STATUS_CODE_P = 121;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Template Id' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__INSTRUCTIONS_TEMPLATE_ID = 116;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Code P' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__INSTRUCTIONS_CODE_P = 117;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Code' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__INSTRUCTIONS_CODE = 118;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Text' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__INSTRUCTIONS_TEXT = 119;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Status Code' of 'Hearing Plan Of Care Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_INSTRUCTIONS__INSTRUCTIONS_STATUS_CODE = 122;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Non Medicinal Supply Code' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE = 124;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Non Medicinal Supply Code P' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P = 125;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Non Medicinal Supply Text' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT = 126;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Non Medicinal Supply Effective Time' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME = 127;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Non Medicinal Supply Quantity' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY = 128;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Non Medicinal Supply Participant' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT = 129;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Template Id' of 'Hearing Plan Of Care Activity Non Medicinal Supply'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID = 123;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code P' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_CODE_P = 132;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Organizer Component Left Ear' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR = 134;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Organizer Component Right Ear' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR = 135;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Organizer Component Results Organizer' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER = 136;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 130;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Class Code' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_CLASS_CODE = 131;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Hearing Screening Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_CODE = 133;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Template Id' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID = 137;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Class Code' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE = 138;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Mood Code' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE = 139;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Negation Ind' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND = 140;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Id' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID = 141;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Code P' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P = 142;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Code' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE = 143;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Text' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT = 144;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Status Code' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE = 145;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Effective Time' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME = 146;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Value' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE = 147;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Value P' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P = 148;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Method Code P' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P = 149;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Method Code' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE = 150;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Target Site Code P' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P = 151;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Target Site Code' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE = 152;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Entry Relationship' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP = 153;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Left Author' of 'Hearing Screening Outcome Observation Left'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR = 154;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason Not Screened Template Id' of 'Reason Not Screened'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int REASON_NOT_SCREENED__REASON_NOT_SCREENED_TEMPLATE_ID = 155;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason Not Screened Class Code' of 'Reason Not Screened'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int REASON_NOT_SCREENED__REASON_NOT_SCREENED_CLASS_CODE = 156;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason Not Screened Mood Code' of 'Reason Not Screened'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int REASON_NOT_SCREENED__REASON_NOT_SCREENED_MOOD_CODE = 157;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason Not Screened Code P' of 'Reason Not Screened'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int REASON_NOT_SCREENED__REASON_NOT_SCREENED_CODE_P = 158;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason Not Screened Code' of 'Reason Not Screened'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int REASON_NOT_SCREENED__REASON_NOT_SCREENED_CODE = 159;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason Not Screened Text' of 'Reason Not Screened'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int REASON_NOT_SCREENED__REASON_NOT_SCREENED_TEXT = 160;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Template Id' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID = 161;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Class Code' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE = 162;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Mood Code' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE = 163;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Negation Ind' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND = 164;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Id' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID = 165;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Code P' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P = 166;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Code' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE = 167;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Text' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT = 168;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Status Code' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE = 169;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Status Code P' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P = 170;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Effective Time' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME = 171;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Value' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE = 172;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Method Code P' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P = 173;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Method Code' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE = 174;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Target Site Code P' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P = 175;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Target Site Code' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE = 176;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Entry Relationship' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP = 177;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Outcome Observation Right Author' of 'Hearing Screening Outcome Observation Right'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR = 178;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code P' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__RESULT_ORGANIZER_CODE_P = 181;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Results Organizer Component Result Observation' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__HEARING_SCREENING_RESULTS_ORGANIZER_COMPONENT_RESULT_OBSERVATION = 185;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 179;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Class Code' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__RESULT_ORGANIZER_CLASS_CODE = 180;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__RESULT_ORGANIZER_CODE = 182;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code P' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE_P = 183;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Hearing Screening Results Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULTS_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 184;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code P' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE_P = 187;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Value P' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE_P = 192;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Method Code P' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_METHOD_CODE_P = 193;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Target Site Code P' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TARGET_SITE_CODE_P = 195;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Result Observation Entry Relationship Reason Not Screened' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED = 197;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Result Observation Author' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR = 198;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Result Observation Performer' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER = 199;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 186;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 188;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Text' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TEXT = 189;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Effective Time' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_EFFECTIVE_TIME = 190;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Value' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE = 191;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Method Code' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_METHOD_CODE = 194;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Target Site Code' of 'Hearing Screening Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TARGET_SITE_CODE = 196;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Template Id' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID = 200;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Class Code' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE = 201;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Mood Code' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE = 202;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Code' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE = 203;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Text' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT = 204;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Status Code' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE = 205;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Status Code P' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P = 206;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Value' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE = 207;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Id' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID = 208;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicator For Hearing Loss Observation Effective Time' of 'Risk Indicator For Hearing Loss Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME = 209;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Text' of 'Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEM_CONCERN__PROBLEM_CONCERN_TEXT = 211;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Act Template Id' of 'Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_TEMPLATE_ID = 210;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Act Effective Time' of 'Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME = 212;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problem Concern Text' of 'Hearing Plan Of Care Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT = 215;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Act Template Id' of 'Hearing Plan Of Care Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_TEMPLATE_ID = 213;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Act Id' of 'Hearing Plan Of Care Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_ID = 214;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Act Effective Time' of 'Hearing Plan Of Care Problem Concern'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME = 216;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problems Sub Section Template Id' of 'Hearing Plan Of Care Problems Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID = 217;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problems Sub Section Code' of 'Hearing Plan Of Care Problems Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE = 218;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problems Sub Section Code P' of 'Hearing Plan Of Care Problems Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P = 219;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problems Sub Section Text' of 'Hearing Plan Of Care Problems Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT = 220;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problems Sub Section Title' of 'Hearing Plan Of Care Problems Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE = 221;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Problems Sub Section Entry Hpoc Problem Concern' of 'Hearing Plan Of Care Problems Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN = 222;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Procedure Text' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_PROCEDURE__HPOC_PROCEDURE_ACTIVITY_PROCEDURE_TEXT = 224;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Template Id' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 223;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Id' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_ID = 225;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CODE = 226;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Act Text' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_TEXT = 228;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Act Entry Relationship Encounter' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER = 230;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Act Entry Relationship Instructions' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS = 231;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Act Entry Relationship Indication' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION = 232;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Act Entry Relationship Medication' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION = 233;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HPOC Procedure Activity Act Entry Relationship Procedure' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE = 234;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Template Id' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID = 227;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Code' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE = 229;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Template Id' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID = 235;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Code P' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P = 236;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Code' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE = 237;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Text' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT = 238;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Title' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE = 239;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Procedure' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE = 240;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Act' of 'Hearing Plan Of Care Relevant Procedures Sub Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT = 241;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Procedure Activity Procedure Id' of 'Hearing Plan Of Care Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID = 243;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Procedure Activity Procedure Text' of 'Hearing Plan Of Care Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT = 245;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Template Id' of 'Hearing Plan Of Care Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 242;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Code' of 'Hearing Plan Of Care Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CODE = 244;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Procedure Activity Act Text' of 'Hearing Plan Of Care Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT_TEXT = 249;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Template Id' of 'Hearing Plan Of Care Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID = 246;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Id' of 'Hearing Plan Of Care Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_ID = 247;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Code' of 'Hearing Plan Of Care Procedure Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE = 248;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Template Id' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID = 45;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Code' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE = 46;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Code P' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P = 47;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Title' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE = 48;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Text' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT = 49;

        /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Entry' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY = 50;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Template Id' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_TEMPLATE_ID = 51;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Code' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_CODE = 52;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Code P' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_CODE_P = 53;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Title' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_TITLE = 54;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Text' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_TEXT = 55;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Component Hpoc Problems' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS = 56;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problems Section Entry Problem Concern' of 'Problems Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROBLEMS_SECTION__PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN = 57;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Template Id' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_TEMPLATE_ID = 58;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Code' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_CODE = 59;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Code P' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_CODE_P = 60;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Title' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_TITLE = 61;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Text' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_TEXT = 62;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Entry Procedure Activity Procedure' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE = 63;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Section Entry Procedure Activity Act' of 'Procedure Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PROCEDURE_SECTION__PROCEDURE_SECTION_ENTRY_PROCEDURE_ACTIVITY_ACT = 64;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Activity Act Effective Time Low High' of 'Hearing Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_ACTIVITY_ACT__HEARING_PLAN_OF_CARE_ACTIVITY_ACT_EFFECTIVE_TIME_LOW_HIGH = 65;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Template Id' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 27;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Code' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_CODE = 28;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Code P' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_CODE_P = 29;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Title' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_TITLE = 30;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Text' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_TEXT = 31;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Act' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT = 32;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Encounter' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER = 33;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Observation' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION = 34;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Procedure' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE = 35;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Substance Administration' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION = 36;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Supply' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY = 37;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Plan Of Care Section Entry Instructions' of 'Hearing Plan Of Care Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS = 38;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Section Code' of 'Hearing Screening Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_SECTION__HEARING_SCREENING_SECTION_CODE = 41;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Section Code P' of 'Hearing Screening Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_SECTION__HEARING_SCREENING_SECTION_CODE_P = 40;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Section Text' of 'Hearing Screening Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_SECTION__HEARING_SCREENING_SECTION_TEXT = 42;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Section Title' of 'Hearing Screening Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_SECTION__HEARING_SCREENING_SECTION_TITLE = 43;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hearing Screening Section Entry' of 'Hearing Screening Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_SECTION__HEARING_SCREENING_SECTION_ENTRY = 44;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Entries Optional Template Id' of 'Hearing Screening Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_SECTION__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 39;

    /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 249;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CDAValidator cdaValidator;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HPOCValidator()
  {
		super();
		cdaValidator = CDAValidator.INSTANCE;
	}

  /**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EPackage getEPackage()
  {
	  return HPOCPackage.eINSTANCE;
	}

  /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		switch (classifierID) {
			case HPOCPackage.HEARING_PLAN_OF_CARE_DOCUMENT:
				return validateHearingPlanOfCareDocument((HearingPlanOfCareDocument)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_HEADER:
				return validateHearingPlanOfCareHeader((HearingPlanOfCareHeader)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_SECTION:
				return validateHearingPlanOfCareSection((HearingPlanOfCareSection)value, diagnostics, context);
			case HPOCPackage.HEARING_SCREENING_SECTION:
				return validateHearingScreeningSection((HearingScreeningSection)value, diagnostics, context);
			case HPOCPackage.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION:
				return validateRiskIndicatorsForHearingLossSection((RiskIndicatorsForHearingLossSection)value, diagnostics, context);
			case HPOCPackage.PROBLEMS_SECTION:
				return validateProblemsSection((ProblemsSection)value, diagnostics, context);
			case HPOCPackage.PROCEDURE_SECTION:
				return validateProcedureSection((ProcedureSection)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_ACT:
				return validateHearingPlanOfCareActivityAct((HearingPlanOfCareActivityAct)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER:
				return validateHearingPlanOfCareActivityEncounter((HearingPlanOfCareActivityEncounter)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION:
				return validateHearingPlanOfCareActivityObservation((HearingPlanOfCareActivityObservation)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return validateHearingPlanOfCareActivityProcedure((HearingPlanOfCareActivityProcedure)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return validateHearingPlanOfCareActivitySubstanceAdministration((HearingPlanOfCareActivitySubstanceAdministration)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_INSTRUCTIONS:
				return validateHearingPlanOfCareInstructions((HearingPlanOfCareInstructions)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY:
				return validateHearingPlanOfCareActivityNonMedicinalSupply((HearingPlanOfCareActivityNonMedicinalSupply)value, diagnostics, context);
			case HPOCPackage.HEARING_SCREENING_ORGANIZER:
				return validateHearingScreeningOrganizer((HearingScreeningOrganizer)value, diagnostics, context);
			case HPOCPackage.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT:
				return validateHearingScreeningOutcomeObservationLeft((HearingScreeningOutcomeObservationLeft)value, diagnostics, context);
			case HPOCPackage.REASON_NOT_SCREENED:
				return validateReasonNotScreened((ReasonNotScreened)value, diagnostics, context);
			case HPOCPackage.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT:
				return validateHearingScreeningOutcomeObservationRight((HearingScreeningOutcomeObservationRight)value, diagnostics, context);
			case HPOCPackage.HEARING_SCREENING_RESULTS_ORGANIZER:
				return validateHearingScreeningResultsOrganizer((HearingScreeningResultsOrganizer)value, diagnostics, context);
			case HPOCPackage.HEARING_SCREENING_RESULT_OBSERVATION:
				return validateHearingScreeningResultObservation((HearingScreeningResultObservation)value, diagnostics, context);
			case HPOCPackage.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION:
				return validateRiskIndicatorForHearingLossObservation((RiskIndicatorForHearingLossObservation)value, diagnostics, context);
			case HPOCPackage.PROBLEM_CONCERN:
				return validateProblemConcern((ProblemConcern)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN:
				return validateHearingPlanOfCareProblemConcern((HearingPlanOfCareProblemConcern)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION:
				return validateHearingPlanOfCareProblemsSubSection((HearingPlanOfCareProblemsSubSection)value, diagnostics, context);
			case HPOCPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureActivityProcedure((ProcedureActivityProcedure)value, diagnostics, context);
			case HPOCPackage.PROCEDURE_ACTIVITY_ACT:
				return validateProcedureActivityAct((ProcedureActivityAct)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION:
				return validateHearingPlanOfCareRelevantProceduresSubSection((HearingPlanOfCareRelevantProceduresSubSection)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE:
				return validateHearingPlanOfCareProcedureActivityProcedure((HearingPlanOfCareProcedureActivityProcedure)value, diagnostics, context);
			case HPOCPackage.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT:
				return validateHearingPlanOfCareProcedureActivityAct((HearingPlanOfCareProcedureActivityAct)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareHeaderTemplateId(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderRecordTarget(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderCustodian(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderComponentOf(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderDocumentationOf(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderAuthor(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTypeIdRoot(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTypeIdExtension(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentSetIdAndVersionNumber(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentRealmCode(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentRealmCodeP(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTypeId(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentId(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentCode(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTitle(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentEffectiveTime(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentConfidentialityCode(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentLanguageCode(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentSetId(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentVersionNumber(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentHearingPlanOfCareSection(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentHearingScreeningSection(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentProblemsSection(hearingPlanOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentProcedureSection(hearingPlanOfCareDocument, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentTypeIdRoot constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTypeIdRoot(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentTypeIdRoot(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentTypeIdExtension constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTypeIdExtension(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentTypeIdExtension(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentSetIdAndVersionNumber constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentSetIdAndVersionNumber(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentSetIdAndVersionNumber(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentRealmCode constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentRealmCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentRealmCode(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentRealmCodeP constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentRealmCodeP(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentRealmCodeP(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentTypeId constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTypeId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentTypeId(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentId constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentId(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentCode constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentCode(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentTitle constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentTitle(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentTitle(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentEffectiveTime constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentEffectiveTime(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentEffectiveTime(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentConfidentialityCode constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentConfidentialityCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentConfidentialityCode(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentLanguageCode constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentLanguageCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentLanguageCode(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentSetId constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentSetId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentSetId(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentVersionNumber constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentVersionNumber(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentVersionNumber(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentHearingPlanOfCareSection constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentHearingPlanOfCareSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentHearingPlanOfCareSection(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentHearingScreeningSection constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentHearingScreeningSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentHearingScreeningSection(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentProblemsSection constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentProblemsSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentProblemsSection(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareDocumentProcedureSection constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareDocumentProcedureSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareDocumentProcedureSection(diagnostics, context);
	}

  /**
	 * Validates the validateHearingPlanOfCareHeaderTemplateId constraint of '<em>Hearing Plan Of Care Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocument_validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareDocument.validateHearingPlanOfCareHeaderTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareHeader(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hearingPlanOfCareHeader, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderTemplateId(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderRecordTarget(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderCustodian(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderComponentOf(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderDocumentationOf(hearingPlanOfCareHeader, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderAuthor(hearingPlanOfCareHeader, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateHearingPlanOfCareHeaderTemplateId constraint of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareHeader.validateHearingPlanOfCareHeaderTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareHeaderRecordTarget constraint of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderRecordTarget(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareHeader.validateHearingPlanOfCareHeaderRecordTarget(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareHeaderCustodian constraint of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderCustodian(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareHeader.validateHearingPlanOfCareHeaderCustodian(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareHeaderComponentOf constraint of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderComponentOf(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareHeader.validateHearingPlanOfCareHeaderComponentOf(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareHeaderDocumentationOf constraint of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderDocumentationOf(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareHeader.validateHearingPlanOfCareHeaderDocumentationOf(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareHeaderAuthor constraint of '<em>Hearing Plan Of Care Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareHeader_validateHearingPlanOfCareHeaderAuthor(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareHeader.validateHearingPlanOfCareHeaderAuthor(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(riskIndicatorsForHearingLossSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionTemplateId(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionCode(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionCodeP(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionTitle(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionText(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionEntry(riskIndicatorsForHearingLossSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionTemplateId constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionCode constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionCode(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionCodeP constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionCodeP(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionTitle constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionTitle(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionText constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionText(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionEntry constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionEntry(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionEntry(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(problemsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionTemplateId(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionCode(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionCodeP(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionTitle(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionText(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionComponentHpocProblems(problemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemsSection_validateProblemsSectionEntryProblemConcern(problemsSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateProblemsSectionTemplateId constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionTemplateId(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProblemsSectionCode constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionCode(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateProblemsSectionCodeP constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionCodeP(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateProblemsSectionTitle constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionTitle(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateProblemsSectionText constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionText(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateProblemsSectionComponentHpocProblems constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionComponentHpocProblems(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionComponentHpocProblems(diagnostics, context);
	}

    /**
	 * Validates the validateProblemsSectionEntryProblemConcern constraint of '<em>Problems Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSection_validateProblemsSectionEntryProblemConcern(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemsSection.validateProblemsSectionEntryProblemConcern(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemConcern(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(problemConcern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcern_validateProblemConcernActTemplateId(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcern_validateProblemConcernText(problemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcern_validateProblemConcernActEffectiveTime(problemConcern, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateProblemConcernText constraint of '<em>Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemConcern_validateProblemConcernText(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemConcern.validateProblemConcernText(diagnostics, context);
	}

    /**
	 * Validates the validateProblemConcernActTemplateId constraint of '<em>Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemConcern_validateProblemConcernActTemplateId(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemConcern.validateProblemConcernActTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProblemConcernActEffectiveTime constraint of '<em>Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemConcern_validateProblemConcernActEffectiveTime(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return problemConcern.validateProblemConcernActEffectiveTime(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemConcern(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareProblemConcern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemConcern_validateProblemConcernActTemplateId(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemConcern_validateProblemConcernActId(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemConcern_validateHearingPlanOfCareProblemConcernText(hearingPlanOfCareProblemConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemConcern_validateProblemConcernActEffectiveTime(hearingPlanOfCareProblemConcern, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemConcernText constraint of '<em>Hearing Plan Of Care Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemConcern_validateHearingPlanOfCareProblemConcernText(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemConcern.validateHearingPlanOfCareProblemConcernText(diagnostics, context);
	}

    /**
	 * Validates the validateProblemConcernActTemplateId constraint of '<em>Hearing Plan Of Care Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemConcern_validateProblemConcernActTemplateId(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemConcern.validateProblemConcernActTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProblemConcernActId constraint of '<em>Hearing Plan Of Care Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemConcern_validateProblemConcernActId(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemConcern.validateProblemConcernActId(diagnostics, context);
	}

    /**
	 * Validates the validateProblemConcernActEffectiveTime constraint of '<em>Hearing Plan Of Care Problem Concern</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemConcern_validateProblemConcernActEffectiveTime(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemConcern.validateProblemConcernActEffectiveTime(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareProblemsSubSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionTemplateId(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionCode(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionCodeP(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionText(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionTitle(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(hearingPlanOfCareProblemsSubSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemsSubSectionTemplateId constraint of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionTemplateId(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemsSubSection.validateHearingPlanOfCareProblemsSubSectionTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemsSubSectionCode constraint of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionCode(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemsSubSection.validateHearingPlanOfCareProblemsSubSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemsSubSectionCodeP constraint of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionCodeP(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemsSubSection.validateHearingPlanOfCareProblemsSubSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemsSubSectionText constraint of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionText(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemsSubSection.validateHearingPlanOfCareProblemsSubSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemsSubSectionTitle constraint of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionTitle(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemsSubSection.validateHearingPlanOfCareProblemsSubSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern constraint of '<em>Hearing Plan Of Care Problems Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemsSubSection_validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProblemsSubSection.validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityProcedure(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(procedureActivityProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateHPOCProcedureActivityProcedureText(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureId(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(procedureActivityProcedure, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHPOCProcedureActivityProcedureText constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityProcedure_validateHPOCProcedureActivityProcedureText(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityProcedure.validateHPOCProcedureActivityProcedureText(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityProcedureTemplateId constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityProcedure.validateProcedureActivityProcedureTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityProcedureId constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureId(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityProcedure.validateProcedureActivityProcedureId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityProcedureCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityProcedure.validateProcedureActivityProcedureCode(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(procedureActivityAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateProcedureActivityActTemplateId(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateHPOCProcedureActivityActText(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateProcedureActivityActCode(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipEncounter(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipInstructions(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipIndication(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipMedication(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipProcedure(procedureActivityAct, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHPOCProcedureActivityActText constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateHPOCProcedureActivityActText(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateHPOCProcedureActivityActText(diagnostics, context);
	}

    /**
	 * Validates the validateHPOCProcedureActivityActEntryRelationshipEncounter constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipEncounter(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateHPOCProcedureActivityActEntryRelationshipEncounter(diagnostics, context);
	}

    /**
	 * Validates the validateHPOCProcedureActivityActEntryRelationshipInstructions constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipInstructions(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateHPOCProcedureActivityActEntryRelationshipInstructions(diagnostics, context);
	}

    /**
	 * Validates the validateHPOCProcedureActivityActEntryRelationshipIndication constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipIndication(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateHPOCProcedureActivityActEntryRelationshipIndication(diagnostics, context);
	}

    /**
	 * Validates the validateHPOCProcedureActivityActEntryRelationshipMedication constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipMedication(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateHPOCProcedureActivityActEntryRelationshipMedication(diagnostics, context);
	}

    /**
	 * Validates the validateHPOCProcedureActivityActEntryRelationshipProcedure constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateHPOCProcedureActivityActEntryRelationshipProcedure(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateHPOCProcedureActivityActEntryRelationshipProcedure(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityActTemplateId constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateProcedureActivityActTemplateId(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateProcedureActivityActTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityActCode constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureActivityAct_validateProcedureActivityActCode(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureActivityAct.validateProcedureActivityActCode(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionCode(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionText(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionTitle(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(hearingPlanOfCareRelevantProceduresSubSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionCodeP constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionCode constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionCode(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionText constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionText(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionTitle constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionTitle(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct constraint of '<em>Hearing Plan Of Care Relevant Procedures Sub Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSection_validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareRelevantProceduresSubSection.validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityProcedure(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityProcedure_validateHearingPlanOfCareProcedureActivityProcedureId(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityProcedure_validateProcedureActivityProcedureCode(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityProcedure_validateHearingPlanOfCareProcedureActivityProcedureText(hearingPlanOfCareProcedureActivityProcedure, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareProcedureActivityProcedureId constraint of '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityProcedure_validateHearingPlanOfCareProcedureActivityProcedureId(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityProcedure.validateHearingPlanOfCareProcedureActivityProcedureId(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareProcedureActivityProcedureText constraint of '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityProcedure_validateHearingPlanOfCareProcedureActivityProcedureText(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityProcedure.validateHearingPlanOfCareProcedureActivityProcedureText(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityProcedureTemplateId constraint of '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityProcedure.validateProcedureActivityProcedureTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityProcedureCode constraint of '<em>Hearing Plan Of Care Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityProcedure_validateProcedureActivityProcedureCode(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityProcedure.validateProcedureActivityProcedureCode(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityAct(HearingPlanOfCareProcedureActivityAct hearingPlanOfCareProcedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareProcedureActivityAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityAct_validateProcedureActivityActTemplateId(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityAct_validateProcedureActivityActId(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityAct_validateProcedureActivityActCode(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareProcedureActivityAct_validateHearingPlanOfCareProcedureActivityActText(hearingPlanOfCareProcedureActivityAct, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareProcedureActivityActText constraint of '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityAct_validateHearingPlanOfCareProcedureActivityActText(HearingPlanOfCareProcedureActivityAct hearingPlanOfCareProcedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityAct.validateHearingPlanOfCareProcedureActivityActText(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityActTemplateId constraint of '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityAct_validateProcedureActivityActTemplateId(HearingPlanOfCareProcedureActivityAct hearingPlanOfCareProcedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityAct.validateProcedureActivityActTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityActId constraint of '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityAct_validateProcedureActivityActId(HearingPlanOfCareProcedureActivityAct hearingPlanOfCareProcedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityAct.validateProcedureActivityActId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureActivityActCode constraint of '<em>Hearing Plan Of Care Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityAct_validateProcedureActivityActCode(HearingPlanOfCareProcedureActivityAct hearingPlanOfCareProcedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareProcedureActivityAct.validateProcedureActivityActCode(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(procedureSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionTemplateId(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionCode(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionCodeP(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionTitle(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionText(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionEntryProcedureActivityProcedure(procedureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureSection_validateProcedureSectionEntryProcedureActivityAct(procedureSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateProcedureSectionTemplateId constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionTemplateId(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureSectionCode constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionCode(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureSectionCodeP constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionCodeP(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureSectionTitle constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionTitle(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureSectionText constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionText(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureSectionEntryProcedureActivityProcedure constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionEntryProcedureActivityProcedure(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionEntryProcedureActivityProcedure(diagnostics, context);
	}

    /**
	 * Validates the validateProcedureSectionEntryProcedureActivityAct constraint of '<em>Procedure Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProcedureSection_validateProcedureSectionEntryProcedureActivityAct(ProcedureSection procedureSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return procedureSection.validateProcedureSectionEntryProcedureActivityAct(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionTemplateId(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionCode(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionCodeP(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionTitle(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionText(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryAct(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryEncounter(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryObservation(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryProcedure(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntrySubstanceAdministration(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntrySupply(hearingPlanOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryInstructions(hearingPlanOfCareSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionTemplateId constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionTemplateId(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionTemplateId(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionCode constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionCode(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionCodeP constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionCodeP(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionTitle constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionTitle(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionText constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionText(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntryAct constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryAct(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntryAct(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntryEncounter constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryEncounter(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntryEncounter(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntryObservation constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryObservation(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntryObservation(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntryProcedure constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryProcedure(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntryProcedure(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntrySubstanceAdministration constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntrySubstanceAdministration(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntrySubstanceAdministration(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntrySupply constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntrySupply(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntrySupply(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareSectionEntryInstructions constraint of '<em>Hearing Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareSection_validateHearingPlanOfCareSectionEntryInstructions(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareSection.validateHearingPlanOfCareSectionEntryInstructions(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityAct(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareActivityAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActEffectiveTimeLowHigh(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validatePlanOfCareActivityActTemplateId(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActCodeP(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActCode(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActText(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActStatusCode(hearingPlanOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActEffectiveTime(hearingPlanOfCareActivityAct, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingPlanOfCareActivityActEffectiveTimeLowHigh constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActEffectiveTimeLowHigh(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityAct.validateHearingPlanOfCareActivityActEffectiveTimeLowHigh(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareActivityActCodeP constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActCodeP(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityAct.validateHearingPlanOfCareActivityActCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareActivityActCode constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActCode(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hearingPlanOfCareActivityAct.validateHearingPlanOfCareActivityActCode(diagnostics, context);
	}

				/**
	 * Validates the validateHearingPlanOfCareActivityActText constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActText(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityAct.validateHearingPlanOfCareActivityActText(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareActivityActStatusCode constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActStatusCode(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityAct.validateHearingPlanOfCareActivityActStatusCode(diagnostics, context);
	}

    /**
	 * Validates the validateHearingPlanOfCareActivityActEffectiveTime constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityAct_validateHearingPlanOfCareActivityActEffectiveTime(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityAct.validateHearingPlanOfCareActivityActEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validatePlanOfCareActivityActTemplateId constraint of '<em>Hearing Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityAct_validatePlanOfCareActivityActTemplateId(HearingPlanOfCareActivityAct hearingPlanOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hearingPlanOfCareActivityAct.validatePlanOfCareActivityActTemplateId(diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityEncounter(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hearingPlanOfCareActivityEncounter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterCode(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterCodeP(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterStatusCode(hearingPlanOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterText(hearingPlanOfCareActivityEncounter, diagnostics, context);
		return result;
	}

				/**
	 * Validates the validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh constraint of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityEncounter.validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityEncounterCode constraint of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterCode(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hearingPlanOfCareActivityEncounter.validateHearingPlanOfCareActivityEncounterCode(diagnostics, context);
	}

				/**
	 * Validates the validateHearingPlanOfCareActivityEncounterCodeP constraint of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterCodeP(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityEncounter.validateHearingPlanOfCareActivityEncounterCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityEncounterStatusCode constraint of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterStatusCode(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityEncounter.validateHearingPlanOfCareActivityEncounterStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityEncounterText constraint of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityEncounter_validateHearingPlanOfCareActivityEncounterText(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityEncounter.validateHearingPlanOfCareActivityEncounterText(diagnostics, context);
	}

        /**
	 * Validates the validatePlanOfCareActivityEncounterTemplateId constraint of '<em>Hearing Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hearingPlanOfCareActivityEncounter.validatePlanOfCareActivityEncounterTemplateId(diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityObservation(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hearingPlanOfCareActivityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationCodeP(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationCode(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationEffectiveTime(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationStatusCode(hearingPlanOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationText(hearingPlanOfCareActivityObservation, diagnostics, context);
		return result;
	}

				/**
	 * Validates the validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityObservation.validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityObservationCodeP constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationCodeP(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityObservation.validateHearingPlanOfCareActivityObservationCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityObservationCode constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationCode(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityObservation.validateHearingPlanOfCareActivityObservationCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityObservationEffectiveTime constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationEffectiveTime(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityObservation.validateHearingPlanOfCareActivityObservationEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityObservationStatusCode constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationStatusCode(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityObservation.validateHearingPlanOfCareActivityObservationStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityObservationText constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityObservation_validateHearingPlanOfCareActivityObservationText(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityObservation.validateHearingPlanOfCareActivityObservationText(diagnostics, context);
	}

        /**
	 * Validates the validatePlanOfCareActivityObservationTemplateId constraint of '<em>Hearing Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingPlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(HearingPlanOfCareActivityObservation hearingPlanOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hearingPlanOfCareActivityObservation.validatePlanOfCareActivityObservationTemplateId(diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareActivityProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureEffectiveTimeLowHigh(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureCode(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureCodeP(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureEffectiveTime(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureStatusCode(hearingPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureText(hearingPlanOfCareActivityProcedure, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityProcedureEffectiveTimeLowHigh constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureEffectiveTimeLowHigh(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validateHearingPlanOfCareActivityProcedureEffectiveTimeLowHigh(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityProcedureCode constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureCode(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validateHearingPlanOfCareActivityProcedureCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityProcedureCodeP constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureCodeP(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validateHearingPlanOfCareActivityProcedureCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityProcedureEffectiveTime constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureEffectiveTime(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validateHearingPlanOfCareActivityProcedureEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityProcedureStatusCode constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureStatusCode(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validateHearingPlanOfCareActivityProcedureStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityProcedureText constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validateHearingPlanOfCareActivityProcedureText(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validateHearingPlanOfCareActivityProcedureText(diagnostics, context);
	}

        /**
	 * Validates the validatePlanOfCareActivityProcedureTemplateId constraint of '<em>Hearing Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(HearingPlanOfCareActivityProcedure hearingPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityProcedure.validatePlanOfCareActivityProcedureTemplateId(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationTemplateId(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationCode(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationText(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(hearingPlanOfCareActivitySubstanceAdministration, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationCode constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationText constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationText(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationText(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationConsumable constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationPerformer constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationParticipant constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(diagnostics, context);
	}

        /**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationTemplateId constraint of '<em>Hearing Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationTemplateId(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationTemplateId(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validatePlanOfCareActivitySupplyTemplateId(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyCode(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyText(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(hearingPlanOfCareActivityNonMedicinalSupply, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityNonMedicinalSupplyCode constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyCode(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validateHearingPlanOfCareActivityNonMedicinalSupplyCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityNonMedicinalSupplyText constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyText(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validateHearingPlanOfCareActivityNonMedicinalSupplyText(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(diagnostics, context);
	}

        /**
	 * Validates the validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(diagnostics, context);
	}

        /**
	 * Validates the validatePlanOfCareActivitySupplyTemplateId constraint of '<em>Hearing Plan Of Care Activity Non Medicinal Supply</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupply_validatePlanOfCareActivitySupplyTemplateId(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareActivityNonMedicinalSupply.validatePlanOfCareActivitySupplyTemplateId(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateResultOrganizerTemplateId(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateResultOrganizerClassCode(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateResultOrganizerCodeP(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateResultOrganizerCode(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateHearingScreeningOrganizerComponentLeftEar(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateHearingScreeningOrganizerComponentRightEar(hearingScreeningOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOrganizer_validateHearingScreeningOrganizerComponentResultsOrganizer(hearingScreeningOrganizer, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateResultOrganizerCodeP constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateResultOrganizerCodeP(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateResultOrganizerCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOrganizerComponentLeftEar constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateHearingScreeningOrganizerComponentLeftEar(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateHearingScreeningOrganizerComponentLeftEar(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOrganizerComponentRightEar constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateHearingScreeningOrganizerComponentRightEar(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateHearingScreeningOrganizerComponentRightEar(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOrganizerComponentResultsOrganizer constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateHearingScreeningOrganizerComponentResultsOrganizer(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateHearingScreeningOrganizerComponentResultsOrganizer(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateResultOrganizerTemplateId(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerClassCode constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateResultOrganizerClassCode(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateResultOrganizerClassCode(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerCode constraint of '<em>Hearing Screening Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizer_validateResultOrganizerCode(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningOutcomeObservationLeft, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftTemplateId(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftClassCode(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftMoodCode(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftNegationInd(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftId(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftCodeP(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftCode(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftText(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftStatusCode(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftEffectiveTime(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftValue(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftValueP(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftMethodCodeP(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftMethodCode(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftTargetSiteCode(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftEntryRelationship(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftAuthor(hearingScreeningOutcomeObservationLeft, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftTemplateId constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftTemplateId(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftClassCode constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftClassCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftClassCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftMoodCode constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftMoodCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftMoodCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftNegationInd constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftNegationInd(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftNegationInd(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftId constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftId(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftId(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftCodeP constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftCodeP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftCode constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftText constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftText(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftText(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftStatusCode constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftStatusCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftEffectiveTime constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftEffectiveTime(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftValue constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftValue(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftValue(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftValueP constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftValueP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftValueP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftMethodCodeP constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftMethodCodeP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftMethodCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftMethodCode constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftMethodCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftMethodCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftTargetSiteCode constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftTargetSiteCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftTargetSiteCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftEntryRelationship constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftEntryRelationship(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftEntryRelationship(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationLeftAuthor constraint of '<em>Hearing Screening Outcome Observation Left</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationLeft_validateHearingScreeningOutcomeObservationLeftAuthor(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationLeft.validateHearingScreeningOutcomeObservationLeftAuthor(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(reasonNotScreened, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonNotScreened_validateReasonNotScreenedTemplateId(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonNotScreened_validateReasonNotScreenedClassCode(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonNotScreened_validateReasonNotScreenedMoodCode(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonNotScreened_validateReasonNotScreenedCodeP(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonNotScreened_validateReasonNotScreenedCode(reasonNotScreened, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonNotScreened_validateReasonNotScreenedText(reasonNotScreened, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateReasonNotScreenedTemplateId constraint of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened_validateReasonNotScreenedTemplateId(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return reasonNotScreened.validateReasonNotScreenedTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateReasonNotScreenedClassCode constraint of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened_validateReasonNotScreenedClassCode(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return reasonNotScreened.validateReasonNotScreenedClassCode(diagnostics, context);
	}

        /**
	 * Validates the validateReasonNotScreenedMoodCode constraint of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened_validateReasonNotScreenedMoodCode(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return reasonNotScreened.validateReasonNotScreenedMoodCode(diagnostics, context);
	}

        /**
	 * Validates the validateReasonNotScreenedCodeP constraint of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened_validateReasonNotScreenedCodeP(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return reasonNotScreened.validateReasonNotScreenedCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateReasonNotScreenedCode constraint of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened_validateReasonNotScreenedCode(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return reasonNotScreened.validateReasonNotScreenedCode(diagnostics, context);
	}

        /**
	 * Validates the validateReasonNotScreenedText constraint of '<em>Reason Not Screened</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateReasonNotScreened_validateReasonNotScreenedText(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return reasonNotScreened.validateReasonNotScreenedText(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningOutcomeObservationRight, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightTemplateId(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightClassCode(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightMoodCode(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightNegationInd(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightId(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightCodeP(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightCode(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightText(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightStatusCode(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightStatusCodeP(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightEffectiveTime(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightValue(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightMethodCodeP(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightMethodCode(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightTargetSiteCode(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightEntryRelationship(hearingScreeningOutcomeObservationRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightAuthor(hearingScreeningOutcomeObservationRight, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightTemplateId constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightTemplateId(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightClassCode constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightClassCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightClassCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightMoodCode constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightMoodCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightMoodCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightNegationInd constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightNegationInd(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightNegationInd(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightId constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightId(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightId(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightCodeP constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightCode constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightText constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightText(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightText(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightStatusCode constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightStatusCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightStatusCodeP constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightStatusCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightStatusCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightEffectiveTime constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightEffectiveTime(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightValue constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightValue(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightValue(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightMethodCodeP constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightMethodCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightMethodCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightMethodCode constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightMethodCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightMethodCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightTargetSiteCodeP constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightTargetSiteCode constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightTargetSiteCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightTargetSiteCode(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightEntryRelationship constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightEntryRelationship(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightEntryRelationship(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningOutcomeObservationRightAuthor constraint of '<em>Hearing Screening Outcome Observation Right</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOutcomeObservationRight_validateHearingScreeningOutcomeObservationRightAuthor(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningOutcomeObservationRight.validateHearingScreeningOutcomeObservationRightAuthor(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningResultsOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateResultOrganizerTemplateId(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateResultOrganizerClassCode(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateResultOrganizerCodeP(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateResultOrganizerCode(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateResultOrganizerStatusCodeP(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateResultOrganizerStatusCode(hearingScreeningResultsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultsOrganizer_validateHearingScreeningResultsOrganizerComponentResultObservation(hearingScreeningResultsOrganizer, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateResultOrganizerCodeP constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateResultOrganizerCodeP(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateResultOrganizerCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningResultsOrganizerComponentResultObservation constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateHearingScreeningResultsOrganizerComponentResultObservation(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateHearingScreeningResultsOrganizerComponentResultObservation(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateResultOrganizerTemplateId(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerClassCode constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateResultOrganizerClassCode(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateResultOrganizerClassCode(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerCode constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateResultOrganizerCode(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerStatusCodeP constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateResultOrganizerStatusCodeP(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateResultOrganizerStatusCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Hearing Screening Results Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizer_validateResultOrganizerStatusCode(HearingScreeningResultsOrganizer hearingScreeningResultsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultsOrganizer.validateResultOrganizerStatusCode(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationTemplateId(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationCodeP(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationCode(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationText(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationEffectiveTime(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationValue(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationValueP(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationMethodCodeP(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationMethodCode(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationTargetSiteCodeP(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateResultObservationTargetSiteCode(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateHearingScreeningResultObservationAuthor(hearingScreeningResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningResultObservation_validateHearingScreeningResultObservationPerformer(hearingScreeningResultObservation, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateResultObservationCodeP constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationCodeP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationValueP constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationValueP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationValueP(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationMethodCodeP constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationMethodCodeP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationMethodCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationTargetSiteCodeP constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationTargetSiteCodeP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationTargetSiteCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningResultObservationAuthor constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateHearingScreeningResultObservationAuthor(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateHearingScreeningResultObservationAuthor(diagnostics, context);
	}

        /**
	 * Validates the validateHearingScreeningResultObservationPerformer constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateHearingScreeningResultObservationPerformer(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateHearingScreeningResultObservationPerformer(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationTemplateId(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationCode constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationCode(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationCode(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationText constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationText(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationText(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationEffectiveTime constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationEffectiveTime(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationValue constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationValue(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationValue(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationMethodCode constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationMethodCode(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationMethodCode(diagnostics, context);
	}

        /**
	 * Validates the validateResultObservationTargetSiteCode constraint of '<em>Hearing Screening Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservation_validateResultObservationTargetSiteCode(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningResultObservation.validateResultObservationTargetSiteCode(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(riskIndicatorForHearingLossObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationTemplateId(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationClassCode(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationMoodCode(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationCode(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationText(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationStatusCode(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationStatusCodeP(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationValue(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationId(riskIndicatorForHearingLossObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationEffectiveTime(riskIndicatorForHearingLossObservation, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationTemplateId constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationTemplateId(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationClassCode constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationClassCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationClassCode(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationMoodCode constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationMoodCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationMoodCode(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationCode constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationCode(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationText constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationText(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationText(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationStatusCode constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationStatusCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationStatusCode(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationStatusCodeP constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationStatusCodeP(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationStatusCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationValue constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationValue(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationValue(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationId constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationId(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationId(diagnostics, context);
	}

        /**
	 * Validates the validateRiskIndicatorForHearingLossObservationEffectiveTime constraint of '<em>Risk Indicator For Hearing Loss Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorForHearingLossObservation_validateRiskIndicatorForHearingLossObservationEffectiveTime(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorForHearingLossObservation.validateRiskIndicatorForHearingLossObservationEffectiveTime(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingPlanOfCareInstructions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateInstructionsTemplateId(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateInstructionsCodeP(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateInstructionsCode(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateInstructionsText(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateHearingPlanOfCareInstructionsEffectiveTime(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateInstructionsStatusCodeP(hearingPlanOfCareInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingPlanOfCareInstructions_validateInstructionsStatusCode(hearingPlanOfCareInstructions, diagnostics, context);
		return result;
	}

        /**
	 * Validates the validateHearingPlanOfCareInstructionsEffectiveTime constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateHearingPlanOfCareInstructionsEffectiveTime(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateHearingPlanOfCareInstructionsEffectiveTime(diagnostics, context);
	}

        /**
	 * Validates the validateInstructionsStatusCodeP constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateInstructionsStatusCodeP(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateInstructionsStatusCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateInstructionsTemplateId constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateInstructionsTemplateId(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateInstructionsTemplateId(diagnostics, context);
	}

        /**
	 * Validates the validateInstructionsCodeP constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateInstructionsCodeP(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateInstructionsCodeP(diagnostics, context);
	}

        /**
	 * Validates the validateInstructionsCode constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateInstructionsCode(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateInstructionsCode(diagnostics, context);
	}

        /**
	 * Validates the validateInstructionsText constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateInstructionsText(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateInstructionsText(diagnostics, context);
	}

        /**
	 * Validates the validateInstructionsStatusCode constraint of '<em>Hearing Plan Of Care Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareInstructions_validateInstructionsStatusCode(HearingPlanOfCareInstructions hearingPlanOfCareInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingPlanOfCareInstructions.validateInstructionsStatusCode(diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningSection_validateResultsSectionEntriesOptionalTemplateId(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningSection_validateHearingScreeningSectionCodeP(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningSection_validateHearingScreeningSectionCode(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningSection_validateHearingScreeningSectionText(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningSection_validateHearingScreeningSectionTitle(hearingScreeningSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningSection_validateHearingScreeningSectionEntry(hearingScreeningSection, diagnostics, context);
		return result;
	}

    /**
	 * Validates the validateHearingScreeningSectionCode constraint of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection_validateHearingScreeningSectionCode(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningSection.validateHearingScreeningSectionCode(diagnostics, context);
	}

    /**
	 * Validates the validateHearingScreeningSectionCodeP constraint of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection_validateHearingScreeningSectionCodeP(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningSection.validateHearingScreeningSectionCodeP(diagnostics, context);
	}

    /**
	 * Validates the validateHearingScreeningSectionText constraint of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection_validateHearingScreeningSectionText(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningSection.validateHearingScreeningSectionText(diagnostics, context);
	}

    /**
	 * Validates the validateHearingScreeningSectionTitle constraint of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection_validateHearingScreeningSectionTitle(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningSection.validateHearingScreeningSectionTitle(diagnostics, context);
	}

    /**
	 * Validates the validateHearingScreeningSectionEntry constraint of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection_validateHearingScreeningSectionEntry(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningSection.validateHearingScreeningSectionEntry(diagnostics, context);
	}

    /**
	 * Validates the validateResultsSectionEntriesOptionalTemplateId constraint of '<em>Hearing Screening Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSection_validateResultsSectionEntriesOptionalTemplateId(HearingScreeningSection hearingScreeningSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningSection.validateResultsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

    /**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return HPOCPlugin.INSTANCE;
	}

} //HPOCValidator
