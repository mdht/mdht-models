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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Combination Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasDosing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dosing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationDosingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dosing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Description No Med Not Known</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationReasonClassMood(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reason Class Mood</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasProductEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasIntructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Intructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationProductStrength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationPreconditionReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Precondition Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasSupplyEntryInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Supply Entry Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Combination Medication Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getnullReactionObservations() <em>Getnull Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getProductInstances() <em>Get Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getInternalReferences() <em>Get Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getPatientMedicalInstructionss() <em>Get Patient Medical Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getSupplyEntry() <em>Get Supply Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationCombinationMedicationOperations extends MedicationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationCombinationMedicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationMoodCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMoodCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationMoodCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMoodCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationMoodCode(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationMoodCode"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dose Quantity Or Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dose Quantity Or Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasDoseQuantityOrRateQuantity"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasConsents(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Consents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasConsents(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasConsents(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Consents</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasConsents(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasConsents(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasConsents"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationInformationSource(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationInformationSource(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationInformationSource(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationInformationSource(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationInformationSource(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationInformationSource"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasPreconditionCriterion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Precondition Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasPreconditionCriterion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasPreconditionCriterion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Precondition Criterion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasPreconditionCriterion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasPreconditionCriterion(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasPreconditionCriterion"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasReason(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasReason(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasReason(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasReason(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasReason(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_REASON,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasReason"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasReasonProblem(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasReasonProblem(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : "
			+ "cda::ClinicalStatement | not target.oclIsUndefined() and "
			+ "  (target.oclIsKindOf(consol::ProblemConcernAct) or target.oclIsKindOf(consol::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasReasonProblem(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason Problem</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasReasonProblem(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : 
	 * 
	 * cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(consol::ProblemConcernAct) or target.oclIsKindOf(consol::ProblemObservation)))
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasReasonProblem(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasReasonProblem"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasProduct(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasProduct(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.oclIsKindOf(consol::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasProduct(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasProduct(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.oclIsKindOf(consol::Product)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasProduct(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasProduct"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasDosing(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dosing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasDosing(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.1') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor self.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasDosing(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dosing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasDosing(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.1') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor self.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.11')
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasDosing(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_DOSING,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasDosing"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationDosingRelationship(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dosing Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationDosingRelationship(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationDosingRelationship(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dosing Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationDosingRelationship(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationDosingRelationship(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationDosingRelationship"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Description No Med Not Known</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Description No Med Not Known</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasDescriptionNoMedNotKnown"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationReasonClassMood(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reason Class Mood</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationReasonClassMood(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationReasonClassMood(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reason Class Mood</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationReasonClassMood(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationReasonClassMood(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationReasonClassMood"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasProductEntry(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasProductEntry(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasProductEntry(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasProductEntry(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.2')
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasProductEntry(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasProductEntry"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasIntructionsInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Intructions Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasIntructionsInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll( er : cda::EntryRelationship | (not er.act.oclIsKindOf(consol::PatientMedicalInstructions)) or ( er.inversionInd = true and er.act.oclIsKindOf(consol::PatientMedicalInstructions))  )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasIntructionsInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Intructions Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasIntructionsInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll( er : cda::EntryRelationship | (not er.act.oclIsKindOf(consol::PatientMedicalInstructions)) or ( er.inversionInd = true and er.act.oclIsKindOf(consol::PatientMedicalInstructions))  )
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasIntructionsInversion(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasIntructionsInversion"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationProductStrength(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Strength</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationProductStrength(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationProductStrength(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Strength</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationProductStrength(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationProductStrength(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationProductStrength"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationProductName(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationProductName(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationProductName(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationProductName(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationProductName(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationProductName"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationPreconditionReference(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Precondition Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationPreconditionReference(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationPreconditionReference(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Precondition Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationPreconditionReference(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationPreconditionReference(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationPreconditionReference"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasSupplyEntryInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Supply Entry Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasSupplyEntryInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasSupplyEntryInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Supply Entry Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasSupplyEntryInversion(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasSupplyEntryInversion(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasSupplyEntryInversion"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationHasFillNumber(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Fill Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasFillNumber(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationHasFillNumber(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Fill Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationHasFillNumber(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationHasFillNumber(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationHasFillNumber"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Combination Medication Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship.substanceAdministration->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Combination Medication Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship.substanceAdministration->isEmpty()
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationCombinationMedicationSubstanceAdministration"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationId(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_ID,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationId"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationStatusCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationStatusCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationStatusCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationStatusCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationStatusCode(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationStatusCode"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationEffectiveTime(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationEffectiveTime(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationEffectiveTime(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationEffectiveTime(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationEffectiveTime(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationEffectiveTime"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationRouteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationRouteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.112'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationRouteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationRouteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.112'))
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationRouteCode(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationRouteCode"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationApproachSiteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationApproachSiteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationApproachSiteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationApproachSiteCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationApproachSiteCode(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationApproachSiteCode"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationDoseQuantity(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationDoseQuantity"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationRateQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationRateQuantity(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationRateQuantity"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationMaxDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMaxDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationMaxDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMaxDoseQuantity(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationMaxDoseQuantity(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationMaxDoseQuantity"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationMedicationSeriesNumberObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMedicationSeriesNumberObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationMedicationSeriesNumberObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Series Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMedicationSeriesNumberObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationMedicationSeriesNumberObservation(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationMedicationSeriesNumberObservation"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationMedicationStatusObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMedicationStatusObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationMedicationStatusObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationMedicationStatusObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationMedicationStatusObservation(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationMedicationStatusObservation"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationReactionObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationReactionObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationReactionObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationReactionObservation(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationReactionObservation(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationReactionObservation"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationCombinationMedicationProductInstance(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationProductInstance(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationCombinationMedicationProductInstance(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationCombinationMedicationProductInstance(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationCombinationMedicationProductInstance(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("MedicationCombinationMedicationProductInstance"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSeriesNumberObservation(MedicationCombinationMedication) <em>Get Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSeriesNumberObservation(MedicationCombinationMedication) <em>Get Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationSeriesNumberObservation getMedicationSeriesNumberObservation(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(139));
			try {
				GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (MedicationSeriesNumberObservation) query.evaluate(medicationCombinationMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(MedicationCombinationMedication) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(MedicationCombinationMedication) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getMedicationStatusObservation(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(140));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(medicationCombinationMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullReactionObservations(MedicationCombinationMedication) <em>Getnull Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullReactionObservations(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getnullReactionObservations(MedicationCombinationMedication) <em>Getnull Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullReactionObservations(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ReactionObservation> getnullReactionObservations(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GETNULL_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(141));
			try {
				GETNULL_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GETNULL_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation> result = (Collection<ReactionObservation>) query.evaluate(medicationCombinationMedication);
		return new BasicEList.UnmodifiableEList<ReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances(MedicationCombinationMedication) <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances(MedicationCombinationMedication) <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getProductInstances(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(142));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(medicationCombinationMedication);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInternalReferences(MedicationCombinationMedication) <em>Get Internal References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferences(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getInternalReferences(MedicationCombinationMedication) <em>Get Internal References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferences(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<InternalReference> getInternalReferences(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GET_INTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(143));
			try {
				GET_INTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InternalReference> result = (Collection<InternalReference>) query.evaluate(medicationCombinationMedication);
		return new BasicEList.UnmodifiableEList<InternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientMedicalInstructionss(MedicationCombinationMedication) <em>Get Patient Medical Instructionss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientMedicalInstructionss(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getPatientMedicalInstructionss(MedicationCombinationMedication) <em>Get Patient Medical Instructionss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientMedicalInstructionss(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Instructions> getPatientMedicalInstructionss(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(144));
			try {
				GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instructions> result = (Collection<Instructions>) query.evaluate(medicationCombinationMedication);
		return new BasicEList.UnmodifiableEList<Instructions>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplyEntry(MedicationCombinationMedication) <em>Get Supply Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyEntry(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLY_ENTRY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))->asSequence()->first().oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	 * The cached OCL query for the '{@link #getSupplyEntry(MedicationCombinationMedication) <em>Get Supply Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyEntry(MedicationCombinationMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLY_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))->asSequence()->first().oclAsType(consol::NonMedicinalSupplyActivity)
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static NonMedicinalSupplyActivity getSupplyEntry(
			MedicationCombinationMedication medicationCombinationMedication) {
		if (GET_SUPPLY_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION,
				ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION.getEAllOperations().get(145));
			try {
				GET_SUPPLY_ENTRY__EOCL_QRY = helper.createQuery(GET_SUPPLY_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY_ENTRY__EOCL_QRY);
		return (NonMedicinalSupplyActivity) query.evaluate(medicationCombinationMedication);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationActivityTemplateId(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_ACTIVITY_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MedicationActivityTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									medicationCombinationMedication, context) }),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationCombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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
	 * @param medicationCombinationMedication The receiving '<em><b>Medication Combination Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationActivityCode(
			MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationCombinationMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_COMBINATION_MEDICATION__MEDICATION_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityCode"),
					new Object[] { medicationCombinationMedication }));
			}
			return false;
		}
		return true;
	}

} // MedicationCombinationMedicationOperations
