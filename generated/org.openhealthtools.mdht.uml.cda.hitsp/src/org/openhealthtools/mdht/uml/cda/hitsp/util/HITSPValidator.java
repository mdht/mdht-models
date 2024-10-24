/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Comment;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationType;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PastProcedure;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlannedProcedure;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReferralSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.Support;
import org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.hitsp.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredOrScannedDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage
 * @generated
 */
public class HITSPValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HITSPValidator INSTANCE = new HITSPValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.hitsp";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Adverse Event Date' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Adverse Event Type' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Adverse Event Type Vocab' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Allergy Product' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Allergy Product Type Code' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Product Detail Participant Role' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Product Detail Playing Entity' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Product Detail Name' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Product Code' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Allergy Product Food Vocab' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Reaction Text' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Reaction Code' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_CODE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Reaction Code Vocab' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Severity Text' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Severity Code' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Severity Code Vocab' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Template Id' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication First Effective Time Datatype' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_FIRST_EFFECTIVE_TIME_DATATYPE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Dose Units' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_DOSE_UNITS = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Delivery Method Description' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_DELIVERY_METHOD_DESCRIPTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Medication Information' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_MEDICATION_INFORMATION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Status Of Medication' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_STATUS_OF_MEDICATION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Indication' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_INDICATION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Indication Narrative Text' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_INDICATION_NARRATIVE_TEXT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Indication Vocab' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_INDICATION_VOCAB = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Patient Instructions' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_PATIENT_INSTRUCTIONS = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Has Medication Vehicle' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_HAS_MEDICATION_VEHICLE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Medication Vehicle Type' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MEDICATION_VEHICLE_TYPE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Medication Vehicle Class' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MEDICATION_VEHICLE_CLASS = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Medication Vehicle Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MEDICATION_VEHICLE_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Medication Vehicle Name' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MEDICATION_VEHICLE_NAME = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Medication Vehicle Coded Name' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MEDICATION_VEHICLE_CODED_NAME = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Medication Vehicle Coded Name Vocab' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MEDICATION_VEHICLE_CODED_NAME_VOCAB = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Effective Time' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_EFFECTIVE_TIME = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Route Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_ROUTE_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Route Code P' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_ROUTE_CODE_P = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Administration Unit Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Max Dose Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_MAX_DOSE_QUANTITY = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Approach Site Code P' of 'Medication'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_APPROACH_SITE_CODE_P = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Dose Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_DOSE_QUANTITY = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Approach Site Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_APPROACH_SITE_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Type Template Id' of 'Medication Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TYPE__MEDICATION_TYPE_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Type Code' of 'Medication Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TYPE__MEDICATION_TYPE_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Order Number' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ORDER_NUMBER = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Order Expiration' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Quantity Ordered' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Quantity Unit' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Prescription Number' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Assigning Authority' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Dispense Date' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_DISPENSE_DATE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Dispensing Pharmacy Location' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Quantity Dispensed' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Has Fill Number' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Template Id' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Status Code P' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_STATUS_CODE_P = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Order Information Status Code' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_STATUS_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Repeat Number' of 'Medication Order Information'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ORDER_INFORMATION__SUPPLY_ACTIVITY_REPEAT_NUMBER = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Treating Provider' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_TREATING_PROVIDER = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Treatment Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_ENTRY = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Onset Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Unknown Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Code P' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CODE_P = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Age Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Text' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__PROBLEM_ENTRY_TEXT = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Value' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__PROBLEM_ENTRY_VALUE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Problem Status Observation' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Healthcare Provider' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_HEALTHCARE_PROVIDER = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Template Id' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Advance Directives Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Allergies Reactions Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Problem List Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Encounters Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ENCOUNTERS_SECTION = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Immunizations Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_IMMUNIZATIONS_SECTION = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Payers Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PAYERS_SECTION = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Medications Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICATIONS_SECTION = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Surgeries Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_SURGERIES_SECTION = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Plan Of Care Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PLAN_OF_CARE_SECTION = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Pregnancy History Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Vital Signs Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_VITAL_SIGNS_SECTION = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Diagnostic Results Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Condition' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CONDITION = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__HITSP_MEDICATIONS_SECTION_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Section Medication' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__HITSP_MEDICATIONS_SECTION_MEDICATION = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Advance Directives Section Template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__HITSP_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Advance Directives Section Advance Directive' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__HITSP_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Has Starting Time' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_STARTING_TIME = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Has Ending Time' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_ENDING_TIME = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Has Custodian' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_CUSTODIAN = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Participant Type Code' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Participant Role Class Code' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Has Address' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_ADDRESS = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Has Telecom' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_TELECOM = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Has Name Of Agent' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Template Id' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_TEMPLATE_ID = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Effective Time' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_EFFECTIVE_TIME = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Code' of 'Advance Directive'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_OBSERVATION_CODE = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Allergies Reactions Section Template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__HITSP_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Allergies Reactions Section Allergy Drug Sensitivity' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__HITSP_ALLERGIES_REACTIONS_SECTION_ALLERGY_DRUG_SENSITIVITY = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounters Section Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter History Section Encounter Entry' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounter Admission Source Value Set' of 'Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER__HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounter Template Id' of 'Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER__HITSP_ENCOUNTER_TEMPLATE_ID = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounter Code' of 'Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER__HITSP_ENCOUNTER_CODE = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunizations Section Immunization' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunization Refusal Reason' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__HITSP_IMMUNIZATION_REFUSAL_REASON = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunization Coded Product Name' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__HITSP_IMMUNIZATION_CODED_PRODUCT_NAME = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunization Template Id' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__HITSP_IMMUNIZATION_TEMPLATE_ID = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__HITSP_PAYERS_SECTION_TEMPLATE_ID = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Payers Section Insurance Provider' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__HITSP_PAYERS_SECTION_INSURANCE_PROVIDER = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Payment Providers' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYMENT_PROVIDERS = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Payer Entry ID' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYER_ENTRY_ID = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Health Insurance Type' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Insurance Information' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFORMATION = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Insurance Info Source ID' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Insurance Info Source Addr' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Health Plan Coverage Start Time' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Health Plan Coverage Stop Time' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Patient Information' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_PATIENT_INFORMATION = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Member Id' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_MEMBER_ID = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Member Id Root' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_MEMBER_ID_ROOT = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Relationship To Subscriber' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Relationship To Subscriber Code System' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Patient Name' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_PATIENT_NAME = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Subscriber Information' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Subscriber Id' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ID = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Subscriber Id Root' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Subscriber Address' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Financial Responsibility Party Type' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Financial Responsibility Party Type Code' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Financial Responsibility Party Address' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Template Id' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_TEMPLATE_ID = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Code' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_CODE = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Surgeries Section Template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__HITSP_SURGERIES_SECTION_TEMPLATE_ID = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Surgeries Section Procedure Activity' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__HITSP_SURGERIES_SECTION_PROCEDURE_ACTIVITY = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Has Code Original Text' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Performer Assigned Entity' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Template Id' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_TEMPLATE_ID = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Target Site Code' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_TARGET_SITE_CODE = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Code' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_CODE = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Medication' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_MEDICATION = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Immunization' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Encounter' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Procedure' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_PROCEDURE = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Vital Signs Section Vital Sign Entry' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Has Result' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Template Id' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Diagnostic Procedure' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Result' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Result Organizer' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Type Code System' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_TYPE_CODE_SYSTEM = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Laboratory Results Value Set' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_LABORATORY_RESULTS_VALUE_SET = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value Presence' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE_PRESENCE = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Template Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_TEMPLATE_ID = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_OBSERVATION_CODE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Effective Time' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_OBSERVATION_EFFECTIVE_TIME = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Value' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_OBSERVATION_VALUE = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Result Organizer Result' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__HITSP_RESULT_ORGANIZER_RESULT = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Template Id' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_CODE = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Past Illness Section Template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HITSP_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Past Illness Section Condition' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HITSP_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Chief Complaint Section Template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Chief Complaint Section Condition' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__HITSP_CHIEF_COMPLAINT_SECTION_CONDITION = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Reason For Referral Section Condition' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Reason For Referral Section Result' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__HITSP_REASON_FOR_REFERRAL_SECTION_RESULT = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Reason For Referral Section Template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Present Illness Template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HITSP_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Functional Status Section Template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__HITSP_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Admission Diagnosis Section Condition' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Discharge Diagnosis Section Template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__HITSP_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Discharge Diagnosis Section Condition' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__HITSP_DISCHARGE_DIAGNOSIS_SECTION_CONDITION = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Admission Medication History Section Template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__HITSP_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Discharge Medications Section Template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HITSP_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Discharge Medications Section Medication' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HITSP_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__HITSP_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Physical Exam Section Template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Physical Exam Section Condition' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__HITSP_PHYSICAL_EXAM_SECTION_CONDITION = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Review Of Systems Section Template Id' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__HITSP_REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Course Section Template Id' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Medication' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Immunization' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Encounter Entry' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Procedure Entry' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Family History Section Template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Family History Section Family History' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Related Subject Code Value Set' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Has SDT Cid' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_HAS_SDT_CID = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Has Family Name' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_HAS_FAMILY_NAME = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Has Gender Code' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_HAS_GENDER_CODE = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Family Member Condition' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_FAMILY_MEMBER_CONDITION = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Template Id' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_TEMPLATE_ID = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Problem Status Observation' of 'Family History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY__FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__HITSP_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Social History Section Social History' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__HITSP_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Template Id' of 'Social History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY__SOCIAL_HISTORY_TEMPLATE_ID = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Code P' of 'Social History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY__SOCIAL_HISTORY_CODE_P = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Code' of 'Social History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY__SOCIAL_HISTORY_CODE = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Effective Time' of 'Social History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY__SOCIAL_HISTORY_EFFECTIVE_TIME = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Text' of 'Social History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY__SOCIAL_HISTORY_TEXT = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medical Equipment Section Template Id' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__HITSP_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken No Proficiency Level Code' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken Template Id' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_TEMPLATE_ID = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken Mode Code' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_MODE_CODE = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Healthcare Provider Template Id' of 'Healthcare Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCARE_PROVIDER__HEALTHCARE_PROVIDER_TEMPLATE_ID = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__HITSP_COMMENT_TEMPLATE_ID = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Comment Author' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__HITSP_COMMENT_AUTHOR = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Template Id' of 'Medication Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TAPERED_DOSE__HITSP_MEDICATION_TEMPLATE_ID = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Support Guardian Template Id' of 'Support Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORT_GUARDIAN__HITSP_SUPPORT_GUARDIAN_TEMPLATE_ID = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Support Participant Template Id' of 'Support Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORT_PARTICIPANT__HITSP_SUPPORT_PARTICIPANT_TEMPLATE_ID = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document No Structured Data' of 'Unstructured Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document One Patient Per Document' of 'Unstructured Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Template Id' of 'Unstructured Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNSTRUCTURED_DOCUMENT__SCANNED_DOCUMENT_TEMPLATE_ID = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Coded Product Name' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_PRODUCT_NAME = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Coded Product Vocab' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Coded Ingredient Vocab' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Coded Brand Name' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_BRAND_NAME = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Coded Brand Name Vocab' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Free Text Product Name' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Free Text Brand Name' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Template Id' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_TEMPLATE_ID = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Template Id' of 'Referral Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERRAL_SUMMARY__MEDICAL_SUMMARY_TEMPLATE_ID = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Problem List Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Admission Medication History Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Admission Diagnosis Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Advance Directives Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Allergies Reactions Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Discharge Diagnosis Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Discharge Diet' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIET = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Medications Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Diagnostic Results Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Functional Status Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary History Of Present Illness' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Course Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Medical Equipment Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Physical Exam Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Plan Of Care Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary History Of Past Illness Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Review Of Systems Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Medications Administered Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Vital Signs Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Template Id' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__MEDICAL_SUMMARY_TEMPLATE_ID = 258;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 258;

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
	protected CCDValidator ccdValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IHEValidator iheValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org.eclipse.mdht.uml.cda.util.CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDTValidator cdtValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HITSPValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
		iheValidator = IHEValidator.INSTANCE;
		cdaValidator = org.eclipse.mdht.uml.cda.util.CDAValidator.INSTANCE;
		cdtValidator = CDTValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return HITSPPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case HITSPPackage.ALLERGY_DRUG_SENSITIVITY:
				return validateAllergyDrugSensitivity((AllergyDrugSensitivity) value, diagnostics, context);
			case HITSPPackage.MEDICATION:
				return validateMedication((Medication) value, diagnostics, context);
			case HITSPPackage.MEDICATION_TYPE:
				return validateMedicationType((MedicationType) value, diagnostics, context);
			case HITSPPackage.MEDICATION_ORDER_INFORMATION:
				return validateMedicationOrderInformation((MedicationOrderInformation) value, diagnostics, context);
			case HITSPPackage.CONDITION:
				return validateCondition((Condition) value, diagnostics, context);
			case HITSPPackage.CONDITION_ENTRY:
				return validateConditionEntry((ConditionEntry) value, diagnostics, context);
			case HITSPPackage.PATIENT_SUMMARY:
				return validatePatientSummary((PatientSummary) value, diagnostics, context);
			case HITSPPackage.PROBLEM_LIST_SECTION:
				return validateProblemListSection((ProblemListSection) value, diagnostics, context);
			case HITSPPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection) value, diagnostics, context);
			case HITSPPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection) value, diagnostics, context);
			case HITSPPackage.ADVANCE_DIRECTIVE:
				return validateAdvanceDirective((AdvanceDirective) value, diagnostics, context);
			case HITSPPackage.ALLERGIES_REACTIONS_SECTION:
				return validateAllergiesReactionsSection((AllergiesReactionsSection) value, diagnostics, context);
			case HITSPPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection) value, diagnostics, context);
			case HITSPPackage.ENCOUNTER:
				return validateEncounter((Encounter) value, diagnostics, context);
			case HITSPPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection) value, diagnostics, context);
			case HITSPPackage.IMMUNIZATION:
				return validateImmunization((Immunization) value, diagnostics, context);
			case HITSPPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection) value, diagnostics, context);
			case HITSPPackage.INSURANCE_PROVIDER:
				return validateInsuranceProvider((InsuranceProvider) value, diagnostics, context);
			case HITSPPackage.SURGERIES_SECTION:
				return validateSurgeriesSection((SurgeriesSection) value, diagnostics, context);
			case HITSPPackage.PROCEDURE:
				return validateProcedure((Procedure) value, diagnostics, context);
			case HITSPPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection) value, diagnostics, context);
			case HITSPPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection) value, diagnostics, context);
			case HITSPPackage.DIAGNOSTIC_RESULTS_SECTION:
				return validateDiagnosticResultsSection((DiagnosticResultsSection) value, diagnostics, context);
			case HITSPPackage.RESULT:
				return validateResult((Result) value, diagnostics, context);
			case HITSPPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer) value, diagnostics, context);
			case HITSPPackage.VITAL_SIGN:
				return validateVitalSign((VitalSign) value, diagnostics, context);
			case HITSPPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return validateHistoryOfPastIllnessSection((HistoryOfPastIllnessSection) value, diagnostics, context);
			case HITSPPackage.CHIEF_COMPLAINT_SECTION:
				return validateChiefComplaintSection((ChiefComplaintSection) value, diagnostics, context);
			case HITSPPackage.REASON_FOR_REFERRAL_SECTION:
				return validateReasonForReferralSection((ReasonForReferralSection) value, diagnostics, context);
			case HITSPPackage.HISTORY_OF_PRESENT_ILLNESS:
				return validateHistoryOfPresentIllness((HistoryOfPresentIllness) value, diagnostics, context);
			case HITSPPackage.FUNCTIONAL_STATUS_SECTION:
				return validateFunctionalStatusSection((FunctionalStatusSection) value, diagnostics, context);
			case HITSPPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return validateHospitalAdmissionDiagnosisSection(
					(HospitalAdmissionDiagnosisSection) value, diagnostics, context);
			case HITSPPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return validateDischargeDiagnosisSection((DischargeDiagnosisSection) value, diagnostics, context);
			case HITSPPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return validateAdmissionMedicationHistorySection(
					(AdmissionMedicationHistorySection) value, diagnostics, context);
			case HITSPPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return validateHospitalDischargeMedicationsSection(
					(HospitalDischargeMedicationsSection) value, diagnostics, context);
			case HITSPPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return validateMedicationsAdministeredSection(
					(MedicationsAdministeredSection) value, diagnostics, context);
			case HITSPPackage.PHYSICAL_EXAM_SECTION:
				return validatePhysicalExamSection((PhysicalExamSection) value, diagnostics, context);
			case HITSPPackage.REVIEW_OF_SYSTEMS_SECTION:
				return validateReviewOfSystemsSection((ReviewOfSystemsSection) value, diagnostics, context);
			case HITSPPackage.HOSPITAL_COURSE_SECTION:
				return validateHospitalCourseSection((HospitalCourseSection) value, diagnostics, context);
			case HITSPPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection) value, diagnostics, context);
			case HITSPPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection) value, diagnostics, context);
			case HITSPPackage.FAMILY_HISTORY:
				return validateFamilyHistory((FamilyHistory) value, diagnostics, context);
			case HITSPPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection) value, diagnostics, context);
			case HITSPPackage.SOCIAL_HISTORY:
				return validateSocialHistory((SocialHistory) value, diagnostics, context);
			case HITSPPackage.MEDICAL_EQUIPMENT_SECTION:
				return validateMedicalEquipmentSection((MedicalEquipmentSection) value, diagnostics, context);
			case HITSPPackage.LANGUAGE_SPOKEN:
				return validateLanguageSpoken((LanguageSpoken) value, diagnostics, context);
			case HITSPPackage.HEALTHCARE_PROVIDER:
				return validateHealthcareProvider((HealthcareProvider) value, diagnostics, context);
			case HITSPPackage.COMMENT:
				return validateComment((Comment) value, diagnostics, context);
			case HITSPPackage.MEDICATION_NORMAL_DOSE:
				return validateMedicationNormalDose((MedicationNormalDose) value, diagnostics, context);
			case HITSPPackage.MEDICATION_SPLIT_DOSE:
				return validateMedicationSplitDose((MedicationSplitDose) value, diagnostics, context);
			case HITSPPackage.MEDICATION_TAPERED_DOSE:
				return validateMedicationTaperedDose((MedicationTaperedDose) value, diagnostics, context);
			case HITSPPackage.MEDICATION_CONDITIONAL_DOSE:
				return validateMedicationConditionalDose((MedicationConditionalDose) value, diagnostics, context);
			case HITSPPackage.MEDICATION_COMBINATION_MEDICATION:
				return validateMedicationCombinationMedication(
					(MedicationCombinationMedication) value, diagnostics, context);
			case HITSPPackage.SUPPORT:
				return validateSupport((Support) value, diagnostics, context);
			case HITSPPackage.SUPPORT_GUARDIAN:
				return validateSupportGuardian((SupportGuardian) value, diagnostics, context);
			case HITSPPackage.SUPPORT_PARTICIPANT:
				return validateSupportParticipant((SupportParticipant) value, diagnostics, context);
			case HITSPPackage.UNSTRUCTURED_DOCUMENT:
				return validateUnstructuredDocument((UnstructuredDocument) value, diagnostics, context);
			case HITSPPackage.MEDICATION_INFORMATION:
				return validateMedicationInformation((MedicationInformation) value, diagnostics, context);
			case HITSPPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT:
				return validateUnstructuredOrScannedDocument(
					(UnstructuredOrScannedDocument) value, diagnostics, context);
			case HITSPPackage.REFERRAL_SUMMARY:
				return validateReferralSummary((ReferralSummary) value, diagnostics, context);
			case HITSPPackage.DISCHARGE_SUMMARY:
				return validateDischargeSummary((DischargeSummary) value, diagnostics, context);
			case HITSPPackage.PLANNED_PROCEDURE:
				return validatePlannedProcedure((PlannedProcedure) value, diagnostics, context);
			case HITSPPackage.PAST_PROCEDURE:
				return validatePastProcedure((PastProcedure) value, diagnostics, context);
			case HITSPPackage.HITSP_REGISTRY_DELEGATE:
				return validateHITSPRegistryDelegate((HITSPRegistryDelegate) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergyDrugSensitivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActClassCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActId(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryHasRelatedObservations(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryRelatedObservationsTypeCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryHasRelatedReferencesTypeCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryTemplateId(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTime(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernTemplateId(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernAllergyIntolerance(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAdverseEventDate(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAdverseEventType(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAdverseEventTypeVocab(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProduct(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductTypeCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailParticipantRole(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailPlayingEntity(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailName(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductFoodVocab(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductMedClassVocab(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityReactionText(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityReactionCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityReactionCodeVocab(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivitySeverityText(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivitySeverityCode(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivitySeverityCodeVocab(
				allergyDrugSensitivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityTemplateId(
				allergyDrugSensitivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAdverseEventDate constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAdverseEventDate(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAdverseEventDate(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAdverseEventType constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAdverseEventType(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAdverseEventType(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAdverseEventTypeVocab constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAdverseEventTypeVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAdverseEventTypeVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAllergyProduct constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProduct(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAllergyProduct(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAllergyProductTypeCode constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductTypeCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAllergyProductTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityProductDetailParticipantRole constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailParticipantRole(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityProductDetailParticipantRole(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityProductDetailPlayingEntity constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailPlayingEntity(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityProductDetailPlayingEntity(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityProductDetailName constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductDetailName(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityProductDetailName(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityProductCode constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityProductCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityProductCode(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAllergyProductFoodVocab constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductFoodVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAllergyProductFoodVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAllergyProductMedClassVocab constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductMedClassVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAllergyProductMedClassVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityAllergyProductSpecificMedVocab constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
			diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityReactionText constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityReactionText(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityReactionText(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityReactionCode constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityReactionCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityReactionCode(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityReactionCodeVocab constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityReactionCodeVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityReactionCodeVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivitySeverityText constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivitySeverityText(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivitySeverityText(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivitySeverityCode constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivitySeverityCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivitySeverityCode(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivitySeverityCodeVocab constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivitySeverityCodeVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivitySeverityCodeVocab(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyDrugSensitivityTemplateId constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityTemplateId(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medication, diagnostics, context);
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
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityStatusCode(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityEffectiveTime(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasDosing(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDosingRelationship(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasProductEntry(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasIntructionsInversion(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductStrength(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductName(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationPreconditionReference(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasSupplyEntryInversion(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasFillNumber(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationTemplateId(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationRateQuantity(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDoseUnits(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDeliveryMethodDescription(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationInformation(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasStatusOfMedication(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndication(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationNarrativeText(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationVocab(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasPatientInstructions(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationVehicle(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleType(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleClass(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleName(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedName(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationTemplateId(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationEffectiveTime(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCode(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCodeP(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationAdministrationUnitCode(
				medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMaxDoseQuantity(medication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCodeP(medication, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationFirstEffectiveTimeDatatype constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationFirstEffectiveTimeDatatype(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationDoseUnits constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationDoseUnits(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationDoseUnits(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationDeliveryMethodDescription constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationDeliveryMethodDescription(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationDeliveryMethodDescription(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasMedicationInformation constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasMedicationInformation(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasMedicationInformation(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasStatusOfMedication constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasStatusOfMedication(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasStatusOfMedication(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasIndication constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasIndication(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasIndication(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasIndicationNarrativeText constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasIndicationNarrativeText(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasIndicationNarrativeText(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasIndicationVocab constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasIndicationVocab(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasIndicationVocab(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasPatientInstructions constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasPatientInstructions(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasPatientInstructions(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationHasMedicationVehicle constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationHasMedicationVehicle(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationHasMedicationVehicle(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMedicationVehicleType constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMedicationVehicleType(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMedicationVehicleType(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMedicationVehicleClass constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMedicationVehicleClass(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMedicationVehicleClass(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMedicationVehicleCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMedicationVehicleCode(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMedicationVehicleCode(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMedicationVehicleName constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMedicationVehicleName(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMedicationVehicleName(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMedicationVehicleCodedName constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMedicationVehicleCodedName(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMedicationVehicleCodedName(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMedicationVehicleCodedNameVocab constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMedicationVehicleCodedNameVocab(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationTemplateId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationTemplateId(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationEffectiveTime constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationEffectiveTime(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationRouteCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationRouteCode(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationRouteCode(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationRouteCodeP constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationRouteCodeP(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationRouteCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationAdministrationUnitCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationAdministrationUnitCode(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationAdministrationUnitCode(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationMaxDoseQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationMaxDoseQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationMaxDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationApproachSiteCodeP constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationApproachSiteCodeP(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationApproachSiteCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationDoseQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationDoseQuantity(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationDoseQuantity(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationType, diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationOrderInformation, diagnostics, context);
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
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityMoodCode(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasAuthor(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasPerformer(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasParticipantLocation(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityInformationSource(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasProduct(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityTemplateId(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityId(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityStatusCode(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityEffectiveTime(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyActivityQuantity(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateSupplyActivityRepeatNumber(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityMedicationStatusObservation(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityFulfillmentInstruction(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityProductInstance(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasIntentAuthor(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasAuthorTime(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasAssignedAuthor(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasAssignedAuthorID(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasAssignedAuthorPersonOrOrg(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasPerformerTimeEvent(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasPerformerTimeIntent(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasPerformerAssignedEntity(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasPerformerAssignedEntityID(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryHasPerformerEntityPersonOrOrg(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryQuantityHasValue(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryTemplateId(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSupplyEntry_validateSupplyEntryMedicationFullfillmentInstructions(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationOrderNumber(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationOrderExpiration(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationQuantityOrdered(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationQuantityUnit(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationPrescriptionNumber(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationAssigningAuthority(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationDispenseDate(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationDispensingPharmacyLocation(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationQuantityDispensed(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationHasFillNumber(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationTemplateId(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationStatusCodeP(
				medicationOrderInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationOrderInformation_validateMedicationOrderInformationStatusCode(
				medicationOrderInformation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationOrderInformationOrderNumber constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationOrderNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationOrderNumber(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationOrderExpiration constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationOrderExpiration(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationOrderExpiration(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationQuantityOrdered constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationQuantityOrdered(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationQuantityOrdered(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationQuantityUnit constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationQuantityUnit(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationQuantityUnit(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationPrescriptionNumber constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationPrescriptionNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationPrescriptionNumber(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationAssigningAuthority constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationAssigningAuthority(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationAssigningAuthority(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationDispenseDate constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationDispenseDate(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationDispenseDate(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationDispensingPharmacyLocation constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationDispensingPharmacyLocation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationDispensingPharmacyLocation(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationQuantityDispensed constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationQuantityDispensed(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationQuantityDispensed(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationOrderInformationHasFillNumber constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationHasFillNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationHasFillNumber(diagnostics, context);
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
	 * Validates the validateMedicationOrderInformationStatusCodeP constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateMedicationOrderInformationStatusCodeP(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateMedicationOrderInformationStatusCodeP(diagnostics, context);
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
	 * Validates the validateSupplyActivityRepeatNumber constraint of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformation_validateSupplyActivityRepeatNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationOrderInformation.validateSupplyActivityRepeatNumber(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(condition, diagnostics, context);
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
			result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActClassCode(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryHasRelatedObservations(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryRelatedObservationsTypeCode(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryHasRelatedReferencesTypeCode(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryTemplateId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTime(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemConcernEntry_validateProblemConcernEntryTemplateId(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(
				condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionHasTreatingProvider(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionHasProviderId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionHasProviderTreatmentTime(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionTemplateId(condition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCondition_validateConditionEntry(condition, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateConditionHasTreatingProvider constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasTreatingProvider(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasTreatingProvider(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasProviderId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasProviderId(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionHasProviderId(diagnostics, context);
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
	 * Validates the validateConditionEntry constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionEntry(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condition.validateConditionEntry(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(conditionEntry, diagnostics, context);
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
			result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemObservationEffectiveTime(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntryHasTextReference(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntryCommentInversionInd(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntryTemplateId(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemObservationCodeP(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemObservationCode(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntryId(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateProblemEntryText(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateProblemEntryValue(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntrySeverity(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateProblemEntryProblemStatusObservation(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntryHealthStatusObservation(
				conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProblemEntry_validateProblemEntryComment(
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
			result &= validateConditionEntry_validateConditionEntryCodeP(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryCode(conditionEntry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConditionEntry_validateConditionEntryAgeObservation(conditionEntry, diagnostics, context);
		}
		return result;
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
	 * Validates the validateConditionEntryCodeP constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCodeP(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCodeP(diagnostics, context);
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
	 * Validates the validateProblemEntryText constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateProblemEntryText(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateProblemEntryText(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryValue constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateProblemEntryValue(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateProblemEntryValue(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryProblemStatusObservation constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateProblemEntryProblemStatusObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateProblemEntryProblemStatusObservation(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(patientSummary, diagnostics, context);
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
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventRequired(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventClassCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventEffectiveTime(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCodeFormat(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentNoTemplateIdExtension(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasEffectiveTimeSeconds(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasEffectiveTimeZone(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentOneOrTwoRecordTarget(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthor(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasInformationRecipient(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryHealthcareProvider(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryTemplateId(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryAdvanceDirectivesSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryAllergiesReactionsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryProblemListSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryEncountersSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryImmunizationsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryPayersSection(patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryMedicationsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummarySurgeriesSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryPlanOfCareSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryPregnancyHistorySection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryVitalSignsSection(
				patientSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientSummary_validatePatientSummaryDiagnosticResultsSection(
				patientSummary, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePatientSummaryHealthcareProvider constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryHealthcareProvider(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryHealthcareProvider(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryTemplateId constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryTemplateId(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryAdvanceDirectivesSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryAdvanceDirectivesSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryAllergiesReactionsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryAllergiesReactionsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryAllergiesReactionsSection(diagnostics, context);
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
	 * Validates the validatePatientSummaryEncountersSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryEncountersSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryImmunizationsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryImmunizationsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryPayersSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryPayersSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryPayersSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryMedicationsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryMedicationsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummarySurgeriesSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummarySurgeriesSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummarySurgeriesSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryPlanOfCareSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryPlanOfCareSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryPregnancyHistorySection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryPregnancyHistorySection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryPregnancyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryVitalSignsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryVitalSignsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryDiagnosticResultsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryDiagnosticResultsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryDiagnosticResultsSection(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(problemListSection, diagnostics, context);
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
			result &= ccdValidator.validateProblemSection_validateProblemSectionTemplateId(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemSection_validateProblemSectionCode(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemSection_validateProblemSectionTitle(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemSection_validateProblemSectionText(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProblemSection_validateProblemSectionProblemAct(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateActiveProblemsSection_validateActiveProblemsSectionTemplateId(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateActiveProblemsSection_validateActiveProblemsSectionProblemConcernEntry(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionTemplateId(
				problemListSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemListSection_validateProblemListSectionCondition(
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
	 * Validates the validateProblemListSectionCondition constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionCondition(ProblemListSection problemListSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionCondition(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationsSection, diagnostics, context);
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
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTemplateId(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionCode(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionText(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionMedicationActivity(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionSupplyActivity(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicationsSection_validateIHEMedicationsSectionTemplateId(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicationsSection_validateIHEMedicationsSectionMedication(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateHITSPMedicationsSectionTemplateId(
				medicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSection_validateHITSPMedicationsSectionMedication(
				medicationsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationsSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateHITSPMedicationsSectionTemplateId(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateHITSPMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationsSectionMedication constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateHITSPMedicationsSectionMedication(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateHITSPMedicationsSectionMedication(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(advanceDirectivesSection, diagnostics, context);
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
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionText(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateHITSPAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirectivesSection_validateHITSPAdvanceDirectivesSectionAdvanceDirective(
				advanceDirectivesSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPAdvanceDirectivesSectionTemplateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateHITSPAdvanceDirectivesSectionTemplateId(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectivesSection.validateHITSPAdvanceDirectivesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPAdvanceDirectivesSectionAdvanceDirective constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateHITSPAdvanceDirectivesSectionAdvanceDirective(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return advanceDirectivesSection.validateHITSPAdvanceDirectivesSectionAdvanceDirective(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective(AdvanceDirective advanceDirective, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirective, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(advanceDirective, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationTemplateId(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationClassCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationMoodCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationId(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationStatusCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationEffectiveTime(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveObservationCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveVerification(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationAdvanceDirectiveReference(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationTemplateId(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationId(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationStatusCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdvanceDirectiveObservation_validateIHEAdvanceDirectiveObservationHasExternalReference(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdvanceDirectiveObservation_validateIHEAdvanceDirectiveObservationTemplateId(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdvanceDirectiveObservation_validateIHEAdvanceDirectiveObservationRepeatNumber(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdvanceDirectiveObservation_validateIHEAdvanceDirectiveObservationInterpretationCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdvanceDirectiveObservation_validateIHEAdvanceDirectiveObservationTargetSiteCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveHasStartingTime(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveHasEndingTime(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveHasCustodian(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveParticipantTypeCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveParticipantRoleClassCode(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveHasAddress(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveHasTelecom(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveHasNameOfAgent(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveTemplateId(
				advanceDirective, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdvanceDirective_validateAdvanceDirectiveEffectiveTime(
				advanceDirective, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectiveHasStartingTime constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveHasStartingTime(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveHasStartingTime(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveHasEndingTime constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveHasEndingTime(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveHasEndingTime(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveHasCustodian constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveHasCustodian(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveHasCustodian(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveParticipantTypeCode constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveParticipantTypeCode(
			AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveParticipantTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveParticipantRoleClassCode constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveParticipantRoleClassCode(
			AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveParticipantRoleClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveHasAddress constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveHasAddress(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveHasAddress(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveHasTelecom constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveHasTelecom(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveHasTelecom(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveHasNameOfAgent constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveHasNameOfAgent(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveTemplateId constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveTemplateId(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveEffectiveTime constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveEffectiveTime(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationCode constraint of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirective_validateAdvanceDirectiveObservationCode(AdvanceDirective advanceDirective,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirective.validateAdvanceDirectiveObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection(AllergiesReactionsSection allergiesReactionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergiesReactionsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionTemplateId(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionCode(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionTitle(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionText(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionProblemAct(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAllergiesReactionsSection_validateAllergiesReactionsSectionTemplateId(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAllergiesReactionsSection_validateAllergiesReactionsSectionAllergyIntoleranceConcern(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergiesReactionsSection_validateHITSPAllergiesReactionsSectionTemplateId(
				allergiesReactionsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAllergiesReactionsSection_validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(
				allergiesReactionsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPAllergiesReactionsSectionTemplateId constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_validateHITSPAllergiesReactionsSectionTemplateId(
			AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return allergiesReactionsSection.validateHITSPAllergiesReactionsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(
			AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return allergiesReactionsSection.validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(
			diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(encountersSection, diagnostics, context);
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
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionTemplateId(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionCode(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionTitle(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionText(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionEncountersActivity(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterHistorySection_validateEncounterHistorySectionTemplateId(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateEncounterHistorySectionEncounterEntry(
				encountersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSection_validateHITSPEncountersSectionTemplateId(
				encountersSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPEncountersSectionTemplateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateHITSPEncountersSectionTemplateId(
			EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateHITSPEncountersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterHistorySectionEncounterEntry constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncounterHistorySectionEncounterEntry(
			EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncounterHistorySectionEncounterEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounter, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(encounter, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterEntry_validateEncounterEntryTemplateId(
				encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterEntry_validateEncounterEntryClassCode(
				encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterEntry_validateEncounterEntryCode(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterEntry_validateEncounterEntryCodeP(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterEntry_validateEncounterEntryId(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateEncounterEntry_validateEncounterEntryText(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounter_validateHITSPEncounterAdmissionSourceValueSet(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounter_validateHITSPEncounterTemplateId(encounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncounter_validateHITSPEncounterCode(encounter, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPEncounterAdmissionSourceValueSet constraint of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter_validateHITSPEncounterAdmissionSourceValueSet(Encounter encounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounter.validateHITSPEncounterAdmissionSourceValueSet(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPEncounterTemplateId constraint of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter_validateHITSPEncounterTemplateId(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return encounter.validateHITSPEncounterTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPEncounterCode constraint of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter_validateHITSPEncounterCode(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return encounter.validateHITSPEncounterCode(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(immunizationsSection, diagnostics, context);
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
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTemplateId(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunizationsSection_validateIHEImmunizationsSectionTemplateId(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunizationsSection_validateIHEImmunizationsSectionImmunization(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateHITSPImmunizationsSectionTemplateId(
				immunizationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunizationsSection_validateHITSPImmunizationsSectionImmunization(
				immunizationsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateHITSPImmunizationsSectionTemplateId(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateHITSPImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPImmunizationsSectionImmunization constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateHITSPImmunizationsSectionImmunization(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateHITSPImmunizationsSectionImmunization(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(immunization, diagnostics, context);
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
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunization_validateMedicationActivityEffectiveTime(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunization_validateImmunizationComments(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunization_validateImmunizationTemplateId(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunization_validateImmunizationCode(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunization_validateImmunizationStatusCode(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateImmunization_validateImmunizationMoodCode(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunization_validateHITSPImmunizationRefusalReason(immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunization_validateHITSPImmunizationCodedProductName(
				immunization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateImmunization_validateHITSPImmunizationTemplateId(immunization, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPImmunizationRefusalReason constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateHITSPImmunizationRefusalReason(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateHITSPImmunizationRefusalReason(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPImmunizationCodedProductName constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateHITSPImmunizationCodedProductName(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateHITSPImmunizationCodedProductName(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPImmunizationTemplateId constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateHITSPImmunizationTemplateId(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateHITSPImmunizationTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(payersSection, diagnostics, context);
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
			result &= ccdValidator.validatePayersSection_validatePayersSectionTemplateId(
				payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePayersSection_validatePayersSectionCode(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePayersSection_validatePayersSectionTitle(
				payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePayersSection_validatePayersSectionText(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePayersSection_validatePayersSectionCoverageActivity(
				payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePayersSection_validateIHEPayersSectionTemplateId(
				payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePayersSection_validateIHEPayersSectionCoverageEntry(
				payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validateHITSPPayersSectionTemplateId(payersSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePayersSection_validateHITSPPayersSectionInsuranceProvider(
				payersSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPPayersSectionTemplateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateHITSPPayersSectionTemplateId(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateHITSPPayersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPPayersSectionInsuranceProvider constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateHITSPPayersSectionInsuranceProvider(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateHITSPPayersSectionInsuranceProvider(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider(InsuranceProvider insuranceProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(insuranceProvider, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityInformationSource(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivitySequenceNumber(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityTemplateId(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityClassCode(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityMoodCode(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityId(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityStatusCode(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityCode(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityPolicyActivity(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCoverageEntry_validateCoverageEntryTemplateId(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCoverageEntry_validateCoverageEntryPayerEntry(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderPaymentProviders(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderPayerEntryID(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderHealthInsuranceType(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderInsuranceInformation(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderInsuranceInfoSourceID(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderInsuranceInfoSourceAddr(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderHealthPlanCoverageStartTime(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderHealthPlanCoverageStopTime(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderPatientInformation(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderMemberId(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderMemberIdRoot(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderRelationshipToSubscriber(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderRelationshipToSubscriberCodeSystem(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderPatientName(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderSubscriberInformation(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderSubscriberId(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderSubscriberIdRoot(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderSubscriberAddress(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderFinancialResponsibilityPartyType(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderFinancialResponsibilityPartyTypeCode(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderFinancialResponsibilityPartyAddress(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderTemplateId(
				insuranceProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInsuranceProvider_validateInsuranceProviderCode(insuranceProvider, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateInsuranceProviderPaymentProviders constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderPaymentProviders(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderPaymentProviders(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderPayerEntryID constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderPayerEntryID(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderPayerEntryID(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderHealthInsuranceType constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderHealthInsuranceType(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderHealthInsuranceType(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderInsuranceInformation constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderInsuranceInformation(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderInsuranceInformation(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderInsuranceInfoSourceID constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderInsuranceInfoSourceID(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderInsuranceInfoSourceID(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderInsuranceInfoSourceAddr constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderInsuranceInfoSourceAddr(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderInsuranceInfoSourceAddr(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderHealthPlanCoverageStartTime constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderHealthPlanCoverageStartTime(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderHealthPlanCoverageStartTime(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderHealthPlanCoverageStopTime constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderHealthPlanCoverageStopTime(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderHealthPlanCoverageStopTime(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderPatientInformation constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderPatientInformation(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderPatientInformation(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderMemberId constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderMemberId(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderMemberId(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderMemberIdRoot constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderMemberIdRoot(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderMemberIdRoot(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderRelationshipToSubscriber constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderRelationshipToSubscriber(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderRelationshipToSubscriber(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderRelationshipToSubscriberCodeSystem constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderRelationshipToSubscriberCodeSystem(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderRelationshipToSubscriberCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderPatientName constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderPatientName(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderPatientName(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderSubscriberInformation constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderSubscriberInformation(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderSubscriberInformation(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderSubscriberId constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderSubscriberId(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderSubscriberId(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderSubscriberIdRoot constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderSubscriberIdRoot(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderSubscriberIdRoot(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderSubscriberAddress constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderSubscriberAddress(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderSubscriberAddress(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderFinancialResponsibilityPartyType constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderFinancialResponsibilityPartyType(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderFinancialResponsibilityPartyType(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderFinancialResponsibilityPartyTypeCode constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderFinancialResponsibilityPartyTypeCode(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderFinancialResponsibilityPartyTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderFinancialResponsibilityPartyAddress constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderFinancialResponsibilityPartyAddress(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderFinancialResponsibilityPartyAddress(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderTemplateId constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderTemplateId(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInsuranceProviderCode constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderCode(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderCode(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(surgeriesSection, diagnostics, context);
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
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionHasProcedureActivity(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionText(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSurgeriesSection_validateSurgeriesSectionTemplateId(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedSurgeriesSection_validateCodedSurgeriesSectionTemplateId(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedSurgeriesSection_validateCodedSurgeriesSectionExternalReference(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedSurgeriesSection_validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesSection_validateHITSPSurgeriesSectionTemplateId(
				surgeriesSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSurgeriesSection_validateHITSPSurgeriesSectionProcedureActivity(
				surgeriesSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPSurgeriesSectionTemplateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateHITSPSurgeriesSectionTemplateId(SurgeriesSection surgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateHITSPSurgeriesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPSurgeriesSectionProcedureActivity constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateHITSPSurgeriesSectionProcedureActivity(
			SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateHITSPSurgeriesSectionProcedureActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(procedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryMoodCode(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryHasTextReference(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryPriorityCode(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryHasInversionIndForEncounter(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryTemplateId(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryClassCode(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryText(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryApproachSiteCode(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryInternalReference(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryInternalReferenceReason(
				procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureHasCodeOriginalText(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedurePerformerAssignedEntity(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureTemplateId(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureTargetSiteCode(procedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureCode(procedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPProcedureHasCodeOriginalText constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureHasCodeOriginalText(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedureHasCodeOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedurePerformerAssignedEntity constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedurePerformerAssignedEntity(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedurePerformerAssignedEntity(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedureTemplateId constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureTemplateId(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedure.validateHITSPProcedureTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedureTargetSiteCode constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureTargetSiteCode(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedureTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedureCode constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return procedure.validateHITSPProcedureCode(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(planOfCareSection, diagnostics, context);
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
			result &= cdtValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTitle(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCarePlanSection_validateCarePlanSectionTemplateId(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validateHITSPPlanOfCareSectionTemplateId(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validateHITSPPlanOfCareSectionMedication(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validateHITSPPlanOfCareSectionImmunization(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validateHITSPPlanOfCareSectionEncounter(
				planOfCareSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanOfCareSection_validateHITSPPlanOfCareSectionProcedure(
				planOfCareSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPPlanOfCareSectionTemplateId constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateHITSPPlanOfCareSectionTemplateId(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateHITSPPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPPlanOfCareSectionMedication constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateHITSPPlanOfCareSectionMedication(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateHITSPPlanOfCareSectionMedication(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPPlanOfCareSectionImmunization constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateHITSPPlanOfCareSectionImmunization(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateHITSPPlanOfCareSectionImmunization(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPPlanOfCareSectionEncounter constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateHITSPPlanOfCareSectionEncounter(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateHITSPPlanOfCareSectionEncounter(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPPlanOfCareSectionProcedure constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateHITSPPlanOfCareSectionProcedure(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateHITSPPlanOfCareSectionProcedure(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(vitalSignsSection, diagnostics, context);
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
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionCode(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTitle(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionText(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedVitalSignsSection_validateCodedVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedVitalSignsSection_validateCodedVitalSignsSectionVitalSignsOrganizer(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateHITSPVitalSignsSectionVitalSignEntry(
				vitalSignsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSection_validateHITSPVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPVitalSignsSectionVitalSignEntry constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateHITSPVitalSignsSectionVitalSignEntry(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateHITSPVitalSignsSectionVitalSignEntry(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateHITSPVitalSignsSectionTemplateId(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateHITSPVitalSignsSectionTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(diagnosticResultsSection, diagnostics, context);
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
			result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionTemplateId(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionCode(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionProcedureEntry(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionExternalReference(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionSimpleObservation(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionHasResult(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionDiagnosticProcedure(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionResult(
				diagnosticResultsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionResultOrganizer(
				diagnosticResultsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDiagnosticResultsSectionHasResult constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionHasResult(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionHasResult(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionTemplateId constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionDiagnosticProcedure constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionDiagnosticProcedure(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionDiagnosticProcedure(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionResult constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionResult(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionResult(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionResultOrganizer constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionResultOrganizer(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionResultOrganizer(diagnostics, context);
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
			theResult &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(
				result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(
				result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				result, diagnostics, context);
		}
		if (theResult || diagnostics != null) {
			theResult &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(
				result, diagnostics, context);
		}

		return theResult;
	}

	/**
	 * Validates the validateResultTypeCodeSystem constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultTypeCodeSystem(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultTypeCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateResultLaboratoryResultsValueSet constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultLaboratoryResultsValueSet(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultLaboratoryResultsValueSet(diagnostics, context);
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
	 * Validates the validateResultObservationCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultObservationCode(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationEffectiveTime constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultObservationEffectiveTime(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationValue constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultObservationValue(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return result.validateResultObservationValue(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(resultOrganizer, diagnostics, context);
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
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerTemplateId(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(
				resultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultOrganizer_validateHITSPResultOrganizerResult(resultOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPResultOrganizerResult constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateHITSPResultOrganizerResult(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateHITSPResultOrganizerResult(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(vitalSign, diagnostics, context);
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
			result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationTemplateId(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationId(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateResultObservation_validateResultObservationValue(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationTemplateId(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationId(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationStatusCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationTemplateId(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationInterpretationCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationMethodCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationValue(
				vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateVitalSignTemplateId(vitalSign, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSign_validateVitalSignCode(vitalSign, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignTemplateId constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateVitalSignTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSign.validateVitalSignCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection(HistoryOfPastIllnessSection historyOfPastIllnessSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyOfPastIllnessSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionTemplateId(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validatePastMedicalHistorySection_validatePastMedicalHistorySectionHasClinicalStatements(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validatePastMedicalHistorySection_validatePastMedicalHistorySectionTemplateId(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validatePastMedicalHistorySection_validatePastMedicalHistorySectionCode(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validatePastMedicalHistorySection_validatePastMedicalHistorySectionText(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryOfPastIllnessSection_validateHITSPHistoryOfPastIllnessSectionTemplateId(
				historyOfPastIllnessSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryOfPastIllnessSection_validateHITSPHistoryOfPastIllnessSectionCondition(
				historyOfPastIllnessSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPHistoryOfPastIllnessSectionTemplateId constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHITSPHistoryOfPastIllnessSectionTemplateId(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHITSPHistoryOfPastIllnessSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPHistoryOfPastIllnessSectionCondition constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHITSPHistoryOfPastIllnessSectionCondition(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHITSPHistoryOfPastIllnessSectionCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chiefComplaintSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(
				chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateChiefComplaintSection_validateChiefComplaintSectionCode(
				chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChiefComplaintSection_validateHITSPChiefComplaintSectionTemplateId(
				chiefComplaintSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChiefComplaintSection_validateHITSPChiefComplaintSectionCondition(
				chiefComplaintSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPChiefComplaintSectionTemplateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateHITSPChiefComplaintSectionTemplateId(
			ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateHITSPChiefComplaintSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPChiefComplaintSectionCondition constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateHITSPChiefComplaintSectionCondition(
			ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateHITSPChiefComplaintSectionCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reasonForReferralSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(
				reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateReasonForReferralSection_validateReasonForReferralSectionCode(
				reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReasonForReferralSection_validateCodedReasonForReferralSectionTemplateId(
				reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedReasonForReferralSection_validateCodedReasonForReferralSectionSimpleObservation(
				reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCodedReasonForReferralSection_validateCodedReasonForReferralSectionProblemEntry(
				reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReasonForReferralSection_validateHITSPReasonForReferralSectionCondition(
				reasonForReferralSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReasonForReferralSection_validateHITSPReasonForReferralSectionResult(
				reasonForReferralSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPReasonForReferralSectionCondition constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateHITSPReasonForReferralSectionCondition(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return reasonForReferralSection.validateHITSPReasonForReferralSectionCondition(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPReasonForReferralSectionResult constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateHITSPReasonForReferralSectionResult(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return reasonForReferralSection.validateHITSPReasonForReferralSectionResult(diagnostics, context);
	}

	/**
	 * Validates the validateCodedReasonForReferralSectionTemplateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateCodedReasonForReferralSectionTemplateId(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return reasonForReferralSection.validateCodedReasonForReferralSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness(HistoryOfPresentIllness historyOfPresentIllness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyOfPresentIllness, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(
				historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(
				historyOfPresentIllness, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHistoryOfPresentIllness_validateHITSPHistoryOfPresentIllnessTemplateId(
				historyOfPresentIllness, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPHistoryOfPresentIllnessTemplateId constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_validateHITSPHistoryOfPresentIllnessTemplateId(
			HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.validateHITSPHistoryOfPresentIllnessTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(functionalStatusSection, diagnostics, context);
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
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCode(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCodeValueSet(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionValueDatatype(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionIcfCodeSystem(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionProblemStatusObservation(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionResultStatusObservation(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCode(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionText(
				functionalStatusSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSection_validateHITSPFunctionalStatusSectionTemplateId(
				functionalStatusSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPFunctionalStatusSectionTemplateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateHITSPFunctionalStatusSectionTemplateId(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateHITSPFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalAdmissionDiagnosisSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionProblemConcernEntry(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalAdmissionDiagnosisSection_validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalAdmissionDiagnosisSection_validateHITSPHospitalAdmissionDiagnosisSectionCondition(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateHITSPHospitalAdmissionDiagnosisSectionCondition constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHITSPHospitalAdmissionDiagnosisSectionCondition(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHITSPHospitalAdmissionDiagnosisSectionCondition(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection(DischargeDiagnosisSection dischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dischargeDiagnosisSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionTemplateId(
				dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionCode(
				dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionProblemConcernEntry(
				dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeDiagnosisSection_validateHITSPDischargeDiagnosisSectionTemplateId(
				dischargeDiagnosisSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeDiagnosisSection_validateHITSPDischargeDiagnosisSectionCondition(
				dischargeDiagnosisSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPDischargeDiagnosisSectionTemplateId constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateHITSPDischargeDiagnosisSectionTemplateId(
			DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateHITSPDischargeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPDischargeDiagnosisSectionCondition constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateHITSPDischargeDiagnosisSectionCondition(
			DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateHITSPDischargeDiagnosisSectionCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(admissionMedicationHistorySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionTemplateId(
				admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionCode(
				admissionMedicationHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAdmissionMedicationHistorySection_validateHITSPAdmissionMedicationHistorySectionTemplateId(
				admissionMedicationHistorySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPAdmissionMedicationHistorySectionTemplateId constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_validateHITSPAdmissionMedicationHistorySectionTemplateId(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return admissionMedicationHistorySection.validateHITSPAdmissionMedicationHistorySectionTemplateId(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalDischargeMedicationsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTemplateId(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionCode(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionMedication(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalDischargeMedicationsSection_validateHITSPHospitalDischargeMedicationsSectionTemplateId(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalDischargeMedicationsSection_validateHITSPHospitalDischargeMedicationsSectionMedication(
				hospitalDischargeMedicationsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPHospitalDischargeMedicationsSectionTemplateId constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHITSPHospitalDischargeMedicationsSectionTemplateId(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHITSPHospitalDischargeMedicationsSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateHITSPHospitalDischargeMedicationsSectionMedication constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHITSPHospitalDischargeMedicationsSectionMedication(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHITSPHospitalDischargeMedicationsSectionMedication(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection(MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsAdministeredSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(
				medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(
				medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(
				medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(
				medicationsAdministeredSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsAdministeredSection_validateHITSPMedicationsAdministeredSectionTemplateId(
				medicationsAdministeredSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationsAdministeredSectionTemplateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateHITSPMedicationsAdministeredSectionTemplateId(
			MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsAdministeredSection.validateHITSPMedicationsAdministeredSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalExamSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validatePhysicalExaminationSection_validatePhysicalExaminationSectionTemplateId(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validatePhysicalExaminationSection_validatePhysicalExaminationSectionCode(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionTemplateId(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionVitalSignsSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionGeneralAppearanceSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionIntegumentarySystemSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionHeadSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEyesSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEarsNoseMouthThroatSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEarsSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionNoseSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionMouthThroatTeethSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionNeckSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEndocrineSystemSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionThoraxLungsSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionChestWallSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionBreastSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionHeartSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionRespiratorySystemSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionAbdomenSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionLymphaticSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionVesselsSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionMusculoskeletalSystemSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionNeurologicSystemSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionGenitaliaSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionRectumSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionExtremitiesSection(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePhysicalExamSection_validateHITSPPhysicalExamSectionTemplateId(
				physicalExamSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePhysicalExamSection_validateHITSPPhysicalExamSectionCondition(
				physicalExamSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPPhysicalExamSectionTemplateId constraint of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection_validateHITSPPhysicalExamSectionTemplateId(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamSection.validateHITSPPhysicalExamSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPPhysicalExamSectionCondition constraint of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection_validateHITSPPhysicalExamSectionCondition(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamSection.validateHITSPPhysicalExamSectionCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection(ReviewOfSystemsSection reviewOfSystemsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reviewOfSystemsSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(
				reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(
				reviewOfSystemsSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReviewOfSystemsSection_validateHITSPReviewOfSystemsSectionTemplateId(
				reviewOfSystemsSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPReviewOfSystemsSectionTemplateId constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateHITSPReviewOfSystemsSectionTemplateId(
			ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateHITSPReviewOfSystemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalCourseSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalCourseSection_validateHospitalCourseSectionTemplateId(
				hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHospitalCourseSection_validateHospitalCourseSectionCode(
				hospitalCourseSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalCourseSection_validateHITSPHospitalCourseSectionTemplateId(
				hospitalCourseSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPHospitalCourseSectionTemplateId constraint of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection_validateHITSPHospitalCourseSectionTemplateId(
			HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalCourseSection.validateHITSPHospitalCourseSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanSection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
				assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
				assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionTemplateId(
				assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionMedication(
				assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionImmunization(
				assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionEncounterEntry(
				assessmentAndPlanSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionProcedureEntry(
				assessmentAndPlanSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionTemplateId(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentAndPlanSection.validateHITSPAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPAssessmentAndPlanSectionMedication constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionMedication(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentAndPlanSection.validateHITSPAssessmentAndPlanSectionMedication(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPAssessmentAndPlanSectionImmunization constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionImmunization(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentAndPlanSection.validateHITSPAssessmentAndPlanSectionImmunization(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPAssessmentAndPlanSectionEncounterEntry constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionEncounterEntry(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentAndPlanSection.validateHITSPAssessmentAndPlanSectionEncounterEntry(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPAssessmentAndPlanSectionProcedureEntry constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionProcedureEntry(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assessmentAndPlanSection.validateHITSPAssessmentAndPlanSectionProcedureEntry(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(familyHistorySection, diagnostics, context);
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
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistoryObsOrgs(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionNoSubject(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionCode(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTitle(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionText(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistoryOrganizer(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyMedicalHistorySection_validateFamilyMedicalHistorySectionTemplateId(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateHITSPFamilyHistorySectionTemplateId(
				familyHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySection_validateHITSPFamilyHistorySectionFamilyHistory(
				familyHistorySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPFamilyHistorySectionTemplateId constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateHITSPFamilyHistorySectionTemplateId(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateHITSPFamilyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPFamilyHistorySectionFamilyHistory constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateHITSPFamilyHistorySectionFamilyHistory(
			FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateHITSPFamilyHistorySectionFamilyHistory(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory(FamilyHistory familyHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistory, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistory, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasComponent(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasFamilyHistoryObservation(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasSubject(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasSubjectPatientRelationship(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelationshipValueCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasRelatedSubjectCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasRelatedSubjectSubject(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerHasGenderCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerRelatedSubjectBirthTime(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerTemplateId(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerStatusCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerClassCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerMoodCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerFamilyHistoryObservation(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerHasParticipant(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerTemplateId(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerCode(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateFamilyHistoryOrganizer_validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryRelatedSubjectCodeValueSet(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryHasSDTCid(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryHasFamilyName(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryHasGenderCode(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryFamilyMemberCondition(
				familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryTemplateId(familyHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistory_validateFamilyHistoryProblemStatusObservation(
				familyHistory, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryRelatedSubjectCodeValueSet constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryRelatedSubjectCodeValueSet(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryRelatedSubjectCodeValueSet(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryHasSDTCid constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryHasSDTCid(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryHasSDTCid(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryHasFamilyName constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryHasFamilyName(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryHasFamilyName(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryHasGenderCode constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryHasGenderCode(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryHasGenderCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryFamilyMemberCondition constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryFamilyMemberCondition(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryFamilyMemberCondition(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryTemplateId constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryTemplateId(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryProblemStatusObservation constraint of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistory_validateFamilyHistoryProblemStatusObservation(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistory.validateFamilyHistoryProblemStatusObservation(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(socialHistorySection, diagnostics, context);
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
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTemplateId(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistorySection_validateIHESocialHistorySectionTemplateId(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateHITSPSocialHistorySectionTemplateId(
				socialHistorySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistorySection_validateHITSPSocialHistorySectionSocialHistory(
				socialHistorySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateHITSPSocialHistorySectionTemplateId(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateHITSPSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPSocialHistorySectionSocialHistory constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateHITSPSocialHistorySectionSocialHistory(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateHITSPSocialHistorySectionSocialHistory(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistory(SocialHistory socialHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistory, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(socialHistory, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationTemplateId(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationId(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSimpleObservation_validateSimpleObservationStatusCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationCodeValueSet(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationTemplateId(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationId(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistoryObservation_validateIHESocialHistoryObservationNoRepeatNumber(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistoryObservation_validateIHESocialHistoryObservationNoInterpretationCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistoryObservation_validateIHESocialHistoryObservationNoMethodCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistoryObservation_validateIHESocialHistoryObservationNoTargetSiteCode(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistoryObservation_validateIHESocialHistoryObservationTemplateId(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSocialHistoryObservation_validateIHESocialHistoryObservationValue(
				socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistory_validateSocialHistoryTemplateId(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistory_validateSocialHistoryCodeP(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistory_validateSocialHistoryCode(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistory_validateSocialHistoryEffectiveTime(socialHistory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSocialHistory_validateSocialHistoryText(socialHistory, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateSocialHistoryTemplateId constraint of '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistory_validateSocialHistoryTemplateId(SocialHistory socialHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistory.validateSocialHistoryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryCodeP constraint of '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistory_validateSocialHistoryCodeP(SocialHistory socialHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistory.validateSocialHistoryCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryCode constraint of '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistory_validateSocialHistoryCode(SocialHistory socialHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistory.validateSocialHistoryCode(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryEffectiveTime constraint of '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistory_validateSocialHistoryEffectiveTime(SocialHistory socialHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistory.validateSocialHistoryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistoryText constraint of '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistory_validateSocialHistoryText(SocialHistory socialHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistory.validateSocialHistoryText(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicalEquipmentSection, diagnostics, context);
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
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionText(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionSupplyActivity(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionMedicationActivity(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalDevicesSection_validateMedicalDevicesSectionTemplateId(
				medicalEquipmentSection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicalEquipmentSection_validateHITSPMedicalEquipmentSectionTemplateId(
				medicalEquipmentSection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPMedicalEquipmentSectionTemplateId constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateHITSPMedicalEquipmentSectionTemplateId(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateHITSPMedicalEquipmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken(LanguageSpoken languageSpoken, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(languageSpoken, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(
				languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLanguageSpoken_validateLanguageSpokenNoProficiencyLevelCode(
				languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLanguageSpoken_validateLanguageSpokenTemplateId(languageSpoken, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLanguageSpoken_validateLanguageSpokenModeCode(languageSpoken, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLanguageSpokenNoProficiencyLevelCode constraint of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken_validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken languageSpoken,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageSpoken.validateLanguageSpokenNoProficiencyLevelCode(diagnostics, context);
	}

	/**
	 * Validates the validateLanguageSpokenTemplateId constraint of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken_validateLanguageSpokenTemplateId(LanguageSpoken languageSpoken,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageSpoken.validateLanguageSpokenTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLanguageSpokenModeCode constraint of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken_validateLanguageSpokenModeCode(LanguageSpoken languageSpoken,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageSpoken.validateLanguageSpokenModeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvider(HealthcareProvider healthcareProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthcareProvider, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateHealthcareProvidersPharmacies_validateHealthcareProvidersPharmaciesTemplateId(
				healthcareProvider, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHealthcareProvider_validateHealthcareProviderTemplateId(
				healthcareProvider, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHealthcareProviderTemplateId constraint of '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvider_validateHealthcareProviderTemplateId(
			HealthcareProvider healthcareProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthcareProvider.validateHealthcareProviderTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(comment, diagnostics, context);
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
			result &= iheValidator.validateComment_validateCommentTemplateId(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateComment_validateCommentClassCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateComment_validateCommentMoodCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateComment_validateCommentCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentHasTextReference(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentEffectiveTimeWhenAuthorPresent(
				comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentHasAuthorId(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentHasAuthorOrganization(
				comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentStatusCode(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentText(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateComment_validateIHECommentAuthor(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateHITSPCommentTemplateId(comment, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComment_validateHITSPCommentAuthor(comment, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPCommentTemplateId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateHITSPCommentTemplateId(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateHITSPCommentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPCommentAuthor constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateHITSPCommentAuthor(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateHITSPCommentAuthor(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationNormalDose, diagnostics, context);
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
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityStatusCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityEffectiveTime(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasDosing(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDosingRelationship(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasProductEntry(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasIntructionsInversion(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductStrength(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductName(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationPreconditionReference(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasSupplyEntryInversion(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasFillNumber(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationTemplateId(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationRateQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDoseUnits(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDeliveryMethodDescription(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationInformation(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasStatusOfMedication(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndication(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationNarrativeText(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationVocab(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasPatientInstructions(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationVehicle(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleType(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleClass(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleName(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedName(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationTemplateId(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationEffectiveTime(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCode(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCodeP(medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationAdministrationUnitCode(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMaxDoseQuantity(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCodeP(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateNormalDose_validateNormalDoseNoSubordinateSubstanceAdministration(
				medicationNormalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateNormalDose_validateNormalDoseTemplateId(
				medicationNormalDose, diagnostics, context);
		}
		return result;
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationSplitDose, diagnostics, context);
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
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityStatusCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityEffectiveTime(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasDosing(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDosingRelationship(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasProductEntry(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasIntructionsInversion(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductStrength(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductName(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationPreconditionReference(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasSupplyEntryInversion(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasFillNumber(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationTemplateId(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationRateQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDoseUnits(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDeliveryMethodDescription(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationInformation(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasStatusOfMedication(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndication(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationNarrativeText(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationVocab(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasPatientInstructions(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationVehicle(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleType(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleClass(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleName(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedName(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationTemplateId(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationEffectiveTime(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCode(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCodeP(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationAdministrationUnitCode(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMaxDoseQuantity(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCodeP(medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSplitDose_validateSplitDoseSplitDosingSubstanceAdministration(
				medicationSplitDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateSplitDose_validateSplitDoseTemplateId(
				medicationSplitDose, diagnostics, context);
		}
		return result;
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationTaperedDose, diagnostics, context);
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
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityStatusCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityEffectiveTime(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasDosing(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDosingRelationship(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasProductEntry(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasIntructionsInversion(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductStrength(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductName(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationPreconditionReference(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasSupplyEntryInversion(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasFillNumber(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationTemplateId(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationDoseQuantity(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationRateQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDoseUnits(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDeliveryMethodDescription(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationInformation(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasStatusOfMedication(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndication(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationNarrativeText(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationVocab(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasPatientInstructions(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationVehicle(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleType(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleClass(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleName(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedName(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationTaperedDose_validateHITSPMedicationTemplateId(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationEffectiveTime(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCode(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCodeP(medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationAdministrationUnitCode(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMaxDoseQuantity(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCodeP(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateTaperedDose_validateTaperedDoseTaperedDosingSubstanceAdministration(
				medicationTaperedDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateTaperedDose_validateTaperedDoseTemplateId(
				medicationTaperedDose, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationTemplateId constraint of '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDose_validateHITSPMedicationTemplateId(
			MedicationTaperedDose medicationTaperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationTaperedDose.validateHITSPMedicationTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationConditionalDose, diagnostics, context);
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
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityStatusCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityEffectiveTime(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasDosing(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDosingRelationship(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasProductEntry(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasIntructionsInversion(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductStrength(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductName(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationPreconditionReference(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasSupplyEntryInversion(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasFillNumber(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationTemplateId(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDoseQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationRateQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConditionalDose_validateConditionalDoseConditionalDosingSubstanceAdministration(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateConditionalDose_validateConditionalDoseTemplateId(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDoseUnits(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDeliveryMethodDescription(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationInformation(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasStatusOfMedication(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndication(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationNarrativeText(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationVocab(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasPatientInstructions(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationVehicle(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleType(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleClass(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleName(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedName(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationTemplateId(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationEffectiveTime(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCodeP(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationAdministrationUnitCode(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMaxDoseQuantity(
				medicationConditionalDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCodeP(
				medicationConditionalDose, diagnostics, context);
		}
		return result;
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
			result &= validate_EveryBidirectionalReferenceIsPaired(
				medicationCombinationMedication, diagnostics, context);
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
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityStatusCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationActivityEffectiveTime(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasDosing(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDosingRelationship(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasProductEntry(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasIntructionsInversion(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductStrength(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationProductName(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationPreconditionReference(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasSupplyEntryInversion(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationHasFillNumber(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationTemplateId(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationDoseQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationRateQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedication_validateMedicationCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCombinationMedication_validateCombinationMedicationSubstanceAdministration(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateCombinationMedication_validateCombinationMedicationTemplateId(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationFirstEffectiveTimeDatatype(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDoseUnits(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationDeliveryMethodDescription(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationInformation(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasStatusOfMedication(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndication(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationNarrativeText(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasIndicationVocab(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasPatientInstructions(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationHasMedicationVehicle(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleType(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleClass(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleName(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedName(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMedicationVehicleCodedNameVocab(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationTemplateId(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationEffectiveTime(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationRouteCodeP(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationAdministrationUnitCode(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateHITSPMedicationMaxDoseQuantity(
				medicationCombinationMedication, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedication_validateMedicationApproachSiteCodeP(
				medicationCombinationMedication, diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(supportGuardian, diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianTemplateId(
				supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianAddr(
				supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianClassCode(
				supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianCode(
				supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianTelecom(
				supportGuardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupportGuardian_validateHITSPSupportGuardianTemplateId(
				supportGuardian, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPSupportGuardianTemplateId constraint of '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardian_validateHITSPSupportGuardianTemplateId(SupportGuardian supportGuardian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportGuardian.validateHITSPSupportGuardianTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(supportParticipant, diagnostics, context);
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
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactParticipant_validatePatientContactParticipantTemplateId(
				supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactParticipant_validatePatientContactParticipantTime(
				supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validatePatientContactParticipant_validatePatientContactParticipantTypeCode(
				supportParticipant, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupportParticipant_validateHITSPSupportParticipantTemplateId(
				supportParticipant, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHITSPSupportParticipantTemplateId constraint of '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportParticipant_validateHITSPSupportParticipantTemplateId(
			SupportParticipant supportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportParticipant.validateHITSPSupportParticipantTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument(UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unstructuredDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentTypeIdFixed(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasOneRecordTarget(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasAssignedAuthor(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentPatientRoleId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientRoleAddress(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientName(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientGenderCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientBirthYear(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasOriginalAuthor(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasScanningDevice(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasScanDataEnterer(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationName(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationAddr(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentLegalAuthenticatorAssignedEntityId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBody(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyBinaryText(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextMediaType(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextRepresentation(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUnstructuredDocument_validateScannedDocumentTemplateId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentConfidentialityCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentEffectiveTime(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentLanguageCode(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentTitle(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentTypeId(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentScanOriginalAuthor(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentScanningDevice(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentScanDataEnterer(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentLegalAuthenticator(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentDocumentationOf(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUnstructuredDocument_validateUnstructuredDocumentNoStructuredData(
				unstructuredDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUnstructuredDocument_validateUnstructuredDocumentOnePatientPerDocument(
				unstructuredDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateUnstructuredDocumentNoStructuredData constraint of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentNoStructuredData(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unstructuredDocument.validateUnstructuredDocumentNoStructuredData(diagnostics, context);
	}

	/**
	 * Validates the validateUnstructuredDocumentOnePatientPerDocument constraint of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentOnePatientPerDocument(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unstructuredDocument.validateUnstructuredDocumentOnePatientPerDocument(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentTemplateId constraint of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument_validateScannedDocumentTemplateId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unstructuredDocument.validateScannedDocumentTemplateId(diagnostics, context);
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
			result &= validate_EveryBidirectionalReferenceIsPaired(medicationInformation, diagnostics, context);
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
			result &= ccdValidator.validateProduct_validateProductHasMaterial(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductHasMaterialCode(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductHasMaterialCodeVocab(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductHasMaterialCodeOriginalText(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductHasMaterialName(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductMayHaveMaterialManufacturer(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductShouldHaveMaterialManufacturer(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductTemplateId(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProduct_validateProductId(medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProductEntry_validateProductEntryTemplateId(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationCodedProductName(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationCodedProductVocab(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationCodedIngredientVocab(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationCodedBrandName(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationCodedBrandNameVocab(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationFreeTextProductName(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationFreeTextBrandName(
				medicationInformation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationInformation_validateMedicationInformationTemplateId(
				medicationInformation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationInformationCodedProductName constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationCodedProductName(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationCodedProductName(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationCodedProductVocab constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationCodedProductVocab(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationCodedProductVocab(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationCodedIngredientVocab constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationCodedIngredientVocab(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationCodedIngredientVocab(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationCodedBrandName constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationCodedBrandName(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationCodedBrandName(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationCodedBrandNameVocab constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationCodedBrandNameVocab(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationCodedBrandNameVocab(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationFreeTextProductName constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationFreeTextProductName(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationFreeTextProductName(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationInformationFreeTextBrandName constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationFreeTextBrandName(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationFreeTextBrandName(diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocument(UnstructuredOrScannedDocument unstructuredOrScannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unstructuredOrScannedDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(unstructuredOrScannedDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateGeneralHeaderConstraintsTemplateId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateGeneralHeaderConstraintsEffectiveTime(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentPatientRoleHasId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentAssignedAuthorHasAddr(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentAssignedAuthorHasTelecom(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganization(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasNonXMLBodyText(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasTextReferenceOrRepresentation(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateUnstructuredDocumentHasTextMediaTypeValueSet(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateUnstructuredDocument_validateGeneralHeaderConstraintsCustodian(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentTypeIdFixed(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasOneRecordTarget(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasAssignedAuthor(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentPatientRoleId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientRoleAddress(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientName(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientGenderCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientBirthYear(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasOriginalAuthor(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasScanningDevice(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasScanDataEnterer(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationName(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationAddr(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentLegalAuthenticatorAssignedEntityId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBody(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyBinaryText(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextMediaType(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextRepresentation(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUnstructuredDocument_validateScannedDocumentTemplateId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentConfidentialityCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentEffectiveTime(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentLanguageCode(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentTitle(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentTypeId(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentScanOriginalAuthor(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentScanningDevice(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentScanDataEnterer(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentLegalAuthenticator(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateScannedDocument_validateScannedDocumentDocumentationOf(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUnstructuredDocument_validateUnstructuredDocumentNoStructuredData(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUnstructuredDocument_validateUnstructuredDocumentOnePatientPerDocument(
				unstructuredOrScannedDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummary(ReferralSummary referralSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referralSummary, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(referralSummary, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryMedications(
				referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReferralSummary_validateMedicalSummaryTemplateId(referralSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryCode(
				referralSummary, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicalSummaryTemplateId constraint of '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummary_validateMedicalSummaryTemplateId(ReferralSummary referralSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return referralSummary.validateMedicalSummaryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dischargeSummary, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryMedications(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateMedicalSummaryTemplateId(dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateMedicalSummary_validateMedicalSummaryCode(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryProblemListSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryAdmissionMedicationHistorySection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryHospitalAdmissionDiagnosisSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryAdvanceDirectivesSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryAllergiesReactionsSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryDischargeDiagnosisSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryDischargeDiet(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargeMedicationsSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryDiagnosticResultsSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryFunctionalStatusSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryHistoryOfPresentIllness(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryHospitalCourseSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryMedicalEquipmentSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryPhysicalExamSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryPlanOfCareSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryHistoryOfPastIllnessSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryReviewOfSystemsSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryMedicationsAdministeredSection(
				dischargeSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDischargeSummary_validateDischargeSummaryVitalSignsSection(
				dischargeSummary, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDischargeSummaryProblemListSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryProblemListSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryProblemListSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryAdmissionMedicationHistorySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryAdmissionMedicationHistorySection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryAdmissionMedicationHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryHospitalAdmissionDiagnosisSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHospitalAdmissionDiagnosisSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHospitalAdmissionDiagnosisSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryAdvanceDirectivesSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryAdvanceDirectivesSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryAllergiesReactionsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryAllergiesReactionsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryAllergiesReactionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryDischargeDiagnosisSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryDischargeDiagnosisSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryDischargeDiagnosisSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryDischargeDiet constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryDischargeDiet(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryDischargeDiet(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryHospitalDischargeMedicationsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargeMedicationsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHospitalDischargeMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryDiagnosticResultsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryDiagnosticResultsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryDiagnosticResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryFunctionalStatusSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryFunctionalStatusSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryFunctionalStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryHistoryOfPresentIllness constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHistoryOfPresentIllness(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHistoryOfPresentIllness(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryHospitalCourseSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHospitalCourseSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHospitalCourseSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryMedicalEquipmentSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryMedicalEquipmentSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryMedicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryPhysicalExamSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryPhysicalExamSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryPhysicalExamSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryPlanOfCareSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryPlanOfCareSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryHistoryOfPastIllnessSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHistoryOfPastIllnessSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHistoryOfPastIllnessSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryReviewOfSystemsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryReviewOfSystemsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryReviewOfSystemsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryMedicationsAdministeredSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryMedicationsAdministeredSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryMedicationsAdministeredSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryVitalSignsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryVitalSignsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryTemplateId constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateMedicalSummaryTemplateId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateMedicalSummaryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedure(PlannedProcedure plannedProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plannedProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(plannedProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryMoodCode(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryHasTextReference(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryPriorityCode(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryHasInversionIndForEncounter(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryTemplateId(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryClassCode(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryText(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryApproachSiteCode(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryInternalReference(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryInternalReferenceReason(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureHasCodeOriginalText(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedurePerformerAssignedEntity(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureTemplateId(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureTargetSiteCode(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureCode(plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(
				plannedProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntryPlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(
				plannedProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastProcedure(PastProcedure pastProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pastProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(pastProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryMoodCode(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryHasTextReference(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryPriorityCode(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryHasInversionIndForEncounter(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryTemplateId(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryClassCode(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryText(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryApproachSiteCode(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryInternalReference(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= iheValidator.validateProcedureEntry_validateProcedureEntryInternalReferenceReason(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureHasCodeOriginalText(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedurePerformerAssignedEntity(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureTemplateId(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureTargetSiteCode(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProcedure_validateHITSPProcedureCode(pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMoodCode(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEffectiveTime(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureId(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureSpecimen(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEncounterLocation(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformer2(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProblemObservation(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProblemAct(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureAgeObservation(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMedicationActivity(
				pastProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePatientInstruction(
				pastProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPRegistryDelegate(HITSPRegistryDelegate hitspRegistryDelegate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hitspRegistryDelegate, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HITSPPlugin.INSTANCE;
	}

} // HITSPValidator
