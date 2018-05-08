/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PolicyActivityTemplateId PolicyActivityCodeP PolicyActivityStatusCode PolicyActivityStatusCodeP PolicyActivityPayer PolicyActivityCoverage PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityPayerTemplateId PolicyActivityPayerPayerAssignedEntity PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageTemplateId PolicyActivityCoverageCoverageRole PolicyActivity2CDTranslationP' templateId.root='2.16.840.1.113883.10.20.22.4.61' templateId.extension='2015-08-01' code.codeSystemName='' constraints.validation.warning='PolicyActivityCode PolicyActivityGuarantor PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivity2CDTranslation' constraints.validation.dependOn.PolicyActivityCode='PolicyActivityCodeP' constraints.validation.dependOn.PolicyActivityStatusCode='PolicyActivityStatusCodeP' constraints.validation.query='PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityPayerTemplateId PolicyActivityPayerPayerAssignedEntity PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageTemplateId PolicyActivityCoverageCoverageRole PolicyActivity2CDTranslation PolicyActivity2CDTranslationP' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime' constraints.validation.dependOn.PolicyActivityGuarantorGuarantorAssignedEntityCode='PolicyActivityGuarantorGuarantorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Payer constraints.validation.error='PolicyActivityPayerTemplateId PolicyActivityPayerPayerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.87'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2PayerPayerAssignedEntity constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom' constraints.validation.error='PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.query='PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Guarantor constraints.validation.error='PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.88' typeCode='PRF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2GuarantorGuarantorAssignedEntity constraints.validation.error='PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.dependOn.PolicyActivityGuarantorGuarantorAssignedEntityCode='PolicyActivityGuarantorGuarantorAssignedEntityCodeP' constraints.validation.warning='PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Coverage constraints.validation.error='PolicyActivityCoverageTemplateId PolicyActivityCoverageCoverageRole' templateId.root='2.16.840.1.113883.10.20.22.4.89'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CoverageCoverageRole constraints.validation.error='PolicyActivityCoverageCoverageRoleId' constraints.validation.warning='PolicyActivityCoverageCoverageRoleCoveragePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CoverageCoverageRoleCoveragePlayingEntity constraints.validation.info='PolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime' constraints.validation.error='PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CD translation.codeSystem='2.16.840.1.113883.3.221.5' translation.codeSystemName='Source of Payment Typology (PHDSC)' constraints.validation.warning='PolicyActivity2CDTranslation' constraints.validation.error='PolicyActivity2CDTranslationP'"
 * @generated
 */
public interface PolicyActivity2 extends PolicyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = \'US\') implies state->size() >= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode->size() >= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (( not use->isEmpty())  )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (( not country->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (( not state->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() =  1) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (( not postalCode->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = \'US\') implies state->size() >= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode->size() >= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (( not use->isEmpty())  )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (( not country->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (( not state->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() =  1) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (( not postalCode->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((sDTCBirthTime.oclIsUndefined() or sDTCBirthTime.isNullFlavorUndefined()) implies (not sDTCBirthTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty() and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.3.221.5\' and not value.code.oclIsUndefined())) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (( not translation->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivity2CDTranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PolicyActivity2
