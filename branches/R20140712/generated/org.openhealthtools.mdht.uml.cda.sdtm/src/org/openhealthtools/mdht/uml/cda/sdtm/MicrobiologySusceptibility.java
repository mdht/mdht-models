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
 * A representation of the model object '<em><b>Microbiology Susceptibility</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getMicrobiologySusceptibility()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Microbiology SusceptibilityTemplateId Microbiology SusceptibilityClassCode Microbiology SusceptibilityCode Microbiology SusceptibilityId Microbiology SusceptibilityMoodCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory' templateId.root='2.16.840.1.113883.10.20.23.39' classCode='OBS' constraints.validation.warning='Microbiology SusceptibilityMethodCode Microbiology SusceptibilityValue Microbiology SusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation' moodCode='EVN' constraints.validation.info='Microbiology SusceptibilityStatusCode Microbiology SusceptibilityEffectiveTime Microbiology SusceptibilityInterpretationCode Microbiology SusceptibilityEvent Study Day Microbiology SusceptibilityTiming Reference Microbiology SusceptibilityGroup Identifier Microbiology SusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation Microbiology SusceptibilityNon Performance Reason' constraints.validation.query='Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode Microbiology SusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociation typeCode='COMP' constraints.validation.error='microbiologySusceptibilityFindingCategoryAssociationTypeCode microbiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue' constraints.validation.query='microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode microbiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategory classCode='OBS' constraints.validation.error='microbiologySusceptibilityFindingCategoryClassCode microbiologySusceptibilityFindingCategoryCode microbiologySusceptibilityFindingCategoryMoodCode microbiologySusceptibilityFindingCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociation typeCode='COMP' constraints.validation.error='microbiologySusceptibilityFindingSubCategoryAssociationTypeCode microbiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue' constraints.validation.query='microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode microbiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategory classCode='OBS' constraints.validation.error='microbiologySusceptibilityFindingSubCategoryClassCode microbiologySusceptibilityFindingSubCategoryCode microbiologySusceptibilityFindingSubCategoryMoodCode microbiologySusceptibilityFindingSubCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySusceptibilitymicrobiologySusceptibilityResultCategoryAssociation typeCode='COMP' constraints.validation.error='microbiologySusceptibilityResultCategoryAssociationTypeCode microbiologySusceptibilityResultCategoryAssociationMicrobiologySusceptibilityResultCategory microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryClassCode microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryCode microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryMoodCode microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryValue' constraints.validation.query='microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryClassCode microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryCode microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryMoodCode microbiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMicrobiologySusceptibilitymicrobiologySusceptibilityResultCategoryAssociationmicrobiologySusceptibilityResultCategory classCode='OBS' constraints.validation.error='microbiologySusceptibilityResultCategoryClassCode microbiologySusceptibilityResultCategoryCode microbiologySusceptibilityResultCategoryMoodCode microbiologySusceptibilityResultCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface MicrobiologySusceptibility extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.39\')'"
   * @generated
   */
  boolean validateMicrobiologySusceptibilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
  boolean validateMicrobiologySusceptibilityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateMicrobiologySusceptibilityEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateMicrobiologySusceptibilityTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateMicrobiologySusceptibilityNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->any(true).oclAsType(sdtm::Event Study Day)'"
   * @generated
   */
  EventStudyDay getEventStudyDay();

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
   * @generated
   */
  public MicrobiologySusceptibility init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MicrobiologySusceptibility init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MicrobiologySusceptibility
