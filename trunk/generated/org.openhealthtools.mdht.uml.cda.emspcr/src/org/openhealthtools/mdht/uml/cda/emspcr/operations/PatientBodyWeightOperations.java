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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Body Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientBodyWeightOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientBodyWeightOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientBodyWeightTemplateId(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightTemplateId(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.178')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientBodyWeightTemplateId(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightTemplateId(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientBodyWeight The receiving '<em><b>Patient Body Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientBodyWeightTemplateId(PatientBodyWeight patientBodyWeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_BODY_WEIGHT);
			try {
				VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientBodyWeight)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_BODY_WEIGHT__PATIENT_BODY_WEIGHT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PatientBodyWeightTemplateId"), new Object[] { patientBodyWeight }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientBodyWeightMoodCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightMoodCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientBodyWeightMoodCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightMoodCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientBodyWeight The receiving '<em><b>Patient Body Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientBodyWeightMoodCode(PatientBodyWeight patientBodyWeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_BODY_WEIGHT);
			try {
				VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientBodyWeight)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_BODY_WEIGHT__PATIENT_BODY_WEIGHT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientBodyWeightMoodCode"), new Object[] { patientBodyWeight }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientBodyWeightCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '8335-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientBodyWeightCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightCode(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientBodyWeight The receiving '<em><b>Patient Body Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientBodyWeightCode(PatientBodyWeight patientBodyWeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_BODY_WEIGHT);
			try {
				VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientBodyWeight)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_BODY_WEIGHT__PATIENT_BODY_WEIGHT_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientBodyWeightCode"), new Object[] { patientBodyWeight }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientBodyWeightValue(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightValue(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientBodyWeightValue(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientBodyWeightValue(PatientBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientBodyWeight The receiving '<em><b>Patient Body Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientBodyWeightValue(PatientBodyWeight patientBodyWeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_BODY_WEIGHT);
			try {
				VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientBodyWeight)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_BODY_WEIGHT__PATIENT_BODY_WEIGHT_VALUE,
					EmspcrPlugin.INSTANCE.getString("PatientBodyWeightValue"), new Object[] { patientBodyWeight }));
			}

			return false;
		}
		return true;
	}

} // PatientBodyWeightOperations
