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
 * A representation of the model object '<em><b>Allergy Drug Sensitivity</b></em>'.
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
 * This entry is a specialization of the Concern Entry, wherein the subject of the concern is focused on an allergy or intolerance.
 * <p>
 *     This module contains the allergy or intolerance conditions and the associated adverse reactions suffered
 *     by the patient. See the HL7 Continuity of Care Document Section 3.8 for constraints applicable to this module. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyDrugSensitivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.6' code.nullFlavor='NA' constraints.validation.error='AllergyDrugSensitivityTemplateId AllergyDrugSensitivityEntryRelationshipRequired AllergyDrugSensitivityEffectiveTimeLowHigh AllergyDrugSensitivityHasRelatedObservations AllergyDrugSensitivityRelatedObservationsTypeCode AllergyDrugSensitivityHasRelatedReferencesTypeCode AllergyDrugSensitivityAdverseEventType AllergyDrugSensitivityAdverseEventTypeVocab AllergyDrugSensitivityAllergyProductTypeCode AllergyDrugSensitivityProductDetailParticipantRole AllergyDrugSensitivityProductDetailParticipantRoleClassCode AllergyDrugSensitivityProductDetailPlayingEntity AllergyDrugSensitivityProductDetailPlayingEntityClassCode AllergyDrugSensitivityProductDetailName AllergyDrugSensitivityAllergyProductFoodVocab AllergyDrugSensitivityAllergyProductMedClassVocab AllergyDrugSensitivityAllergyProductSpecificMedVocab AllergyDrugSensitivityReactionCodeVocab AllergyDrugSensitivitySeverityCodeVocab AllergyDrugSensitivityClassCode AllergyDrugSensitivityMoodCode AllergyDrugSensitivityId AllergyDrugSensitivityCodeNullFlavor AllergyDrugSensitivityEffectiveTime AllergyDrugSensitivityAllergyIntolerance' constraints.validation.warning='AllergyDrugSensitivitySubjectOfTarget AllergyDrugSensitivityContainsProblemObservation AllergyDrugSensitivityContainsAlertObservation AllergyDrugSensitivityAdverseEventDate AllergyDrugSensitivityAllergyProduct AllergyDrugSensitivityProductCode AllergyDrugSensitivityReactionText AllergyDrugSensitivityReactionCode AllergyDrugSensitivitySeverityText AllergyDrugSensitivitySeverityCode' classCode='ACT' constraints.validation.info='AllergyDrugSensitivityContainsPatientAwareness AllergyDrugSensitivityEpisodeObservation' moodCode='EVN'"
 *        annotation="uml2.alias Allergies\040and\040Drug\040Sensitivities='null' Allergy\040and\040Drug\040Sensitivity='null'"
 * @generated
 */
public interface AllergyDrugSensitivity extends Act {
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
	boolean validateAllergyDrugSensitivityEntryRelationshipRequired(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivitySubjectOfTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityContainsProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityContainsAlertObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityHasRelatedObservations(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityRelatedObservationsTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  not obs.effectiveTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  not obs.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAdverseEventDate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAdverseEventType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined() and obs.code.codeSystem = '2.16.840.1.113883.6.96' and (obs.code.code = '420134006' or obs.code.code ='418038007' or obs.code.code='419511003' or obs.code.code='418471000' or obs.code.code='419199007' or obs.code.code='416098002' or obs.code.code='414285001' or obs.code.code='59037007' or obs.code.code='235719002'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined() and obs.code.codeSystem = \'2.16.840.1.113883.6.96\' and (obs.code.code = \'420134006\' or obs.code.code =\'418038007\' or obs.code.code=\'419511003\' or obs.code.code=\'418471000\' or obs.code.code=\'419199007\' or obs.code.code=\'416098002\' or obs.code.code=\'414285001\' or obs.code.code=\'59037007\' or obs.code.code=\'235719002\'))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAdverseEventTypeVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProduct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.name->size() = 1)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.name->size() = 1)))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1)))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =\r\n\'2.16.840.1.113883.4.9\' or playe.code.codeSystem = \'2.16.840.1.113883.3.26.1.5\' or playe.code.codeSystem = \'2.16.840.1.113883.6.88\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =\r\n\'2.16.840.1.113883.4.9\' or playe.code.codeSystem = \'2.16.840.1.113883.3.26.1.5\' or playe.code.codeSystem = \'2.16.840.1.113883.6.88\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =\r\n\'2.16.840.1.113883.4.9\' or playe.code.codeSystem = \'2.16.840.1.113883.3.26.1.5\' or playe.code.codeSystem = \'2.16.840.1.113883.6.88\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.text.oclIsUndefined()) )  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.text.oclIsUndefined()) )  )'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityReactionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()) )  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()) )  )'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityReactionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()  and ro.code.codeSystem = '2.16.840.1.113883.6.96' and (ro.code.code = '404684003' or ro.code.code = '243796009')  ) )  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()  and ro.code.codeSystem = \'2.16.840.1.113883.6.96\' and (ro.code.code = \'404684003\' or ro.code.code = \'243796009\')  ) )  )'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityReactionCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.text.oclIsUndefined()) )  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.text.oclIsUndefined()) )  )'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivitySeverityText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined()) )  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined()) )  )'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivitySeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined() and so.code.codeSystem = '2.16.840.1.113883.6.96' and (so.code.code = '255604002' or so.code.code = '371923003' or so.code.code = '6736007' or so.code.code = '371924009' or so.code.code = '24484000' or so.code.code = '399166001')
	 * ) )  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined() and so.code.codeSystem = \'2.16.840.1.113883.6.96\' and (so.code.code = \'255604002\' or so.code.code = \'371923003\' or so.code.code = \'6736007\' or so.code.code = \'371924009\' or so.code.code = \'24484000\' or so.code.code = \'399166001\')\n) )  )'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivitySeverityCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.6')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.6\')'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityEpisodeObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyDrugSensitivityAllergyIntolerance(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyIntolerance)).oclAsType(consol::AllergyIntolerance)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyIntolerance)).oclAsType(consol::AllergyIntolerance)'"
	 * @generated
	 */
	EList<AllergyIntolerance> getAllergyIntolerances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyDrugSensitivity init();
} // AllergyDrugSensitivity
