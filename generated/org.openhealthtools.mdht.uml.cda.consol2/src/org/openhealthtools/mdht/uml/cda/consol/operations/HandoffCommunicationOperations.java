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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Handoff Communication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandoffCommunicationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandoffCommunicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationTemplateId(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationTemplateId(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.141')";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationTemplateId(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationTemplateId(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationTemplateId(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationTemplateId"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationClassCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationClassCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationClassCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationClassCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationClassCode(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationClassCode"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationMoodCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationMoodCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationMoodCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationMoodCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationMoodCode(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationMoodCode"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationCodeP(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationCodeP"),
					new Object[] { handoffCommunication }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationCodeP", passToken);
				}
				passToken.add(handoffCommunication);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '432138007' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationCode(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(handoffCommunication)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_CODE,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationCode"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationStatusCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationStatusCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationStatusCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationStatusCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationStatusCode(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationStatusCode"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationStatusCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationStatusCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationStatusCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationStatusCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationStatusCodeP(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationStatusCodeP"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationEffectiveTime(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationEffectiveTime(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationEffectiveTime(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationEffectiveTime(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationEffectiveTime(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationEffectiveTime"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipant(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipant(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipant(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipant(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationParticipant(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationParticipant"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationAuthorParticipation(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationAuthorParticipation(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationAuthorParticipation(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationAuthorParticipation(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHandoffCommunicationAuthorParticipation(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				VALIDATE_HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			handoffCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationAuthorParticipation"),
					new Object[] { handoffCommunication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantParticipantRoleCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantParticipantRoleCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantParticipantRoleCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantParticipantRoleCodeP(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantParticipantRoleCodeP(
			HandoffCommunication handoffCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(handoffCommunication);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P,
						ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationParticipantParticipantRoleCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantParticipantRoleCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantParticipantRoleCodeP",
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
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantParticipantRoleCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantParticipantRoleCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantParticipantRoleCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantParticipantRoleCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantParticipantRoleCode(
			HandoffCommunication handoffCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(handoffCommunication);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantParticipantRoleCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE,
						ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationParticipantParticipantRoleCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantTypeCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantTypeCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IRCP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantTypeCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantTypeCode(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantTypeCode(HandoffCommunication handoffCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(handoffCommunication);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationParticipantTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHandoffCommunicationParticipantParticipantRole(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantParticipantRole(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHandoffCommunicationParticipantParticipantRole(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHandoffCommunicationParticipantParticipantRole(HandoffCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param handoffCommunication The receiving '<em><b>Handoff Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHandoffCommunicationParticipantParticipantRole(
			HandoffCommunication handoffCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HANDOFF_COMMUNICATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(handoffCommunication);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HANDOFF_COMMUNICATION__HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE,
						ConsolPlugin.INSTANCE.getString("HandoffCommunicationHandoffCommunicationParticipantParticipantRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // HandoffCommunicationOperations
