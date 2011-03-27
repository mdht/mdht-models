/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.Severity;
import org.openhealthtools.mdht.uml.cda.consol.StatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public class ConsolValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConsolValidator INSTANCE = new ConsolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.consol";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation No Additional Participants' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Class Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Mood Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Status Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Relationship Required' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_ENTRY_RELATIONSHIP_REQUIRED = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Subject Of Target' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_SUBJECT_OF_TARGET = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Contains Problem Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONTAINS_PROBLEM_OBSERVATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Contains Alert Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONTAINS_ALERT_OBSERVATION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Contains Patient Awareness' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONTAINS_PATIENT_AWARENESS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time Low High' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME_LOW_HIGH = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Treating Provider' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_TREATING_PROVIDER = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Treatment Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Class Code' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CLASS_CODE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Mood Code' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_MOOD_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Code Null Flavor' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CODE_NULL_FLAVOR = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Episode Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EPISODE_OBSERVATION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation One Entry Relationship SUBJ' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Exists Entry Relationship SAS' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Value' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_VALUE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Information Source' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_INFORMATION_SOURCE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Contains Patient Awareness' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Text Reference' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_TEXT_REFERENCE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Comment Inversion Ind' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_COMMENT_INVERSION_IND = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Onset Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Unknown Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Template Id' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_TEMPLATE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Mood Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_MOOD_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Id' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Text' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_TEXT = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Status Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_STATUS_CODE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Effective Time' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Value' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_VALUE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Age Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Severity' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_SEVERITY = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Problem Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Health Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Comment' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_COMMENT = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Related Subject Birth Time' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Template Id' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_TEMPLATE_ID = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Class Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CLASS_CODE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Mood Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_MOOD_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CODE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Status Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_STATUS_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Value' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_VALUE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Has Text Reference' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_HAS_TEXT_REFERENCE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Template Id' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Class Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_CLASS_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Mood Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_MOOD_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Text' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEXT = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Status Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_STATUS_CODE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Value' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_VALUE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Has Text Reference' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Text' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_TEXT = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Has Text Reference' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Text' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEXT = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Code' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Has Text Reference' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_HAS_TEXT_REFERENCE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Effective Time When Author Present' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Class Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CLASS_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Mood Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_MOOD_CODE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CODE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Text' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEXT = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Status Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_STATUS_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Code' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CODE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Title' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TITLE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Text' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEXT = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Template Id' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Code' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_CODE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Result Organizer' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section External Reference' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Component Element' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_COMPONENT_ELEMENT = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Information Source' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_INFORMATION_SOURCE = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Mood Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_MOOD_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_ID = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Reference Range Required' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_REFERENCE_RANGE_REQUIRED = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result No Observation Range Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_NO_OBSERVATION_RANGE_CODE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Information Source' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_INFORMATION_SOURCE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value Presence' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE_PRESENCE = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Template Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Mood Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_MOOD_CODE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_ID = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Status Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_STATUS_CODE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Effective Time' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_EFFECTIVE_TIME = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Interpretation Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_INTERPRETATION_CODE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Method Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_METHOD_CODE = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Template Id' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEMPLATE_ID = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Class Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_CLASS_CODE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Mood Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_MOOD_CODE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Sign Entry' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Code' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Title' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TITLE = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Text' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Signs Organizer' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Information Source' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Require Results Organizer Template ID' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Class Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_CLASS_CODE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Effective Time' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_ID = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_CODE = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Interpretation Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_INTERPRETATION_CODE = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Method Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_METHOD_CODE = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Target Site Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_TARGET_SITE_CODE = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Value' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_VALUE = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Template Id' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__RESULT_TEMPLATE_ID = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__RESULT_CODE = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Person Has Name' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Roles Shall Have Addr And Telecom' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Roles Should Have Addr And Telecom' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Organizations Have Contact Info' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Day' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Year' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Telephone Matches Regex' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Telephone Dialing Digits' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Unknown Telephone Uses Null Flavor' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id Extension' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Oid Length' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_OID_LENGTH = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Set Id And Version Number' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Set Id And Id Are Unique' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Copy Time Not Present' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Record Target Patient Role' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Patient Birth Time' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Administrative Gender Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Provider Organization' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Author Time' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Assigned Author Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Assigned Author Person Or Device' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Data Enterer Assigned Person' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Data Enterer Time' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Informant' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Informant Assigned Person Or Related Person' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Legal Authenticator Has Assigned Person' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Authenticator Has Assigned Person' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Second' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Year And Day' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Realm Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Title' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Effective Time' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Language Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE = 171;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 171;

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
	public ConsolValidator() {
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
	protected EPackage getEPackage() {
	  return ConsolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ConsolPackage.STATUS_OBSERVATION:
				return validateStatusObservation((StatusObservation)value, diagnostics, context);
			case ConsolPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case ConsolPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation)value, diagnostics, context);
			case ConsolPackage.CONDITION_ENTRY:
				return validateConditionEntry((ConditionEntry)value, diagnostics, context);
			case ConsolPackage.AGE_OBSERVATION:
				return validateAgeObservation((AgeObservation)value, diagnostics, context);
			case ConsolPackage.SEVERITY:
				return validateSeverity((Severity)value, diagnostics, context);
			case ConsolPackage.PROBLEM_STATUS_OBSERVATION:
				return validateProblemStatusObservation((ProblemStatusObservation)value, diagnostics, context);
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return validateHealthStatusObservation((HealthStatusObservation)value, diagnostics, context);
			case ConsolPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case ConsolPackage.PROBLEM_LIST_SECTION:
				return validateProblemListSection((ProblemListSection)value, diagnostics, context);
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION:
				return validateDiagnosticResultsSection((DiagnosticResultsSection)value, diagnostics, context);
			case ConsolPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
			case ConsolPackage.RESULT:
				return validateResult((Result)value, diagnostics, context);
			case ConsolPackage.EXTERNAL_REFERENCE:
				return validateExternalReference((ExternalReference)value, diagnostics, context);
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer)value, diagnostics, context);
			case ConsolPackage.VITAL_SIGN:
				return validateVitalSign((VitalSign)value, diagnostics, context);
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS:
				return validateGeneralHeaderConstraints((GeneralHeaderConstraints)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(statusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationTemplateId(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(statusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationNoAdditionalParticipants constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationNoAdditionalParticipants(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationNoAdditionalParticipants(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationTemplateId(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationClassCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationClassCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationMoodCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationMoodCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationStatusCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationStatusCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationValue(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionEntryRelationshipRequired(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionSubjectOfTarget(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionContainsProblemObservation(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionContainsAlertObservation(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionContainsPatientAwareness(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionEffectiveTimeLowHigh(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionHasTreatingProvider(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionHasProviderId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionHasProviderTreatmentTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionClassCode(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionMoodCode(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionCodeNullFlavor(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionEffectiveTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionEpisodeObservation(condition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionEntryRelationshipRequired constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEntryRelationshipRequired(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEntryRelationshipRequired(diagnostics, context);
	}

	/**
	 * Validates the validateConditionSubjectOfTarget constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionSubjectOfTarget(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionSubjectOfTarget(diagnostics, context);
	}

	/**
	 * Validates the validateConditionContainsProblemObservation constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionContainsProblemObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionContainsProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionContainsAlertObservation constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionContainsAlertObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionContainsAlertObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionContainsPatientAwareness constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionContainsPatientAwareness(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEffectiveTimeLowHigh constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTimeLowHigh(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEffectiveTimeLowHigh(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasTreatingProvider constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasTreatingProvider(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasTreatingProvider(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasProviderId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasProviderId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasProviderId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasProviderTreatmentTime constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasProviderTreatmentTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasProviderTreatmentTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionTemplateId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionTemplateId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionClassCode constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionClassCode(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionMoodCode constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionMoodCode(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionCodeNullFlavor constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionCodeNullFlavor(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionCodeNullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEffectiveTime constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEpisodeObservation constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEpisodeObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEpisodeObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(episodeObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationOneEntryRelationshipSUBJ(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationExistsEntryRelationshipSAS(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationTemplateId(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationClassCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationMoodCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationStatusCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationValue(episodeObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEpisodeObservationOneEntryRelationshipSUBJ constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationOneEntryRelationshipSUBJ(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationExistsEntryRelationshipSAS constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationExistsEntryRelationshipSAS(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationTemplateId constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationTemplateId(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationClassCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationClassCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationMoodCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationMoodCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationStatusCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationStatusCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationValue constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationValue(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryInformationSource(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryContainsPatientAwareness(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasTextReference(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryCommentInversionInd(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasOnsetDate(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasResolutionDate(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasUnknownResolutionDate(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryTemplateId(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryMoodCode(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryId(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryCode(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryText(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryStatusCode(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryEffectiveTime(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryValue(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryAgeObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntrySeverity(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryProblemStatusObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHealthStatusObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryComment(conditionEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionEntryInformationSource constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryInformationSource(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryContainsPatientAwareness constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryContainsPatientAwareness(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasTextReference constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasTextReference(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryCommentInversionInd constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCommentInversionInd(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCommentInversionInd(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasOnsetDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasOnsetDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasOnsetDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasResolutionDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasResolutionDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasResolutionDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasUnknownResolutionDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasUnknownResolutionDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasUnknownResolutionDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryTemplateId constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryTemplateId(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryMoodCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryMoodCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryId constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryId(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryText constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryText(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryText(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryStatusCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryStatusCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryEffectiveTime constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryEffectiveTime(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryValue constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryValue(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryValue(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryAgeObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryAgeObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntrySeverity constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntrySeverity(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntrySeverity(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryProblemStatusObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryProblemStatusObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryProblemStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHealthStatusObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHealthStatusObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHealthStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryComment constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryComment(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryComment(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ageObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationRelatedSubjectBirthTime(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationTemplateId(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationClassCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationMoodCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationStatusCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationValue(ageObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAgeObservationRelatedSubjectBirthTime constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationRelatedSubjectBirthTime(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationRelatedSubjectBirthTime(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationTemplateId constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationTemplateId(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationClassCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationClassCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationMoodCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationMoodCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationStatusCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationStatusCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationValue constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationValue(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(severity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityHasTextReference(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityTemplateId(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityClassCode(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityMoodCode(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityCode(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityText(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityStatusCode(severity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverity_validateSeverityValue(severity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSeverityHasTextReference constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityHasTextReference(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityTemplateId constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityTemplateId(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityClassCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityClassCode(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityMoodCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityMoodCode(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityCode(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityText constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityText(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityText(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityStatusCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityStatusCode(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityValue constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityValue(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severity.validateSeverityValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatusObservation_validateStatusObservationTemplateId(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatusObservation_validateStatusObservationValue(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatusObservation_validateProblemStatusObservationHasTextReference(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatusObservation_validateProblemStatusObservationText(problemStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemStatusObservationHasTextReference constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationHasTextReference(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationText constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationText(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationText(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateStatusObservationTemplateId(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(problemStatusObservation, context) },
						 new Object[] { problemStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(problemStatusObservation, diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateStatusObservationValue(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationValue", getObjectLabel(problemStatusObservation, context) },
						 new Object[] { problemStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationValue(problemStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation(HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthStatusObservation_validateStatusObservationTemplateId(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthStatusObservation_validateStatusObservationCode(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthStatusObservation_validateStatusObservationValue(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthStatusObservation_validateHealthStatusObservationHasTextReference(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthStatusObservation_validateHealthStatusObservationText(healthStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHealthStatusObservationHasTextReference constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationHasTextReference(HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationText constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationText(HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationText(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateStatusObservationTemplateId(HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(healthStatusObservation, context) },
						 new Object[] { healthStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(healthStatusObservation, diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationCode constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateStatusObservationCode(HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationCode", getObjectLabel(healthStatusObservation, context) },
						 new Object[] { healthStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationCode(healthStatusObservation, diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateStatusObservationValue(HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationValue", getObjectLabel(healthStatusObservation, context) },
						 new Object[] { healthStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationValue(healthStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentHasTextReference(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentEffectiveTimeWhenAuthorPresent(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentTemplateId(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentClassCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentMoodCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentText(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentStatusCode(comment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCommentHasTextReference constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentHasTextReference(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateCommentEffectiveTimeWhenAuthorPresent constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentEffectiveTimeWhenAuthorPresent(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentEffectiveTimeWhenAuthorPresent(diagnostics, context);
	}

	/**
	 * Validates the validateCommentTemplateId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentTemplateId(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCommentClassCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentClassCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentMoodCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentMoodCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentText constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentText(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentText(diagnostics, context);
	}

	/**
	 * Validates the validateCommentStatusCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentStatusCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemListSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_validateProblemListSectionTemplateId(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_validateProblemListSectionCode(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_validateProblemListSectionTitle(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_validateProblemListSectionText(problemListSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemListSectionTemplateId constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionTemplateId(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionCode constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionCode(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionTitle constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionTitle(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionText constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionText(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diagnosticResultsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionCode(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionResultOrganizer(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionExternalReference(diagnosticResultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDiagnosticResultsSectionTemplateId constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionCode constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionCode(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionResultOrganizer constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionExternalReference constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionExternalReference(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionExternalReference(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerComponentElement(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerInformationSource(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultOrganizerComponentElement constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerComponentElement(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerComponentElement(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerInformationSource constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerInformationSource(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerTemplateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerMoodCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerMoodCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerStatusCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateResult(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(result, diagnostics, context)) return false;
		boolean theResult = validate_EveryMultiplicityConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryDataValueConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryReferenceIsContained(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryProxyResolves(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_UniqueID(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryKeyUnique(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryMapEntryUnique(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultReferenceRangeRequired(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultNoObservationRangeCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultInformationSource(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultValuePresence(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultTemplateId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultMoodCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultStatusCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultEffectiveTime(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultValue(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultInterpretationCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultMethodCode(result, diagnostics, context);
		return theResult;
	}

	/**
	 * Validates the validateResultReferenceRangeRequired constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultReferenceRangeRequired(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultReferenceRangeRequired(diagnostics, context);
	}

	/**
	 * Validates the validateResultNoObservationRangeCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultNoObservationRangeCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultNoObservationRangeCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultInformationSource constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultInformationSource(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultValuePresence constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultValuePresence(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultValuePresence(diagnostics, context);
	}

	/**
	 * Validates the validateResultTemplateId constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultTemplateId(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultMoodCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultMoodCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultId constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultId(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultId(diagnostics, context);
	}

	/**
	 * Validates the validateResultCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultStatusCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultStatusCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultEffectiveTime constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultEffectiveTime(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateResultValue constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultValue(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultInterpretationCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultInterpretationCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultMethodCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultMethodCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultMethodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference(ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalReference_validateExternalReferenceTemplateId(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalReference_validateExternalReferenceClassCode(externalReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalReference_validateExternalReferenceMoodCode(externalReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateExternalReferenceTemplateId constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceTemplateId(ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceClassCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceClassCode(ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceMoodCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceMoodCode(ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignEntry(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionTitle(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionText(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignsSectionVitalSignEntry constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionVitalSignEntry(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionVitalSignEntry(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionCode constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionCode(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionTitle constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionTitle(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionText constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionText(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionVitalSignsOrganizer constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionVitalSignsOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerComponentElement(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateResultOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerMoodCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateResultOrganizerStatusCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerClassCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerEffectiveTime(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerId(vitalSignsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignsOrganizerInformationSource constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerRequireResultsOrganizerTemplateID constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerClassCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerClassCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerEffectiveTime constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultOrganizerTemplateId", getObjectLabel(vitalSignsOrganizer, context) },
						 new Object[] { vitalSignsOrganizer },
						 context));
			}
			return false;
		}
		return validateResultOrganizer_validateResultOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultOrganizerCode", getObjectLabel(vitalSignsOrganizer, context) },
						 new Object[] { vitalSignsOrganizer },
						 context));
			}
			return false;
		}
		return validateResultOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerStatusCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultOrganizerStatusCode", getObjectLabel(vitalSignsOrganizer, context) },
						 new Object[] { vitalSignsOrganizer },
						 context));
			}
			return false;
		}
		return validateResultOrganizer_validateResultOrganizerStatusCode(vitalSignsOrganizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSign, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultReferenceRangeRequired(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultNoObservationRangeCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultInformationSource(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultValuePresence(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateResultTemplateId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultMoodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateResultCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultStatusCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultEffectiveTime(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultValue(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultInterpretationCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateResult_validateResultMethodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateVitalSignInterpretationCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateVitalSignMethodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateVitalSignTargetSiteCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateVitalSignValue(vitalSign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignInterpretationCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignInterpretationCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.validateVitalSignInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignMethodCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignMethodCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.validateVitalSignMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignTargetSiteCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignTargetSiteCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.validateVitalSignTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignValue constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignValue(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.validateVitalSignValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultTemplateId constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateResultTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultTemplateId", getObjectLabel(vitalSign, context) },
						 new Object[] { vitalSign },
						 context));
			}
			return false;
		}
		return validateResult_validateResultTemplateId(vitalSign, diagnostics, context);
	}

	/**
	 * Validates the validateResultCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateResultCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultCode", getObjectLabel(vitalSign, context) },
						 new Object[] { vitalSign },
						 context));
			}
			return false;
		}
		return validateResult_validateResultCode(vitalSign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalHeaderConstraints, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(generalHeaderConstraints, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsPersonHasName constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsPersonHasName(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsOrganizationsHaveContactInfo constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToDay constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToDay(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToYear constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToYear(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTelephoneMatchesRegex constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTelephoneMatchesRegex(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasTelephoneDialingDigits constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasTelephoneDialingDigits(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTypeIdExtension constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeIdExtension(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsOidLength constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsOidLength(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsSetIdAndVersionNumber constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsSetIdAndVersionNumber(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsSetIdAndIdAreUnique constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsSetIdAndIdAreUnique(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCopyTimeNotPresent constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsCopyTimeNotPresent(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasRecordTargetPatientRole constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasRecordTargetPatientRole(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasPatientBirthTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasPatientBirthTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAdministrativeGenderCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasProviderOrganization constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasProviderOrganization(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAuthorTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAuthorTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAssignedAuthorId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasDataEntererAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasDataEntererTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasInformant constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformant(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToSecond constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToSecond(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToYearAndDay constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToYearAndDay(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRealmCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRealmCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTypeId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTitle constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTitle(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsEffectiveTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsLanguageCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsLanguageCode(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConsolPlugin.INSTANCE;
	}

} //ConsolValidator
