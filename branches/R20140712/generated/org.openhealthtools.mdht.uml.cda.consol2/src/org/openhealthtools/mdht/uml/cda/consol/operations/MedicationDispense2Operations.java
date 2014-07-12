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
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;

import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2ContainsMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2ContainsImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2ContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseMedicationSupplyOrder2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationDispense2Operations extends MedicationDispenseOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispense2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispense2ContainsMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispense2ContainsMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispense2ContainsMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispense2ContainsMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense2 The receiving '<em><b>Medication Dispense2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispense2ContainsMedicationInformation2(
			MedicationDispense2 medicationDispense2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2,
					ConsolPlugin.INSTANCE.getString("MedicationDispense2ContainsMedicationInformation2"),
					new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispense2ContainsImmunizationMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Immunization Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispense2ContainsImmunizationMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispense2ContainsImmunizationMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Immunization Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispense2ContainsImmunizationMedicationInformation2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense2 The receiving '<em><b>Medication Dispense2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispense2ContainsImmunizationMedicationInformation2(
			MedicationDispense2 medicationDispense2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2,
					ConsolPlugin.INSTANCE.getString("MedicationDispense2ContainsImmunizationMedicationInformation2"),
					new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispense2ContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Or Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispense2ContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2) xor self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispense2ContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Or Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispense2ContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense2 The receiving '<em><b>Medication Dispense2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispense2ContainsMedicationOrImmunization(
			MedicationDispense2 medicationDispense2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION,
					ConsolPlugin.INSTANCE.getString("MedicationDispense2ContainsMedicationOrImmunization"),
					new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseMedicationSupplyOrder2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMedicationSupplyOrder2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseMedicationSupplyOrder2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMedicationSupplyOrder2(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense2 The receiving '<em><b>Medication Dispense2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseMedicationSupplyOrder2(MedicationDispense2 medicationDispense2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2,
					ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationSupplyOrder2"),
					new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolMedicationSupplyOrder2(MedicationDispense2) <em>Get Consol Medication Supply Order2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationSupplyOrder2(MedicationDispense2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder2))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMedicationSupplyOrder2(MedicationDispense2) <em>Get Consol Medication Supply Order2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationSupplyOrder2(MedicationDispense2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationSupplyOrder2 getConsolMedicationSupplyOrder2(MedicationDispense2 medicationDispense2) {
		if (GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_DISPENSE2,
				ConsolPackage.Literals.MEDICATION_DISPENSE2.getEAllOperations().get(78));
			try {
				GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY = helper.createQuery(GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY);
		return (MedicationSupplyOrder2) query.evaluate(medicationDispense2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.18.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense2 The receiving '<em><b>Medication Dispense2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseTemplateId(MedicationDispense2 medicationDispense2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationDispenseTemplateId"),
					new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

} // MedicationDispense2Operations
