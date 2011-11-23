/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistoryOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation statusCode.code='completed' code.codeSystem='2.16.840.1.113883.5.111' templateId.root='2.16.840.1.113883.3.88.11.83.18' constraints.validation.error='FamilyHistoryOrganizerTemplateId FamilyHistoryOrganizerHasComponent FamilyHistoryOrganizerHasSubject FamilyHistoryOrganizerHasSubjectPatientRelationship FamilyHistoryOrganizerRelationshipValueCode FamilyHistoryOrganizerHasRelatedSubjectCode FamilyHistoryOrganizerHasParticipantParticipantRole FamilyHistoryOrganizerHasParticipantRoleCode FamilyHistoryOrganizerHasParticipantRolePlayingEntity FamilyHistoryOrganizerRelatedSubjectCodeValueSet FamilyHistoryOrganizerFamilyMemberCondition FamilyHistoryOrganizerClassCode FamilyHistoryOrganizerMoodCode FamilyHistoryOrganizerCode FamilyHistoryOrganizerStatusCode FamilyHistoryOrganizerFamilyHistoryObservation' code.codeSystemName='RoleCode' classCode='CLUSTER' constraints.validation.warning='FamilyHistoryOrganizerHasFamilyHistoryObservation FamilyHistoryOrganizerHasRelatedSubjectSubject FamilyHistoryOrganizerHasGenderCode FamilyHistoryOrganizerRelatedSubjectBirthTime FamilyHistoryOrganizerHasFamilyName' moodCode='EVN' constraints.validation.info='FamilyHistoryOrganizerHasParticipant'"
 * @generated
 */
public interface FamilyHistoryOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->size() >= 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->size() >= 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists (comp : cda::Component4 | comp.observation->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::FamilyHistoryObservation)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists (comp : cda::Component4 | comp.observation->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::FamilyHistoryObservation)))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasFamilyHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasSubjectPatientRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerRelationshipValueCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.code->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasRelatedSubjectCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.subject->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasRelatedSubjectSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerRelatedSubjectBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::PRS)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::PRS)'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasParticipantParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.code->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant.participantRole.code->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasParticipantRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::PSN)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::PSN)'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.code.codeSystem = \'2.16.840.1.113883.5.111\''"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.name->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.subject.name->size() > 0'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerHasFamilyName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(consol::FamilyHistoryObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(consol::FamilyHistoryObservation))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerFamilyMemberCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.18')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.18\')'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFamilyHistoryOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (\nvalue.codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (\nvalue.code = \'completed\'))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation)).oclAsType(consol::FamilyHistoryObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation)).oclAsType(consol::FamilyHistoryObservation)'"
	 * @generated
	 */
	EList<FamilyHistoryObservation> getFamilyHistoryObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer init();
} // FamilyHistoryOrganizer
