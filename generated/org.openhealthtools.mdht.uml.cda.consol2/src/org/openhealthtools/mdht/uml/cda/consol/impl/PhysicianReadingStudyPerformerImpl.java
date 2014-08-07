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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformerOperations;
import org.openhealthtools.mdht.uml.cda.impl.Performer1Impl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physician Reading Study Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformerImpl extends Performer1Impl implements PhysicianReadingStudyPerformer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianReadingStudyPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianReadingStudyPerformer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianReadingStudyPerformer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PhysicianReadingStudyPerformerImpl
