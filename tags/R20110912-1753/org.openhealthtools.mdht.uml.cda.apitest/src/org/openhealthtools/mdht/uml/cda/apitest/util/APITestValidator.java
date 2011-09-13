/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.AgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.Comment;
import org.openhealthtools.mdht.uml.cda.apitest.Condition;
import org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.Condition_TreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.apitest.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.PatientSummary;
import org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.Severity;
import org.openhealthtools.mdht.uml.cda.apitest.StatusObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.apitest.APITestPackage
 * @generated
 */
public class APITestValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final APITestValidator INSTANCE = new APITestValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.apitest";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation No Additional Participants' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Has Text Reference' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Class Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Mood Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE = 5;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Text' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEXT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Relationship Required' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_ENTRY_RELATIONSHIP_REQUIRED = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Subject Of Target' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_SUBJECT_OF_TARGET = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Contains Problem Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONTAINS_PROBLEM_OBSERVATION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Contains Alert Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONTAINS_ALERT_OBSERVATION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Contains Patient Awareness' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONTAINS_PATIENT_AWARENESS = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time Low High' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME_LOW_HIGH = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Treatment Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Class Code' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CLASS_CODE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Mood Code' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_MOOD_CODE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Code Null Flavor' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CODE_NULL_FLAVOR = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Episode Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EPISODE_OBSERVATION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Treating Provider' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TREATING_PROVIDER = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treating Provider Id' of 'Condition Treating Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_TREATING_PROVIDER__TREATING_PROVIDER_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation One Entry Relationship SUBJ' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Exists Entry Relationship SAS' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Value' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_VALUE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Information Source' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_INFORMATION_SOURCE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Contains Patient Awareness' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Text Reference' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_TEXT_REFERENCE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Comment Inversion Ind' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_COMMENT_INVERSION_IND = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Onset Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Unknown Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Template Id' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Mood Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_MOOD_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Id' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Text' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_TEXT = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Status Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_STATUS_CODE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Effective Time' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Value' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_VALUE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Age Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Severity' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_SEVERITY = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Problem Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Health Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Comment' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_COMMENT = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Cause Of Death Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Related Subject Birth Time' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Template Id' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_TEMPLATE_ID = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Class Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CLASS_CODE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Mood Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_MOOD_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Status Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_STATUS_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Value' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_VALUE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Has Text Reference' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_HAS_TEXT_REFERENCE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Template Id' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEMPLATE_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Class Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_CLASS_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Mood Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_MOOD_CODE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_CODE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Text' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEXT = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Status Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_STATUS_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Value' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_VALUE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Code' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_CODE = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Code' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_CODE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Has Text Reference' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_HAS_TEXT_REFERENCE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Effective Time When Author Present' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEMPLATE_ID = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Class Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CLASS_CODE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Mood Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_MOOD_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CODE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Text' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEXT = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Status Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_STATUS_CODE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Problem List Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Status Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Code' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CODE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Title' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TITLE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Text' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEXT = 90;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 91;

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
	public APITestValidator() {
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
		return APITestPackage.eINSTANCE;
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
			case APITestPackage.STATUS_OBSERVATION:
				return validateStatusObservation((StatusObservation) value, diagnostics, context);
			case APITestPackage.CONDITION:
				return validateCondition((Condition) value, diagnostics, context);
			case APITestPackage.CONDITION_TREATING_PROVIDER:
				return validateCondition_TreatingProvider((Condition_TreatingProvider) value, diagnostics, context);
			case APITestPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation) value, diagnostics, context);
			case APITestPackage.CONDITION_ENTRY:
				return validateConditionEntry((ConditionEntry) value, diagnostics, context);
			case APITestPackage.AGE_OBSERVATION:
				return validateAgeObservation((AgeObservation) value, diagnostics, context);
			case APITestPackage.SEVERITY:
				return validateSeverity((Severity) value, diagnostics, context);
			case APITestPackage.PROBLEM_STATUS_OBSERVATION:
				return validateProblemStatusObservation((ProblemStatusObservation) value, diagnostics, context);
			case APITestPackage.HEALTH_STATUS_OBSERVATION:
				return validateHealthStatusObservation((HealthStatusObservation) value, diagnostics, context);
			case APITestPackage.COMMENT:
				return validateComment((Comment) value, diagnostics, context);
			case APITestPackage.CAUSE_OF_DEATH_OBSERVATION:
				return validateCauseOfDeathObservation((CauseOfDeathObservation) value, diagnostics, context);
			case APITestPackage.FAMILY_HISTORY_OBSERVATION:
				return validateFamilyHistoryObservation((FamilyHistoryObservation) value, diagnostics, context);
			case APITestPackage.PROBLEM_LIST_SECTION:
				return validateProblemListSection((ProblemListSection) value, diagnostics, context);
			case APITestPackage.PATIENT_SUMMARY:
				return validatePatientSummary((PatientSummary) value, diagnostics, context);
			case APITestPackage.GENERAL_HEADER_CONSTRAINTS:
				return validateGeneralHeaderConstraints((GeneralHeaderConstraints) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation(StatusObservation statusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(statusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationHasTextReference(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationTemplateId(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationText(statusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationNoAdditionalParticipants constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
			StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationNoAdditionalParticipants(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationHasTextReference constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationHasTextReference(
			StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationTemplateId(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationClassCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationClassCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationMoodCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationMoodCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationStatusCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationStatusCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationValue(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationText constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationText(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEntryRelationshipRequired(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionSubjectOfTarget(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionContainsProblemObservation(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionContainsAlertObservation(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionContainsPatientAwareness(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEffectiveTimeLowHigh(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionHasProviderTreatmentTime(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionTemplateId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionClassCode(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionMoodCode(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionCodeNullFlavor(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEffectiveTime(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEpisodeObservation(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionTreatingProvider(condition, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConditionEntryRelationshipRequired constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEntryRelationshipRequired(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEntryRelationshipRequired(diagnostics, context);
	}

	/**
	 * Validates the validateConditionSubjectOfTarget constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionSubjectOfTarget(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionSubjectOfTarget(diagnostics, context);
	}

	/**
	 * Validates the validateConditionContainsProblemObservation constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionContainsProblemObservation(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionContainsProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionContainsAlertObservation constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionContainsAlertObservation(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionContainsAlertObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionContainsPatientAwareness constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionContainsPatientAwareness(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEffectiveTimeLowHigh constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTimeLowHigh(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEffectiveTimeLowHigh(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasProviderTreatmentTime constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasProviderTreatmentTime(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasProviderTreatmentTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionTemplateId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionTemplateId(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionClassCode constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionClassCode(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionMoodCode constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionMoodCode(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionId(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionCodeNullFlavor constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionCodeNullFlavor(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionCodeNullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEffectiveTime constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTime(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEpisodeObservation constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEpisodeObservation(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEpisodeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionTreatingProvider constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionTreatingProvider(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionTreatingProvider(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_TreatingProvider(Condition_TreatingProvider condition_TreatingProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition_TreatingProvider, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(condition_TreatingProvider, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateAssignedEntity_validateClassCode(
				condition_TreatingProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_TreatingProvider_validateTreatingProviderId(
				condition_TreatingProvider, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTreatingProviderId constraint of '<em>Condition Treating Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_TreatingProvider_validateTreatingProviderId(
			Condition_TreatingProvider condition_TreatingProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition_TreatingProvider.validateTreatingProviderId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation(EpisodeObservation episodeObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(episodeObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationOneEntryRelationshipSUBJ(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationExistsEntryRelationshipSAS(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationTemplateId(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationClassCode(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationMoodCode(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationCode(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationStatusCode(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationValue(
				episodeObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEpisodeObservationOneEntryRelationshipSUBJ constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationOneEntryRelationshipSUBJ(
			EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationOneEntryRelationshipSUBJ(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationExistsEntryRelationshipSAS constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationExistsEntryRelationshipSAS(
			EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationExistsEntryRelationshipSAS(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationTemplateId constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationTemplateId(
			EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationClassCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationClassCode(
			EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationMoodCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationMoodCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationStatusCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationStatusCode(
			EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationValue constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationValue(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionEntry, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryInformationSource(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryContainsPatientAwareness(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryHasTextReference(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryCommentInversionInd(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryHasOnsetDate(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryHasResolutionDate(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryHasUnknownResolutionDate(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryTemplateId(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryMoodCode(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryId(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryCode(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryText(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryStatusCode(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryEffectiveTime(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryValue(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryAgeObservation(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntrySeverity(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryProblemStatusObservation(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryHealthStatusObservation(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryComment(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryCauseOfDeathObservation(
				conditionEntry, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConditionEntryInformationSource constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryInformationSource(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryContainsPatientAwareness constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryContainsPatientAwareness(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasTextReference constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasTextReference(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryCommentInversionInd constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCommentInversionInd(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCommentInversionInd(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasOnsetDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasOnsetDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasOnsetDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasResolutionDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasResolutionDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasResolutionDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasUnknownResolutionDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasUnknownResolutionDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasUnknownResolutionDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryTemplateId constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryTemplateId(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryMoodCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryMoodCode(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryId constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryId(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCode(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryText constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryText(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryText(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryStatusCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryStatusCode(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryEffectiveTime constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryEffectiveTime(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryValue constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryValue(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryValue(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryAgeObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryAgeObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntrySeverity constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntrySeverity(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntrySeverity(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryProblemStatusObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryProblemStatusObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryProblemStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHealthStatusObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHealthStatusObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHealthStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryComment constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryComment(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryComment(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryCauseOfDeathObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCauseOfDeathObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCauseOfDeathObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation(AgeObservation ageObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ageObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(ageObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationRelatedSubjectBirthTime(
				ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationTemplateId(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationClassCode(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationMoodCode(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationCode(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationStatusCode(ageObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAgeObservation_validateAgeObservationValue(ageObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAgeObservationRelatedSubjectBirthTime constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationRelatedSubjectBirthTime(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationRelatedSubjectBirthTime(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationTemplateId constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationTemplateId(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationClassCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationClassCode(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationMoodCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationMoodCode(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationCode(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationStatusCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationStatusCode(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationValue constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationValue(AgeObservation ageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(severity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(severity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityHasTextReference(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityTemplateId(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityClassCode(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityMoodCode(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityCode(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityText(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityStatusCode(severity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverity_validateSeverityValue(severity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSeverityHasTextReference constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityHasTextReference(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityTemplateId constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityTemplateId(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityClassCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityClassCode(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityMoodCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityMoodCode(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityCode(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityText constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityText(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityText(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityStatusCode constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityStatusCode(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityValue constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityValue(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation(ProblemStatusObservation problemStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationHasTextReference(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateStatusObservationTemplateId(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateStatusObservationValue(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationText(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationCode(
				problemStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemStatusObservationCode constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationCode(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateStatusObservationTemplateId(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateStatusObservationValue(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationHasTextReference(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateStatusObservationTemplateId(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateStatusObservationValue(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationText(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationCode(
				healthStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHealthStatusObservationCode constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationCode(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateStatusObservationTemplateId(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateStatusObservationValue(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentHasTextReference(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentEffectiveTimeWhenAuthorPresent(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentTemplateId(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentClassCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentMoodCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentText(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateCommentStatusCode(comment, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCommentHasTextReference constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentHasTextReference(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateCommentEffectiveTimeWhenAuthorPresent constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentEffectiveTimeWhenAuthorPresent(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentEffectiveTimeWhenAuthorPresent(diagnostics, context);
	}

	/**
	 * Validates the validateCommentTemplateId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentTemplateId(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCommentClassCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentClassCode(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentMoodCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentMoodCode(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentCode(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentText constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentText(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentText(diagnostics, context);
	}

	/**
	 * Validates the validateCommentStatusCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentStatusCode(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservation(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(causeOfDeathObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCauseOfDeathObservation_validateFamilyHistoryObservationTemplateId(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationId(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(
				causeOfDeathObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryObservationTemplateId constraint of '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservation_validateFamilyHistoryObservationTemplateId(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return causeOfDeathObservation.validateFamilyHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation(FamilyHistoryObservation familyHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationTemplateId(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationId(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(
				familyHistoryObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryObservationTemplateId constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationTemplateId(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationId constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationId(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationStatusCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection(ProblemListSection problemListSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemListSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemListSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionTemplateId(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionCode(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionTitle(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionText(
				problemListSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemListSectionTemplateId constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionTemplateId(
			ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionCode constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionCode(ProblemListSection problemListSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionTitle constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionTitle(ProblemListSection problemListSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionText constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionText(ProblemListSection problemListSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientSummary, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(patientSummary, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryProblemListSection(
				patientSummary, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePatientSummaryProblemListSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryProblemListSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryProblemListSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalHeaderConstraints, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				generalHeaderConstraints, diagnostics, context);
		}
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return APITestPlugin.INSTANCE;
	}

} // APITestValidator
