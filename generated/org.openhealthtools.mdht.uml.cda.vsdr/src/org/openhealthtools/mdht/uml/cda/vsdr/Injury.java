/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injury</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getInjury()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InjuryTemplateId InjuryClassCode InjuryCode InjuryCodeP InjuryMoodCode InjuryStatusCode InjuryComponentInjuryInformation InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationTypeCode InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship' templateId.root='2.16.840.1.113883.10.20.26.1.9' classCode='CLUSTER' code.code='LOINC TBD' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury Cluster' moodCode='EVN' constraints.validation.info='InjuryComponentWorkAssociation InjuryComponentTransportationAssociation InjuryComponentTransportationRelationship InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentWorkAssociationWorkAssociation' constraints.validation.query='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationTypeCode InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship' constraints.validation.dependOn.InjuryComponentInjuryInformationInjuryInformationCode='InjuryComponentInjuryInformationInjuryInformationCodeP' constraints.validation.dependOn.InjuryComponentWorkAssociationWorkAssociationCode='InjuryComponentWorkAssociationWorkAssociationCodeP' constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode='InjuryComponentTransportationAssociationTransportationAssociationCodeP' constraints.validation.dependOn.InjuryComponentTransportationRelationshipTransportationRelationshipCode='InjuryComponentTransportationRelationshipTransportationRelationshipCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation typeCode='COMP' constraints.validation.error='ComponentInjuryInformationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation classCode='OBS' constraints.validation.error='InjuryInformationClassCode InjuryInformationCode InjuryInformationCodeP InjuryInformationMoodCode InjuryInformationValue InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryInformationLocationParticipationTypeCode' code.code='11374-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury incident description' constraints.validation.dependOn.InjuryInformationCode='InjuryInformationCodeP' moodCode='EVN' constraints.validation.info='InjuryInformationText InjuryInformationEffectiveTime InjuryInformationLocationParticipation InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury' constraints.validation.query='InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryInformationLocationParticipationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation typeCode='LOC' constraints.validation.error='LocationParticipationTypeCode LocationParticipationInjuryLocationRolePlaceOfInjuryClassCode LocationParticipationInjuryLocationRoleClassCode' constraints.validation.query='LocationParticipationInjuryLocationRolePlaceOfInjuryClassCode LocationParticipationInjuryLocationRolePlaceOfInjuryDesc LocationParticipationInjuryLocationRoleAddr LocationParticipationInjuryLocationRoleClassCode LocationParticipationInjuryLocationRolePlaceOfInjury' constraints.validation.info='LocationParticipationInjuryLocationRolePlaceOfInjuryDesc LocationParticipationInjuryLocationRoleAddr LocationParticipationInjuryLocationRolePlaceOfInjury'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole constraints.validation.info='InjuryLocationRoleAddr InjuryLocationRolePlaceOfInjury InjuryLocationRolePlaceOfInjuryDesc' classCode='ISDLOC' constraints.validation.error='InjuryLocationRoleClassCode InjuryLocationRolePlaceOfInjuryClassCode' constraints.validation.query='InjuryLocationRolePlaceOfInjuryClassCode InjuryLocationRolePlaceOfInjuryDesc'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury classCode='PLC' constraints.validation.error='PlaceOfInjuryClassCode' constraints.validation.info='PlaceOfInjuryDesc' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation typeCode='COMP' constraints.validation.error='ComponentWorkAssociationTypeCode' constraints.validation.info='ComponentWorkAssociationWorkAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation classCode='OBS' constraints.validation.error='WorkAssociationClassCode WorkAssociationCode WorkAssociationCodeP WorkAssociationMoodCode WorkAssociationValue' code.code='69444-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Did death result from injury at work' constraints.validation.dependOn.WorkAssociationCode='WorkAssociationCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation typeCode='COMP' constraints.validation.error='ComponentTransportationAssociationTypeCode ComponentTransportationAssociationTransportationAssociationClassCode ComponentTransportationAssociationTransportationAssociationCodeP ComponentTransportationAssociationTransportationAssociationCode ComponentTransportationAssociationTransportationAssociationMoodCode ComponentTransportationAssociationTransportationAssociationValue' constraints.validation.query='ComponentTransportationAssociationTransportationAssociationClassCode ComponentTransportationAssociationTransportationAssociationCodeP ComponentTransportationAssociationTransportationAssociationCode ComponentTransportationAssociationTransportationAssociationMoodCode ComponentTransportationAssociationTransportationAssociationValue' constraints.validation.dependOn.ComponentTransportationAssociationTransportationAssociationCode='ComponentTransportationAssociationTransportationAssociationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation classCode='OBS' constraints.validation.error='TransportationAssociationClassCode TransportationAssociationCode TransportationAssociationCodeP TransportationAssociationMoodCode TransportationAssociationValue' code.code='69448-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury leading to death associated with transportation event' constraints.validation.dependOn.TransportationAssociationCode='TransportationAssociationCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship typeCode='COMP' constraints.validation.error='ComponentTransportationRelationshipTypeCode ComponentTransportationRelationshipTransportationRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship classCode='OBS' constraints.validation.error='TransportationRelationshipClassCode TransportationRelationshipCode TransportationRelationshipCodeP TransportationRelationshipMoodCode TransportationRelationshipValue' code.code='69451-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Transportation role of decedent' constraints.validation.dependOn.TransportationRelationshipCode='TransportationRelationshipCodeP' moodCode='EVN'"
 * @generated
 */
public interface Injury extends Organizer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.9')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.9\')'"
   * @generated
   */
  boolean validateInjuryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
   * @generated
   */
  boolean validateInjuryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = 'LOINC TBD' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'LOINC TBD\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
   * @generated
   */
  boolean validateInjuryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
   * @generated
   */
  boolean validateInjuryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
   * @generated
   */
  boolean validateInjuryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateInjuryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject(classCode=vocab::EntityClassRoot::PLC)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject(classCode=vocab::EntityClassRoot::PLC)'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject((desc.oclIsUndefined() or desc.isNullFlavorUndefined()) implies (not desc.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject((desc.oclIsUndefined() or desc.isNullFlavorUndefined()) implies (not desc.oclIsUndefined()))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassRoot::ISDLOC)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassRoot::ISDLOC)'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity)))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null).participant->excluding(null)->reject(typeCode=vocab::ParticipationType::LOC)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null)->reject(typeCode=vocab::ParticipationType::LOC)'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'11374-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2)))'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateInjuryComponentInjuryInformationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationWorkAssociationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationWorkAssociationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = '69444-8' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69444-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationWorkAssociationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationWorkAssociationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationWorkAssociationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateInjuryComponentWorkAssociationWorkAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = '69448-9' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69448-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociationTransportationAssociationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociationTransportationAssociationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateInjuryComponentTransportationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = '69451-3' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69451-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateInjuryComponentTransportationRelationshipTransportationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Injury init();
} // Injury
