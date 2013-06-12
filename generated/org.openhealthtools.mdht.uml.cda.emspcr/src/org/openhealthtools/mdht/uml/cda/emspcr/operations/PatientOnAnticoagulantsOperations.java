/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient On Anticoagulants</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientOnAnticoagulantsOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PatientOnAnticoagulantsOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientOnAnticoagulantsTemplateId(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsTemplateId(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.76')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientOnAnticoagulantsTemplateId(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsTemplateId(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientOnAnticoagulants The receiving '<em><b>Patient On Anticoagulants</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientOnAnticoagulantsTemplateId(PatientOnAnticoagulants patientOnAnticoagulants,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ON_ANTICOAGULANTS);
			try {
				VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientOnAnticoagulants)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ON_ANTICOAGULANTS__PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PatientOnAnticoagulantsTemplateId"),
					new Object[] { patientOnAnticoagulants }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientOnAnticoagulantsCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69749-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientOnAnticoagulantsCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientOnAnticoagulants The receiving '<em><b>Patient On Anticoagulants</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientOnAnticoagulantsCode(PatientOnAnticoagulants patientOnAnticoagulants,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ON_ANTICOAGULANTS);
			try {
				VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientOnAnticoagulants)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ON_ANTICOAGULANTS__PATIENT_ON_ANTICOAGULANTS_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientOnAnticoagulantsCode"),
					new Object[] { patientOnAnticoagulants }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientOnAnticoagulantsValue(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsValue(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	* The cached OCL invariant for the '{@link #validatePatientOnAnticoagulantsValue(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsValue(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientOnAnticoagulants The receiving '<em><b>Patient On Anticoagulants</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientOnAnticoagulantsValue(PatientOnAnticoagulants patientOnAnticoagulants,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ON_ANTICOAGULANTS);
			try {
				VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientOnAnticoagulants)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ON_ANTICOAGULANTS__PATIENT_ON_ANTICOAGULANTS_VALUE,
					EmspcrPlugin.INSTANCE.getString("PatientOnAnticoagulantsValue"),
					new Object[] { patientOnAnticoagulants }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientOnAnticoagulantsMoodCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsMoodCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientOnAnticoagulantsMoodCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientOnAnticoagulantsMoodCode(PatientOnAnticoagulants, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientOnAnticoagulants The receiving '<em><b>Patient On Anticoagulants</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientOnAnticoagulantsMoodCode(PatientOnAnticoagulants patientOnAnticoagulants,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ON_ANTICOAGULANTS);
			try {
				VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientOnAnticoagulants)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ON_ANTICOAGULANTS__PATIENT_ON_ANTICOAGULANTS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientOnAnticoagulantsMoodCode"),
					new Object[] { patientOnAnticoagulants }));
			}

			return false;
		}
		return true;
	}

} // PatientOnAnticoagulantsOperations
