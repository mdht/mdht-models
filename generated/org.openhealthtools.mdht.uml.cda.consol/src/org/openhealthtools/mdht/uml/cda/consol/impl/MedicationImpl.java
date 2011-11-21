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
import org.openhealthtools.mdht.uml.cda.consol.Medication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationOperations;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationImpl extends SubstanceAdministrationImpl implements Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasDoseQuantityOrRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasConsents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasPreconditionCriterion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasPreconditionCriterion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasReasonProblem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasReasonProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDosingRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDosingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasDescriptionNoMedNotKnown(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasIntructionsInversion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasIntructionsInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPreconditionReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationPreconditionReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasSupplyEntryInversion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasSupplyEntryInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFirstEffectiveTimeDatatype(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationFirstEffectiveTimeDatatype(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDoseUnits(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDoseUnits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDeliveryMethodDescription(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDeliveryMethodDescription(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasMedicationInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasMedicationInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasStatusOfMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasStatusOfMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasIndicationNarrativeText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasIndicationNarrativeText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasIndicationVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasIndicationVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasPatientInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasPatientInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasMedicationVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasMedicationVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationVehicleType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationVehicleType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationVehicleClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationVehicleClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationVehicleName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationVehicleName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationVehicleCodedName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationVehicleCodedName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationVehicleCodedNameVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationVehicleCodedNameVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationUnitCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationMedicationSeriesNumberObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationMedicationSeriesNumberObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationMedicationStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationMedicationStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType getMedicationType() {
		return MedicationOperations.getMedicationType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderInformation> getMedicationOrderInformations() {
		return MedicationOperations.getMedicationOrderInformations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntryReactionObservationContainer getReactionObservation() {
		return MedicationOperations.getReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation getMedicationSeriesNumberObservation() {
		return MedicationOperations.getMedicationSeriesNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getMedicationStatusObservation() {
		return MedicationOperations.getMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getProductInstances() {
		return MedicationOperations.getProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getInternalReferences() {
		return MedicationOperations.getInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getPatientMedicalInstructionss() {
		return MedicationOperations.getPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication init() {
    	CDAUtil.init(this);
    	return this;
	}
} //MedicationImpl
