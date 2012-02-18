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
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_Author;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AuthorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_Author#validateAuthorAssignedAuthor3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Assigned Author3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocument_AuthorOperations extends AuthorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocument_AuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorAssignedAuthor3(ContinuityOfCareDocument_Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Assigned Author3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorAssignedAuthor3(ContinuityOfCareDocument_Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorAssignedAuthor3(ContinuityOfCareDocument_Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Assigned Author3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorAssignedAuthor3(ContinuityOfCareDocument_Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))
	 * @param continuityOfCareDocument_Author The receiving '<em><b>Continuity Of Care Document Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAuthorAssignedAuthor3(
			ContinuityOfCareDocument_Author continuityOfCareDocument_Author, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT_AUTHOR);
			try {
				VALIDATE_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument_Author)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__AUTHOR_ASSIGNED_AUTHOR3,
						 ConsolPlugin.INSTANCE.getString("AuthorAssignedAuthor3"),
						 new Object [] { continuityOfCareDocument_Author }));
			}
			return false;
		}
		return true;
	}

} // ContinuityOfCareDocument_AuthorOperations
