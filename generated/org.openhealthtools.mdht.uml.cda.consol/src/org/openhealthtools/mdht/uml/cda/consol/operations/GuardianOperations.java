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
import org.openhealthtools.mdht.uml.cda.consol.Guardian;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Guardian#validateConsolGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Guardian#validateConsolGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Guardian#validateConsolGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardianOperations extends org.openhealthtools.mdht.uml.cda.operations.GuardianOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardianOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolGuardianGuardianPerson(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Guardian Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolGuardianGuardianPerson(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolGuardianGuardianPerson(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Guardian Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolGuardianGuardianPerson(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person))
	 * @param guardian The receiving '<em><b>Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolGuardianGuardianPerson(Guardian guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GUARDIAN);
			try {
				VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GUARDIAN__CONSOL_GUARDIAN_GUARDIAN_PERSON,
					ConsolPlugin.INSTANCE.getString("ConsolGuardianGuardianPerson"), new Object[] { guardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolGuardianAddr(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolGuardianAddr(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolGuardianAddr(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolGuardianAddr(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param guardian The receiving '<em><b>Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolGuardianAddr(Guardian guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GUARDIAN);
			try {
				VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GUARDIAN__CONSOL_GUARDIAN_ADDR,
					ConsolPlugin.INSTANCE.getString("ConsolGuardianAddr"), new Object[] { guardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolGuardianTelecom(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolGuardianTelecom(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolGuardianTelecom(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolGuardianTelecom(Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param guardian The receiving '<em><b>Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolGuardianTelecom(Guardian guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GUARDIAN);
			try {
				VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GUARDIAN__CONSOL_GUARDIAN_TELECOM,
					ConsolPlugin.INSTANCE.getString("ConsolGuardianTelecom"), new Object[] { guardian }));
			}
			return false;
		}
		return true;
	}

} // GuardianOperations
