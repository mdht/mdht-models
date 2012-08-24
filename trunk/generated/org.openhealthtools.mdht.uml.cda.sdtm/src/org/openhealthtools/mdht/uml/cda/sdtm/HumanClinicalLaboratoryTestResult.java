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
 * A representation of the model object '<em><b>Human Clinical Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getHumanClinicalLaboratoryTestResult()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Human Clinical Laboratory Test ResultTemplateId Human Clinical Laboratory Test ResultClassCode Human Clinical Laboratory Test ResultCode Human Clinical Laboratory Test ResultId Human Clinical Laboratory Test ResultMoodCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationTypeCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationTypeCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeClassCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeCodeP Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeInterpretationCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeMoodCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeValue Human Clinical Laboratory Test ResultreferenceRangeAssociationTypeCode Human Clinical Laboratory Test ResultreferenceRangeAssociationReferenceRange Human Clinical Laboratory Test ResultfastingAssociationfastingClassCode Human Clinical Laboratory Test ResultfastingAssociationfastingCodeP Human Clinical Laboratory Test ResultfastingAssociationfastingCode Human Clinical Laboratory Test ResultfastingAssociationfastingMoodCode Human Clinical Laboratory Test ResultfastingAssociationfastingValue Human Clinical Laboratory Test ResultfastingAssociationTypeCode Human Clinical Laboratory Test ResultfastingAssociationFasting Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeClassCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeCodeP Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeMoodCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeValue Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeValueP Human Clinical Laboratory Test ResultlabToxicityAssociationTypeCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGrade' templateId.root='2.16.840.1.113883.10.20.23.31' classCode='OBS' moodCode='EVN' constraints.validation.info='Human Clinical Laboratory Test ResultStatusCode Human Clinical Laboratory Test ResultMethodCode Human Clinical Laboratory Test ResultGroup Identifier Human Clinical Laboratory Test ResultSpecimen Information Human Clinical Laboratory Test ResultLaboratoryTestResultSubCategoryAssociation Human Clinical Laboratory Test ResultNon Performance Reason Human Clinical Laboratory Test ResultFastingAssociation Human Clinical Laboratory Test ResultLabToxicityAssociation Human Clinical Laboratory Test ResultTiming Reference' constraints.validation.warning='Human Clinical Laboratory Test ResultValue Human Clinical Laboratory Test ResultInterpretationCode Human Clinical Laboratory Test ResultLaboratoryTestResultCategoryAssociation Human Clinical Laboratory Test ResultReferenceRangeAssociation' constraints.validation.query='Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationTypeCode Human Clinical Laboratory Test ResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue Human Clinical Laboratory Test ResultlaboratoryTestResultSubCategoryAssociationTypeCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeClassCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeCodeP Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeInterpretationCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeMoodCode Human Clinical Laboratory Test ResultreferenceRangeAssociationreferenceRangeValue Human Clinical Laboratory Test ResultreferenceRangeAssociationTypeCode Human Clinical Laboratory Test ResultreferenceRangeAssociationReferenceRange Human Clinical Laboratory Test ResultfastingAssociationfastingClassCode Human Clinical Laboratory Test ResultfastingAssociationfastingCodeP Human Clinical Laboratory Test ResultfastingAssociationfastingCode Human Clinical Laboratory Test ResultfastingAssociationfastingMoodCode Human Clinical Laboratory Test ResultfastingAssociationfastingValue Human Clinical Laboratory Test ResultfastingAssociationTypeCode Human Clinical Laboratory Test ResultfastingAssociationFasting Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeClassCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeCodeP Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeMoodCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeValue Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGradeValueP Human Clinical Laboratory Test ResultlabToxicityAssociationTypeCode Human Clinical Laboratory Test ResultlabToxicityAssociationToxicityGrade'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultreferenceRangeAssociation typeCode='REFV' constraints.validation.error='referenceRangeAssociationTypeCode referenceRangeAssociationReferenceRange referenceRangeAssociationreferenceRangeClassCode referenceRangeAssociationreferenceRangeCode referenceRangeAssociationreferenceRangeCodeP referenceRangeAssociationreferenceRangeInterpretationCode referenceRangeAssociationreferenceRangeMoodCode referenceRangeAssociationreferenceRangeValue' constraints.validation.query='referenceRangeAssociationreferenceRangeClassCode referenceRangeAssociationreferenceRangeCode referenceRangeAssociationreferenceRangeCodeP referenceRangeAssociationreferenceRangeInterpretationCode referenceRangeAssociationreferenceRangeMoodCode referenceRangeAssociationreferenceRangeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRange classCode='OBS' constraints.validation.error='referenceRangeClassCode referenceRangeCode referenceRangeCodeP referenceRangeInterpretationCode referenceRangeMoodCode referenceRangeValue' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' interpretationCode.codeSystem='2.16.840.1.113883.5.83' interpretationCode.codeSystemName='ObservationInterpretation' moodCode='EVN.CRT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultfastingAssociation typeCode='COMP' constraints.validation.error='fastingAssociationTypeCode fastingAssociationFasting'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultfastingAssociationfasting classCode='OBS' constraints.validation.error='fastingClassCode fastingCode fastingCodeP fastingMoodCode fastingValue' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.fastingCode='fastingCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlabToxicityAssociation typeCode='COMP' constraints.validation.error='labToxicityAssociationTypeCode labToxicityAssociationToxicityGrade labToxicityAssociationToxicityGradeClassCode labToxicityAssociationToxicityGradeCodeP labToxicityAssociationToxicityGradeCode labToxicityAssociationToxicityGradeMoodCode labToxicityAssociationToxicityGradeValue labToxicityAssociationToxicityGradeValueP' constraints.validation.query='labToxicityAssociationToxicityGradeClassCode labToxicityAssociationToxicityGradeCodeP labToxicityAssociationToxicityGradeCode labToxicityAssociationToxicityGradeMoodCode labToxicityAssociationToxicityGradeValue labToxicityAssociationToxicityGradeValueP' constraints.validation.dependOn.labToxicityAssociationToxicityGradeCode='labToxicityAssociationToxicityGradeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade classCode='OBS' constraints.validation.error='ToxicityGradeClassCode ToxicityGradeCode ToxicityGradeCodeP ToxicityGradeMoodCode ToxicityGradeValue ToxicityGradeValueP' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.ToxicityGradeCode='ToxicityGradeCodeP' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociation typeCode='COMP' constraints.validation.error='laboratoryTestResultCategoryAssociationTypeCode laboratoryTestResultCategoryAssociationLaboratoryTestResultCategory laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue' constraints.validation.query='laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode laboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategory classCode='OBS' constraints.validation.error='laboratoryTestResultCategoryClassCode laboratoryTestResultCategoryCode laboratoryTestResultCategoryMoodCode laboratoryTestResultCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociation typeCode='COMP' constraints.validation.error='laboratoryTestResultSubCategoryAssociationTypeCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue' constraints.validation.query='laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode laboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategory classCode='OBS' constraints.validation.error='laboratoryTestResultSubCategoryClassCode laboratoryTestResultSubCategoryCode laboratoryTestResultSubCategoryMoodCode laboratoryTestResultSubCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface HumanClinicalLaboratoryTestResult extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.31\')'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->one(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject((interpretationCode.oclIsUndefined() or interpretationCode.isNullFlavorUndefined()) implies (not interpretationCode.oclIsUndefined() and interpretationCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = interpretationCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.83\'))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined(\'moodCode\') and moodCode=vocab::ActMood::EVN.CRT)'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::PQR)))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipType::REFV)'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\')))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  public HumanClinicalLaboratoryTestResult init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanClinicalLaboratoryTestResult init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HumanClinicalLaboratoryTestResult
