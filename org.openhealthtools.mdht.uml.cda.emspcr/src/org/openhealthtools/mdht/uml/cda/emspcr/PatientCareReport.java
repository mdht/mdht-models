/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPatientCareReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.17.3.10.1' code.displayName='EMS Patient Care Report' constraints.validation.error='PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsCode PatientCareReportCode PatientCareReportId PatientCareReportTitle' code.codeSystemName='LOINC' classCode='DOCCLIN' constraints.validation.warning='PatientCareReportAdvanceDirectivesSectionEntriesOptional PatientCareReportAllergiesSectionEntriesOptional' code.code='67796-3' constraints.validation.info='PatientCareReportVersionNumber PatientCareReportHumanAuthor PatientCareReportComponentOf' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole constraints.validation.error='PatientRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient constraints.validation.error='PatientAdministrativeGenderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation constraints.validation.error='EMSAuthoringDeviceParticipationTypeCode' typeCode='AUT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole constraints.validation.error='EMSAuthoringDeviceRoleClassCode' classCode='ASSIGNED'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice constraints.validation.error='EMSAuthoringDeviceManufacturerModelName EMSAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole constraints.validation.error='EMSHumanAuthorRoleId EMSHumanAuthorRoleAddr EMSHumanAuthorRoleTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor constraints.validation.error='EMSHumanAuthorName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship constraints.validation.error='EMSEncompassingEncounterRelationshipTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter constraints.validation.error='EncompassingEncounterEffectiveTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation constraints.validation.error='LocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility constraints.validation.error='HealthCareFacilityId HealthCareFacilityPlace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace constraints.validation.error='PlaceClassCode' classCode='PLC' constraints.validation.info='PlaceName PlaceAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity code.codeSystem='2.16.840.1.113993.17.3.5.69' constraints.validation.error='AssociatedEntityAddr AssociatedEntityCode AssociatedEntityCodeP AssociatedEntityAssociatedPerson AssociatedEntityOrganization' code.codeSystemName='Facility Type'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson constraints.validation.error='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization constraints.validation.error='OrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship typeCode='RPLC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation typeCode='DST'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS History of past illness' constraints.validation.error='EMSMedicalHistoryCode' code.codeSystemName='LOINC' code.code='67842-5'"
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
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
   * @generated
   */
  boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))'"
   * @generated
   */
  boolean validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))'"
   * @generated
   */
  boolean validatePatientCareReportAllergiesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)'"
   * @generated
   */
  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)'"
   * @generated
   */
  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBilling))->asSequence()->first().oclAsType(emspcr::EMSBilling)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBilling))->asSequence()->first().oclAsType(emspcr::EMSBilling)'"
   * @generated
   */
  EMSBilling getBilling();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescription))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescription)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescription))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescription)'"
   * @generated
   */
  EMSInjuryIncidentDescription getSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientCareReport init();
} // PatientCareReport
