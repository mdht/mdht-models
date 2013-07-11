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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This clinical statement represents that an allergy or adverse reaction exists or does not exist. The agent that is the cause of the allergy or adverse reaction is represented as a manufactured material participant playing entity in the allergy - intolerance observation. While the agent is often implicit in the alert observation (e.g. "allergy to penicillin"), it should also be asserted explicitly as an entity. The manufactured material participant is used to represent natural and non-natural occurring substances.
 * NOTE: The agent responsible for an allergy or adverse reaction is not always a manufactured material (for example, food allergies), nor is it necessarily consumed. The following constraints reflect limitations in the base CDA R2 specification, and should be used to represent any type of responsible agent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergyObservationTemplateId AllergyObservationReferenceValue AllergyObservationAllergyStatusInversionIndicator AllergyObservationReactionInversionIndicator AllergyObservationSeverityInversionIndicator AllergyObservationAllergyPlayingEntityCodeSystems AllergyObservationClassCode AllergyObservationMoodCode AllergyObservationId AllergyObservationCode AllergyObservationCodeP AllergyObservationStatusCode AllergyObservationEffectiveTime AllergyObservationValue AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.22.4.7' constraints.validation.warning='AllergyObservationValueOriginalText AllergyObservationOriginalTextReference AllergyObservationOriginalTextReferenceValue AllergyObservationProblemEntryReactionObservationContainer AllergyObservationSeverity AllergyObservationParticipant AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue' classCode='OBS' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' constraints.validation.dependOn.AllergyObservationCode='AllergyObservationCodeP' statusCode.code='completed' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.info='AllergyObservationAllergyStatusObservation AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation' constraints.validation.query='AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationAllergyObservationParticipant typeCode='CSM' constraints.validation.error='AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRole classCode='MANU' constraints.validation.error='AllergyObservationParticipantRoleClassCode AllergyObservationParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntity constraints.validation.warning='AllergyObservationPlayingEntityCodeOriginalText AllergyObservationPlayingEntityOriginalTextReference AllergyObservationPlayingEntityReferenceValue' constraints.validation.error='AllergyObservationPlayingEntityOriginalTextReferenceValue AllergyObservationPlayingEntityClassCode AllergyObservationPlayingEntityCode' constraints.validation.info='AllergyObservationPlayingEntityCodeTranslation' classCode='MMAT'"
 *        annotation="uml2.alias Allergies\040and\040Intolerances='null'"
 * @generated
 */
