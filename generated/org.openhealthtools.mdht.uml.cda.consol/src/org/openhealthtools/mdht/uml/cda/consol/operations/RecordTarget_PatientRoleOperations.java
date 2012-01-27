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
import org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PatientRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Record Target Patient Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordTarget_PatientRoleOperations extends PatientRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTarget_PatientRoleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientRoleAddr(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRoleAddr(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientRoleAddr(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRoleAddr(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param recordTarget_PatientRole The receiving '<em><b>Record Target Patient Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientRoleAddr(RecordTarget_PatientRole recordTarget_PatientRole,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RECORD_TARGET_PATIENT_ROLE);
			try {
				VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(recordTarget_PatientRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RECORD_TARGET_PATIENT_ROLE__PATIENT_ROLE_ADDR,
						 ConsolPlugin.INSTANCE.getString("PatientRoleAddr"),
						 new Object [] { recordTarget_PatientRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientRoleId(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRoleId(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientRoleId(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRoleId(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param recordTarget_PatientRole The receiving '<em><b>Record Target Patient Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientRoleId(RecordTarget_PatientRole recordTarget_PatientRole,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RECORD_TARGET_PATIENT_ROLE);
			try {
				VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(recordTarget_PatientRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RECORD_TARGET_PATIENT_ROLE__PATIENT_ROLE_ID,
						 ConsolPlugin.INSTANCE.getString("PatientRoleId"),
						 new Object [] { recordTarget_PatientRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientRoleTelecom(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRoleTelecom(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientRoleTelecom(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRoleTelecom(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param recordTarget_PatientRole The receiving '<em><b>Record Target Patient Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientRoleTelecom(RecordTarget_PatientRole recordTarget_PatientRole,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RECORD_TARGET_PATIENT_ROLE);
			try {
				VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(recordTarget_PatientRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RECORD_TARGET_PATIENT_ROLE__PATIENT_ROLE_TELECOM,
						 ConsolPlugin.INSTANCE.getString("PatientRoleTelecom"),
						 new Object [] { recordTarget_PatientRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientRolePatient(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Patient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRolePatient(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientRolePatient(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Patient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientRolePatient(RecordTarget_PatientRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient))
	 * @param recordTarget_PatientRole The receiving '<em><b>Record Target Patient Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientRolePatient(RecordTarget_PatientRole recordTarget_PatientRole,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RECORD_TARGET_PATIENT_ROLE);
			try {
				VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(recordTarget_PatientRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RECORD_TARGET_PATIENT_ROLE__PATIENT_ROLE_PATIENT,
						 ConsolPlugin.INSTANCE.getString("PatientRolePatient"),
						 new Object [] { recordTarget_PatientRole }));
			}
			return false;
		}
		return true;
	}

} // RecordTarget_PatientRoleOperations
