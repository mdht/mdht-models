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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SupplyOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderInstructionInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#getInstructions() <em>Get Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationSupplyOrderOperations extends SupplyOperations {
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
	protected MedicationSupplyOrderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderInstructionInversionInd(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderInstructionInversionInd(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderInstructionInversionInd(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderInstructionInversionInd(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderInstructionInversionInd(
			MedicationSupplyOrder medicationSupplyOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderInstructionInversionInd", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND,
						ConsolPlugin.INSTANCE.getString(
							"MedicationSupplyOrderMedicationSupplyOrderInstructionInversionInd"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderEffectiveTimeHigh(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderEffectiveTimeHigh(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->size() = 1 implies self.effectiveTime.oclAsType(datatypes::IVL_TS)->forAll(high->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderEffectiveTimeHigh(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderEffectiveTimeHigh(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderEffectiveTimeHigh(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderEffectiveTimeHigh", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderEffectiveTimeHigh"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderContainsMedicationOrImmunization(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Contains Medication Or Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderContainsMedicationOrImmunization(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation) xor self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderContainsMedicationOrImmunization(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Contains Medication Or Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderContainsMedicationOrImmunization(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderContainsMedicationOrImmunization(
			MedicationSupplyOrder medicationSupplyOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MedicationSupplyOrderMedicationSupplyOrderContainsMedicationOrImmunization", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION,
						ConsolPlugin.INSTANCE.getString(
							"MedicationSupplyOrderMedicationSupplyOrderContainsMedicationOrImmunization"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderTemplateId(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderTemplateId", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderTemplateId"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderClassCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderClassCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassSupply::SPLY";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderClassCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderClassCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderClassCode(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderClassCode", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderClassCode"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderEffectiveTime(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderEffectiveTime", "WARNING");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderEffectiveTime"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderMoodCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderMoodCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderMoodCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderMoodCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderMoodCode(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderMoodCode", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderMoodCode"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderQuantity(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderQuantity", "WARNING");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_QUANTITY,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderQuantity"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderRepeatNumber(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderRepeatNumber", "WARNING");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderRepeatNumber"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderStatusCode(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderStatusCode", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderStatusCode"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderId(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderStatusCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderStatusCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderStatusCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderStatusCode(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderEffectiveTime(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderEffectiveTime(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (( not self.effectiveTime->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderEffectiveTime(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderEffectiveTime(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderRepeatNumber(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderRepeatNumber(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderRepeatNumber(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderRepeatNumber(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderQuantity(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderQuantity(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderQuantity(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderQuantity(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderId(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderId", "ERROR");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_ID,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderId"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderAuthor(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderAuthor(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderAuthor(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderAuthor(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderAuthor(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderAuthor", "INFO");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_AUTHOR,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderAuthor"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSupplyOrderInstructions(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderInstructions(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSupplyOrderInstructions(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSupplyOrderInstructions(MedicationSupplyOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationSupplyOrder The receiving '<em><b>Medication Supply Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationSupplyOrderInstructions(MedicationSupplyOrder medicationSupplyOrder,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicationSupplyOrderMedicationSupplyOrderInstructions", "INFO");

		if (VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER);
			try {
				VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationSupplyOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_SUPPLY_ORDER__MEDICATION_SUPPLY_ORDER_INSTRUCTIONS,
						ConsolPlugin.INSTANCE.getString("MedicationSupplyOrderMedicationSupplyOrderInstructions"),
						new Object[] { medicationSupplyOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructions(MedicationSupplyOrder) <em>Get Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(MedicationSupplyOrder)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->any(true).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getInstructions(MedicationSupplyOrder) <em>Get Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(MedicationSupplyOrder)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instructions getInstructions(MedicationSupplyOrder medicationSupplyOrder) {

		if (GET_INSTRUCTIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER,
				ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER.getEAllOperations().get(65));
			try {
				GET_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(medicationSupplyOrder);
	}

} // MedicationSupplyOrderOperations
