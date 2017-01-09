/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Handoff Communication Participants</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandoffCommunicationParticipantsOperations extends ClinicalStatementOperations {
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
	protected HandoffCommunicationParticipantsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsTemplateId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsTemplateId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.141')";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsTemplateId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsTemplateId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsTemplateId(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsTemplateId"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsClassCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsClassCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsClassCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsClassCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsClassCode(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsClassCode"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsMoodCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsMoodCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsMoodCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsMoodCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsMoodCode(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsMoodCode"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsCodeP(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsCodeP"),
						new Object[] { handoffCommunicationParticipants }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsCodeP", passToken);
				}
				passToken.add(handoffCommunicationParticipants);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '432138007' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsCode(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(handoffCommunicationParticipants)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsCode"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsStatusCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsStatusCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsStatusCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsStatusCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsStatusCode(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsStatusCode"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsStatusCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsStatusCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsStatusCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsStatusCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsStatusCodeP(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsStatusCodeP"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsEffectiveTime(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsEffectiveTime(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsEffectiveTime(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsEffectiveTime(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsEffectiveTime(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsEffectiveTime"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipant(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipant(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipant(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipant(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsParticipant(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipant"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsAuthorParticipation(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsAuthorParticipation(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsAuthorParticipation(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsAuthorParticipation(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipantsAuthorParticipation(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				handoffCommunicationParticipants)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"HandoffCommunicationParticipantsHandoffCommunicationParticipantsAuthorParticipation"),
						new Object[] { handoffCommunicationParticipants }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleId(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRoleId(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRoleId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRoleCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsParticipantParticipantRoleCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsParticipantParticipantRoleCodeP",
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
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsParticipantParticipantRoleCodeP");
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
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRoleCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (( not addr->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRoleAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantTypeCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantTypeCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IRCP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantTypeCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantTypeCode(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantTypeCode(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRole(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRole(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantsParticipantParticipantRole(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantsParticipantParticipantRole(HandoffCommunicationParticipants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunicationParticipants The receiving '<em><b>Handoff Communication Participants</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantsParticipantParticipantRole(
			HandoffCommunicationParticipants handoffCommunicationParticipants, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION_PARTICIPANTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			handoffCommunicationParticipants);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.HANDOFF_COMMUNICATION_PARTICIPANTS__HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"HandoffCommunicationParticipantsHandoffCommunicationParticipantsParticipantParticipantRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // HandoffCommunicationParticipantsOperations
