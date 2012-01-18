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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocumentOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuity Of Care Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocumentImpl extends GeneralHeaderConstraintsImpl implements ContinuityOfCareDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentAdvanceDirectivesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentAllergiesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAllergiesSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentEncountersSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentPayersSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentMedicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentPlanOfCareSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentProceduresSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentFamilyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentSocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHigh(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent3Performer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3Performer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentAuthorAssignedAuthor3(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthor3(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentMedicalEquipmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentFunctionalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentProblemSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection getAdvanceDirectivesSection() {
		return ContinuityOfCareDocumentOperations.getAdvanceDirectivesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection getAllergiesSection() {
		return ContinuityOfCareDocumentOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection() {
		return ContinuityOfCareDocumentOperations.getEncountersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection getPayersSection() {
		return ContinuityOfCareDocumentOperations.getPayersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ContinuityOfCareDocumentOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return ContinuityOfCareDocumentOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return ContinuityOfCareDocumentOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return ContinuityOfCareDocumentOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return ContinuityOfCareDocumentOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
		return ContinuityOfCareDocumentOperations.getVitalSignsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return ContinuityOfCareDocumentOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection getMedicalEquipmentSection() {
		return ContinuityOfCareDocumentOperations.getMedicalEquipmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return ContinuityOfCareDocumentOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional() {
		return ContinuityOfCareDocumentOperations.getImmunizationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return ContinuityOfCareDocumentOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityOfCareDocument init() {
		CDAUtil.init(this);
		return this;
	}
} // ContinuityOfCareDocumentImpl
