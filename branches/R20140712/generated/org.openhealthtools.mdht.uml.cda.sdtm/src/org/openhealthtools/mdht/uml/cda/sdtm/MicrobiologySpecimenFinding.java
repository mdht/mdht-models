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
 * A representation of the model object '<em><b>Microbiology Specimen Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getMicrobiologySpecimenFinding()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Microbiology Specimen FindingTemplateId Microbiology Specimen FindingClassCode Microbiology Specimen FindingCode Microbiology Specimen FindingId Microbiology Specimen FindingMoodCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationTypeCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue Microbiology Specimen FindingmicrobiologyResultCategoryAssociationTypeCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory' templateId.root='2.16.840.1.113883.10.20.23.38' classCode='OBS' constraints.validation.warning='Microbiology Specimen FindingMethodCode Microbiology Specimen FindingValue Microbiology Specimen FindingGroup Identifier Microbiology Specimen FindingMicrobiologyResultCategoryAssociation' moodCode='EVN' constraints.validation.info='Microbiology Specimen FindingStatusCode Microbiology Specimen FindingInterpretationCode Microbiology Specimen FindingMicrobiologySpecimenResultCategoryAssociation Microbiology Specimen FindingMicrobiologySpecimenResultSubCategoryAssociation Microbiology Specimen FindingNonPerformanceReason Microbiology Specimen FindingSpecimen Information' constraints.validation.query='Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationTypeCode Microbiology Specimen FindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode Microbiology Specimen FindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue Microbiology Specimen FindingmicrobiologyResultCategoryAssociationTypeCode Microbiology Specimen FindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociation typeCode='COMP' constraints.validation.error='microbiologySpecimenFindingCategoryAssociationTypeCode microbiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue' constraints.validation.query='microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode microbiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategory classCode='OBS' constraints.validation.error='microbiologySpecimenFindingCategoryClassCode microbiologySpecimenFindingCategoryCode microbiologySpecimenFindingCategoryMoodCode microbiologySpecimenFindingCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociation typeCode='COMP' constraints.validation.error='microbiologySpecimenFindingSubCategoryAssociationTypeCode microbiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue' constraints.validation.query='microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode microbiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategory classCode='OBS' constraints.validation.error='microbiologySpecimenFindingSubCategoryClassCode microbiologySpecimenFindingSubCategoryCode microbiologySpecimenFindingSubCategoryMoodCode microbiologySpecimenFindingSubCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociation typeCode='COMP' constraints.validation.error='microbiologyResultCategoryAssociationTypeCode microbiologyResultCategoryAssociationMicrobiologyResultCategory microbiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode microbiologyResultCategoryAssociationmicrobiologyResultCategoryCode microbiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode microbiologyResultCategoryAssociationmicrobiologyResultCategoryValue' constraints.validation.query='microbiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode microbiologyResultCategoryAssociationmicrobiologyResultCategoryCode microbiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode microbiologyResultCategoryAssociationmicrobiologyResultCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategory classCode='OBS' constraints.validation.error='microbiologyResultCategoryClassCode microbiologyResultCategoryCode microbiologyResultCategoryMoodCode microbiologyResultCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface MicrobiologySpecimenFinding extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.38\')'"
   * @generated
   */
  boolean validateMicrobiologySpecimenFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
  boolean validateMicrobiologySpecimenFindingId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())'"
   * @generated
   */
  boolean validateMicrobiologySpecimenFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())'"
   * @generated
   */
  boolean validateMicrobiologySpecimenFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)'"
   * @generated
   */
  NonPerformanceReason getNonPerformanceReason();

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
   * @generated
   */
  public MicrobiologySpecimenFinding init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MicrobiologySpecimenFinding init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MicrobiologySpecimenFinding
