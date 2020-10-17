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
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.EncounterParticipantImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipantOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physicianof Record Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicianofRecordParticipantImpl extends EncounterParticipantImpl implements PhysicianofRecordParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianofRecordParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PhysicianofRecordParticipantImpl
