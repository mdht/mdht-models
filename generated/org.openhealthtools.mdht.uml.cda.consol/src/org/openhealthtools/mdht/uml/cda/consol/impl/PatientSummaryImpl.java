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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PatientSummary;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.PurposeSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PatientSummaryOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientSummaryImpl extends ClinicalDocumentImpl implements PatientSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryServiceEventRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryServiceEventRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryServiceEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryLanguageCodeFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryLanguageCodeFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryNoTemplateIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryNoTemplateIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasEffectiveTimeSeconds(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasEffectiveTimeSeconds(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasEffectiveTimeZone(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasEffectiveTimeZone(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryOneOrTwoRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryOneOrTwoRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasAssignedAuthorNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasAssignedAuthorNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryPersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryPersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryRolesShallHaveAddrAndTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryRolesShouldHaveAddrAndTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryOrganizationsHaveContactInfo(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTelephoneMatchesRegex(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTelephoneMatchesRegex(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasTelephoneDialingDigits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryUnknownTelephoneUsesNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummarySetIdAndVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummarySetIdAndVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummarySetIdAndIdAreUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummarySetIdAndIdAreUnique(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryCopyTimeNotPresent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasRecordTargetPatientRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasPatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasAdministrativeGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasProviderOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasDataEntererAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryAuthenticatorHasAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTimePreciseToSecond(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTimePreciseToSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTimePreciseToYearAndDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryHealthcareProvider(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryHealthcareProvider(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryAdvanceDirectivesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryAdvanceDirectivesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryAllergiesReactionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryAllergiesReactionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryProblemListSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryProblemListSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryEncountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryPayersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryPregnancyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryPregnancyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummarySurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummarySurgeriesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryDiagnosticResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryDiagnosticResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummarySocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummarySocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryMedicalEquipmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryMedicalEquipmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryFunctionalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryFunctionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryPurposeSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryPurposeSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection getAdvanceDirectivesSection() {
		return PatientSummaryOperations.getAdvanceDirectivesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection getAllergiesReactionsSection() {
		return PatientSummaryOperations.getAllergiesReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection getProblemListSection() {
		return PatientSummaryOperations.getProblemListSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection() {
		return PatientSummaryOperations.getEncountersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return PatientSummaryOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection getPayersSection() {
		return PatientSummaryOperations.getPayersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return PatientSummaryOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return PatientSummaryOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyHistorySection getPregnancyHistorySection() {
		return PatientSummaryOperations.getPregnancyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection getSurgeriesSection() {
		return PatientSummaryOperations.getSurgeriesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return PatientSummaryOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticResultsSection getDiagnosticResultsSection() {
		return PatientSummaryOperations.getDiagnosticResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return PatientSummaryOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return PatientSummaryOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return PatientSummaryOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection getMedicalEquipmentSection() {
		return PatientSummaryOperations.getMedicalEquipmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return PatientSummaryOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeSection getPurposeSection() {
		return PatientSummaryOperations.getPurposeSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientSummary init() {
		CDAUtil.init(this);
		return this;
	}
} // PatientSummaryImpl
