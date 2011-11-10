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
import org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationNormalDoseOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Normal Dose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationNormalDoseImpl extends MedicationImpl implements MedicationNormalDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationNormalDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_NORMAL_DOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseMedicationSeriesNumberObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseMedicationSeriesNumberObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseMedicationStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseMedicationStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation getnullMedicationSeriesNumberObservation() {
		return MedicationNormalDoseOperations.getnullMedicationSeriesNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getnullMedicationStatusObservation() {
		return MedicationNormalDoseOperations.getnullMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getnullProductInstances() {
		return MedicationNormalDoseOperations.getnullProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getnullInternalReferences() {
		return MedicationNormalDoseOperations.getnullInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getnullPatientMedicalInstructionss() {
		return MedicationNormalDoseOperations.getnullPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasDoseQuantityOrRateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasConsents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseInformationSource(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasPreconditionCriterion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasPreconditionCriterion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasReasonProblem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasReasonProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseDosingRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseDosingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasDescriptionNoMedNotKnown(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasIntructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasIntructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDosePreconditionReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDosePreconditionReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasSupplyEntryInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasSupplyEntryInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseNoSubordinateSubstanceAdministration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseNoSubordinateSubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDoseAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationNormalDoseAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType getnullMedicationType() {
		return MedicationNormalDoseOperations.getnullMedicationType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderInformation> getnullMedicationOrderInformations() {
		return MedicationNormalDoseOperations.getnullMedicationOrderInformations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntryReactionObservationContainer getnullReactionObservation() {
		return MedicationNormalDoseOperations.getnullReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNormalDoseOperations.validateMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationNormalDose init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationNormalDoseImpl
