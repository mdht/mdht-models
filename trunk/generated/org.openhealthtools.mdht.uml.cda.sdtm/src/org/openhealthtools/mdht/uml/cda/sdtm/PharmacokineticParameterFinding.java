/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pharmacokinetic Parameter Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getPharmacokineticParameterFinding()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Pharmacokinetic Parameter FindingTemplateId Pharmacokinetic Parameter FindingClassCode Pharmacokinetic Parameter FindingCode Pharmacokinetic Parameter FindingId Pharmacokinetic Parameter FindingMoodCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationTypeCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationTypeCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory' templateId.root='2.16.840.1.113883.10.20.23.40' classCode='OBS' moodCode='EVN' constraints.validation.info='Pharmacokinetic Parameter FindingStatusCode Pharmacokinetic Parameter FindingGroup Identifier Pharmacokinetic Parameter FindingSpecimen Information Pharmacokinetic Parameter FindingPharmacokineticsParameterCategoryAssociation Pharmacokinetic Parameter FindingPharmacokineticsParameterSubCategoryAssociation Pharmacokinetic Parameter FindingNon Performance Reason' constraints.validation.warning='Pharmacokinetic Parameter FindingValue Pharmacokinetic Parameter FindingTiming Reference' constraints.validation.query='Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationTypeCode Pharmacokinetic Parameter FindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationTypeCode Pharmacokinetic Parameter FindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociation typeCode='COMP' constraints.validation.error='pharmacokineticsParameterCategoryAssociationTypeCode pharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue' constraints.validation.query='pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode pharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategory classCode='OBS' constraints.validation.error='pharmacokineticsParameterCategoryClassCode pharmacokineticsParameterCategoryCode pharmacokineticsParameterCategoryMoodCode pharmacokineticsParameterCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociation typeCode='COMP' constraints.validation.error='pharmacokineticsParameterSubCategoryAssociationTypeCode pharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue' constraints.validation.query='pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode pharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategory classCode='OBS' constraints.validation.error='pharmacokineticsParameterSubCategoryClassCode pharmacokineticsParameterSubCategoryCode pharmacokineticsParameterSubCategoryMoodCode pharmacokineticsParameterSubCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface PharmacokineticParameterFinding extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.40\')'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)'"
   * @generated
   */
  GroupIdentifier getGroupIdentifier();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)'"
   * @generated
   */
  SpecimenInformation getSpecimenInformation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)'"
   * @generated
   */
  NonPerformanceReason getNonPerformanceReason();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)'"
   * @generated
   */
  TimingReference getTimingReference();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticParameterFinding init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PharmacokineticParameterFinding init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PharmacokineticParameterFinding
