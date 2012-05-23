/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Data Non Clinical Trials</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getSubjectDataNonClinicalTrials()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.10.20.23.12' constraints.validation.error='Subject Data Non-Clinical TrialsTemplateId Subject Data Non-Clinical TrialsClassCode Subject Data Non-Clinical TrialsCode Subject Data Non-Clinical TrialsCodeP Subject Data Non-Clinical TrialsConfidentialityCode Subject Data Non-Clinical TrialsEffectiveTime Subject Data Non-Clinical TrialsId Subject Data Non-Clinical TrialsMoodCode Subject Data Non-Clinical TrialsSetId Subject Data Non-Clinical TrialsVersionNumber' confidentialityCode.codeSystemName='Confidentiality' code.code='TBD' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' constraints.validation.info='Subject Data Non-Clinical TrialsLanguageCode Subject Data Non-Clinical TrialsRealmCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipation constraints.validation.error='AuthorParticipationTypeCode' typeCode='AUT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipationAssignedAuthor constraints.validation.error='AssignedAuthorClassCode AssignedAuthorId' classCode='ASSIGNED'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipationAssignedAuthorAuthorPerson constraints.validation.error='AuthorPersonClassCode AuthorPersonDeterminerCode AuthorPersonName' determinerCode='INSTANCE' classCode='PSN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorParticipationAssignedAuthorStudySite constraints.validation.error='StudySiteClassCode StudySiteDeterminerCode StudySiteId StudySiteAddr' determinerCode='INSTANCE' classCode='ORG'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsStudyRelationship constraints.validation.error='StudyRelationshipTypeCode' typeCode='DOC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsStudyRelationshipStudy constraints.validation.error='StudyClassCode StudyCode StudyId StudyMoodCode' classCode='ACT' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipation constraints.validation.error='SubjectParticipationTypeCode' typeCode='RCT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipationStudySubjectRole constraints.validation.error='StudySubjectRoleClassCode StudySubjectRoleId' classCode='PAT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipationStudySubjectRoleStudySubject administrativeGenderCode.codeSystemName='NCI Thesaurus' constraints.validation.error='StudySubjectAdministrativeGenderCode StudySubjectAdministrativeGenderCodeP StudySubjectClassCode StudySubjectDeterminerCode' determinerCode='INSTANCE' constraints.validation.warning='StudySubjectBirthTime StudySubjectEthnicGroupCode StudySubjectRaceCode' classCode='PSN' administrativeGenderCode.codeSystem='2.16.840.1.113883.3.26.1.1'"
 * @generated
 */
public interface SubjectDataNonClinicalTrials extends ClinicalDocument
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.12')
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
   * isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())
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
   * (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.5.25')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.25\')'"
   * @generated
   */
  boolean validateSubjectDataNonClinicalTrialsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.effectiveTime.oclIsUndefined()
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
   * not self.id.oclIsUndefined()
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
   * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
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
   * isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
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
   * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (not self.realmCode->isEmpty())
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
   * (self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
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
   * (self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
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
   * @generated
   */
  public SubjectDataNonClinicalTrials init();
} // SubjectDataNonClinicalTrials
