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
import org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationCombinationMedicationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Combination Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationCombinationMedicationImpl extends MedicationImpl implements MedicationCombinationMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationCombinationMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_COMBINATION_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasConsents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasPreconditionCriterion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasPreconditionCriterion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasReasonProblem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasReasonProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationDosingRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationDosingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasIntructionsInversion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasIntructionsInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationPreconditionReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationPreconditionReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasSupplyEntryInversion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasSupplyEntryInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationMedicationSeriesNumberObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMedicationSeriesNumberObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationMedicationStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMedicationStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationReactionObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedicationProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation getnullMedicationSeriesNumberObservation() {
		return MedicationCombinationMedicationOperations.getnullMedicationSeriesNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getnullMedicationStatusObservation() {
		return MedicationCombinationMedicationOperations.getnullMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemEntryReactionObservationContainer> getnullReactionObservations() {
		return MedicationCombinationMedicationOperations.getnullReactionObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getnullProductInstances() {
		return MedicationCombinationMedicationOperations.getnullProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getnullInternalReferences() {
		return MedicationCombinationMedicationOperations.getnullInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getnullPatientMedicalInstructionss() {
		return MedicationCombinationMedicationOperations.getnullPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderInformation getSupplyEntry() {
		return MedicationCombinationMedicationOperations.getSupplyEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationCombinationMedicationOperations.validateMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationCombinationMedication init() {
    	CDAUtil.init(this);
    	return this;
	}
} //MedicationCombinationMedicationImpl
