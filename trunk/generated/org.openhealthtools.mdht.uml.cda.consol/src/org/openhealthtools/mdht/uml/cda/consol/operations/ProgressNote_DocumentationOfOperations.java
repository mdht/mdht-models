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
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote_DocumentationOf;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.DocumentationOfOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note Documentation Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote_DocumentationOf#validateDocumentationOfServiceEvent2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Documentation Of Service Event2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressNote_DocumentationOfOperations extends DocumentationOfOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNote_DocumentationOfOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDocumentationOfServiceEvent2(ProgressNote_DocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Documentation Of Service Event2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDocumentationOfServiceEvent2(ProgressNote_DocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent))";

	/**
	 * The cached OCL invariant for the '{@link #validateDocumentationOfServiceEvent2(ProgressNote_DocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Documentation Of Service Event2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDocumentationOfServiceEvent2(ProgressNote_DocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent))
	 * @param progressNote_DocumentationOf The receiving '<em><b>Progress Note Documentation Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDocumentationOfServiceEvent2(
			ProgressNote_DocumentationOf progressNote_DocumentationOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE_DOCUMENTATION_OF);
			try {
				VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote_DocumentationOf)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE_DOCUMENTATION_OF__DOCUMENTATION_OF_SERVICE_EVENT2,
						 ConsolPlugin.INSTANCE.getString("DocumentationOfServiceEvent2"),
						 new Object [] { progressNote_DocumentationOf }));
			}
			return false;
		}
		return true;
	}

} // ProgressNote_DocumentationOfOperations
