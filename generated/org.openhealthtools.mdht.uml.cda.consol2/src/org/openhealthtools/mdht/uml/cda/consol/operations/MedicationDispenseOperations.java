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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.SupplyOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationDispenseOperations extends SupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation) xor self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseContainsMedicationOrImmunization(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION,
						ConsolPlugin.INSTANCE.getString(
							"MedicationDispenseMedicationDispenseContainsMedicationOrImmunization"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseTemplateId(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseTemplateId"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassSupply::SPLY";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseClassCode(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseClassCode"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (( not self.effectiveTime->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseEffectiveTime(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseEffectiveTime"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseId(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_ID,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseId"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseMoodCode(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseMoodCode"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseRepeatNumber(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseRepeatNumber"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseStatusCode(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseStatusCode"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseQuantity(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_QUANTITY,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseQuantity"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispenseMedicationSupplyOrder(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispenseMedicationSupplyOrder"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformer(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformer(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformer(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformer(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationDispensePerformer(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationDispense)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER,
						ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationDispensePerformer"),
						new Object[] { medicationDispense }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and " +
			"let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in " +
			"value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (( not use->isEmpty())  )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (( not country->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (( not state->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (( not postalCode->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (( not addr->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntityAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDispensePerformerMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDispensePerformerMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntity(
			MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			medicationDispense);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"MedicationDispenseMedicationDispensePerformerMedicationDispenseAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSupplyOrder(MedicationDispense) <em>Get Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSupplyOrder(MedicationDispense)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSupplyOrder(MedicationDispense) <em>Get Medication Supply Order</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSupplyOrder(MedicationDispense)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationSupplyOrder getMedicationSupplyOrder(MedicationDispense medicationDispense) {
		if (GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_DISPENSE,
				ConsolPackage.Literals.MEDICATION_DISPENSE.getEAllOperations().get(73));
			try {
				GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY = helper.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY);
		return (MedicationSupplyOrder) query.evaluate(medicationDispense);
	}

} // MedicationDispenseOperations
