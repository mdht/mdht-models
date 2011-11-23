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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasNameOfAgent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Name Of Agent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#getAdvanceDirectiveStatusObservation() <em>Get Advance Directive Status Observation</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvDirectiveCodeValueSet"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.code = '304251008' and self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = '304251008' and self.code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvDirectiveCodeCodeSystem"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->select(r | r.oclIsKindOf(consol::AdvanceDirectiveReference))->size() =1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->select(r | r.oclIsKindOf(consol::AdvanceDirectiveReference))->size() =1
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasExternalReference(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasExternalReference"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
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
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasCustodian(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->size() > 0
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasCustodian(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasCustodian"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationParticipantTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationParticipantTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationParticipantTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationParticipantTypeCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CST)
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationParticipantTypeCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationParticipantTypeCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationParticipantRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationParticipantRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::AGNT)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationParticipantRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationParticipantRoleClassCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::AGNT)
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationParticipantRoleClassCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationParticipantRoleClassCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasAddress(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasAddress(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.addr->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasAddress(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasAddress(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.addr->size() = 1
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasAddress(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_ADDRESS,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasAddress"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.telecom->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasTelecom(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.telecom->size() > 0
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasTelecom(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_TELECOM,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasTelecom"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasNameOfAgent(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Name Of Agent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasNameOfAgent(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity.name->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasNameOfAgent(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Name Of Agent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasNameOfAgent(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity.name->size() = 1
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationHasNameOfAgent(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_HAS_NAME_OF_AGENT,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationHasNameOfAgent"),
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
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.12')";

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
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.12')
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
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationRepeatNumber(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationRepeatNumber"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationInterpretationCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationInterpretationCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationTargetSiteCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationTargetSiteCode"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservationAdvanceDirectiveStatusObservation"),
					new Object[] { advanceDirectiveObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation) <em>Get Advance Directive Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))->asSequence()->first().oclAsType(consol::AdvanceDirectiveStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation) <em>Get Advance Directive Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveStatusObservation(AdvanceDirectiveObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))->asSequence()->first().oclAsType(consol::AdvanceDirectiveStatusObservation)
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdvanceDirectiveStatusObservation getAdvanceDirectiveStatusObservation(
			AdvanceDirectiveObservation advanceDirectiveObservation) {
		if (GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION,
				ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION.getEAllOperations().get(71));
			try {
				GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY);
		return (AdvanceDirectiveStatusObservation) query.evaluate(advanceDirectiveObservation);
	}

} // AdvanceDirectiveObservationOperations
