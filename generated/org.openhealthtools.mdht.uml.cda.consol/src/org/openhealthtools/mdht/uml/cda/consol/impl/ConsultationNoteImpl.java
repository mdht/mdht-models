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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNoteOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsultationNoteImpl extends ClinicalDocumentImpl implements ConsultationNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONSULTATION_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNotePersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteRolesShallHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteRolesShouldHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteOrganizationsHaveContactInfo(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTelephoneMatchesRegex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTelephoneMatchesRegex(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasTelephoneDialingDigits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteUnknownTelephoneUsesNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteSetIdAndVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteSetIdAndVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteSetIdAndIdAreUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteSetIdAndIdAreUnique(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteCopyTimeNotPresent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasRecordTargetPatientRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasPatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasProviderOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasDataEntererAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTimePreciseToSecond(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTimePreciseToSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTimePreciseToYearAndDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteReferralOrVisit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReferralOrVisit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteHistoryOfPresentIllness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHistoryOfPresentIllness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNotePhysicalExamination(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePhysicalExamination(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteProceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNotePastMedicalHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePastMedicalHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteAlertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteGeneralStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteGeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteDiagnosticFindings(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteDiagnosticFindings(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEHistoryOfPresentIllness getHistoryOfPresentIllness() {
		return ConsultationNoteOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection getPhysicalExamination() {
		return ConsultationNoteOperations.getPhysicalExamination(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection getProblemSection() {
		return ConsultationNoteOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection getProceduresSection() {
		return ConsultationNoteOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastMedicalHistorySectionConsult getPastMedicalHistorySection() {
		return ConsultationNoteOperations.getPastMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return ConsultationNoteOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ConsultationNoteOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection getAlertsSection() {
		return ConsultationNoteOperations.getAlertsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return ConsultationNoteOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return ConsultationNoteOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ConsultationNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return ConsultationNoteOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return ConsultationNoteOperations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticFindings getDiagnosticFindings() {
		return ConsultationNoteOperations.getDiagnosticFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationNote init() {
		CDAUtil.init(this);
		return this;
	}
} // ConsultationNoteImpl
