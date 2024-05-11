/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Referral Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPatientReferralAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientReferralActTemplateId PatientReferralActClassCode PatientReferralActMoodCode PatientReferralActMoodCodeP PatientReferralActId PatientReferralActCode PatientReferralActCodeP PatientReferralActStatusCode PatientReferralActStatusCodeP PatientReferralActEffectiveTime PatientReferralActEntryRelationshipObservationClassCode PatientReferralActEntryRelationshipObservationMoodCode PatientReferralActEntryRelationshipObservationCodeP PatientReferralActEntryRelationshipObservationCode PatientReferralActEntryRelationshipObservationStatusCode PatientReferralActEntryRelationshipObservationStatusCodeP PatientReferralActEntryRelationshipObservationValueP PatientReferralActEntryRelationshipTypeCode PatientReferralActEntryRelationshipObservation PatientReferralActParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.22.4.140' classCode='PCPR' constraints.validation.dependOn.PatientReferralActMoodCode='PatientReferralActMoodCodeP' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.dependOn.PatientReferralActCode='PatientReferralActCodeP' statusCode.code='active' constraints.validation.warning='PatientReferralActPriorityCode PatientReferralActAuthorParticipation PatientReferralActEntryRelationshipObservationPriorityCodeP PatientReferralActEntryRelationshipObservationPriorityCode PatientReferralActEntryRelationshipObservationValue PatientReferralActParticipantParticipantRoleCode' constraints.validation.info='PatientReferralActEntryRelationship PatientReferralActIndication2 PatientReferralActParticipant PatientReferralActParticipantParticipantRoleCodeP PatientReferralActParticipantTypeCode' constraints.validation.query='PatientReferralActEntryRelationshipObservationClassCode PatientReferralActEntryRelationshipObservationMoodCode PatientReferralActEntryRelationshipObservationCodeP PatientReferralActEntryRelationshipObservationCode PatientReferralActEntryRelationshipObservationStatusCode PatientReferralActEntryRelationshipObservationStatusCodeP PatientReferralActEntryRelationshipObservationPriorityCodeP PatientReferralActEntryRelationshipObservationPriorityCode PatientReferralActEntryRelationshipObservationValue PatientReferralActEntryRelationshipObservationValueP PatientReferralActEntryRelationshipTypeCode PatientReferralActEntryRelationshipObservation PatientReferralActParticipantParticipantRoleCodeP PatientReferralActParticipantParticipantRoleCode PatientReferralActParticipantTypeCode PatientReferralActParticipantParticipantRole' constraints.validation.dependOn.PatientReferralActEntryRelationshipObservationCode='PatientReferralActEntryRelationshipObservationCodeP' constraints.validation.dependOn.PatientReferralActEntryRelationshipObservationPriorityCode='PatientReferralActEntryRelationshipObservationPriorityCodeP' constraints.validation.dependOn.PatientReferralActParticipantParticipantRoleCode='PatientReferralActParticipantParticipantRoleCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientReferralActEntryRelationship typeCode='SUBJ' constraints.validation.error='PatientReferralActEntryRelationshipTypeCode PatientReferralActEntryRelationshipObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientReferralActEntryRelationshipObservation classCode='OBS' constraints.validation.error='PatientReferralActEntryRelationshipObservationClassCode PatientReferralActEntryRelationshipObservationMoodCode PatientReferralActEntryRelationshipObservationCode PatientReferralActEntryRelationshipObservationCodeP PatientReferralActEntryRelationshipObservationStatusCode PatientReferralActEntryRelationshipObservationStatusCodeP PatientReferralActEntryRelationshipObservationValueP' moodCode='RQO' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='assertion' constraints.validation.dependOn.PatientReferralActEntryRelationshipObservationCode='PatientReferralActEntryRelationshipObservationCodeP' statusCode.code='completed' priorityCode.codeSystem='2.16.840.1.113883.5.7' priorityCode.codeSystemName='ActPriority' constraints.validation.warning='PatientReferralActEntryRelationshipObservationPriorityCode PatientReferralActEntryRelationshipObservationPriorityCodeP PatientReferralActEntryRelationshipObservationValue' constraints.validation.dependOn.PatientReferralActEntryRelationshipObservationPriorityCode='PatientReferralActEntryRelationshipObservationPriorityCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientReferralActParticipant typeCode='REFT' constraints.validation.info='PatientReferralActParticipantTypeCode' constraints.validation.error='PatientReferralActParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientReferralActParticipantParticipantRole code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='PatientReferralActParticipantParticipantRoleCode' constraints.validation.info='PatientReferralActParticipantParticipantRoleCodeP' constraints.validation.dependOn.PatientReferralActParticipantParticipantRoleCode='PatientReferralActParticipantParticipantRoleCodeP'"
 * @generated
 */
public interface PatientReferralAct extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.140\')'"
	 * @generated
	 */
	boolean validatePatientReferralActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::PCPR'"
	 * @generated
	 */
	boolean validatePatientReferralActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and \nlet value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in \nvalue = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::RQO'"
	 * @generated
	 */
	boolean validatePatientReferralActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientReferralActCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'active\')'"
	 * @generated
	 */
	boolean validatePatientReferralActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientReferralActPriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;notEmpty()'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validatePatientReferralActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
	 * @generated
	 */
	boolean validatePatientReferralActIndication2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validatePatientReferralActParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject(moodCode=vocab::x_ActMoodDocumentObservation::RQO)'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\'))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\'))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((priorityCode.oclIsUndefined() or priorityCode.isNullFlavorUndefined()) implies (not priorityCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationPriorityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((priorityCode.oclIsUndefined() or priorityCode.isNullFlavorUndefined()) implies (not priorityCode.oclIsUndefined() and priorityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = priorityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.7\' and (value.code = \'A\' or value.code = \'CR\' or value.code = \'CS\' or value.code = \'CSP\' or value.code = \'CSR\' or value.code = \'EL\' or value.code = \'EM\' or value.code = \'P\' or value.code = \'PRN\' or value.code = \'R\' or value.code = \'RR\' or value.code = \'S\' or value.code = \'T\' or value.code = \'UD\' or value.code = \'UR\')))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationPriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((value-&gt;isEmpty() or value-&gt;exists(element | element.isNullFlavorUndefined())) implies (value-&gt;size() = 1 and value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'370985002\' or value.code = \'170941001\' or value.code = \'170935008\' or value.code = \'268528005\' or value.code = \'170939002\' or value.code = \'268529002\' or value.code = \'170936009\' or value.code = \'170937000\' or value.code = \'170940000\'))))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation-&gt;excluding(null)-&gt;reject((value-&gt;isEmpty() or value-&gt;exists(element | element.isNullFlavorUndefined())) implies (value-&gt;size() =  1 and value-&gt;forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;reject(observation-&gt;one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActParticipantParticipantRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActParticipantParticipantRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(typeCode=vocab::ParticipationType::REFT)'"
	 * @generated
	 */
	boolean validatePatientReferralActParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(participantRole-&gt;one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePatientReferralActParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientReferralAct init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientReferralAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientReferralAct
