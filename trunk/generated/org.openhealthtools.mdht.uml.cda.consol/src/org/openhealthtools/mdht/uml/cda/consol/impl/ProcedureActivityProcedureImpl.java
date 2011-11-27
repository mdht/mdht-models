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

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations;

import org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityProcedureImpl extends ProcedureImpl implements ProcedureActivityProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureHasTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedurePriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePriorityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureHasInversionIndForEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureHasInversionIndForEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureApproachSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureInternalReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureInternalReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureInternalReferenceReason(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureInternalReferenceReason(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureProblemAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProblemAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureAgeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureAgeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMedicationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedurePatientInstruction(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePatientInstruction(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference getInternalReference() {
		return ProcedureActivityProcedureOperations.getInternalReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getInternalReferenceReasons() {
		return ProcedureActivityProcedureOperations.getInternalReferenceReasons(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation getProblemObservation() {
		return ProcedureActivityProcedureOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyProblemAct getProblemAct() {
		return ProcedureActivityProcedureOperations.getProblemAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return ProcedureActivityProcedureOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationActivity> getMedicationActivities() {
		return ProcedureActivityProcedureOperations.getMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getPatientInstructions() {
		return ProcedureActivityProcedureOperations.getPatientInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure init() {
		CDAUtil.init(this);
		return this;
	}
} // ProcedureActivityProcedureImpl
