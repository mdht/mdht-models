/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Drug Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This module contains the allergy or intolerance conditions and the associated adverse reactions suffered
 *     by the patient. See the HL7 Continuity of Care Document Section 3.8 for constraints applicable to this module. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getAllergyDrugSensitivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.6' constraints.validation.error='AllergyDrugSensitivityTemplateId AllergyDrugSensitivityAdvereEventType AllergyDrugSensitivityAdvereEventTypeVocab AllergyDrugSensitivityAllergyProductTypeCode AllergyDrugSensitivityProductDetailParticipantRole AllergyDrugSensitivityProductDetailParticipantRoleClassCode AllergyDrugSensitivityProductDetailPlayingEntity AllergyDrugSensitivityProductDetailPlayingEntityClassCode AllergyDrugSensitivityProductDetailName AllergyDrugSensitivityAllergyProductFoodVocab AllergyDrugSensitivityAllergyProductMedClassVocab AllergyDrugSensitivityAllergyProductSpecificMedVocab AllergyDrugSensitivityReactionCodeVocab AllergyDrugSensitivitySeverityCodeVocab' constraints.validation.warning='AllergyDrugSensitivityAdvereEventDate AllergyDrugSensitivityAllergyProduct AllergyDrugSensitivityProductCode AllergyDrugSensitivityReactionText AllergyDrugSensitivityReactionCode AllergyDrugSensitivitySeverityText AllergyDrugSensitivitySeverityCode'"
 *        annotation="uml2.alias Allergies\040and\040Drug\040Sensitivities='null' Allergy\040and\040Drug\040Sensitivity='null'"
 * @generated
 */
public interface AllergyDrugSensitivity extends AllergyIntoleranceConcern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and not obs.effectiveTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and not obs.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAdvereEventDate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and not obs.code.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and not obs.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAdvereEventType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and not obs.code.oclIsUndefined() and obs.code.codeSystem = '2.16.840.1.113883.3.88.12.3221.6.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and not obs.code.oclIsUndefined() and obs.code.codeSystem = \'2.16.840.1.113883.3.88.12.3221.6.2\')'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAdvereEventTypeVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProduct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = 'CSM'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = \'CSM\'))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU'))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\'))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = 'MMAT' )))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = \'MMAT\' )))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = 'MMAT' and playe.name->size() = 1)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = \'MMAT\' and playe.name->size() = 1)))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies( par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = 'MMAT' and playe.code->size() = 1)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies( par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = \'MMAT\' and playe.code->size() = 1)))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = 'MMAT' and playe.code->size() = 1 and (playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.20' or playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.17' or playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.16'))))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = \'MMAT\' and playe.code->size() = 1 and (playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.20\' or playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.17\' or playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.16\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = 'MMAT' and playe.code->size() = 1 and (playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.20' or playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.17' or playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.16'))))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = \'MMAT\' and playe.code->size() = 1 and (playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.20\' or playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.17\' or playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.16\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = 'CSM' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode='MANU' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = 'MMAT' and playe.code->size() = 1 and (playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.20' or playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.17' or playe.code.codeSystem = '2.16.840.1.113883.3.88.12.80.16'))))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = \'CSM\' and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=\'MANU\' and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = \'MMAT\' and playe.code->size() = 1 and (playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.20\' or playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.17\' or playe.code.codeSystem = \'2.16.840.1.113883.3.88.12.80.16\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.54') and not o.text.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.54\') and not o.text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityReactionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.54') and not o.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.54\') and not o.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityReactionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.54') and not o.code.oclIsUndefined() and o.code.codeSystem = '2.16.840.1.113883.3.88.12.3221.7.4'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.54\') and not o.code.oclIsUndefined() and o.code.codeSystem = \'2.16.840.1.113883.3.88.12.3221.7.4\'))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityReactionCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.55') and not o.text.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.55\') and not o.text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivitySeverityText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.55') and not o.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.55\') and not o.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivitySeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.55') and not o.code.oclIsUndefined() and o.code.codeSystem = '2.16.840.1.113883.3.88.12.3221.6.8'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | (obs.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.18\')) and obs.getObservations()->exists(o : cda::Observation | o.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.55\') and not o.code.oclIsUndefined() and o.code.codeSystem = \'2.16.840.1.113883.3.88.12.3221.6.8\'))'"
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
	 * @generated
	 */
	public AllergyDrugSensitivity init();
} // AllergyDrugSensitivity
