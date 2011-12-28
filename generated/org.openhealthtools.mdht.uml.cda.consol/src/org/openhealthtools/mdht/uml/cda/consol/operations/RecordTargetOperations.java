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
import org.openhealthtools.mdht.uml.cda.consol.RecordTarget;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Record Target</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget#validateConsolRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Record Target Patient Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordTargetOperations extends org.openhealthtools.mdht.uml.cda.operations.RecordTargetOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTargetOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolRecordTargetPatientRole(RecordTarget, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolRecordTargetPatientRole(RecordTarget, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolRecordTargetPatientRole(RecordTarget, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolRecordTargetPatientRole(RecordTarget, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole))
	 * @param recordTarget The receiving '<em><b>Record Target</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolRecordTargetPatientRole(RecordTarget recordTarget, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RECORD_TARGET);
			try {
				VALIDATE_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			recordTarget)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RECORD_TARGET__CONSOL_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("ConsolRecordTargetPatientRole"), new Object[] { recordTarget }));
			}
			return false;
		}
		return true;
	}

} // RecordTargetOperations
