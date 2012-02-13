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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ServiceEventOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent3Operations extends ServiceEventOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent3Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent3EffectiveTimeLow(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3EffectiveTimeLow(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent3EffectiveTimeLow(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3EffectiveTimeLow(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 * @param documentationOf_ServiceEvent3 The receiving '<em><b>Documentation Of Service Event3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent3EffectiveTimeLow(
			DocumentationOf_ServiceEvent3 documentationOf_ServiceEvent3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT3);
			try {
				VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent3)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT3__SERVICE_EVENT3_EFFECTIVE_TIME_LOW,
					ConsolPlugin.INSTANCE.getString("ServiceEvent3EffectiveTimeLow"),
					new Object[] { documentationOf_ServiceEvent3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent3EffectiveTimeHigh(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3EffectiveTimeHigh(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent3EffectiveTimeHigh(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3EffectiveTimeHigh(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param documentationOf_ServiceEvent3 The receiving '<em><b>Documentation Of Service Event3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent3EffectiveTimeHigh(
			DocumentationOf_ServiceEvent3 documentationOf_ServiceEvent3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT3);
			try {
				VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent3)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT3__SERVICE_EVENT3_EFFECTIVE_TIME_HIGH,
					ConsolPlugin.INSTANCE.getString("ServiceEvent3EffectiveTimeHigh"),
					new Object[] { documentationOf_ServiceEvent3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent3ClassCode(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3ClassCode(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassRoot::PCPR";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent3ClassCode(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3ClassCode(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassRoot::PCPR
	 * @param documentationOf_ServiceEvent3 The receiving '<em><b>Documentation Of Service Event3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent3ClassCode(DocumentationOf_ServiceEvent3 documentationOf_ServiceEvent3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT3);
			try {
				VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent3)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT3__SERVICE_EVENT3_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ServiceEvent3ClassCode"),
					new Object[] { documentationOf_ServiceEvent3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent3EffectiveTime(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3EffectiveTime(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent3EffectiveTime(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3EffectiveTime(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param documentationOf_ServiceEvent3 The receiving '<em><b>Documentation Of Service Event3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent3EffectiveTime(
			DocumentationOf_ServiceEvent3 documentationOf_ServiceEvent3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT3);
			try {
				VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent3)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT3__SERVICE_EVENT3_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ServiceEvent3EffectiveTime"),
					new Object[] { documentationOf_ServiceEvent3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent3Performer(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3Performer(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent3Performer(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent3Performer(DocumentationOf_ServiceEvent3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))
	 * @param documentationOf_ServiceEvent3 The receiving '<em><b>Documentation Of Service Event3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent3Performer(DocumentationOf_ServiceEvent3 documentationOf_ServiceEvent3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT3);
			try {
				VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			documentationOf_ServiceEvent3)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT3__SERVICE_EVENT3_PERFORMER,
					ConsolPlugin.INSTANCE.getString("ServiceEvent3Performer"),
					new Object[] { documentationOf_ServiceEvent3 }));
			}
			return false;
		}
		return true;
	}

} // DocumentationOf_ServiceEvent3Operations
