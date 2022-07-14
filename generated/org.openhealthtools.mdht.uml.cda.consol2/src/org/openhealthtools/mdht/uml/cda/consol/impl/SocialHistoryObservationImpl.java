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
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SocialHistoryObservationImpl extends ObservationImpl implements SocialHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SocialHistoryObservationImpl
