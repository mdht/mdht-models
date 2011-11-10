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
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationTaperedDoseOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Tapered Dose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationTaperedDoseImpl extends MedicationImpl implements MedicationTaperedDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationTaperedDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_TAPERED_DOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseMedicationSeriesNumberObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseMedicationSeriesNumberObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseMedicationStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseMedicationStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation getnullMedicationSeriesNumberObservation() {
		return MedicationTaperedDoseOperations.getnullMedicationSeriesNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getnullMedicationStatusObservation() {
		return MedicationTaperedDoseOperations.getnullMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getnullProductInstances() {
		return MedicationTaperedDoseOperations.getnullProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getnullInternalReferences() {
		return MedicationTaperedDoseOperations.getnullInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getnullPatientMedicalInstructionss() {
		return MedicationTaperedDoseOperations.getnullPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasDoseQuantityOrRateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasConsents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseInformationSource(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseInformationSource(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasPreconditionCriterion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasPreconditionCriterion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasReasonProblem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasReasonProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseDosingRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseDosingRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasDescriptionNoMedNotKnown(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasIntructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasIntructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDosePreconditionReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDosePreconditionReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasSupplyEntryInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasSupplyEntryInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDoseAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTaperedDoseAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType getnullMedicationType() {
		return MedicationTaperedDoseOperations.getnullMedicationType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderInformation> getnullMedicationOrderInformations() {
		return MedicationTaperedDoseOperations.getnullMedicationOrderInformations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntryReactionObservationContainer getnullReactionObservation() {
		return MedicationTaperedDoseOperations.getnullReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationTaperedDoseOperations.validateMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationTaperedDose init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationTaperedDoseImpl
