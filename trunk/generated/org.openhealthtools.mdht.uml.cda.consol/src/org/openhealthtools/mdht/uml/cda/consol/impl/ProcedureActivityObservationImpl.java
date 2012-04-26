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
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityObservationImpl extends ObservationImpl implements ProcedureActivityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationCodeCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeCodeSystems(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationCodeOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationOriginalTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationEncounterInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationEncounterInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationServiceDeliveryLocationTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationInstructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructionsInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationPriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationPriorityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationServiceDeliveryLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationProcedureEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationInstructions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservationOperations.validateProcedureActivityObservationMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryLocation> getServiceDeliveryLocations() {
		return ProcedureActivityObservationOperations.getServiceDeliveryLocations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getProcedureEncounters() {
		return ProcedureActivityObservationOperations.getProcedureEncounters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getInstructions() {
		return ProcedureActivityObservationOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication> getIndications() {
		return ProcedureActivityObservationOperations.getIndications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity getMedicationActivity() {
		return ProcedureActivityObservationOperations.getMedicationActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ProcedureActivityObservationImpl
