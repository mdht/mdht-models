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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2InstructionInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Instruction Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationSupplyOrder2Operations extends MedicationSupplyOrderOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSupplyOrder2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrder2ContainsMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2ContainsMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrder2ContainsMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2ContainsMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder2 The receiving '<em><b>Medication Supply Order2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrder2ContainsMedicationInformation2(
			MedicationSupplyOrder2 medicationSupplyOrder2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSupplyOrder2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SUPPLY_ORDER2__MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2,
					ConsolPlugin.INSTANCE.getString("MedicationSupplyOrder2ContainsMedicationInformation2"),
					new Object[] { medicationSupplyOrder2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Immunization Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Immunization Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder2 The receiving '<em><b>Medication Supply Order2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(
			MedicationSupplyOrder2 medicationSupplyOrder2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSupplyOrder2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SUPPLY_ORDER2__MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2,
					ConsolPlugin.INSTANCE.getString("MedicationSupplyOrder2ContainsImmunizationMedicationInformation2"),
					new Object[] { medicationSupplyOrder2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrder2ContainsMedicationOrImmunization(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Or Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2ContainsMedicationOrImmunization(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2) xor self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrder2ContainsMedicationOrImmunization(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Or Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2ContainsMedicationOrImmunization(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder2 The receiving '<em><b>Medication Supply Order2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrder2ContainsMedicationOrImmunization(
			MedicationSupplyOrder2 medicationSupplyOrder2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSupplyOrder2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SUPPLY_ORDER2__MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION,
					ConsolPlugin.INSTANCE.getString("MedicationSupplyOrder2ContainsMedicationOrImmunization"),
					new Object[] { medicationSupplyOrder2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrder2InstructionInversionInd(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Instruction Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2InstructionInversionInd(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrder2InstructionInversionInd(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Instruction Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrder2InstructionInversionInd(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder2 The receiving '<em><b>Medication Supply Order2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrder2InstructionInversionInd(
			MedicationSupplyOrder2 medicationSupplyOrder2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSupplyOrder2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SUPPLY_ORDER2__MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("MedicationSupplyOrder2InstructionInversionInd"),
					new Object[] { medicationSupplyOrder2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderInstruction2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderInstruction2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderInstruction2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderInstruction2(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder2 The receiving '<em><b>Medication Supply Order2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderInstruction2(MedicationSupplyOrder2 medicationSupplyOrder2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSupplyOrder2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SUPPLY_ORDER2__MEDICATION_SUPPLY_ORDER_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderInstruction2"),
					new Object[] { medicationSupplyOrder2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolInstruction2(MedicationSupplyOrder2) <em>Get Consol Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(MedicationSupplyOrder2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTION2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstruction2(MedicationSupplyOrder2) <em>Get Consol Instruction2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(MedicationSupplyOrder2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instruction2 getConsolInstruction2(MedicationSupplyOrder2 medicationSupplyOrder2) {
		if (GET_CONSOL_INSTRUCTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2,
				ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2.getEAllOperations().get(71));
			try {
				GET_CONSOL_INSTRUCTION2__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_QRY);
		return (Instruction2) query.evaluate(medicationSupplyOrder2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.17' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder2 The receiving '<em><b>Medication Supply Order2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder2 medicationSupplyOrder2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSupplyOrder2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SUPPLY_ORDER2__MEDICATION_SUPPLY_ORDER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderTemplateId"),
					new Object[] { medicationSupplyOrder2 }));
			}

			return false;
		}
		return true;
	}

} // MedicationSupplyOrder2Operations
