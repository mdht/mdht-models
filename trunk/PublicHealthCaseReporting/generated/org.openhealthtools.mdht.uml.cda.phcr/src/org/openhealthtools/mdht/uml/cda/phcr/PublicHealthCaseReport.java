/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Health Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage#getPublicHealthCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' constraints.validation.info='PublicHealthCaseReportImmunizationsSection' templateId.root='2.16.840.1.113883.10.20.15' constraints.validation.error='PublicHealthCaseReportTemplateId PublicHealthCaseReportPHCRRecordTarget PublicHealthCaseReportPHCRRecordTargetPatientRole PublicHealthCaseReportPHCRRecordTargetPatientRoleId PublicHealthCaseReportPHCRAuthor PublicHealthCaseReportPHCRAuthorTiime PublicHealthCaseReportPHCRAuthorAssignedAuthor PublicHealthCaseReportPHCRAuthorAssignedAuthorId PublicHealthCaseReportPHCRAuthorAssignedAuthorAddr PublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom PublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName PublicHealthCaseReportPHCRLegalAuthenticator PublicHealthCaseReportPHCRLegalAuthenticatorTime PublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity PublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId PublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr PublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName PublicHealthCaseReportCode PublicHealthCaseReportCodeP PublicHealthCaseReportPhcrClinicalInformationSection' constraints.validation.dependOn.PublicHealthCaseReportCode='PublicHealthCaseReportCodeP' code.displayName='Public Health Case Report' code.codeSystem='2.16.840.1.113883.6.1' code.code='55751-2' constraints.validation.warning='PublicHealthCaseReportPhcrSocialHistorySection PublicHealthCaseReportPhcrTreatmentInformationSection PublicHealthCaseReportPhcrEncountersSection PublicHealthCaseReportPhcrRelevantDxTestsSection'"
 * @generated
 */
public interface PublicHealthCaseReport extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRRecordTargetPatientRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget.patientRole.id->exists(id : datatypes::II | not id.root.oclIsUndefined() or not id.extension.oclIsUndefined() or not id.nullFlavor.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget.patientRole.id->exists(id : datatypes::II | not id.root.oclIsUndefined() or not id.extension.oclIsUndefined() or not id.nullFlavor.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.time->one(time : datatypes::TS | not time.value.oclIsUndefined() or not time.nullFlavor.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author.time->one(time : datatypes::TS | not time.value.oclIsUndefined() or not time.nullFlavor.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthorTiime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor.id->exists(id : datatypes::II | not id.root.oclIsUndefined() or not id.extension.oclIsUndefined() or not id.nullFlavor.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author.assignedAuthor.id->exists(id : datatypes::II | not id.root.oclIsUndefined() or not id.extension.oclIsUndefined() or not id.nullFlavor.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor.addr->one(addr : datatypes::AD | not addr.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author.assignedAuthor.addr->one(addr : datatypes::AD | not addr.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor.telecom->one(tel : datatypes::TEL | not tel.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author.assignedAuthor.telecom->one(tel : datatypes::TEL | not tel.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined()) and self.author.assignedAuthor.assignedPerson.name->one(name : datatypes::PN | not name.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author.assignedAuthor.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined()) and self.author.assignedAuthor.assignedPerson.name->one(name : datatypes::PN | not name.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.time->one(time : datatypes::TS | not time.value.oclIsUndefined() or not time.nullFlavor.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.time->one(time : datatypes::TS | not time.value.oclIsUndefined() or not time.nullFlavor.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity.id->exists(id : datatypes::II | not id.root.oclIsUndefined() or not id.extension.oclIsUndefined() or not id.nullFlavor.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.assignedEntity.id->exists(id : datatypes::II | not id.root.oclIsUndefined() or not id.extension.oclIsUndefined() or not id.nullFlavor.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity.addr->one(addr : datatypes::AD | not addr.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.assignedEntity.addr->one(addr : datatypes::AD | not addr.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined()) and self.legalAuthenticator.assignedEntity.assignedPerson.name->one(name : datatypes::PN | not name.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.assignedEntity.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined()) and self.legalAuthenticator.assignedEntity.assignedPerson.name->one(name : datatypes::PN | not name.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.15\')'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePublicHealthCaseReportCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '55751-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'55751-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrSocialHistorySection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrSocialHistorySection))'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPhcrSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrClinicalInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrClinicalInformationSection))'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrTreatmentInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrTreatmentInformationSection))'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPhcrTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPhcrEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrRelevantDxTestsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrRelevantDxTestsSection))'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))'"
	 * @generated
	 */
	boolean validatePublicHealthCaseReportImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrSocialHistorySection))->asSequence()->first().oclAsType(phcr::PhcrSocialHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrSocialHistorySection))->asSequence()->first().oclAsType(phcr::PhcrSocialHistorySection)'"
	 * @generated
	 */
	PhcrSocialHistorySection getPhcrSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrClinicalInformationSection))->asSequence()->first().oclAsType(phcr::PhcrClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrClinicalInformationSection))->asSequence()->first().oclAsType(phcr::PhcrClinicalInformationSection)'"
	 * @generated
	 */
	PhcrClinicalInformationSection getPhcrClinicalInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrTreatmentInformationSection))->asSequence()->first().oclAsType(phcr::PhcrTreatmentInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrTreatmentInformationSection))->asSequence()->first().oclAsType(phcr::PhcrTreatmentInformationSection)'"
	 * @generated
	 */
	PhcrTreatmentInformationSection getPhcrTreatmentInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))->asSequence()->first().oclAsType(phcr::PhcrEncountersSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))->asSequence()->first().oclAsType(phcr::PhcrEncountersSection)'"
	 * @generated
	 */
	PhcrEncountersSection getPhcrEncountersSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(phcr::PhcrRelevantDxTestsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(phcr::PhcrRelevantDxTestsSection)'"
	 * @generated
	 */
	PhcrRelevantDxTestsSection getPhcrRelevantDxTestsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))->asSequence()->first().oclAsType(ccd::ImmunizationsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))->asSequence()->first().oclAsType(ccd::ImmunizationsSection)'"
	 * @generated
	 */
	ImmunizationsSection getImmunizationsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicHealthCaseReport init();
} // PublicHealthCaseReport
