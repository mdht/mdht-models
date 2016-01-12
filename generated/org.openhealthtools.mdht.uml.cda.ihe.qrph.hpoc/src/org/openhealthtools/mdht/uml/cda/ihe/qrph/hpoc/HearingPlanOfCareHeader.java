/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.lang.Iterable;


import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Plan Of Care Header</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingPlanOfCareHeader()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HearingPlanOfCareHeaderTemplateId HearingPlanOfCareHeaderRecordTarget HearingPlanOfCareHeaderCustodian HearingPlanOfCareHeaderAuthor' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.2.1' constraints.validation.info='HearingPlanOfCareHeaderComponentOf HearingPlanOfCareHeaderDocumentationOf'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOf constraints.validation.error='HearingPlanOfCareHeaderComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounter code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.error='HearingPlanOfCareHeaderComponentOfEncompassingEncounterCode HearingPlanOfCareHeaderComponentOfEncompassingEncounterId HearingPlanOfCareHeaderComponentOfEncompassingEncounterEffectiveTime HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocation constraints.validation.error='HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacility constraints.validation.error='HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacilityLocation HearingPlanOfCareHeaderComponentOfEncompassingEncounterLocationHealthCareFacilityServiceProviderOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOf constraints.validation.error='HearingPlanOfCareHeaderDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEvent code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.error='HearingPlanOfCareHeaderDocumentationOfServiceEventCode HearingPlanOfCareHeaderDocumentationOfServiceEventCodeP HearingPlanOfCareHeaderDocumentationOfServiceEventEffectiveTime' constraints.validation.warning='HearingPlanOfCareHeaderDocumentationOfServiceEventPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformer constraints.validation.error='HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCode HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCodeP HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerFunctionCode HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerFunctionCodeP HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntity' constraints.validation.dependOn.HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCode='HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerTypeCodeP' functionCode.codeSystem='2.16.840.1.113883.5.88' functionCode.codeSystemName='ParticipationFunction'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntity constraints.validation.error='HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityId HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCode' code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCode='HearingPlanOfCareHeaderDocumentationOfServiceEventPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTarget constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRole constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRoleAddr HearingPlanOfCareHeaderRecordTargetPatientRoleId HearingPlanOfCareHeaderRecordTargetPatientRoleTelecom HearingPlanOfCareHeaderRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatient constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRolePatientName HearingPlanOfCareHeaderRecordTargetPatientRolePatientAdministrativeGenderCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthTime HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCode' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode' maritalStatusCode.codeSystem='2.16.840.1.113883.5.2' maritalStatusCode.codeSystemName='MaritalStatus' constraints.validation.warning='HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardian HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunication' constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCode='HearingPlanOfCareHeaderRecordTargetPatientRolePatientMaritalStatusCodeP' religiousAffiliationCode.codeSystem='2.16.840.1.113883.5.1076' religiousAffiliationCode.codeSystemName='ReligiousAffiliation' constraints.validation.info='HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplace' constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCode='HearingPlanOfCareHeaderRecordTargetPatientRolePatientReligiousAffiliationCodeP' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCode='HearingPlanOfCareHeaderRecordTargetPatientRolePatientRaceCodeP' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCode='HearingPlanOfCareHeaderRecordTargetPatientRolePatientEthnicGroupCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardian constraints.validation.warning='HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianAddr HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPerson constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRolePatientGuardianPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplace constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlace constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRolePatientBirthplacePlaceAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationLanguageCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCode HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode' modeCode.codeSystem='2.16.840.1.113883.5.60' modeCode.codeSystemName='LanguageAbilityMode' constraints.validation.info='HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCodeP HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd' constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCode='HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationModeCodeP' proficiencyLevelCode.codeSystem='2.16.840.1.113883.5.61' proficiencyLevelCode.codeSystemName='LanguageAbilityProficiency' constraints.validation.warning='HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP' constraints.validation.dependOn.HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode='HearingPlanOfCareHeaderRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthor constraints.validation.error='HearingPlanOfCareHeaderAuthorTime HearingPlanOfCareHeaderAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthor constraints.validation.error='HearingPlanOfCareHeaderAuthorAssignedAuthorAddr HearingPlanOfCareHeaderAuthorAssignedAuthorCode HearingPlanOfCareHeaderAuthorAssignedAuthorId HearingPlanOfCareHeaderAuthorAssignedAuthorTelecom' code.codeSystem='2.16.840.1.113883.5.53' code.codeSystemName='Healthcare Provider Taxonomy (HIPAA)' constraints.validation.warning='HearingPlanOfCareHeaderAuthorAssignedAuthorCodeP HearingPlanOfCareHeaderAuthorAssignedAuthorAssignedAuthoringDevice HearingPlanOfCareHeaderAuthorAssignedAuthorAssignedPerson' constraints.validation.dependOn.HearingPlanOfCareHeaderAuthorAssignedAuthorCode='HearingPlanOfCareHeaderAuthorAssignedAuthorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorPerson constraints.validation.error='HearingPlanOfCareHeaderAuthorAssignedAuthorPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDevice constraints.validation.error='HearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName HearingPlanOfCareHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodian constraints.validation.error='HearingPlanOfCareHeaderCustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodian constraints.validation.error='HearingPlanOfCareHeaderCustodianAssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganization constraints.validation.error='HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationAddr HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationId HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationName HearingPlanOfCareHeaderCustodianAssignedCustodianCustodianOrganizationTelecom'"
 * @generated
 */
public interface HearingPlanOfCareHeader extends ClinicalDocument
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.7.3.1.1.26.2.2.1\')'"
   * @generated
   */
  boolean validateHearingPlanOfCareHeaderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
   * @generated
   */
  boolean validateHearingPlanOfCareHeaderRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
   * @generated
   */
  boolean validateHearingPlanOfCareHeaderCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
   * @generated
   */
  boolean validateHearingPlanOfCareHeaderComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
   * @generated
   */
  boolean validateHearingPlanOfCareHeaderDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
   * @generated
   */
  boolean validateHearingPlanOfCareHeaderAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareHeader init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareHeader init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingPlanOfCareHeader
