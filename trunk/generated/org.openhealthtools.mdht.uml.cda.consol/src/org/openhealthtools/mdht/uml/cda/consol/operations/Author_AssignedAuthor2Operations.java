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

import org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AssignedAuthorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Author Assigned Author2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2#validateAssignedAuthor2Addr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2#validateAssignedAuthor2Telecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Author_AssignedAuthor2Operations extends AssignedAuthorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Author_AssignedAuthor2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthor2Addr(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthor2Addr(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (self.addr->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthor2Addr(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthor2Addr(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (self.addr->size() = 1)
	 * @param author_AssignedAuthor2 The receiving '<em><b>Author Assigned Author2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedAuthor2Addr(Author_AssignedAuthor2 author_AssignedAuthor2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_ASSIGNED_AUTHOR2);
			try {
				VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			author_AssignedAuthor2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHOR_ASSIGNED_AUTHOR2__ASSIGNED_AUTHOR2_ADDR,
					ConsolPlugin.INSTANCE.getString("AssignedAuthor2Addr"), new Object[] { author_AssignedAuthor2 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthor2Telecom(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthor2Telecom(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (self.telecom->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthor2Telecom(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthor2Telecom(Author_AssignedAuthor2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (self.telecom->size() = 1)
	 * @param author_AssignedAuthor2 The receiving '<em><b>Author Assigned Author2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedAuthor2Telecom(Author_AssignedAuthor2 author_AssignedAuthor2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_ASSIGNED_AUTHOR2);
			try {
				VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			author_AssignedAuthor2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHOR_ASSIGNED_AUTHOR2__ASSIGNED_AUTHOR2_TELECOM,
					ConsolPlugin.INSTANCE.getString("AssignedAuthor2Telecom"), new Object[] { author_AssignedAuthor2 }));
			}
			return false;
		}
		return true;
	}

} // Author_AssignedAuthor2Operations
