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

import org.openhealthtools.mdht.uml.cda.Act;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationConditionalDoseOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Conditional Dose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationConditionalDoseImpl extends MedicationActivityImpl implements MedicationConditionalDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationConditionalDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_CONDITIONAL_DOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasConsents(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseInformationSource(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseInformationSource(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasPreconditionCriterion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasPreconditionCriterion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasReason(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasReasonProblem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasReasonProblem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasProduct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasDosing(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseDosingRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseDosingRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseReasonClassMood(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseReasonClassMood(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasProductEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasProductEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasIntructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasIntructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseProductStrength(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseProductStrength(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseProductName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDosePreconditionReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDosePreconditionReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasSupplyEntryInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasSupplyEntryInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseHasFillNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasFillNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseRouteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseApproachSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseDoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseRateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseRateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseMaxDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMaxDoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseMedicationSeriesNumberObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMedicationSeriesNumberObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseMedicationStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMedicationStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseReactionObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDoseProductInstance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationConditionalDoseProductInstance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation getMedicationSeriesNumberObservation() {
		return MedicationConditionalDoseOperations.getMedicationSeriesNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getMedicationStatusObservation() {
		return MedicationConditionalDoseOperations.getMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation> getnullReactionObservations() {
		return MedicationConditionalDoseOperations.getnullReactionObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getProductInstances() {
		return MedicationConditionalDoseOperations.getProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getInternalReferences() {
		return MedicationConditionalDoseOperations.getInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getPatientMedicalInstructionss() {
		return MedicationConditionalDoseOperations.getPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity getSupplyEntry() {
		return MedicationConditionalDoseOperations.getSupplyEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationConditionalDoseOperations.validateMedicationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationConditionalDose init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationConditionalDoseImpl
