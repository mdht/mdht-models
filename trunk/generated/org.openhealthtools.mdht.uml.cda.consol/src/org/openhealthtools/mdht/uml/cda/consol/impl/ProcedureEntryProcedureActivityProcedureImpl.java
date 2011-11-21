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
import org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.consol.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureEntryProcedureActivityProcedureOperations;

import org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Entry Procedure Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryProcedureActivityProcedureImpl extends ProcedureImpl implements ProcedureEntryProcedureActivityProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureEntryProcedureActivityProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedurePriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedurePriorityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureInternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureProblemAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureProblemAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureMedicationActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedurePatientInstruction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedurePatientInstruction(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference getInternalReference() {
		return ProcedureEntryProcedureActivityProcedureOperations.getInternalReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getInternalReferenceReasons() {
		return ProcedureEntryProcedureActivityProcedureOperations.getInternalReferenceReasons(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance getProblemObservation() {
		return ProcedureEntryProcedureActivityProcedureOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyDrugSensitivity getProblemAct() {
		return ProcedureEntryProcedureActivityProcedureOperations.getProblemAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return ProcedureEntryProcedureActivityProcedureOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Immunization> getMedicationActivities() {
		return ProcedureEntryProcedureActivityProcedureOperations.getMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getPatientInstructions() {
		return ProcedureEntryProcedureActivityProcedureOperations.getPatientInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEntryProcedureActivityProcedure init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ProcedureEntryProcedureActivityProcedureImpl
