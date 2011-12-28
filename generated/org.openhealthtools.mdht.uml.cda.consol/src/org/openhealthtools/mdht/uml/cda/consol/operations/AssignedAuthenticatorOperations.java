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

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AssignedEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Authenticator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedAuthenticatorOperations extends AssignedEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedAuthenticatorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthenticatorAddr(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorAddr(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthenticatorAddr(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorAddr(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param assignedAuthenticator The receiving '<em><b>Assigned Authenticator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedAuthenticatorAddr(AssignedAuthenticator assignedAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_AUTHENTICATOR);
			try {
				VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedAuthenticator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_AUTHENTICATOR__ASSIGNED_AUTHENTICATOR_ADDR,
					ConsolPlugin.INSTANCE.getString("AssignedAuthenticatorAddr"),
					new Object[] { assignedAuthenticator }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthenticatorCode(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorCode(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthenticatorCode(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorCode(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param assignedAuthenticator The receiving '<em><b>Assigned Authenticator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedAuthenticatorCode(AssignedAuthenticator assignedAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_AUTHENTICATOR);
			try {
				VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedAuthenticator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_AUTHENTICATOR__ASSIGNED_AUTHENTICATOR_CODE,
					ConsolPlugin.INSTANCE.getString("AssignedAuthenticatorCode"),
					new Object[] { assignedAuthenticator }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthenticatorId(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorId(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthenticatorId(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorId(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param assignedAuthenticator The receiving '<em><b>Assigned Authenticator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedAuthenticatorId(AssignedAuthenticator assignedAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_AUTHENTICATOR);
			try {
				VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedAuthenticator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_AUTHENTICATOR__ASSIGNED_AUTHENTICATOR_ID,
					ConsolPlugin.INSTANCE.getString("AssignedAuthenticatorId"), new Object[] { assignedAuthenticator }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthenticatorTelecom(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorTelecom(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthenticatorTelecom(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthenticatorTelecom(AssignedAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param assignedAuthenticator The receiving '<em><b>Assigned Authenticator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedAuthenticatorTelecom(AssignedAuthenticator assignedAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_AUTHENTICATOR);
			try {
				VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedAuthenticator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_AUTHENTICATOR__ASSIGNED_AUTHENTICATOR_TELECOM,
					ConsolPlugin.INSTANCE.getString("AssignedAuthenticatorTelecom"),
					new Object[] { assignedAuthenticator }));
			}
			return false;
		}
		return true;
	}

} // AssignedAuthenticatorOperations
