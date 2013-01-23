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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laborand Delivery Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getLaborandDeliveryInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Labor and Delivery InformationTemplateId Labor and Delivery InformationClassCode Labor and Delivery InformationCode Labor and Delivery InformationMoodCode Labor and Delivery InformationAttendantParticipation Labor and Delivery InformationEntryRelationship Labor and Delivery InformationMaternalTransfer Labor and Delivery InformationParticipatingLocation Labor and Delivery InformationMaternal Morbidities Labor and Delivery InformationRisk Factors' templateId.root='2.16.840.1.113883.10.20.26.31' classCode='ACT' moodCode='EVN' constraints.validation.info='Labor and Delivery InformationCharacteristics of Labor and Delivery Labor and Delivery InformationHomeBirthPlan'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipation typeCode='PRF' constraints.validation.error='attendantParticipationTypeCode attendantParticipationAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRole classCode='ASSIGNED' constraints.validation.error='attendantRoleClassCode attendantRoleId attendantRoleCode attendantRoleAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendant classCode='PSN' constraints.validation.error='AttendantClassCode AttendantDeterminerCode AttendantName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociation typeCode='COMP' constraints.validation.error='paymentSourceAssociationTypeCode paymentSourceAssociationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSource classCode='OBS' constraints.validation.error='paymentSourceClassCode paymentSourceCode paymentSourceMoodCode paymentSourceValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocation typeCode='LOC' constraints.validation.error='participatingLocationTypeCode participatingLocationParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRole classCode='BIRTHPL' constraints.validation.error='LocationRoleClassCode LocationRoleCode' constraints.validation.warning='LocationRoleId LocationRolePlayingEntity' constraints.validation.info='LocationRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocation constraints.validation.info='LocationDesc' constraints.validation.warning='LocationName' classCode='PLC' constraints.validation.error='LocationClassCode LocationDeterminerCode' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationCertifierParticipation constraints.validation.error='CertifierParticipationTime CertifierParticipationTypeCode' typeCode='RESP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationCertifierParticipationcertifierRole classCode='ASSIGNED' constraints.validation.error='certifierRoleClassCode certifierRoleCode certifierRoleAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationCertifierParticipationcertifierRoleCertifier classCode='PSN' constraints.validation.error='CertifierClassCode CertifierDeterminerCode CertifierName' determinerCode='INSTANCE'"
 * @generated
 */
public interface LaborandDeliveryInformation extends Act
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.31')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.31\')'"
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
  boolean validateLaborandDeliveryInformationEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristic of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristic of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::homeBirthPlan) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::homeBirthPlan) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationHomeBirthPlan(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Transfer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Transfer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationMaternalTransfer(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateLaborandDeliveryInformationParticipatingLocation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationMaternalMorbidities(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Pregnancy Risk Factor) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Pregnancy Risk Factor) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateLaborandDeliveryInformationRiskFactors(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristic of Labor and Delivery)).oclAsType(vsbr::Characteristic of Labor and Delivery)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristic of Labor and Delivery)).oclAsType(vsbr::Characteristic of Labor and Delivery)'"
   * @generated
   */
  EList<CharacteristicofLaborandDelivery> getCharacteristicsofLaborandDeliveries();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::homeBirthPlan))->asSequence()->any(true).oclAsType(vsbr::homeBirthPlan)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::homeBirthPlan))->asSequence()->any(true).oclAsType(vsbr::homeBirthPlan)'"
   * @generated
   */
  homeBirthPlan getHomeBirthPlan();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Transfer))->asSequence()->any(true).oclAsType(vsbr::Maternal Transfer)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Transfer))->asSequence()->any(true).oclAsType(vsbr::Maternal Transfer)'"
   * @generated
   */
  MaternalTransfer getMaternalTransfer();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidity)).oclAsType(vsbr::Maternal Morbidity)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidity)).oclAsType(vsbr::Maternal Morbidity)'"
   * @generated
   */
  EList<MaternalMorbidity> getMaternalMorbiditiess();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Pregnancy Risk Factor)).oclAsType(vsbr::Pregnancy Risk Factor)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Pregnancy Risk Factor)).oclAsType(vsbr::Pregnancy Risk Factor)'"
   * @generated
   */
  EList<PregnancyRiskFactor> getRiskFactorss();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliveryInformation init();
} // LaborandDeliveryInformation
