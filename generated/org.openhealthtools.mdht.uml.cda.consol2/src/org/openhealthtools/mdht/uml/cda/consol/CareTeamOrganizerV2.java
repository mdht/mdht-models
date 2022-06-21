/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Team Organizer V2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCareTeamOrganizerV2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CareTeamOrganizerV2TemplateId CareTeamOrganizerV2Id CareTeamOrganizerV2Code CareTeamOrganizerV2CodeP CareTeamOrganizerV2StatusCode CareTeamOrganizerV2EffectiveTime CareTeamOrganizerV2ClassCode CareTeamOrganizerV2MoodCode CareTeamOrganizerV2CareTeamMember CareTeamOrganizerV2CareLocation CareTeamOrganizerV2IVLTSLow' templateId.root='2.16.840.1.113883.10.20.22.4.500' templateId.extension='2022-06-01' code.code='86744-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' classCode='CLUSTER' moodCode='EVN' constraints.validation.query='CareTeamOrganizerV2IVLTSLow CareTeamOrganizerV2IVLTSHigh' constraints.validation.info='CareTeamOrganizerV2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerV2IVLTS constraints.validation.error='CareTeamOrganizerV2IVLTSLow' constraints.validation.info='CareTeamOrganizerV2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerV2CareTeamMember typeCode='PPRF' constraints.validation.error='CareTeamOrganizerV2CareTeamMemberTypeCode CareTeamOrganizerV2CareTeamMemberParticipantRole' constraints.validation.info='CareTeamOrganizerV2CareTeamMemberSDTCFunctionCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerV2CareTeamMemberParticipantRole constraints.validation.error='CareTeamOrganizerV2CareTeamMemberParticipantRoleId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerV2CareLocation typeCode='LOC' constraints.validation.error='CareTeamOrganizerV2CareLocationTypeCode CareTeamOrganizerV2CareLocationParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerV2CareLocationParticipantRole constraints.validation.error='CareTeamOrganizerV2CareLocationParticipantRoleId CareTeamOrganizerV2CareLocationParticipantRolePlayingEntity' constraints.validation.warning='CareTeamOrganizerV2CareLocationParticipantRoleAddr CareTeamOrganizerV2CareLocationParticipantRoleTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCareTeamOrganizerV2CareLocationParticipantRolePlayingEntity constraints.validation.error='CareTeamOrganizerV2CareLocationParticipantRolePlayingEntityName CareTeamOrganizerV2CareLocationParticipantRolePlayingEntityClassCode'"
 * @generated
 */
public interface CareTeamOrganizerV2 extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.500\' and id.extension = \'2022-06-01\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerV2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.id-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerV2Id(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'86744-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerV2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerV2CareTeamMember(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean validateCareTeamOrganizerV2CareLocation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCareTeamOrganizerV2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NoteActivity)).oclAsType(consol::NoteActivity)'"
	 * @generated
	 */
	EList<NoteActivity> getNoteActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CareTeamTypeObservation)).oclAsType(consol::CareTeamTypeObservation)'"
	 * @generated
	 */
	EList<CareTeamTypeObservation> getCareTeamTypeObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::CareTeamMemberActV2)).oclAsType(consol::CareTeamMemberActV2)'"
	 * @generated
	 */
	EList<CareTeamMemberActV2> getCareTeamMemberActV2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizerV2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizerV2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CareTeamOrganizerV2
