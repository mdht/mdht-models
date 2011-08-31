/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.Map;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Medication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.Severity;
import org.openhealthtools.mdht.uml.cda.consol.StatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsNarrativeSection;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time Low' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME_LOW = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time High' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME_HIGH = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time High Prohibited' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME_HIGH_PROHIBITED = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Class Code' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CLASS_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Mood Code' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_MOOD_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Code Null Flavor' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CODE_NULL_FLAVOR = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Effective Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EFFECTIVE_TIME = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Episode Observation' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_EPISODE_OBSERVATION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Condition Entry' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONDITION_ENTRY = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Text Reference' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_TEXT_REFERENCE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Onset Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Unknown Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Template Id' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Class Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CLASS_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Mood Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_MOOD_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Id' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Text' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_TEXT = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Status Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_STATUS_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Effective Time' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Value' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_VALUE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Age Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Problem Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Health Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Template Id' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Class Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CLASS_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Mood Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_MOOD_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Status Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_STATUS_CODE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Value' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_VALUE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Has Text Reference' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_HAS_TEXT_REFERENCE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Template Id' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Class Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_CLASS_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Mood Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_MOOD_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Text' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEXT = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Status Code' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_STATUS_CODE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Value' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_VALUE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Has Text Reference' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation No Additional Participants' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Template Id' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Class Code' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_CLASS_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Mood Code' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_MOOD_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Code' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Status Code' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_STATUS_CODE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Value' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_VALUE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Status Observation Text' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_TEXT = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Has Text Reference' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation No Additional Participants' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Template Id' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Class Code' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_CLASS_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Mood Code' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_MOOD_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Code' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_CODE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Status Code' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_STATUS_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Value' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_VALUE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Text' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEXT = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Has Text Reference' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_HAS_TEXT_REFERENCE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Effective Time When Author Present' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEMPLATE_ID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Class Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CLASS_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Mood Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_MOOD_CODE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CODE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Text' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEXT = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Status Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_STATUS_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Condition' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CONDITION = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Narrative Section Template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Narrative Section Template Id' of 'Problem List Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Narrative Section Code' of 'Problem List Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Narrative Section Title' of 'Problem List Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TITLE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Narrative Section Text' of 'Problem List Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TEXT = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Result Organizer' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section External Reference' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Narrative Section Template Id' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Narrative Section Template Id' of 'Diagnostic Results Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_NARRATIVE_SECTION__DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Narrative Section Code' of 'Diagnostic Results Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_NARRATIVE_SECTION__DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Component Element' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_COMPONENT_ELEMENT = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Information Source' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_INFORMATION_SOURCE = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Mood Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_MOOD_CODE = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_ID = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Reference Range Required' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_REFERENCE_RANGE_REQUIRED = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result No Observation Range Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_NO_OBSERVATION_RANGE_CODE = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Information Source' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_INFORMATION_SOURCE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value Presence' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE_PRESENCE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Template Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_TEMPLATE_ID = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Mood Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_MOOD_CODE = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_ID = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_CODE = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Status Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_STATUS_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Effective Time' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_EFFECTIVE_TIME = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Interpretation Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_INTERPRETATION_CODE = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Method Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_METHOD_CODE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Template Id' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEMPLATE_ID = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Class Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_CLASS_CODE = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Mood Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_MOOD_CODE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Signs Organizer' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Narrative Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_NARRATIVE_SECTION_TEMPLATE_ID = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Narrative Section Template Id' of 'Vital Signs Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_NARRATIVE_SECTION__VITAL_SIGNS_NARRATIVE_SECTION_TEMPLATE_ID = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Narrative Section Code' of 'Vital Signs Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_NARRATIVE_SECTION__VITAL_SIGNS_NARRATIVE_SECTION_CODE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Narrative Section Title' of 'Vital Signs Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_NARRATIVE_SECTION__VITAL_SIGNS_NARRATIVE_SECTION_TITLE = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Narrative Section Text' of 'Vital Signs Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_NARRATIVE_SECTION__VITAL_SIGNS_NARRATIVE_SECTION_TEXT = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Information Source' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Require Results Organizer Template ID' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Class Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_CLASS_CODE = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Effective Time' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_ID = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Vital Sign Observation' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION = 125;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Minute' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_MINUTE = 162;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Confidentiality Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Language Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Participant Role Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_PARTICIPANT_ROLE_ID = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Template Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Type Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TYPE_CODE = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Awareness Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_AWARENESS_CODE = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Mood Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_MOOD_CODE = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Dose Quantity Or Rate Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Consents' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_CONSENTS = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Source' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_INFORMATION_SOURCE = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Precondition Criterion' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_PRECONDITION_CRITERION = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Reason' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_REASON = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Reason Problem' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_REASON_PROBLEM = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Product' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_PRODUCT = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_TEMPLATE_ID = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_ID = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_CODE = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Status Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_STATUS_CODE = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Effective Time' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_EFFECTIVE_TIME = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Route Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_ROUTE_CODE = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Approach Site Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_APPROACH_SITE_CODE = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Dose Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_DOSE_QUANTITY = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Rate Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_RATE_QUANTITY = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Max Dose Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_MAX_DOSE_QUANTITY = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Administration Unit Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_ADMINISTRATION_UNIT_CODE = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Medication Series Number Observation' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Medication Status Observation' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_MEDICATION_STATUS_OBSERVATION = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Reaction Observation' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_REACTION_OBSERVATION = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Product Instance' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_PRODUCT_INSTANCE = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Template Id' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Class Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Mood Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Status Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Value' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Template Id' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_TEMPLATE_ID = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Class Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_CLASS_CODE = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Mood Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_MOOD_CODE = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Status Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_STATUS_CODE = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Template Id' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Class Code' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_CLASS_CODE = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Internal Reference Template Id' of 'Internal Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_REFERENCE__INTERNAL_REFERENCE_TEMPLATE_ID = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Internal Reference Id' of 'Internal Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_REFERENCE__INTERNAL_REFERENCE_ID = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Internal Reference Code' of 'Internal Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_REFERENCE__INTERNAL_REFERENCE_CODE = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Template Id' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Class Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Mood Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CODE = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Text' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEXT = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Status Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Type Template Id' of 'Medication Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TYPE__MEDICATION_TYPE_TEMPLATE_ID = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Type Code' of 'Medication Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TYPE__MEDICATION_TYPE_CODE = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Mood Code' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_MOOD_CODE = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Has Author' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_AUTHOR = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Has Performer' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Has Participant Location' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Information Source' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Has Product' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PRODUCT = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Template Id' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_TEMPLATE_ID = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Id' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ID = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Status Code' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_STATUS_CODE = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Effective Time' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Repeat Number' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Quantity' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Medication Status Observation' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Product Instance' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Template Id' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEMPLATE_ID = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Mood Code' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Code' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Text' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Status Code' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Has Medication Or Supply Activity' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Supply Activity' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_SUPPLY_ACTIVITY = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Narrative Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Narrative Section Template Id' of 'Medications Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Narrative Section Code' of 'Medications Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_CODE = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Narrative Section Title' of 'Medications Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_TITLE = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Narrative Section Text' of 'Medications Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_TEXT = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication Normal Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_NORMAL_DOSE__MEDICATION_TEMPLATE_ID = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication Split Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SPLIT_DOSE__MEDICATION_TEMPLATE_ID = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TAPERED_DOSE__MEDICATION_TEMPLATE_ID = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication Conditional Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_CONDITIONAL_DOSE__MEDICATION_TEMPLATE_ID = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication Combination Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_COMBINATION_MEDICATION__MEDICATION_TEMPLATE_ID = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Has Material' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Has Material Code' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_CODE = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Has Material Code Original Text' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Has Material Name' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_NAME = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Template Id' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_TEMPLATE_ID = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Id' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_ID = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Mood Code' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_MOOD_CODE = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__MEDICATION_TEMPLATE_ID = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Code' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__MEDICATION_CODE = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Narrative Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_NARRATIVE_SECTION_TEMPLATE_ID = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Narrative Section Template Id' of 'Immunizations Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_NARRATIVE_SECTION__IMMUNIZATIONS_NARRATIVE_SECTION_TEMPLATE_ID = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Narrative Section Code' of 'Immunizations Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_NARRATIVE_SECTION__IMMUNIZATIONS_NARRATIVE_SECTION_CODE = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Narrative Section Title' of 'Immunizations Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_NARRATIVE_SECTION__IMMUNIZATIONS_NARRATIVE_SECTION_TITLE = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Narrative Section Text' of 'Immunizations Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_NARRATIVE_SECTION__IMMUNIZATIONS_NARRATIVE_SECTION_TEXT = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Template Id' of 'Procedure Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_TEMPLATE_ID = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Template Id' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Type Code' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TYPE_CODE = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Section External Reference' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__SURGERIES_SECTION_EXTERNAL_REFERENCE = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Narrative Section Template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Narrative Section Template Id' of 'Surgeries Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_NARRATIVE_SECTION__SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Narrative Section Code' of 'Surgeries Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_NARRATIVE_SECTION__SURGERIES_NARRATIVE_SECTION_CODE = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Narrative Section Title' of 'Surgeries Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_NARRATIVE_SECTION__SURGERIES_NARRATIVE_SECTION_TITLE = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Narrative Section Text' of 'Surgeries Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_NARRATIVE_SECTION__SURGERIES_NARRATIVE_SECTION_TEXT = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Has Text Reference' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Has Code Original Text' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_HAS_CODE_ORIGINAL_TEXT = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Performer Assigned Entity' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER_ASSIGNED_ENTITY = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Template Id' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Class Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CODE = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Text' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEXT = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Approach Site Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Target Site Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Internal Reference' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Internal Reference Reason' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Template Id' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Template Id' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID = 290;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 290;

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
				return validateStatusObservation((StatusObservation) value, diagnostics, context);
			case ConsolPackage.CONDITION:
				return validateCondition((Condition) value, diagnostics, context);
			case ConsolPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation) value, diagnostics, context);
			case ConsolPackage.CONDITION_ENTRY:
				return validateConditionEntry((ConditionEntry) value, diagnostics, context);
			case ConsolPackage.AGE_OBSERVATION:
				return validateAgeObservation((AgeObservation) value, diagnostics, context);
			case ConsolPackage.PROBLEM_STATUS_OBSERVATION:
				return validateProblemStatusObservation((ProblemStatusObservation) value, diagnostics, context);
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return validateHealthStatusObservation((HealthStatusObservation) value, diagnostics, context);
			case ConsolPackage.SEVERITY:
				return validateSeverity((Severity) value, diagnostics, context);
			case ConsolPackage.COMMENT:
				return validateComment((Comment) value, diagnostics, context);
			case ConsolPackage.PROBLEM_LIST_SECTION:
				return validateProblemListSection((ProblemListSection) value, diagnostics, context);
			case ConsolPackage.PROBLEM_LIST_NARRATIVE_SECTION:
				return validateProblemListNarrativeSection((ProblemListNarrativeSection) value, diagnostics, context);
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION:
				return validateDiagnosticResultsSection((DiagnosticResultsSection) value, diagnostics, context);
			case ConsolPackage.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION:
				return validateDiagnosticResultsNarrativeSection(
					(DiagnosticResultsNarrativeSection) value, diagnostics, context);
			case ConsolPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer) value, diagnostics, context);
			case ConsolPackage.RESULT:
				return validateResult((Result) value, diagnostics, context);
			case ConsolPackage.EXTERNAL_REFERENCE:
				return validateExternalReference((ExternalReference) value, diagnostics, context);
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection) value, diagnostics, context);
			case ConsolPackage.VITAL_SIGNS_NARRATIVE_SECTION:
				return validateVitalSignsNarrativeSection((VitalSignsNarrativeSection) value, diagnostics, context);
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer) value, diagnostics, context);
			case ConsolPackage.VITAL_SIGN:
				return validateVitalSign((VitalSign) value, diagnostics, context);
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS:
				return validateGeneralHeaderConstraints((GeneralHeaderConstraints) value, diagnostics, context);
			case ConsolPackage.PATIENT_AWARENESS:
				return validatePatientAwareness((PatientAwareness) value, diagnostics, context);
			case ConsolPackage.MEDICATION:
				return validateMedication((Medication) value, diagnostics, context);
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return validateMedicationSeriesNumberObservation(
					(MedicationSeriesNumberObservation) value, diagnostics, context);
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION:
				return validateMedicationStatusObservation((MedicationStatusObservation) value, diagnostics, context);
			case ConsolPackage.REACTION_OBSERVATION:
				return validateReactionObservation((ReactionObservation) value, diagnostics, context);
			case ConsolPackage.PRODUCT_INSTANCE:
				return validateProductInstance((ProductInstance) value, diagnostics, context);
			case ConsolPackage.INTERNAL_REFERENCE:
				return validateInternalReference((InternalReference) value, diagnostics, context);
			case ConsolPackage.PATIENT_MEDICAL_INSTRUCTIONS:
				return validatePatientMedicalInstructions((PatientMedicalInstructions) value, diagnostics, context);
			case ConsolPackage.MEDICATION_TYPE:
				return validateMedicationType((MedicationType) value, diagnostics, context);
			case ConsolPackage.MEDICATION_ORDER_INFORMATION:
				return validateMedicationOrderInformation((MedicationOrderInformation) value, diagnostics, context);
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return validateMedicationFullfillmentInstructions(
					(MedicationFullfillmentInstructions) value, diagnostics, context);
			case ConsolPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection) value, diagnostics, context);
			case ConsolPackage.MEDICATIONS_NARRATIVE_SECTION:
				return validateMedicationsNarrativeSection((MedicationsNarrativeSection) value, diagnostics, context);
			case ConsolPackage.MEDICATION_NORMAL_DOSE:
				return validateMedicationNormalDose((MedicationNormalDose) value, diagnostics, context);
			case ConsolPackage.MEDICATION_SPLIT_DOSE:
				return validateMedicationSplitDose((MedicationSplitDose) value, diagnostics, context);
			case ConsolPackage.MEDICATION_TAPERED_DOSE:
				return validateMedicationTaperedDose((MedicationTaperedDose) value, diagnostics, context);
			case ConsolPackage.MEDICATION_CONDITIONAL_DOSE:
				return validateMedicationConditionalDose((MedicationConditionalDose) value, diagnostics, context);
			case ConsolPackage.MEDICATION_COMBINATION_MEDICATION:
				return validateMedicationCombinationMedication(
					(MedicationCombinationMedication) value, diagnostics, context);
			case ConsolPackage.MEDICATION_INFORMATION:
				return validateMedicationInformation((MedicationInformation) value, diagnostics, context);
			case ConsolPackage.IMMUNIZATION:
				return validateImmunization((Immunization) value, diagnostics, context);
			case ConsolPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection) value, diagnostics, context);
			case ConsolPackage.IMMUNIZATIONS_NARRATIVE_SECTION:
				return validateImmunizationsNarrativeSection(
					(ImmunizationsNarrativeSection) value, diagnostics, context);
			case ConsolPackage.PROCEDURE_ACTIVITY:
				return validateProcedureActivity((ProcedureActivity) value, diagnostics, context);
			case ConsolPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation) value, diagnostics, context);
			case ConsolPackage.SURGERIES_SECTION:
				return validateSurgeriesSection((SurgeriesSection) value, diagnostics, context);
			case ConsolPackage.SURGERIES_NARRATIVE_SECTION:
				return validateSurgeriesNarrativeSection((SurgeriesNarrativeSection) value, diagnostics, context);
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureActivityProcedure((ProcedureActivityProcedure) value, diagnostics, context);
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT:
				return validateProcedureActivityAct((ProcedureActivityAct) value, diagnostics, context);
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION:
				return validateProcedureActivityObservation((ProcedureActivityObservation) value, diagnostics, context);
			case ConsolPackage.CONSOL_REGISTRY_DELEGATE:
				return validateConsolRegistryDelegate((ConsolRegistryDelegate) value, diagnostics, context);
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
			result &= validateStatusObservation_validateStatusObservationCode(statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(statusObservation, diagnostics, context);
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
	 * Validates the validateStatusObservationCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationCode(diagnostics, context);
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
			result &= validateCondition_validateConditionEffectiveTimeLow(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEffectiveTimeHigh(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEffectiveTimeHighProhibited(condition, diagnostics, context);
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
			result &= validateCondition_validateConditionConditionEntry(condition, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConditionEffectiveTimeLow constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTimeLow(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEffectiveTimeLow(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEffectiveTimeHigh constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTimeHigh(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEffectiveTimeHigh(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEffectiveTimeHighProhibited constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEffectiveTimeHighProhibited(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionEffectiveTimeHighProhibited(diagnostics, context);
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
	 * Validates the validateConditionConditionEntry constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionConditionEntry(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionConditionEntry(diagnostics, context);
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
		return result;
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
			result &= validateConditionEntry_validateConditionEntryHasTextReference(
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
			result &= validateConditionEntry_validateConditionEntryClassCode(conditionEntry, diagnostics, context);
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
			result &= validateConditionEntry_validateConditionEntryProblemStatusObservation(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryHealthStatusObservation(
				conditionEntry, diagnostics, context);
		}
		return result;
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
	 * Validates the validateConditionEntryClassCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryClassCode(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryClassCode(diagnostics, context);
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
			result &= validateProblemStatusObservation_validateProblemStatusObservationHasTextReference(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationNoAdditionalParticipants(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationTemplateId(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationClassCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationMoodCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationStatusCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationValue(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemStatusObservation_validateProblemStatusObservationText(
				problemStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemStatusObservationHasTextReference constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationHasTextReference(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationNoAdditionalParticipants constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationNoAdditionalParticipants(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationNoAdditionalParticipants(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationTemplateId constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationTemplateId(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationClassCode constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationClassCode(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationMoodCode constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationMoodCode(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationMoodCode(diagnostics, context);
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
	 * Validates the validateProblemStatusObservationStatusCode constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationStatusCode(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationValue constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationValue(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateProblemStatusObservationText constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateProblemStatusObservationText(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateProblemStatusObservationText(diagnostics, context);
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
			result &= validateHealthStatusObservation_validateHealthStatusObservationHasTextReference(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationNoAdditionalParticipants(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationTemplateId(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationClassCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationMoodCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationStatusCode(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationValue(
				healthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthStatusObservation_validateHealthStatusObservationText(
				healthStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHealthStatusObservationHasTextReference constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationHasTextReference(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationNoAdditionalParticipants constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationNoAdditionalParticipants(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationNoAdditionalParticipants(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationTemplateId constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationTemplateId(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationClassCode constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationClassCode(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationMoodCode constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationMoodCode(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationMoodCode(diagnostics, context);
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
	 * Validates the validateHealthStatusObservationStatusCode constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationStatusCode(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationValue constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationValue(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationText constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationText(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationText(diagnostics, context);
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
			result &= validateProblemListSection_validateProblemListNarrativeSectionTemplateId(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionCode(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionTitle(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionText(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionCondition(
				problemListSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemListSectionCondition constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionCondition(
			ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionCondition(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListNarrativeSectionTemplateId constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListNarrativeSectionTemplateId(
			ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListNarrativeSection(ProblemListNarrativeSection problemListNarrativeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemListNarrativeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemListNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionTemplateId(
				problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionCode(
				problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionTitle(
				problemListNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListNarrativeSection_validateProblemListNarrativeSectionText(
				problemListNarrativeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemListNarrativeSectionTemplateId constraint of '<em>Problem List Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListNarrativeSection_validateProblemListNarrativeSectionTemplateId(
			ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemListNarrativeSection.validateProblemListNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListNarrativeSectionCode constraint of '<em>Problem List Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListNarrativeSection_validateProblemListNarrativeSectionCode(
			ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemListNarrativeSection.validateProblemListNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListNarrativeSectionTitle constraint of '<em>Problem List Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListNarrativeSection_validateProblemListNarrativeSectionTitle(
			ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemListNarrativeSection.validateProblemListNarrativeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListNarrativeSectionText constraint of '<em>Problem List Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListNarrativeSection_validateProblemListNarrativeSectionText(
			ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemListNarrativeSection.validateProblemListNarrativeSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection(DiagnosticResultsSection diagnosticResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diagnosticResultsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsNarrativeSectionTemplateId(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsNarrativeSection_validateDiagnosticResultsNarrativeSectionCode(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionResultOrganizer(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionExternalReference(
				diagnosticResultsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDiagnosticResultsSectionResultOrganizer constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionResultOrganizer(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionExternalReference constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionExternalReference(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionExternalReference(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsNarrativeSectionTemplateId constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsNarrativeSectionTemplateId(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsNarrativeSection(
			DiagnosticResultsNarrativeSection diagnosticResultsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diagnosticResultsNarrativeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(diagnosticResultsNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsNarrativeSection_validateDiagnosticResultsNarrativeSectionTemplateId(
				diagnosticResultsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsNarrativeSection_validateDiagnosticResultsNarrativeSectionCode(
				diagnosticResultsNarrativeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDiagnosticResultsNarrativeSectionTemplateId constraint of '<em>Diagnostic Results Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsNarrativeSection_validateDiagnosticResultsNarrativeSectionTemplateId(
			DiagnosticResultsNarrativeSection diagnosticResultsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsNarrativeSection.validateDiagnosticResultsNarrativeSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsNarrativeSectionCode constraint of '<em>Diagnostic Results Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsNarrativeSection_validateDiagnosticResultsNarrativeSectionCode(
			DiagnosticResultsNarrativeSection diagnosticResultsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsNarrativeSection.validateDiagnosticResultsNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerComponentElement(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerInformationSource(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerId(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerCode(resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateResultOrganizerComponentElement constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerComponentElement(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerComponentElement(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerInformationSource constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerInformationSource(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerTemplateId(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerMoodCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerMoodCode(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerId(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerCode(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerStatusCode(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateResult(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(result, diagnostics, context)) {
			return false;
		}
		boolean theResult = validate_EveryMultiplicityConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) {
			theResult &= validate_EveryDataValueConforms(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validate_EveryReferenceIsContained(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validate_EveryProxyResolves(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validate_UniqueID(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validate_EveryKeyUnique(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validate_EveryMapEntryUnique(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultReferenceRangeRequired(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultNoObservationRangeCode(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultInformationSource(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultValuePresence(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultTemplateId(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultMoodCode(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultId(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultCode(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultStatusCode(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultEffectiveTime(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultValue(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultInterpretationCode(result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= validateResult_validateResultMethodCode(result, diagnostics, context);
		}
		return theResult;
	}

	/**
	 * Validates the validateResultReferenceRangeRequired constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultReferenceRangeRequired(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultReferenceRangeRequired(diagnostics, context);
	}

	/**
	 * Validates the validateResultNoObservationRangeCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultNoObservationRangeCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultNoObservationRangeCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultInformationSource constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultInformationSource(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultValuePresence constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultValuePresence(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultValuePresence(diagnostics, context);
	}

	/**
	 * Validates the validateResultTemplateId constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultTemplateId(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultMoodCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultMoodCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultId constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultId(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultId(diagnostics, context);
	}

	/**
	 * Validates the validateResultCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultStatusCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultStatusCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultEffectiveTime constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultEffectiveTime(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateResultValue constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultValue(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultInterpretationCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultInterpretationCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultMethodCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultMethodCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultMethodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference(ExternalReference externalReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReference, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(externalReference, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalReference_validateExternalReferenceTemplateId(
				externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalReference_validateExternalReferenceClassCode(
				externalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalReference_validateExternalReferenceMoodCode(
				externalReference, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateExternalReferenceTemplateId constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceTemplateId(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceClassCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceClassCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceMoodCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceMoodCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateVitalSignsNarrativeSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionCode(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionTitle(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionText(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(
				vitalSignsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignsSectionVitalSignsOrganizer constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionVitalSignsOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsNarrativeSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsNarrativeSectionTemplateId(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSection(VitalSignsNarrativeSection vitalSignsNarrativeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsNarrativeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(vitalSignsNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionTemplateId(
				vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionCode(
				vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionTitle(
				vitalSignsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionText(
				vitalSignsNarrativeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignsNarrativeSectionTemplateId constraint of '<em>Vital Signs Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionTemplateId(
			VitalSignsNarrativeSection vitalSignsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsNarrativeSection.validateVitalSignsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsNarrativeSectionCode constraint of '<em>Vital Signs Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionCode(
			VitalSignsNarrativeSection vitalSignsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsNarrativeSection.validateVitalSignsNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsNarrativeSectionTitle constraint of '<em>Vital Signs Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionTitle(
			VitalSignsNarrativeSection vitalSignsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsNarrativeSection.validateVitalSignsNarrativeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsNarrativeSectionText constraint of '<em>Vital Signs Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSection_validateVitalSignsNarrativeSectionText(
			VitalSignsNarrativeSection vitalSignsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsNarrativeSection.validateVitalSignsNarrativeSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerComponentElement(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerInformationSource(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateResultOrganizerTemplateId(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerMoodCode(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerId(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateResultOrganizerStatusCode(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerClassCode(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerEffectiveTime(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerId(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerVitalSignObservation(
				vitalSignsOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignsOrganizerInformationSource constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerRequireResultsOrganizerTemplateID constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerClassCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerClassCode(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerEffectiveTime constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerEffectiveTime(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerId(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerVitalSignObservation constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerVitalSignObservation(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerVitalSignObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerTemplateId(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerCode(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerStatusCode(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateResultOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSign, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(vitalSign, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultReferenceRangeRequired(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultNoObservationRangeCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultInformationSource(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultValuePresence(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateResultTemplateId(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultMoodCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultId(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateResultCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultStatusCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultEffectiveTime(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultValue(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultInterpretationCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResult_validateResultMethodCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateVitalSignInterpretationCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateVitalSignMethodCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateVitalSignTargetSiteCode(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateVitalSignValue(vitalSign, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignInterpretationCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignInterpretationCode(VitalSign vitalSign,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.validateVitalSignInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignMethodCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignMethodCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateVitalSignMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignTargetSiteCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignTargetSiteCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateVitalSignTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignValue constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignValue(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateVitalSignValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultTemplateId constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateResultTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateResultTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateResultCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateResultCode(diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToMinute(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(
				generalHeaderConstraints, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				generalHeaderConstraints, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsPersonHasName constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsPersonHasName(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsOrganizationsHaveContactInfo constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToDay constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToDay(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToYear constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToYear(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTelephoneMatchesRegex constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTelephoneMatchesRegex(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasTelephoneDialingDigits constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasTelephoneDialingDigits(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTypeIdExtension constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeIdExtension(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsOidLength constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsOidLength(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsSetIdAndVersionNumber constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsSetIdAndVersionNumber(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsSetIdAndIdAreUnique constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsSetIdAndIdAreUnique(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCopyTimeNotPresent constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsCopyTimeNotPresent(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasRecordTargetPatientRole constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasRecordTargetPatientRole(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasPatientBirthTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasPatientBirthTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAdministrativeGenderCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasProviderOrganization constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasProviderOrganization(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAuthorTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAuthorTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAssignedAuthorId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasDataEntererAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasDataEntererTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasInformant constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformant(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToMinute constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToMinute(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToMinute(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTimePreciseToYearAndDay constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToYearAndDay(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRealmCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRealmCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTypeId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTitle constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTitle(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsEffectiveTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsConfidentialityCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsLanguageCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsLanguageCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness(PatientAwareness patientAwareness, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientAwareness, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipant2_validateContextControlCode(
				patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientAwareness_validatePatientAwarenessParticipantRoleId(
				patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientAwareness_validatePatientAwarenessTemplateId(
				patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientAwareness_validatePatientAwarenessTypeCode(patientAwareness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientAwareness_validatePatientAwarenessAwarenessCode(
				patientAwareness, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePatientAwarenessParticipantRoleId constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessParticipantRoleId(
			PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessParticipantRoleId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientAwarenessTemplateId constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessTemplateId(PatientAwareness patientAwareness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientAwarenessTypeCode constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessTypeCode(PatientAwareness patientAwareness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientAwarenessAwarenessCode constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessAwarenessCode(PatientAwareness patientAwareness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessAwarenessCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medication, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medication, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationTemplateId(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(medication, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationMoodCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationMoodCode(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasDoseQuantityOrRateQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasDoseQuantityOrRateQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasConsents constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasConsents(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationHasConsents(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationSource constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationInformationSource(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasPreconditionCriterion constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasPreconditionCriterion(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasPreconditionCriterion(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasReason constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasReason(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationHasReason(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasReasonProblem constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasReasonProblem(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasReasonProblem(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasProduct constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasProduct(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationHasProduct(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationTemplateId(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationId(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationCode(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationStatusCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationStatusCode(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationEffectiveTime constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationEffectiveTime(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationRouteCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationRouteCode(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationRouteCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationApproachSiteCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationApproachSiteCode(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationApproachSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationDoseQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationDoseQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationRateQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationRateQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationRateQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationMaxDoseQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationMaxDoseQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationMaxDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationAdministrationUnitCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationAdministrationUnitCode(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationAdministrationUnitCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationMedicationSeriesNumberObservation constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationMedicationSeriesNumberObservation(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationMedicationSeriesNumberObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationMedicationStatusObservation constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationMedicationStatusObservation(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationMedicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationReactionObservation constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationReactionObservation(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationReactionObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationProductInstance constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationProductInstance(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationProductInstance(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationSeriesNumberObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationTemplateId(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationClassCode(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationMoodCode(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationCode(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationStatusCode(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationValue(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationTemplateId constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationTemplateId(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationClassCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationClassCode(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationMoodCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationMoodCode(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationCode(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationStatusCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationStatusCode(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationValue constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationValue(
			MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation(MedicationStatusObservation medicationStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationStatusObservation_validateStatusObservationTemplateId(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationCode(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(
				medicationStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation_validateStatusObservationTemplateId(
			MedicationStatusObservation medicationStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation(ReactionObservation reactionObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reactionObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationTemplateId(
				reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationClassCode(
				reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationMoodCode(
				reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationStatusCode(
				reactionObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateReactionObservationTemplateId constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationTemplateId(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationClassCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationClassCode(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationMoodCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationMoodCode(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationStatusCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationStatusCode(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance(ProductInstance productInstance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productInstance, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(
				productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProductInstance_validateProductInstanceTemplateId(productInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProductInstance_validateProductInstanceClassCode(productInstance, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProductInstanceTemplateId constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_validateProductInstanceTemplateId(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.validateProductInstanceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProductInstanceClassCode constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_validateProductInstanceClassCode(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.validateProductInstanceClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference(InternalReference internalReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalReference, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(internalReference, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInternalReference_validateInternalReferenceTemplateId(
				internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInternalReference_validateInternalReferenceId(internalReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInternalReference_validateInternalReferenceCode(internalReference, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInternalReferenceTemplateId constraint of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference_validateInternalReferenceTemplateId(InternalReference internalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalReference.validateInternalReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInternalReferenceId constraint of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference_validateInternalReferenceId(InternalReference internalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalReference.validateInternalReferenceId(diagnostics, context);
	}

	/**
	 * Validates the validateInternalReferenceCode constraint of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference_validateInternalReferenceCode(InternalReference internalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalReference.validateInternalReferenceCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions(PatientMedicalInstructions patientMedicalInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientMedicalInstructions, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsTemplateId(
				patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsClassCode(
				patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsMoodCode(
				patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsCode(
				patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsText(
				patientMedicalInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsStatusCode(
				patientMedicalInstructions, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePatientMedicalInstructionsTemplateId constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsTemplateId(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsClassCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsClassCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsMoodCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsMoodCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsText constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsText(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsText(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsStatusCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsStatusCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationType(MedicationType medicationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationType, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationType, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationType_validateMedicationTypeTemplateId(medicationType, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationType_validateMedicationTypeCode(medicationType, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationTypeTemplateId constraint of '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationType_validateMedicationTypeTemplateId(MedicationType medicationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationType.validateMedicationTypeTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationTypeCode constraint of '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationType_validateMedicationTypeCode(MedicationType medicationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationType.validateMedicationTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation(MedicationOrderInformation medicationOrderInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationOrderInformation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationOrderInformation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSupply_validateClassCode(medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationMoodCode(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationHasAuthor(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationHasPerformer(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationHasParticipantLocation(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationInformationSource(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationHasProduct(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationTemplateId(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationId(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationStatusCode(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationEffectiveTime(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationRepeatNumber(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationQuantity(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationMedicationStatusObservation(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationProductInstance(
				medicationOrderInformation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationOrderInformationMoodCode constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationMoodCode(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationHasAuthor constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationHasAuthor(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationHasAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationHasPerformer constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationHasPerformer(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationHasPerformer(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationHasParticipantLocation constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationHasParticipantLocation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationHasParticipantLocation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationInformationSource constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationInformationSource(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationHasProduct constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationHasProduct(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationHasProduct(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationTemplateId constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationTemplateId(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationId constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationId(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationStatusCode constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationStatusCode(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationEffectiveTime constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationEffectiveTime(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationRepeatNumber constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationRepeatNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationRepeatNumber(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationQuantity constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationQuantity(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationMedicationStatusObservation constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationMedicationStatusObservation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationMedicationStatusObservation(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationProductInstance constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationProductInstance(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationProductInstance(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationFullfillmentInstructions, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsTemplateId(
				medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsMoodCode(
				medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsCode(
				medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsText(
				medicationFullfillmentInstructions, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsStatusCode(
				medicationFullfillmentInstructions, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsTemplateId constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsTemplateId(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsMoodCode constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsMoodCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsCode constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsText constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsText(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsText(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsStatusCode constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsStatusCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsStatusCode(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection(MedicationsSection medicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsNarrativeSectionTemplateId(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionCode(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionTitle(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionText(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionSupplyActivity(
				medicationsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationsSectionHasMedicationOrSupplyActivity constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionHasMedicationOrSupplyActivity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionSupplyActivity constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionSupplyActivity(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionSupplyActivity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsNarrativeSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsNarrativeSectionTemplateId(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSection(MedicationsNarrativeSection medicationsNarrativeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsNarrativeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationsNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionTemplateId(
				medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionCode(
				medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionTitle(
				medicationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionText(
				medicationsNarrativeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationsNarrativeSectionTemplateId constraint of '<em>Medications Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionTemplateId(
			MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsNarrativeSection.validateMedicationsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsNarrativeSectionCode constraint of '<em>Medications Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionCode(
			MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsNarrativeSection.validateMedicationsNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsNarrativeSectionTitle constraint of '<em>Medications Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionTitle(
			MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsNarrativeSection.validateMedicationsNarrativeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsNarrativeSectionText constraint of '<em>Medications Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSection_validateMedicationsNarrativeSectionText(
			MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsNarrativeSection.validateMedicationsNarrativeSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDose(MedicationNormalDose medicationNormalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationNormalDose, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationNormalDose_validateMedicationTemplateId(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(medicationNormalDose, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDose_validateMedicationTemplateId(MedicationNormalDose medicationNormalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationNormalDose.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDose(MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationSplitDose, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSplitDose_validateMedicationTemplateId(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(medicationSplitDose, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDose_validateMedicationTemplateId(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSplitDose.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDose(MedicationTaperedDose medicationTaperedDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationTaperedDose, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationTaperedDose_validateMedicationTemplateId(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(medicationTaperedDose, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDose_validateMedicationTemplateId(
			MedicationTaperedDose medicationTaperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationTaperedDose.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDose(MedicationConditionalDose medicationConditionalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationConditionalDose, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationConditionalDose_validateMedicationTemplateId(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(
				medicationConditionalDose, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDose_validateMedicationTemplateId(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationConditionalDose.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedication(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationCombinationMedication, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationCombinationMedication_validateMedicationTemplateId(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(
				medicationCombinationMedication, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedication_validateMedicationTemplateId(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationCombinationMedication.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationInformation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateManufacturedProduct_validateClassCode(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationHasMaterial(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationHasMaterialCode(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationHasMaterialCodeOriginalText(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationHasMaterialName(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationTemplateId(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationId(
				medicationInformation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationInformationHasMaterial constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationHasMaterial(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationHasMaterial(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationHasMaterialCode constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationHasMaterialCode(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationHasMaterialCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationHasMaterialCodeOriginalText constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationHasMaterialCodeOriginalText(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationHasMaterialCodeOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationHasMaterialName constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationHasMaterialName(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationHasMaterialName(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationTemplateId constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationTemplateId(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationId constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationId(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunization, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMoodCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasDoseQuantityOrRateQuantity(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasConsents(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationInformationSource(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasPreconditionCriterion(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReason(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasReasonProblem(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationHasProduct(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunization_validateMedicationTemplateId(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationId(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunization_validateMedicationCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationStatusCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationEffectiveTime(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRouteCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationRateQuantity(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMaxDoseQuantity(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationAdministrationUnitCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationSeriesNumberObservation(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationMedicationStatusObservation(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationReactionObservation(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationProductInstance(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunization_validateImmunizationMoodCode(immunization, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateImmunizationMoodCode constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationMoodCode(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateMedicationTemplateId(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationCode constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateMedicationCode(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return immunization.validateMedicationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunizationsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsNarrativeSectionTemplateId(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionCode(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionTitle(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionText(
				immunizationsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateImmunizationsNarrativeSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsNarrativeSectionTemplateId(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSection(ImmunizationsNarrativeSection immunizationsNarrativeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunizationsNarrativeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(immunizationsNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionTemplateId(
				immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionCode(
				immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionTitle(
				immunizationsNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionText(
				immunizationsNarrativeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateImmunizationsNarrativeSectionTemplateId constraint of '<em>Immunizations Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionTemplateId(
			ImmunizationsNarrativeSection immunizationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return immunizationsNarrativeSection.validateImmunizationsNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsNarrativeSectionCode constraint of '<em>Immunizations Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionCode(
			ImmunizationsNarrativeSection immunizationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return immunizationsNarrativeSection.validateImmunizationsNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsNarrativeSectionTitle constraint of '<em>Immunizations Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionTitle(
			ImmunizationsNarrativeSection immunizationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return immunizationsNarrativeSection.validateImmunizationsNarrativeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsNarrativeSectionText constraint of '<em>Immunizations Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSection_validateImmunizationsNarrativeSectionText(
			ImmunizationsNarrativeSection immunizationsNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return immunizationsNarrativeSection.validateImmunizationsNarrativeSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity(ProcedureActivity procedureActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(procedureActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(procedureActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(procedureActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(procedureActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(procedureActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(procedureActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivity_validateProcedureActivityTemplateId(
				procedureActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProcedureActivityTemplateId constraint of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity_validateProcedureActivityTemplateId(ProcedureActivity procedureActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivity.validateProcedureActivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterLocation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipant2_validateContextControlCode(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationTemplateId(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationTypeCode(
				encounterLocation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEncounterLocationTemplateId constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationTemplateId(EncounterLocation encounterLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationTypeCode constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationTypeCode(EncounterLocation encounterLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(surgeriesSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesSection_validateSurgeriesNarrativeSectionTemplateId(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionCode(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionTitle(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionText(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesSection_validateSurgeriesSectionExternalReference(
				surgeriesSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSurgeriesSectionExternalReference constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateSurgeriesSectionExternalReference(
			SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateSurgeriesSectionExternalReference(diagnostics, context);
	}

	/**
	 * Validates the validateSurgeriesNarrativeSectionTemplateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateSurgeriesNarrativeSectionTemplateId(
			SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateSurgeriesNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSection(SurgeriesNarrativeSection surgeriesNarrativeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(surgeriesNarrativeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(surgeriesNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionTemplateId(
				surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionCode(
				surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionTitle(
				surgeriesNarrativeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionText(
				surgeriesNarrativeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSurgeriesNarrativeSectionTemplateId constraint of '<em>Surgeries Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionTemplateId(
			SurgeriesNarrativeSection surgeriesNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return surgeriesNarrativeSection.validateSurgeriesNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSurgeriesNarrativeSectionCode constraint of '<em>Surgeries Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionCode(
			SurgeriesNarrativeSection surgeriesNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return surgeriesNarrativeSection.validateSurgeriesNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateSurgeriesNarrativeSectionTitle constraint of '<em>Surgeries Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionTitle(
			SurgeriesNarrativeSection surgeriesNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return surgeriesNarrativeSection.validateSurgeriesNarrativeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateSurgeriesNarrativeSectionText constraint of '<em>Surgeries Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSection_validateSurgeriesNarrativeSectionText(
			SurgeriesNarrativeSection surgeriesNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return surgeriesNarrativeSection.validateSurgeriesNarrativeSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure(ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivity_validateProcedureActivityTemplateId(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureHasTextReference(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureHasCodeOriginalText(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformerAssignedEntity(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureClassCode(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureText(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureApproachSiteCode(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureTargetSiteCode(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureInternalReference(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureInternalReferenceReason(
				procedureActivityProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProcedureActivityProcedureHasTextReference constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureHasTextReference(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureHasCodeOriginalText constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureHasCodeOriginalText(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureHasCodeOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedurePerformerAssignedEntity constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformerAssignedEntity(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedurePerformerAssignedEntity(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureTemplateId constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureClassCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureClassCode(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureText constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureText(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureText(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureApproachSiteCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureApproachSiteCode(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureApproachSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureTargetSiteCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureTargetSiteCode(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureInternalReference constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureInternalReference(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureInternalReference(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureInternalReferenceReason constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureInternalReferenceReason(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureInternalReferenceReason(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityAct, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivity_validateProcedureActivityTemplateId(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActTemplateId(
				procedureActivityAct, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProcedureActivityActTemplateId constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActTemplateId(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation(ProcedureActivityObservation procedureActivityObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivity_validateProcedureActivityTemplateId(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationTemplateId(
				procedureActivityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProcedureActivityObservationTemplateId constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationTemplateId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolRegistryDelegate(ConsolRegistryDelegate consolRegistryDelegate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consolRegistryDelegate, diagnostics, context);
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

} // ConsolValidator
