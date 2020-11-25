/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Imaging Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDiagnosticImagingReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId DiagnosticImagingReportSectionsHaveText GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP GeneralHeaderConstraintsId DiagnosticImagingReportInformant DiagnosticImagingReportDocumentationOf DiagnosticImagingReportFindingsSection DiagnosticImagingReportParticipantAssociatedEntityPersonName DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson DiagnosticImagingReportParticipantAssociatedEntity DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode DiagnosticImagingReportDocumentationOfServiceEvent4Code DiagnosticImagingReportDocumentationOfServiceEvent3 DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime DiagnosticImagingReportComponentOfEncompassingEncounter7Id DiagnosticImagingReportComponentOfEncompassingEncounter' templateId.root='2.16.840.1.113883.10.20.22.1.5' constraints.validation.warning='DiagnosticImagingReportUseDiagnosticImagingCode DiagnosticImagingReportAllSectionsHaveTitle DiagnosticImagingReportDICOMObjectCatalogSection DiagnosticImagingReportDocumentationOfServiceEvent4Id DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute DiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.info='DiagnosticImagingReportInformationRecipient DiagnosticImagingReportParticipant1 DiagnosticImagingReportInFulfillmentOf DiagnosticImagingReportRelatedDocument DiagnosticImagingReportComponentOf DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty' constraints.validation.query='DiagnosticImagingReportParticipantAssociatedEntityPersonName DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson DiagnosticImagingReportParticipantAssociatedEntity DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode DiagnosticImagingReportDocumentationOfServiceEvent4Code DiagnosticImagingReportDocumentationOfServiceEvent4Id DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer DiagnosticImagingReportDocumentationOfServiceEvent3 DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond DiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime DiagnosticImagingReportComponentOfEncompassingEncounter7Id DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty DiagnosticImagingReportComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipant constraints.validation.error='DiagnosticImagingReportParticipantAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipantAssociatedEntity constraints.validation.error='DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipantAssociatedEntityPerson constraints.validation.error='DiagnosticImagingReportParticipantAssociatedEntityPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportDocumentationOf constraints.validation.error='DiagnosticImagingReportDocumentationOfServiceEvent3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportDocumentationOfServiceEvent4 classCode='ACT' constraints.validation.error='DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode DiagnosticImagingReportDocumentationOfServiceEvent4Code' constraints.validation.warning='DiagnosticImagingReportDocumentationOfServiceEvent4Id DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOf constraints.validation.error='DiagnosticImagingReportComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7 constraints.validation.error='DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime DiagnosticImagingReportComponentOfEncompassingEncounter7Id' constraints.validation.warning='DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute DiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant' constraints.validation.info='DiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty constraints.validation.error='DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity constraints.validation.warning='DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization'"
 *        annotation="duplicates"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;reject(section : cda::Section | section.templateId-&gt;exists(root = \'2.16.840.1.113883.10.20.6.1.1\'))-&gt;forAll(section : cda::Section | not section.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;reject(section : cda::Section | section.templateId-&gt;exists(root = \'2.16.840.1.113883.10.20.6.1.1\'))-&gt;forAll(section : cda::Section | not section.text.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant-&gt;select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))-&gt;isEmpty()'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf-&gt;one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument-&gt;one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).associatedEntity-&gt;excluding(null).associatedPerson-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (name-&gt;size() =  1))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).associatedEntity-&gt;excluding(null)-&gt;reject(associatedPerson-&gt;one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\') and classCode=vocab::ActClassRoot::ACT)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null)-&gt;reject(serviceEvent-&gt;one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).responsibleParty-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject(assignedPerson-&gt;size() = 1 or representedOrganization-&gt;size() = 1)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).responsibleParty-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() &gt;= 8)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() &gt;= 12)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() &gt;= 14)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() &gt; 8 implies effectiveTime.value.size() &gt;= 15)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(encounterParticipant-&gt;one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(responsibleParty-&gt;one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null)-&gt;reject(encompassingEncounter-&gt;one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::FindingsSection)'"
	 * @generated
	 */
	FindingsSection getFindingsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::DICOMObjectCatalogSection)'"
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
