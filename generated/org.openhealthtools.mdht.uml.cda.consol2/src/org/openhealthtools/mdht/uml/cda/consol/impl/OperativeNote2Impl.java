/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote2;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperativeNote2Impl extends USRealmHeader2Impl implements OperativeNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2Authorization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2Authorization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AnesthesiaSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AnesthesiaSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComplicationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComplicationsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2PreoperativeDiagnosisSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2PreoperativeDiagnosisSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureEstimatedBloodLossSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureFindingsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureFindingsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureSpecimensTakenSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureDescriptionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureDescriptionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2PostoperativeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2PostoperativeDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureImplantsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureImplantsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2OperativeNoteFluidSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2OperativeNoteFluidSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2OperativeNoteSurgicalProcedureSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2OperativeNoteSurgicalProcedureSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2PlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2PlannedProcedureSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2PlannedProcedureSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureDispositionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureDispositionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ProcedureIndicationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ProcedureIndicationsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2SurgicalDrainsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2SurgicalDrainsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventProcedureCodes(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnesthesiaSection2 getAnesthesiaSection2() {
		return OperativeNote2Operations.getAnesthesiaSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplicationsSection2 getComplicationsSection2() {
		return OperativeNote2Operations.getComplicationsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection2 getPreoperativeDiagnosisSection2() {
		return OperativeNote2Operations.getPreoperativeDiagnosisSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection() {
		return OperativeNote2Operations.getProcedureEstimatedBloodLossSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFindingsSection2 getProcedureFindingsSection2() {
		return OperativeNote2Operations.getProcedureFindingsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection() {
		return OperativeNote2Operations.getProcedureSpecimensTakenSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDescriptionSection getProcedureDescriptionSection() {
		return OperativeNote2Operations.getProcedureDescriptionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection getPostoperativeDiagnosisSection() {
		return OperativeNote2Operations.getPostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureImplantsSection getProcedureImplantsSection() {
		return OperativeNote2Operations.getProcedureImplantsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteFluidSection getOperativeNoteFluidSection() {
		return OperativeNote2Operations.getOperativeNoteFluidSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteSurgicalProcedureSection getOperativeNoteSurgicalProcedureSection() {
		return OperativeNote2Operations.getOperativeNoteSurgicalProcedureSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return OperativeNote2Operations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureSection2 getPlannedProcedureSection2() {
		return OperativeNote2Operations.getPlannedProcedureSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDispositionSection getProcedureDispositionSection() {
		return OperativeNote2Operations.getProcedureDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureIndicationsSection2 getProcedureIndicationsSection2() {
		return OperativeNote2Operations.getProcedureIndicationsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgicalDrainsSection getSurgicalDrainsSection() {
		return OperativeNote2Operations.getSurgicalDrainsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // OperativeNote2Impl
