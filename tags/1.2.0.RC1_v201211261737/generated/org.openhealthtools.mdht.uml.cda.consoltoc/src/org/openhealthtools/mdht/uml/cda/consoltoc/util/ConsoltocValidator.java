/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consoltoc.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consoltoc.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage
 * @generated
 */
public class ConsoltocValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final ConsoltocValidator INSTANCE = new ConsoltocValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.consoltoc";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Allergies Section Entries Optional' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Course Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Diagnosis Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Medications Section Entries Optional' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Plan Of Care Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION = 5;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Problem Section Entries Optional' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL = 6;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Chief Complaint Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION = 7;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Chief Complaint And Reason For Visit Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION = 8;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Discharge Diet Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION = 9;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Family History Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION = 10;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Functional Status Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION = 11;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary History Of Present Illness Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION = 12;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Physical Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION = 13;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Studies Summary Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION = 14;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Procedures Section Entries Optional' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL = 15;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Reason For Visit Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION = 16;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Review Of Systems Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION = 17;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Social History Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION = 18;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Vital Signs Section Entries Optional' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL = 19;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Immunizations Section Entries Optional' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL = 20;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 21;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Allergies Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 22;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Assessment And Plan Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION = 23;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request History Of Present Illness Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS_SECTION = 24;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Physical Exam Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION = 25;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Reason For Referral Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION = 26;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Medications Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_MEDICATIONS_SECTION_ENTRIES_OPTIONAL = 27;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Problem Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PROBLEM_SECTION_ENTRIES_OPTIONAL = 28;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Procedures Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PROCEDURES_SECTION_ENTRIES_OPTIONAL = 29;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Results Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_RESULTS_SECTION_ENTRIES_OPTIONAL = 30;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Advance Directives Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL = 31;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Encounters Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL = 32;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Family History Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION = 33;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Functional Status Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION = 34;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Immunizations Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL = 35;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Medical Equipment Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION = 36;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Plan Of Care Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION = 37;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Social History Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION = 38;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Vital Signs Section Entries Optional' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL = 39;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Chief Complaint Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION = 40;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Chief Complaint And Reason For Visit Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION = 41;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request General Status Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_GENERAL_STATUS_SECTION = 42;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request History Of Past Illness Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION = 43;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Payers Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PAYERS_SECTION = 44;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 45;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Allergies Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 46;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Medications Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL = 47;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Problem Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL = 48;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Results Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL = 49;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Advance Directives Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL = 50;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Encounters Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL = 51;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Family History Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION = 52;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Functional Status Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION = 53;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Immunizations Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL = 54;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Procedures Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL = 55;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Medical Equipment Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION = 56;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Payers Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PAYERS_SECTION = 57;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Plan Of Care Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION = 58;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Social History Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION = 59;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Vital Signs Section Entries Optional' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL = 60;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 61;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Plan Of Care Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION = 62;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Allergies Section Entries Optional' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 63;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Problem Section Entries Optional' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL = 64;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Hospital Discharge Medications Section Entries Optional' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL = 65;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Advance Directives Section Entries Optional' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL = 66;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Immunizations Section Entries Optional' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL = 67;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Medical Equipment Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION = 68;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 69;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 69;

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConsolValidator consolValidator;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsoltocValidator()
  {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		consolValidator = ConsolValidator.INSTANCE;
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
	  return ConsoltocPackage.eINSTANCE;
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
			case ConsoltocPackage.DISCHARGE_SUMMARY:
				return validateDischargeSummary((DischargeSummary)value, diagnostics, context);
			case ConsoltocPackage.CONSULTATION_REQUEST:
				return validateConsultationRequest((ConsultationRequest)value, diagnostics, context);
			case ConsoltocPackage.CONSULTATION_SUMMARY:
				return validateConsultationSummary((ConsultationSummary)value, diagnostics, context);
			case ConsoltocPackage.DISCHARGE_INSTRUCTIONS:
				return validateDischargeInstructions((DischargeInstructions)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(dischargeSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateGeneralHeaderConstraintsTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryAllergiesSectionEntriesOptional(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalCourseSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargeDiagnosisSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryPlanOfCareSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryProblemSectionEntriesOptional(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryChiefComplaintSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryChiefComplaintAndReasonForVisitSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryDischargeDietSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryFamilyHistorySection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryFunctionalStatusSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHistoryOfPresentIllnessSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargePhysicalSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargeStudiesSummarySection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryProceduresSectionEntriesOptional(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryReasonForVisitSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryReviewOfSystemsSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummarySocialHistorySection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryVitalSignsSectionEntriesOptional(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryImmunizationsSectionEntriesOptional(dischargeSummary, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateDischargeSummaryAllergiesSectionEntriesOptional constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryAllergiesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryHospitalCourseSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryHospitalCourseSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryHospitalCourseSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryHospitalDischargeDiagnosisSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryHospitalDischargeDiagnosisSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryPlanOfCareSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryPlanOfCareSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryPlanOfCareSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryProblemSectionEntriesOptional constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryProblemSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryChiefComplaintSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryChiefComplaintSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryChiefComplaintSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryChiefComplaintAndReasonForVisitSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryChiefComplaintAndReasonForVisitSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryDischargeDietSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryDischargeDietSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryDischargeDietSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryFamilyHistorySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryFamilyHistorySection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryFamilyHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryFunctionalStatusSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryFunctionalStatusSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryFunctionalStatusSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryHistoryOfPresentIllnessSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryHistoryOfPresentIllnessSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryHospitalDischargePhysicalSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryHospitalDischargePhysicalSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryHospitalDischargeStudiesSummarySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryHospitalDischargeStudiesSummarySection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryProceduresSectionEntriesOptional constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryProceduresSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryReasonForVisitSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryReasonForVisitSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryReasonForVisitSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryReviewOfSystemsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryReviewOfSystemsSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryReviewOfSystemsSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummarySocialHistorySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummarySocialHistorySection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummarySocialHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryVitalSignsSectionEntriesOptional constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryVitalSignsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeSummaryImmunizationsSectionEntriesOptional constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateDischargeSummaryImmunizationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateGeneralHeaderConstraintsTemplateId(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(consultationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateGeneralHeaderConstraintsTemplateId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestAllergiesSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestAssessmentAndPlanSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestHistoryOfPresentIllnessSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestPhysicalExamSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestReasonForReferralSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestMedicationsSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestProblemSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestProceduresSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestResultsSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestEncountersSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestFamilyHistorySection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestFunctionalStatusSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestImmunizationsSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestMedicalEquipmentSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestPlanOfCareSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestSocialHistorySection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestVitalSignsSectionEntriesOptional(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestChiefComplaintSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestChiefComplaintAndReasonForVisitSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestGeneralStatusSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestHistoryOfPastIllnessSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestPayersSection(consultationRequest, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateConsultationRequestAllergiesSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestAllergiesSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestAllergiesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestAssessmentAndPlanSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestAssessmentAndPlanSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestAssessmentAndPlanSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestHistoryOfPresentIllnessSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestHistoryOfPresentIllnessSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestHistoryOfPresentIllnessSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestPhysicalExamSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestPhysicalExamSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestPhysicalExamSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestReasonForReferralSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestReasonForReferralSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestReasonForReferralSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestMedicationsSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestMedicationsSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestMedicationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestProblemSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestProblemSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestProblemSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestProceduresSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestProceduresSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestProceduresSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestResultsSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestResultsSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestResultsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestAdvanceDirectivesSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestEncountersSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestEncountersSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestEncountersSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestFamilyHistorySection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestFamilyHistorySection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestFamilyHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestFunctionalStatusSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestFunctionalStatusSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestFunctionalStatusSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestImmunizationsSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestImmunizationsSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestImmunizationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestMedicalEquipmentSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestMedicalEquipmentSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestMedicalEquipmentSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestPlanOfCareSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestPlanOfCareSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestPlanOfCareSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestSocialHistorySection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestSocialHistorySection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestSocialHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestVitalSignsSectionEntriesOptional constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestVitalSignsSectionEntriesOptional(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestVitalSignsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestChiefComplaintSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestChiefComplaintSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestChiefComplaintSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestChiefComplaintAndReasonForVisitSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestChiefComplaintAndReasonForVisitSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestChiefComplaintAndReasonForVisitSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestGeneralStatusSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestGeneralStatusSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestGeneralStatusSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestHistoryOfPastIllnessSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestHistoryOfPastIllnessSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestHistoryOfPastIllnessSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationRequestPayersSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateConsultationRequestPayersSection(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateConsultationRequestPayersSection(diagnostics, context);
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateGeneralHeaderConstraintsTemplateId(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(consultationSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateGeneralHeaderConstraintsTemplateId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryAllergiesSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryMedicationsSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryProblemSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryResultsSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryEncountersSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryFamilyHistorySection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryFunctionalStatusSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryImmunizationsSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryProceduresSectionEntriesOptional(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryMedicalEquipmentSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryPayersSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryPlanOfCareSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummarySocialHistorySection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryVitalSignsSectionEntriesOptional(consultationSummary, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateConsultationSummaryAllergiesSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryAllergiesSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryAllergiesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryMedicationsSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryMedicationsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryMedicationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryProblemSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryProblemSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryProblemSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryResultsSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryResultsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryResultsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryEncountersSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryEncountersSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryEncountersSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryFamilyHistorySection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryFamilyHistorySection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryFamilyHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryFunctionalStatusSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryFunctionalStatusSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryFunctionalStatusSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryImmunizationsSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryImmunizationsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryImmunizationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryProceduresSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryProceduresSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryProceduresSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryMedicalEquipmentSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryMedicalEquipmentSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryMedicalEquipmentSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryPayersSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryPayersSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryPayersSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryPlanOfCareSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryPlanOfCareSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryPlanOfCareSection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummarySocialHistorySection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummarySocialHistorySection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummarySocialHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateConsultationSummaryVitalSignsSectionEntriesOptional constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateConsultationSummaryVitalSignsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateConsultationSummaryVitalSignsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateGeneralHeaderConstraintsTemplateId(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(dischargeInstructions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateGeneralHeaderConstraintsTemplateId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsPlanOfCareSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsAllergiesSectionEntriesOptional(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsProblemSectionEntriesOptional(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsImmunizationsSectionEntriesOptional(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsMedicalEquipmentSection(dischargeInstructions, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateDischargeInstructionsPlanOfCareSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsPlanOfCareSection(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsPlanOfCareSection(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeInstructionsAllergiesSectionEntriesOptional constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsAllergiesSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsAllergiesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeInstructionsProblemSectionEntriesOptional constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsProblemSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsProblemSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeInstructionsImmunizationsSectionEntriesOptional constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsImmunizationsSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsImmunizationsSectionEntriesOptional(diagnostics, context);
	}

  /**
	 * Validates the validateDischargeInstructionsMedicalEquipmentSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateDischargeInstructionsMedicalEquipmentSection(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateDischargeInstructionsMedicalEquipmentSection(diagnostics, context);
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateGeneralHeaderConstraintsTemplateId(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
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
		return ConsoltocPlugin.INSTANCE;
	}

} //ConsoltocValidator
