/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.toc.*;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;
import org.openhealthtools.mdht.uml.cda.toc.ToCPlugin;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.toc.ToCPackage
 * @generated
 */
public class ToCValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ToCValidator INSTANCE = new ToCValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.toc";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Allergies Reactions Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Problem List Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Course Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Medications Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Discharge Diagnosis Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Plan Of Care Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Chief Complaint Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Discharge Diet' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIET = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Family History Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Functional Status Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary History Of Present Illness' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Physical' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Hospital Discharge Studies Summary Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Immunizations Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Surgeries Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SURGERIES_SECTION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Review Of Systems Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Social History Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Vital Signs Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Plan Of Care Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Allergies Reactions Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Problem List Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Discharge Diagnosis Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Advance Directives Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Immunizations Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Instructions Medical Equipment Section' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_INSTRUCTIONS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Allergies Reactions Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ALLERGIES_REACTIONS_SECTION = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Medications Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_MEDICATIONS_SECTION = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Problem List Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PROBLEM_LIST_SECTION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Surgeries Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_SURGERIES_SECTION = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Diagnostic Results Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_DIAGNOSTIC_RESULTS_SECTION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Advance Directives Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Encounters Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ENCOUNTERS_SECTION = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Family History Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Functional Status Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Immunizations Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Medical Equipment Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Payers Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PAYERS_SECTION = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Plan Of Care Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Social History Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Summary Vital Signs Section' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Allergies Reactions Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Medications Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_MEDICATIONS_SECTION = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Problem List Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PROBLEM_LIST_SECTION = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Surgeries Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_SURGERIES_SECTION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Diagnostic Results Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Advance Directives Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Assessment And Plan Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request History Of Present Illness' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Physical Exam Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Reason For Referral Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Encounters Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_ENCOUNTERS_SECTION = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Family History Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Functional Status Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Immunizations Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Medical Equipment Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Plan Of Care Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Social History Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Vital Signs Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_VITAL_SIGNS_SECTION = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Chief Complaint Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request General Status Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_GENERAL_STATUS_SECTION = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request History Of Past Illness Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Request Payers Section' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__CONSULTATION_REQUEST_PAYERS_SECTION = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_REQUEST__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 66;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 66;

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
	protected CDTValidator cdtValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToCValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
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
	  return ToCPackage.eINSTANCE;
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
			case ToCPackage.DISCHARGE_SUMMARY:
				return validateDischargeSummary((DischargeSummary)value, diagnostics, context);
			case ToCPackage.DISCHARGE_INSTRUCTIONS:
				return validateDischargeInstructions((DischargeInstructions)value, diagnostics, context);
			case ToCPackage.CONSULTATION_SUMMARY:
				return validateConsultationSummary((ConsultationSummary)value, diagnostics, context);
			case ToCPackage.CONSULTATION_REQUEST:
				return validateConsultationRequest((ConsultationRequest)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateGeneralHeaderConstraintsTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryAllergiesReactionsSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryProblemListSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalCourseSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargeMedicationsSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryDischargeDiagnosisSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryPlanOfCareSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryChiefComplaintSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryDischargeDiet(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryFamilyHistorySection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryFunctionalStatusSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHistoryOfPresentIllness(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargePhysical(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryHospitalDischargeStudiesSummarySection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryImmunizationsSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummarySurgeriesSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryReviewOfSystemsSection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummarySocialHistorySection(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryVitalSignsSection(dischargeSummary, diagnostics, context);
		return result;
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
	 * Validates the validateDischargeSummaryPlanOfCareSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryPlanOfCareSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryChiefComplaintSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryChiefComplaintSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryChiefComplaintSection(diagnostics, context);
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
	 * Validates the validateDischargeSummaryFamilyHistorySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryFamilyHistorySection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryFamilyHistorySection(diagnostics, context);
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
	 * Validates the validateDischargeSummaryHospitalDischargePhysical constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargePhysical(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHospitalDischargePhysical(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryHospitalDischargeStudiesSummarySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryHospitalDischargeStudiesSummarySection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryHospitalDischargeStudiesSummarySection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryImmunizationsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryImmunizationsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummarySurgeriesSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummarySurgeriesSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummarySurgeriesSection(diagnostics, context);
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
	 * Validates the validateDischargeSummarySocialHistorySection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummarySocialHistorySection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummarySocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryVitalSignsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryVitalSignsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateGeneralHeaderConstraintsTemplateId(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions(DischargeInstructions dischargeInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateGeneralHeaderConstraintsTemplateId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsPlanOfCareSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsAllergiesReactionsSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsProblemListSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsDischargeDiagnosisSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsAdvanceDirectivesSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsImmunizationsSection(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateDischargeInstructionsMedicalEquipmentSection(dischargeInstructions, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDischargeInstructionsPlanOfCareSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsPlanOfCareSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeInstructionsAllergiesReactionsSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsAllergiesReactionsSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsAllergiesReactionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeInstructionsProblemListSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsProblemListSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsProblemListSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeInstructionsDischargeDiagnosisSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsDischargeDiagnosisSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsDischargeDiagnosisSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeInstructionsAdvanceDirectivesSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsAdvanceDirectivesSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeInstructionsImmunizationsSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsImmunizationsSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeInstructionsMedicalEquipmentSection constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateDischargeInstructionsMedicalEquipmentSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateDischargeInstructionsMedicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeInstructions_validateGeneralHeaderConstraintsTemplateId(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeInstructions.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary(ConsultationSummary consultationSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateGeneralHeaderConstraintsTemplateId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryAllergiesReactionsSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryMedicationsSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryProblemListSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummarySurgeriesSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryDiagnosticResultsSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryAdvanceDirectivesSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryEncountersSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryFamilyHistorySection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryFunctionalStatusSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryImmunizationsSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryMedicalEquipmentSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryPayersSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryPlanOfCareSection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummarySocialHistorySection(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateConsultationSummaryVitalSignsSection(consultationSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConsultationSummaryAllergiesReactionsSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryAllergiesReactionsSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryAllergiesReactionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryMedicationsSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryMedicationsSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryProblemListSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryProblemListSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryProblemListSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummarySurgeriesSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummarySurgeriesSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummarySurgeriesSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryDiagnosticResultsSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryDiagnosticResultsSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryDiagnosticResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryAdvanceDirectivesSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryAdvanceDirectivesSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryEncountersSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryEncountersSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryFamilyHistorySection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryFamilyHistorySection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryFamilyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryFunctionalStatusSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryFunctionalStatusSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryFunctionalStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryImmunizationsSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryImmunizationsSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryMedicalEquipmentSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryMedicalEquipmentSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryMedicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryPayersSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryPayersSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryPayersSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryPlanOfCareSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryPlanOfCareSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummarySocialHistorySection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummarySocialHistorySection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummarySocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationSummaryVitalSignsSection constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateConsultationSummaryVitalSignsSection(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateConsultationSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationSummary_validateGeneralHeaderConstraintsTemplateId(
			ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest(ConsultationRequest consultationRequest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateGeneralHeaderConstraintsTemplateId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestAllergiesReactionsSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestMedicationsSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestProblemListSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestSurgeriesSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestDiagnosticResultsSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestAdvanceDirectivesSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestAssessmentAndPlanSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestHistoryOfPresentIllness(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestPhysicalExamSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestReasonForReferralSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestEncountersSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestFamilyHistorySection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestFunctionalStatusSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestImmunizationsSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestMedicalEquipmentSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestPlanOfCareSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestSocialHistorySection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestVitalSignsSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestChiefComplaintSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestGeneralStatusSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestHistoryOfPastIllnessSection(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateConsultationRequestPayersSection(consultationRequest, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConsultationRequestAllergiesReactionsSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestAllergiesReactionsSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestAllergiesReactionsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestMedicationsSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestMedicationsSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestProblemListSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestProblemListSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestProblemListSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestSurgeriesSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestSurgeriesSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestSurgeriesSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestDiagnosticResultsSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestDiagnosticResultsSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestDiagnosticResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestAdvanceDirectivesSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestAdvanceDirectivesSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestAssessmentAndPlanSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestAssessmentAndPlanSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestAssessmentAndPlanSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestHistoryOfPresentIllness constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestHistoryOfPresentIllness(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestHistoryOfPresentIllness(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestPhysicalExamSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestPhysicalExamSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestPhysicalExamSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestReasonForReferralSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestReasonForReferralSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestReasonForReferralSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestEncountersSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestEncountersSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestFamilyHistorySection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestFamilyHistorySection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestFamilyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestFunctionalStatusSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestFunctionalStatusSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestFunctionalStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestImmunizationsSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestImmunizationsSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestMedicalEquipmentSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestMedicalEquipmentSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestMedicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestPlanOfCareSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestPlanOfCareSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestSocialHistorySection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestSocialHistorySection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestVitalSignsSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestVitalSignsSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestChiefComplaintSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestChiefComplaintSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestChiefComplaintSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestGeneralStatusSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestGeneralStatusSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestGeneralStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestHistoryOfPastIllnessSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestHistoryOfPastIllnessSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestHistoryOfPastIllnessSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationRequestPayersSection constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateConsultationRequestPayersSection(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateConsultationRequestPayersSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequest_validateGeneralHeaderConstraintsTemplateId(
			ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationRequest.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToCPlugin.INSTANCE;
	}

} // ToCValidator
