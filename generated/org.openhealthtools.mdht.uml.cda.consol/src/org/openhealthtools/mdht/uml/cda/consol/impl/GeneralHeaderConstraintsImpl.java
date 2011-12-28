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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Header Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsImpl extends ClinicalDocumentImpl implements GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConfidentialityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSetId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsVersionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEnterer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTarget(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSupportParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSupportParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolAuthorAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedDataEntererId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolCustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolCustodianAssignedCustodian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolLegalAuthenticatorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolLegalAuthenticatorTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolAuthenticatorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolAuthenticatorTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlace(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlace(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardian(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplace(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplace(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedInformantAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedInformantAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedInformantCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedInformantCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedInformantId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedInformantId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsParticipantSupportTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsParticipantSupportTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConsolInFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolInFulfillmentOfOrder(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints init() {
		CDAUtil.init(this);
		return this;
	}
} // GeneralHeaderConstraintsImpl
