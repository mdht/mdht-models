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
package org.openhealthtools.mdht.uml.cda.cdt.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.cdt.*;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.PlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.ProgressNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTPackage
 * @generated
 */
public class CDTValidator extends EObjectValidator {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final CDTValidator INSTANCE = new CDTValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.cdt";

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Person Has Name' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME = 1;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Roles Shall Have Addr And Telecom' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM = 2;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Roles Should Have Addr And Telecom' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM = 3;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Organizations Have Contact Info' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO = 4;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Day' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY = 5;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Year' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR = 6;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Telephone Matches Regex' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX = 7;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Telephone Dialing Digits' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS = 8;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Unknown Telephone Uses Null Flavor' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR = 9;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id Extension' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION = 10;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Id Root Format' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT = 11;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Oid Length' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_OID_LENGTH = 12;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Language Code Form' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM = 13;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Set Id And Version Number' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER = 14;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Set Id And Id Are Unique' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE = 15;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Copy Time Not Present' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT = 16;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Record Target Patient Role' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE = 17;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Patient Birth Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME = 18;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Administrative Gender Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE = 19;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Provider Organization' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION = 20;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Author Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME = 21;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Assigned Author Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID = 22;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Assigned Author Person Or Device' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE = 23;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Data Enterer Assigned Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON = 24;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Data Enterer Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME = 25;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Informant' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT = 26;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Informant Assigned Person Or Related Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON = 27;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Legal Authenticator Has Assigned Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON = 28;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Authenticator Has Assigned Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON = 29;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Second' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND = 30;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Time Precise To Year And Day' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY = 31;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 32;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE = 33;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Effective Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME = 34;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID = 35;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Language Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE = 36;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Realm Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE = 37;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Title' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE = 38;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID = 39;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Assessment And Plan' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN = 40;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Both Assessment And Plan' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN = 41;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Reason For Visit And Chief Complaint' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT = 42;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Both Reason For Visit And Chief Complaint' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT = 43;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Code' of 'History And Physical'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_CODE = 44;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Present Illness Template Id' of 'History Of Present Illness'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 60;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Present Illness Code' of 'History Of Present Illness'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_CODE = 61;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Has Clinical Statements' of 'Past Medical History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS = 62;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical History Of Present Illness' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS = 45;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Past Medical History Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION = 46;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Medications Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION = 47;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Alerts Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ALERTS_SECTION = 48;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Social History Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION = 49;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Family History Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION = 50;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Review Of Systems Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION = 51;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Physical Examination Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION = 52;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Vital Signs Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION = 53;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical General Status Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION = 54;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Diagnostic Findings' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS = 55;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Problem Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROBLEM_SECTION = 56;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Procedures Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROCEDURES_SECTION = 57;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Immunizations Section' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION = 58;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'History And Physical'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HISTORY_AND_PHYSICAL__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 59;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Referral Or Visit' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_REFERRAL_OR_VISIT = 78;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Code' of 'Consultation Note'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_CODE = 79;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note History Of Present Illness' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS = 80;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Physical Examination' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PHYSICAL_EXAMINATION = 81;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Problem Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PROBLEM_SECTION = 82;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Procedures Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PROCEDURES_SECTION = 83;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Past Medical History Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION = 84;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Immunizations Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_IMMUNIZATIONS_SECTION = 85;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Medications Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_MEDICATIONS_SECTION = 86;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Alerts Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_ALERTS_SECTION = 87;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Social History Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION = 88;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Family History Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_FAMILY_HISTORY_SECTION = 89;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Review Of Systems Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION = 90;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Vital Signs Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_VITAL_SIGNS_SECTION = 91;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note General Status Section' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_GENERAL_STATUS_SECTION = 92;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Diagnostic Findings' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS = 93;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CONSULTATION_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 94;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Template Id' of 'Reason For Referral Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 100;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Code' of 'Reason For Referral Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE = 101;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Consult Template Id' of 'Reason For Visit Section Consult'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_VISIT_SECTION_CONSULT__REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID = 102;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Consult Code' of 'Reason For Visit Section Consult'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_VISIT_SECTION_CONSULT__REASON_FOR_VISIT_SECTION_CONSULT_CODE = 103;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Level One Conformance Template Id' of 'Level One Conformance'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int LEVEL_ONE_CONFORMANCE__LEVEL_ONE_CONFORMANCE_TEMPLATE_ID = 104;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Level One Conformance Template Id' of 'Level Two Conformance'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int LEVEL_TWO_CONFORMANCE__LEVEL_ONE_CONFORMANCE_TEMPLATE_ID = 105;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Level One Conformance Template Id' of 'Level Three Conformance'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int LEVEL_THREE_CONFORMANCE__LEVEL_ONE_CONFORMANCE_TEMPLATE_ID = 106;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Template Id' of 'Reason For Visit Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_TEMPLATE_ID = 113;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Code' of 'Reason For Visit Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_CODE = 114;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Template Id' of 'Chief Complaint Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 115;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Code' of 'Chief Complaint Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE = 116;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit And Chief Complaint Section Template Id' of 'Reason For Visit And Chief Complaint Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION__REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 117;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit And Chief Complaint Section Code' of 'Reason For Visit And Chief Complaint Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION__REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE = 118;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Assessment And Plan' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_AND_PLAN = 119;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Both Assessment And Plan' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN = 120;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Service Event' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT = 121;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Service Event Code' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE = 122;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Service Event Effective Time' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME = 123;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Component Of Element' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT = 124;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Encompassing Encounter Id' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID = 125;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Encompassing Encounter Effective Time' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME = 126;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Encompassing Encounter Effective Time Low' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW = 127;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Has Encompassing Encounter Facility Id' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID = 128;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Code' of 'Progress Note'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PROGRESS_NOTE__PROGRESS_NOTE_CODE = 129;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Alerts Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_ALERTS_SECTION = 130;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Chief Complaint Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION = 131;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Medications Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_MEDICATIONS_SECTION = 132;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Objective Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_OBJECTIVE_SECTION = 133;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Physical Examination Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION = 134;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Problem Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_PROBLEM_SECTION = 135;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Results Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_RESULTS_SECTION = 136;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Vital Signs Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_VITAL_SIGNS_SECTION = 137;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Review Of Systems Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION = 138;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progress Note Subjective Section' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__PROGRESS_NOTE_SUBJECTIVE_SECTION = 139;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Progress Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 140;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Proc Note Template Id' of 'Assessment And Plan Section Proc Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE__ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE_TEMPLATE_ID = 141;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Proc Note Code' of 'Assessment And Plan Section Proc Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE__ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE_CODE = 142;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Proc Note Template Id' of 'Assessment Section Proc Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_SECTION_PROC_NOTE__ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID = 143;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Proc Note Code' of 'Assessment Section Proc Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_SECTION_PROC_NOTE__ASSESSMENT_SECTION_PROC_NOTE_CODE = 144;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Proc Note Template Id' of 'Chief Complaint Section Proc Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CHIEF_COMPLAINT_SECTION_PROC_NOTE__CHIEF_COMPLAINT_SECTION_PROC_NOTE_TEMPLATE_ID = 145;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Proc Note Code' of 'Chief Complaint Section Proc Note'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CHIEF_COMPLAINT_SECTION_PROC_NOTE__CHIEF_COMPLAINT_SECTION_PROC_NOTE_CODE = 146;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Objective Section Has Clinical Statements' of 'Objective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBJECTIVE_SECTION__OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS = 147;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Objective Section Template Id' of 'Objective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBJECTIVE_SECTION__OBJECTIVE_SECTION_TEMPLATE_ID = 148;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Objective Section Code' of 'Objective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBJECTIVE_SECTION__OBJECTIVE_SECTION_CODE = 149;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Objective Section Text' of 'Objective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBJECTIVE_SECTION__OBJECTIVE_SECTION_TEXT = 150;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Objective Section Title' of 'Objective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBJECTIVE_SECTION__OBJECTIVE_SECTION_TITLE = 151;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Subjective Section Has Clinical Statements' of 'Subjective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUBJECTIVE_SECTION__SUBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS = 152;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Subjective Section Template Id' of 'Subjective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUBJECTIVE_SECTION__SUBJECTIVE_SECTION_TEMPLATE_ID = 153;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Subjective Section Code' of 'Subjective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUBJECTIVE_SECTION__SUBJECTIVE_SECTION_CODE = 154;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Subjective Section Text' of 'Subjective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUBJECTIVE_SECTION__SUBJECTIVE_SECTION_TEXT = 155;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Subjective Section Title' of 'Subjective Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUBJECTIVE_SECTION__SUBJECTIVE_SECTION_TITLE = 156;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Patient Role Has Id' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID = 157;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Assigned Author Has Addr' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR = 158;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Assigned Author Has Telecom' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM = 159;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Represented Custodian Organization' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION = 160;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Represented Custodian Organization Id' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID = 161;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Represented Custodian Organization Name' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME = 162;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Represented Custodian Organization Telecom' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM = 163;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Represented Custodian Organization Addr' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR = 164;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Non XML Body Text' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT = 165;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Text Reference Or Representation' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION = 166;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Has Text Media Type Value Set' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET = 167;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Effective Time' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME = 168;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document Custodian' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN = 169;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Unstructured Document'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int UNSTRUCTURED_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 170;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Studies Summary Section Template Id' of 'Hospital Discharge Studies Summary Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID = 171;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Studies Summary Section Code' of 'Hospital Discharge Studies Summary Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE = 172;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Studies Summary Section Title' of 'Hospital Discharge Studies Summary Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE = 173;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Consult Template Id' of 'Past Medical History Section Consult'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID = 95;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Consult Code' of 'Past Medical History Section Consult'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE = 96;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Consult Text' of 'Past Medical History Section Consult'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT = 97;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Examination Section Template Id' of 'Physical Examination Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHYSICAL_EXAMINATION_SECTION__PHYSICAL_EXAMINATION_SECTION_TEMPLATE_ID = 68;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Examination Section Code' of 'Physical Examination Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHYSICAL_EXAMINATION_SECTION__PHYSICAL_EXAMINATION_SECTION_CODE = 69;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Template Id' of 'Past Medical History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID = 63;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Code' of 'Past Medical History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_CODE = 64;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Text' of 'Past Medical History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_TEXT = 65;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section IHE Template Id' of 'Review Of Systems Section IHE'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REVIEW_OF_SYSTEMS_SECTION_IHE__REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID = 66;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section IHE Code' of 'Review Of Systems Section IHE'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REVIEW_OF_SYSTEMS_SECTION_IHE__REVIEW_OF_SYSTEMS_SECTION_IHE_CODE = 67;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Template Id' of 'Review Of Systems Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 98;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Code' of 'Review Of Systems Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_CODE = 99;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Status Section Template Id' of 'General Status Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_STATUS_SECTION__GENERAL_STATUS_SECTION_TEMPLATE_ID = 75;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Status Section Code' of 'General Status Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_STATUS_SECTION__GENERAL_STATUS_SECTION_CODE = 76;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Findings Title' of 'Diagnostic Findings'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DIAGNOSTIC_FINDINGS__DIAGNOSTIC_FINDINGS_TITLE = 77;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Clinical Statements' of 'Vital Signs Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS = 70;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Template Id' of 'Vital Signs Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 71;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Code' of 'Vital Signs Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE = 72;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Text' of 'Vital Signs Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT = 73;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Signs Organizer' of 'Vital Signs Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 74;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Template Id' of 'Assessment Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_TEMPLATE_ID = 107;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Code' of 'Assessment Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_CODE = 108;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Section Template Id' of 'Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PLAN_SECTION__PLAN_SECTION_TEMPLATE_ID = 109;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Section Code' of 'Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PLAN_SECTION__PLAN_SECTION_CODE = 110;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 111;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Code' of 'Assessment And Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE = 112;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 173;

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
	protected CCDValidator ccdValidator;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CDTValidator() {
    super();
    cdaValidator = CDAValidator.INSTANCE;
    ccdValidator = CCDValidator.INSTANCE;
  }

