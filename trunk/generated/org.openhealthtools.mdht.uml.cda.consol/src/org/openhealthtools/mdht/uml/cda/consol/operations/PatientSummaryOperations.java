/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PatientSummary;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.PurposeSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryServiceEventRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryLanguageCodeFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryNoTemplateIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary No Template Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasEffectiveTimeSeconds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Seconds</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasEffectiveTimeZone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Zone</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryOneOrTwoRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary One Or Two Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAssignedAuthorNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHealthcareProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Healthcare Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPregnancyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummarySurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPurposeSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Purpose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPregnancyHistorySection() <em>Get Pregnancy History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPurposeSection() <em>Get Purpose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientSummaryOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | not doc.serviceEvent.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | not doc.serviceEvent.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryServiceEventRequired(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryServiceEventRequired"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | doc.serviceEvent.classCode = vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | doc.serviceEvent.classCode = vocab::ActClassRoot::PCPR)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryServiceEventClassCode(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryServiceEventClassCode"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | "+
"   not doc.serviceEvent.effectiveTime.low.oclIsUndefined() and not doc.serviceEvent.effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | 
	 *    not doc.serviceEvent.effectiveTime.low.oclIsUndefined() and not doc.serviceEvent.effectiveTime.high.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryServiceEventEffectiveTime(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryServiceEventEffectiveTime"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryLanguageCodeFormat(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryLanguageCodeFormat"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary No Template Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->forAll(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1' implies id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary No Template Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->forAll(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1' implies id.extension.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryNoTemplateIdExtension(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryNoTemplateIdExtension"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Seconds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.value.size() >= 4";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Seconds</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.value.size() >= 4
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryHasEffectiveTimeSeconds"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.value.size() >= 19";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Zone</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.value.size() >= 19
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryHasEffectiveTimeZone(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryHasEffectiveTimeZone"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary One Or Two Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() = 1 or self.recordTarget->size() =2";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary One Or Two Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1 or self.recordTarget->size() =2
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryOneOrTwoRecordTarget(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryOneOrTwoRecordTarget"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "+
"   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryHasAssignedAuthor(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryHasAssignedAuthor"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | (not author.assignedAuthor.representedOrganization.oclIsUndefined()"+
"      and author.assignedAuthor.assignedPerson.oclIsUndefined() and author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())"+
"   implies author.assignedAuthor.id->one(id : datatypes::II | id.nullFlavor = vocab::NullFlavor::NA))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | (not author.assignedAuthor.representedOrganization.oclIsUndefined()
	 *       and author.assignedAuthor.assignedPerson.oclIsUndefined() and author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 *    implies author.assignedAuthor.id->one(id : datatypes::II | id.nullFlavor = vocab::NullFlavor::NA))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryHasAssignedAuthorNullFlavor"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informationRecipient->size() > 0
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryHasInformationRecipient(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryHasInformationRecipient"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Healthcare Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf.serviceEvent.performer->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Healthcare Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf.serviceEvent.performer->size() > 0
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryHealthcareProvider(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HEALTHCARE_PROVIDER,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryHealthcareProvider"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryLanguageCode(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_LANGUAGE_CODE,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryLanguageCode"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryAdvanceDirectivesSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryAdvanceDirectivesSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryAllergiesReactionsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryAllergiesReactionsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryProblemListSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryProblemListSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryEncountersSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ENCOUNTERS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryEncountersSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryImmunizationsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_IMMUNIZATIONS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryImmunizationsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPayersSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PAYERS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryPayersSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryMedicationsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICATIONS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryMedicationsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPlanOfCareSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PLAN_OF_CARE_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryPlanOfCareSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPregnancyHistorySection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryPregnancyHistorySection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummarySurgeriesSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SURGERIES_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummarySurgeriesSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryVitalSignsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_VITAL_SIGNS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryVitalSignsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryDiagnosticResultsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryDiagnosticResultsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryFamilyHistorySection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_FAMILY_HISTORY_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryFamilyHistorySection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummarySocialHistorySection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummarySocialHistorySection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryResultsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_RESULTS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryResultsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryMedicalEquipmentSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryMedicalEquipmentSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryFunctionalStatusSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryFunctionalStatusSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Purpose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Purpose Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPurposeSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PURPOSE_SECTION,
						 ConsolPlugin.INSTANCE.getString("PatientSummaryPurposeSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(PatientSummary) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(PatientSummary) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AdvanceDirectivesSection getAdvanceDirectivesSection(PatientSummary patientSummary) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(99));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(PatientSummary) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(PatientSummary) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AllergiesReactionsSection getAllergiesReactionsSection(PatientSummary patientSummary) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(100));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemListSection(PatientSummary) <em>Get Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemListSection(PatientSummary) <em>Get Problem List Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_LIST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemListSection getProblemListSection(PatientSummary patientSummary) {
		if (GET_PROBLEM_LIST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(101));
			try {
				GET_PROBLEM_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection(PatientSummary) <em>Get Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->first().oclAsType(consol::EncountersSection)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection(PatientSummary) <em>Get Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->first().oclAsType(consol::EncountersSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EncountersSection getEncountersSection(PatientSummary patientSummary) {
		if (GET_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(102));
			try {
				GET_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(PatientSummary) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(PatientSummary) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ImmunizationsSection getImmunizationsSection(PatientSummary patientSummary) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(103));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection(PatientSummary) <em>Get Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection(PatientSummary) <em>Get Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PayersSection getPayersSection(PatientSummary patientSummary) {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(104));
			try {
				GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(PatientSummary) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(PatientSummary) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationsSection getMedicationsSection(PatientSummary patientSummary) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(105));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(PatientSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(PatientSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PlanOfCareSection getPlanOfCareSection(PatientSummary patientSummary) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(106));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyHistorySection(PatientSummary) <em>Get Pregnancy History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))->asSequence()->first().oclAsType(consol::PregnancyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyHistorySection(PatientSummary) <em>Get Pregnancy History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))->asSequence()->first().oclAsType(consol::PregnancyHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PregnancyHistorySection getPregnancyHistorySection(PatientSummary patientSummary) {
		if (GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(107));
			try {
				GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PREGNANCY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY);
		return (PregnancyHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgeriesSection(PatientSummary) <em>Get Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgeriesSection(PatientSummary) <em>Get Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  SurgeriesSection getSurgeriesSection(PatientSummary patientSummary) {
		if (GET_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(108));
			try {
				GET_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_SURGERIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGERIES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(PatientSummary) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(PatientSummary) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  VitalSignsSection getVitalSignsSection(PatientSummary patientSummary) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(109));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticResultsSection(PatientSummary) <em>Get Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))->asSequence()->first().oclAsType(consol::DiagnosticResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticResultsSection(PatientSummary) <em>Get Diagnostic Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))->asSequence()->first().oclAsType(consol::DiagnosticResultsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  DiagnosticResultsSection getDiagnosticResultsSection(PatientSummary patientSummary) {
		if (GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(110));
			try {
				GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY);
		return (DiagnosticResultsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(PatientSummary) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(PatientSummary) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  FamilyHistorySection getFamilyHistorySection(PatientSummary patientSummary) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(111));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(PatientSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(PatientSummary) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  SocialHistorySection getSocialHistorySection(PatientSummary patientSummary) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(112));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(PatientSummary) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->first().oclAsType(consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(PatientSummary) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->first().oclAsType(consol::ResultsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ResultsSection getResultsSection(PatientSummary patientSummary) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(113));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(PatientSummary) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(PatientSummary) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicalEquipmentSection getMedicalEquipmentSection(PatientSummary patientSummary) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(114));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(PatientSummary) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(PatientSummary) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  FunctionalStatusSection getFunctionalStatusSection(PatientSummary patientSummary) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(115));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPurposeSection(PatientSummary) <em>Get Purpose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PURPOSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))->asSequence()->first().oclAsType(consol::PurposeSection)";

	/**
	 * The cached OCL query for the '{@link #getPurposeSection(PatientSummary) <em>Get Purpose Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PURPOSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))->asSequence()->first().oclAsType(consol::PurposeSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PurposeSection getPurposeSection(PatientSummary patientSummary) {
		if (GET_PURPOSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PATIENT_SUMMARY, ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(116));
			try {
				GET_PURPOSE_SECTION__EOCL_QRY = helper.createQuery(GET_PURPOSE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PURPOSE_SECTION__EOCL_QRY);
		return (PurposeSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTemplateId(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(patientSummary, context) }),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PATIENT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

} // PatientSummaryOperations