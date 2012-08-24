/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd;

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
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getAuthorizationActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AuthorizationActivityTemplateId AuthorizationActivityEntryRelationshipTypeCode AuthorizationActivityEntryRelationshipTarget AuthorizationActivityClassCode AuthorizationActivityMoodCode AuthorizationActivityId AuthorizationActivityEntryRelationship' templateId.root='2.16.840.1.113883.10.20.1.19' constraints.validation.info='AuthorizationActivityHasPerformers' classCode='ACT' moodCode='EVN'"
 * @generated
 */
public interface AuthorizationActivity extends Act {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.typeCode->exists( tc : vocab::x_ActRelationshipEntryRelationship | tc = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
   * @generated
   */
	boolean validateAuthorizationActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->forAll(act.moodCode = vocab::x_DocumentActMood::PRMS) or  self.entryRelationship->forAll(encounter.moodCode = vocab::x_DocumentEncounterMood::PRMS) or self.entryRelationship->forAll(observation.moodCode = vocab::x_ActMoodDocumentObservation::PRMS) or  self.entryRelationship->forAll(observationMedia.moodCode = vocab::ActMood::PRMS) or self.entryRelationship->forAll(organizer.moodCode = vocab::ActMood::PRMS) or self.entryRelationship->forAll(procedure.moodCode = vocab::x_DocumentProcedureMood::PRMS) or  self.entryRelationship->forAll(regionOfInterest.moodCode = vocab::ActMood::PRMS) or self.entryRelationship->forAll(substanceAdministration.moodCode = vocab::x_DocumentSubstanceMood::PRMS) or  self.entryRelationship->forAll(supply.moodCode = vocab::x_DocumentSubstanceMood::PRMS)'"
   * @generated
   */
	boolean validateAuthorizationActivityEntryRelationshipTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->forAll(not act.performer->isEmpty() ) or  self.entryRelationship->forAll(not encounter.performer->isEmpty()) or self.entryRelationship->forAll(not observation.performer->isEmpty()) or  self.entryRelationship->forAll(not observationMedia.performer->isEmpty()) or self.entryRelationship->forAll(not organizer.performer->isEmpty()) or self.entryRelationship->forAll(not procedure.performer->isEmpty()) or  self.entryRelationship->forAll(not regionOfInterest.performer->isEmpty()) or self.entryRelationship->forAll(not substanceAdministration.performer->isEmpty()) or  self.entryRelationship->forAll(not supply.performer->isEmpty())'"
   * @generated
   */
	boolean validateAuthorizationActivityHasPerformers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
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
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
	boolean validateAuthorizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(rim::ActRelationship))'"
   * @generated
   */
	boolean validateAuthorizationActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
