/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetal Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getFetalDeliverySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Fetal Delivery SectionTemplateId Fetal Delivery SectionClassCode Fetal Delivery SectionMoodCode Fetal Delivery SectionCode Fetal Delivery SectionText Fetal Delivery SectionBirth Order Fetal Delivery SectionNumber of Infants Born Alive Fetal Delivery SectionFetal Death Occurrance Fetal Delivery SectionPlurality Fetal Delivery SectionCongenital Anomalies Fetal Delivery SectionFetal Delivery Time Fetal Delivery SectionFetalDeliverySubject Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetus Fetal Delivery SectionFetalDeliverySubjectTypeCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetus' templateId.root='2.16.840.1.113883.10.20.26.4' classCode='DOCSECT' moodCode='EVN' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='Fetal Delivery SectionAutopsy Performance' constraints.validation.query='Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusName Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetus Fetal Delivery SectionFetalDeliverySubjectTypeCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetus' constraints.validation.info='Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubject typeCode='SBJ' constraints.validation.error='FetalDeliverySubjectTypeCode FetalDeliverySubjectRoleOfFetus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetus classCode='PRS' constraints.validation.error='RoleOfFetusClassCode RoleOfFetusFetus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus classCode='PSN' constraints.validation.error='FetusClassCode FetusDeterminerCode FetusAdministrativeGenderCode FetusAdministrativeGenderCodeP' determinerCode='INSTANCE' constraints.validation.info='FetusName' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode'"
 * @generated
 */
public interface FetalDeliverySection extends Section
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.4\')'"
   * @generated
   */
  boolean validateFetalDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClass::DOCSECT'"
   * @generated
   */
  boolean validateFetalDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
   * @generated
   */
  boolean validateFetalDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateFetalDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
   * @generated
   */
  boolean validateFetalDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::BirthOrder) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionNumberofInfantsBornAlive(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::AutopsyPerformance) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionAutopsyPerformance(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::FetalDeathOccurrance) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeathOccurrance(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::CongenitalAnomaly) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionCongenitalAnomalies(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::FetalDeliveryTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliveryTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubject(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClass::PSN)'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.1\'))'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::x_DocumentSubject::PRS)'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationTargetSubject::SBJ)'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))'"
   * @generated
   */
  boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::BirthOrder))->asSequence()->any(true).oclAsType(vsbr::BirthOrder)'"
   * @generated
   */
  BirthOrder getBirthOrder();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive))->asSequence()->any(true).oclAsType(vsbr::NumberofInfantsBornAlive)'"
   * @generated
   */
  NumberofInfantsBornAlive getNumberofInfantsBornAlive();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::AutopsyPerformance))->asSequence()->any(true).oclAsType(vsbr::AutopsyPerformance)'"
   * @generated
   */
  AutopsyPerformance getAutopsyPerformance();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::FetalDeathOccurrance))->asSequence()->any(true).oclAsType(vsbr::FetalDeathOccurrance)'"
   * @generated
   */
  FetalDeathOccurrance getFetalDeathOccurrance();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)'"
   * @generated
   */
  Plurality getPlurality();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::CongenitalAnomaly)).oclAsType(vsbr::CongenitalAnomaly)'"
   * @generated
   */
  EList<CongenitalAnomaly> getCongenitalAnomaliess();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::FetalDeliveryTime))->asSequence()->any(true).oclAsType(vsbr::FetalDeliveryTime)'"
   * @generated
   */
  FetalDeliveryTime getFetalDeliveryTime();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalDeliverySection init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FetalDeliverySection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FetalDeliverySection
