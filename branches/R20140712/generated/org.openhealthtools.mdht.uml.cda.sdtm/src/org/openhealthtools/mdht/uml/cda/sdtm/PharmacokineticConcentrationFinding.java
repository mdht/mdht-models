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
 * A representation of the model object '<em><b>Pharmacokinetic Concentration Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getPharmacokineticConcentrationFinding()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Pharmacokinetic Concentration FindingTemplateId Pharmacokinetic Concentration FindingClassCode Pharmacokinetic Concentration FindingCode Pharmacokinetic Concentration FindingId Pharmacokinetic Concentration FindingMoodCode Pharmacokinetic Concentration FindingSpecimen Information Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationTypeCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationTypeCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory Pharmacokinetic Concentration FindingfastingAssociationfastingStatusClassCode Pharmacokinetic Concentration FindingfastingAssociationfastingStatusCodeP Pharmacokinetic Concentration FindingfastingAssociationfastingStatusCode Pharmacokinetic Concentration FindingfastingAssociationfastingStatusMoodCode Pharmacokinetic Concentration FindingfastingAssociationfastingStatusValue Pharmacokinetic Concentration FindingfastingAssociationTypeCode Pharmacokinetic Concentration FindingfastingAssociationFastingStatus Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationClassCode Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationCodeP Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationCode Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationMoodCode Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationValue Pharmacokinetic Concentration FindingassayQuantitationAssociationTypeId Pharmacokinetic Concentration FindingassayQuantitationAssociationObservation' templateId.root='2.16.840.1.113883.10.20.23.41' classCode='OBS' moodCode='EVN' constraints.validation.info='Pharmacokinetic Concentration FindingStatusCode Pharmacokinetic Concentration FindingMethodCode Pharmacokinetic Concentration FindingGroup Identifier Pharmacokinetic Concentration FindingPharmacokineticsTestResultCategoryAssociation Pharmacokinetic Concentration FindingPharmacokineticsTestResultSubCategoryAssociation Pharmacokinetic Concentration FindingFastingAssociation Pharmacokinetic Concentration FindingNon Performance Reason Pharmacokinetic Concentration FindingExclusion Reason' constraints.validation.warning='Pharmacokinetic Concentration FindingValue Pharmacokinetic Concentration FindingInterpretationCode Pharmacokinetic Concentration FindingAssayQuantitationAssociation Pharmacokinetic Concentration FindingPlanned Study Day' constraints.validation.query='Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationTypeCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationTypeCode Pharmacokinetic Concentration FindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory Pharmacokinetic Concentration FindingfastingAssociationfastingStatusClassCode Pharmacokinetic Concentration FindingfastingAssociationfastingStatusCodeP Pharmacokinetic Concentration FindingfastingAssociationfastingStatusCode Pharmacokinetic Concentration FindingfastingAssociationfastingStatusMoodCode Pharmacokinetic Concentration FindingfastingAssociationfastingStatusValue Pharmacokinetic Concentration FindingfastingAssociationTypeCode Pharmacokinetic Concentration FindingfastingAssociationFastingStatus Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationClassCode Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationCodeP Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationCode Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationMoodCode Pharmacokinetic Concentration FindingassayQuantitationAssociationassayQuantitationValue Pharmacokinetic Concentration FindingassayQuantitationAssociationTypeId Pharmacokinetic Concentration FindingassayQuantitationAssociationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociation typeCode='COMP' constraints.validation.error='pharmacokineticsTestResultCategoryAssociationTypeCode pharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue' constraints.validation.query='pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode pharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategory classCode='OBS' constraints.validation.error='pharmacokineticsTestResultCategoryClassCode pharmacokineticsTestResultCategoryCode pharmacokineticsTestResultCategoryMoodCode pharmacokineticsTestResultCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociation typeCode='COMP' constraints.validation.error='pharmacokineticsTestResultSubCategoryAssociationTypeCode pharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue' constraints.validation.query='pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode pharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategory classCode='OBS' constraints.validation.error='pharmacokineticsTestResultSubCategoryClassCode pharmacokineticsTestResultSubCategoryCode pharmacokineticsTestResultSubCategoryMoodCode pharmacokineticsTestResultSubCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingfastingAssociation typeCode='COMP' constraints.validation.error='fastingAssociationTypeCode fastingAssociationFastingStatus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingfastingAssociationfastingStatus classCode='OBS' constraints.validation.error='fastingStatusClassCode fastingStatusCode fastingStatusCodeP fastingStatusMoodCode fastingStatusValue' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.fastingStatusCode='fastingStatusCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingassayQuantitationAssociation constraints.validation.error='assayQuantitationAssociationTypeId assayQuantitationAssociationObservation assayQuantitationAssociationassayQuantitationClassCode assayQuantitationAssociationassayQuantitationCodeP assayQuantitationAssociationassayQuantitationCode assayQuantitationAssociationassayQuantitationMoodCode assayQuantitationAssociationassayQuantitationValue' constraints.validation.query='assayQuantitationAssociationassayQuantitationClassCode assayQuantitationAssociationassayQuantitationCodeP assayQuantitationAssociationassayQuantitationCode assayQuantitationAssociationassayQuantitationMoodCode assayQuantitationAssociationassayQuantitationValue' constraints.validation.dependOn.assayQuantitationAssociationassayQuantitationCode='assayQuantitationAssociationassayQuantitationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmPharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitation classCode='OBS' constraints.validation.error='assayQuantitationClassCode assayQuantitationCode assayQuantitationCodeP assayQuantitationMoodCode assayQuantitationValue' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.assayQuantitationCode='assayQuantitationCodeP' moodCode='DEF'"
 * @generated
 */
public interface PharmacokineticConcentrationFinding extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.41\')'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::DEF)'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::IVL_PQ))))'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject((typeId.oclIsUndefined() or typeId.isNullFlavorUndefined()) implies (not typeId.oclIsUndefined()))'"
   * @generated
   */
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)'"
   * @generated
   */
  PlannedStudyDay getPlannedStudyDay();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)'"
   * @generated
   */
  ExclusionReason getExclusionReason();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticConcentrationFinding init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PharmacokineticConcentrationFinding init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PharmacokineticConcentrationFinding
