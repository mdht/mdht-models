/**
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
 * A representation of the model object '<em><b>Subject Data Human Clinical Trials</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getSubjectDataHumanClinicalTrials()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Subject Data Human Clinical TrialsTemplateId Subject Data Human Clinical TrialsClassCode Subject Data Human Clinical TrialsMoodCode Subject Data Human Clinical TrialsCode Subject Data Human Clinical TrialsCodeP Subject Data Human Clinical TrialsConfidentialityCode Subject Data Human Clinical TrialsEffectiveTime Subject Data Human Clinical TrialsId Subject Data Human Clinical TrialsSetId Subject Data Human Clinical TrialsVersionNumber Subject Data Human Clinical TrialsStudyRelationship Subject Data Human Clinical TrialsSubjectParticipation Subject Data Human Clinical TrialsAuthor Subject Data Human Clinical TrialsCustodian Subject Data Human Clinical TrialsHuman Clinical Subject Data Document Section' templateId.root='2.16.840.1.113883.10.20.23.11' classCode='DOCCLIN' moodCode='EVN' code.code='TBD' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsStudyRelationship typeCode='DOC' constraints.validation.error='Subject Data Human Clinical TrialsStudyRelationshipTypeCode Subject Data Human Clinical TrialsStudyRelationshipStudy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsStudyRelationshipStudy classCode='CLNTRL' constraints.validation.error='Subject Data Human Clinical TrialsStudyRelationshipStudyClassCode Subject Data Human Clinical TrialsStudyRelationshipStudyCode Subject Data Human Clinical TrialsStudyRelationshipStudyId Subject Data Human Clinical TrialsStudyRelationshipStudyMoodCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsSubjectParticipation typeCode='RCT' constraints.validation.error='Subject Data Human Clinical TrialsSubjectParticipationTypeCode Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsSubjectParticipationStudySubjectRole classCode='PAT' constraints.validation.error='Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleClassCode Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleId Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleStudySubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsSubjectParticipationStudySubjectRoleStudySubject classCode='PSN' constraints.validation.error='Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectClassCode Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectDeterminerCode Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectAdministrativeGenderCode Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectAdministrativeGenderCodeP' determinerCode='INSTANCE' administrativeGenderCode.codeSystem='2.16.840.1.113883.3.26.1.1' administrativeGenderCode.codeSystemName='NCI Thesaurus' constraints.validation.info='Subject Data Human Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectBirthTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsAuthor typeCode='AUT' constraints.validation.error='Subject Data Human Clinical TrialsAuthorTypeCode Subject Data Human Clinical TrialsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsAuthorAssignedAuthor classCode='ASSIGNED' constraints.validation.error='Subject Data Human Clinical TrialsAuthorAssignedAuthorClassCode Subject Data Human Clinical TrialsAuthorAssignedAuthorId Subject Data Human Clinical TrialsAuthorAssignedAuthorAssignedPerson Subject Data Human Clinical TrialsAuthorAssignedAuthorRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsAuthorAssignedAuthorPerson classCode='PSN' constraints.validation.error='Subject Data Human Clinical TrialsAuthorAssignedAuthorPersonClassCode Subject Data Human Clinical TrialsAuthorAssignedAuthorPersonDeterminerCode Subject Data Human Clinical TrialsAuthorAssignedAuthorPersonName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsAuthorAssignedAuthorOrganization constraints.validation.error='Subject Data Human Clinical TrialsAuthorAssignedAuthorOrganizationAddr Subject Data Human Clinical TrialsAuthorAssignedAuthorOrganizationClassCode Subject Data Human Clinical TrialsAuthorAssignedAuthorOrganizationDeterminerCode Subject Data Human Clinical TrialsAuthorAssignedAuthorOrganizationId' classCode='ORG' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsCustodian typeCode='CST' constraints.validation.error='Subject Data Human Clinical TrialsCustodianTypeCode Subject Data Human Clinical TrialsCustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsCustodianAssignedCustodian classCode='ASSIGNED' constraints.validation.error='Subject Data Human Clinical TrialsCustodianAssignedCustodianClassCode Subject Data Human Clinical TrialsCustodianAssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataHumanClinicalTrialsCustodianAssignedCustodianCustodianOrganization classCode='ORG' constraints.validation.error='Subject Data Human Clinical TrialsCustodianAssignedCustodianCustodianOrganizationClassCode Subject Data Human Clinical TrialsCustodianAssignedCustodianCustodianOrganizationDeterminerCode Subject Data Human Clinical TrialsCustodianAssignedCustodianCustodianOrganizationId Subject Data Human Clinical TrialsCustodianAssignedCustodianCustodianOrganizationName' determinerCode='INSTANCE'"
 * @generated
 */
public interface SubjectDataHumanClinicalTrials extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.11\')'"
	 * @generated
	 */
	boolean validateSubjectDataHumanClinicalTrialsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsSetId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsStudyRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsSubjectParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubjectDataHumanClinicalTrialsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateSubjectDataHumanClinicalTrialsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::HumanClinicalSubjectDataDocumentSection))'"
	 * @generated
	 */
	boolean validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::HumanClinicalSubjectDataDocumentSection))->asSequence()->any(true).oclAsType(sdtm::HumanClinicalSubjectDataDocumentSection)'"
	 * @generated
	 */
	HumanClinicalSubjectDataDocumentSection getHumanClinicalSubjectDataDocumentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectDataHumanClinicalTrials init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectDataHumanClinicalTrials init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SubjectDataHumanClinicalTrials
