/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laborand Delivery Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getLaborandDeliveryInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Labor and Delivery InformationTemplateId Labor and Delivery InformationClassCode Labor and Delivery InformationCode Labor and Delivery InformationMoodCode Labor and Delivery InformationParticipant Labor and Delivery InformationPerformer Labor and Delivery InformationAttendantParticipation Labor and Delivery InformationTransferAssociation Labor and Delivery InformationMaternal Morbidities Labor and Delivery InformationCharacteristics of Labor and Delivery Labor and Delivery InformationLabor Onsets Labor and Delivery InformationObstetric Procedures Labor and Delivery InformationAttempted Forceps Delivery Labor and Delivery InformationAttempted Vacuum Extraction Labor and Delivery InformationFetal Presentation Labor and Delivery InformationRoute and Method of Delivery' templateId.root='2.16.840.1.113883.10.20.26.22' classCode='ACT' moodCode='EVN' constraints.validation.warning='Labor and Delivery InformationHomeBirthPlanAssociation Labor and Delivery InformationEntryRelationship Labor and Delivery InformationBody Weight at Delivery' constraints.validation.info='Labor and Delivery InformationHysterotomyHysterectomyAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocation typeCode='LOC' constraints.validation.error='participatingLocationTypeCode participatingLocationParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRole constraints.validation.info='LocationRoleAddr' classCode='ROL' constraints.validation.error='LocationRoleClassCode LocationRoleCode' constraints.validation.warning='LocationRoleId LocationRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocation constraints.validation.info='LocationDesc' constraints.validation.warning='LocationName' classCode='PLC' constraints.validation.error='LocationClassCode LocationDeterminerCode' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipation typeCode='PRF' constraints.validation.error='attendantParticipationTypeCode attendantParticipationAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRole classCode='ASSIGNED' constraints.validation.error='attendantRoleClassCode attendantRoleId attendantRoleCode attendantRoleAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendant classCode='PSN' constraints.validation.error='AttendantClassCode AttendantDeterminerCode AttendantName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationcertifierParticipation typeCode='PRF' constraints.validation.error='certifierParticipationTypeCode certifierParticipationAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransfer classCode='OBS' constraints.validation.error='maternalTransferClassCode maternalTransferCode maternalTransferMoodCode maternalTransferValue' moodCode='EVN' constraints.validation.info='maternalTransferParticipant'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacility typeCode='ORG' constraints.validation.error='TransferFacilityTypeCode TransferFacilityParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRole classCode='PROV' constraints.validation.error='TransferFacilityRoleClassCode TransferFacilityRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleFacility classCode='ENT' constraints.validation.error='FacilityClassCode FacilityDeterminerCode FacilityName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociation typeCode='COMP' constraints.validation.error='homeBirthPlanAssociationTypeCode homeBirthPlanAssociationHomeBirthPlan'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociationhomeBirthPlan classCode='OBS' constraints.validation.error='homeBirthPlanClassCode homeBirthPlanCode homeBirthPlanMoodCode homeBirthPlanValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociation typeCode='COMP' constraints.validation.error='paymentSourceAssociationTypeCode paymentSourceAssociationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSource classCode='OBS' constraints.validation.error='paymentSourceClassCode paymentSourceCode paymentSourceMoodCode paymentSourceValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociation typeCode='COMP' constraints.validation.error='hysterotomyHysterectomyAssociationTypeCode hysterotomyHysterectomyAssociationHysterotomyHysterectomy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationhysterotomyHysterectomy classCode='OBS' constraints.validation.error='hysterotomyHysterectomyClassCode hysterotomyHysterectomyCode hysterotomyHysterectomyMoodCode hysterotomyHysterectomyValue' moodCode='EVN'"
 * @generated
 */
public interface LaborandDeliveryInformation extends Act
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.22')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.22\')'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateLaborandDeliveryInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentActMood::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(vsbr::Labor and Delivery Information::attendantParticipation))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(vsbr::Labor and Delivery Information::attendantParticipation))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationAttendantParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationHomeBirthPlanAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationTransferAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidities) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidities) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationMaternalMorbidities(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Labor Onsets) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Labor Onsets) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationLaborOnsets(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Obstetric Procedures) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Obstetric Procedures) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationObstetricProcedures(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Forceps Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Forceps Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationAttemptedForcepsDelivery(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationAttemptedVacuumExtraction(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Fetal Presentation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Fetal Presentation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationFetalPresentation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Route and Method of Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Route and Method of Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationRouteandMethodofDelivery(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Body Weight at Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Body Weight at Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationBodyWeightatDelivery(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidities)).oclAsType(vsbr::Maternal Morbidities)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidities)).oclAsType(vsbr::Maternal Morbidities)'"
   * @generated
   */
  EList<MaternalMorbidities> getMaternalMorbiditiess();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery)).oclAsType(vsbr::Characteristics of Labor and Delivery)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery)).oclAsType(vsbr::Characteristics of Labor and Delivery)'"
   * @generated
   */
  EList<CharacteristicsofLaborandDelivery> getCharacteristicsofLaborandDeliveries();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Labor Onsets)).oclAsType(vsbr::Labor Onsets)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Labor Onsets)).oclAsType(vsbr::Labor Onsets)'"
   * @generated
   */
  EList<LaborOnsets> getLaborOnsetss();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Obstetric Procedures)).oclAsType(vsbr::Obstetric Procedures)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Obstetric Procedures)).oclAsType(vsbr::Obstetric Procedures)'"
   * @generated
   */
  EList<ObstetricProcedures> getObstetricProceduress();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Forceps Delivery))->asSequence()->any(true).oclAsType(vsbr::Attempted Forceps Delivery)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Forceps Delivery))->asSequence()->any(true).oclAsType(vsbr::Attempted Forceps Delivery)'"
   * @generated
   */
  AttemptedForcepsDelivery getAttemptedForcepsDelivery();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction))->asSequence()->any(true).oclAsType(vsbr::Attempted Vacuum Extraction)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction))->asSequence()->any(true).oclAsType(vsbr::Attempted Vacuum Extraction)'"
   * @generated
   */
  AttemptedVacuumExtraction getAttemptedVacuumExtraction();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Fetal Presentation))->asSequence()->any(true).oclAsType(vsbr::Fetal Presentation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Fetal Presentation))->asSequence()->any(true).oclAsType(vsbr::Fetal Presentation)'"
   * @generated
   */
  FetalPresentation getFetalPresentation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Route and Method of Delivery))->asSequence()->any(true).oclAsType(vsbr::Route and Method of Delivery)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Route and Method of Delivery))->asSequence()->any(true).oclAsType(vsbr::Route and Method of Delivery)'"
   * @generated
   */
  RouteandMethodofDelivery getRouteandMethodofDelivery();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Body Weight at Delivery))->asSequence()->any(true).oclAsType(vsbr::Body Weight at Delivery)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Body Weight at Delivery))->asSequence()->any(true).oclAsType(vsbr::Body Weight at Delivery)'"
   * @generated
   */
  BodyWeightatDelivery getBodyWeightatDelivery();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliveryInformation init();
} // LaborandDeliveryInformation
