/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.*;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription;
import org.openhealthtools.mdht.uml.cda.ccd.CoveredParty;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.PayerEntity;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.Support;
import org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage
 * @generated
 */
public class CCDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CCDValidator INSTANCE = new CCDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ccd";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Has Medication Or Supply Activity' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Code' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Title' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TITLE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Text' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEXT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Medication Activity' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_MEDICATION_ACTIVITY = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Supply Activity' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_SUPPLY_ACTIVITY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Service Event Required' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Service Event Class Code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Service Event Effective Time' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Language Code Format' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document No Template Id Extension' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Effective Time Seconds' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Effective Time Zone' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document One Or Two Record Target' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Assigned Author' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Assigned Author Null Flavor' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Information Recipient' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Template Id' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Language Code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Problem Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Family History Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Social History Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Alerts Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Medications Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Results Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Procedures Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Encounters Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Plan Of Care Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Immunizations Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Vital Signs Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Medical Equipment Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Functional Status Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Advance Directives Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Payers Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Purpose Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Entry Relationship Required' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Subject Of Target' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_SUBJECT_OF_TARGET = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Contains Problem Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Contains Alert Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Contains Patient Awareness' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Template Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Class Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CLASS_CODE = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Mood Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_MOOD_CODE = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_ID = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Code Null Flavor' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CODE_NULL_FLAVOR = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Effective Time' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_EFFECTIVE_TIME = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Episode Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_EPISODE_OBSERVATION = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Information Source' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_INFORMATION_SOURCE = 380;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Contains Patient Awareness' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS = 381;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 382;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Mood Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_MOOD_CODE = 383;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Status Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_STATUS_CODE = 384;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Effective Time' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_EFFECTIVE_TIME = 385;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Problem Status' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_PROBLEM_STATUS = 386;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Problem Health Status' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS = 387;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Age Observation' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_AGE_OBSERVATION = 388;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Template Id' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEMPLATE_ID = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Code' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_CODE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Title' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TITLE = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Text' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEXT = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Problem Act' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_PROBLEM_ACT = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation No Additional Participants' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation No Additional Relationships' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation One Entry Relationship SUBJ' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Exists Entry Relationship SAS' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Class Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Mood Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Status Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Problem Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 389;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Code' of 'Problem Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 390;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Value' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_VALUE = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Family History Obs Orgs' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_FAMILY_HISTORY_OBS_ORGS = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section No Subject' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_NO_SUBJECT = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Participant Role Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_PARTICIPANT_ROLE_ID = 391;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Template Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID = 392;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Type Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TYPE_CODE = 393;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Awareness Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_AWARENESS_CODE = 394;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Related Subject Birth Time' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEMPLATE_ID = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Code' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_CODE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Title' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TITLE = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Text' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEXT = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Family History Organizer' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Component' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Family History Observation' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Subject' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Subject Patient Relationship' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Relationship Value Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Related Subject Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Related Subject Code Value Set' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Related Subject Subject' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Has Gender Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Status Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Effective Time' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_EFFECTIVE_TIME = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Mood Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_MOOD_CODE = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Age Observation' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Problem Status Observation' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Template Id' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Status Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Class Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_CLASS_CODE = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Mood Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_MOOD_CODE = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Family History Observation' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Has Subject Patient Relationship' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Relationship Value Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Has Related Subject Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Related Subject Code Value Set' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Has Related Subject Subject' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Has Gender Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Component Element' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_COMPONENT_ELEMENT = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Information Source' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_INFORMATION_SOURCE = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Mood Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_MOOD_CODE = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_ID = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_RESULT_OBSERVATION = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Specimen' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_SPECIMEN = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code Value' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_CODE_VALUE = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Reference Range Required' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_REFERENCE_RANGE_REQUIRED = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation No Observation Range Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_NO_OBSERVATION_RANGE_CODE = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Information Source' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_INFORMATION_SOURCE = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Mood Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_MOOD_CODE = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_ID = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Effective Time' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_EFFECTIVE_TIME = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Status Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_STATUS_CODE = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Method Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_METHOD_CODE = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Interpretation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_INTERPRETATION_CODE = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Value' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Has Procedure Activity' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Code' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_CODE = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Title' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TITLE = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Text' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEXT = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Social History Observation' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Code Value Set' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_CODE_VALUE_SET = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Template Id' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Class Code' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_CLASS_CODE = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Id' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_ID = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Mood Code' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_MOOD_CODE = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Status Code' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_STATUS_CODE = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Social History Status Observation' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_SOCIAL_HISTORY_STATUS_OBSERVATION = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Episode Observation' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_EPISODE_OBSERVATION = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Social History Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Social History Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Code' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_CODE = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Title' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TITLE = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Text' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEXT = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Encounters Activity' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Has Indications' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_HAS_INDICATIONS = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Has Practitioners' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_HAS_PRACTITIONERS = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Practitioner Role' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_PRACTITIONER_ROLE = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Title' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TITLE = 293;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Text' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEXT = 294;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Medication Activity' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_MEDICATION_ACTIVITY = 295;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Supply Activity' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_SUPPLY_ACTIVITY = 296;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Template Id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Class Code' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_CLASS_CODE = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Mood Code' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_MOOD_CODE = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_ID = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Effective Time' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Patient Instruction' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_PATIENT_INSTRUCTION = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Age Observation' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_AGE_OBSERVATION = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Encounter Location' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_ENCOUNTER_LOCATION = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Mood Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Dose Quantity Or Rate Quantity' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Consents' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_CONSENTS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Information Source' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INFORMATION_SOURCE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Precondition Criterion' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Reason' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_REASON = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Reason Problem' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_REASON_PROBLEM = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Product' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_PRODUCT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Status Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Effective Time' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Max Dose Quantity' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Route Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Route Code P' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE_P = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Dose Quantity' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITY = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Rate Quantity' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_RATE_QUANTITY = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Medication Series Number Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Medication Status Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Patient Instruction' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PATIENT_INSTRUCTION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Performer' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PERFORMER = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Reaction Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REACTION_OBSERVATION = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Product Instance' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRODUCT_INSTANCE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Template Id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Status Code' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Effective Time' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_EFFECTIVE_TIME = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Quantity' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_QUANTITY = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Repeat Number' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_REPEAT_NUMBER = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Medication Status Observation' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Fulfillment Instruction' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Product Instance' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_PRODUCT_INSTANCE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Template Id' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TEMPLATE_ID = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Code' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_CODE = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Title' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TITLE = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Text' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TEXT = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Problem Act' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_PROBLEM_ACT = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Information Source' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_INFORMATION_SOURCE = 395;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Agent Representation' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_AGENT_REPRESENTATION = 396;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Playing Entity Required' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED = 397;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Agent Representation Vocab' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB = 398;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Participant Role Class Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE = 399;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Playing Entity Class Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE = 400;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Playing Entity Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_CODE = 401;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Playing Entity Code Vocab' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB = 402;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Template Id' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_TEMPLATE_ID = 403;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Mood Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_MOOD_CODE = 404;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Status Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_STATUS_CODE = 405;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Effective Time' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_EFFECTIVE_TIME = 406;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Alert Status Observation' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION = 407;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Reaction Observation' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_REACTION_OBSERVATION = 408;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Template Id' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Class Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_CLASS_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Mood Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_MOOD_CODE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Status Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_STATUS_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Severity Observation' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_SEVERITY_OBSERVATION = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Template Id' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Class Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CLASS_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Mood Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_MOOD_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CODE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Status Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_STATUS_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Value' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_VALUE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Has Scoping Entity' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_HAS_SCOPING_ENTITY = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Alert Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 409;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 410;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Marital Status' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_MARITAL_STATUS = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Religious Affiliation' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Patient Race' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_RACE = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Patient Race Code System' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Patient Ethnicity' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Patient Ethnicity Code System' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Related Subject Birth Time' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Has Participant Role' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE = 411;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Has Participant Role Location' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION = 412;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Has Participant Role Code' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE = 413;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Has Participant Role Code Vocab' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB = 414;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Has Playing Entity' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY = 415;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Has Playing Entity Place' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE = 416;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Code' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_CODE = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Title' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TITLE = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Text' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TEXT = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Result Organizer' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_RESULT_ORGANIZER = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code Value' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_CODE_VALUE = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Template Id' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Class Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Mood Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Status Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Value' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Target Of Entry Relationship' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TARGET_OF_ENTRY_RELATIONSHIP = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Template Id' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID = 417;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Type Code' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TYPE_CODE = 418;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL = 419;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Code' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_CODE = 420;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Code Vocab' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_CODE_VOCAB = 421;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Code Original Text' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT = 422;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Name' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_NAME = 423;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product May Have Material Manufacturer' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER = 424;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Should Have Material Manufacturer' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER = 425;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Template Id' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_TEMPLATE_ID = 426;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Id' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_ID = 427;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Template Id' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TEMPLATE_ID = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Code' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_CODE = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Title' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Text' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TEXT = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Code' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_CODE = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Title' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TITLE = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Text' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEXT = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Act' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Encounter' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Observation' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Procedure' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Substance Administration' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Supply' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 297;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Code' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE = 298;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Title' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TITLE = 299;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Text' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT = 300;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Signs Organizer' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 301;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Template Id' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 304;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Code' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_CODE = 305;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Title' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TITLE = 306;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Text' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEXT = 307;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Supply Activity' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY = 308;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Medication Activity' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY = 309;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Clinical Statements' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS = 310;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Observation Code' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE = 311;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Observation Code Value Set' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET = 312;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Value Datatype' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE = 313;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Icf Code System' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM = 314;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Problem Status Observation' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION = 315;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Result Status Observation' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION = 316;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 317;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Code' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CODE = 318;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Title' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TITLE = 319;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Text' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEXT = 320;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 321;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Code' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_CODE = 322;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Title' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TITLE = 323;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Text' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TEXT = 324;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Advance Directive Observation' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE_OBSERVATION = 325;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Adv Directive Code Value Set' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET = 326;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Adv Directive Code Code System' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM = 327;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEMPLATE_ID = 339;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Code' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_CODE = 340;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Title' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TITLE = 341;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Text' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEXT = 342;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Coverage Activity' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_COVERAGE_ACTIVITY = 343;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Information Source' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_INFORMATION_SOURCE = 344;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Sequence Number' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_SEQUENCE_NUMBER = 345;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Template Id' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TEMPLATE_ID = 368;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Code' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_CODE = 369;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Title' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TITLE = 370;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Text' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TEXT = 371;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Purpose Activity' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_PURPOSE_ACTIVITY = 372;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Has Reason' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_HAS_REASON = 373;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Reason Type' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_REASON_TYPE = 374;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Template Id' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_TEMPLATE_ID = 375;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Class Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CLASS_CODE = 376;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Mood Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_MOOD_CODE = 377;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CODE = 378;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Status Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_STATUS_CODE = 379;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Information Source' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE = 302;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 303;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Template Id' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID = 328;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Class Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE = 329;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Mood Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE = 330;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Id' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ID = 331;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Status Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE = 332;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Effective Time' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME = 333;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CODE = 334;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Advance Directive Verification' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_VERIFICATION = 335;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Advance Directive Status Observation' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION = 336;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Advance Directive Reference' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_REFERENCE = 337;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Advance Directive Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 338;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Verification Template Id' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID = 428;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Verification Type Code' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE = 429;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Verification Time' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TIME = 430;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Entry Relationship Type Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE = 431;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Entry Relationship Target' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET = 432;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Has Performers' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_HAS_PERFORMERS = 433;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Template Id' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_TEMPLATE_ID = 346;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Class Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CLASS_CODE = 347;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Mood Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_MOOD_CODE = 348;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Id' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_ID = 349;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Status Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_STATUS_CODE = 350;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CODE = 351;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Policy Activity' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_POLICY_ACTIVITY = 352;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Payer Entity Is Required' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED = 353;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Covered Party Is Required' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED = 354;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Covered Party Time' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY_TIME = 355;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Subscriber Is Allowed' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED = 356;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Subscriber Time' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER_TIME = 357;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Entry Relationship REFR' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR = 358;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Entry Relationship Target' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET = 359;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Template Id' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_TEMPLATE_ID = 360;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Class Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_CLASS_CODE = 361;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Mood Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_MOOD_CODE = 362;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Id' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ID = 363;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Status Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_STATUS_CODE = 364;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Payer Entity' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_ENTITY = 365;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Covered Party' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY = 366;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Subscriber' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER = 367;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payer Entity Id' of 'Payer Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYER_ENTITY__PAYER_ENTITY_ID = 478;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Covered Party Id' of 'Covered Party'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERED_PARTY__COVERED_PARTY_ID = 479;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Covered Party Code' of 'Covered Party'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERED_PARTY__COVERED_PARTY_CODE = 480;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Subscriber Id' of 'Policy Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_SUBSCRIBER__POLICY_SUBSCRIBER_ID = 481;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Template Id' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_TEMPLATE_ID = 434;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Class Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_CLASS_CODE = 435;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Mood Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_MOOD_CODE = 436;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Id' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ID = 437;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Entry Relationship' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP = 438;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Mood Code Value' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Template Id' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Id' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_ID = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Mood Code' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Instruction Template Id' of 'Patient Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_INSTRUCTION__PATIENT_INSTRUCTION_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Instruction Mood Code' of 'Patient Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_INSTRUCTION__PATIENT_INSTRUCTION_MOOD_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Has Reaction Intervention' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_HAS_REACTION_INTERVENTION = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Reaction Intervention Type Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_REACTION_INTERVENTION_TYPE_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Reaction Intervention Type' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_REACTION_INTERVENTION_TYPE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Mood Code' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MOOD_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Author' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_AUTHOR = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Performer' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PERFORMER = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Participant Location' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Information Source' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_INFORMATION_SOURCE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Product' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PRODUCT = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fulfillment Instruction Template Id' of 'Fulfillment Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_TEMPLATE_ID = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fulfillment Instruction Mood Code' of 'Fulfillment Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_MOOD_CODE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Functional Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 439;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Template Id' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Class Code' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_CLASS_CODE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Template Id' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_TEMPLATE_ID = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Class Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CLASS_CODE = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Mood Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_MOOD_CODE = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CODE = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Status Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_STATUS_CODE = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Value' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_VALUE = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Mood Code Value' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE_VALUE = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Template Id' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Id' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_ID = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Mood Code' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Mood Code Value' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Template Id' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Id' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Mood Code' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Mood Code Value' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE_VALUE = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Template Id' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Id' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_ID = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Mood Code' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Mood Code Value' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE_VALUE = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Template Id' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Id' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ID = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Mood Code' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Mood Code Value' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Template Id' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Id' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_ID = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Mood Code' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Has Medication Or Supply Activity' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY = 290;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 291;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Code' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_CODE = 292;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Template Id' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID = 440;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Mood Code' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_MOOD_CODE = 441;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Code' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE = 442;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Effective Time' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME = 443;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Id' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_ID = 444;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Encounter Location' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_ENCOUNTER_LOCATION = 445;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Performer2' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PERFORMER2 = 446;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Problem Act' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PROBLEM_ACT = 447;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Problem Observation' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PROBLEM_OBSERVATION = 448;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Age Observation' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_AGE_OBSERVATION = 449;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Medication Activity' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY = 450;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Patient Instruction' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PATIENT_INSTRUCTION = 451;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Template Id' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID = 452;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Mood Code' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE = 453;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Code' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_CODE = 454;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Effective Time' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME = 455;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Id' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ID = 456;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Status Code' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE = 457;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Encounter Location' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_LOCATION = 458;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Performer2' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER2 = 459;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Problem Observation' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROBLEM_OBSERVATION = 460;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Age Observation' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_AGE_OBSERVATION = 461;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Medication Activity' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY = 462;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Patient Instruction' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PATIENT_INSTRUCTION = 463;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Problem Act' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROBLEM_ACT = 464;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Template Id' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 465;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Mood Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE = 466;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Code' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CODE = 467;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Effective Time' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME = 468;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Id' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_ID = 469;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Specimen' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN = 470;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Encounter Location' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION = 471;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Performer2' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2 = 472;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Problem Observation' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION = 473;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Problem Act' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT = 474;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Age Observation' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION = 475;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Medication Activity' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY = 476;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Patient Instruction' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION = 477;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Plan Description Class Code' of 'Coverage Plan Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_CLASS_CODE = 482;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Plan Description Id' of 'Coverage Plan Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_ID = 483;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Plan Description Mood Code' of 'Coverage Plan Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_MOOD_CODE = 484;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEMPLATE_ID = 485;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Class Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CLASS_CODE = 486;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Mood Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_MOOD_CODE = 487;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CODE = 488;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Reference Has URL' of 'Advance Directive Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_HAS_URL = 489;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Reference Has MIME Type' of 'Advance Directive Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE = 490;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Reference External Document Has Id' of 'Advance Directive Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID = 491;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Reference Template Id' of 'Advance Directive Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID = 492;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Reference Type Code' of 'Advance Directive Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE = 493;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Reference External Document' of 'Advance Directive Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT = 494;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Cause Of Death Observation Cause Of Death Observation' of 'Family History Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION = 495;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Family History Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 496;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 496;

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
	public CCDValidator() {
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
		return CCDPackage.eINSTANCE;
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
			case CCDPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection) value, diagnostics, context);
			case CCDPackage.MEDICATION_ACTIVITY:
				return validateMedicationActivity((MedicationActivity) value, diagnostics, context);
			case CCDPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return validateMedicationSeriesNumberObservation(
					(MedicationSeriesNumberObservation) value, diagnostics, context);
			case CCDPackage.MEDICATION_STATUS_OBSERVATION:
				return validateMedicationStatusObservation((MedicationStatusObservation) value, diagnostics, context);
			case CCDPackage.STATUS_OBSERVATION:
				return validateStatusObservation((StatusObservation) value, diagnostics, context);
			case CCDPackage.PATIENT_INSTRUCTION:
				return validatePatientInstruction((PatientInstruction) value, diagnostics, context);
			case CCDPackage.REACTION_OBSERVATION:
				return validateReactionObservation((ReactionObservation) value, diagnostics, context);
			case CCDPackage.SEVERITY_OBSERVATION:
				return validateSeverityObservation((SeverityObservation) value, diagnostics, context);
			case CCDPackage.PRODUCT_INSTANCE:
				return validateProductInstance((ProductInstance) value, diagnostics, context);
			case CCDPackage.SUPPLY_ACTIVITY:
				return validateSupplyActivity((SupplyActivity) value, diagnostics, context);
			case CCDPackage.FULFILLMENT_INSTRUCTION:
				return validateFulfillmentInstruction((FulfillmentInstruction) value, diagnostics, context);
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return validateContinuityOfCareDocument((ContinuityOfCareDocument) value, diagnostics, context);
			case CCDPackage.PROBLEM_SECTION:
				return validateProblemSection((ProblemSection) value, diagnostics, context);
			case CCDPackage.PROBLEM_ACT:
				return validateProblemAct((ProblemAct) value, diagnostics, context);
			case CCDPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation) value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection) value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_ORGANIZER:
				return validateFamilyHistoryOrganizer((FamilyHistoryOrganizer) value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_OBSERVATION:
				return validateFamilyHistoryObservation((FamilyHistoryObservation) value, diagnostics, context);
			case CCDPackage.AGE_OBSERVATION:
				return validateAgeObservation((AgeObservation) value, diagnostics, context);
			case CCDPackage.PROBLEM_STATUS_OBSERVATION:
				return validateProblemStatusObservation((ProblemStatusObservation) value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection) value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION:
				return validateSocialHistoryObservation((SocialHistoryObservation) value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_STATUS_OBSERVATION:
				return validateSocialHistoryStatusObservation(
					(SocialHistoryStatusObservation) value, diagnostics, context);
			case CCDPackage.ALERTS_SECTION:
				return validateAlertsSection((AlertsSection) value, diagnostics, context);
			case CCDPackage.RESULTS_SECTION:
				return validateResultsSection((ResultsSection) value, diagnostics, context);
			case CCDPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer) value, diagnostics, context);
			case CCDPackage.RESULT_OBSERVATION:
				return validateResultObservation((ResultObservation) value, diagnostics, context);
			case CCDPackage.PROCEDURES_SECTION:
				return validateProceduresSection((ProceduresSection) value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection) value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_ACTIVITY:
				return validateEncountersActivity((EncountersActivity) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY:
				return validatePlanOfCareActivity((PlanOfCareActivity) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ACT:
				return validatePlanOfCareActivityAct((PlanOfCareActivityAct) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER:
				return validatePlanOfCareActivityEncounter((PlanOfCareActivityEncounter) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION:
				return validatePlanOfCareActivityObservation(
					(PlanOfCareActivityObservation) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return validatePlanOfCareActivityProcedure((PlanOfCareActivityProcedure) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return validatePlanOfCareActivitySubstanceAdministration(
					(PlanOfCareActivitySubstanceAdministration) value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY:
				return validatePlanOfCareActivitySupply((PlanOfCareActivitySupply) value, diagnostics, context);
			case CCDPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection) value, diagnostics, context);
			case CCDPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection) value, diagnostics, context);
			case CCDPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer) value, diagnostics, context);
			case CCDPackage.MEDICAL_EQUIPMENT_SECTION:
				return validateMedicalEquipmentSection((MedicalEquipmentSection) value, diagnostics, context);
			case CCDPackage.FUNCTIONAL_STATUS_SECTION:
				return validateFunctionalStatusSection((FunctionalStatusSection) value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection) value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return validateAdvanceDirectiveObservation((AdvanceDirectiveObservation) value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return validateAdvanceDirectiveStatusObservation(
					(AdvanceDirectiveStatusObservation) value, diagnostics, context);
			case CCDPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection) value, diagnostics, context);
			case CCDPackage.COVERAGE_ACTIVITY:
				return validateCoverageActivity((CoverageActivity) value, diagnostics, context);
			case CCDPackage.POLICY_ACTIVITY:
				return validatePolicyActivity((PolicyActivity) value, diagnostics, context);
			case CCDPackage.PURPOSE_SECTION:
				return validatePurposeSection((PurposeSection) value, diagnostics, context);
			case CCDPackage.PURPOSE_ACTIVITY:
				return validatePurposeActivity((PurposeActivity) value, diagnostics, context);
			case CCDPackage.PROBLEM_OBSERVATION:
				return validateProblemObservation((ProblemObservation) value, diagnostics, context);
			case CCDPackage.PROBLEM_HEALTH_STATUS_OBSERVATION:
				return validateProblemHealthStatusObservation(
					(ProblemHealthStatusObservation) value, diagnostics, context);
			case CCDPackage.PATIENT_AWARENESS:
				return validatePatientAwareness((PatientAwareness) value, diagnostics, context);
			case CCDPackage.ALERT_OBSERVATION:
				return validateAlertObservation((AlertObservation) value, diagnostics, context);
			case CCDPackage.ALERT_STATUS_OBSERVATION:
				return validateAlertStatusObservation((AlertStatusObservation) value, diagnostics, context);
			case CCDPackage.CAUSE_OF_DEATH_OBSERVATION:
				return validateCauseOfDeathObservation((CauseOfDeathObservation) value, diagnostics, context);
			case CCDPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation) value, diagnostics, context);
			case CCDPackage.PRODUCT:
				return validateProduct((Product) value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return validateAdvanceDirectiveVerification((AdvanceDirectiveVerification) value, diagnostics, context);
			case CCDPackage.AUTHORIZATION_ACTIVITY:
				return validateAuthorizationActivity((AuthorizationActivity) value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY:
				return validateProcedureActivity((ProcedureActivity) value, diagnostics, context);
			case CCDPackage.FUNCTIONAL_STATUS_OBSERVATION:
				return validateFunctionalStatusObservation((FunctionalStatusObservation) value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY_ACT:
				return validateProcedureActivityAct((ProcedureActivityAct) value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY_OBSERVATION:
				return validateProcedureActivityObservation((ProcedureActivityObservation) value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureActivityProcedure((ProcedureActivityProcedure) value, diagnostics, context);
			case CCDPackage.PAYER_ENTITY:
				return validatePayerEntity((PayerEntity) value, diagnostics, context);
			case CCDPackage.COVERED_PARTY:
				return validateCoveredParty((CoveredParty) value, diagnostics, context);
			case CCDPackage.POLICY_SUBSCRIBER:
				return validatePolicySubscriber((PolicySubscriber) value, diagnostics, context);
			case CCDPackage.COVERAGE_PLAN_DESCRIPTION:
				return validateCoveragePlanDescription((CoveragePlanDescription) value, diagnostics, context);
			case CCDPackage.SUPPORT_PARTICIPANT:
				return validateSupportParticipant((SupportParticipant) value, diagnostics, context);
			case CCDPackage.SUPPORT:
				return validateSupport((Support) value, diagnostics, context);
			case CCDPackage.SUPPORT_GUARDIAN:
				return validateSupportGuardian((SupportGuardian) value, diagnostics, context);
			case CCDPackage.COMMENT:
				return validateComment((Comment) value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_REFERENCE:
				return validateAdvanceDirectiveReference((AdvanceDirectiveReference) value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION:
				return validateFamilyHistoryCauseOfDeathObservation(
					(FamilyHistoryCauseOfDeathObservation) value, diagnostics, context);
			case CCDPackage.CCD_REGISTRY_DELEGATE:
				return validateCCDRegistryDelegate((CCDRegistryDelegate) value, diagnostics, context);
			default:
				return true;
		}
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
			result &= validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionTemplateId(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionCode(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionTitle(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionText(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateMedicationsSectionMedicationActivity(
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
	 * Validates the validateMedicationsSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionTemplateId(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionCode constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionCode(MedicationsSection medicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionTitle constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionTitle(MedicationsSection medicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionText constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionText(MedicationsSection medicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionMedicationActivity constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionMedicationActivity(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionMedicationActivity(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuityOfCareDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventRequired(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventClassCode(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventEffectiveTime(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCodeFormat(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentNoTemplateIdExtension(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasEffectiveTimeSeconds(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasEffectiveTimeZone(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentOneOrTwoRecordTarget(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthor(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasInformationRecipient(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCode(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationsSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(
				continuityOfCareDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(
				continuityOfCareDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContinuityOfCareDocumentServiceEventRequired constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventRequired(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentServiceEventRequired(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentServiceEventClassCode constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventClassCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentServiceEventClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentServiceEventEffectiveTime constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventEffectiveTime(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentServiceEventEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentLanguageCodeFormat constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCodeFormat(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentLanguageCodeFormat(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentNoTemplateIdExtension constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentNoTemplateIdExtension(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentNoTemplateIdExtension(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasEffectiveTimeSeconds constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasEffectiveTimeSeconds(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasEffectiveTimeSeconds(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasEffectiveTimeZone constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasEffectiveTimeZone(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasEffectiveTimeZone(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentOneOrTwoRecordTarget constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentOneOrTwoRecordTarget(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentOneOrTwoRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasAssignedAuthor constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthor(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasAssignedAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
			diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasInformationRecipient constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasInformationRecipient(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasInformationRecipient(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentTemplateId constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentCode constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentCode(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentLanguageCode constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentProblemSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentFamilyHistorySection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentFamilyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentSocialHistorySection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentAlertsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentAlertsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentMedicationsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentResultsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentProceduresSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentEncountersSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentPlanOfCareSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentImmunizationsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentVitalSignsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentMedicalEquipmentSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentMedicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentFunctionalStatusSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentFunctionalStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentAdvanceDirectivesSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentPayersSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentPayersSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentPurposeSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentPurposeSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemAct, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActEntryRelationshipRequired(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActSubjectOfTarget(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActContainsProblemObservation(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActContainsAlertObservation(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActContainsPatientAwareness(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActTemplateId(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActClassCode(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActMoodCode(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActId(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActCodeNullFlavor(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActEffectiveTime(problemAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemAct_validateProblemActEpisodeObservation(problemAct, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemActEntryRelationshipRequired constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActEntryRelationshipRequired(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActEntryRelationshipRequired(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActSubjectOfTarget constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActSubjectOfTarget(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActSubjectOfTarget(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActContainsProblemObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActContainsProblemObservation(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActContainsProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActContainsAlertObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActContainsAlertObservation(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActContainsAlertObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActContainsPatientAwareness constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActContainsPatientAwareness(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActTemplateId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActTemplateId(ProblemAct problemAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemAct.validateProblemActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActClassCode constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActClassCode(ProblemAct problemAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemAct.validateProblemActClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActMoodCode constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActMoodCode(ProblemAct problemAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemAct.validateProblemActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActId(ProblemAct problemAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemAct.validateProblemActId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActCodeNullFlavor constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActCodeNullFlavor(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActCodeNullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActEffectiveTime constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActEffectiveTime(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActEpisodeObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActEpisodeObservation(ProblemAct problemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActEpisodeObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationInformationSource(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationContainsPatientAwareness(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationTemplateId(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationMoodCode(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationStatusCode(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationEffectiveTime(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationProblemStatus(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationProblemHealthStatus(
				problemObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemObservation_validateProblemObservationAgeObservation(
				problemObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemObservationInformationSource constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationInformationSource(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationContainsPatientAwareness constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationContainsPatientAwareness(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationTemplateId(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationMoodCode constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationMoodCode(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationStatusCode constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationStatusCode(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationEffectiveTime constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationEffectiveTime(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationProblemStatus constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationProblemStatus(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationProblemStatus(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationProblemHealthStatus constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationProblemHealthStatus(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationProblemHealthStatus(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationAgeObservation constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationAgeObservation(
			ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationAgeObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection(ProblemSection problemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSection_validateProblemSectionTemplateId(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSection_validateProblemSectionCode(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSection_validateProblemSectionTitle(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSection_validateProblemSectionText(problemSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSection_validateProblemSectionProblemAct(problemSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemSectionTemplateId constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionTemplateId(ProblemSection problemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionCode constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionCode(ProblemSection problemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionTitle constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionTitle(ProblemSection problemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionText constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionText(ProblemSection problemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionProblemAct constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionProblemAct(ProblemSection problemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionProblemAct(diagnostics, context);
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
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
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
			result &= validateStatusObservation_validateStatusObservationCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				problemStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(
				problemStatusObservation, diagnostics, context);
		}
		return result;
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
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				statusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
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
	 * Validates the validateStatusObservationTargetOfEntryRelationship constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
			StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationTargetOfEntryRelationship(diagnostics, context);
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
	 * Validates the validateStatusObservationNoAdditionalRelationships constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
			StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationNoAdditionalRelationships(diagnostics, context);
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
	public boolean validateProblemHealthStatusObservation(
			ProblemHealthStatusObservation problemHealthStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemHealthStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemHealthStatusObservation_validateStatusObservationTemplateId(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemHealthStatusObservation_validateStatusObservationCode(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				problemHealthStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(
				problemHealthStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Problem Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatusObservation_validateStatusObservationTemplateId(
			ProblemHealthStatusObservation problemHealthStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemHealthStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationCode constraint of '<em>Problem Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatusObservation_validateStatusObservationCode(
			ProblemHealthStatusObservation problemHealthStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemHealthStatusObservation.validateStatusObservationCode(diagnostics, context);
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
			result &= validateEpisodeObservation_validateEpisodeObservationStatusCode(
				episodeObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEpisodeObservation_validateEpisodeObservationCode(
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
	public boolean validateFamilyHistorySection(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistorySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistoryObsOrgs(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionNoSubject(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionCode(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionTitle(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionText(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistoryOrganizer(
				familyHistorySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistorySectionFamilyHistoryObsOrgs constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistoryObsOrgs(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionFamilyHistoryObsOrgs(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionNoSubject constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionNoSubject(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionNoSubject(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionTemplateId constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionCode constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionCode(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionTitle constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionTitle(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionText constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionText(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionText(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionFamilyHistoryOrganizer constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistoryOrganizer(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionFamilyHistoryOrganizer(diagnostics, context);
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
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasSubjectPatientRelationship(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelationshipValueCode(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectCode(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectCodeValueSet(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectSubject(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasGenderCode(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectBirthTime(
				familyHistoryObservation, diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationEffectiveTime(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationMoodCode(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationAgeObservation(
				familyHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationProblemStatusObservation(
				familyHistoryObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryObservationHasSubjectPatientRelationship constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationHasSubjectPatientRelationship(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationHasSubjectPatientRelationship(
			diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationRelationshipValueCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationRelationshipValueCode(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationRelationshipValueCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationHasRelatedSubjectCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectCode(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationHasRelatedSubjectCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationRelatedSubjectCodeValueSet constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectCodeValueSet(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationRelatedSubjectCodeValueSet(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationHasRelatedSubjectSubject constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectSubject(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationHasRelatedSubjectSubject(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationHasGenderCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationHasGenderCode(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationHasGenderCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationRelatedSubjectBirthTime constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectBirthTime(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationRelatedSubjectBirthTime(diagnostics, context);
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
	 * Validates the validateFamilyHistoryObservationEffectiveTime constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationEffectiveTime(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationMoodCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationMoodCode(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationAgeObservation constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationAgeObservation(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationProblemStatusObservation constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationProblemStatusObservation(
			FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationProblemStatusObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasComponent(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasFamilyHistoryObservation(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasSubject(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasSubjectPatientRelationship(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelationshipValueCode(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasRelatedSubjectCode(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasRelatedSubjectSubject(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasGenderCode(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelatedSubjectBirthTime(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerTemplateId(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerStatusCode(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerClassCode(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerMoodCode(
				familyHistoryOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerFamilyHistoryObservation(
				familyHistoryOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasComponent constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasComponent(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasComponent(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasFamilyHistoryObservation constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasFamilyHistoryObservation(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasFamilyHistoryObservation(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasSubject constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasSubject(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasSubject(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasSubjectPatientRelationship constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasSubjectPatientRelationship(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasSubjectPatientRelationship(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerRelationshipValueCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelationshipValueCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerRelationshipValueCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasRelatedSubjectCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasRelatedSubjectCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasRelatedSubjectCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasRelatedSubjectSubject constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasRelatedSubjectSubject(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasRelatedSubjectSubject(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerHasGenderCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasGenderCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerHasGenderCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerRelatedSubjectBirthTime constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelatedSubjectBirthTime(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerRelatedSubjectBirthTime(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerTemplateId constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerTemplateId(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerStatusCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerStatusCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerClassCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerClassCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerMoodCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerMoodCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerFamilyHistoryObservation constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerFamilyHistoryObservation(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerFamilyHistoryObservation(diagnostics, context);
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
			result &= validateResultOrganizer_validateResultOrganizerCodeValue(resultOrganizer, diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerResultObservation(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerSpecimen(resultOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateResultOrganizerCodeValue constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerCodeValue(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerCodeValue(diagnostics, context);
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
	 * Validates the validateResultOrganizerResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerResultObservation(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerSpecimen constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerSpecimen(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerSpecimen(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation(ResultObservation resultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationCodeValue(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationReferenceRangeRequired(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationNoObservationRangeCode(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationInformationSource(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationTemplateId(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationMoodCode(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationId(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationEffectiveTime(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationStatusCode(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationCode(resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationMethodCode(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationInterpretationCode(
				resultObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultObservation_validateResultObservationValue(resultObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateResultObservationCodeValue constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationCodeValue(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationReferenceRangeRequired constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationReferenceRangeRequired(
			ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationReferenceRangeRequired(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationNoObservationRangeCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationNoObservationRangeCode(
			ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationNoObservationRangeCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationInformationSource constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationInformationSource(
			ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationTemplateId(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationMoodCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationMoodCode(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationId(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationEffectiveTime constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationEffectiveTime(
			ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationStatusCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationStatusCode(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationCode(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationMethodCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationMethodCode(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationInterpretationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationInterpretationCode(
			ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationValue constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationValue(ResultObservation resultObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistorySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionPatientRace(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionTemplateId(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionCode(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionTitle(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionText(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(
				socialHistorySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSocialHistorySectionMaritalStatus constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionMaritalStatus(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionReligiousAffiliation constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionReligiousAffiliation(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionPatientRace constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionPatientRace(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionPatientRace(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionPatientRaceCodeSystem constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionPatientRaceCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionPatientEthnicity constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionPatientEthnicity(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionPatientEthnicityCodeSystem constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionPatientEthnicityCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionTemplateId(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionCode constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionCode(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTitle constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionTitle(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionText constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionText(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionText(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionSocialHistoryObservation constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionSocialHistoryObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistoryObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationCodeValueSet(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationTemplateId(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationId(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(
				socialHistoryObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(
				socialHistoryObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSocialHistoryObservationCodeValueSet constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationCodeValueSet(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationCodeValueSet(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationTemplateId constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationTemplateId(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationClassCode constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationId constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationId(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationMoodCode constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationStatusCode constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationSocialHistoryStatusObservation constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationSocialHistoryStatusObservation(
			diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryObservationEpisodeObservation constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationEpisodeObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservation(
			SocialHistoryStatusObservation socialHistoryStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistoryStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(socialHistoryStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryStatusObservation_validateStatusObservationTemplateId(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationCode(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				socialHistoryStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistoryStatusObservation_validateStatusObservationValue(
				socialHistoryStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservation_validateStatusObservationTemplateId(
			SocialHistoryStatusObservation socialHistoryStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return socialHistoryStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservation_validateStatusObservationValue(
			SocialHistoryStatusObservation socialHistoryStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return socialHistoryStatusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection(EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateEncountersSectionTemplateId(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateEncountersSectionCode(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateEncountersSectionTitle(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateEncountersSectionText(encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateEncountersSectionEncountersActivity(
				encountersSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEncountersSectionTemplateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionTemplateId(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionCode constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionCode(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionTitle constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionTitle(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionText constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionText(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionEncountersActivity constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionEncountersActivity(
			EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionEncountersActivity(diagnostics, context);
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
			result &= validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsSectionTemplateId(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsSectionCode(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsSectionTitle(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsSectionText(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(
				immunizationsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateImmunizationsSectionHasMedicationOrSupplyActivity constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionHasMedicationOrSupplyActivity(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionTemplateId(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionCode constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionCode(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionTitle constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionTitle(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionText constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionText(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionMedicationActivity constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionMedicationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionSupplyActivity constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionSupplyActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity(EncountersActivity encountersActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityHasIndications(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityHasPractitioners(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityPractitionerRole(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityTemplateId(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityClassCode(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityMoodCode(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityId(encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityEffectiveTime(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityPatientInstruction(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityAgeObservation(
				encountersActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersActivity_validateEncountersActivityEncounterLocation(
				encountersActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEncountersActivityHasIndications constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityHasIndications(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityHasIndications(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityHasPractitioners constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityHasPractitioners(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityHasPractitioners(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityPractitionerRole constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityPractitionerRole(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityPractitionerRole(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityTemplateId constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityTemplateId(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityClassCode constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityClassCode(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityMoodCode constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityMoodCode(EncountersActivity encountersActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityId constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityId(EncountersActivity encountersActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityEffectiveTime constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityEffectiveTime(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityPatientInstruction constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityPatientInstruction(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityPatientInstruction(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityAgeObservation constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityAgeObservation(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityEncounterLocation constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityEncounterLocation(
			EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityEncounterLocation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity(MedicationActivity medicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityMoodCode(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityHasConsents(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityInformationSource(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityHasReason(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityHasProduct(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityTemplateId(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityId(medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityStatusCode(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityEffectiveTime(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityRouteCode(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityRouteCodeP(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityRateQuantity(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityPerformer(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityReactionObservation(
				medicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationActivity_validateMedicationActivityProductInstance(
				medicationActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationActivityMoodCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMoodCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasDoseQuantityOrRateQuantity constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasDoseQuantityOrRateQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasConsents constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasConsents(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasConsents(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityInformationSource constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityInformationSource(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasPreconditionCriterion constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasPreconditionCriterion(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasReason constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasReason(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasReason(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasReasonProblem constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasReasonProblem(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasReasonProblem(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasProduct constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasProduct(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasProduct(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityTemplateId(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityId constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityId(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityStatusCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityStatusCode(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityEffectiveTime constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityEffectiveTime(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityMaxDoseQuantity constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMaxDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityRouteCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityRouteCode(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityRouteCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityRouteCodeP constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityRouteCodeP(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityRouteCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityDoseQuantity constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityDoseQuantity(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityRateQuantity constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityRateQuantity(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityRateQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityMedicationSeriesNumberObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMedicationSeriesNumberObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityMedicationStatusObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMedicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityPatientInstruction constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityPatientInstruction(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityPatientInstruction(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityPerformer constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityPerformer(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityPerformer(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityReactionObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityReactionObservation(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityReactionObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityProductInstance constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityProductInstance(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityProductInstance(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity(SupplyActivity supplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supplyActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSupply_validateClassCode(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityMoodCode(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityHasAuthor(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityHasPerformer(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityHasParticipantLocation(
				supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityInformationSource(
				supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityHasProduct(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityTemplateId(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityId(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityStatusCode(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityEffectiveTime(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityQuantity(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityRepeatNumber(supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityMedicationStatusObservation(
				supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityFulfillmentInstruction(
				supplyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupplyActivity_validateSupplyActivityProductInstance(supplyActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSupplyActivityMoodCode constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityMoodCode(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasAuthor constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasAuthor(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasPerformer constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasPerformer(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasPerformer(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasParticipantLocation constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasParticipantLocation(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasParticipantLocation(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityInformationSource constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityInformationSource(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasProduct constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasProduct(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasProduct(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityTemplateId constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityTemplateId(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityId constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityId(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityStatusCode constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityStatusCode(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityEffectiveTime constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityEffectiveTime(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityQuantity constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityQuantity(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityRepeatNumber constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityRepeatNumber(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityRepeatNumber(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityMedicationStatusObservation constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityMedicationStatusObservation(
			SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityMedicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityFulfillmentInstruction constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityFulfillmentInstruction(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityFulfillmentInstruction(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityProductInstance constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityProductInstance(SupplyActivity supplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityProductInstance(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection(AlertsSection alertsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alertsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(alertsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertsSection_validateAlertsSectionTemplateId(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertsSection_validateAlertsSectionCode(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertsSection_validateAlertsSectionTitle(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertsSection_validateAlertsSectionText(alertsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertsSection_validateAlertsSectionProblemAct(alertsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAlertsSectionTemplateId constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionTemplateId(AlertsSection alertsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionCode constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionCode(AlertsSection alertsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionTitle constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionTitle(AlertsSection alertsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionText constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionText(AlertsSection alertsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionProblemAct constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionProblemAct(AlertsSection alertsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionProblemAct(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation(AlertObservation alertObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alertObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(alertObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationInformationSource(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationAgentRepresentation(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationPlayingEntityRequired(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationAgentRepresentationVocab(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationParticipantRoleClassCode(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationPlayingEntityClassCode(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationPlayingEntityCode(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationPlayingEntityCodeVocab(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationTemplateId(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationMoodCode(alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationStatusCode(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationEffectiveTime(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationAlertStatusObservation(
				alertObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertObservation_validateAlertObservationReactionObservation(
				alertObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAlertObservationInformationSource constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationInformationSource(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationAgentRepresentation constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationAgentRepresentation(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationAgentRepresentation(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationPlayingEntityRequired constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationPlayingEntityRequired(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationPlayingEntityRequired(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationAgentRepresentationVocab constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationAgentRepresentationVocab(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationAgentRepresentationVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationParticipantRoleClassCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationParticipantRoleClassCode(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationParticipantRoleClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationPlayingEntityClassCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationPlayingEntityClassCode(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationPlayingEntityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationPlayingEntityCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationPlayingEntityCode(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationPlayingEntityCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationPlayingEntityCodeVocab constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationPlayingEntityCodeVocab(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationPlayingEntityCodeVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationTemplateId constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationTemplateId(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationMoodCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationMoodCode(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationStatusCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationStatusCode(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationEffectiveTime constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationEffectiveTime(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationAlertStatusObservation constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationAlertStatusObservation(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationAlertStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationReactionObservation constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationReactionObservation(
			AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationReactionObservation(diagnostics, context);
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
			result &= validateReactionObservation_validateReactionObservationHasReactionIntervention(
				reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationReactionInterventionTypeCode(
				reactionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationReactionInterventionType(
				reactionObservation, diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= validateReactionObservation_validateReactionObservationSeverityObservation(
				reactionObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateReactionObservationHasReactionIntervention constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationHasReactionIntervention(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationHasReactionIntervention(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationReactionInterventionTypeCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationReactionInterventionTypeCode(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationReactionInterventionTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationReactionInterventionType constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationReactionInterventionType(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationReactionInterventionType(diagnostics, context);
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
	 * Validates the validateReactionObservationSeverityObservation constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationSeverityObservation(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationSeverityObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation(SeverityObservation severityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(severityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(severityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverityObservation_validateSeverityObservationTemplateId(
				severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverityObservation_validateSeverityObservationClassCode(
				severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverityObservation_validateSeverityObservationMoodCode(
				severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverityObservation_validateSeverityObservationCode(
				severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverityObservation_validateSeverityObservationStatusCode(
				severityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSeverityObservation_validateSeverityObservationValue(
				severityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSeverityObservationTemplateId constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationTemplateId(
			SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationClassCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationClassCode(
			SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationMoodCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationMoodCode(
			SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationCode(SeverityObservation severityObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationStatusCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationStatusCode(
			SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationValue constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationValue(
			SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation(AlertStatusObservation alertStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alertStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAlertStatusObservation_validateStatusObservationTemplateId(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationCode(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				alertStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(
				alertStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Alert Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation_validateStatusObservationTemplateId(
			AlertStatusObservation alertStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
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
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasSubjectPatientRelationship(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelationshipValueCode(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectCode(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectCodeValueSet(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectSubject(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasGenderCode(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectBirthTime(
				causeOfDeathObservation, diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationEffectiveTime(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationMoodCode(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationAgeObservation(
				causeOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationProblemStatusObservation(
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
	public boolean validateResultsSection(ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultsSection_validateResultsSectionTemplateId(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultsSection_validateResultsSectionCode(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultsSection_validateResultsSectionTitle(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultsSection_validateResultsSectionText(resultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultsSection_validateResultsSectionResultOrganizer(resultsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionTemplateId(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionCode constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionCode(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTitle constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionTitle(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionText constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionText(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionResultOrganizer constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionResultOrganizer(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionResultOrganizer(diagnostics, context);
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
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationStatusCode(
				medicationSeriesNumberObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationCode(
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
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				medicationStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
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
			result &= validateEncounterLocation_validateEncounterLocationHasParticipantRole(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationHasParticipantRoleLocation(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationHasParticipantRoleCode(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationHasParticipantRoleCodeVocab(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationHasPlayingEntity(
				encounterLocation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounterLocation_validateEncounterLocationHasPlayingEntityPlace(
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
	 * Validates the validateEncounterLocationHasParticipantRole constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationHasParticipantRole(
			EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationHasParticipantRole(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationHasParticipantRoleLocation constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationHasParticipantRoleLocation(
			EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationHasParticipantRoleLocation(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationHasParticipantRoleCode constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationHasParticipantRoleCode(
			EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationHasParticipantRoleCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationHasParticipantRoleCodeVocab constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationHasParticipantRoleCodeVocab(
			EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationHasParticipantRoleCodeVocab(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationHasPlayingEntity constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationHasPlayingEntity(
			EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationHasPlayingEntity(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationHasPlayingEntityPlace constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationHasPlayingEntityPlace(
			EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationHasPlayingEntityPlace(diagnostics, context);
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
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(
				product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateManufacturedProduct_validateClassCode(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductHasMaterial(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductHasMaterialCode(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductHasMaterialCodeVocab(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductHasMaterialCodeOriginalText(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductHasMaterialName(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductMayHaveMaterialManufacturer(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductShouldHaveMaterialManufacturer(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductTemplateId(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateProductId(product, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProductHasMaterial constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterial(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateProductHasMaterial(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialCode constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialCode(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateProductHasMaterialCode(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialCodeVocab constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialCodeVocab(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateProductHasMaterialCodeVocab(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialCodeOriginalText constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialCodeOriginalText(Product product,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductHasMaterialCodeOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialName constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialName(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateProductHasMaterialName(diagnostics, context);
	}

	/**
	 * Validates the validateProductMayHaveMaterialManufacturer constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductMayHaveMaterialManufacturer(Product product,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductMayHaveMaterialManufacturer(diagnostics, context);
	}

	/**
	 * Validates the validateProductShouldHaveMaterialManufacturer constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductShouldHaveMaterialManufacturer(Product product,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductShouldHaveMaterialManufacturer(diagnostics, context);
	}

	/**
	 * Validates the validateProductTemplateId constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductTemplateId(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateProductTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProductId constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductId(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateProductId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection(ProceduresSection proceduresSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(proceduresSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSection_validateProceduresSectionHasProcedureActivity(
				proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSection_validateProceduresSectionTemplateId(
				proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSection_validateProceduresSectionCode(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSection_validateProceduresSectionTitle(proceduresSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSection_validateProceduresSectionText(proceduresSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProceduresSectionHasProcedureActivity constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionHasProcedureActivity(
			ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionHasProcedureActivity(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionTemplateId constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionTemplateId(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionCode constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionCode(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionTitle constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionTitle(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionText constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionText(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionCode(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionTitle(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionText(planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(
				planOfCareSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareSectionTemplateId constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionCode constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionCode(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionTitle constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionTitle(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionText constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionText(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityAct constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityAct(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityEncounter constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityEncounter(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityProcedure constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityProcedure(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivitySupply constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivitySupply(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivity(PlanOfCareActivity planOfCareActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planOfCareActivity, diagnostics, context);
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
			result &= validateVitalSignsSection_validateVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateVitalSignsSectionCode(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateVitalSignsSectionTitle(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateVitalSignsSectionText(vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(
				vitalSignsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionCode constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionCode(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionTitle constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionTitle(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionText constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionText(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionText(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicalEquipmentSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionText(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionSupplyActivity(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionMedicationActivity(
				medicalEquipmentSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicalEquipmentSectionTemplateId constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionCode constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionTitle constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionText constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionText(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionSupplyActivity constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionSupplyActivity(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionSupplyActivity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionMedicationActivity constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionMedicationActivity(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionMedicationActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCode(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCodeValueSet(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionValueDatatype(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionIcfCodeSystem(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionProblemStatusObservation(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionResultStatusObservation(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionCode(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateFunctionalStatusSectionText(
				functionalStatusSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFunctionalStatusSectionClinicalStatements constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionClinicalStatements(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionObservationCode constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCode(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionObservationCodeValueSet constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCodeValueSet(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionObservationCodeValueSet(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionValueDatatype constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionValueDatatype(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionValueDatatype(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionIcfCodeSystem constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionIcfCodeSystem(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionIcfCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionProblemStatusObservation constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionProblemStatusObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionProblemStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionResultStatusObservation constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionResultStatusObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionResultStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionTemplateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionCode constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionCode(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionTitle constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionText constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionText(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection(AdvanceDirectivesSection advanceDirectivesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectivesSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionText(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
				advanceDirectivesSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionTemplateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionCode constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionTitle constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionText constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionText(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionAdvanceDirectiveObservation constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection(PayersSection payersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payersSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validatePayersSectionTemplateId(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validatePayersSectionCode(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validatePayersSectionTitle(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validatePayersSectionText(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validatePayersSectionCoverageActivity(payersSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePayersSectionTemplateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionTemplateId(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionCode constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionCode(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionTitle constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionTitle(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionText constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionText(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionCoverageActivity constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionCoverageActivity(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionCoverageActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection(PurposeSection purposeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purposeSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(purposeSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeSection_validatePurposeSectionTemplateId(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeSection_validatePurposeSectionCode(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeSection_validatePurposeSectionTitle(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeSection_validatePurposeSectionText(purposeSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeSection_validatePurposeSectionPurposeActivity(purposeSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePurposeSectionTemplateId constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionTemplateId(PurposeSection purposeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionCode constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionCode(PurposeSection purposeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionTitle constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionTitle(PurposeSection purposeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionText constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionText(PurposeSection purposeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionPurposeActivity constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionPurposeActivity(PurposeSection purposeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionPurposeActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity(PurposeActivity purposeActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purposeActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityHasReason(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityReasonType(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityTemplateId(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityClassCode(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityMoodCode(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityCode(purposeActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePurposeActivity_validatePurposeActivityStatusCode(purposeActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePurposeActivityHasReason constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityHasReason(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityHasReason(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityReasonType constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityReasonType(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityReasonType(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityTemplateId constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityTemplateId(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityClassCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityClassCode(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityMoodCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityMoodCode(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityCode(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityStatusCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityStatusCode(PurposeActivity purposeActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityStatusCode(diagnostics, context);
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
			result &= validateResultOrganizer_validateResultOrganizerCodeValue(
				vitalSignsOrganizer, diagnostics, context);
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
			result &= validateResultOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerStatusCode(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerResultObservation(
				vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateResultOrganizerSpecimen(vitalSignsOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation(AdvanceDirectiveObservation advanceDirectiveObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationTemplateId(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationClassCode(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationMoodCode(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationId(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationStatusCode(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationEffectiveTime(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationCode(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveVerification(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(
				advanceDirectiveObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveReference(
				advanceDirectiveObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(
			diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(
			diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationTemplateId constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationTemplateId(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationClassCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationClassCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationMoodCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationMoodCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationId constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationId(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationStatusCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationStatusCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationEffectiveTime constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationEffectiveTime(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationAdvanceDirectiveVerification constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveVerification(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationAdvanceDirectiveVerification(
			diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(
			diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationAdvanceDirectiveReference constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveReference(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationAdvanceDirectiveReference(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation(
			AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveStatusObservation_validateStatusObservationTemplateId(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationCode(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(
				advanceDirectiveStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation_validateStatusObservationTemplateId(
			AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification(AdvanceDirectiveVerification advanceDirectiveVerification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveVerification, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipant2_validateContextControlCode(
				advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTemplateId(
				advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTypeCode(
				advanceDirectiveVerification, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTime(
				advanceDirectiveVerification, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectiveVerificationTemplateId constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTemplateId(
			AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveVerification.validateAdvanceDirectiveVerificationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveVerificationTypeCode constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTypeCode(
			AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveVerification.validateAdvanceDirectiveVerificationTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveVerificationTime constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTime(
			AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveVerification.validateAdvanceDirectiveVerificationTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity(CoverageActivity coverageActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coverageActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityInformationSource(
				coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivitySequenceNumber(
				coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityTemplateId(
				coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityClassCode(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityMoodCode(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityId(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityStatusCode(
				coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityCode(coverageActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoverageActivity_validateCoverageActivityPolicyActivity(
				coverageActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCoverageActivityInformationSource constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityInformationSource(
			CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivitySequenceNumber constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivitySequenceNumber(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivitySequenceNumber(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityTemplateId constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityTemplateId(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityClassCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityClassCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityMoodCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityMoodCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityId constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityId(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityStatusCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityStatusCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityCode(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityPolicyActivity constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityPolicyActivity(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityPolicyActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(policyActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(policyActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityPayerEntityIsRequired(
				policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityCoveredPartyIsRequired(
				policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityCoveredPartyTime(
				policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivitySubscriberIsAllowed(
				policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivitySubscriberTime(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityEntryRelationshipREFR(
				policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityEntryRelationshipTarget(
				policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityTemplateId(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityClassCode(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityMoodCode(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityId(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityStatusCode(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityPayerEntity(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivityCoveredParty(policyActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicyActivity_validatePolicyActivitySubscriber(policyActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePolicyActivityPayerEntityIsRequired constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityPayerEntityIsRequired(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityPayerEntityIsRequired(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityCoveredPartyIsRequired constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityCoveredPartyIsRequired(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityCoveredPartyIsRequired(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityCoveredPartyTime constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityCoveredPartyTime(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityCoveredPartyTime(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivitySubscriberIsAllowed constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivitySubscriberIsAllowed(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivitySubscriberIsAllowed(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivitySubscriberTime constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivitySubscriberTime(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivitySubscriberTime(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityEntryRelationshipREFR constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityEntryRelationshipREFR(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityEntryRelationshipREFR(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityEntryRelationshipTarget constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityEntryRelationshipTarget(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityEntryRelationshipTarget(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityTemplateId constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityTemplateId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityClassCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityClassCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityMoodCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityMoodCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityId constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityId(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityStatusCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityStatusCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityPayerEntity constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityPayerEntity(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityPayerEntity(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityCoveredParty constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityCoveredParty(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityCoveredParty(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivitySubscriber constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivitySubscriber(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivitySubscriber(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntity(PayerEntity payerEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payerEntity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(payerEntity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateAssignedEntity_validateClassCode(payerEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayerEntity_validatePayerEntityId(payerEntity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePayerEntityId constraint of '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntity_validatePayerEntityId(PayerEntity payerEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return payerEntity.validatePayerEntityId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredParty(CoveredParty coveredParty, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coveredParty, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(coveredParty, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(
				coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoveredParty_validateCoveredPartyId(coveredParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoveredParty_validateCoveredPartyCode(coveredParty, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCoveredPartyId constraint of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredParty_validateCoveredPartyId(CoveredParty coveredParty, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return coveredParty.validateCoveredPartyId(diagnostics, context);
	}

	/**
	 * Validates the validateCoveredPartyCode constraint of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredParty_validateCoveredPartyCode(CoveredParty coveredParty,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveredParty.validateCoveredPartyCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySubscriber(PolicySubscriber policySubscriber, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(policySubscriber, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(
				policySubscriber, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePolicySubscriber_validatePolicySubscriberId(policySubscriber, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePolicySubscriberId constraint of '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySubscriber_validatePolicySubscriberId(PolicySubscriber policySubscriber,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policySubscriber.validatePolicySubscriberId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authorizationActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityEntryRelationshipTypeCode(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityEntryRelationshipTarget(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityHasPerformers(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityTemplateId(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityClassCode(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityMoodCode(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityId(
				authorizationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorizationActivity_validateAuthorizationActivityEntryRelationship(
				authorizationActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAuthorizationActivityEntryRelationshipTypeCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityEntryRelationshipTypeCode(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityEntryRelationshipTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityEntryRelationshipTarget constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityEntryRelationshipTarget(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityEntryRelationshipTarget(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityHasPerformers constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityHasPerformers(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityHasPerformers(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityTemplateId constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityTemplateId(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityClassCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityClassCode(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityMoodCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityMoodCode(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityId constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityId(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityEntryRelationship constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityEntryRelationship(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityEntryRelationship(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct(PlanOfCareActivityAct planOfCareActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityAct, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCodeValue(
				planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActTemplateId(
				planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActId(
				planOfCareActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCode(
				planOfCareActivityAct, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityActMoodCodeValue constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCodeValue(
			PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActTemplateId constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActTemplateId(
			PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActId constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActId(
			PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActMoodCode constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCode(
			PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity(ProcedureActivity procedureActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction(PatientInstruction patientInstruction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientInstruction, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientInstruction_validatePatientInstructionTemplateId(
				patientInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientInstruction_validatePatientInstructionMoodCode(
				patientInstruction, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePatientInstructionTemplateId constraint of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction_validatePatientInstructionTemplateId(
			PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientInstruction.validatePatientInstructionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientInstructionMoodCode constraint of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction_validatePatientInstructionMoodCode(PatientInstruction patientInstruction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientInstruction.validatePatientInstructionMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction(FulfillmentInstruction fulfillmentInstruction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fulfillmentInstruction, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFulfillmentInstruction_validateFulfillmentInstructionTemplateId(
				fulfillmentInstruction, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFulfillmentInstruction_validateFulfillmentInstructionMoodCode(
				fulfillmentInstruction, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFulfillmentInstructionTemplateId constraint of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction_validateFulfillmentInstructionTemplateId(
			FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fulfillmentInstruction.validateFulfillmentInstructionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFulfillmentInstructionMoodCode constraint of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction_validateFulfillmentInstructionMoodCode(
			FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fulfillmentInstruction.validateFulfillmentInstructionMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation(FunctionalStatusObservation functionalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationTargetOfEntryRelationship(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationNoAdditionalRelationships(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusObservation_validateStatusObservationTemplateId(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationClassCode(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationMoodCode(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationCode(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationStatusCode(
				functionalStatusObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStatusObservation_validateStatusObservationValue(
				functionalStatusObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Functional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation_validateStatusObservationTemplateId(
			FunctionalStatusObservation functionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return functionalStatusObservation.validateStatusObservationTemplateId(diagnostics, context);
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
			result &= validateProductInstance_validateProductInstanceHasScopingEntity(
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
	 * Validates the validateProductInstanceHasScopingEntity constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_validateProductInstanceHasScopingEntity(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.validateProductInstanceHasScopingEntity(diagnostics, context);
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
	public boolean validatePlanOfCareActivityObservation(PlanOfCareActivityObservation planOfCareActivityObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCodeValue(
				planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(
				planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(
				planOfCareActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(
				planOfCareActivityObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationMoodCodeValue constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCodeValue(
			PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationTemplateId constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(
			PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationId constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(
			PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationMoodCode constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(
			PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter(PlanOfCareActivityEncounter planOfCareActivityEncounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityEncounter, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCodeValue(
				planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(
				planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterId(
				planOfCareActivityEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCode(
				planOfCareActivityEncounter, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterMoodCodeValue constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCodeValue(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterTemplateId constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterId constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterId(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterMoodCode constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCode(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure(PlanOfCareActivityProcedure planOfCareActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(
				planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(
				planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(
				planOfCareActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(
				planOfCareActivityProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureMoodCodeValue constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(
			PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureTemplateId constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(
			PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureId constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(
			PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureMoodCode constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(
			PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration(
			PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivitySubstanceAdministration, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(
				planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(
				planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationTemplateId(
				planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationId(
				planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCode(
				planOfCareActivitySubstanceAdministration, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(
			PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationTemplateId constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationId constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationId(
			PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationId(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationMoodCode constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCode(
			PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationMoodCode(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply(PlanOfCareActivitySupply planOfCareActivitySupply,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivitySupply, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSupply_validateClassCode(planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCodeValue(
				planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyTemplateId(
				planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyId(
				planOfCareActivitySupply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCode(
				planOfCareActivitySupply, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyMoodCodeValue constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCodeValue(
			PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyTemplateId constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyTemplateId(
			PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyId constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyId(
			PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyMoodCode constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCode(
			PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyMoodCode(diagnostics, context);
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
			result &= validateProcedureActivityAct_validateProcedureActivityActTemplateId(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActMoodCode(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActCode(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActEffectiveTime(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActId(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActEncounterLocation(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActPerformer2(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActProblemAct(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActProblemObservation(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActAgeObservation(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActMedicationActivity(
				procedureActivityAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityAct_validateProcedureActivityActPatientInstruction(
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
	 * Validates the validateProcedureActivityActMoodCode constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActMoodCode(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActCode constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActCode(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActEffectiveTime constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActEffectiveTime(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActId constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActId(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActId(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActEncounterLocation constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActEncounterLocation(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActEncounterLocation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActPerformer2 constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActPerformer2(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActPerformer2(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActProblemAct constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActProblemAct(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActProblemAct(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActProblemObservation constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActProblemObservation(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActAgeObservation constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActAgeObservation(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActMedicationActivity constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActMedicationActivity(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActMedicationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActPatientInstruction constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActPatientInstruction(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActPatientInstruction(diagnostics, context);
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
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationTemplateId(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationMoodCode(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationCode(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationEffectiveTime(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationId(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationStatusCode(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationEncounterLocation(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationPerformer2(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationProblemObservation(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationAgeObservation(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationMedicationActivity(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationPatientInstruction(
				procedureActivityObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityObservation_validateProcedureActivityObservationProblemAct(
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
	 * Validates the validateProcedureActivityObservationMoodCode constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationMoodCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationCode constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationEffectiveTime constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationEffectiveTime(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationId constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationStatusCode constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationStatusCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationEncounterLocation constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationEncounterLocation(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationEncounterLocation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationPerformer2 constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationPerformer2(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationPerformer2(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationProblemObservation constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationProblemObservation(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationAgeObservation constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationAgeObservation(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationMedicationActivity constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationMedicationActivity(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationMedicationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationPatientInstruction constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationPatientInstruction(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationPatientInstruction(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityObservationProblemAct constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationProblemAct(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationProblemAct(diagnostics, context);
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
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureMoodCode(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureEffectiveTime(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureId(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureSpecimen(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureEncounterLocation(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformer2(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureProblemObservation(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureProblemAct(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureAgeObservation(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureMedicationActivity(
				procedureActivityProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedureActivityProcedure_validateProcedureActivityProcedurePatientInstruction(
				procedureActivityProcedure, diagnostics, context);
		}
		return result;
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
	 * Validates the validateProcedureActivityProcedureMoodCode constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureMoodCode(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureMoodCode(diagnostics, context);
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
	 * Validates the validateProcedureActivityProcedureEffectiveTime constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureEffectiveTime(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureId constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureId(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureId(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureSpecimen constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureSpecimen(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureSpecimen(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureEncounterLocation constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureEncounterLocation(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureEncounterLocation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedurePerformer2 constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformer2(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedurePerformer2(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureProblemObservation constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureProblemObservation(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureProblemAct constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureProblemAct(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureProblemAct(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureAgeObservation constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureAgeObservation(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureAgeObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureMedicationActivity constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureMedicationActivity(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureMedicationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedurePatientInstruction constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedurePatientInstruction(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedurePatientInstruction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription(CoveragePlanDescription coveragePlanDescription,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coveragePlanDescription, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoveragePlanDescription_validateCoveragePlanDescriptionClassCode(
				coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoveragePlanDescription_validateCoveragePlanDescriptionId(
				coveragePlanDescription, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCoveragePlanDescription_validateCoveragePlanDescriptionMoodCode(
				coveragePlanDescription, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCoveragePlanDescriptionClassCode constraint of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription_validateCoveragePlanDescriptionClassCode(
			CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveragePlanDescription.validateCoveragePlanDescriptionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoveragePlanDescriptionId constraint of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription_validateCoveragePlanDescriptionId(
			CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveragePlanDescription.validateCoveragePlanDescriptionId(diagnostics, context);
	}

	/**
	 * Validates the validateCoveragePlanDescriptionMoodCode constraint of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription_validateCoveragePlanDescriptionMoodCode(
			CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveragePlanDescription.validateCoveragePlanDescriptionMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportParticipant(SupportParticipant supportParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportParticipant, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateParticipant1_validateContextControlCode(
				supportParticipant, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupport(Support support, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(support, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardian(SupportGuardian supportGuardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportGuardian, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateGuardian_validateGuardianChoice(supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateGuardian_validateClassCode(supportGuardian, diagnostics, context);
		}
		return result;
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
		return result;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference(AdvanceDirectiveReference advanceDirectiveReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveReference, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveReference, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateReference_validateExternalActChoice(
				advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceHasURL(
				advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceHasMIMEType(
				advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceExternalDocumentHasId(
				advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceTemplateId(
				advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceTypeCode(
				advanceDirectiveReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceExternalDocument(
				advanceDirectiveReference, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectiveReferenceHasURL constraint of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceHasURL(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveReference.validateAdvanceDirectiveReferenceHasURL(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveReferenceHasMIMEType constraint of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceHasMIMEType(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveReference.validateAdvanceDirectiveReferenceHasMIMEType(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveReferenceExternalDocumentHasId constraint of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceExternalDocumentHasId(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveReference.validateAdvanceDirectiveReferenceExternalDocumentHasId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveReferenceTemplateId constraint of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceTemplateId(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveReference.validateAdvanceDirectiveReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveReferenceTypeCode constraint of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceTypeCode(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveReference.validateAdvanceDirectiveReferenceTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveReferenceExternalDocument constraint of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveReference_validateAdvanceDirectiveReferenceExternalDocument(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectiveReference.validateAdvanceDirectiveReferenceExternalDocument(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryCauseOfDeathObservation(
			FamilyHistoryCauseOfDeathObservation familyHistoryCauseOfDeathObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryCauseOfDeathObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistoryCauseOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasSubjectPatientRelationship(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelationshipValueCode(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectCode(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectCodeValueSet(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasRelatedSubjectSubject(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationHasGenderCode(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationRelatedSubjectBirthTime(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryCauseOfDeathObservation_validateFamilyHistoryObservationTemplateId(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationId(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationEffectiveTime(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationMoodCode(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationAgeObservation(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationProblemStatusObservation(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryCauseOfDeathObservation_validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(
				familyHistoryCauseOfDeathObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation constraint of '<em>Family History Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryCauseOfDeathObservation_validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(
			FamilyHistoryCauseOfDeathObservation familyHistoryCauseOfDeathObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryCauseOfDeathObservation.validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(
			diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationTemplateId constraint of '<em>Family History Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryCauseOfDeathObservation_validateFamilyHistoryObservationTemplateId(
			FamilyHistoryCauseOfDeathObservation familyHistoryCauseOfDeathObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryCauseOfDeathObservation.validateFamilyHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCCDRegistryDelegate(CCDRegistryDelegate ccdRegistryDelegate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ccdRegistryDelegate, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CCDPlugin.INSTANCE;
	}

} // CCDValidator
