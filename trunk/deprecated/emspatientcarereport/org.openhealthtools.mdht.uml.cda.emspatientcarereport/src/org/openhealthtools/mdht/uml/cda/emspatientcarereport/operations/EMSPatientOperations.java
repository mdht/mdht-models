/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPlugin;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatient;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.util.EmspatientcarereportValidator;

import org.openhealthtools.mdht.uml.cda.operations.PatientOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Patient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatient#validateEMSPatientAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Administrative Gender Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPatientOperations extends PatientOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPatientOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPatientAdministrativeGenderCode(EMSPatient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPatientAdministrativeGenderCode(EMSPatient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrativeGenderCode.oclIsUndefined() or self.administrativeGenderCode.isNullFlavorUndefined()) implies (self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPatientAdministrativeGenderCode(EMSPatient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPatientAdministrativeGenderCode(EMSPatient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.administrativeGenderCode.oclIsUndefined() or self.administrativeGenderCode.isNullFlavorUndefined()) implies (self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))
	 * @param emsPatient The receiving '<em><b>EMS Patient</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEMSPatientAdministrativeGenderCode(EMSPatient emsPatient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMS_PATIENT);
			try {
				VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatient)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMS_PATIENT__EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EMSPatientAdministrativeGenderCode", VALIDATE_EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emsPatient, context) }),
						 new Object [] { emsPatient }));
			}
			return false;
		}
		return true;
	}

} // EMSPatientOperations