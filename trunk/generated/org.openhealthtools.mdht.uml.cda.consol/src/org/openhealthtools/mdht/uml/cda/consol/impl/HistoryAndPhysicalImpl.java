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
import org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalImpl extends ClinicalDocumentImpl implements HistoryAndPhysical {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_AND_PHYSICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalPersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalOrganizationsHaveContactInfo(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTelephoneMatchesRegex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTelephoneMatchesRegex(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasTelephoneDialingDigits(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalSetIdAndVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalSetIdAndVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalSetIdAndIdAreUnique(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalSetIdAndIdAreUnique(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalCopyTimeNotPresent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasPatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasProviderOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasDataEntererAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTimePreciseToSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTimePreciseToSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTimePreciseToYearAndDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalBothAssessmentAndPlan(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHistoryOfPresentIllness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHistoryOfPresentIllness(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalPastMedicalHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPastMedicalHistorySection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAlertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalSocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalFamilyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalPhysicalExaminationSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPhysicalExaminationSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalGeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalGeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalDiagnosticFindings(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalDiagnosticFindings(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalProceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalImmunizationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEHistoryOfPresentIllness getHistoryOfPresentIllness() {
		return HistoryAndPhysicalOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection getPastMedicalHistorySection() {
		return HistoryAndPhysicalOperations.getPastMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return HistoryAndPhysicalOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection getAlertsSection() {
		return HistoryAndPhysicalOperations.getAlertsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return HistoryAndPhysicalOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return HistoryAndPhysicalOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSectionIHE getReviewOfSystemsSection() {
		return HistoryAndPhysicalOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection getPhysicalExaminationSection() {
		return HistoryAndPhysicalOperations.getPhysicalExaminationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDVitalSignsSection getVitalSignsSection() {
		return HistoryAndPhysicalOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return HistoryAndPhysicalOperations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticFindings getDiagnosticFindings() {
		return HistoryAndPhysicalOperations.getDiagnosticFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection getProblemSection() {
		return HistoryAndPhysicalOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection getProceduresSection() {
		return HistoryAndPhysicalOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return HistoryAndPhysicalOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysical init() {
		CDAUtil.init(this);
		return this;
	}
} // HistoryAndPhysicalImpl
