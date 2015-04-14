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
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physicianof Record Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianofRecordParticipant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianofRecordParticipantTemplateId PhysicianofRecordParticipantTypeCode PhysicianofRecordParticipantAssignedEntity PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode PhysicianofRecordParticipantAssignedEntityCode PhysicianofRecordParticipantAssignedEntityId' templateId.root='2.16.840.1.113883.10.20.6.2.2' typeCode='ATND' constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.query='PhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityCode PhysicianofRecordParticipantAssignedEntityId PhysicianofRecordParticipantAssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipantAssignedEntity constraints.validation.error='PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode PhysicianofRecordParticipantAssignedEntityCode PhysicianofRecordParticipantAssignedEntityId' constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipantAssignedEntityAssignedPerson constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityAssignedPersonName'"
 * @generated
 */
public interface PhysicianofRecordParticipant extends EncounterParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.2\')'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::x_EncounterParticipant::ATND'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(code.codeSystem = \'1.2.840.10008.2.16.4\' or code.codeSystem = \'2.16.840.1.113883.6.101\')'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianofRecordParticipant
