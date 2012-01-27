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
import org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Fullfillment Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationFullfillmentInstructionsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationFullfillmentInstructionsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFullfillmentInstructionsMoodCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsMoodCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFullfillmentInstructionsMoodCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsMoodCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::INT
	 * @param medicationFullfillmentInstructions The receiving '<em><b>Medication Fullfillment Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationFullfillmentInstructionsMoodCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FULLFILLMENT_INSTRUCTIONS);
			try {
				VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationFullfillmentInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationFullfillmentInstructionsMoodCode"),
						 new Object [] { medicationFullfillmentInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFullfillmentInstructionsCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'FINSTRUCT' and value.codeSystem = '1.3.6.1.4.1.19376.1.5.3.2'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFullfillmentInstructionsCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'FINSTRUCT' and value.codeSystem = '1.3.6.1.4.1.19376.1.5.3.2'))
	 * @param medicationFullfillmentInstructions The receiving '<em><b>Medication Fullfillment Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationFullfillmentInstructionsCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FULLFILLMENT_INSTRUCTIONS);
			try {
				VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationFullfillmentInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationFullfillmentInstructionsCode"),
						 new Object [] { medicationFullfillmentInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFullfillmentInstructionsText(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsText(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFullfillmentInstructionsText(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsText(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param medicationFullfillmentInstructions The receiving '<em><b>Medication Fullfillment Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationFullfillmentInstructionsText(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FULLFILLMENT_INSTRUCTIONS);
			try {
				VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationFullfillmentInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT,
						 ConsolPlugin.INSTANCE.getString("MedicationFullfillmentInstructionsText"),
						 new Object [] { medicationFullfillmentInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFullfillmentInstructionsStatusCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsStatusCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFullfillmentInstructionsStatusCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFullfillmentInstructionsStatusCode(MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param medicationFullfillmentInstructions The receiving '<em><b>Medication Fullfillment Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationFullfillmentInstructionsStatusCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FULLFILLMENT_INSTRUCTIONS);
			try {
				VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationFullfillmentInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationFullfillmentInstructionsStatusCode"),
						 new Object [] { medicationFullfillmentInstructions }));
			}
			return false;
		}
		return true;
	}

} // MedicationFullfillmentInstructionsOperations
