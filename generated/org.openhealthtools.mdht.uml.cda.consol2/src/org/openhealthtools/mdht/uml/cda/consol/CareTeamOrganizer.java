/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Team Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCareTeamOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CareTeamOrganizerTemplateId CareTeamOrganizerId CareTeamOrganizerCode CareTeamOrganizerCodeP CareTeamOrganizerStatusCode CareTeamOrganizerStatusCodeP CareTeamOrganizerEffectiveTime CareTeamOrganizerClassCode CareTeamOrganizerMoodCode CareTeamOrganizerCareTeamMemberAct CareTeamOrganizerIVLTSLow' templateId.root='2.16.840.1.113883.10.20.22.4.500' templateId.extension='2019-07-01' code.code='86744-0' code.displayName='Care Team' constraints.validation.dependOn.CareTeamOrganizerCode='CareTeamOrganizerCodeP' constraints.validation.dependOn.CareTeamOrganizerStatusCode='CareTeamOrganizerStatusCodeP' classCode='CLUSTER' moodCode='EVN' constraints.validation.warning='CareTeamOrganizerCareTeamMember CareTeamOrganizerAuthor' constraints.validation.info='CareTeamOrganizerCareLocation CareTeamOrganizerNoteActivity CareTeamOrganizerCareTeamTypeObservation CareTeamOrganizerIVLTSHigh' constraints.validation.query='CareTeamOrganizerIVLTSLow CareTeamOrganizerIVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerIVLTS constraints.validation.error='CareTeamOrganizerIVLTSLow' constraints.validation.info='CareTeamOrganizerIVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerCareTeamMember typeCode='PPRF' constraints.validation.error='CareTeamOrganizerCareTeamMemberTypeCode CareTeamOrganizerCareTeamMemberSDTCFunctionCode CareTeamOrganizerCareTeamMemberParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerCareTeamMemberParticipantRole constraints.validation.error='CareTeamOrganizerCareTeamMemberParticipantRoleId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerCareLocation typeCode='LOC' constraints.validation.error='CareTeamOrganizerCareLocationTypeCode CareTeamOrganizerCareLocationParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerCareLocationParticipantRole constraints.validation.error='CareTeamOrganizerCareLocationParticipantRoleId CareTeamOrganizerCareLocationParticipantRoleAddr CareTeamOrganizerCareLocationParticipantRoleTelecom CareTeamOrganizerCareLocationParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerCareLocationParticipantRolePlayingEntity constraints.validation.error='CareTeamOrganizerCareLocationParticipantRolePlayingEntityName CareTeamOrganizerCareLocationParticipantRolePlayingEntityClassCode' classCode='ENT'"
 * @generated
 */
public interface CareTeamOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.500\' and id.extension = \'2019-07-01\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.id-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'86744-0\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'normal\' or value.code = \'aborted\' or value.code = \'active\' or value.code = \'cancelled\' or value.code = \'completed\' or value.code = \'held\' or value.code = \'new\' or value.code = \'suspended\' or value.code = \'nullified\' or value.code = \'obsolete\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerCareTeamMember(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerCareLocation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(consol::NoteActivity))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerNoteActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::CareTeamTypeObservation))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerCareTeamTypeObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(consol::CareTeamMemberAct))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerCareTeamMemberAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NoteActivity))-&gt;asSequence()-&gt;any(true).oclAsType(consol::NoteActivity)'"
	 * @generated
	 */
	NoteActivity getNoteActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CareTeamTypeObservation))-&gt;asSequence()-&gt;any(true).oclAsType(consol::CareTeamTypeObservation)'"
	 * @generated
	 */
	CareTeamTypeObservation getCareTeamTypeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::CareTeamMemberAct))-&gt;asSequence()-&gt;any(true).oclAsType(consol::CareTeamMemberAct)'"
	 * @generated
	 */
	CareTeamMemberAct getCareTeamMemberAct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CareTeamOrganizer
