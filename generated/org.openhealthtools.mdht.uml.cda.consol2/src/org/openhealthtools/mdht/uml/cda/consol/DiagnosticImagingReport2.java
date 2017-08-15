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
 * A representation of the model object '<em><b>Diagnostic Imaging Report2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDiagnosticImagingReport2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId DiagnosticImagingReport2Id DiagnosticImagingReport2CodeP DiagnosticImagingReport2DocumentationOf DiagnosticImagingReport2FindingsSection DiagnosticImagingReport2Component2 DiagnosticImagingReport2Informant DiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters DiagnosticImagingReport2IIRoot DiagnosticImagingReport2ParticipantAssociatedEntityPersonName DiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson DiagnosticImagingReport2ParticipantAssociatedEntity DiagnosticImagingReport2InFulfillmentOfOrderId DiagnosticImagingReport2InFulfillmentOfOrder DiagnosticImagingReport2DocumentationOfServiceEventClassCode DiagnosticImagingReport2DocumentationOfServiceEventCode DiagnosticImagingReport2DocumentationOfServiceEvent DiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength DiagnosticImagingReport2RelatedDocumentParentDocumentId DiagnosticImagingReport2RelatedDocumentParentDocument DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity DiagnosticImagingReport2ComponentOfEncompassingEncounterId DiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime DiagnosticImagingReport2ComponentOfEncompassingEncounter DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP DiagnosticImagingReport2ComponentStructuredBodyComponent3Section DiagnosticImagingReport2ComponentStructuredBody' templateId.root='2.16.840.1.113883.10.20.22.1.5' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='DiagnosticImagingReport2Code DiagnosticImagingReport2DICOMObjectCatalogSection DiagnosticImagingReport2DocumentationOfServiceEventId DiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2 DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization DiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2 DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText' constraints.validation.dependOn.DiagnosticImagingReport2Code='DiagnosticImagingReport2CodeP' constraints.validation.info='DiagnosticImagingReport2InformationRecipient DiagnosticImagingReport2Participant DiagnosticImagingReport2InFulfillmentOf DiagnosticImagingReport2RelatedDocument DiagnosticImagingReport2ComponentOf DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3' constraints.validation.query='DiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters DiagnosticImagingReport2IIRoot DiagnosticImagingReport2ParticipantAssociatedEntityPersonName DiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson DiagnosticImagingReport2ParticipantAssociatedEntity DiagnosticImagingReport2InFulfillmentOfOrderId DiagnosticImagingReport2InFulfillmentOfOrder DiagnosticImagingReport2DocumentationOfServiceEventClassCode DiagnosticImagingReport2DocumentationOfServiceEventId DiagnosticImagingReport2DocumentationOfServiceEventCode DiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2 DiagnosticImagingReport2DocumentationOfServiceEvent DiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength DiagnosticImagingReport2RelatedDocumentParentDocumentId DiagnosticImagingReport2RelatedDocumentParentDocument DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity DiagnosticImagingReport2ComponentOfEncompassingEncounterId DiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty DiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2 DiagnosticImagingReport2ComponentOfEncompassingEncounter DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3Section DiagnosticImagingReport2ComponentStructuredBodyComponent3 DiagnosticImagingReport2ComponentStructuredBody'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2II constraints.validation.error='DiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters DiagnosticImagingReport2IIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2Participant constraints.validation.error='DiagnosticImagingReport2ParticipantAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ParticipantAssociatedEntity constraints.validation.error='DiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ParticipantAssociatedEntityPerson constraints.validation.error='DiagnosticImagingReport2ParticipantAssociatedEntityPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2InFulfillmentOf constraints.validation.error='DiagnosticImagingReport2InFulfillmentOfOrder'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2InFulfillmentOfOrder constraints.validation.error='DiagnosticImagingReport2InFulfillmentOfOrderId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2DocumentationOf constraints.validation.error='DiagnosticImagingReport2DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2DocumentationOfServiceEvent classCode='ACT' constraints.validation.error='DiagnosticImagingReport2DocumentationOfServiceEventClassCode DiagnosticImagingReport2DocumentationOfServiceEventCode' constraints.validation.warning='DiagnosticImagingReport2DocumentationOfServiceEventId DiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2RelatedDocument constraints.validation.error='DiagnosticImagingReport2RelatedDocumentParentDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2RelatedDocumentParentDocument constraints.validation.error='DiagnosticImagingReport2RelatedDocumentParentDocumentId ParentDocumentDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength' constraints.validation.query='ParentDocumentDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2RelatedDocumentParentDocumentII constraints.validation.error='DiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentOf constraints.validation.error='DiagnosticImagingReport2ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentOfEncompassingEncounter constraints.validation.error='DiagnosticImagingReport2ComponentOfEncompassingEncounterId DiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS' constraints.validation.info='DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS' constraints.validation.warning='DiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2 EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS' constraints.validation.query='EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty constraints.validation.error='DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity constraints.validation.warning='DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2Component constraints.validation.error='DiagnosticImagingReport2ComponentStructuredBody'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentStructuredBody constraints.validation.info='DiagnosticImagingReport2ComponentStructuredBodyComponent3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentStructuredBodyComponent3 constraints.validation.error='DiagnosticImagingReport2ComponentStructuredBodyComponent3Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentStructuredBodyComponent3Section constraints.validation.error='DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP' code.codeSystem='1.2.840.10008.2.16.4' code.codeSystemName='DCM' constraints.validation.warning='DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText' constraints.validation.info='DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject constraints.validation.error='DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext'"
 * @generated
 */
public interface DiagnosticImagingReport2 extends USRealmHeader2 {
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
	boolean validateDiagnosticImagingReport2Id(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2InformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2Participant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2InFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2RelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2FindingsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2DICOMObjectCatalogSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2Component2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2Informant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->excluding(null)->select(isNullFlavorUndefined())->reject(id.root.size() <= 64)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2IIRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() =  1))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(DiagnosticChain diagnostics,
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
	boolean validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
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
	boolean validateDiagnosticImagingReport2ParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2InFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2InFulfillmentOfOrder(DiagnosticChain diagnostics,
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
	boolean validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
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
	boolean validateDiagnosticImagingReport2DocumentationOfServiceEventId(DiagnosticChain diagnostics,
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
	boolean validateDiagnosticImagingReport2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer2)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(
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
	boolean validateDiagnosticImagingReport2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null).parentDocument->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject(not root.oclIsUndefined() implies root.size() <= 64)'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null).parentDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() =  1))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null)->reject(parentDocument->one(parentDocument : cda::ParentDocument | not parentDocument.oclIsUndefined() and parentDocument.oclIsKindOf(cda::ParentDocument)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2RelatedDocumentParentDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 8))))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 12))))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 14))))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject((not value.oclIsUndefined() and value.size() > 8 implies value.size() >= 15) and ((not low.value.oclIsUndefined() and low.value.size() > 8 implies low.value.size() >= 15) and (not high.value.oclIsUndefined() and high.value.size() > 8 implies high.value.size() >= 15)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
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
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant2)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(
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
	boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null).subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(consol::FetusSubjectContext)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(getAllSections()->forAll(section : cda::Section | not section.text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'1.2.840.10008.2.16.4\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((title.oclIsUndefined() or title.isNullFlavorUndefined()) implies (not title.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(not text.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies subject->exists(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProcedureContext)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::TextObservation)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CodeObservations)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::QuantityMeasurementObservation)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SOPInstanceObservation)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cda::Section)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->exists(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReport2ComponentStructuredBody(DiagnosticChain diagnostics,
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
	public DiagnosticImagingReport2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DiagnosticImagingReport2
