/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.SubstanceAdministrationOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeIVLTSorTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time TS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeOperator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Operator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDrugVehicleTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityInstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRateQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityConsumableMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getMedicationDispenses() <em>Get Medication Dispenses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getDrugVehicles() <em>Get Drug Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActivityOperations extends SubstanceAdministrationOperations {
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
	protected MedicationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.doseQuantity->size() = 1 or self.rateQuantity->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY,
						ConsolPlugin.INSTANCE.getString(
							"MedicationActivityMedicationActivityDoseQuantityorrateQuantity"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTextReference(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityTextReference"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityReferenceValue(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityReferenceValue"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTextReferenceValue(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityTextReferenceValue"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->size() = 1 xor self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::SXCM_TS))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTSorTS(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityEffectiveTimeIVLTSorTS"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTSLow(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityEffectiveTimeIVLTSLow"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).high->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTSHigh(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityEffectiveTimeIVLTSHigh"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeTSValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time TS Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeTSValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes:: SXCM_TS))->forAll( eff | eff.oclAsType(datatypes:: SXCM_TS).value->size() = 1 or eff.oclAsType(datatypes:: SXCM_TS).isNullFlavorDefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeTSValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time TS Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeTSValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeTSValue(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_TS_VALUE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityEffectiveTimeTSValue"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityEffectiveTimePIVLTS"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->forAll(eff | eff.operator = vocab::SetOperator::A and eff.operator->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Operator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeOperator(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityEffectiveTimeOperator"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() implies not self.doseQuantity.unit.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantityUnit(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityDoseQuantityUnit"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::DrugVehicle))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::CSM)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDrugVehicleTypeCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityDrugVehicleTypeCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityInstructionsInversionInd(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityInstructionsInversionInd"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.rateQuantity.oclIsUndefined() implies self.rateQuantity.oclAsType(datatypes::PQ).unit->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRateQuantityUnit(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityRateQuantityUnit"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTemplateId(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityTemplateId"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityClassCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityClassCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and " +
			"let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in " +
			"value = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMoodCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityMoodCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityId(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityId"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityStatusCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityStatusCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRouteCodeP(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityRouteCodeP"),
						new Object[] { medicationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP", passToken);
				}
				passToken.add(medicationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRouteCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityRouteCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityApproachSiteCodeP(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityApproachSiteCodeP"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (( not self.approachSiteCode->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityApproachSiteCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_APPROACH_SITE_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityApproachSiteCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITY,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityDoseQuantity"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRateQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_RATE_QUANTITY,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityRateQuantity"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMaxDoseQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityMaxDoseQuantity"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityAdministrationUnitCodeP(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityAdministrationUnitCodeP"),
						new Object[] { medicationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP", passToken);
				}
				passToken.add(medicationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C42887' or value.code = 'C42888' or value.code = 'C42960' or value.code = 'C42971' or value.code = 'C42889' or value.code = 'C42892' or value.code = 'C42890' or value.code = 'C43451' or value.code = 'C42891' or value.code = 'C25158' or value.code = 'C42895' or value.code = 'C42896' or value.code = 'C42917' or value.code = 'C42902' or value.code = 'C42904' or value.code = 'C42916' or value.code = 'C42928' or value.code = 'C42936' or value.code = 'C42954' or value.code = 'C45414' or value.code = 'C42678' or value.code = 'C60884' or value.code = 'C60891' or value.code = 'C42900' or value.code = 'C42919' or value.code = 'C28944' or value.code = 'C60897' or value.code = 'C42901' or value.code = 'C45415' or value.code = 'C47890' or value.code = 'C43525' or value.code = 'C42679' or value.code = 'C42763' or value.code = 'C17423' or value.code = 'C42912' or value.code = 'C42913' or value.code = 'C42915' or value.code = 'C42929' or value.code = 'C60926' or value.code = 'C42932' or value.code = 'C42920' or value.code = 'C42984' or value.code = 'C60927' or value.code = 'C60928' or value.code = 'C60929' or value.code = 'C42933' or value.code = 'C42934' or value.code = 'C42906' or value.code = 'C60930' or value.code = 'C48193' or value.code = 'C42937' or value.code = 'C45416' or value.code = 'C42938' or value.code = 'C42903' or value.code = 'C42909' or value.code = 'C42939' or value.code = 'C42940' or value.code = 'C42921' or value.code = 'C42941' or value.code = 'C42894' or value.code = 'C42978' or value.code = 'C42942' or value.code = 'C42944' or value.code = 'C60931' or value.code = 'C42946' or value.code = 'C42914' or value.code = 'C42950' or value.code = 'C42974' or value.code = 'C42976' or value.code = 'C42977' or value.code = 'C42959' or value.code = 'C42957' or value.code = 'C42958' or value.code = 'C42956' or value.code = 'C42945' or value.code = 'C42899' or value.code = 'C42995' or value.code = 'C42926' or value.code = 'C42951' or value.code = 'C42988' or value.code = 'C60933' or value.code = 'C42922' or value.code = 'C47915' or value.code = 'C42947' or value.code = 'C42948' or value.code = 'C47916' or value.code = 'C45413' or value.code = 'C42949' or value.code = 'C42952' or value.code = 'C42953' or value.code = 'C60934' or value.code = 'C29167' or value.code = 'C60957' or value.code = 'C60958' or value.code = 'C42955' or value.code = 'C29269' or value.code = 'C42965' or value.code = 'C42966' or value.code = 'C60984' or value.code = 'C47887' or value.code = 'C42967' or value.code = 'C42907' or value.code = 'C60985' or value.code = 'C42968' or value.code = 'C42923' or value.code = 'C42911' or value.code = 'C42969' or value.code = 'C42943' or value.code = 'C42918' or value.code = 'C25394' or value.code = 'C42970' or value.code = 'C47913' or value.code = 'C42972' or value.code = 'C42908' or value.code = 'C42973' or value.code = 'C42975' or value.code = 'C42961' or value.code = 'C60988' or value.code = 'C42979' or value.code = 'C42980' or value.code = 'C42981' or value.code = 'C42982' or value.code = 'C42983' or value.code = 'C42986' or value.code = 'C42898' or value.code = 'C42987' or value.code = 'C60994' or value.code = 'C42935' or value.code = 'C60992' or value.code = 'C47912' or value.code = 'C42989' or value.code = 'C42962' or value.code = 'C42990' or value.code = 'C42991' or value.code = 'C47914' or value.code = 'C42993' or value.code = 'C42924' or value.code = 'C42994' or value.code = 'C42925' or value.code = 'C60995' or value.code = 'C47889' or value.code = 'C47898' or value.code = 'C42996' or value.code = 'C42998' or value.code = 'C42893' or value.code = 'C42897' or value.code = 'C60997' or value.code = 'C42905' or value.code = 'C42997' or value.code = 'C42910' or value.code = 'C42927' or value.code = 'C42931' or value.code = 'C42930' or value.code = 'C61004' or value.code = 'C61005' or value.code = 'C42964' or value.code = 'C42963' or value.code = 'C42999' or value.code = 'C61006' or value.code = 'C42985' or value.code = 'C42992' or value.code = 'C47892' or value.code = 'C47897' or value.code = 'C43000' or value.code = 'C43001' or value.code = 'C43002' or value.code = 'C43003'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityAdministrationUnitCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityAdministrationUnitCode"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityText(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEXT,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityText"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRepeatNumber(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityRepeatNumber"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMedicationSupplyOrder(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityMedicationSupplyOrder"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityReactionObservation(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REACTION_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityReactionObservation"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityPerformer(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PERFORMER,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityPerformer"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityInstructions(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTIONS,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityInstructions"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityIndication(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INDICATION,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityIndication"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationDispense) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMedicationDispense(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_DISPENSE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityMedicationDispense"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityPrecondition(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRECONDITION,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityPrecondition"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::DrugVehicle))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDrugVehicle(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DRUG_VEHICLE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityDrugVehicle"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityConsumable(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CONSUMABLE,
						ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityConsumable"),
						new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::MedicationInformation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityConsumableMedicationInformation(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION,
							ConsolPlugin.INSTANCE.getString(
								"MedicationActivityMedicationActivityConsumableMedicationInformation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPreconditionTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::PRCN)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPreconditionTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityPreconditionTypeCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationActivityPreconditionTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION,
							ConsolPlugin.INSTANCE.getString(
								"MedicationActivityMedicationActivityPreconditionPreconditionForSubstanceAdministration"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSupplyOrder(MedicationActivity) <em>Get Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSupplyOrder(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSupplyOrder(MedicationActivity) <em>Get Medication Supply Order</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSupplyOrder(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationSupplyOrder getMedicationSupplyOrder(MedicationActivity medicationActivity) {

		if (GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(95));
			try {
				GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY = helper.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY);
		return (MedicationSupplyOrder) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation(MedicationActivity) <em>Get Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation))->asSequence()->any(true).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation(MedicationActivity) <em>Get Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReactionObservation getReactionObservation(MedicationActivity medicationActivity) {

		if (GET_REACTION_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(96));
			try {
				GET_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REACTION_OBSERVATION__EOCL_QRY);
		return (ReactionObservation) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructions(MedicationActivity) <em>Get Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->any(true).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getInstructions(MedicationActivity) <em>Get Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instructions getInstructions(MedicationActivity medicationActivity) {

		if (GET_INSTRUCTIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(97));
			try {
				GET_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndications(MedicationActivity) <em>Get Indications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndications(MedicationActivity) <em>Get Indications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication> getIndications(MedicationActivity medicationActivity) {

		if (GET_INDICATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(98));
			try {
				GET_INDICATIONS__EOCL_QRY = helper.createQuery(GET_INDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication> result = (Collection<Indication>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationDispenses(MedicationActivity) <em>Get Medication Dispenses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationDispenses(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_DISPENSES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense)).oclAsType(consol::MedicationDispense)";

	/**
	 * The cached OCL query for the '{@link #getMedicationDispenses(MedicationActivity) <em>Get Medication Dispenses</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationDispenses(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_DISPENSES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationDispense> getMedicationDispenses(MedicationActivity medicationActivity) {

		if (GET_MEDICATION_DISPENSES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(99));
			try {
				GET_MEDICATION_DISPENSES__EOCL_QRY = helper.createQuery(GET_MEDICATION_DISPENSES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATION_DISPENSES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationDispense> result = (Collection<MedicationDispense>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<MedicationDispense>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDrugVehicles(MedicationActivity) <em>Get Drug Vehicles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugVehicles(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DRUG_VEHICLES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::DrugVehicle)).oclAsType(consol::DrugVehicle)";

	/**
	 * The cached OCL query for the '{@link #getDrugVehicles(MedicationActivity) <em>Get Drug Vehicles</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugVehicles(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DRUG_VEHICLES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<DrugVehicle> getDrugVehicles(MedicationActivity medicationActivity) {

		if (GET_DRUG_VEHICLES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(100));
			try {
				GET_DRUG_VEHICLES__EOCL_QRY = helper.createQuery(GET_DRUG_VEHICLES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DRUG_VEHICLES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DrugVehicle> result = (Collection<DrugVehicle>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<DrugVehicle>(result.size(), result.toArray());
	}

} // MedicationActivityOperations
