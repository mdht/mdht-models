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
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Split Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullMedicationSeriesNumberObservation() <em>Getnull Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullMedicationStatusObservation() <em>Getnull Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullProductInstances() <em>Getnull Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullInternalReferences() <em>Getnull Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullPatientMedicalInstructionss() <em>Getnull Patient Medical Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasDosing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Dosing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseDosingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Dosing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasDescriptionNoMedNotKnown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Description No Med Not Known</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseReasonClassMood(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Reason Class Mood</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasProductEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Product Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasIntructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Intructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseProductStrength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDosePreconditionReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Precondition Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasSupplyEntryInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Supply Entry Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseSplitDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Split Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationSplitDoseAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullMedicationType() <em>Getnull Medication Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullMedicationOrderInformations() <em>Getnull Medication Order Informations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#getnullReactionObservation() <em>Getnull Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose#validateMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationSplitDoseOperations extends MedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSplitDoseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseMedicationSeriesNumberObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMedicationSeriesNumberObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseMedicationSeriesNumberObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Medication Series Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMedicationSeriesNumberObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseMedicationSeriesNumberObservation(
			MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseMedicationSeriesNumberObservation"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseMedicationStatusObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMedicationStatusObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseMedicationStatusObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMedicationStatusObservation(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseMedicationStatusObservation(
			MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_MEDICATION_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseMedicationStatusObservation"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseProductInstance(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseProductInstance(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseProductInstance(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseProductInstance(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseProductInstance(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseProductInstance"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationSeriesNumberObservation(MedicationSplitDose) <em>Getnull Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationSeriesNumberObservation(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationSeriesNumberObservation(MedicationSplitDose) <em>Getnull Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationSeriesNumberObservation(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationSeriesNumberObservation getnullMedicationSeriesNumberObservation(
			MedicationSplitDose medicationSplitDose) {
		if (GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(140));
			try {
				GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (MedicationSeriesNumberObservation) query.evaluate(medicationSplitDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationStatusObservation(MedicationSplitDose) <em>Getnull Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationStatusObservation(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationStatusObservation(MedicationSplitDose) <em>Getnull Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationStatusObservation(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getnullMedicationStatusObservation(MedicationSplitDose medicationSplitDose) {
		if (GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(141));
			try {
				GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(medicationSplitDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullProductInstances(MedicationSplitDose) <em>Getnull Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProductInstances(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getnullProductInstances(MedicationSplitDose) <em>Getnull Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProductInstances(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getnullProductInstances(MedicationSplitDose medicationSplitDose) {
		if (GETNULL_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(142));
			try {
				GETNULL_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GETNULL_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(medicationSplitDose);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullInternalReferences(MedicationSplitDose) <em>Getnull Internal References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullInternalReferences(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_INTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getnullInternalReferences(MedicationSplitDose) <em>Getnull Internal References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullInternalReferences(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_INTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<InternalReference> getnullInternalReferences(MedicationSplitDose medicationSplitDose) {
		if (GETNULL_INTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(143));
			try {
				GETNULL_INTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GETNULL_INTERNAL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_INTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InternalReference> result = (Collection<InternalReference>) query.evaluate(medicationSplitDose);
		return new BasicEList.UnmodifiableEList<InternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullPatientMedicalInstructionss(MedicationSplitDose) <em>Getnull Patient Medical Instructionss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullPatientMedicalInstructionss(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientMedicalInstructions)).oclAsType(consol::PatientMedicalInstructions)";

	/**
	 * The cached OCL query for the '{@link #getnullPatientMedicalInstructionss(MedicationSplitDose) <em>Getnull Patient Medical Instructionss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullPatientMedicalInstructionss(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientMedicalInstructions)).oclAsType(consol::PatientMedicalInstructions)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PatientMedicalInstructions> getnullPatientMedicalInstructionss(
			MedicationSplitDose medicationSplitDose) {
		if (GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(144));
			try {
				GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_PATIENT_MEDICAL_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientMedicalInstructions> result = (Collection<PatientMedicalInstructions>) query.evaluate(medicationSplitDose);
		return new BasicEList.UnmodifiableEList<PatientMedicalInstructions>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseMoodCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMoodCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseMoodCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMoodCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseMoodCode(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseMoodCode"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Dose Quantity Or Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Dose Quantity Or Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(
			MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasDoseQuantityOrRateQuantity"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasConsents(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Consents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasConsents(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasConsents(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Consents</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasConsents(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasConsents(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_CONSENTS,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasConsents"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseInformationSource(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseInformationSource(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseInformationSource(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseInformationSource(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseInformationSource(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseInformationSource"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasPreconditionCriterion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Precondition Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasPreconditionCriterion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasPreconditionCriterion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Precondition Criterion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasPreconditionCriterion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasPreconditionCriterion(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_PRECONDITION_CRITERION,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasPreconditionCriterion"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasReason(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasReason(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasReason(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasReason(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasReason(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_REASON,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasReason"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasReasonProblem(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Reason Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasReasonProblem(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : "
			+ "cda::ClinicalStatement | not target.oclIsUndefined() and "
			+ "  (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasReasonProblem(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Reason Problem</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasReasonProblem(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : 
	 * 
	 * cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasReasonProblem(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_REASON_PROBLEM,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasReasonProblem"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasProduct(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasProduct(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasProduct(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasProduct(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasProduct(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_PRODUCT,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasProduct"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasDosing(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Dosing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasDosing(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.1') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor self.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasDosing(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Dosing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasDosing(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.1') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor self.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.11')
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasDosing(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_DOSING,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasDosing"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseDosingRelationship(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Dosing Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseDosingRelationship(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor "
			+ "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseDosingRelationship(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Dosing Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseDosingRelationship(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.9') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.10') xor 
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseDosingRelationship(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_DOSING_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseDosingRelationship"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasDescriptionNoMedNotKnown(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Description No Med Not Known</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasDescriptionNoMedNotKnown(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasDescriptionNoMedNotKnown(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Description No Med Not Known</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasDescriptionNoMedNotKnown(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasDescriptionNoMedNotKnown(
			MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasDescriptionNoMedNotKnown"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseReasonClassMood(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Reason Class Mood</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseReasonClassMood(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseReasonClassMood(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Reason Class Mood</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseReasonClassMood(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseReasonClassMood(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_REASON_CLASS_MOOD,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseReasonClassMood"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasProductEntry(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Product Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasProductEntry(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasProductEntry(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Product Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasProductEntry(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.2')
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasProductEntry(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_PRODUCT_ENTRY,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasProductEntry"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasIntructionsInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Intructions Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasIntructionsInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists( er : cda::EntryRelationship | er.inversionInd <> true and er.act.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')  )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasIntructionsInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Intructions Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasIntructionsInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists( er : cda::EntryRelationship | er.inversionInd <> true and er.act.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')  )
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasIntructionsInversion(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_INTRUCTIONS_INVERSION,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasIntructionsInversion"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseProductStrength(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Strength</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseProductStrength(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseProductStrength(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Strength</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseProductStrength(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseProductStrength(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_PRODUCT_STRENGTH,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseProductStrength"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseProductName(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseProductName(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseProductName(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Product Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseProductName(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseProductName(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_PRODUCT_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseProductName"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDosePreconditionReference(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Precondition Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDosePreconditionReference(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDosePreconditionReference(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Precondition Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDosePreconditionReference(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDosePreconditionReference(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_PRECONDITION_REFERENCE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDosePreconditionReference"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasSupplyEntryInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Supply Entry Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasSupplyEntryInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasSupplyEntryInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Supply Entry Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasSupplyEntryInversion(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasSupplyEntryInversion(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_SUPPLY_ENTRY_INVERSION,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasSupplyEntryInversion"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseHasFillNumber(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Fill Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasFillNumber(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseHasFillNumber(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Has Fill Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseHasFillNumber(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseHasFillNumber(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_HAS_FILL_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseHasFillNumber"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseSplitDosingSubstanceAdministration(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Split Dosing Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseSplitDosingSubstanceAdministration(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship.substanceAdministration->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseSplitDosingSubstanceAdministration(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Split Dosing Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseSplitDosingSubstanceAdministration(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship.substanceAdministration->isEmpty()
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseSplitDosingSubstanceAdministration(
			MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseSplitDosingSubstanceAdministration"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseId(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseId"), new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseCode(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseCode"), new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseStatusCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseStatusCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseStatusCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseStatusCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseStatusCode(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseStatusCode"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseEffectiveTime(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseEffectiveTime(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseEffectiveTime(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseEffectiveTime(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseEffectiveTime(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseEffectiveTime"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseRouteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseRouteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in ("
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseRouteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseRouteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseRouteCode(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_ROUTE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseRouteCode"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseApproachSiteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseApproachSiteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseApproachSiteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseApproachSiteCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseApproachSiteCode(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_APPROACH_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseApproachSiteCode"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseDoseQuantity(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseDoseQuantity"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseRateQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseRateQuantity(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseRateQuantity"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseMaxDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMaxDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseMaxDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseMaxDoseQuantity(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseMaxDoseQuantity(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_MAX_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseMaxDoseQuantity"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSplitDoseAdministrationUnitCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseAdministrationUnitCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in ("
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSplitDoseAdministrationUnitCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Split Dose Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSplitDoseAdministrationUnitCode(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationSplitDoseAdministrationUnitCode(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_SPLIT_DOSE_ADMINISTRATION_UNIT_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationSplitDoseAdministrationUnitCode"),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationType(MedicationSplitDose) <em>Getnull Medication Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationType(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationType))->asSequence()->first().oclAsType(consol::MedicationType)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationType(MedicationSplitDose) <em>Getnull Medication Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationType(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationType))->asSequence()->first().oclAsType(consol::MedicationType)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationType getnullMedicationType(MedicationSplitDose medicationSplitDose) {
		if (GETNULL_MEDICATION_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(145));
			try {
				GETNULL_MEDICATION_TYPE__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_TYPE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_TYPE__EOCL_QRY);
		return (MedicationType) query.evaluate(medicationSplitDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullMedicationOrderInformations(MedicationSplitDose) <em>Getnull Medication Order Informations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationOrderInformations(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationOrderInformation)).oclAsType(consol::MedicationOrderInformation)";

	/**
	 * The cached OCL query for the '{@link #getnullMedicationOrderInformations(MedicationSplitDose) <em>Getnull Medication Order Informations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullMedicationOrderInformations(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationOrderInformation)).oclAsType(consol::MedicationOrderInformation)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<MedicationOrderInformation> getnullMedicationOrderInformations(
			MedicationSplitDose medicationSplitDose) {
		if (GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(146));
			try {
				GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY = helper.createQuery(GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationOrderInformation> result = (Collection<MedicationOrderInformation>) query.evaluate(medicationSplitDose);
		return new BasicEList.UnmodifiableEList<MedicationOrderInformation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullReactionObservation(MedicationSplitDose) <em>Getnull Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullReactionObservation(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))->asSequence()->first().oclAsType(consol::ProblemEntryReactionObservationContainer)";

	/**
	 * The cached OCL query for the '{@link #getnullReactionObservation(MedicationSplitDose) <em>Getnull Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullReactionObservation(MedicationSplitDose)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))->asSequence()->first().oclAsType(consol::ProblemEntryReactionObservationContainer)
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemEntryReactionObservationContainer getnullReactionObservation(
			MedicationSplitDose medicationSplitDose) {
		if (GETNULL_REACTION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE,
				ConsolPackage.Literals.MEDICATION_SPLIT_DOSE.getEAllOperations().get(147));
			try {
				GETNULL_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GETNULL_REACTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_REACTION_OBSERVATION__EOCL_QRY);
		return (ProblemEntryReactionObservationContainer) query.evaluate(medicationSplitDose);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationTemplateId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationTemplateId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(MedicationSplitDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')
	 * @param medicationSplitDose The receiving '<em><b>Medication Split Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationTemplateId(MedicationSplitDose medicationSplitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SPLIT_DOSE);
			try {
				VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationSplitDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_SPLIT_DOSE__MEDICATION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MedicationTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationSplitDose, context) }),
					new Object[] { medicationSplitDose }));
			}
			return false;
		}
		return true;
	}

} // MedicationSplitDoseOperations
