/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PolicyActivityTemplateId PolicyActivityClassCode PolicyActivityMoodCode PolicyActivityId PolicyActivityCodeP PolicyActivityStatusCode PolicyActivityPayer PolicyActivityCoverage PolicyActivityEntryRelationship PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorTemplateId PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCodeP PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityHolderHolderRoleId PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderHolderRole PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' templateId.root='2.16.840.1.113883.10.20.22.4.61' classCode='ACT' moodCode='EVN' code.codeSystemName='' constraints.validation.warning='PolicyActivityCode PolicyActivityGuarantor PolicyActivityHolder PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTime PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityHolderHolderRoleAddr' constraints.validation.dependOn.PolicyActivityCode='PolicyActivityCodeP' statusCode.code='completed' constraints.validation.query='PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleCodeP PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageTime PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode PolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PolicyActivityHolderHolderRoleId PolicyActivityHolderHolderRoleAddr PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderTime PolicyActivityHolderHolderRole PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' constraints.validation.dependOn.PolicyActivityPayerPayerAssignedEntityCode='PolicyActivityPayerPayerAssignedEntityCodeP' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityHolderTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayer constraints.validation.error='PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PayerPolicyActivityPayerPayerAssignedEntityId' templateId.root='2.16.840.1.113883.10.20.22.4.87' typeCode='PRF' constraints.validation.query='PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PayerPayerAssignedEntityPolicyActivityPayerPayerAssignedEntityPayerOrganizationName PayerPolicyActivityPayerPayerAssignedEntityId PayerPolicyActivityPayerPayerAssignedEntityCodeP PayerPolicyActivityPayerPayerAssignedEntityCode PayerPolicyActivityPayerPayerAssignedEntityAddr PayerPolicyActivityPayerPayerAssignedEntityTelecom PayerPolicyActivityPayerPayerAssignedEntityPayerOrganization' constraints.validation.warning='PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PayerPayerAssignedEntityPolicyActivityPayerPayerAssignedEntityPayerOrganizationName PayerPolicyActivityPayerPayerAssignedEntityCodeP PayerPolicyActivityPayerPayerAssignedEntityCode PayerPolicyActivityPayerPayerAssignedEntityPayerOrganization' constraints.validation.dependOn.PayerPolicyActivityPayerPayerAssignedEntityCode='PolicyActivityPayerPayerAssignedEntityCodeP' constraints.validation.info='PayerPolicyActivityPayerPayerAssignedEntityAddr PayerPolicyActivityPayerPayerAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntity constraints.validation.error='PolicyActivityPayerPayerAssignedEntityId PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' code.codeSystem='2.16.840.1.113883.5.110' code.codeSystemName='HL7RoleClass' constraints.validation.warning='PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerPayerAssignedEntityPayerOrganization PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PayerAssignedEntityPolicyActivityPayerPayerAssignedEntityPayerOrganizationName' constraints.validation.dependOn.PolicyActivityPayerPayerAssignedEntityCode='PolicyActivityPayerPayerAssignedEntityCodeP' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom' constraints.validation.query='PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode PayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine PayerAssignedEntityPolicyActivityPayerPayerAssignedEntityPayerOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntityPayerOrganization constraints.validation.warning='PolicyActivityPayerPayerAssignedEntityPayerOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantor constraints.validation.error='PolicyActivityGuarantorTemplateId PolicyActivityGuarantorGuarantorAssignedEntity GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.88' constraints.validation.warning='PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode GuarantorPolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddr GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom' typeCode='PRF' constraints.validation.query='GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine GuarantorPolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddr GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantorGuarantorAssignedEntity constraints.validation.warning='PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' code.code='GUAR' code.codeSystem='2.16.840.1.113883.5.110' code.codeSystemName='HL7RoleClass' code.displayName='Guarantor' constraints.validation.error='PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.query='GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode GuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverage constraints.validation.error='PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageCoverageRole CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName CoveragePolicyActivityCoverageCoverageRoleId CoveragePolicyActivityCoverageCoverageRoleCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.89' constraints.validation.warning='PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTime CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode CoveragePolicyActivityCoverageCoverageRoleCode CoveragePolicyActivityCoverageCoverageRoleAddr CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity' typeCode='COV' constraints.validation.query='CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode CoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName CoveragePolicyActivityCoverageCoverageRoleId CoveragePolicyActivityCoverageCoverageRoleCode CoveragePolicyActivityCoverageCoverageRoleCodeP CoveragePolicyActivityCoverageCoverageRoleAddr CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRole constraints.validation.error='PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCodeP CoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet CoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement CoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement CoverageRoleGeneralHeaderConstraintsUSRealmAddressUse CoverageRoleGeneralHeaderConstraintsUSRealmAddressCity CoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine CoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity CoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP CoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry CoverageRoleGeneralHeaderConstraintsUSRealmAddressState CoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='CoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet CoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement CoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement CoverageRoleGeneralHeaderConstraintsUSRealmAddressUse CoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP CoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry CoverageRoleGeneralHeaderConstraintsUSRealmAddressState CoverageRoleGeneralHeaderConstraintsUSRealmAddressCity CoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode CoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine CoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRoleCoveragePlayingEntity constraints.validation.error='PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolder constraints.validation.error='PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderHolderRole HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine HolderPolicyActivityHolderHolderRoleId' templateId.root='2.16.840.1.113883.10.20.22.4.90' typeCode='HLD' constraints.validation.info='PolicyActivityHolderTime' constraints.validation.query='HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine HolderPolicyActivityHolderHolderRoleId HolderPolicyActivityHolderHolderRoleAddr' constraints.validation.warning='HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState HolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode HolderPolicyActivityHolderHolderRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolderHolderRole constraints.validation.error='PolicyActivityHolderHolderRoleId HolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet HolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement HolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement HolderRoleGeneralHeaderConstraintsUSRealmAddressUse HolderRoleGeneralHeaderConstraintsUSRealmAddressCity HolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='PolicyActivityHolderHolderRoleAddr HolderRoleGeneralHeaderConstraintsUSRealmAddressUseP HolderRoleGeneralHeaderConstraintsUSRealmAddressCountry HolderRoleGeneralHeaderConstraintsUSRealmAddressState HolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='HolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet HolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement HolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement HolderRoleGeneralHeaderConstraintsUSRealmAddressUse HolderRoleGeneralHeaderConstraintsUSRealmAddressUseP HolderRoleGeneralHeaderConstraintsUSRealmAddressCountry HolderRoleGeneralHeaderConstraintsUSRealmAddressState HolderRoleGeneralHeaderConstraintsUSRealmAddressCity HolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode HolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityEntryRelationship constraints.validation.error='PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' typeCode='REFR'"
 * @generated
 */
