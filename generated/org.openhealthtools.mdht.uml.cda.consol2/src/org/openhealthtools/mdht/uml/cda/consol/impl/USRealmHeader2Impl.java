/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2;
import org.openhealthtools.mdht.uml.cda.consol.operations.USRealmHeader2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>US Realm Header2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class USRealmHeader2Impl extends GeneralHeaderConstraintsImpl implements USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USRealmHeader2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.US_REALM_HEADER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2DocCodesOnly(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2DocCodesOnly(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeTerminology(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeTerminology(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformationRecipientIntendedRecipientId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformationRecipientIntendedRecipientId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2AuthenticatorSDTCSignatureText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2AuthenticatorSDTCSignatureText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2GeneralHeaderConstraintsInformantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsInformantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeader2GeneralHeaderConstraintsInformantRelatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsInformantRelatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsLegalAuthenticator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthenticator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsComponentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsSupportParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsSupportParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsAuthorization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthorization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDataEntererAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthorAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformantAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeader2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeader2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // USRealmHeader2Impl
