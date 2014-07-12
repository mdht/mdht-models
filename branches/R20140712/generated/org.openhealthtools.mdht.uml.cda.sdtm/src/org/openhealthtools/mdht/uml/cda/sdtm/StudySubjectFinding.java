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
 * A representation of the model object '<em><b>Study Subject Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getStudySubjectFinding()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Study Subject FindingTemplateId Study Subject FindingClassCode Study Subject FindingCode Study Subject FindingId Study Subject FindingMoodCode Study Subject FindingreferenceRangeAssociationreferenceRangeClassCode Study Subject FindingreferenceRangeAssociationreferenceRangeCode Study Subject FindingreferenceRangeAssociationreferenceRangeCodeP Study Subject FindingreferenceRangeAssociationreferenceRangeInterpretationCode Study Subject FindingreferenceRangeAssociationreferenceRangeMoodCode Study Subject FindingreferenceRangeAssociationreferenceRangeValue Study Subject FindingreferenceRangeAssociationTypeCode Study Subject FindingfastingAssociationfastingStatusClassCode Study Subject FindingfastingAssociationfastingStatusCodeP Study Subject FindingfastingAssociationfastingStatusCode Study Subject FindingfastingAssociationfastingStatusMoodCode Study Subject FindingfastingAssociationfastingStatusValue Study Subject FindingfastingAssociationTypeCode Study Subject FindingtoxicityAssociationtoxicityGradeClassCode Study Subject FindingtoxicityAssociationtoxicityGradeCodeP Study Subject FindingtoxicityAssociationtoxicityGradeCode Study Subject FindingtoxicityAssociationtoxicityGradeMoodCode Study Subject FindingtoxicityAssociationtoxicityGradeValue Study Subject FindingtoxicityAssociationtoxicityGradeValueP Study Subject FindingtoxicityAssociationTypeCode Study Subject FindingresultCategoryAssociationresultCategoryClassCode Study Subject FindingresultCategoryAssociationresultCategoryCode Study Subject FindingresultCategoryAssociationresultCategoryMoodCode Study Subject FindingresultCategoryAssociationresultCategoryValue Study Subject FindingresultCategoryAssociationTypeCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryClassCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryMoodCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryValue Study Subject FindingresultSubCategoryAssociationTypeCode Study Subject FindingresultSubCategoryAssociationResultSubCategory' templateId.root='2.16.840.1.113883.10.20.23.103' classCode='OBS' moodCode='EVN' constraints.validation.info='Study Subject FindingStatusCode Study Subject FindingMethodCode Study Subject FindingInterpretationCode Study Subject FindingReferenceRangeAssociation Study Subject FindingNon Performance Reason Study Subject FindingFastingAssociation Study Subject FindingToxicityAssociation Study Subject FindingGroup Identifier Study Subject FindingSpecimen Information Study Subject FindingResultCategoryAssociation Study Subject FindingResultSubCategoryAssociation' constraints.validation.warning='Study Subject FindingValue Study Subject FindingTargetSiteCode' constraints.validation.query='Study Subject FindingreferenceRangeAssociationreferenceRangeClassCode Study Subject FindingreferenceRangeAssociationreferenceRangeCode Study Subject FindingreferenceRangeAssociationreferenceRangeCodeP Study Subject FindingreferenceRangeAssociationreferenceRangeInterpretationCode Study Subject FindingreferenceRangeAssociationreferenceRangeMoodCode Study Subject FindingreferenceRangeAssociationreferenceRangeValue Study Subject FindingreferenceRangeAssociationTypeCode Study Subject FindingfastingAssociationfastingStatusClassCode Study Subject FindingfastingAssociationfastingStatusCodeP Study Subject FindingfastingAssociationfastingStatusCode Study Subject FindingfastingAssociationfastingStatusMoodCode Study Subject FindingfastingAssociationfastingStatusValue Study Subject FindingfastingAssociationTypeCode Study Subject FindingtoxicityAssociationtoxicityGradeClassCode Study Subject FindingtoxicityAssociationtoxicityGradeCodeP Study Subject FindingtoxicityAssociationtoxicityGradeCode Study Subject FindingtoxicityAssociationtoxicityGradeMoodCode Study Subject FindingtoxicityAssociationtoxicityGradeValue Study Subject FindingtoxicityAssociationtoxicityGradeValueP Study Subject FindingtoxicityAssociationTypeCode Study Subject FindingresultCategoryAssociationresultCategoryClassCode Study Subject FindingresultCategoryAssociationresultCategoryCode Study Subject FindingresultCategoryAssociationresultCategoryMoodCode Study Subject FindingresultCategoryAssociationresultCategoryValue Study Subject FindingresultCategoryAssociationTypeCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryClassCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryMoodCode Study Subject FindingresultSubCategoryAssociationresultSubCategoryValue Study Subject FindingresultSubCategoryAssociationTypeCode Study Subject FindingresultSubCategoryAssociationResultSubCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingreferenceRangeAssociation typeCode='REFV' constraints.validation.error='referenceRangeAssociationTypeCode referenceRangeAssociationreferenceRangeClassCode referenceRangeAssociationreferenceRangeCode referenceRangeAssociationreferenceRangeCodeP referenceRangeAssociationreferenceRangeInterpretationCode referenceRangeAssociationreferenceRangeMoodCode referenceRangeAssociationreferenceRangeValue' constraints.validation.query='referenceRangeAssociationreferenceRangeClassCode referenceRangeAssociationreferenceRangeCode referenceRangeAssociationreferenceRangeCodeP referenceRangeAssociationreferenceRangeInterpretationCode referenceRangeAssociationreferenceRangeMoodCode referenceRangeAssociationreferenceRangeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingreferenceRangeAssociationreferenceRange classCode='OBS' constraints.validation.error='referenceRangeClassCode referenceRangeCode referenceRangeCodeP referenceRangeInterpretationCode referenceRangeMoodCode referenceRangeValue' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' interpretationCode.codeSystem='2.16.840.1.113883.5.83' interpretationCode.codeSystemName='ObservationInterpretation' moodCode='EVN.CRT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingfastingAssociation typeCode='COMP' constraints.validation.error='fastingAssociationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingfastingAssociationfastingStatus classCode='OBS' constraints.validation.error='fastingStatusClassCode fastingStatusCode fastingStatusCodeP fastingStatusMoodCode fastingStatusValue' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.fastingStatusCode='fastingStatusCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingtoxicityAssociation typeCode='COMP' constraints.validation.error='toxicityAssociationTypeCode toxicityAssociationtoxicityGradeClassCode toxicityAssociationtoxicityGradeCodeP toxicityAssociationtoxicityGradeCode toxicityAssociationtoxicityGradeMoodCode toxicityAssociationtoxicityGradeValue toxicityAssociationtoxicityGradeValueP' constraints.validation.query='toxicityAssociationtoxicityGradeClassCode toxicityAssociationtoxicityGradeCodeP toxicityAssociationtoxicityGradeCode toxicityAssociationtoxicityGradeMoodCode toxicityAssociationtoxicityGradeValue toxicityAssociationtoxicityGradeValueP' constraints.validation.dependOn.toxicityAssociationtoxicityGradeCode='toxicityAssociationtoxicityGradeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingtoxicityAssociationtoxicityGrade classCode='OBS' constraints.validation.error='toxicityGradeClassCode toxicityGradeCode toxicityGradeCodeP toxicityGradeMoodCode toxicityGradeValue toxicityGradeValueP' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.toxicityGradeCode='toxicityGradeCodeP' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingresultCategoryAssociation typeCode='COMP' constraints.validation.error='resultCategoryAssociationTypeCode resultCategoryAssociationresultCategoryClassCode resultCategoryAssociationresultCategoryCode resultCategoryAssociationresultCategoryMoodCode resultCategoryAssociationresultCategoryValue' constraints.validation.query='resultCategoryAssociationresultCategoryClassCode resultCategoryAssociationresultCategoryCode resultCategoryAssociationresultCategoryMoodCode resultCategoryAssociationresultCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingresultCategoryAssociationresultCategory classCode='OBS' constraints.validation.error='resultCategoryClassCode resultCategoryCode resultCategoryMoodCode resultCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingresultSubCategoryAssociation typeCode='COMP' constraints.validation.error='resultSubCategoryAssociationTypeCode resultSubCategoryAssociationResultSubCategory resultSubCategoryAssociationresultSubCategoryClassCode resultSubCategoryAssociationresultSubCategoryCode resultSubCategoryAssociationresultSubCategoryMoodCode resultSubCategoryAssociationresultSubCategoryValue' constraints.validation.query='resultSubCategoryAssociationresultSubCategoryClassCode resultSubCategoryAssociationresultSubCategoryCode resultSubCategoryAssociationresultSubCategoryMoodCode resultSubCategoryAssociationresultSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectFindingresultSubCategoryAssociationresultSubCategory classCode='OBS' constraints.validation.error='resultSubCategoryClassCode resultSubCategoryCode resultSubCategoryMoodCode resultSubCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface StudySubjectFinding extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.103\')'"
   * @generated
   */
  boolean validateStudySubjectFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())'"
   * @generated
   */
  boolean validateStudySubjectFindingTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingReferenceRangeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier))'"
   * @generated
   */
  boolean validateStudySubjectFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information))'"
   * @generated
   */
  boolean validateStudySubjectFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingreferenceRangeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingfastingAssociationfastingStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingfastingAssociationfastingStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingfastingAssociationfastingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingfastingAssociationfastingStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingtoxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   * @generated
   */
  public StudySubjectFinding init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudySubjectFinding init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // StudySubjectFinding
