/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Data Non Clinical Trials</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getSubjectDataNonClinicalTrials()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical Trials'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Subject Data Non-Clinical TrialsTemplateId Subject Data Non-Clinical TrialsClassCode Subject Data Non-Clinical TrialsMoodCode Subject Data Non-Clinical TrialsCode Subject Data Non-Clinical TrialsCodeP Subject Data Non-Clinical TrialsConfidentialityCode Subject Data Non-Clinical TrialsEffectiveTime Subject Data Non-Clinical TrialsId Subject Data Non-Clinical TrialsSetId Subject Data Non-Clinical TrialsVersionNumber Subject Data Non-Clinical TrialsNon-human Subject Data Document Body Subject Data Non-Clinical TrialsStudyRelationship2 Subject Data Non-Clinical TrialsSubjectParticipation2 Subject Data Non-Clinical TrialsCustodian Subject Data Non-Clinical TrialsAuthor' templateId.root='2.16.840.1.113883.10.20.23.12' classCode='DOCCLIN' moodCode='EVN' code.code='TBD' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthor typeCode='AUT' constraints.validation.error='Subject Data Non-Clinical TrialsAuthorTypeCode Subject Data Non-Clinical TrialsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorAssignedAuthor classCode='ASSIGNED' constraints.validation.error='Subject Data Non-Clinical TrialsAuthorAssignedAuthorClassCode Subject Data Non-Clinical TrialsAuthorAssignedAuthorId Subject Data Non-Clinical TrialsAuthorAssignedAuthorAuthorPerson Subject Data Non-Clinical TrialsAuthorAssignedAuthorStudySite'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorAssignedAuthorAuthorPerson classCode='PSN' constraints.validation.error='Subject Data Non-Clinical TrialsAuthorAssignedAuthorAuthorPersonClassCode Subject Data Non-Clinical TrialsAuthorAssignedAuthorAuthorPersonDeterminerCode Subject Data Non-Clinical TrialsAuthorAssignedAuthorAuthorPersonName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsAuthorAssignedAuthorStudySite classCode='ORG' constraints.validation.error='Subject Data Non-Clinical TrialsAuthorAssignedAuthorStudySiteClassCode Subject Data Non-Clinical TrialsAuthorAssignedAuthorStudySiteDeterminerCode Subject Data Non-Clinical TrialsAuthorAssignedAuthorStudySiteId Subject Data Non-Clinical TrialsAuthorAssignedAuthorStudySiteAddr' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsStudyRelationship typeCode='DOC' constraints.validation.error='Subject Data Non-Clinical TrialsStudyRelationshipTypeCode Subject Data Non-Clinical TrialsStudyRelationshipStudy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsStudyRelationshipStudy classCode='ACT' constraints.validation.error='Subject Data Non-Clinical TrialsStudyRelationshipStudyClassCode Subject Data Non-Clinical TrialsStudyRelationshipStudyMoodCode Subject Data Non-Clinical TrialsStudyRelationshipStudyCode Subject Data Non-Clinical TrialsStudyRelationshipStudyId' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipation typeCode='RCT' constraints.validation.error='Subject Data Non-Clinical TrialsSubjectParticipationTypeCode Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipationStudySubjectRole classCode='PAT' constraints.validation.error='Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleClassCode Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsSubjectParticipationStudySubjectRoleStudySubject classCode='PSN' constraints.validation.error='Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectClassCode Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectDeterminerCode Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectAdministrativeGenderCode Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectAdministrativeGenderCodeP' determinerCode='INSTANCE' administrativeGenderCode.codeSystem='2.16.840.1.113883.3.26.1.1' administrativeGenderCode.codeSystemName='NCI Thesaurus' constraints.validation.warning='Subject Data Non-Clinical TrialsSubjectParticipationStudySubjectRoleStudySubjectBirthTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsCustodian typeCode='CST' constraints.validation.error='Subject Data Non-Clinical TrialsCustodianTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsCustodianAssignedCustodian classCode='ASSIGNED' constraints.validation.error='Subject Data Non-Clinical TrialsCustodianAssignedCustodianClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmSubjectDataNonClinicalTrialsCustodianAssignedCustodianCustodianOrganization classCode='ORG' constraints.validation.error='Subject Data Non-Clinical TrialsCustodianAssignedCustodianCustodianOrganizationClassCode Subject Data Non-Clinical TrialsCustodianAssignedCustodianCustodianOrganizationDeterminerCode Subject Data Non-Clinical TrialsCustodianAssignedCustodianCustodianOrganizationId Subject Data Non-Clinical TrialsCustodianAssignedCustodianCustodianOrganizationName' determinerCode='INSTANCE'"
 * @generated
 */
public interface SubjectDataNonClinicalTrials extends org.eclipse.mdht.uml.cda.ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.12\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClinicalDocument::DOCCLIN'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsConfidentialityCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsConfidentialityCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.25\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsEffectiveTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.effectiveTime.oclIsUndefined()'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.id.oclIsUndefined()'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsLanguageCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsRealmCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (not self.realmCode->isEmpty())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsSetId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsVersionNumber'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsNon-human Subject Data Document Body'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::NonhumanSubjectDataDocumentSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsStudyRelationship2'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsSubjectParticipation2'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateSubjectDataNonClinicalTrialsSubjectParticipation2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsCustodian'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateSubjectDataNonClinicalTrialsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subject Data Non-Clinical TrialsAuthor'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateSubjectDataNonClinicalTrialsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getNon-human Subject Data Document Bodies'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::NonhumanSubjectDataDocumentSection)).oclAsType(sdtm::NonhumanSubjectDataDocumentSection)'"
	 * @generated
	 */
	EList<NonhumanSubjectDataDocumentSection> getNonhumanSubjectDataDocumentBodies();

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
    public SubjectDataNonClinicalTrials init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // SubjectDataNonClinicalTrials
