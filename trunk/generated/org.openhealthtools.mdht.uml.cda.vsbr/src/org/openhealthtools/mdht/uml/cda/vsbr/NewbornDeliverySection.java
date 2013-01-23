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

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Newborn Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getNewbornDeliverySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Newborn Delivery SectionTemplateId Newborn Delivery SectionClassCode Newborn Delivery SectionCode Newborn Delivery SectionMoodCode Newborn Delivery SectionText Newborn Delivery SectionSubject Newborn Delivery SectionCongenital Anomalies Newborn Delivery SectionNewborn'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubject typeCode='SBJ' constraints.validation.error='NewbornSubjectTypeCode NewbornSubjectRelatedSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewborn classCode='PRS' constraints.validation.error='RoleOfNewbornClassCode RoleOfNewbornSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewborn classCode='PSN' constraints.validation.error='NewbornClassCode NewbornDeterminerCode NewbornSDTCId NewbornName NewbornAdministrativeGenderCode NewbornAdministrativeGenderCodeP NewbornBirthTime' determinerCode='INSTANCE' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode'"
 * @generated
 */
public interface NewbornDeliverySection extends Section
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.10')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.10\')'"
   * @generated
   */
  boolean validateNewbornDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::DOCSECT
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::DOCSECT'"
   * @generated
   */
  boolean validateNewbornDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateNewbornDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::ActMood::EVN'"
   * @generated
   */
  boolean validateNewbornDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
   * @generated
   */
  boolean validateNewbornDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Order) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Order) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Infants Born Alive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Infants Born Alive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNumberofInfantsBornAlive(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomaly) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomaly) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionCongenitalAnomalies(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Newborn's Vital Signs Section))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Newborn\'s Vital Signs Section))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornsVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Abnormal Condition of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Abnormal Condition of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Infant Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Infant Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionInfantLiving(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Infant Breastfed) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Infant Breastfed) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionInfantBreastfed(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::infantTransfer) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::infantTransfer) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionInfantTransfer(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClass::PSN)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCId->isEmpty() or sDTCId->exists(element | element.isNullFlavorUndefined())) implies (sDTCId->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCId->isEmpty() or sDTCId->exists(element | element.isNullFlavorUndefined())) implies (sDTCId->size() = 1))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.5.1'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.1\'))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined('classCode') and classCode=vocab::x_DocumentSubject::PRS)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::x_DocumentSubject::PRS)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationTargetSubject::SBJ)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationTargetSubject::SBJ)'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))'"
   * @generated
   */
  boolean validateNewbornDeliverySectionNewbornSubjectRelatedSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Order))->asSequence()->any(true).oclAsType(vsbr::Birth Order)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Order))->asSequence()->any(true).oclAsType(vsbr::Birth Order)'"
   * @generated
   */
  BirthOrder getBirthOrder();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Infants Born Alive))->asSequence()->any(true).oclAsType(vsbr::Number of Infants Born Alive)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Infants Born Alive))->asSequence()->any(true).oclAsType(vsbr::Number of Infants Born Alive)'"
   * @generated
   */
  NumberofInfantsBornAlive getNumberofInfantsBornAlive();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomaly)).oclAsType(vsbr::Congenital Anomaly)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomaly)).oclAsType(vsbr::Congenital Anomaly)'"
   * @generated
   */
  EList<CongenitalAnomaly> getCongenitalAnomaliess();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Newborn's Vital Signs Section)).oclAsType(vsbr::Newborn's Vital Signs Section)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Newborn\'s Vital Signs Section)).oclAsType(vsbr::Newborn\'s Vital Signs Section)'"
   * @generated
   */
  EList<NewbornsVitalSignsSection> getNewbornsVitalSignsSections();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Abnormal Condition of the Newborn)).oclAsType(vsbr::Abnormal Condition of the Newborn)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Abnormal Condition of the Newborn)).oclAsType(vsbr::Abnormal Condition of the Newborn)'"
   * @generated
   */
  EList<AbnormalConditionoftheNewborn> getAbnormalConditionsoftheNewborns();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Infant Living))->asSequence()->any(true).oclAsType(vsbr::Infant Living)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Infant Living))->asSequence()->any(true).oclAsType(vsbr::Infant Living)'"
   * @generated
   */
  InfantLiving getInfantLiving();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Infant Breastfed))->asSequence()->any(true).oclAsType(vsbr::Infant Breastfed)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Infant Breastfed))->asSequence()->any(true).oclAsType(vsbr::Infant Breastfed)'"
   * @generated
   */
  InfantBreastfed getInfantBreastfed();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::infantTransfer))->asSequence()->any(true).oclAsType(vsbr::infantTransfer)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::infantTransfer))->asSequence()->any(true).oclAsType(vsbr::infantTransfer)'"
   * @generated
   */
  infantTransfer getInfantTransfer();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)'"
   * @generated
   */
  Plurality getPlurality();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewbornDeliverySection init();
} // NewbornDeliverySection
