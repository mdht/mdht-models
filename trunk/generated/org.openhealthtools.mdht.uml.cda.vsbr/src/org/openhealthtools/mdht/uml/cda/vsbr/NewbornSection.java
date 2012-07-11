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
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Newborn Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getNewbornSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Newborn SectionTemplateId Newborn SectionClassCode Newborn SectionCode Newborn SectionMoodCode Newborn SectionText Newborn SectionSubject Newborn SectionApgar Score Newborn SectionPlurality Newborn SectionCongenital Anomalies of the Newborn Newborn SectionWeight' templateId.root='2.16.840.1.113883.10.20.26.6' classCode='DOCSECT' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' moodCode='EVN' constraints.validation.warning='Newborn SectionEstimate of Gestation' constraints.validation.info='Newborn SectionBirth Order Newborn SectionNumber of Infants Born Alive'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubject typeCode='SBJ' constraints.validation.error='NewbornSubjectTypeCode NewbornSubjectRelatedSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewborn classCode='PRS' constraints.validation.error='RoleOfNewbornClassCode RoleOfNewbornSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewbornNewborn constraints.validation.error='NewbornBirthTime NewbornClassCode NewbornName NewbornSDTCId NewbornAdministrativeGenderCode NewbornAdministrativeGenderCodeP' classCode='PSN' determinerCode='INSTANCE' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransfer classCode='OBS' constraints.validation.error='infantTransferClassCode infantTransferCode infantTransferMoodCode infantTransferValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacility typeCode='ORG' constraints.validation.error='TransferFacilityTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRole classCode='PROV' constraints.validation.error='TransferFacilityRoleClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleFacility classCode='ENT' constraints.validation.error='FacilityClassCode FacilityDeterminerCode FacilityName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociation typeCode='COMP' constraints.validation.error='infantLivingAssociationTypeCode infantLivingAssociationInfantLiving'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociationinfantLiving classCode='OBS' constraints.validation.error='infantLivingClassCode infantLivingCode infantLivingMoodCode infantLivingValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociation typeCode='COMP' constraints.validation.error='infantBreastfedAssociationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociationinfantBreastfed classCode='OBS' constraints.validation.error='infantBreastfedClassCode infantBreastfedCode infantBreastfedMoodCode infantBreastfedValue' moodCode='EVN'"
 * @generated
 */
public interface NewbornSection extends Section
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.6')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.6\')'"
   * @generated
   */
  boolean validateNewbornSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Estimate of Gestation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Estimate of Gestation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornSectionEstimateofGestation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 1..2->includes(self.entry->select(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Apgar Score))->size())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='1..2->includes(self.entry->select(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Apgar Score))->size())'"
   * @generated
   */
  boolean validateNewbornSectionApgarScore(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNewbornSectionNumberofInfantsBornAlive(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornSectionCongenitalAnomaliesoftheNewborn(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
   * @generated
   */
  boolean validateNewbornSectionWeight(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Estimate of Gestation))->asSequence()->any(true).oclAsType(vsbr::Estimate of Gestation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Estimate of Gestation))->asSequence()->any(true).oclAsType(vsbr::Estimate of Gestation)'"
   * @generated
   */
  EstimateofGestation getEstimateofGestation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Apgar Score)).oclAsType(vsbr::Apgar Score)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" upper="2" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Apgar Score)).oclAsType(vsbr::Apgar Score)'"
   * @generated
   */
  EList<ApgarScore> getApgarScores();

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
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn)).oclAsType(vsbr::Congenital Anomalies of the Newborn)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn)).oclAsType(vsbr::Congenital Anomalies of the Newborn)'"
   * @generated
   */
  EList<CongenitalAnomaliesoftheNewborn> getCongenitalAnomaliesoftheNewborns();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Weight))->asSequence()->any(true).oclAsType(vsbr::Weight)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Weight))->asSequence()->any(true).oclAsType(vsbr::Weight)'"
   * @generated
   */
  Weight getWeight();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewbornSection init();
} // NewbornSection
