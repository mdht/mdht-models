/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Imaging Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDiagnosticImagingReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DiagnosticImagingReportTemplateId DiagnosticImagingReportSectionsHaveText DiagnosticImagingReportCode DiagnosticImagingReportCodeP DiagnosticImagingReportId DiagnosticImagingReportInformant DiagnosticImagingReportDocumentationOf DiagnosticImagingReportFindingsSection DiagnosticImagingReportParticipantAssociatedEntityPersonName DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson DiagnosticImagingReportParticipantAssociatedEntity DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode DiagnosticImagingReportDocumentationOfServiceEvent4Code DiagnosticImagingReportDocumentationOfServiceEvent3 DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime DiagnosticImagingReportComponentOfEncompassingEncounter7Id DiagnosticImagingReportComponentOfEncompassingEncounter' templateId.root='2.16.840.1.113883.10.20.22.1.5' constraints.validation.warning='DiagnosticImagingReportUseDiagnosticImagingCode DiagnosticImagingReportAllSectionsHaveTitle DiagnosticImagingReportDICOMObjectCatalogSection DiagnosticImagingReportDocumentationOfServiceEvent4Id DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.DiagnosticImagingReportCode='DiagnosticImagingReportCodeP' constraints.validation.info='DiagnosticImagingReportInformationRecipient DiagnosticImagingReportParticipant1 DiagnosticImagingReportInFulfillmentOf DiagnosticImagingReportRelatedDocument DiagnosticImagingReportComponentOf DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty' constraints.validation.query='DiagnosticImagingReportParticipantAssociatedEntityPersonName DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson DiagnosticImagingReportParticipantAssociatedEntity DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode DiagnosticImagingReportDocumentationOfServiceEvent4Code DiagnosticImagingReportDocumentationOfServiceEvent4Id DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer DiagnosticImagingReportDocumentationOfServiceEvent3 DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime DiagnosticImagingReportComponentOfEncompassingEncounter7Id DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty DiagnosticImagingReportComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipant constraints.validation.error='ParticipantAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipantAssociatedEntity constraints.validation.error='AssociatedEntityAssociatedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipantAssociatedEntityPerson constraints.validation.error='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportDocumentationOf constraints.validation.error='DocumentationOfServiceEvent3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportDocumentationOfServiceEvent4 classCode='ACT' constraints.validation.error='ServiceEvent4ClassCode ServiceEvent4Code' constraints.validation.warning='ServiceEvent4Id ServiceEvent4PhysicianReadingStudyPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOf constraints.validation.error='ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7 constraints.validation.error='EncompassingEncounter7EffectiveTime EncompassingEncounter7Id' constraints.validation.warning='EncompassingEncounter7PhysicianofRecordParticipant' constraints.validation.info='EncompassingEncounter7ResponsibleParty'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty constraints.validation.error='ResponsiblePartyAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity constraints.validation.warning='AssignedEntityHasAssignPersonOrRepresentedOrganization'"
 * @generated
 */
public interface DiagnosticImagingReport extends GeneralHeaderConstraints {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.code = \'18748-4\''"
	* @generated
	*/
	boolean validateDiagnosticImagingReportUseDiagnosticImagingCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = \'2.16.840.1.113883.10.20.6.1.1\'))->forAll(section : cda::Section | not section.title.oclIsUndefined())'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = \'2.16.840.1.113883.10.20.6.1.1\'))->forAll(section : cda::Section | not section.text.oclIsUndefined())'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportSectionsHaveText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.1.5\')'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReportCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'18748-4\' or value.code = \'18747-6\' or value.code = \'18755-9\' or value.code = \'18760-9\' or value.code = \'18757-5\' or value.code = \'18758-3\' or value.code = \'18745-0\' or value.code = \'11522-0\' or value.code = \'18746-8\' or value.code = \'18751-8\' or value.code = \'11525-3\'))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))->isEmpty()'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportInformant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReportDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportFindingsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportDICOMObjectCatalogSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	* @generated
	*/
	boolean validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::ActClassRoot::ACT)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportDocumentationOfServiceEvent3(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->size() = 1 or representedOrganization->size() = 1)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->any(true).oclAsType(consol::FindingsSection)'"
	 * @generated
	 */
	FindingsSection getFindingsSection();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))->asSequence()->any(true).oclAsType(consol::DICOMObjectCatalogSection)'"
	* @generated
	*/
	DICOMObjectCatalogSection getDICOMObjectCatalogSection();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DiagnosticImagingReport init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DiagnosticImagingReport
