/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocument2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuity Of Care Document2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContinuityOfCareDocument2Impl extends USRealmHeader2Impl implements ContinuityOfCareDocument2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocument2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2Author(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Author(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AllergiesSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AllergiesSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2MedicationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2MedicationsSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ProblemSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ProblemSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ProceduresSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ProceduresSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ResultsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ResultsSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2FunctionalStatusSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2FunctionalStatusSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ImmunizationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ImmunizationsSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2MedicalEquipmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2MedicalEquipmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2PayersSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2PayersSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2PlanOfTreatmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2SocialHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2SocialHistorySection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2VitalSignsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2VitalSignsSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2MentalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2MentalStatusSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2NutritionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2NutritionSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2FamilyHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2FamilyHistorySection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEvent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection2 getAllergiesSection2() {
		return ContinuityOfCareDocument2Operations.getAllergiesSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection2 getMedicationsSection2() {
		return ContinuityOfCareDocument2Operations.getMedicationsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection2 getProblemSection2() {
		return ContinuityOfCareDocument2Operations.getProblemSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection2 getProceduresSection2() {
		return ContinuityOfCareDocument2Operations.getProceduresSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection2 getResultsSection2() {
		return ContinuityOfCareDocument2Operations.getResultsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2() {
		return ContinuityOfCareDocument2Operations.getAdvanceDirectivesSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional2 getEncountersSectionEntriesOptional2() {
		return ContinuityOfCareDocument2Operations.getEncountersSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection2 getFunctionalStatusSection2() {
		return ContinuityOfCareDocument2Operations.getFunctionalStatusSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection2 getImmunizationsSection2() {
		return ContinuityOfCareDocument2Operations.getImmunizationsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection2 getMedicalEquipmentSection2() {
		return ContinuityOfCareDocument2Operations.getMedicalEquipmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection2 getPayersSection2() {
		return ContinuityOfCareDocument2Operations.getPayersSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return ContinuityOfCareDocument2Operations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection2 getSocialHistorySection2() {
		return ContinuityOfCareDocument2Operations.getSocialHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection2 getVitalSignsSection2() {
		return ContinuityOfCareDocument2Operations.getVitalSignsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusSection getMentalStatusSection() {
		return ContinuityOfCareDocument2Operations.getMentalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionSection getNutritionSection() {
		return ContinuityOfCareDocument2Operations.getNutritionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection2 getFamilyHistorySection2() {
		return ContinuityOfCareDocument2Operations.getFamilyHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityOfCareDocument2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityOfCareDocument2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ContinuityOfCareDocument2Impl
