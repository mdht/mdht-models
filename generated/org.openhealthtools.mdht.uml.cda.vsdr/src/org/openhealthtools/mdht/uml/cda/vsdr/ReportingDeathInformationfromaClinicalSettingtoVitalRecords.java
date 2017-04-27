/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getReportingDeathInformationfromaClinicalSettingtoVitalRecords()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital Records'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsTemplateId Reporting Death Information from a Clinical Setting to Vital RecordsClassCode Reporting Death Information from a Clinical Setting to Vital RecordsMoodCode Reporting Death Information from a Clinical Setting to Vital RecordsCode Reporting Death Information from a Clinical Setting to Vital RecordsCodeP Reporting Death Information from a Clinical Setting to Vital RecordsConfidentialityCode Reporting Death Information from a Clinical Setting to Vital RecordsConfidentialityCodeP Reporting Death Information from a Clinical Setting to Vital RecordsId Reporting Death Information from a Clinical Setting to Vital RecordsRealmCode Reporting Death Information from a Clinical Setting to Vital RecordsRealmCodeP Reporting Death Information from a Clinical Setting to Vital RecordsEffectiveTime Reporting Death Information from a Clinical Setting to Vital RecordsCustodian Reporting Death Information from a Clinical Setting to Vital RecordsDeathReportDocumentBody Reporting Death Information from a Clinical Setting to Vital RecordsAuthor Reporting Death Information from a Clinical Setting to Vital RecordsRecordTarget Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodian' templateId.root='2.16.840.1.113883.10.20.26.1' classCode='DOCCLIN' moodCode='EVN' code.code='69409-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='U.S. standard certificate of death - 2003 revision'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodian Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId' constraints.validation.query='Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganization constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor typeCode='AUT' constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsAuthorTypeCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorTime Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthor classCode='ASSIGNED' constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorClassCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorId Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorAssignedAuthorAuthoringPerson classCode='PSN' constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPersonClassCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode Reporting Death Information from a Clinical Setting to Vital RecordsAuthorAssignedAuthorAuthoringPersonName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget typeCode='RCT' constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetTypeCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatient classCode='PAT' constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientClassCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientId Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientAddr Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetPatientPerson administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode' constraints.validation.error='Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonAdministrativeGenderCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonAdministrativeGenderCodeP Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonClassCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonDeterminerCode Reporting Death Information from a Clinical Setting to Vital RecordsRecordTargetPatientPersonName' classCode='PSN' determinerCode='INSTANCE'"
 * @generated
 */
public interface ReportingDeathInformationfromaClinicalSettingtoVitalRecords extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1\')'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClinicalDocument::DOCCLIN'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'69409-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsConfidentialityCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsConfidentialityCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.11.3883.5.25\')'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.id.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsLanguageCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsRealmCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = element.oclAsType(datatypes::CS) in \nvalue.code = \'US\')'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsRealmCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.realmCode->size() = 1'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsTitle'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsEffectiveTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsCustodian'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsDeathReportDocumentBody'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::DeathReportDocumentBody))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsAuthor'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsRecordTarget'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationName'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodianCustodianOrganizationId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Reporting Death Information from a Clinical Setting to Vital RecordsCustodianAssignedCustodian'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
	 * @generated
	 */
	boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::DeathReportDocumentBody))->asSequence()->any(true).oclAsType(vsdr::DeathReportDocumentBody)'"
	 * @generated
	 */
	DeathReportDocumentBody getDeathReportDocumentBody();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingDeathInformationfromaClinicalSettingtoVitalRecords init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReportingDeathInformationfromaClinicalSettingtoVitalRecords init(Iterable<? extends Initializer<? extends EObject>> initializers);

} // ReportingDeathInformationfromaClinicalSettingtoVitalRecords
