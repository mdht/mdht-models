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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiet;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryImpl extends ClinicalDocumentImpl implements DischargeSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryPersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryPersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryRolesShallHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryRolesShouldHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryOrganizationsHaveContactInfo(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTelephoneMatchesRegex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTelephoneMatchesRegex(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasTelephoneDialingDigits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryUnknownTelephoneUsesNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummarySetIdAndVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummarySetIdAndVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummarySetIdAndIdAreUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummarySetIdAndIdAreUnique(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryCopyTimeNotPresent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasRecordTargetPatientRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasPatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasProviderOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasDataEntererAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTimePreciseToSecond(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTimePreciseToSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTimePreciseToYearAndDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryMedicalSummaryProblemConcernEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryMedicalSummaryProblemConcernEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryMedicalSummaryAllergyConcernEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryMedicalSummaryAllergyConcernEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryMedicalSummaryMedications(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryMedicalSummaryMedications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryProblemListSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryProblemListSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryAdmissionMedicationHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryAdmissionMedicationHistorySection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalAdmissionDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalAdmissionDiagnosisSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryAdvanceDirectivesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryAdvanceDirectivesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryAllergiesReactionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryAllergiesReactionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryDischargeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryDischargeDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryDischargeDiet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryDischargeDiet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalDischargeMedicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeMedicationsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryDiagnosticResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryDiagnosticResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryFunctionalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryFunctionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHistoryOfPresentIllness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPresentIllness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalCourseSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalCourseSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryMedicalEquipmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryMedicalEquipmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryPhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryPhysicalExamSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHistoryOfPastIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPastIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryMedicationsAdministeredSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryMedicationsAdministeredSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection getProblemListSection() {
		return DischargeSummaryOperations.getProblemListSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedicationHistorySection getAdmissionMedicationHistorySection() {
		return DischargeSummaryOperations.getAdmissionMedicationHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
		return DischargeSummaryOperations.getHospitalAdmissionDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection getAdvanceDirectivesSection() {
		return DischargeSummaryOperations.getAdvanceDirectivesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection getAllergiesReactionsSection() {
		return DischargeSummaryOperations.getAllergiesReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection getDischargeDiagnosisSection() {
		return DischargeSummaryOperations.getDischargeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiet getDischargeDiet() {
		return DischargeSummaryOperations.getDischargeDiet(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
		return DischargeSummaryOperations.getHospitalDischargeMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticResultsSection getDiagnosticResultsSection() {
		return DischargeSummaryOperations.getDiagnosticResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return DischargeSummaryOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllness getHistoryOfPresentIllness() {
		return DischargeSummaryOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalCourseSection getHospitalCourseSection() {
		return DischargeSummaryOperations.getHospitalCourseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection getMedicalEquipmentSection() {
		return DischargeSummaryOperations.getMedicalEquipmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection getPhysicalExamSection() {
		return DischargeSummaryOperations.getPhysicalExamSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return DischargeSummaryOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return DischargeSummaryOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return DischargeSummaryOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection getMedicationsAdministeredSection() {
		return DischargeSummaryOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return DischargeSummaryOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeSummary init() {
		CDAUtil.init(this);
		return this;
	}
} // DischargeSummaryImpl
