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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ServiceEventOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2#validateServiceEvent2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2#validateServiceEvent2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent2Operations extends ServiceEventOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent2ClassCode(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent2ClassCode(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClassRoot::PCPR";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent2ClassCode(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent2ClassCode(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode') and self.classCode=vocab::ActClassRoot::PCPR
	 * @param documentationOf_ServiceEvent2 The receiving '<em><b>Documentation Of Service Event2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent2ClassCode(DocumentationOf_ServiceEvent2 documentationOf_ServiceEvent2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT2);
			try {
				VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(documentationOf_ServiceEvent2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT2__SERVICE_EVENT2_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ServiceEvent2ClassCode"),
						 new Object [] { documentationOf_ServiceEvent2 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent2EffectiveTime(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent2EffectiveTime(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent2EffectiveTime(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent2EffectiveTime(DocumentationOf_ServiceEvent2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param documentationOf_ServiceEvent2 The receiving '<em><b>Documentation Of Service Event2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent2EffectiveTime(
			DocumentationOf_ServiceEvent2 documentationOf_ServiceEvent2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT2);
			try {
				VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(documentationOf_ServiceEvent2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT2__SERVICE_EVENT2_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ServiceEvent2EffectiveTime"),
						 new Object [] { documentationOf_ServiceEvent2 }));
			}
			return false;
		}
		return true;
	}

} // DocumentationOf_ServiceEvent2Operations
