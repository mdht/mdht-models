/*******************************************************************************
 * Copyright (c) 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - To enforce 'NA', modified OCL for:
 *     								   VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Free Text Sig</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigEDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigEDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig ED Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumableManufacturedProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationFreeTextSigOperations extends SubstanceAdministrationOperations {
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
	protected MedicationFreeTextSigOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigTextReferenceValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigTextReferenceValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigTextReferenceValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigTextReferenceValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigTextReferenceValue(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigTextReferenceValue"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigTemplateId(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigTemplateId(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.147')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigTemplateId(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigTemplateId(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigTemplateId(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigTemplateId"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigClassCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigClassCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigClassCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigClassCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigClassCode(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigClassCode"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigMoodCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigMoodCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and " +
			"let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in " +
			"value = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigMoodCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigMoodCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigMoodCode(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigMoodCode"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '76662-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigCode(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigCode(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigCode"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigCodeP(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigCodeP(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigCodeP(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigCodeP(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigCodeP(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigCodeP"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigText(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigText(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigText(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigText(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigText(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_TEXT,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigText"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigConsumable(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumable(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigConsumable(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumable(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationFreeTextSigConsumable(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationFreeTextSig)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CONSUMABLE,
						ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigConsumable"),
						new Object[] { medicationFreeTextSig }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigEDTELValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig EDTEL Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigEDTELValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined()).reference->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigEDTELValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig EDTEL Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigEDTELValue(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationFreeTextSigEDTELValue(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationFreeTextSig);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE,
							ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigEDTELValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigEDReference(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig ED Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigEDReference(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((reference.oclIsUndefined() or reference.isNullFlavorUndefined()) implies (not reference.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigEDReference(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig ED Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigEDReference(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationFreeTextSigEDReference(MedicationFreeTextSig medicationFreeTextSig,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationFreeTextSig);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_ED_REFERENCE,
							ConsolPlugin.INSTANCE.getString("MedicationFreeTextSigMedicationFreeTextSigEDReference"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	// protected static final String
	// VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "self.consumable->excluding(null).manufacturedProduct->excluding(null).manufacturedLabeledDrug->excluding(null)->reject(isDefined('nullFlavor'))";

	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null).manufacturedProduct->excluding(null).manufacturedLabeledDrug->excluding(null)->reject(isDefined('nullFlavor') and nullFlavor = vocab::NullFlavor::NA)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(
			MedicationFreeTextSig medicationFreeTextSig, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationFreeTextSig);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR,
							ConsolPlugin.INSTANCE.getString(
								"MedicationFreeTextSigMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null).manufacturedProduct->excluding(null)->reject(manufacturedLabeledDrug->one(manufacturedLabeledDrug : cda::LabeledDrug | not manufacturedLabeledDrug.oclIsUndefined() and manufacturedLabeledDrug.oclIsKindOf(cda::LabeledDrug)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(
			MedicationFreeTextSig medicationFreeTextSig, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationFreeTextSig);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG,
							ConsolPlugin.INSTANCE.getString(
								"MedicationFreeTextSigMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationFreeTextSigConsumableManufacturedProduct(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumableManufacturedProduct(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationFreeTextSigConsumableManufacturedProduct(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationFreeTextSigConsumableManufacturedProduct(MedicationFreeTextSig, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationFreeTextSig The receiving '<em><b>Medication Free Text Sig</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationFreeTextSigConsumableManufacturedProduct(
			MedicationFreeTextSig medicationFreeTextSig, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			medicationFreeTextSig);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MEDICATION_FREE_TEXT_SIG__MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT,
							ConsolPlugin.INSTANCE.getString(
								"MedicationFreeTextSigMedicationFreeTextSigConsumableManufacturedProduct"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // MedicationFreeTextSigOperations
