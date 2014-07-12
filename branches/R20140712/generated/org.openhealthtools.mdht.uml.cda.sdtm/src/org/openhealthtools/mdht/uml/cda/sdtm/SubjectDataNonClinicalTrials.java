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
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Data Non Clinical Trials</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getSubjectDataNonClinicalTrials()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Subject Data Non-Clinical TrialsTemplateId Subject Data Non-Clinical TrialsClassCode Subject Data Non-Clinical TrialsCode Subject Data Non-Clinical TrialsCodeP Subject Data Non-Clinical TrialsConfidentialityCode Subject Data Non-Clinical TrialsEffectiveTime Subject Data Non-Clinical TrialsId Subject Data Non-Clinical TrialsMoodCode Subject Data Non-Clinical TrialsSetId Subject Data Non-Clinical TrialsVersionNumber Subject Data Non-Clinical TrialsNon-human Subject Data Document Body Subject Data Non-Clinical TrialsAuthorParticipation2 Subject Data Non-Clinical TrialsStudyRelationship2 Subject Data Non-Clinical TrialsSubjectParticipation2' templateId.root='2.16.840.1.113883.10.20.23.12' classCode='DOCCLIN' code.code='TBD' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipation typeCode='AUT' constraints.validation.error='AuthorParticipationTypeCode AuthorParticipationAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipationAssignedAuthor classCode='ASSIGNED' constraints.validation.error='AssignedAuthorClassCode AssignedAuthorId AssignedAuthorAuthorPerson AssignedAuthorStudySite'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipationAssignedAuthorAuthorPerson classCode='PSN' constraints.validation.error='AuthorPersonClassCode AuthorPersonDeterminerCode AuthorPersonName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipationAssignedAuthorStudySite classCode='ORG' constraints.validation.error='StudySiteClassCode StudySiteDeterminerCode StudySiteId StudySiteAddr' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsStudyRelationship typeCode='DOC' constraints.validation.error='StudyRelationshipTypeCode StudyRelationshipStudy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsStudyRelationshipStudy classCode='ACT' constraints.validation.error='StudyClassCode StudyCode StudyId StudyMoodCode StudyEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipation typeCode='RCT' constraints.validation.error='SubjectParticipationTypeCode SubjectParticipationStudySubjectRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipationStudySubjectRole classCode='PAT' constraints.validation.error='StudySubjectRoleClassCode StudySubjectRoleId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipationStudySubjectRoleStudySubject administrativeGenderCode.codeSystem='2.16.840.1.113883.3.26.1.1' administrativeGenderCode.codeSystemName='NCI Thesaurus' constraints.validation.error='StudySubjectAdministrativeGenderCode StudySubjectAdministrativeGenderCodeP StudySubjectClassCode StudySubjectDeterminerCode' constraints.validation.warning='StudySubjectBirthTime' classCode='PSN' determinerCode='INSTANCE'"
 * @generated
 */
public interface SubjectDataNonClinicalTrials extends ClinicalDocument
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.12\')'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClinicalDocument::DOCCLIN'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateSubjectDataNonClinicalTrialsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsConfidentialityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.25\')'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.effectiveTime.oclIsUndefined()'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.id.oclIsUndefined()'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateSubjectDataNonClinicalTrialsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (not self.realmCode->isEmpty())'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsSetId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::Non-human Subject Data Document Body))'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsAuthorParticipation2(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsStudyRelationship2(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsSubjectParticipation2(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::Non-human Subject Data Document Body))->asSequence()->any(true).oclAsType(sdtm::Non-human Subject Data Document Body)'"
   * @generated
   */
  NonhumanSubjectDataDocumentBody getNonhumanSubjectDataDocumentBody();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectDataNonClinicalTrials init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectDataNonClinicalTrials init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SubjectDataNonClinicalTrials
