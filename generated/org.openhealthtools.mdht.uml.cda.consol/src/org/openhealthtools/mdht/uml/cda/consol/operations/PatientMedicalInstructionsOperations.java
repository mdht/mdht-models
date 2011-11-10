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
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Medical Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions#validatePatientMedicalInstructionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions#validatePatientMedicalInstructionsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions#validatePatientMedicalInstructionsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions#validatePatientMedicalInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions#validatePatientMedicalInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions#validatePatientMedicalInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientMedicalInstructionsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientMedicalInstructionsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')
	 * @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientMedicalInstructionsTemplateId(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PatientMedicalInstructionsTemplateId"),
					new Object[] { patientMedicalInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientMedicalInstructionsClassCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PatientMedicalInstructionsClassCode"),
					new Object[] { patientMedicalInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsMoodCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsMoodCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsMoodCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsMoodCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::INT
	 * @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientMedicalInstructionsMoodCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PatientMedicalInstructionsMoodCode"),
					new Object[] { patientMedicalInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.code = 'PINSTRUCT' and value.codeSystem = '1.3.6.1.4.1.19376.1.5.3.2'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'PINSTRUCT' and value.codeSystem = '1.3.6.1.4.1.19376.1.5.3.2'))
	 * @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientMedicalInstructionsCode(PatientMedicalInstructions patientMedicalInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CODE,
					ConsolPlugin.INSTANCE.getString("PatientMedicalInstructionsCode"),
					new Object[] { patientMedicalInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientMedicalInstructionsText(PatientMedicalInstructions patientMedicalInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEXT,
					ConsolPlugin.INSTANCE.getString("PatientMedicalInstructionsText"),
					new Object[] { patientMedicalInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientMedicalInstructionsStatusCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("PatientMedicalInstructionsStatusCode"),
					new Object[] { patientMedicalInstructions }));
			}
			return false;
		}
		return true;
	}

} // PatientMedicalInstructionsOperations
