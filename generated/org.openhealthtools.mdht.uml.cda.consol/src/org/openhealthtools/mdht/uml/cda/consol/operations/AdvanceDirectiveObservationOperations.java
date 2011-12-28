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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationVerifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Advance Directive Observation Custodian Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasStartingTime(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasStartingTime"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasEndingTime(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasEndingTime"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.48')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.48')
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationTemplateId(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationTemplateId"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationClassCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationClassCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationMoodCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationMoodCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationMoodCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationMoodCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationMoodCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationMoodCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationId(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationId"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008')))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationStatusCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationStatusCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationStatusCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationStatusCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationStatusCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationStatusCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationEffectiveTime(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationEffectiveTime"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(consol::AdvanceDirectiveObservationVerifier))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(consol::AdvanceDirectiveObservationVerifier))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationVerifier(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationVerifier"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationCustodian(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationCustodian"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationReference(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationReference"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(templateId->exists(id : datatypes::II | id.root = 'i. 2.16.840.1.113883.10.20.1.58'))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(isDefined('typeCode'))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(templateId->exists(id : datatypes::II | id.root = 'i. 2.16.840.1.113883.10.20.1.58'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Verifier Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role)))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationVerifierParticipantRole"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Advance Directive Observation Custodian Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Advance Directive Observation Custodian Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY_NAME,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityName"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(classCode=vocab::RoleClassRoot::ROL)
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleAddr(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(classCode=vocab::RoleClassRoot::ROL)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_PLAYING_ENTITY,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRolePlayingEntity"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(typeCode=vocab::ParticipationType::CST)
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(typeCode=vocab::ParticipationType::CST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Observation Custodian Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveObservationOperations
