/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.BillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Care Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportBilling(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCardiacArrestEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAdvanceDirectives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAllergiesAndAdverseReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPastMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSocialHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPhysicalAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportProceduresPerformedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPatientCareNarrative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDispatchSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPersonnelAdverseEventSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportProtocolSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSituationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTimesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportInjuryIncidentDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Injury Incident Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getBilling() <em>Get Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCardiacArrestEvent() <em>Get Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAdvanceDirectives() <em>Get Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAllergiesAndAdverseReactionsSection() <em>Get Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPastMedicalHistory() <em>Get Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSocialHistory() <em>Get Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPhysicalAssessmentSection() <em>Get Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getProceduresPerformedSection() <em>Get Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPatientCareNarrative() <em>Get Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSceneSection() <em>Get Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getDispatchSection() <em>Get Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getDispositionSection() <em>Get Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPersonnelAdverseEventSection() <em>Get Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getProtocolSection() <em>Get Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getResponseSection() <em>Get Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSituationSection() <em>Get Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getTimesSection() <em>Get Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getInjuryIncidentDescriptionSection() <em>Get Injury Incident Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientCareReportOperations extends GeneralHeaderConstraintsOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PatientCareReportOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportClassCode(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CLASS_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportClassCode"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportMoodCode(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportMoodCode"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportCodeP(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportCodeP"), new Object[] { patientCareReport }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP", passToken);
				}
				passToken.add(patientCareReport);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportCode(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientCareReport)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportCode"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Patient Care Report')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportTitle(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_TITLE,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportTitle"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportVersionNumber(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_VERSION_NUMBER,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportVersionNumber"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportId(PatientCareReport patientCareReport, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ID,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportId"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportConfidentialityCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Confidentiality Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportConfidentialityCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V'))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportConfidentialityCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Confidentiality Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportConfidentialityCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportConfidentialityCode(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportConfidentialityCode"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportRecordTarget(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_RECORD_TARGET,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportRecordTarget"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::BillingSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportBilling(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_BILLING,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportBilling"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CurrentMedicationSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportCurrentMedication(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CURRENT_MEDICATION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportCurrentMedication"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Cardiac Arrest Event</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CardiacArrestEventSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Cardiac Arrest Event</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportCardiacArrestEvent(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportCardiacArrestEvent"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AdvanceDirectivesSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportAdvanceDirectives(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportAdvanceDirectives"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies And Adverse Reactions Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AllergiesAndAdverseReactionsSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies And Adverse Reactions Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportAllergiesAndAdverseReactionsSection(
			PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportAllergiesAndAdverseReactionsSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PastMedicalHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportPastMedicalHistory(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportPastMedicalHistory"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SocialHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportSocialHistory(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SOCIAL_HISTORY,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportSocialHistory"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Physical Assessment Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PhysicalAssessmentSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Physical Assessment Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportPhysicalAssessmentSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportPhysicalAssessmentSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Medications Administered Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::MedicationsAdministeredSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Medications Administered Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportMedicationsAdministeredSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportMedicationsAdministeredSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Procedures Performed Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProceduresPerformedSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Procedures Performed Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportProceduresPerformedSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportProceduresPerformedSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PatientCareNarrativeSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportPatientCareNarrative(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportPatientCareNarrative"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Scene Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SceneSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Scene Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportSceneSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SCENE_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportSceneSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportComponentOf(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_COMPONENT_OF,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportComponentOf"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispatchSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportDispatchSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_DISPATCH_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportDispatchSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Disposition Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispositionSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Disposition Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportDispositionSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_DISPOSITION_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportDispositionSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Personnel Adverse Event Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PersonnelAdverseEventSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Personnel Adverse Event Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportPersonnelAdverseEventSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportPersonnelAdverseEventSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Protocol Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProtocolSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Protocol Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportProtocolSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PROTOCOL_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportProtocolSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Response Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ResponseSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Response Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportResponseSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_RESPONSE_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportResponseSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Situation Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SituationSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Situation Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportSituationSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SITUATION_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportSituationSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Times Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::TimesSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Times Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportTimesSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_TIMES_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportTimesSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Vital Signs Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::VitalSignsSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Vital Signs Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportVitalSignsSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportVitalSignsSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author Participation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author Participation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportAuthorParticipation(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportAuthorParticipation"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportCustodian(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CUSTODIAN,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportCustodian"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportDocumentationOf(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_DOCUMENTATION_OF,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportDocumentationOf"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportRelatedDocument(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_RELATED_DOCUMENT,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportRelatedDocument"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportParticipant(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PARTICIPANT,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportParticipant"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientCareReportInjuryIncidentDescriptionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Injury Incident Description Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportInjuryIncidentDescriptionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::InjuryIncidentDescriptionSection))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientCareReportInjuryIncidentDescriptionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Injury Incident Description Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientCareReportInjuryIncidentDescriptionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientCareReportInjuryIncidentDescriptionSection(
			PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportInjuryIncidentDescriptionSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getBilling(PatientCareReport) <em>Get Billing</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getBilling(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_BILLING__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::BillingSection))->asSequence()->any(true).oclAsType(emspcr::BillingSection)";

	/**
	* The cached OCL query for the '{@link #getBilling(PatientCareReport) <em>Get Billing</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getBilling(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_BILLING__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static BillingSection getBilling(PatientCareReport patientCareReport) {
		if (GET_BILLING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(326));
			try {
				GET_BILLING__EOCL_QRY = helper.createQuery(GET_BILLING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BILLING__EOCL_QRY);
		return (BillingSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getCurrentMedication(PatientCareReport) <em>Get Current Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCurrentMedication(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_CURRENT_MEDICATION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::CurrentMedicationSection)";

	/**
	* The cached OCL query for the '{@link #getCurrentMedication(PatientCareReport) <em>Get Current Medication</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCurrentMedication(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CURRENT_MEDICATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static CurrentMedicationSection getCurrentMedication(PatientCareReport patientCareReport) {
		if (GET_CURRENT_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(327));
			try {
				GET_CURRENT_MEDICATION__EOCL_QRY = helper.createQuery(GET_CURRENT_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CURRENT_MEDICATION__EOCL_QRY);
		return (CurrentMedicationSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getCardiacArrestEvent(PatientCareReport) <em>Get Cardiac Arrest Event</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCardiacArrestEvent(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_CARDIAC_ARREST_EVENT__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::CardiacArrestEventSection)";

	/**
	* The cached OCL query for the '{@link #getCardiacArrestEvent(PatientCareReport) <em>Get Cardiac Arrest Event</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCardiacArrestEvent(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CARDIAC_ARREST_EVENT__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static CardiacArrestEventSection getCardiacArrestEvent(PatientCareReport patientCareReport) {
		if (GET_CARDIAC_ARREST_EVENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(328));
			try {
				GET_CARDIAC_ARREST_EVENT__EOCL_QRY = helper.createQuery(GET_CARDIAC_ARREST_EVENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CARDIAC_ARREST_EVENT__EOCL_QRY);
		return (CardiacArrestEventSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getAdvanceDirectives(PatientCareReport) <em>Get Advance Directives</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAdvanceDirectives(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_ADVANCE_DIRECTIVES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::AdvanceDirectivesSection)";

	/**
	* The cached OCL query for the '{@link #getAdvanceDirectives(PatientCareReport) <em>Get Advance Directives</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAdvanceDirectives(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static AdvanceDirectivesSection getAdvanceDirectives(PatientCareReport patientCareReport) {
		if (GET_ADVANCE_DIRECTIVES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(329));
			try {
				GET_ADVANCE_DIRECTIVES__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getAllergiesAndAdverseReactionsSection(PatientCareReport) <em>Get Allergies And Adverse Reactions Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesAndAdverseReactionsSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::AllergiesAndAdverseReactionsSection)";

	/**
	* The cached OCL query for the '{@link #getAllergiesAndAdverseReactionsSection(PatientCareReport) <em>Get Allergies And Adverse Reactions Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesAndAdverseReactionsSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static AllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection(
			PatientCareReport patientCareReport) {
		if (GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(330));
			try {
				GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesAndAdverseReactionsSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getPastMedicalHistory(PatientCareReport) <em>Get Past Medical History</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPastMedicalHistory(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_PAST_MEDICAL_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PastMedicalHistorySection))->asSequence()->any(true).oclAsType(emspcr::PastMedicalHistorySection)";

	/**
	* The cached OCL query for the '{@link #getPastMedicalHistory(PatientCareReport) <em>Get Past Medical History</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPastMedicalHistory(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PAST_MEDICAL_HISTORY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PastMedicalHistorySection getPastMedicalHistory(PatientCareReport patientCareReport) {
		if (GET_PAST_MEDICAL_HISTORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(331));
			try {
				GET_PAST_MEDICAL_HISTORY__EOCL_QRY = helper.createQuery(GET_PAST_MEDICAL_HISTORY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAST_MEDICAL_HISTORY__EOCL_QRY);
		return (PastMedicalHistorySection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getSocialHistory(PatientCareReport) <em>Get Social History</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistory(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_SOCIAL_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SocialHistorySection))->asSequence()->any(true).oclAsType(emspcr::SocialHistorySection)";

	/**
	* The cached OCL query for the '{@link #getSocialHistory(PatientCareReport) <em>Get Social History</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistory(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static SocialHistorySection getSocialHistory(PatientCareReport patientCareReport) {
		if (GET_SOCIAL_HISTORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(332));
			try {
				GET_SOCIAL_HISTORY__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getPhysicalAssessmentSection(PatientCareReport) <em>Get Physical Assessment Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalAssessmentSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::PhysicalAssessmentSection)";

	/**
	* The cached OCL query for the '{@link #getPhysicalAssessmentSection(PatientCareReport) <em>Get Physical Assessment Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalAssessmentSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PhysicalAssessmentSection getPhysicalAssessmentSection(PatientCareReport patientCareReport) {
		if (GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(333));
			try {
				GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY);
		return (PhysicalAssessmentSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationsAdministeredSection(PatientCareReport) <em>Get Medications Administered Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsAdministeredSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::MedicationsAdministeredSection)";

	/**
	* The cached OCL query for the '{@link #getMedicationsAdministeredSection(PatientCareReport) <em>Get Medications Administered Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsAdministeredSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static MedicationsAdministeredSection getMedicationsAdministeredSection(PatientCareReport patientCareReport) {
		if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(334));
			try {
				GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (MedicationsAdministeredSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getProceduresPerformedSection(PatientCareReport) <em>Get Procedures Performed Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresPerformedSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURES_PERFORMED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::ProceduresPerformedSection)";

	/**
	* The cached OCL query for the '{@link #getProceduresPerformedSection(PatientCareReport) <em>Get Procedures Performed Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresPerformedSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProceduresPerformedSection getProceduresPerformedSection(PatientCareReport patientCareReport) {
		if (GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(335));
			try {
				GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_PERFORMED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY);
		return (ProceduresPerformedSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getPatientCareNarrative(PatientCareReport) <em>Get Patient Care Narrative</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientCareNarrative(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_PATIENT_CARE_NARRATIVE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PatientCareNarrativeSection))->asSequence()->any(true).oclAsType(emspcr::PatientCareNarrativeSection)";

	/**
	* The cached OCL query for the '{@link #getPatientCareNarrative(PatientCareReport) <em>Get Patient Care Narrative</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientCareNarrative(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PATIENT_CARE_NARRATIVE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PatientCareNarrativeSection getPatientCareNarrative(PatientCareReport patientCareReport) {
		if (GET_PATIENT_CARE_NARRATIVE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(336));
			try {
				GET_PATIENT_CARE_NARRATIVE__EOCL_QRY = helper.createQuery(GET_PATIENT_CARE_NARRATIVE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_CARE_NARRATIVE__EOCL_QRY);
		return (PatientCareNarrativeSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getSceneSection(PatientCareReport) <em>Get Scene Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSceneSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_SCENE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SceneSection))->asSequence()->any(true).oclAsType(emspcr::SceneSection)";

	/**
	* The cached OCL query for the '{@link #getSceneSection(PatientCareReport) <em>Get Scene Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSceneSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SCENE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static SceneSection getSceneSection(PatientCareReport patientCareReport) {
		if (GET_SCENE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(337));
			try {
				GET_SCENE_SECTION__EOCL_QRY = helper.createQuery(GET_SCENE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SCENE_SECTION__EOCL_QRY);
		return (SceneSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getDispatchSection(PatientCareReport) <em>Get Dispatch Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDispatchSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_DISPATCH_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispatchSection))->asSequence()->any(true).oclAsType(emspcr::DispatchSection)";

	/**
	* The cached OCL query for the '{@link #getDispatchSection(PatientCareReport) <em>Get Dispatch Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDispatchSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_DISPATCH_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static DispatchSection getDispatchSection(PatientCareReport patientCareReport) {
		if (GET_DISPATCH_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(338));
			try {
				GET_DISPATCH_SECTION__EOCL_QRY = helper.createQuery(GET_DISPATCH_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPATCH_SECTION__EOCL_QRY);
		return (DispatchSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getDispositionSection(PatientCareReport) <em>Get Disposition Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDispositionSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_DISPOSITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispositionSection))->asSequence()->any(true).oclAsType(emspcr::DispositionSection)";

	/**
	* The cached OCL query for the '{@link #getDispositionSection(PatientCareReport) <em>Get Disposition Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDispositionSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_DISPOSITION_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static DispositionSection getDispositionSection(PatientCareReport patientCareReport) {
		if (GET_DISPOSITION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(339));
			try {
				GET_DISPOSITION_SECTION__EOCL_QRY = helper.createQuery(GET_DISPOSITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPOSITION_SECTION__EOCL_QRY);
		return (DispositionSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getPersonnelAdverseEventSection(PatientCareReport) <em>Get Personnel Adverse Event Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPersonnelAdverseEventSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PersonnelAdverseEventSection))->asSequence()->any(true).oclAsType(emspcr::PersonnelAdverseEventSection)";

	/**
	* The cached OCL query for the '{@link #getPersonnelAdverseEventSection(PatientCareReport) <em>Get Personnel Adverse Event Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPersonnelAdverseEventSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PersonnelAdverseEventSection getPersonnelAdverseEventSection(PatientCareReport patientCareReport) {
		if (GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(340));
			try {
				GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY = helper.createQuery(GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY);
		return (PersonnelAdverseEventSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getProtocolSection(PatientCareReport) <em>Get Protocol Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProtocolSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROTOCOL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProtocolSection))->asSequence()->any(true).oclAsType(emspcr::ProtocolSection)";

	/**
	* The cached OCL query for the '{@link #getProtocolSection(PatientCareReport) <em>Get Protocol Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProtocolSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROTOCOL_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProtocolSection getProtocolSection(PatientCareReport patientCareReport) {
		if (GET_PROTOCOL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(341));
			try {
				GET_PROTOCOL_SECTION__EOCL_QRY = helper.createQuery(GET_PROTOCOL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROTOCOL_SECTION__EOCL_QRY);
		return (ProtocolSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getResponseSection(PatientCareReport) <em>Get Response Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getResponseSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_RESPONSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ResponseSection))->asSequence()->any(true).oclAsType(emspcr::ResponseSection)";

	/**
	* The cached OCL query for the '{@link #getResponseSection(PatientCareReport) <em>Get Response Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getResponseSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_RESPONSE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ResponseSection getResponseSection(PatientCareReport patientCareReport) {
		if (GET_RESPONSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(342));
			try {
				GET_RESPONSE_SECTION__EOCL_QRY = helper.createQuery(GET_RESPONSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPONSE_SECTION__EOCL_QRY);
		return (ResponseSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getSituationSection(PatientCareReport) <em>Get Situation Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSituationSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_SITUATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SituationSection))->asSequence()->any(true).oclAsType(emspcr::SituationSection)";

	/**
	* The cached OCL query for the '{@link #getSituationSection(PatientCareReport) <em>Get Situation Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSituationSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SITUATION_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static SituationSection getSituationSection(PatientCareReport patientCareReport) {
		if (GET_SITUATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(343));
			try {
				GET_SITUATION_SECTION__EOCL_QRY = helper.createQuery(GET_SITUATION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SITUATION_SECTION__EOCL_QRY);
		return (SituationSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getTimesSection(PatientCareReport) <em>Get Times Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getTimesSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_TIMES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::TimesSection))->asSequence()->any(true).oclAsType(emspcr::TimesSection)";

	/**
	* The cached OCL query for the '{@link #getTimesSection(PatientCareReport) <em>Get Times Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getTimesSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_TIMES_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static TimesSection getTimesSection(PatientCareReport patientCareReport) {
		if (GET_TIMES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(344));
			try {
				GET_TIMES_SECTION__EOCL_QRY = helper.createQuery(GET_TIMES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TIMES_SECTION__EOCL_QRY);
		return (TimesSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getVitalSignsSection(PatientCareReport) <em>Get Vital Signs Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getVitalSignsSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::VitalSignsSection))->asSequence()->any(true).oclAsType(emspcr::VitalSignsSection)";

	/**
	* The cached OCL query for the '{@link #getVitalSignsSection(PatientCareReport) <em>Get Vital Signs Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getVitalSignsSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static VitalSignsSection getVitalSignsSection(PatientCareReport patientCareReport) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(345));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getInjuryIncidentDescriptionSection(PatientCareReport) <em>Get Injury Incident Description Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInjuryIncidentDescriptionSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::InjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::InjuryIncidentDescriptionSection)";

	/**
	* The cached OCL query for the '{@link #getInjuryIncidentDescriptionSection(PatientCareReport) <em>Get Injury Incident Description Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInjuryIncidentDescriptionSection(PatientCareReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static InjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection(
			PatientCareReport patientCareReport) {
		if (GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(346));
			try {
				GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY = helper.createQuery(GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY);
		return (InjuryIncidentDescriptionSection) query.evaluate(patientCareReport);
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.2')";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateGeneralHeaderConstraintsTemplateId(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"GeneralHeaderConstraintsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(patientCareReport, context) }),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

} // PatientCareReportOperations
