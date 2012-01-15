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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ServiceEventOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event1</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1ProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1AnyAssistantsAsSecondary(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Any Assistants As Secondary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent1Operations extends ServiceEventOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent1Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1ProcedureCodes(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Procedure Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1ProcedureCodes(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1ProcedureCodes(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Procedure Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1ProcedureCodes(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1ProcedureCodes(
			DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_PROCEDURE_CODES,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1ProcedureCodes"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1EffectiveTimeHasLow(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTimeHasLow(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1EffectiveTimeHasLow(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTimeHasLow(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1EffectiveTimeHasLow(
			DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1EffectiveTimeHasLow"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.width.oclIsUndefined() xor not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.width.oclIsUndefined() xor not self.effectiveTime.high.oclIsUndefined()
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(
			DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1EffectiveTimeHasHighWhenNoWidth"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1EffectiveTimeNoHighIfWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time No High If Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTimeNoHighIfWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.width.oclIsUndefined() xor not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1EffectiveTimeNoHighIfWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time No High If Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTimeNoHighIfWidth(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.width.oclIsUndefined() xor not self.effectiveTime.high.oclIsUndefined()
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1EffectiveTimeNoHighIfWidth(
			DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1EffectiveTimeNoHighIfWidth"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1AnyAssistantsAsSecondary(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Any Assistants As Secondary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1AnyAssistantsAsSecondary(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->forAll(typeCode = vocab::x_ServiceEventPerformer::PPRF or typeCode= vocab::x_ServiceEventPerformer::SPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1AnyAssistantsAsSecondary(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Any Assistants As Secondary</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1AnyAssistantsAsSecondary(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->forAll(typeCode = vocab::x_ServiceEventPerformer::PPRF or typeCode= vocab::x_ServiceEventPerformer::SPRF)
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1AnyAssistantsAsSecondary(
			DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1AnyAssistantsAsSecondary"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1Code(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1Code(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1Code(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1Code(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1Code(DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_CODE,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1Code"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent1EffectiveTime(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTime(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent1EffectiveTime(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent1EffectiveTime(DocumentationOf_ServiceEvent1, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param documentationOf_ServiceEvent1 The receiving '<em><b>Documentation Of Service Event1</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent1EffectiveTime(
			DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1);
			try {
				VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent1)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT1__SERVICE_EVENT1_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ServiceEvent1EffectiveTime"),
					new Object[] { documentationOf_ServiceEvent1 }));
			}
			return false;
		}
		return true;
	}

} // DocumentationOf_ServiceEvent1Operations