public interface AllergyObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value.oclAsType(datatypes::CD).originalText->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value.oclAsType(datatypes::CD).originalText->size() = 1'"
	 * @generated
	 */
	boolean validateAllergyObservationValueOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value.oclAsType(datatypes::CD).originalText->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText->one(reference->size() = 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value.oclAsType(datatypes::CD).originalText->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText->one(reference->size() = 1)'"
	 * @generated
	 */
	boolean validateAllergyObservationOriginalTextReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value.oclAsType(datatypes::CD).originalText.reference->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText.reference.value->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value.oclAsType(datatypes::CD).originalText.reference->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText.reference.value->size() = 1'"
	 * @generated
	 */
	boolean validateAllergyObservationOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()'"
	 * @generated
	 */
	boolean validateAllergyObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyStatusInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->forAll(value | value.isNullFlavorUndefined())) implies (((self.value->forAll(value | value.oclAsType(datatypes::CD).code = '419511003' or value.oclAsType(datatypes::CD).code = '416098002' or value.oclAsType(datatypes::CD).code = '59037007')) and (self.participant.participantRole.playingEntity->forAll(code.isNullFlavorDefined() or code.codeSystem = '2.16.840.1.113883.6.88' or code.codeSystem='2.16.840.1.113883.3.26.1.5'))) or ((self.value->forAll(value | value.oclAsType(datatypes::CD).code = '418471000' or value.oclAsType(datatypes::CD).code = '414285001' or value.oclAsType(datatypes::CD).code = '235719002')) and (self.participant.participantRole.playingEntity->forAll(code.isNullFlavorDefined() or code.codeSystem = '2.16.840.1.113883.4.9'))) or ((self.value->forAll(value | value.oclAsType(datatypes::CD).code = '420134006' or value.oclAsType(datatypes::CD).code = '418038007' or value.oclAsType(datatypes::CD).code = '419199007')) and (self.participant.participantRole.playingEntity->forAll(code.isNullFlavorDefined() or code.codeSystem = '2.16.840.1.113883.6.88' or code.codeSystem='2.16.840.1.113883.3.26.1.5' or code.codeSystem = '2.16.840.1.113883.4.9'))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->forAll(value | value.isNullFlavorUndefined())) implies (((self.value->forAll(value | value.oclAsType(datatypes::CD).code = \'419511003\' or value.oclAsType(datatypes::CD).code = \'416098002\' or value.oclAsType(datatypes::CD).code = \'59037007\')) and (self.participant.participantRole.playingEntity->forAll(code.isNullFlavorDefined() or code.codeSystem = \'2.16.840.1.113883.6.88\' or code.codeSystem=\'2.16.840.1.113883.3.26.1.5\'))) or ((self.value->forAll(value | value.oclAsType(datatypes::CD).code = \'418471000\' or value.oclAsType(datatypes::CD).code = \'414285001\' or value.oclAsType(datatypes::CD).code = \'235719002\')) and (self.participant.participantRole.playingEntity->forAll(code.isNullFlavorDefined() or code.codeSystem = \'2.16.840.1.113883.4.9\'))) or ((self.value->forAll(value | value.oclAsType(datatypes::CD).code = \'420134006\' or value.oclAsType(datatypes::CD).code = \'418038007\' or value.oclAsType(datatypes::CD).code = \'419199007\')) and (self.participant.participantRole.playingEntity->forAll(code.isNullFlavorDefined() or code.codeSystem = \'2.16.840.1.113883.6.88\' or code.codeSystem=\'2.16.840.1.113883.3.26.1.5\' or code.codeSystem = \'2.16.840.1.113883.4.9\'))))'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyPlayingEntityCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.7')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.7\')'"
	 * @generated
	 */
	boolean validateAllergyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateAllergyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validateAllergyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'420134006\' or value.code = \'418038007\' or value.code = \'419511003\' or value.code = \'418471000\' or value.code = \'419199007\' or value.code = \'416098002\' or value.code = \'414285001\' or value.code = \'59037007\' or value.code = \'235719002\')))'"
	 * @generated
	 */
	boolean validateAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)'"
	 * @generated
	 */
	boolean validateAllergyObservationProblemEntryReactionObservationContainer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAllergyObservationSeverity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value->size() = 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value->size() = 1)'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.translation->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.translation->isEmpty())'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(isDefined('classCode'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassRoot) and 
	 * let value : vocab::RoleClassRoot = classCode.oclAsType(vocab::RoleClassRoot) in 
	 * value = vocab::RoleClassRoot::MANU)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassRoot) and \r\nlet value : vocab::RoleClassRoot = classCode.oclAsType(vocab::RoleClassRoot) in \r\nvalue = vocab::RoleClassRoot::MANU)'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::ParticipationType) and 
	 * let value : vocab::ParticipationType = typeCode.oclAsType(vocab::ParticipationType) in 
	 * value = vocab::ParticipationType::CSM)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::ParticipationType) and \r\nlet value : vocab::ParticipationType = typeCode.oclAsType(vocab::ParticipationType) in \r\nvalue = vocab::ParticipationType::CSM)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)'"
	 * @generated
	 */
	EList<ReactionObservation> getProblemEntryReactionObservationContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->any(true).oclAsType(consol::SeverityObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->any(true).oclAsType(consol::SeverityObservation)'"
	 * @generated
	 */
	SeverityObservation getSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->any(true).oclAsType(consol::AllergyStatusObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->any(true).oclAsType(consol::AllergyStatusObservation)'"
	 * @generated
	 */
	AllergyStatusObservation getAllergyStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergyObservation
