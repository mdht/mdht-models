/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Death Certification</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getDeathCertification()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Death CertificationTemplateId Death CertificationClassCode Death CertificationCode Death CertificationEffectiveTime Death CertificationMoodCode Death CertificationCertificationPerformer Death CertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyName Death CertificationCertificationPerformerCertifierRoleAddr Death CertificationCertificationPerformerCertifierRoleClassCode Death CertificationCertificationPerformerCertifierRoleCode Death CertificationCertificationPerformerCertifierRoleCodeP Death CertificationCertificationPerformerCertifierRoleId Death CertificationCertificationPerformerCertifierRoleCertifyingParty Death CertificationCertificationPerformerTypeCode Death CertificationCertificationPerformerCertifierRole' templateId.root='2.16.840.1.113883.10.20.26.1.7' code.code='69437-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Death Certifier' constraints.validation.query='Death CertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyName Death CertificationCertificationPerformerCertifierRoleAddr Death CertificationCertificationPerformerCertifierRoleClassCode Death CertificationCertificationPerformerCertifierRoleCode Death CertificationCertificationPerformerCertifierRoleCodeP Death CertificationCertificationPerformerCertifierRoleId Death CertificationCertificationPerformerCertifierRoleCertifyingParty Death CertificationCertificationPerformerTypeCode Death CertificationCertificationPerformerCertifierRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformer typeCode='PRF' constraints.validation.error='CertificationPerformerTypeCode CertificationPerformerCertifierRole CertificationPerformerCertifierRoleCertifyingPartyClassCode CertificationPerformerCertifierRoleCertifyingPartyDeterminerCode CertificationPerformerCertifierRoleCertifyingPartyName CertificationPerformerCertifierRoleAddr CertificationPerformerCertifierRoleClassCode CertificationPerformerCertifierRoleCode CertificationPerformerCertifierRoleCodeP CertificationPerformerCertifierRoleId CertificationPerformerCertifierRoleCertifyingParty' constraints.validation.query='CertificationPerformerCertifierRoleCertifyingPartyClassCode CertificationPerformerCertifierRoleCertifyingPartyDeterminerCode CertificationPerformerCertifierRoleCertifyingPartyName CertificationPerformerCertifierRoleAddr CertificationPerformerCertifierRoleClassCode CertificationPerformerCertifierRoleCode CertificationPerformerCertifierRoleCodeP CertificationPerformerCertifierRoleId CertificationPerformerCertifierRoleCertifyingParty'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRole constraints.validation.error='CertifierRoleAddr CertifierRoleClassCode CertifierRoleCode CertifierRoleCodeP CertifierRoleId CertifierRoleCertifyingParty CertifierRoleCertifyingPartyClassCode CertifierRoleCertifyingPartyDeterminerCode CertifierRoleCertifyingPartyName' classCode='ASSIGNED' code.codeSystem='2.16.840.1.114222.4.11.6001' code.codeSystemName='Certifier Types' constraints.validation.query='CertifierRoleCertifyingPartyClassCode CertifierRoleCertifyingPartyDeterminerCode CertifierRoleCertifyingPartyName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRoleCertifyingParty classCode='PSN' constraints.validation.error='CertifyingPartyClassCode CertifyingPartyDeterminerCode CertifyingPartyName' determinerCode='INSTANCE'"
 * @generated
 */
public interface DeathCertification extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.7')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.7\')'"
   * @generated
   */
  boolean validateDeathCertificationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateDeathCertificationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '69437-2' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69437-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
   * @generated
   */
  boolean validateDeathCertificationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCertificationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateDeathCertificationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateDeathCertificationCertificationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined(\'classCode\'))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined(\'determinerCode\'))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.114222.4.11.6001'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.114222.4.11.6001\'))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
   * @generated
   */
  boolean validateDeathCertificationCertificationPerformerCertifierRole(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCertification init();
} // DeathCertification
