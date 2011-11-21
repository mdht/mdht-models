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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveAdvDirectiveCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Adv Directive Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Adv Directive Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveHasNameOfAgent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#validateAdvanceDirectiveAdvanceDirectiveStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Advance Directive Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective#getAdvanceDirectiveStatusObservation() <em>Get Advance Directive Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveAdvDirectiveCodeValueSet(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Adv Directive Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveAdvDirectiveCodeValueSet(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveAdvDirectiveCodeValueSet(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Adv Directive Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveAdvDirectiveCodeValueSet(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveAdvDirectiveCodeValueSet(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_VALUE_SET,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveAdvDirectiveCodeValueSet"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Adv Directive Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.code = '304251008' and self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Adv Directive Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = '304251008' and self.code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_ADV_DIRECTIVE_CODE_CODE_SYSTEM,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveAdvDirectiveCodeCodeSystem"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasExternalReference(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasExternalReference(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->select(r | r.oclIsKindOf(ccd::AdvanceDirectiveReference))->size() =1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasExternalReference(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasExternalReference(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->select(r | r.oclIsKindOf(ccd::AdvanceDirectiveReference))->size() =1
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasExternalReference(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_EXTERNAL_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasExternalReference"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasStartingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasStartingTime(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_STARTING_TIME,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasStartingTime"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasEndingTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasEndingTime(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_ENDING_TIME,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasEndingTime"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasCustodian(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->size() > 0
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasCustodian(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_CUSTODIAN,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasCustodian"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CST)
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveParticipantTypeCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveParticipantTypeCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::AGNT)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::AGNT)
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveParticipantRoleClassCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveParticipantRoleClassCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.addr->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasAddress(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.addr->size() = 1
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasAddress(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_ADDRESS,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasAddress"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.telecom->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasTelecom(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.telecom->size() > 0
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasTelecom(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_TELECOM,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasTelecom"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity.name->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity.name->size() = 1
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveHasNameOfAgent(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveHasNameOfAgent"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveTemplateId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.12')
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveTemplateId(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveTemplateId"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveClassCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveClassCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveClassCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveMoodCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveMoodCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveMoodCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveMoodCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveMoodCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveMoodCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveId(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveId(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_ID,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveId"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008')))
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveStatusCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveStatusCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveStatusCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveStatusCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveStatusCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveStatusCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveEffectiveTime(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveEffectiveTime(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveEffectiveTime"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveRepeatNumber(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveRepeatNumber(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveRepeatNumber(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveRepeatNumber(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveRepeatNumber(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_REPEAT_NUMBER,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveRepeatNumber"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveInterpretationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveInterpretationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveInterpretationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveInterpretationCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveInterpretationCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_INTERPRETATION_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveInterpretationCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveTargetSiteCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveTargetSiteCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveTargetSiteCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveTargetSiteCode(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveTargetSiteCode(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_TARGET_SITE_CODE,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveTargetSiteCode"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveAdvanceDirectiveStatusObservation(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Advance Directive Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveAdvanceDirectiveStatusObservation(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveAdvanceDirectiveStatusObservation(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Advance Directive Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveAdvanceDirectiveStatusObservation(AdvanceDirective, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveAdvanceDirectiveStatusObservation(AdvanceDirective advanceDirective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirective)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ADVANCE_DIRECTIVE__ADVANCE_DIRECTIVE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("AdvanceDirectiveAdvanceDirectiveStatusObservation"),
						 new Object [] { advanceDirective }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectiveStatusObservation(AdvanceDirective) <em>Get Advance Directive Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveStatusObservation(AdvanceDirective)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))->asSequence()->first().oclAsType(consol::AdvanceDirectiveStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectiveStatusObservation(AdvanceDirective) <em>Get Advance Directive Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveStatusObservation(AdvanceDirective)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveStatusObservation))->asSequence()->first().oclAsType(consol::AdvanceDirectiveStatusObservation)
	 * @param advanceDirective The receiving '<em><b>Advance Directive</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AdvanceDirectiveStatusObservation getAdvanceDirectiveStatusObservation(AdvanceDirective advanceDirective) {
		if (GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE, ConsolPackage.Literals.ADVANCE_DIRECTIVE.getEAllOperations().get(71));
			try {
				GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EOCL_QRY);
		return (AdvanceDirectiveStatusObservation) query.evaluate(advanceDirective);
	}

} // AdvanceDirectiveOperations