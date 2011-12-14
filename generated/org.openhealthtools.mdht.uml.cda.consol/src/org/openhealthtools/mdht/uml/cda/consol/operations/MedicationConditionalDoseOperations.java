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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Act;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Conditional Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasDosing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dosing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseDosingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dosing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Description No Med Not Known</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseReasonClassMood(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reason Class Mood</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasProductEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasIntructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Intructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductStrength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDosePreconditionReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Precondition Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasSupplyEntryInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Supply Entry Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Conditional Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getConsolReactionObservations() <em>Get Consol Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getProductInstances() <em>Get Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getInternalReferences() <em>Get Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getPatientMedicalInstructionss() <em>Get Patient Medical Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getSupplyEntry() <em>Get Supply Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationConditionalDoseOperations extends MedicationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationConditionalDoseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseMoodCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMoodCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseMoodCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMoodCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseMoodCode(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseMoodCode"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dose Quantity Or Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dose Quantity Or Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasDoseQuantityOrRateQuantity"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasConsents(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Consents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasConsents(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasConsents(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Consents</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasConsents(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasConsents(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasConsents"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseInformationSource(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseInformationSource(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseInformationSource(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseInformationSource(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseInformationSource(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseInformationSource"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasPreconditionCriterion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Precondition Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasPreconditionCriterion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasPreconditionCriterion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Precondition Criterion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasPreconditionCriterion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasPreconditionCriterion(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasPreconditionCriterion"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasReason(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasReason(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasReason(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasReason(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasReason(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_REASON,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasReason"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasReasonProblem(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasReasonProblem(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : "
			+ "cda::ClinicalStatement | not target.oclIsUndefined() and "
			+ "  (target.oclIsKindOf(consol::ProblemConcernAct) or target.oclIsKindOf(consol::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasReasonProblem(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason Problem</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasReasonProblem(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : 
	 * 
	 * cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(consol::ProblemConcernAct) or target.oclIsKindOf(consol::ProblemObservation)))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasReasonProblem(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasReasonProblem"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasProduct(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasProduct(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.oclIsKindOf(consol::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasProduct(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasProduct(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.oclIsKindOf(consol::Product)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasProduct(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasProduct"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasDosing(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dosing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasDosing(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.1') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor self.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasDosing(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dosing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasDosing(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.1') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor self.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.11')
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasDosing(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_DOSING,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasDosing"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseDosingRelationship(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dosing Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseDosingRelationship(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseDosingRelationship(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dosing Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseDosingRelationship(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseDosingRelationship(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseDosingRelationship"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Description No Med Not Known</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Description No Med Not Known</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasDescriptionNoMedNotKnown"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseReasonClassMood(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reason Class Mood</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseReasonClassMood(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseReasonClassMood(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reason Class Mood</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseReasonClassMood(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseReasonClassMood(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseReasonClassMood"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasProductEntry(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasProductEntry(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasProductEntry(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasProductEntry(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.2')
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasProductEntry(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasProductEntry"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasIntructionsInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Intructions Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasIntructionsInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll( er : cda::EntryRelationship | (not er.act.oclIsKindOf(consol::PatientMedicalInstructions)) or ( er.inversionInd = true and er.act.oclIsKindOf(consol::PatientMedicalInstructions))  )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasIntructionsInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Intructions Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasIntructionsInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll( er : cda::EntryRelationship | (not er.act.oclIsKindOf(consol::PatientMedicalInstructions)) or ( er.inversionInd = true and er.act.oclIsKindOf(consol::PatientMedicalInstructions))  )
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasIntructionsInversion(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasIntructionsInversion"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseProductStrength(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Strength</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseProductStrength(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseProductStrength(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Strength</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseProductStrength(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseProductStrength(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseProductStrength"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseProductName(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseProductName(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseProductName(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseProductName(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseProductName(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseProductName"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDosePreconditionReference(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Precondition Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDosePreconditionReference(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDosePreconditionReference(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Precondition Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDosePreconditionReference(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDosePreconditionReference(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDosePreconditionReference"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasSupplyEntryInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Supply Entry Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasSupplyEntryInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasSupplyEntryInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Supply Entry Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasSupplyEntryInversion(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasSupplyEntryInversion(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasSupplyEntryInversion"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseHasFillNumber(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Fill Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasFillNumber(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseHasFillNumber(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Fill Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseHasFillNumber(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseHasFillNumber(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseHasFillNumber"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Conditional Dosing Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship.substanceAdministration->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Conditional Dosing Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship.substanceAdministration->isEmpty()
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseConditionalDosingSubstanceAdministration"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseId(MedicationConditionalDose medicationConditionalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseId"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseStatusCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseStatusCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseStatusCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseStatusCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseStatusCode(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseStatusCode"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseEffectiveTime(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseEffectiveTime(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseEffectiveTime(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseEffectiveTime(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseEffectiveTime(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseEffectiveTime"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseRouteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseRouteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.112'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseRouteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseRouteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.112'))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseRouteCode(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseRouteCode"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseApproachSiteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseApproachSiteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseApproachSiteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseApproachSiteCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseApproachSiteCode(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseApproachSiteCode"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseDoseQuantity(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseDoseQuantity"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseRateQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseRateQuantity(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseRateQuantity"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseMaxDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMaxDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseMaxDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMaxDoseQuantity(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseMaxDoseQuantity(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseMaxDoseQuantity"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseMedicationSeriesNumberObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMedicationSeriesNumberObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseMedicationSeriesNumberObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Series Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMedicationSeriesNumberObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseMedicationSeriesNumberObservation(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseMedicationSeriesNumberObservation"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseMedicationStatusObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMedicationStatusObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseMedicationStatusObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseMedicationStatusObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseMedicationStatusObservation(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseMedicationStatusObservation"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseReactionObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseReactionObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseReactionObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseReactionObservation(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseReactionObservation(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseReactionObservation"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseProductInstance(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseProductInstance(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseProductInstance(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseProductInstance(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseProductInstance(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseProductInstance"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSeriesNumberObservation(MedicationConditionalDose) <em>Get Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSeriesNumberObservation(MedicationConditionalDose) <em>Get Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationSeriesNumberObservation getMedicationSeriesNumberObservation(
			MedicationConditionalDose medicationConditionalDose) {
		if (GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(108));
			try {
				GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (MedicationSeriesNumberObservation) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(MedicationConditionalDose) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(MedicationConditionalDose) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getMedicationStatusObservation(
			MedicationConditionalDose medicationConditionalDose) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(109));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolReactionObservations(MedicationConditionalDose) <em>Get Consol Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservations(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolReactionObservations(MedicationConditionalDose) <em>Get Consol Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservations(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ReactionObservation> getConsolReactionObservations(
			MedicationConditionalDose medicationConditionalDose) {
		if (GET_CONSOL_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(110));
			try {
				GET_CONSOL_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation> result = (Collection<ReactionObservation>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<ReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances(MedicationConditionalDose) <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances(MedicationConditionalDose) <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getProductInstances(MedicationConditionalDose medicationConditionalDose) {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(111));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInternalReferences(MedicationConditionalDose) <em>Get Internal References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferences(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)).oclAsType(cda::Act)";

	/**
	 * The cached OCL query for the '{@link #getInternalReferences(MedicationConditionalDose) <em>Get Internal References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferences(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)).oclAsType(cda::Act)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Act> getInternalReferences(MedicationConditionalDose medicationConditionalDose) {
		if (GET_INTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(112));
			try {
				GET_INTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Act> result = (Collection<Act>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<Act>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientMedicalInstructionss(MedicationConditionalDose) <em>Get Patient Medical Instructionss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientMedicalInstructionss(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getPatientMedicalInstructionss(MedicationConditionalDose) <em>Get Patient Medical Instructionss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientMedicalInstructionss(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Instructions> getPatientMedicalInstructionss(MedicationConditionalDose medicationConditionalDose) {
		if (GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(113));
			try {
				GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instructions> result = (Collection<Instructions>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<Instructions>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplyEntry(MedicationConditionalDose) <em>Get Supply Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyEntry(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLY_ENTRY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))->asSequence()->first().oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	 * The cached OCL query for the '{@link #getSupplyEntry(MedicationConditionalDose) <em>Get Supply Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyEntry(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLY_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))->asSequence()->first().oclAsType(consol::NonMedicinalSupplyActivity)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static NonMedicinalSupplyActivity getSupplyEntry(MedicationConditionalDose medicationConditionalDose) {
		if (GET_SUPPLY_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(114));
			try {
				GET_SUPPLY_ENTRY__EOCL_QRY = helper.createQuery(GET_SUPPLY_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY_ENTRY__EOCL_QRY);
		return (NonMedicinalSupplyActivity) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationActivityCode(MedicationConditionalDose medicationConditionalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityCode"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

} // MedicationConditionalDoseOperations
