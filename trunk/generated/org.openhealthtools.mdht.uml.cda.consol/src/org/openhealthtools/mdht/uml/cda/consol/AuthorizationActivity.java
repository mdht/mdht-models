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
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAuthorizationActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AuthorizationActivityTemplateId AuthorizationActivityClassCode AuthorizationActivityId AuthorizationActivityMoodCode AuthorizationActivityEntryRelationship AuthorizationActivityEntryRelationshipHasClinicalStatement AuthorizationActivityEntryRelationshipTypeCode' templateId.root='2.16.840.1.113883.10.20.1.19' classCode='ACT' moodCode='EVN' constraints.validation.query='AuthorizationActivityEntryRelationshipHasClinicalStatement AuthorizationActivityEntryRelationshipHasAuthorizedPerformers AuthorizationActivityEntryRelationshipTypeCode' constraints.validation.info='AuthorizationActivityEntryRelationshipHasAuthorizedPerformers'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAuthorizationActivityEntryRelationship constraints.validation.error='EntryRelationshipHasClinicalStatement EntryRelationshipTypeCode' constraints.validation.info='EntryRelationshipHasAuthorizedPerformers' typeCode='SUBJ'"
 * @generated
 */
public interface AuthorizationActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.19')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.19\')'"
	 * @generated
	 */
	boolean validateAuthorizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAuthorizationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)'"
	 * @generated
	 */
	boolean validateAuthorizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAuthorizationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->size() = 1'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(act->exists(moodCode = vocab::x_DocumentActMood::PRMS) or  encounter->exists(moodCode = vocab::x_DocumentEncounterMood::PRMS) or observation->exists(moodCode = vocab::x_ActMoodDocumentObservation::PRMS) or  observationMedia->exists(moodCode = vocab::ActMood::PRMS) or organizer->exists(moodCode = vocab::ActMood::PRMS) or procedure->exists(moodCode = vocab::x_DocumentProcedureMood::PRMS) or  regionOfInterest->exists(moodCode = vocab::ActMood::PRMS) or substanceAdministration->exists(moodCode = vocab::x_DocumentSubstanceMood::PRMS) or  supply->exists(moodCode = vocab::x_DocumentSubstanceMood::PRMS))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(act->exists(moodCode = vocab::x_DocumentActMood::PRMS) or  encounter->exists(moodCode = vocab::x_DocumentEncounterMood::PRMS) or observation->exists(moodCode = vocab::x_ActMoodDocumentObservation::PRMS) or  observationMedia->exists(moodCode = vocab::ActMood::PRMS) or organizer->exists(moodCode = vocab::ActMood::PRMS) or procedure->exists(moodCode = vocab::x_DocumentProcedureMood::PRMS) or  regionOfInterest->exists(moodCode = vocab::ActMood::PRMS) or substanceAdministration->exists(moodCode = vocab::x_DocumentSubstanceMood::PRMS) or  supply->exists(moodCode = vocab::x_DocumentSubstanceMood::PRMS))'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationshipHasClinicalStatement(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(act->forAll( (moodCode = vocab::x_DocumentActMood::PRMS and performer->size() > 0) or moodCode <> vocab::x_DocumentActMood::PRMS ) and 
	 * encounter->forAll((moodCode = vocab::x_DocumentEncounterMood::PRMS and performer->size() > 0) or moodCode <>  vocab::x_DocumentEncounterMood::PRMS) and 
	 * observation->forAll((moodCode = vocab::x_ActMoodDocumentObservation::PRMS and performer->size() > 0)  or moodCode <>  vocab::x_ActMoodDocumentObservation::PRMS) and 
	 * observationMedia->forAll((moodCode = vocab::ActMood::PRMS and performer->size() > 0) or moodCode <>  vocab::ActMood::PRMS) and 
	 * organizer->forAll((moodCode = vocab::ActMood::PRMS and performer->size() > 0)  or moodCode <>  vocab::ActMood::PRMS) and 
	 * procedure->forAll((moodCode = vocab::x_DocumentProcedureMood::PRMS and performer->size() > 0)  or moodCode <>  vocab::x_DocumentProcedureMood::PRMS) and 
	 * regionOfInterest->forAll((moodCode = vocab::ActMood::PRMS and performer->size() > 0) or moodCode <>  vocab::ActMood::PRMS) and 
	 * substanceAdministration->forAll((moodCode = vocab::x_DocumentSubstanceMood::PRMS and performer->size() > 0)  or moodCode <>  vocab::x_DocumentSubstanceMood::PRMS) and 
	 * supply->forAll((moodCode = vocab::x_DocumentSubstanceMood::PRMS and performer->size() > 0) or moodCode <>  vocab::x_DocumentSubstanceMood::PRMS))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(act->forAll( (moodCode = vocab::x_DocumentActMood::PRMS and performer->size() > 0) or moodCode <> vocab::x_DocumentActMood::PRMS ) and \r\nencounter->forAll((moodCode = vocab::x_DocumentEncounterMood::PRMS and performer->size() > 0) or moodCode <>  vocab::x_DocumentEncounterMood::PRMS) and \r\nobservation->forAll((moodCode = vocab::x_ActMoodDocumentObservation::PRMS and performer->size() > 0)  or moodCode <>  vocab::x_ActMoodDocumentObservation::PRMS) and \r\nobservationMedia->forAll((moodCode = vocab::ActMood::PRMS and performer->size() > 0) or moodCode <>  vocab::ActMood::PRMS) and \r\norganizer->forAll((moodCode = vocab::ActMood::PRMS and performer->size() > 0)  or moodCode <>  vocab::ActMood::PRMS) and \r\nprocedure->forAll((moodCode = vocab::x_DocumentProcedureMood::PRMS and performer->size() > 0)  or moodCode <>  vocab::x_DocumentProcedureMood::PRMS) and \r\nregionOfInterest->forAll((moodCode = vocab::ActMood::PRMS and performer->size() > 0) or moodCode <>  vocab::ActMood::PRMS) and \r\nsubstanceAdministration->forAll((moodCode = vocab::x_DocumentSubstanceMood::PRMS and performer->size() > 0)  or moodCode <>  vocab::x_DocumentSubstanceMood::PRMS) and \r\nsupply->forAll((moodCode = vocab::x_DocumentSubstanceMood::PRMS and performer->size() > 0) or moodCode <>  vocab::x_DocumentSubstanceMood::PRMS))'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AuthorizationActivity
