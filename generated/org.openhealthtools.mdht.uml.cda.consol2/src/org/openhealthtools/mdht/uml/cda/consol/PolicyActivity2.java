/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PolicyActivityTemplateId PolicyActivityCodeP PolicyActivityStatusCode PolicyActivityStatusCodeP PolicyActivityPayer PolicyActivityCoverage PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityPayerTemplateId PolicyActivityPayerPayerAssignedEntity PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageTemplateId PolicyActivityCoverageCoverageRole' templateId.root='2.16.840.1.113883.10.20.22.4.61' templateId.extension='2014-06-09' code.codeSystem='2.16.840.1.113883.3.221.5' code.codeSystemName='Source of Payment Typology (PHDSC)' constraints.validation.warning='PolicyActivityCode PolicyActivityGuarantor GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityCoverageCoverageRoleCoveragePlayingEntity' constraints.validation.dependOn.PolicyActivityCode='PolicyActivityCodeP' statusCode.code='completed' constraints.validation.dependOn.PolicyActivityStatusCode='PolicyActivityStatusCodeP' constraints.validation.query='PolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityPayerTemplateId PolicyActivityPayerPayerAssignedEntity PolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageTemplateId PolicyActivityCoverageCoverageRole' constraints.validation.dependOn.GeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime' constraints.validation.dependOn.PolicyActivityGuarantorGuarantorAssignedEntityCode='PolicyActivityGuarantorGuarantorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Payer constraints.validation.error='PolicyActivityPayerTemplateId PolicyActivityPayerPayerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.87'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2PayerPayerAssignedEntity constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom' constraints.validation.error='PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.query='PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.dependOn.GeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Guarantor constraints.validation.error='PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.88' typeCode='PRF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2GuarantorGuarantorAssignedEntity code.code='GUAR' code.codeSystem='2.16.840.1.113883.5.110' code.codeSystemName='HL7RoleClass' code.displayName='Guarantor' constraints.validation.error='PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.dependOn.PolicyActivityGuarantorGuarantorAssignedEntityCode='PolicyActivityGuarantorGuarantorAssignedEntityCodeP' constraints.validation.warning='PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.dependOn.GeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Coverage constraints.validation.error='PolicyActivityCoverageTemplateId PolicyActivityCoverageCoverageRole' templateId.root='2.16.840.1.113883.10.20.22.4.89'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CoverageCoverageRole constraints.validation.error='PolicyActivityCoverageCoverageRoleId' constraints.validation.warning='PolicyActivityCoverageCoverageRoleCoveragePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CoverageCoverageRoleCoveragePlayingEntity constraints.validation.info='PolicyActivityCoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime' constraints.validation.error='PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime'"
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
	 * @generated
	 */
	@Override
	public PolicyActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PolicyActivity2
