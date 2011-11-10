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
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Conditional Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullMedicationSeriesNumberObservation() <em>Getnull Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullMedicationStatusObservation() <em>Getnull Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullProductInstances() <em>Getnull Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullInternalReferences() <em>Getnull Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullPatientMedicalInstructionss() <em>Getnull Patient Medical Instructionss</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullMedicationType() <em>Getnull Medication Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullMedicationOrderInformations() <em>Getnull Medication Order Informations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullReactionObservation() <em>Getnull Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationConditionalDoseOperations extends MedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationConditionalDoseOperations() {
		super();
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
	 * The cached OCL expression body for the '{@link #getnullMedicationSeriesNumberObservation(MedicationConditionalDose) <em>Getnull Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationSeriesNumberObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationSeriesNumberObservation(MedicationConditionalDose) <em>Getnull Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationSeriesNumberObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationSeriesNumberObservation getnullMedicationSeriesNumberObservation(
			MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(140));
			try {
				GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (MedicationSeriesNumberObservation) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationStatusObservation(MedicationConditionalDose) <em>Getnull Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationStatusObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationStatusObservation(MedicationConditionalDose) <em>Getnull Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationStatusObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getnullMedicationStatusObservation(
			MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(141));
			try {
				GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullProductInstances(MedicationConditionalDose) <em>Getnull Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProductInstances(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getnullProductInstances(MedicationConditionalDose) <em>Getnull Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProductInstances(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getnullProductInstances(MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(142));
			try {
				GETNULL_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GETNULL_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullInternalReferences(MedicationConditionalDose) <em>Getnull Internal References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullInternalReferences(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_INTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getnullInternalReferences(MedicationConditionalDose) <em>Getnull Internal References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullInternalReferences(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_INTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<InternalReference> getnullInternalReferences(MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_INTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(143));
			try {
				GETNULL_INTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GETNULL_INTERNAL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_INTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InternalReference> result = (Collection<InternalReference>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<InternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullPatientMedicalInstructionss(MedicationConditionalDose) <em>Getnull Patient Medical Instructionss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullPatientMedicalInstructionss(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientMedicalInstructions)).oclAsType(consol::PatientMedicalInstructions)";

	/**
	 * The cached OCL query for the '{@link #getnullPatientMedicalInstructionss(MedicationConditionalDose) <em>Getnull Patient Medical Instructionss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullPatientMedicalInstructionss(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientMedicalInstructions)).oclAsType(consol::PatientMedicalInstructions)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PatientMedicalInstructions> getnullPatientMedicalInstructionss(
			MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(144));
			try {
				GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientMedicalInstructions> result = (Collection<PatientMedicalInstructions>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<PatientMedicalInstructions>(result.size(), result.toArray());
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
			+ "  (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))";

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
	 *   (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))
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
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)";

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
	 * self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)
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
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists( er : cda::EntryRelationship | er.inversionInd <> true and er.act.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')  )";

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
	 * not self.entryRelationship->exists( er : cda::EntryRelationship | er.inversionInd <> true and er.act.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')  )
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
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseCode(MedicationConditionalDose medicationConditionalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONDITIONAL_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseCode"),
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
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
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
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

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
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
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
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
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
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

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
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
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
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
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
	 * The cached OCL expression body for the '{@link #validateMedicationConditionalDoseAdministrationUnitCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseAdministrationUnitCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in ("
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConditionalDoseAdministrationUnitCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConditionalDoseAdministrationUnitCode(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationConditionalDoseAdministrationUnitCode(
			MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_CONDITIONAL_DOSE_ADMINISTRATION_UNIT_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationConditionalDoseAdministrationUnitCode"),
					new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationType(MedicationConditionalDose) <em>Getnull Medication Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationType(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationType))->asSequence()->first().oclAsType(consol::MedicationType)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationType(MedicationConditionalDose) <em>Getnull Medication Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationType(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationType))->asSequence()->first().oclAsType(consol::MedicationType)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationType getnullMedicationType(MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_MEDICATION_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(145));
			try {
				GETNULL_MEDICATION_TYPE__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_TYPE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_TYPE__EOCL_QRY);
		return (MedicationType) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationOrderInformations(MedicationConditionalDose) <em>Getnull Medication Order Informations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationOrderInformations(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationOrderInformation)).oclAsType(consol::MedicationOrderInformation)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationOrderInformations(MedicationConditionalDose) <em>Getnull Medication Order Informations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationOrderInformations(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationOrderInformation)).oclAsType(consol::MedicationOrderInformation)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<MedicationOrderInformation> getnullMedicationOrderInformations(
			MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(146));
			try {
				GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationOrderInformation> result = (Collection<MedicationOrderInformation>) query.evaluate(medicationConditionalDose);
		return new BasicEList.UnmodifiableEList<MedicationOrderInformation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullReactionObservation(MedicationConditionalDose) <em>Getnull Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullReactionObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))->asSequence()->first().oclAsType(consol::ProblemEntryReactionObservationContainer)";

	/**
	 * The cached OCL query for the '{@link #getnullReactionObservation(MedicationConditionalDose) <em>Getnull Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullReactionObservation(MedicationConditionalDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))->asSequence()->first().oclAsType(consol::ProblemEntryReactionObservationContainer)
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemEntryReactionObservationContainer getnullReactionObservation(
			MedicationConditionalDose medicationConditionalDose) {
		if (GETNULL_REACTION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE,
				ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE.getEAllOperations().get(147));
			try {
				GETNULL_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GETNULL_REACTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_REACTION_OBSERVATION__EOCL_QRY);
		return (ProblemEntryReactionObservationContainer) query.evaluate(medicationConditionalDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationTemplateId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationTemplateId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(MedicationConditionalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')
	 * @param medicationConditionalDose The receiving '<em><b>Medication Conditional Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationTemplateId(MedicationConditionalDose medicationConditionalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE);
			try {
				VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationConditionalDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_CONDITIONAL_DOSE__MEDICATION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MedicationTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									medicationConditionalDose, context) }), new Object[] { medicationConditionalDose }));
			}
			return false;
		}
		return true;
	}

} // MedicationConditionalDoseOperations
