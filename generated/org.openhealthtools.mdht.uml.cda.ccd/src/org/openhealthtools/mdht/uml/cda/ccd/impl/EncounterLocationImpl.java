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
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.Participant2Impl;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncounterLocationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EncounterLocationImpl extends Participant2Impl implements EncounterLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ENCOUNTER_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRoleLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasParticipantRoleCodeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleCodeVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasPlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasPlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationHasPlayingEntityPlace(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationHasPlayingEntityPlace(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterLocationOperations.validateEncounterLocationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EncounterLocationImpl
