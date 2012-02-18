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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservation_VerifierOperations extends Participant2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservation_VerifierOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVerifierTime(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVerifierTime(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVerifierTime(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVerifierTime(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param advanceDirectiveObservation_Verifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVerifierTime(
			AdvanceDirectiveObservation_Verifier advanceDirectiveObservation_Verifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveObservation_Verifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__VERIFIER_TIME,
						 ConsolPlugin.INSTANCE.getString("VerifierTime"),
						 new Object [] { advanceDirectiveObservation_Verifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVerifierTypeCode(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVerifierTypeCode(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateVerifierTypeCode(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVerifierTypeCode(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('typeCode')
	 * @param advanceDirectiveObservation_Verifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVerifierTypeCode(
			AdvanceDirectiveObservation_Verifier advanceDirectiveObservation_Verifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveObservation_Verifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__VERIFIER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("VerifierTypeCode"),
						 new Object [] { advanceDirectiveObservation_Verifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVerifierParticipantRole(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVerifierParticipantRole(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))";

	/**
	 * The cached OCL invariant for the '{@link #validateVerifierParticipantRole(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVerifierParticipantRole(AdvanceDirectiveObservation_Verifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))
	 * @param advanceDirectiveObservation_Verifier The receiving '<em><b>Advance Directive Observation Verifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVerifierParticipantRole(
			AdvanceDirectiveObservation_Verifier advanceDirectiveObservation_Verifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER);
			try {
				VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveObservation_Verifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__VERIFIER_PARTICIPANT_ROLE,
						 ConsolPlugin.INSTANCE.getString("VerifierParticipantRole"),
						 new Object [] { advanceDirectiveObservation_Verifier }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveObservation_VerifierOperations
