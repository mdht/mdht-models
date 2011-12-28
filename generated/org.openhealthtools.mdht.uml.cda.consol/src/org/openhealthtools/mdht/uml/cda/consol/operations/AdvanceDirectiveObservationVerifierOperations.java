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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Participant2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation Verifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservationVerifierOperations extends Participant2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservationVerifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'i. 2.16.840.1.113883.10.20.1.58')
	 * @param advanceDirectiveObservationVerifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationVerifierTemplateId(
			AdvanceDirectiveObservationVerifier advanceDirectiveObservationVerifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservationVerifier)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationVerifierTemplateId"),
					new Object[] { advanceDirectiveObservationVerifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param advanceDirectiveObservationVerifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationVerifierTime(
			AdvanceDirectiveObservationVerifier advanceDirectiveObservationVerifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservationVerifier)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationVerifierTime"),
					new Object[] { advanceDirectiveObservationVerifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('typeCode')
	 * @param advanceDirectiveObservationVerifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationVerifierTypeCode(
			AdvanceDirectiveObservationVerifier advanceDirectiveObservationVerifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservationVerifier)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationVerifierTypeCode"),
					new Object[] { advanceDirectiveObservationVerifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'i. 2.16.840.1.113883.10.20.1.58')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservationVerifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))
	 * @param advanceDirectiveObservationVerifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationVerifierParticipantRole(
			AdvanceDirectiveObservationVerifier advanceDirectiveObservationVerifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservationVerifier)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationVerifierParticipantRole"),
					new Object[] { advanceDirectiveObservationVerifier }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveObservationVerifierOperations
