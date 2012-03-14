/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperativeNoteImpl extends GeneralHeaderConstraintsImpl implements OperativeNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteAnesthesiaSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteAnesthesiaSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComplicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComplicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNotePostoperativeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePostoperativeDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNotePreoperativeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePreoperativeDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureEstimatedBloodLossSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureFindingsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureFindingsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureSpecimensTakenSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureDescriptionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureDescriptionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureImplantsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureImplantsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteOperativeNoteFluidSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteOperativeNoteFluidSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteOperativeNoteSurgicalProcedureSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteOperativeNoteSurgicalProcedureSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNotePlannedProcedureSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePlannedProcedureSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureDispositionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureDispositionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteProcedureIndicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureIndicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteSurgicalDrainsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteSurgicalDrainsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventProcedureCodes(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnesthesiaSection getAnesthesiaSection() {
		return OperativeNoteOperations.getAnesthesiaSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplicationsSection getComplicationsSection() {
		return OperativeNoteOperations.getComplicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection getPostoperativeDiagnosisSection() {
		return OperativeNoteOperations.getPostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection getPreoperativeDiagnosisSection() {
		return OperativeNoteOperations.getPreoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection() {
		return OperativeNoteOperations.getProcedureEstimatedBloodLossSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFindingsSection getProcedureFindingsSection() {
		return OperativeNoteOperations.getProcedureFindingsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection() {
		return OperativeNoteOperations.getProcedureSpecimensTakenSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDescriptionSection getProcedureDescriptionSection() {
		return OperativeNoteOperations.getProcedureDescriptionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureImplantsSection getProcedureImplantsSection() {
		return OperativeNoteOperations.getProcedureImplantsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteFluidSection getOperativeNoteFluidSection() {
		return OperativeNoteOperations.getOperativeNoteFluidSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteSurgicalProcedureSection getOperativeNoteSurgicalProcedureSection() {
		return OperativeNoteOperations.getOperativeNoteSurgicalProcedureSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return OperativeNoteOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureSection getPlannedProcedureSection() {
		return OperativeNoteOperations.getPlannedProcedureSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDispositionSection getProcedureDispositionSection() {
		return OperativeNoteOperations.getProcedureDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureIndicationsSection getProcedureIndicationsSection() {
		return OperativeNoteOperations.getProcedureIndicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgicalDrainsSection getSurgicalDrainsSection() {
		return OperativeNoteOperations.getSurgicalDrainsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote init() {
		CDAUtil.init(this);
		return this;
	}
} // OperativeNoteImpl