	/**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EPackage getEPackage() {
    return CDTPackage.eINSTANCE;
  }

	/**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID)
    {
      case CDTPackage.GENERAL_HEADER_CONSTRAINTS:
        return validateGeneralHeaderConstraints((GeneralHeaderConstraints)value, diagnostics, context);
      case CDTPackage.HISTORY_AND_PHYSICAL:
        return validateHistoryAndPhysical((HistoryAndPhysical)value, diagnostics, context);
      case CDTPackage.HISTORY_OF_PRESENT_ILLNESS:
        return validateHistoryOfPresentIllness((HistoryOfPresentIllness)value, diagnostics, context);
      case CDTPackage.PAST_MEDICAL_HISTORY_SECTION:
        return validatePastMedicalHistorySection((PastMedicalHistorySection)value, diagnostics, context);
      case CDTPackage.REVIEW_OF_SYSTEMS_SECTION_IHE:
        return validateReviewOfSystemsSectionIHE((ReviewOfSystemsSectionIHE)value, diagnostics, context);
      case CDTPackage.PHYSICAL_EXAMINATION_SECTION:
        return validatePhysicalExaminationSection((PhysicalExaminationSection)value, diagnostics, context);
      case CDTPackage.VITAL_SIGNS_SECTION:
        return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
      case CDTPackage.GENERAL_STATUS_SECTION:
        return validateGeneralStatusSection((GeneralStatusSection)value, diagnostics, context);
      case CDTPackage.DIAGNOSTIC_FINDINGS:
        return validateDiagnosticFindings((DiagnosticFindings)value, diagnostics, context);
      case CDTPackage.CONSULTATION_NOTE:
        return validateConsultationNote((ConsultationNote)value, diagnostics, context);
      case CDTPackage.PAST_MEDICAL_HISTORY_SECTION_CONSULT:
        return validatePastMedicalHistorySectionConsult((PastMedicalHistorySectionConsult)value, diagnostics, context);
      case CDTPackage.REVIEW_OF_SYSTEMS_SECTION:
        return validateReviewOfSystemsSection((ReviewOfSystemsSection)value, diagnostics, context);
      case CDTPackage.REASON_FOR_REFERRAL_SECTION:
        return validateReasonForReferralSection((ReasonForReferralSection)value, diagnostics, context);
      case CDTPackage.REASON_FOR_VISIT_SECTION_CONSULT:
        return validateReasonForVisitSectionConsult((ReasonForVisitSectionConsult)value, diagnostics, context);
      case CDTPackage.LEVEL_ONE_CONFORMANCE:
        return validateLevelOneConformance((LevelOneConformance)value, diagnostics, context);
      case CDTPackage.LEVEL_TWO_CONFORMANCE:
        return validateLevelTwoConformance((LevelTwoConformance)value, diagnostics, context);
      case CDTPackage.LEVEL_THREE_CONFORMANCE:
        return validateLevelThreeConformance((LevelThreeConformance)value, diagnostics, context);
      case CDTPackage.ASSESSMENT_SECTION:
        return validateAssessmentSection((AssessmentSection)value, diagnostics, context);
      case CDTPackage.PLAN_SECTION:
        return validatePlanSection((PlanSection)value, diagnostics, context);
      case CDTPackage.ASSESSMENT_AND_PLAN_SECTION:
        return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
      case CDTPackage.REASON_FOR_VISIT_SECTION:
        return validateReasonForVisitSection((ReasonForVisitSection)value, diagnostics, context);
      case CDTPackage.CHIEF_COMPLAINT_SECTION:
        return validateChiefComplaintSection((ChiefComplaintSection)value, diagnostics, context);
      case CDTPackage.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION:
        return validateReasonForVisitAndChiefComplaintSection((ReasonForVisitAndChiefComplaintSection)value, diagnostics, context);
      case CDTPackage.PROGRESS_NOTE:
        return validateProgressNote((ProgressNote)value, diagnostics, context);
      case CDTPackage.ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE:
        return validateAssessmentAndPlanSectionProcNote((AssessmentAndPlanSectionProcNote)value, diagnostics, context);
      case CDTPackage.ASSESSMENT_SECTION_PROC_NOTE:
        return validateAssessmentSectionProcNote((AssessmentSectionProcNote)value, diagnostics, context);
      case CDTPackage.CHIEF_COMPLAINT_SECTION_PROC_NOTE:
        return validateChiefComplaintSectionProcNote((ChiefComplaintSectionProcNote)value, diagnostics, context);
      case CDTPackage.OBJECTIVE_SECTION:
        return validateObjectiveSection((ObjectiveSection)value, diagnostics, context);
      case CDTPackage.SUBJECTIVE_SECTION:
        return validateSubjectiveSection((SubjectiveSection)value, diagnostics, context);
      case CDTPackage.UNSTRUCTURED_DOCUMENT:
        return validateUnstructuredDocument((UnstructuredDocument)value, diagnostics, context);
      case CDTPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION:
        return validateHospitalDischargeStudiesSummarySection((HospitalDischargeStudiesSummarySection)value, diagnostics, context);
      case CDTPackage.CDT_REGISTRY_DELEGATE:
        return validateCDTRegistryDelegate((CDTRegistryDelegate)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(generalHeaderConstraints, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(generalHeaderConstraints, diagnostics, context);
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
    return generalHeaderConstraints.validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsOrganizationsHaveContactInfo constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(diagnostics, context);
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
    return generalHeaderConstraints.validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(diagnostics, context);
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
   * Validates the validateGeneralHeaderConstraintsIdRootFormat constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsIdRootFormat(diagnostics, context);
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
   * Validates the validateGeneralHeaderConstraintsLanguageCodeForm constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsLanguageCodeForm(diagnostics, context);
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
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(diagnostics, context);
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
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasDataEntererAssignedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(diagnostics, context);
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
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTimePreciseToSecond constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsTimePreciseToSecond(diagnostics, context);
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(historyAndPhysical, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateGeneralHeaderConstraintsTemplateId(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalAssessmentAndPlan(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalBothAssessmentAndPlan(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalCode(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalHistoryOfPresentIllness(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalPastMedicalHistorySection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalMedicationsSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalAlertsSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalSocialHistorySection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalFamilyHistorySection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalReviewOfSystemsSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalPhysicalExaminationSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalVitalSignsSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalGeneralStatusSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalDiagnosticFindings(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalProblemSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalProceduresSection(historyAndPhysical, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalImmunizationsSection(historyAndPhysical, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateHistoryAndPhysicalAssessmentAndPlan constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalAssessmentAndPlan(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalAssessmentAndPlan(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalBothAssessmentAndPlan constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalBothAssessmentAndPlan(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalBothAssessmentAndPlan(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalReasonForVisitAndChiefComplaint constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalCode constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalCode(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return historyAndPhysical.validateHistoryAndPhysicalCode(diagnostics, context);
  }

  /**
   * Validates the validateHistoryAndPhysicalHistoryOfPresentIllness constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalHistoryOfPresentIllness(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalHistoryOfPresentIllness(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalPastMedicalHistorySection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalPastMedicalHistorySection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalPastMedicalHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalMedicationsSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalMedicationsSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalMedicationsSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalAlertsSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalAlertsSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalAlertsSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalSocialHistorySection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalSocialHistorySection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalSocialHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalFamilyHistorySection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalFamilyHistorySection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalFamilyHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalReviewOfSystemsSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalReviewOfSystemsSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalReviewOfSystemsSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalPhysicalExaminationSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalPhysicalExaminationSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalPhysicalExaminationSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalVitalSignsSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalVitalSignsSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalVitalSignsSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalGeneralStatusSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalGeneralStatusSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalGeneralStatusSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalDiagnosticFindings constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalDiagnosticFindings(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalDiagnosticFindings(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalProblemSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalProblemSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalProblemSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalProceduresSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalProceduresSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalProceduresSection(diagnostics, context);
  }

	/**
   * Validates the validateHistoryAndPhysicalImmunizationsSection constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalImmunizationsSection(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateHistoryAndPhysicalImmunizationsSection(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>History And Physical</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysical_validateGeneralHeaderConstraintsTemplateId(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyAndPhysical.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote(ConsultationNote consultationNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(consultationNote, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateGeneralHeaderConstraintsTemplateId(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteReferralOrVisit(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteCode(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteHistoryOfPresentIllness(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNotePhysicalExamination(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteProblemSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteProceduresSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNotePastMedicalHistorySection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteImmunizationsSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteMedicationsSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteAlertsSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteSocialHistorySection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteFamilyHistorySection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteReviewOfSystemsSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteVitalSignsSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteGeneralStatusSection(consultationNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteDiagnosticFindings(consultationNote, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateConsultationNoteReferralOrVisit constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteReferralOrVisit(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteReferralOrVisit(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteCode constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsultationNote_validateConsultationNoteCode(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return consultationNote.validateConsultationNoteCode(diagnostics, context);
  }

  /**
   * Validates the validateConsultationNoteHistoryOfPresentIllness constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteHistoryOfPresentIllness(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteHistoryOfPresentIllness(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNotePhysicalExamination constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNotePhysicalExamination(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNotePhysicalExamination(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteProblemSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteProblemSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteProblemSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteProceduresSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteProceduresSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteProceduresSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNotePastMedicalHistorySection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNotePastMedicalHistorySection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNotePastMedicalHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteImmunizationsSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteImmunizationsSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteImmunizationsSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteMedicationsSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteMedicationsSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteMedicationsSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteAlertsSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteAlertsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteAlertsSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteSocialHistorySection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteSocialHistorySection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteSocialHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteFamilyHistorySection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteFamilyHistorySection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteFamilyHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteReviewOfSystemsSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteReviewOfSystemsSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteReviewOfSystemsSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteVitalSignsSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteVitalSignsSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteVitalSignsSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteGeneralStatusSection constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteGeneralStatusSection(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteGeneralStatusSection(diagnostics, context);
  }

	/**
   * Validates the validateConsultationNoteDiagnosticFindings constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateConsultationNoteDiagnosticFindings(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateConsultationNoteDiagnosticFindings(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConsultationNote_validateGeneralHeaderConstraintsTemplateId(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return consultationNote.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLevelThreeConformance(LevelThreeConformance levelThreeConformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(levelThreeConformance, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(levelThreeConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateLevelThreeConformance_validateLevelOneConformanceTemplateId(levelThreeConformance, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateLevelOneConformanceTemplateId constraint of '<em>Level Three Conformance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLevelThreeConformance_validateLevelOneConformanceTemplateId(
			LevelThreeConformance levelThreeConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return levelThreeConformance.validateLevelOneConformanceTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForReferralSection(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(reasonForReferralSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(reasonForReferralSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForReferralSection_validateReasonForReferralSectionCode(reasonForReferralSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateReasonForReferralSectionTemplateId constraint of '<em>Reason For Referral Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return reasonForReferralSection.validateReasonForReferralSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateReasonForReferralSectionCode constraint of '<em>Reason For Referral Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionCode(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return reasonForReferralSection.validateReasonForReferralSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitSectionConsult(ReasonForVisitSectionConsult reasonForVisitSectionConsult,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(reasonForVisitSectionConsult, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultTemplateId(reasonForVisitSectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultCode(reasonForVisitSectionConsult, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateReasonForVisitSectionConsultTemplateId constraint of '<em>Reason For Visit Section Consult</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultTemplateId(
			ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return reasonForVisitSectionConsult.validateReasonForVisitSectionConsultTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateReasonForVisitSectionConsultCode constraint of '<em>Reason For Visit Section Consult</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultCode(
			ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return reasonForVisitSectionConsult.validateReasonForVisitSectionConsultCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitSection(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(reasonForVisitSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForVisitSection_validateReasonForVisitSectionTemplateId(reasonForVisitSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForVisitSection_validateReasonForVisitSectionCode(reasonForVisitSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateReasonForVisitSectionTemplateId constraint of '<em>Reason For Visit Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitSection_validateReasonForVisitSectionTemplateId(
			ReasonForVisitSection reasonForVisitSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return reasonForVisitSection.validateReasonForVisitSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateReasonForVisitSectionCode constraint of '<em>Reason For Visit Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitSection_validateReasonForVisitSectionCode(
			ReasonForVisitSection reasonForVisitSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return reasonForVisitSection.validateReasonForVisitSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChiefComplaintSection(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(chiefComplaintSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(chiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChiefComplaintSection_validateChiefComplaintSectionCode(chiefComplaintSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateChiefComplaintSectionTemplateId constraint of '<em>Chief Complaint Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(
			ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return chiefComplaintSection.validateChiefComplaintSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateChiefComplaintSectionCode constraint of '<em>Chief Complaint Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionCode(
			ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return chiefComplaintSection.validateChiefComplaintSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitAndChiefComplaintSection(
			ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(reasonForVisitAndChiefComplaintSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionTemplateId(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionCode(reasonForVisitAndChiefComplaintSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateReasonForVisitAndChiefComplaintSectionTemplateId constraint of '<em>Reason For Visit And Chief Complaint Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionTemplateId(
			ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return reasonForVisitAndChiefComplaintSection.validateReasonForVisitAndChiefComplaintSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateReasonForVisitAndChiefComplaintSectionCode constraint of '<em>Reason For Visit And Chief Complaint Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionCode(
			ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return reasonForVisitAndChiefComplaintSection.validateReasonForVisitAndChiefComplaintSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(progressNote, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateGeneralHeaderConstraintsTemplateId(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteAssessmentAndPlan(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteBothAssessmentAndPlan(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasServiceEvent(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasServiceEventCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasServiceEventEffectiveTime(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasComponentOfElement(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasEncompassingEncounterId(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasEncompassingEncounterEffectiveTime(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteHasEncompassingEncounterFacilityId(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteCode(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteAlertsSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteChiefComplaintSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteMedicationsSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteObjectiveSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNotePhysicalExaminationSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteProblemSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteResultsSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteVitalSignsSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteReviewOfSystemsSection(progressNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateProgressNote_validateProgressNoteSubjectiveSection(progressNote, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateProgressNoteAssessmentAndPlan constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteAssessmentAndPlan(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteAssessmentAndPlan(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteBothAssessmentAndPlan constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteBothAssessmentAndPlan(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteBothAssessmentAndPlan(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasServiceEvent constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasServiceEvent(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasServiceEvent(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasServiceEventCode constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasServiceEventCode(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasServiceEventCode(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasServiceEventEffectiveTime constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasServiceEventEffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasServiceEventEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasComponentOfElement constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasComponentOfElement(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasComponentOfElement(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasEncompassingEncounterId constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasEncompassingEncounterId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasEncompassingEncounterId(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasEncompassingEncounterEffectiveTime constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasEncompassingEncounterEffectiveTime(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasEncompassingEncounterEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasEncompassingEncounterEffectiveTimeLow constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteHasEncompassingEncounterFacilityId constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteHasEncompassingEncounterFacilityId(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteHasEncompassingEncounterFacilityId(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteCode constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProgressNote_validateProgressNoteCode(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return progressNote.validateProgressNoteCode(diagnostics, context);
  }

  /**
   * Validates the validateProgressNoteAlertsSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteAlertsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteAlertsSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteChiefComplaintSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteChiefComplaintSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteChiefComplaintSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteMedicationsSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteMedicationsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteMedicationsSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteObjectiveSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteObjectiveSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteObjectiveSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNotePhysicalExaminationSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNotePhysicalExaminationSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNotePhysicalExaminationSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteProblemSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteProblemSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteProblemSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteResultsSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteResultsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteResultsSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteVitalSignsSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteVitalSignsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteVitalSignsSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteReviewOfSystemsSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteReviewOfSystemsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteReviewOfSystemsSection(diagnostics, context);
  }

	/**
   * Validates the validateProgressNoteSubjectiveSection constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateProgressNoteSubjectiveSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateProgressNoteSubjectiveSection(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Progress Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProgressNote_validateGeneralHeaderConstraintsTemplateId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return progressNote.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentAndPlanSectionProcNote(
			AssessmentAndPlanSectionProcNote assessmentAndPlanSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(assessmentAndPlanSectionProcNote, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentAndPlanSectionProcNote_validateAssessmentAndPlanSectionProcNoteTemplateId(assessmentAndPlanSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentAndPlanSectionProcNote_validateAssessmentAndPlanSectionProcNoteCode(assessmentAndPlanSectionProcNote, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateAssessmentAndPlanSectionProcNoteTemplateId constraint of '<em>Assessment And Plan Section Proc Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentAndPlanSectionProcNote_validateAssessmentAndPlanSectionProcNoteTemplateId(
			AssessmentAndPlanSectionProcNote assessmentAndPlanSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return assessmentAndPlanSectionProcNote.validateAssessmentAndPlanSectionProcNoteTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateAssessmentAndPlanSectionProcNoteCode constraint of '<em>Assessment And Plan Section Proc Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentAndPlanSectionProcNote_validateAssessmentAndPlanSectionProcNoteCode(
			AssessmentAndPlanSectionProcNote assessmentAndPlanSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return assessmentAndPlanSectionProcNote.validateAssessmentAndPlanSectionProcNoteCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentSectionProcNote(AssessmentSectionProcNote assessmentSectionProcNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(assessmentSectionProcNote, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentSectionProcNote_validateAssessmentSectionProcNoteTemplateId(assessmentSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentSectionProcNote_validateAssessmentSectionProcNoteCode(assessmentSectionProcNote, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateAssessmentSectionProcNoteTemplateId constraint of '<em>Assessment Section Proc Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentSectionProcNote_validateAssessmentSectionProcNoteTemplateId(
			AssessmentSectionProcNote assessmentSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return assessmentSectionProcNote.validateAssessmentSectionProcNoteTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateAssessmentSectionProcNoteCode constraint of '<em>Assessment Section Proc Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentSectionProcNote_validateAssessmentSectionProcNoteCode(
			AssessmentSectionProcNote assessmentSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return assessmentSectionProcNote.validateAssessmentSectionProcNoteCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChiefComplaintSectionProcNote(ChiefComplaintSectionProcNote chiefComplaintSectionProcNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(chiefComplaintSectionProcNote, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateChiefComplaintSectionProcNote_validateChiefComplaintSectionProcNoteTemplateId(chiefComplaintSectionProcNote, diagnostics, context);
    if (result || diagnostics != null) result &= validateChiefComplaintSectionProcNote_validateChiefComplaintSectionProcNoteCode(chiefComplaintSectionProcNote, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateChiefComplaintSectionProcNoteTemplateId constraint of '<em>Chief Complaint Section Proc Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChiefComplaintSectionProcNote_validateChiefComplaintSectionProcNoteTemplateId(
			ChiefComplaintSectionProcNote chiefComplaintSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return chiefComplaintSectionProcNote.validateChiefComplaintSectionProcNoteTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateChiefComplaintSectionProcNoteCode constraint of '<em>Chief Complaint Section Proc Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChiefComplaintSectionProcNote_validateChiefComplaintSectionProcNoteCode(
			ChiefComplaintSectionProcNote chiefComplaintSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return chiefComplaintSectionProcNote.validateChiefComplaintSectionProcNoteCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObjectiveSection(ObjectiveSection objectiveSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(objectiveSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateObjectiveSection_validateObjectiveSectionHasClinicalStatements(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateObjectiveSection_validateObjectiveSectionTemplateId(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateObjectiveSection_validateObjectiveSectionCode(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateObjectiveSection_validateObjectiveSectionText(objectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateObjectiveSection_validateObjectiveSectionTitle(objectiveSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateObjectiveSectionHasClinicalStatements constraint of '<em>Objective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObjectiveSection_validateObjectiveSectionHasClinicalStatements(
			ObjectiveSection objectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return objectiveSection.validateObjectiveSectionHasClinicalStatements(diagnostics, context);
  }

	/**
   * Validates the validateObjectiveSectionTemplateId constraint of '<em>Objective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObjectiveSection_validateObjectiveSectionTemplateId(ObjectiveSection objectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return objectiveSection.validateObjectiveSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateObjectiveSectionCode constraint of '<em>Objective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObjectiveSection_validateObjectiveSectionCode(ObjectiveSection objectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return objectiveSection.validateObjectiveSectionCode(diagnostics, context);
  }

	/**
   * Validates the validateObjectiveSectionText constraint of '<em>Objective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObjectiveSection_validateObjectiveSectionText(ObjectiveSection objectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return objectiveSection.validateObjectiveSectionText(diagnostics, context);
  }

	/**
   * Validates the validateObjectiveSectionTitle constraint of '<em>Objective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObjectiveSection_validateObjectiveSectionTitle(ObjectiveSection objectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return objectiveSection.validateObjectiveSectionTitle(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSubjectiveSection(SubjectiveSection subjectiveSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(subjectiveSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSubjectiveSection_validateSubjectiveSectionHasClinicalStatements(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSubjectiveSection_validateSubjectiveSectionTemplateId(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSubjectiveSection_validateSubjectiveSectionCode(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSubjectiveSection_validateSubjectiveSectionText(subjectiveSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSubjectiveSection_validateSubjectiveSectionTitle(subjectiveSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSubjectiveSectionHasClinicalStatements constraint of '<em>Subjective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSubjectiveSection_validateSubjectiveSectionHasClinicalStatements(
			SubjectiveSection subjectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return subjectiveSection.validateSubjectiveSectionHasClinicalStatements(diagnostics, context);
  }

	/**
   * Validates the validateSubjectiveSectionTemplateId constraint of '<em>Subjective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSubjectiveSection_validateSubjectiveSectionTemplateId(SubjectiveSection subjectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return subjectiveSection.validateSubjectiveSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateSubjectiveSectionCode constraint of '<em>Subjective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSubjectiveSection_validateSubjectiveSectionCode(SubjectiveSection subjectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return subjectiveSection.validateSubjectiveSectionCode(diagnostics, context);
  }

	/**
   * Validates the validateSubjectiveSectionText constraint of '<em>Subjective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSubjectiveSection_validateSubjectiveSectionText(SubjectiveSection subjectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return subjectiveSection.validateSubjectiveSectionText(diagnostics, context);
  }

	/**
   * Validates the validateSubjectiveSectionTitle constraint of '<em>Subjective Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSubjectiveSection_validateSubjectiveSectionTitle(SubjectiveSection subjectiveSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return subjectiveSection.validateSubjectiveSectionTitle(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument(UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(unstructuredDocument, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateGeneralHeaderConstraintsTemplateId(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentPatientRoleHasId(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentAssignedAuthorHasAddr(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentAssignedAuthorHasTelecom(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganization(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasNonXMLBodyText(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasTextReferenceOrRepresentation(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentHasTextMediaTypeValueSet(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentEffectiveTime(unstructuredDocument, diagnostics, context);
    if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentCustodian(unstructuredDocument, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateUnstructuredDocumentPatientRoleHasId constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentPatientRoleHasId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentPatientRoleHasId(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentAssignedAuthorHasAddr constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentAssignedAuthorHasAddr(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentAssignedAuthorHasAddr(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentAssignedAuthorHasTelecom constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentAssignedAuthorHasTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentAssignedAuthorHasTelecom(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasRepresentedCustodianOrganization constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganization(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasRepresentedCustodianOrganization(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasRepresentedCustodianOrganizationId constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasRepresentedCustodianOrganizationName constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasNonXMLBodyText constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasNonXMLBodyText(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasNonXMLBodyText(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasTextReferenceOrRepresentation constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasTextReferenceOrRepresentation(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasTextReferenceOrRepresentation(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentHasTextMediaTypeValueSet constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentHasTextMediaTypeValueSet(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentHasTextMediaTypeValueSet(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentEffectiveTime constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentEffectiveTime(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateUnstructuredDocumentCustodian constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentCustodian(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateUnstructuredDocumentCustodian(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Unstructured Document</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnstructuredDocument_validateGeneralHeaderConstraintsTemplateId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return unstructuredDocument.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHospitalDischargeStudiesSummarySection(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(hospitalDischargeStudiesSummarySection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateHospitalDischargeStudiesSummarySection_validateHospitalDischargeStudiesSummarySectionTemplateId(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateHospitalDischargeStudiesSummarySection_validateHospitalDischargeStudiesSummarySectionCode(hospitalDischargeStudiesSummarySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateHospitalDischargeStudiesSummarySection_validateHospitalDischargeStudiesSummarySectionTitle(hospitalDischargeStudiesSummarySection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateHospitalDischargeStudiesSummarySectionTemplateId constraint of '<em>Hospital Discharge Studies Summary Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHospitalDischargeStudiesSummarySection_validateHospitalDischargeStudiesSummarySectionTemplateId(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return hospitalDischargeStudiesSummarySection.validateHospitalDischargeStudiesSummarySectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateHospitalDischargeStudiesSummarySectionCode constraint of '<em>Hospital Discharge Studies Summary Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHospitalDischargeStudiesSummarySection_validateHospitalDischargeStudiesSummarySectionCode(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return hospitalDischargeStudiesSummarySection.validateHospitalDischargeStudiesSummarySectionCode(diagnostics, context);
  }

	/**
   * Validates the validateHospitalDischargeStudiesSummarySectionTitle constraint of '<em>Hospital Discharge Studies Summary Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHospitalDischargeStudiesSummarySection_validateHospitalDischargeStudiesSummarySectionTitle(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return hospitalDischargeStudiesSummarySection.validateHospitalDischargeStudiesSummarySectionTitle(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryOfPresentIllness(HistoryOfPresentIllness historyOfPresentIllness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(historyOfPresentIllness, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(historyOfPresentIllness, diagnostics, context);
    if (result || diagnostics != null) result &= validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(historyOfPresentIllness, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateHistoryOfPresentIllnessTemplateId constraint of '<em>History Of Present Illness</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(
			HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyOfPresentIllness.validateHistoryOfPresentIllnessTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateHistoryOfPresentIllnessCode constraint of '<em>History Of Present Illness</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(
			HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return historyOfPresentIllness.validateHistoryOfPresentIllnessCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionConsult(
			PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(pastMedicalHistorySectionConsult, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultTemplateId(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultCode(pastMedicalHistorySectionConsult, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultText(pastMedicalHistorySectionConsult, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePastMedicalHistorySectionConsultTemplateId constraint of '<em>Past Medical History Section Consult</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultTemplateId(
			PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySectionConsult.validatePastMedicalHistorySectionConsultTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePastMedicalHistorySectionConsultCode constraint of '<em>Past Medical History Section Consult</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultCode(
			PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySectionConsult.validatePastMedicalHistorySectionConsultCode(diagnostics, context);
  }

	/**
   * Validates the validatePastMedicalHistorySectionConsultText constraint of '<em>Past Medical History Section Consult</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultText(
			PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySectionConsult.validatePastMedicalHistorySectionConsultText(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLevelOneConformance(LevelOneConformance levelOneConformance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(levelOneConformance, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(levelOneConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateLevelOneConformance_validateLevelOneConformanceTemplateId(levelOneConformance, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateLevelOneConformanceTemplateId constraint of '<em>Level One Conformance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLevelOneConformance_validateLevelOneConformanceTemplateId(
			LevelOneConformance levelOneConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return levelOneConformance.validateLevelOneConformanceTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLevelTwoConformance(LevelTwoConformance levelTwoConformance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(levelTwoConformance, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(levelTwoConformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateLevelTwoConformance_validateLevelOneConformanceTemplateId(levelTwoConformance, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateLevelOneConformanceTemplateId constraint of '<em>Level Two Conformance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLevelTwoConformance_validateLevelOneConformanceTemplateId(
			LevelTwoConformance levelTwoConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return levelTwoConformance.validateLevelOneConformanceTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhysicalExaminationSection(PhysicalExaminationSection physicalExaminationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(physicalExaminationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhysicalExaminationSection_validatePhysicalExaminationSectionTemplateId(physicalExaminationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhysicalExaminationSection_validatePhysicalExaminationSectionCode(physicalExaminationSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePhysicalExaminationSectionTemplateId constraint of '<em>Physical Examination Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhysicalExaminationSection_validatePhysicalExaminationSectionTemplateId(
			PhysicalExaminationSection physicalExaminationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return physicalExaminationSection.validatePhysicalExaminationSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePhysicalExaminationSectionCode constraint of '<em>Physical Examination Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhysicalExaminationSection_validatePhysicalExaminationSectionCode(
			PhysicalExaminationSection physicalExaminationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return physicalExaminationSection.validatePhysicalExaminationSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySection(PastMedicalHistorySection pastMedicalHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(pastMedicalHistorySection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionHasClinicalStatements(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionTemplateId(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionCode(pastMedicalHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionText(pastMedicalHistorySection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePastMedicalHistorySectionHasClinicalStatements constraint of '<em>Past Medical History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionHasClinicalStatements(
			PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySection.validatePastMedicalHistorySectionHasClinicalStatements(diagnostics, context);
  }

	/**
   * Validates the validatePastMedicalHistorySectionTemplateId constraint of '<em>Past Medical History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionTemplateId(
			PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySection.validatePastMedicalHistorySectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePastMedicalHistorySectionCode constraint of '<em>Past Medical History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionCode(
			PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySection.validatePastMedicalHistorySectionCode(diagnostics, context);
  }

	/**
   * Validates the validatePastMedicalHistorySectionText constraint of '<em>Past Medical History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionText(
			PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return pastMedicalHistorySection.validatePastMedicalHistorySectionText(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReviewOfSystemsSectionIHE(ReviewOfSystemsSectionIHE reviewOfSystemsSectionIHE,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(reviewOfSystemsSectionIHE, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validateReviewOfSystemsSectionIHE_validateReviewOfSystemsSectionIHETemplateId(reviewOfSystemsSectionIHE, diagnostics, context);
    if (result || diagnostics != null) result &= validateReviewOfSystemsSectionIHE_validateReviewOfSystemsSectionIHECode(reviewOfSystemsSectionIHE, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateReviewOfSystemsSectionIHETemplateId constraint of '<em>Review Of Systems Section IHE</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReviewOfSystemsSectionIHE_validateReviewOfSystemsSectionIHETemplateId(
			ReviewOfSystemsSectionIHE reviewOfSystemsSectionIHE, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return reviewOfSystemsSectionIHE.validateReviewOfSystemsSectionIHETemplateId(diagnostics, context);
  }

	/**
   * Validates the validateReviewOfSystemsSectionIHECode constraint of '<em>Review Of Systems Section IHE</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReviewOfSystemsSectionIHE_validateReviewOfSystemsSectionIHECode(
			ReviewOfSystemsSectionIHE reviewOfSystemsSectionIHE, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return reviewOfSystemsSectionIHE.validateReviewOfSystemsSectionIHECode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReviewOfSystemsSection(ReviewOfSystemsSection reviewOfSystemsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(reviewOfSystemsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(reviewOfSystemsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(reviewOfSystemsSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateReviewOfSystemsSectionTemplateId constraint of '<em>Review Of Systems Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(
			ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return reviewOfSystemsSection.validateReviewOfSystemsSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateReviewOfSystemsSectionCode constraint of '<em>Review Of Systems Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(
			ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return reviewOfSystemsSection.validateReviewOfSystemsSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralStatusSection(GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(generalStatusSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralStatusSection_validateGeneralStatusSectionTemplateId(generalStatusSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralStatusSection_validateGeneralStatusSectionCode(generalStatusSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateGeneralStatusSectionTemplateId constraint of '<em>General Status Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralStatusSection_validateGeneralStatusSectionTemplateId(
			GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalStatusSection.validateGeneralStatusSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateGeneralStatusSectionCode constraint of '<em>General Status Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralStatusSection_validateGeneralStatusSectionCode(
			GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalStatusSection.validateGeneralStatusSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDiagnosticFindings(DiagnosticFindings diagnosticFindings, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(diagnosticFindings, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTemplateId(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(diagnosticFindings, diagnostics, context);
    if (result || diagnostics != null) result &= validateDiagnosticFindings_validateDiagnosticFindingsTitle(diagnosticFindings, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateDiagnosticFindingsTitle constraint of '<em>Diagnostic Findings</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDiagnosticFindings_validateDiagnosticFindingsTitle(DiagnosticFindings diagnosticFindings,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return diagnosticFindings.validateDiagnosticFindingsTitle(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
    if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionClinicalStatements(vitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionCode(vitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionText(vitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(vitalSignsSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateVitalSignsSectionClinicalStatements constraint of '<em>Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSignsSection_validateVitalSignsSectionClinicalStatements(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return vitalSignsSection.validateVitalSignsSectionClinicalStatements(diagnostics, context);
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
	public boolean validateAssessmentSection(AssessmentSection assessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    if (!validate_NoCircularContainment(assessmentSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentSection_validateAssessmentSectionTemplateId(assessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentSection_validateAssessmentSectionCode(assessmentSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateAssessmentSectionTemplateId constraint of '<em>Assessment Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentSection_validateAssessmentSectionTemplateId(AssessmentSection assessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return assessmentSection.validateAssessmentSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateAssessmentSectionCode constraint of '<em>Assessment Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentSection_validateAssessmentSectionCode(AssessmentSection assessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return assessmentSection.validateAssessmentSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlanSection(PlanSection planSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(planSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlanSection_validatePlanSectionTemplateId(planSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlanSection_validatePlanSectionCode(planSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePlanSectionTemplateId constraint of '<em>Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlanSection_validatePlanSectionTemplateId(PlanSection planSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return planSection.validatePlanSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePlanSectionCode constraint of '<em>Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlanSection_validatePlanSectionCode(PlanSection planSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return planSection.validatePlanSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentAndPlanSection(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(assessmentAndPlanSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return assessmentAndPlanSection.validateAssessmentAndPlanSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateAssessmentAndPlanSectionCode constraint of '<em>Assessment And Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return assessmentAndPlanSection.validateAssessmentAndPlanSectionCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCDTRegistryDelegate(CDTRegistryDelegate cdtRegistryDelegate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cdtRegistryDelegate, diagnostics, context);
  }

	/**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return CDTPlugin.INSTANCE;
  }

} // CDTValidator
