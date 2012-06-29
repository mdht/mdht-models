/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPatientCareReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsCode PatientCareReportCode PatientCareReportId PatientCareReportTitle PatientCareReportRecordTarget PatientCareReportBilling PatientCareReportEMSCurrentMedication PatientCareReportEMSAllergiesAndAdverseReactionsSection PatientCareReportEMSPastMedicalHistory PatientCareReportEMSSocialHistory PatientCareReportEMSPhysicalAssessmentSection PatientCareReportEMSProceduresPerformedSection PatientCareReportEMSPatientCareNarrative PatientCareReportEMSSceneSection' templateId.root='2.16.840.1.113883.17.3.10.1' classCode='DOCCLIN' moodCode='EVN' code.code='67796-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Patient Care Report' constraints.validation.dependOn.GeneralHeaderConstraintsCode='PatientCareReportCode' constraints.validation.info='PatientCareReportVersionNumber PatientCareReportHumanAuthor PatientCareReportComponentOf PatientCareReportSection PatientCareReportEMSCardiacArrestEvent PatientCareReportEMSMedicationsAdministeredSection' title.mixed='EMS Patient Care Report' constraints.validation.warning='PatientCareReportEMSAdvanceDirectives'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole constraints.validation.error='PatientRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientEthnicGroupCode PatientRaceCode PatientSDTCRaceCode PatientAdministrativeGenderCode PatientAdministrativeGenderCodeP' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' sDTCRaceCode.codeSystem='2.16.840.1.113883.6.238' sDTCRaceCode.codeSystemName='Race and Ethnicity - CDC' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation typeCode='AUT' constraints.validation.error='EMSAuthoringDeviceParticipationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole classCode='ASSIGNED' constraints.validation.error='EMSAuthoringDeviceRoleClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice constraints.validation.error='EMSAuthoringDeviceManufacturerModelName EMSAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole constraints.validation.error='EMSHumanAuthorRoleId EMSHumanAuthorRoleAddr EMSHumanAuthorRoleTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor constraints.validation.error='EMSHumanAuthorName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship typeCode='COMP' constraints.validation.error='EMSEncompassingEncounterRelationshipTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter constraints.validation.error='EncompassingEncounterEffectiveTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation constraints.validation.error='LocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility constraints.validation.error='HealthCareFacilityId HealthCareFacilityCode HealthCareFacilityPlace' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace constraints.validation.info='PlaceName PlaceAddr' classCode='PLC' constraints.validation.error='PlaceClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity constraints.validation.error='AssociatedEntityAddr AssociatedEntityCode AssociatedEntityCodeP AssociatedEntityAssociatedPerson AssociatedEntityOrganization' code.codeSystem='2.16.840.1.113993.17.3.5.69' code.codeSystemName='Facility Type'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson constraints.validation.error='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization constraints.validation.error='OrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSServiceEventCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation functionCode.codeSystem='2.16.840.1.113883.6.1' functionCode.codeSystemName='LOINC' constraints.validation.error='EMSPerformerParticipationFunctionCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSPerformerRoleCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship typeCode='RPLC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation typeCode='DST'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSDestinationRoleCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory code.code='67842-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS History of past illness' constraints.validation.error='EMSMedicalHistoryCode'"
 * @generated
 */
public interface PatientCareReport extends GeneralHeaderConstraints
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClinicalDocument::DOCCLIN'"
   * @generated
   */
  boolean validatePatientCareReportClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
   * @generated
   */
  boolean validatePatientCareReportMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
  boolean validatePatientCareReportCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
   * @generated
   */
  boolean validatePatientCareReportVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
   * @generated
   */
  boolean validatePatientCareReportId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Patient Care Report')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'EMS Patient Care Report\')'"
   * @generated
   */
  boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget))'"
   * @generated
   */
  boolean validatePatientCareReportRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
   * @generated
   */
  boolean validatePatientCareReportHumanAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
   * @generated
   */
  boolean validatePatientCareReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))'"
   * @generated
   */
  boolean validatePatientCareReportBilling(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))'"
   * @generated
   */
  boolean validatePatientCareReportSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSCurrentMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSCardiacArrestEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSAdvanceDirectives(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistory))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistory))'"
   * @generated
   */
  boolean validatePatientCareReportEMSPastMedicalHistory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistory))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistory))'"
   * @generated
   */
  boolean validatePatientCareReportEMSSocialHistory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSPhysicalAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSMedicationsAdministeredSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSProceduresPerformedSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrative))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrative))'"
   * @generated
   */
  boolean validatePatientCareReportEMSPatientCareNarrative(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))'"
   * @generated
   */
  boolean validatePatientCareReportEMSSceneSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))->asSequence()->any(true).oclAsType(emspcr::EMSBillingSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))->asSequence()->any(true).oclAsType(emspcr::EMSBillingSection)'"
   * @generated
   */
  EMSBillingSection getBilling();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::EMSInjuryIncidentDescriptionSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::EMSInjuryIncidentDescriptionSection)'"
   * @generated
   */
  EMSInjuryIncidentDescriptionSection getSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::EMSCurrentMedicationSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::EMSCurrentMedicationSection)'"
   * @generated
   */
  EMSCurrentMedicationSection getEMSCurrentMedication();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSCardiacArrestEventSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSCardiacArrestEventSection)'"
   * @generated
   */
  EMSCardiacArrestEventSection getEMSCardiacArrestEvent();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::EMSAdvanceDirectivesSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::EMSAdvanceDirectivesSection)'"
   * @generated
   */
  EMSAdvanceDirectivesSection getEMSAdvanceDirectives();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection)'"
   * @generated
   */
  EMSAllergiesAndAdverseReactionsSection getEMSAllergiesAndAdverseReactionsSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistory))->asSequence()->any(true).oclAsType(emspcr::EMSPastMedicalHistory)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistory))->asSequence()->any(true).oclAsType(emspcr::EMSPastMedicalHistory)'"
   * @generated
   */
  EMSPastMedicalHistory getEMSPastMedicalHistory();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistory))->asSequence()->any(true).oclAsType(emspcr::EMSSocialHistory)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistory))->asSequence()->any(true).oclAsType(emspcr::EMSSocialHistory)'"
   * @generated
   */
  EMSSocialHistory getEMSSocialHistory();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::EMSPhysicalAssessmentSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::EMSPhysicalAssessmentSection)'"
   * @generated
   */
  EMSPhysicalAssessmentSection getEMSPhysicalAssessmentSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::EMSMedicationsAdministeredSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::EMSMedicationsAdministeredSection)'"
   * @generated
   */
  EMSMedicationsAdministeredSection getEMSMedicationsAdministeredSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::EMSProceduresPerformedSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::EMSProceduresPerformedSection)'"
   * @generated
   */
  EMSProceduresPerformedSection getEMSProceduresPerformedSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrative))->asSequence()->any(true).oclAsType(emspcr::EMSPatientCareNarrative)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrative))->asSequence()->any(true).oclAsType(emspcr::EMSPatientCareNarrative)'"
   * @generated
   */
  EMSPatientCareNarrative getEMSPatientCareNarrative();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))->asSequence()->any(true).oclAsType(emspcr::EMSSceneSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))->asSequence()->any(true).oclAsType(emspcr::EMSSceneSection)'"
   * @generated
   */
  EMSSceneSection getEMSSceneSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientCareReport init();
} // PatientCareReport
