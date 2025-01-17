/*******************************************************************************
 * Copyright (c) 2011, 2012 David A. Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.operations.EpisodeObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episode Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EpisodeObservationImpl extends ObservationImpl implements EpisodeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.EPISODE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationOneEntryRelationshipSUBJ(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationOneEntryRelationshipSUBJ(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationExistsEntryRelationshipSAS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationExistsEntryRelationshipSAS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EpisodeObservationOperations.validateEpisodeObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // EpisodeObservationImpl
