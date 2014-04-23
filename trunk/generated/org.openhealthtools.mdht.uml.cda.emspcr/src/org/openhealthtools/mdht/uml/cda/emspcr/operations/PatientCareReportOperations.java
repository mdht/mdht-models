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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCardiacArrestEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAdvanceDirectives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAllergiesAndAdverseReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPhysicalAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportProceduresPerformedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPatientCareNarrativeSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDispatchSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPersonnelAdverseEventSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportProtocolSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSituationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTimesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportInjuryIncidentDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Injury Incident Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSBillingSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Billing Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCardiacArrestEvent() <em>Get Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAdvanceDirectives() <em>Get Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAllergiesAndAdverseReactionsSection() <em>Get Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPhysicalAssessmentSection() <em>Get Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getProceduresPerformedSection() <em>Get Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPatientCareNarrativeSection() <em>Get Patient Care Narrative Section</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSBillingSections() <em>Get EMS Billing Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validatePatientCareReportCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))";

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
	 * The cached OCL expression body for the '{@link #validatePatientCareReportPastMedicalHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportPastMedicalHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientCareReportPastMedicalHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportPastMedicalHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validatePatientCareReportPastMedicalHistorySection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportPastMedicalHistorySection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientCareReportSocialHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportSocialHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientCareReportSocialHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportSocialHistorySection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validatePatientCareReportSocialHistorySection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportSocialHistorySection"),
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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))";

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
	 * The cached OCL expression body for the '{@link #validatePatientCareReportPatientCareNarrativeSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportPatientCareNarrativeSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientCareReportPatientCareNarrativeSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportPatientCareNarrativeSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validatePatientCareReportPatientCareNarrativeSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportPatientCareNarrativeSection"),
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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))";

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
	 * The cached OCL expression body for the '{@link #validatePatientCareReportDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))";

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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

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
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportAuthorParticipation"),
					new Object[] { patientCareReport }));
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
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
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
	protected static final String VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))";

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
	 * The cached OCL expression body for the '{@link #validatePatientCareReportEMSBillingSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Billing Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportEMSBillingSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientCareReportEMSBillingSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Billing Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientCareReportEMSBillingSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validatePatientCareReportEMSBillingSection(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_BILLING_SECTION,
					EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSBillingSection"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCurrentMedication(PatientCareReport) <em>Get Current Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMedication(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CURRENT_MEDICATION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::EMSCurrentMedicationSection)";

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

	public static EMSCurrentMedicationSection getCurrentMedication(PatientCareReport patientCareReport) {
		if (GET_CURRENT_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(322));
			try {
				GET_CURRENT_MEDICATION__EOCL_QRY = helper.createQuery(GET_CURRENT_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CURRENT_MEDICATION__EOCL_QRY);
		return (EMSCurrentMedicationSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCardiacArrestEvent(PatientCareReport) <em>Get Cardiac Arrest Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacArrestEvent(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARDIAC_ARREST_EVENT__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSCardiacArrestEventSection)";

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

	public static EMSCardiacArrestEventSection getCardiacArrestEvent(PatientCareReport patientCareReport) {
		if (GET_CARDIAC_ARREST_EVENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(323));
			try {
				GET_CARDIAC_ARREST_EVENT__EOCL_QRY = helper.createQuery(GET_CARDIAC_ARREST_EVENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CARDIAC_ARREST_EVENT__EOCL_QRY);
		return (EMSCardiacArrestEventSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectives(PatientCareReport) <em>Get Advance Directives</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectives(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::EMSAdvanceDirectivesSection)";

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

	public static EMSAdvanceDirectivesSection getAdvanceDirectives(PatientCareReport patientCareReport) {
		if (GET_ADVANCE_DIRECTIVES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(324));
			try {
				GET_ADVANCE_DIRECTIVES__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES__EOCL_QRY);
		return (EMSAdvanceDirectivesSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesAndAdverseReactionsSection(PatientCareReport) <em>Get Allergies And Adverse Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesAndAdverseReactionsSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection)";

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

	public static EMSAllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection(
			PatientCareReport patientCareReport) {
		if (GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(325));
			try {
				GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY);
		return (EMSAllergiesAndAdverseReactionsSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPastMedicalHistorySection(PatientCareReport) <em>Get Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))->asSequence()->any(true).oclAsType(emspcr::EMSPastMedicalHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getPastMedicalHistorySection(PatientCareReport) <em>Get Past Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EMSPastMedicalHistorySection getPastMedicalHistorySection(PatientCareReport patientCareReport) {
		if (GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(326));
			try {
				GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (EMSPastMedicalHistorySection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(PatientCareReport) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))->asSequence()->any(true).oclAsType(emspcr::EMSSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(PatientCareReport) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EMSSocialHistorySection getSocialHistorySection(PatientCareReport patientCareReport) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(327));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (EMSSocialHistorySection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalAssessmentSection(PatientCareReport) <em>Get Physical Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAssessmentSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::EMSPhysicalAssessmentSection)";

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

	public static EMSPhysicalAssessmentSection getPhysicalAssessmentSection(PatientCareReport patientCareReport) {
		if (GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(328));
			try {
				GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY);
		return (EMSPhysicalAssessmentSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsAdministeredSection(PatientCareReport) <em>Get Medications Administered Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsAdministeredSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::EMSMedicationsAdministeredSection)";

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

	public static EMSMedicationsAdministeredSection getMedicationsAdministeredSection(
			PatientCareReport patientCareReport) {
		if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(329));
			try {
				GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (EMSMedicationsAdministeredSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresPerformedSection(PatientCareReport) <em>Get Procedures Performed Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresPerformedSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_PERFORMED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::EMSProceduresPerformedSection)";

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

	public static EMSProceduresPerformedSection getProceduresPerformedSection(PatientCareReport patientCareReport) {
		if (GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(330));
			try {
				GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_PERFORMED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_PERFORMED_SECTION__EOCL_QRY);
		return (EMSProceduresPerformedSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientCareNarrativeSection(PatientCareReport) <em>Get Patient Care Narrative Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCareNarrativeSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_CARE_NARRATIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))->asSequence()->any(true).oclAsType(emspcr::EMSPatientCareNarrativeSection)";

	/**
	 * The cached OCL query for the '{@link #getPatientCareNarrativeSection(PatientCareReport) <em>Get Patient Care Narrative Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCareNarrativeSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_CARE_NARRATIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EMSPatientCareNarrativeSection getPatientCareNarrativeSection(PatientCareReport patientCareReport) {
		if (GET_PATIENT_CARE_NARRATIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(331));
			try {
				GET_PATIENT_CARE_NARRATIVE_SECTION__EOCL_QRY = helper.createQuery(GET_PATIENT_CARE_NARRATIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_CARE_NARRATIVE_SECTION__EOCL_QRY);
		return (EMSPatientCareNarrativeSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSceneSection(PatientCareReport) <em>Get Scene Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SCENE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))->asSequence()->any(true).oclAsType(emspcr::EMSSceneSection)";

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

	public static EMSSceneSection getSceneSection(PatientCareReport patientCareReport) {
		if (GET_SCENE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(332));
			try {
				GET_SCENE_SECTION__EOCL_QRY = helper.createQuery(GET_SCENE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SCENE_SECTION__EOCL_QRY);
		return (EMSSceneSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispatchSection(PatientCareReport) <em>Get Dispatch Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPATCH_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))->asSequence()->any(true).oclAsType(emspcr::EMSDispatchSection)";

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

	public static EMSDispatchSection getDispatchSection(PatientCareReport patientCareReport) {
		if (GET_DISPATCH_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(333));
			try {
				GET_DISPATCH_SECTION__EOCL_QRY = helper.createQuery(GET_DISPATCH_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPATCH_SECTION__EOCL_QRY);
		return (EMSDispatchSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispositionSection(PatientCareReport) <em>Get Disposition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPOSITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))->asSequence()->any(true).oclAsType(emspcr::EMSDispositionSection)";

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

	public static EMSDispositionSection getDispositionSection(PatientCareReport patientCareReport) {
		if (GET_DISPOSITION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(334));
			try {
				GET_DISPOSITION_SECTION__EOCL_QRY = helper.createQuery(GET_DISPOSITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPOSITION_SECTION__EOCL_QRY);
		return (EMSDispositionSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPersonnelAdverseEventSection(PatientCareReport) <em>Get Personnel Adverse Event Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnelAdverseEventSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSPersonnelAdverseEventSection)";

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

	public static EMSPersonnelAdverseEventSection getPersonnelAdverseEventSection(PatientCareReport patientCareReport) {
		if (GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(335));
			try {
				GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY = helper.createQuery(GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY);
		return (EMSPersonnelAdverseEventSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProtocolSection(PatientCareReport) <em>Get Protocol Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROTOCOL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))->asSequence()->any(true).oclAsType(emspcr::EMSProtocolSection)";

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

	public static EMSProtocolSection getProtocolSection(PatientCareReport patientCareReport) {
		if (GET_PROTOCOL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(336));
			try {
				GET_PROTOCOL_SECTION__EOCL_QRY = helper.createQuery(GET_PROTOCOL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROTOCOL_SECTION__EOCL_QRY);
		return (EMSProtocolSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResponseSection(PatientCareReport) <em>Get Response Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPONSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))->asSequence()->any(true).oclAsType(emspcr::EMSResponseSection)";

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

	public static EMSResponseSection getResponseSection(PatientCareReport patientCareReport) {
		if (GET_RESPONSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(337));
			try {
				GET_RESPONSE_SECTION__EOCL_QRY = helper.createQuery(GET_RESPONSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPONSE_SECTION__EOCL_QRY);
		return (EMSResponseSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSituationSection(PatientCareReport) <em>Get Situation Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SITUATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))->asSequence()->any(true).oclAsType(emspcr::EMSSituationSection)";

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

	public static EMSSituationSection getSituationSection(PatientCareReport patientCareReport) {
		if (GET_SITUATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(338));
			try {
				GET_SITUATION_SECTION__EOCL_QRY = helper.createQuery(GET_SITUATION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SITUATION_SECTION__EOCL_QRY);
		return (EMSSituationSection) query.evaluate(patientCareReport);
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
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(339));
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
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))->asSequence()->any(true).oclAsType(emspcr::EMSVitalSignsSection)";

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

	public static EMSVitalSignsSection getVitalSignsSection(PatientCareReport patientCareReport) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(340));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (EMSVitalSignsSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryIncidentDescriptionSection(PatientCareReport) <em>Get Injury Incident Description Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryIncidentDescriptionSection(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::EMSInjuryIncidentDescriptionSection)";

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

	public static EMSInjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection(
			PatientCareReport patientCareReport) {
		if (GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(341));
			try {
				GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY = helper.createQuery(GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_INCIDENT_DESCRIPTION_SECTION__EOCL_QRY);
		return (EMSInjuryIncidentDescriptionSection) query.evaluate(patientCareReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEMSBillingSections(PatientCareReport) <em>Get EMS Billing Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSBillingSections(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EMS_BILLING_SECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection)).oclAsType(emspcr::EMSBillingSection)";

	/**
	 * The cached OCL query for the '{@link #getEMSBillingSections(PatientCareReport) <em>Get EMS Billing Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSBillingSections(PatientCareReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EMS_BILLING_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EMSBillingSection> getEMSBillingSections(PatientCareReport patientCareReport) {
		if (GET_EMS_BILLING_SECTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PATIENT_CARE_REPORT,
				EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(342));
			try {
				GET_EMS_BILLING_SECTIONS__EOCL_QRY = helper.createQuery(GET_EMS_BILLING_SECTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EMS_BILLING_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EMSBillingSection> result = (Collection<EMSBillingSection>) query.evaluate(patientCareReport);
		return new BasicEList.UnmodifiableEList<EMSBillingSection>(result.size(), result.toArray());
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
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGeneralHeaderConstraintsId(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_ID,
					EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsId"), new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Patient Care Report')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGeneralHeaderConstraintsTitle(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TITLE,
					EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsTitle"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGeneralHeaderConstraintsVersionNumber(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER,
					EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsVersionNumber"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGeneralHeaderConstraintsComponentOf(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF,
					EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsComponentOf"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGeneralHeaderConstraintsCustodian(PatientCareReport patientCareReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientCareReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN,
					EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodian"),
					new Object[] { patientCareReport }));
			}

			return false;
		}
		return true;
	}

} // PatientCareReportOperations
