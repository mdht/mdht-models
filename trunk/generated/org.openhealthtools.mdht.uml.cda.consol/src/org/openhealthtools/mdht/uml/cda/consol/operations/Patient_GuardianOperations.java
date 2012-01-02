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
import org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.GuardianOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Guardian Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Patient_GuardianOperations extends GuardianOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Patient_GuardianOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGuardianAddr(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianAddr(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateGuardianAddr(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianAddr(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param patient_Guardian The receiving '<em><b>Patient Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGuardianAddr(Patient_Guardian patient_Guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_GUARDIAN);
			try {
				VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patient_Guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_GUARDIAN__GUARDIAN_ADDR, ConsolPlugin.INSTANCE.getString("GuardianAddr"),
					new Object[] { patient_Guardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGuardianCode(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianCode(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGuardianCode(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianCode(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))
	 * @param patient_Guardian The receiving '<em><b>Patient Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGuardianCode(Patient_Guardian patient_Guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_GUARDIAN);
			try {
				VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patient_Guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_GUARDIAN__GUARDIAN_CODE, ConsolPlugin.INSTANCE.getString("GuardianCode"),
					new Object[] { patient_Guardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGuardianTelecom(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianTelecom(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateGuardianTelecom(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianTelecom(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param patient_Guardian The receiving '<em><b>Patient Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGuardianTelecom(Patient_Guardian patient_Guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_GUARDIAN);
			try {
				VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patient_Guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_GUARDIAN__GUARDIAN_TELECOM,
					ConsolPlugin.INSTANCE.getString("GuardianTelecom"), new Object[] { patient_Guardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGuardianGuardianPerson(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Guardian Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianGuardianPerson(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateGuardianGuardianPerson(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Guardian Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuardianGuardianPerson(Patient_Guardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person))
	 * @param patient_Guardian The receiving '<em><b>Patient Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGuardianGuardianPerson(Patient_Guardian patient_Guardian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_GUARDIAN);
			try {
				VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patient_Guardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_GUARDIAN__GUARDIAN_GUARDIAN_PERSON,
					ConsolPlugin.INSTANCE.getString("GuardianGuardianPerson"), new Object[] { patient_Guardian }));
			}
			return false;
		}
		return true;
	}

} // Patient_GuardianOperations
