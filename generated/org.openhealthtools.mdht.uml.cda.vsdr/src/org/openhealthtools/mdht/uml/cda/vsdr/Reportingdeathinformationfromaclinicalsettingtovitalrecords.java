/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getReportingdeathinformationfromaclinicalsettingtovitalrecords()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Reporting death information from a clinical setting to vital recordsTemplateId Reporting death information from a clinical setting to vital recordsClassCode Reporting death information from a clinical setting to vital recordsCode Reporting death information from a clinical setting to vital recordsCodeP Reporting death information from a clinical setting to vital recordsId Reporting death information from a clinical setting to vital recordsMoodCode Reporting death information from a clinical setting to vital recordsRealmCode Reporting death information from a clinical setting to vital recordsEffectiveTime Reporting death information from a clinical setting to vital recordsCustodian Reporting death information from a clinical setting to vital recordsDeath Report Document Body Reporting death information from a clinical setting to vital recordsAuthor Reporting death information from a clinical setting to vital recordsRecordTarget Reporting death information from a clinical setting to vital recordsCustodianAssignedCustodianCustodianOrganizationName Reporting death information from a clinical setting to vital recordsCustodianAssignedCustodianCustodianOrganizationId Reporting death information from a clinical setting to vital recordsCustodianAssignedCustodian Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPersonClassCode Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPersonDeterminerCode Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPersonName Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorClassCode Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorId Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPerson Reporting death information from a clinical setting to vital recordsAuthorTypeCode Reporting death information from a clinical setting to vital recordsAuthorTime Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthor Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonAdministrativeGenderCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonAdministrativeGenderCodeP Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonClassCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonDeterminerCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonName Reporting death information from a clinical setting to vital recordsRecordTargetPatientClassCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientId Reporting death information from a clinical setting to vital recordsRecordTargetPatientPerson Reporting death information from a clinical setting to vital recordsRecordTargetTypeCode Reporting death information from a clinical setting to vital recordsRecordTargetPatient' templateId.root='2.16.840.1.113883.10.20.26.1' classCode='DOCCLIN' code.code='69409-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='U.S. standard certificate of death - 2003 revision'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian constraints.validation.error='CustodianAssignedCustodian CustodianAssignedCustodianCustodianOrganizationName CustodianAssignedCustodianCustodianOrganizationId' constraints.validation.query='CustodianAssignedCustodianCustodianOrganizationName CustodianAssignedCustodianCustodianOrganizationId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization constraints.validation.error='CustodianOrganizationName CustodianOrganizationId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor typeCode='AUT' constraints.validation.error='AuthorTypeCode AuthorTime AuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor classCode='ASSIGNED' constraints.validation.error='AssignedAuthorClassCode AssignedAuthorId AssignedAuthorAuthoringPerson AssignedAuthorAuthoringPersonClassCode AssignedAuthorAuthoringPersonDeterminerCode AssignedAuthorAuthoringPersonName' constraints.validation.query='AssignedAuthorAuthoringPersonClassCode AssignedAuthorAuthoringPersonDeterminerCode AssignedAuthorAuthoringPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson classCode='PSN' constraints.validation.error='AuthoringPersonClassCode AuthoringPersonDeterminerCode AuthoringPersonName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget typeCode='RCT' constraints.validation.error='RecordTargetTypeCode RecordTargetPatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient classCode='PAT' constraints.validation.error='PatientClassCode PatientId PatientPerson PatientPersonAdministrativeGenderCode PatientPersonAdministrativeGenderCodeP PatientPersonClassCode PatientPersonDeterminerCode PatientPersonName' constraints.validation.warning='PatientAddr PatientPersonBirthTime' constraints.validation.query='PatientPersonAdministrativeGenderCode PatientPersonAdministrativeGenderCodeP PatientPersonBirthTime PatientPersonClassCode PatientPersonDeterminerCode PatientPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode' constraints.validation.error='PersonAdministrativeGenderCode PersonAdministrativeGenderCodeP PersonClassCode PersonDeterminerCode PersonName' constraints.validation.warning='PersonBirthTime' classCode='PSN' determinerCode='INSTANCE'"
 * @generated
 */
public interface Reportingdeathinformationfromaclinicalsettingtovitalrecords extends ClinicalDocument
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1\')'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '69409-1' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'69409-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.11.3883.5.25')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.11.3883.5.25\')'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.realmCode->size() = 1
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.realmCode->size() = 1'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClass::PSN)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::AUT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationType::AUT)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.5.1'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.1\'))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClass::PSN)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClass::PAT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClass::PAT)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::RCT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationType::RCT)'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
   * @generated
   */
  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))->asSequence()->any(true).oclAsType(vsdr::Death Report Document Body)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))->asSequence()->any(true).oclAsType(vsdr::Death Report Document Body)'"
   * @generated
   */
  DeathReportDocumentBody getDeathReportDocumentBody();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reportingdeathinformationfromaclinicalsettingtovitalrecords init();
} // Reportingdeathinformationfromaclinicalsettingtovitalrecords
