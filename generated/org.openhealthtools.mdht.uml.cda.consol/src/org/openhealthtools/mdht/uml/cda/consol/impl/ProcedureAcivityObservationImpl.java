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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureAcivityObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Acivity Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureAcivityObservationImpl extends ObservationImpl implements ProcedureAcivityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureAcivityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationPriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationPriorityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationMethodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationProcedureEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationProcedureEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationInstructions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationInstructions(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationIndication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAcivityObservationMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationMedicationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getProcedureEncounters() {
		return ProcedureAcivityObservationOperations.getProcedureEncounters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getInstructions() {
		return ProcedureAcivityObservationOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication> getIndications() {
		return ProcedureAcivityObservationOperations.getIndications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity getMedicationActivity() {
		return ProcedureAcivityObservationOperations.getMedicationActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureAcivityObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // ProcedureAcivityObservationImpl
