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
package org.openhealthtools.mdht.uml.cda.ihe;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getFamilyHistoryOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='IHEFamilyHistoryOrganizerTemplateId IHEFamilyHistoryOrganizerHasParticipantParticipantRole IHEFamilyHistoryOrganizerHasParticipantRoleCode IHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity IHEFamilyHistoryOrganizerCode IHEFamilyHistoryOrganizerFamilyHistoryObservation' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.15' constraints.validation.info='IHEFamilyHistoryOrganizerHasParticipant' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode'"
 * @generated
 */
public interface FamilyHistoryOrganizer extends org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->size() = 1'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerHasParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::PRS)'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant.participantRole.code->size() = 1'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::PSN)'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.15\')'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\')'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ihe::FamilyHistoryObservation))'"
	* @generated
	*/
	boolean validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::FamilyHistoryObservation)).oclAsType(ihe::FamilyHistoryObservation)'"
	* @generated
	*/
	EList<FamilyHistoryObservation> getIHEFamilyHistoryObservations();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FamilyHistoryOrganizer init();

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public FamilyHistoryOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistoryOrganizer
