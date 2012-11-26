/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getReportingFetalDeathInformationfromaclinicalsettingtovitalrecords()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Reporting Fetal Death Information from a clinical setting to vital recordsTemplateId Reporting Fetal Death Information from a clinical setting to vital recordsCode Reporting Fetal Death Information from a clinical setting to vital recordsCodeP Reporting Fetal Death Information from a clinical setting to vital recordsConfidentialityCode Reporting Fetal Death Information from a clinical setting to vital recordsConfidentialityCodeP Reporting Fetal Death Information from a clinical setting to vital recordsEffectiveTime Reporting Fetal Death Information from a clinical setting to vital recordsId Reporting Fetal Death Information from a clinical setting to vital recordsLanguageCode Reporting Fetal Death Information from a clinical setting to vital recordsMoodCode Reporting Fetal Death Information from a clinical setting to vital recordsRealmCode Reporting Fetal Death Information from a clinical setting to vital recordsRealmCodeP Reporting Fetal Death Information from a clinical setting to vital recordsAuthor Reporting Fetal Death Information from a clinical setting to vital recordsCustodian Reporting Fetal Death Information from a clinical setting to vital recordsRecordTarget Reporting Fetal Death Information from a clinical setting to vital recordsFetal Death Reporting - Prenatal Experience Section Reporting Fetal Death Information from a clinical setting to vital recordsLabor and Delivery Section Reporting Fetal Death Information from a clinical setting to vital recordsFetus Section' templateId.root='2.16.840.1.113883.10.20.26.2' classCode='DOCCLIN' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor typeCode='AUT' constraints.validation.error='AuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor constraints.validation.warning='AssignedAuthorId' constraints.validation.error='AssignedAuthorAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget typeCode='RCT' constraints.validation.error='RecordTargetTypeCode RecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole constraints.validation.warning='PatientRoleAddr' constraints.validation.error='PatientRoleId PatientRoleClassCode' classCode='PAT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient classCode='PSN' constraints.validation.error='PatientClassCode PatientDeterminerCode PatientName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian typeCode='CST' constraints.validation.error='CustodianTypeCode'"
 * @generated
 */
public interface ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords extends ClinicalDocument
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.2')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.2\')'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::ActMood::EVN'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
   * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
   * value.code = 'US'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = element.oclAsType(datatypes::CS) in \r\nvalue.code = \'US\'))'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetal Death Reporting - Prenatal Experience Section))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetal Death Reporting - Prenatal Experience Section))'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeathReportingPrenatalExperienceSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Section))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Section))'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetus Section))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetus Section))'"
   * @generated
   */
  boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetusSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetal Death Reporting - Prenatal Experience Section))->asSequence()->any(true).oclAsType(vsbr::Fetal Death Reporting - Prenatal Experience Section)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetal Death Reporting - Prenatal Experience Section))->asSequence()->any(true).oclAsType(vsbr::Fetal Death Reporting - Prenatal Experience Section)'"
   * @generated
   */
  FetalDeathReportingPrenatalExperienceSection getFetalDeathReportingPrenatalExperienceSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Section))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Section)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Section))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Section)'"
   * @generated
   */
  LaborandDeliverySection getLaborandDeliverySection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetus Section))->asSequence()->any(true).oclAsType(vsbr::Fetus Section)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Fetus Section))->asSequence()->any(true).oclAsType(vsbr::Fetus Section)'"
   * @generated
   */
  FetusSection getFetusSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords init();
} // ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords
