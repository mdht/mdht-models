/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
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
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationDispense2Operations extends MedicationDispenseOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

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

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

		if (VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2,
						ConsolPlugin.INSTANCE.getString(
							"MedicationDispense2MedicationDispense2ContainsMedicationInformation2"),
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

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

		if (VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2,
						ConsolPlugin.INSTANCE.getString(
							"MedicationDispense2MedicationDispense2ContainsImmunizationMedicationInformation2"),
						new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

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

	public static boolean validateMedicationDispenseStatusCodeP(MedicationDispense2 medicationDispense2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicationDispense2MedicationDispenseStatusCodeP"),
						new Object[] { medicationDispense2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseStatusCodeP", passToken);
				}
				passToken.add(medicationDispense2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationSupplyOrder2 getConsolMedicationSupplyOrder2(MedicationDispense2 medicationDispense2) {

		if (GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_DISPENSE2,
				ConsolPackage.Literals.MEDICATION_DISPENSE2.getEAllOperations().get(79));
			try {
				GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY = helper.createQuery(
					GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY);
		return (MedicationSupplyOrder2) query.evaluate(medicationDispense2);
	}

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

	public static boolean validateMedicationDispenseContainsMedicationOrImmunization(
			MedicationDispense2 medicationDispense2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION,
						ConsolPlugin.INSTANCE.getString(
							"MedicationDispense2MedicationDispenseContainsMedicationOrImmunization"),
						new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseStatusCodeP(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseStatusCodeP(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseStatusCodeP(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseStatusCodeP(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2) xor self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.18' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseTemplateId(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

		if (VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MedicationDispense2MedicationDispenseTemplateId"),
						new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseStatusCode(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseStatusCode(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseStatusCode(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseStatusCode(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateMedicationDispenseStatusCode(MedicationDispense2 medicationDispense2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationDispense2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationDispense2MedicationDispenseStatusCode"),
						new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseRepeatNumber(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseRepeatNumber(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseRepeatNumber(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseRepeatNumber(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateMedicationDispenseRepeatNumber(MedicationDispense2 medicationDispense2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString("MedicationDispense2MedicationDispenseRepeatNumber"),
						new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateMedicationDispenseMedicationSupplyOrder(MedicationDispense2 medicationDispense2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE2);
			try {
				VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationDispense2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE2__MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER,
						ConsolPlugin.INSTANCE.getString("MedicationDispense2MedicationDispenseMedicationSupplyOrder"),
						new Object[] { medicationDispense2 }));
			}

			return false;
		}
		return true;
	}

} // MedicationDispense2Operations