public interface PolicyActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.61\')'"
	 * @generated
	 */
	boolean validatePolicyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validatePolicyActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validatePolicyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.id-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validatePolicyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'12\' or value.code = \'13\' or value.code = \'14\' or value.code = \'15\' or value.code = \'16\' or value.code = \'41\' or value.code = \'42\' or value.code = \'43\' or value.code = \'47\' or value.code = \'AP\' or value.code = \'C1\' or value.code = \'CO\' or value.code = \'CP\' or value.code = \'D\' or value.code = \'DB\' or value.code = \'EP\' or value.code = \'FF\' or value.code = \'GP\' or value.code = \'HM\' or value.code = \'HN\' or value.code = \'HS\' or value.code = \'IN\' or value.code = \'IP\' or value.code = \'LC\' or value.code = \'LD\' or value.code = \'LI\' or value.code = \'LT\' or value.code = \'MA\' or value.code = \'MB\' or value.code = \'MC\' or value.code = \'MH\' or value.code = \'MI\' or value.code = \'MP\' or value.code = \'OT\' or value.code = \'PE\' or value.code = \'PL\' or value.code = \'PP\' or value.code = \'PR\' or value.code = \'PS\' or value.code = \'QM\' or value.code = \'RP\' or value.code = \'SP\' or value.code = \'TF\' or value.code = \'WC\' or value.code = \'WU\')'"
	 * @generated
	 */
	boolean validatePolicyActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityPayer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverage(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityHolder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;notEmpty()'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null).representedOrganization-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.110\' and (value.code = \'AFFL\' or value.code = \'AGNT\' or value.code = \'CIT\' or value.code = \'CRINV\' or value.code = \'CRSPNSR\' or value.code = \'SPNSR\' or value.code = \'COVPTY\' or value.code = \'EMP\' or value.code = \'GUAR\' or value.code = \'INVSBJ\' or value.code = \'PAYOR\' or value.code = \'LIC\' or value.code = \'PAT\' or value.code = \'PAYEE\' or value.code = \'POLHOLD\' or value.code = \'QUAL\' or value.code = \'STD\' or value.code = \'UNDWRT\')))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not addr-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not telecom-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity-&gt;excluding(null)-&gt;reject(representedOrganization-&gt;one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;reject(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null)-&gt;reject((performer.assignedEntity.assignedPerson-&gt;exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name-&gt;size() &gt;0) or (performer.assignedEntity.representedOrganization-&gt;exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name-&gt;size() &gt;0 ))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.110\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not addr-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not telecom-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;reject(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;reject(typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;select(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (name-&gt;size() =  1))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and (value.code = \'FAMDEP\' or value.code = \'FSTUD\' or value.code = \'HANDIC\' or value.code = \'INJ\' or value.code = \'PSTUD\' or value.code = \'SELF\' or value.code = \'SPON\' or value.code = \'STUD\')))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not addr-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV).participantRole-&gt;excluding(null)-&gt;reject(playingEntity-&gt;one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;reject(not time.oclIsUndefined() implies not time.low.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageLowTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;reject(not time.oclIsUndefined() implies not time.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageHighTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;reject(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.89\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;reject(typeCode=vocab::ParticipationType::COV)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;select(typeCode=vocab::ParticipationType::COV)-&gt;reject(participantRole-&gt;one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD).participantRole-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not addr-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;reject(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.90\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;reject(typeCode=vocab::ParticipationType::HLD)'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;select(typeCode=vocab::ParticipationType::HLD)-&gt;reject(participantRole-&gt;one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;reject(act-&gt;one(a : cda::Act | a.oclIsTypeOf(consol::AuthorizationActivity) or (a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and a.moodCode=vocab::x_DocumentActMood::DEF)))'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationshipTargetActActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;reject(act-&gt;select(a : cda::Act | a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and (a.moodCode=vocab::x_DocumentActMood::DEF))-&gt;forAll(id-&gt;size() &gt; 0 and text-&gt;size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PolicyActivity
