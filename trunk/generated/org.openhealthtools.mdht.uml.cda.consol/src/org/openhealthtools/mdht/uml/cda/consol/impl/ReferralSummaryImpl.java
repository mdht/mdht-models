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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReferralSummary;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReferralSummaryOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferralSummaryImpl extends ClinicalDocumentImpl implements ReferralSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REFERRAL_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryPersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryPersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryRolesShallHaveAddrAndTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryRolesShouldHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryOrganizationsHaveContactInfo(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTelephoneMatchesRegex(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTelephoneMatchesRegex(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasTelephoneDialingDigits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryUnknownTelephoneUsesNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummarySetIdAndVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummarySetIdAndVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummarySetIdAndIdAreUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummarySetIdAndIdAreUnique(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryCopyTimeNotPresent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasRecordTargetPatientRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasPatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasAdministrativeGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasProviderOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasDataEntererAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTimePreciseToSecond(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTimePreciseToSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTimePreciseToYearAndDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryMedicalSummaryProblemConcernEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryMedicalSummaryProblemConcernEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryMedicalSummaryAllergyConcernEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryMedicalSummaryAllergyConcernEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryMedicalSummaryMedications(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryMedicalSummaryMedications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralSummaryLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralSummaryOperations.validateReferralSummaryLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralSummary init() {
		CDAUtil.init(this);
		return this;
	}
} // ReferralSummaryImpl
