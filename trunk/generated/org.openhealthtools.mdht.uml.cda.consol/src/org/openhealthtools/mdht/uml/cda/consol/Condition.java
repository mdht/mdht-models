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

import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A problem is a clinical statement that a clinician is particularly concerned about and wants to track. It has important patient management use cases (e.g. health records often present the problem list as a way of summarizing a patient's medical history).
 * <p>
 * This event (moodCode='EVN') represents an act (act classCode='ACT') of being concerned
 * about a problem, allergy or other issue. The &lt;effectiveTime> element describes the period of
 * concern. The subject of concern is one or more observations about related problems (see
 * 1.3.6.1.4.1.19376.1.5.3.1.4.5.2) or allergies and intolerances (see
 * 1.3.6.1.4.1.19376.1.5.3.1.4.5.3). Additional references can be provided having additional information related to the concern. The concern entry allows related acts to be grouped. This
 * allows representing the history of a problem as a series of observation over time, for example.
 * </p>
 * <p>
 * All concerns reflect the act of recording (&lt;act classCode='ACT'>) the event (moodCode='EVN')
 * of being concerned about a problem, allergy or other issue about the patient condition.
 * </p>
 * This entry is a specialization of the Concern Entry, wherein the subject of the concern is focused on a problem.
 * A condition is a clinical statement that a clinician is wants to track. It has important patient management use cases (e.g., health records often present the problem list as a way of summarizing a patient's medical history).
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCondition()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.7' code.nullFlavor='NA' constraints.validation.error='ConditionTemplateId ConditionEntryRelationshipRequired ConditionEffectiveTimeLowHigh ConditionHasRelatedObservations ConditionRelatedObservationsTypeCode ConditionHasRelatedReferencesTypeCode ConditionHasTreatingProvider ConditionHasProviderId ConditionClassCode ConditionMoodCode ConditionId ConditionCodeNullFlavor ConditionEffectiveTime ConditionConditionEntry' constraints.validation.warning='ConditionSubjectOfTarget ConditionContainsProblemObservation ConditionContainsAlertObservation' classCode='ACT' constraints.validation.info='ConditionContainsPatientAwareness ConditionHasProviderTreatmentTime ConditionEpisodeObservation' moodCode='EVN'"
 * @generated
 */
public interface Condition extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.entryRelationship->isEmpty()'"
	 * @generated
	 */
	boolean validateConditionEntryRelationshipRequired(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and \r\n  (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))'"
	 * @generated
	 */
	boolean validateConditionSubjectOfTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()\r\n   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))'"
	 * @generated
	 */
	boolean validateConditionContainsProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()\r\n   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))'"
	 * @generated
	 */
	boolean validateConditionContainsAlertObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))'"
	 * @generated
	 */
	boolean validateConditionContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 *    and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())
	 *    and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.effectiveTime.low.oclIsUndefined()\r\n   and ((self.statusCode.code = \'completed\' or self.statusCode.code = \'aborted\') implies not self.effectiveTime.high.oclIsUndefined())\r\n   and ((self.statusCode.code <> \'completed\' and self.statusCode.code <> \'aborted\') implies self.effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateConditionEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.5') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.6')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  \'1.3.6.1.4.1.19376.1.5.3.1.4.5\') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  \'1.3.6.1.4.1.19376.1.5.3.1.4.6\')'"
	 * @generated
	 */
	boolean validateConditionHasRelatedObservations(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()'"
	 * @generated
	 */
	boolean validateConditionRelatedObservationsTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference)'"
	 * @generated
	 */
	boolean validateConditionHasRelatedReferencesTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.performer->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.performer->isEmpty()'"
	 * @generated
	 */
	boolean validateConditionHasTreatingProvider(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(p : cda::Performer2 | p.assignedEntity.id->size() > 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->exists(p : cda::Performer2 | p.assignedEntity.id->size() > 0)'"
	 * @generated
	 */
	boolean validateConditionHasProviderId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateConditionHasProviderTreatmentTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.7\')'"
	 * @generated
	 */
	boolean validateConditionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateConditionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateConditionId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)'"
	 * @generated
	 */
	boolean validateConditionCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateConditionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyIntolerance) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyIntolerance) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateConditionConditionEntry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))'"
	 * @generated
	 */
	boolean validateConditionEpisodeObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyIntolerance)).oclAsType(consol::AllergyIntolerance)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyIntolerance)).oclAsType(consol::AllergyIntolerance)'"
	 * @generated
	 */
	EList<AllergyIntolerance> getConditionEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)'"
	 * @generated
	 */
	EpisodeObservation getEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition init();
} // Condition
