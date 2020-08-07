/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Referral Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationPriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActParticipantParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActParticipantParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#getIndication2s() <em>Get Indication2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientReferralActOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientReferralActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActTemplateId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActTemplateId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.140')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActTemplateId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActTemplateId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActTemplateId(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActTemplateId", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActTemplateId"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::PCPR";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActClassCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActClassCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActClassCode"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActMoodCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActMoodCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActMoodCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActMoodCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActMoodCodeP(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActMoodCodeP", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_MOOD_CODE_P,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActMoodCodeP"),
						new Object[] { patientReferralAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PatientReferralActMoodCodeP", passToken);
				}
				passToken.add(patientReferralAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and " +
			"let value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in " +
			"value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActMoodCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PatientReferralActMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientReferralAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActMoodCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActMoodCode"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActId(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActId(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActId", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ID,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActId"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActCodeP(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActCodeP", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_CODE_P,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActCodeP"),
						new Object[] { patientReferralAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PatientReferralActCodeP", passToken);
				}
				passToken.add(patientReferralAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PatientReferralActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientReferralAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActCode"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActStatusCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActStatusCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActStatusCode"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActStatusCodeP(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActStatusCodeP", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActStatusCodeP"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEffectiveTime(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEffectiveTime(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEffectiveTime(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEffectiveTime(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActEffectiveTime(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActEffectiveTime", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActEffectiveTime"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActPriorityCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActPriorityCode", "WARNING");

		if (VALIDATE_PATIENT_REFERRAL_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PATIENT_REFERRAL_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_PRIORITY_CODE,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActPriorityCode"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationship(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationship(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationship(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationship(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActEntryRelationship(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActEntryRelationship", "INFO");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActEntryRelationship"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActAuthorParticipation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActAuthorParticipation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActAuthorParticipation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActAuthorParticipation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActAuthorParticipation(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActAuthorParticipation", "WARNING");

		if (VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActAuthorParticipation"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActIndication2(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActIndication2(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActIndication2(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActIndication2(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActIndication2(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActIndication2", "INFO");

		if (VALIDATE_PATIENT_REFERRAL_ACT_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_INDICATION2,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActIndication2"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActParticipant(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipant(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActParticipant(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipant(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientReferralActParticipant(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActParticipant", "INFO");

		if (VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				patientReferralAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActParticipant"),
						new Object[] { patientReferralAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationClassCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationClassCode(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationClassCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::RQO)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationMoodCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationMoodCode(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationMoodCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationMoodCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationCodeP(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationCodeP", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActEntryRelationshipObservationCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActEntryRelationshipObservationCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationCode(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActEntryRelationshipObservationCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationStatusCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationStatusCode(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationStatusCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationStatusCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationStatusCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationStatusCodeP(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationStatusCodeP", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationStatusCodeP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationPriorityCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Priority Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationPriorityCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((priorityCode.oclIsUndefined() or priorityCode.isNullFlavorUndefined()) implies (not priorityCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationPriorityCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Priority Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationPriorityCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationPriorityCodeP(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationPriorityCodeP", "WARNING");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationPriorityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActEntryRelationshipObservationPriorityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActEntryRelationshipObservationPriorityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((priorityCode.oclIsUndefined() or priorityCode.isNullFlavorUndefined()) implies (not priorityCode.oclIsUndefined() and priorityCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = priorityCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.7' and (value.code = 'A' or value.code = 'CR' or value.code = 'CS' or value.code = 'CSP' or value.code = 'CSR' or value.code = 'EL' or value.code = 'EM' or value.code = 'P' or value.code = 'PRN' or value.code = 'R' or value.code = 'RR' or value.code = 'S' or value.code = 'T' or value.code = 'UD' or value.code = 'UR')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationPriorityCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationPriorityCode(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationPriorityCode", "WARNING");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActEntryRelationshipObservationPriorityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_PRIORITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationPriorityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationValue(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationValue(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '370985002' or value.code = '170941001' or value.code = '170935008' or value.code = '268528005' or value.code = '170939002' or value.code = '268529002' or value.code = '170936009' or value.code = '170937000' or value.code = '170940000'))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationValue(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationValue(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationValue(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationValue", "WARNING");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservationValueP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationValueP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() =  1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservationValueP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservationValueP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservationValueP(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActEntryRelationshipObservationValueP", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservationValueP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipTypeCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActEntryRelationshipTypeCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActEntryRelationshipObservation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActEntryRelationshipObservation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActEntryRelationshipObservation(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActEntryRelationshipObservation(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActEntryRelationshipObservation", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActEntryRelationshipObservation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActParticipantParticipantRoleCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantParticipantRoleCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActParticipantParticipantRoleCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantParticipantRoleCodeP(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActParticipantParticipantRoleCodeP(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActParticipantParticipantRoleCodeP", "INFO");

		if (VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActParticipantParticipantRoleCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActParticipantParticipantRoleCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActParticipantParticipantRoleCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActParticipantParticipantRoleCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantParticipantRoleCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActParticipantParticipantRoleCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantParticipantRoleCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActParticipantParticipantRoleCode(
			PatientReferralAct patientReferralAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PatientReferralActPatientReferralActParticipantParticipantRoleCode", "WARNING");

		if (VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.PatientReferralActParticipantParticipantRoleCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActParticipantParticipantRoleCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActParticipantTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::REFT)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActParticipantTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantTypeCode(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActParticipantTypeCode(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActParticipantTypeCode", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_PARTICIPANT_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString("PatientReferralActPatientReferralActParticipantTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientReferralActParticipantParticipantRole(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantParticipantRole(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientReferralActParticipantParticipantRole(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientReferralActParticipantParticipantRole(PatientReferralAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientReferralAct The receiving '<em><b>Patient Referral Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientReferralActParticipantParticipantRole(PatientReferralAct patientReferralAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PatientReferralActPatientReferralActParticipantParticipantRole", "ERROR");

		if (VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_REFERRAL_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			patientReferralAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PATIENT_REFERRAL_ACT__PATIENT_REFERRAL_ACT_PARTICIPANT_PARTICIPANT_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"PatientReferralActPatientReferralActParticipantParticipantRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication2s(PatientReferralAct) <em>Get Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PatientReferralAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getIndication2s(PatientReferralAct) <em>Get Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PatientReferralAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getIndication2s(PatientReferralAct patientReferralAct) {

		if (GET_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_REFERRAL_ACT,
				ConsolPackage.Literals.PATIENT_REFERRAL_ACT.getEAllOperations().get(82));
			try {
				GET_INDICATION2S__EOCL_QRY = helper.createQuery(GET_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(patientReferralAct);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

} // PatientReferralActOperations
