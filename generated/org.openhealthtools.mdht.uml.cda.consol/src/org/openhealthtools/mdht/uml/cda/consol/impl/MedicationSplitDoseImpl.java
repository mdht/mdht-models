/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSplitDoseOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Split Dose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationSplitDoseImpl extends MedicationImpl implements MedicationSplitDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSplitDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_SPLIT_DOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseMedicationSeriesNumberObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseMedicationSeriesNumberObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseMedicationStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseMedicationStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation getnullMedicationSeriesNumberObservation() {
		return MedicationSplitDoseOperations.getnullMedicationSeriesNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getnullMedicationStatusObservation() {
		return MedicationSplitDoseOperations.getnullMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getnullProductInstances() {
		return MedicationSplitDoseOperations.getnullProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getnullInternalReferences() {
		return MedicationSplitDoseOperations.getnullInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getnullPatientMedicalInstructionss() {
		return MedicationSplitDoseOperations.getnullPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasDoseQuantityOrRateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasConsents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasPreconditionCriterion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasPreconditionCriterion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasReasonProblem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasReasonProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseDosingRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseDosingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasDescriptionNoMedNotKnown(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasIntructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasIntructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDosePreconditionReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDosePreconditionReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasSupplyEntryInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasSupplyEntryInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseSplitDosingSubstanceAdministration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseSplitDosingSubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDoseAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationSplitDoseAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType getnullMedicationType() {
		return MedicationSplitDoseOperations.getnullMedicationType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderInformation> getnullMedicationOrderInformations() {
		return MedicationSplitDoseOperations.getnullMedicationOrderInformations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntryReactionObservationContainer getnullReactionObservation() {
		return MedicationSplitDoseOperations.getnullReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSplitDoseOperations.validateMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSplitDose init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationSplitDoseImpl
