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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProgressNoteImpl extends ClinicalDocumentImpl implements ProgressNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNotePersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNotePersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteRolesShallHaveAddrAndTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteRolesShouldHaveAddrAndTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteOrganizationsHaveContactInfo(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTelephoneMatchesRegex(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTelephoneMatchesRegex(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasTelephoneDialingDigits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteUnknownTelephoneUsesNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteSetIdAndVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteSetIdAndVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteSetIdAndIdAreUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteSetIdAndIdAreUnique(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteCopyTimeNotPresent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasRecordTargetPatientRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasPatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasAdministrativeGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasProviderOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasProviderOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasAssignedAuthorPersonOrDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasDataEntererAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAuthenticatorHasAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTimePreciseToSecond(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTimePreciseToSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTimePreciseToYearAndDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTimePreciseToYearAndDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteBothAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteBothAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasServiceEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasComponentOfElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasComponentOfElement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterFacilityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAlertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteObjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteObjectiveSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNotePhysicalExaminationSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNotePhysicalExaminationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteSubjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteSubjectiveSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSectionProcNote getAssessmentAndPlanSection() {
		return ProgressNoteOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSectionProcNote getAssessmentSection() {
		return ProgressNoteOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanSection() {
		return ProgressNoteOperations.getPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection getAlertsSection() {
		return ProgressNoteOperations.getAlertsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSectionProcNote getChiefComplaintSection() {
		return ProgressNoteOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ProgressNoteOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection getObjectiveSection() {
		return ProgressNoteOperations.getObjectiveSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection getPhysicalExaminationSection() {
		return ProgressNoteOperations.getPhysicalExaminationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection getProblemSection() {
		return ProgressNoteOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticFindings getResultsSection() {
		return ProgressNoteOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDVitalSignsSection getVitalSignsSection() {
		return ProgressNoteOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSectionIHE getReviewOfSystemsSection() {
		return ProgressNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveSection getSubjectiveSection() {
		return ProgressNoteOperations.getSubjectiveSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote init() {
		CDAUtil.init(this);
		return this;
	}
} // ProgressNoteImpl
