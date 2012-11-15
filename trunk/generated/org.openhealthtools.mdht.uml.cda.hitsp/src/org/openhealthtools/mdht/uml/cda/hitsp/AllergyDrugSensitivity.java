/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
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
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergyDrugSensitivityTemplateId AllergyDrugSensitivityAdverseEventType AllergyDrugSensitivityAdverseEventTypeVocab AllergyDrugSensitivityAllergyProductTypeCode AllergyDrugSensitivityProductDetailParticipantRole AllergyDrugSensitivityProductDetailParticipantRoleClassCode AllergyDrugSensitivityProductDetailPlayingEntity AllergyDrugSensitivityProductDetailPlayingEntityClassCode AllergyDrugSensitivityProductDetailName AllergyDrugSensitivityAllergyProductFoodVocab AllergyDrugSensitivityAllergyProductMedClassVocab AllergyDrugSensitivityAllergyProductSpecificMedVocab AllergyDrugSensitivityReactionCodeVocab AllergyDrugSensitivitySeverityCodeVocab' templateId.root='2.16.840.1.113883.3.88.11.83.6' constraints.validation.warning='AllergyDrugSensitivityAdverseEventDate AllergyDrugSensitivityAllergyProduct AllergyDrugSensitivityProductCode AllergyDrugSensitivityReactionText AllergyDrugSensitivityReactionCode AllergyDrugSensitivitySeverityText AllergyDrugSensitivitySeverityCode'"
 *        annotation="uml2.alias Allergies\040and\040Drug\040Sensitivities='null' Allergy\040and\040Drug\040Sensitivity='null'"
 * @generated
 */
public interface AllergyDrugSensitivity extends AllergyIntoleranceConcern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =\r\n\'2.16.840.1.113883.4.9\' or playe.code.codeSystem = \'2.16.840.1.113883.3.26.1.5\' or playe.code.codeSystem = \'2.16.840.1.113883.6.88\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =\r\n\'2.16.840.1.113883.4.9\' or playe.code.codeSystem = \'2.16.840.1.113883.3.26.1.5\' or playe.code.codeSystem = \'2.16.840.1.113883.6.88\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation |  \r\nobs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and \r\nprole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =\r\n\'2.16.840.1.113883.4.9\' or playe.code.codeSystem = \'2.16.840.1.113883.3.26.1.5\' or playe.code.codeSystem = \'2.16.840.1.113883.6.88\'))))))'"
	 * @generated
	 */
	boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyDrugSensitivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergyDrugSensitivity
