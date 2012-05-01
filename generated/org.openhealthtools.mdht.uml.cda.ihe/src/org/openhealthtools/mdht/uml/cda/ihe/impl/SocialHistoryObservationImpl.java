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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistoryObservationImpl extends SimpleObservationImpl implements SocialHistoryObservation {
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
		return IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationCodeValueSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationCodeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationTemplateId(this, diagnostics, context);
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
	public boolean validateSocialHistoryObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationId(this, diagnostics, context);
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
	public boolean validateSocialHistoryObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationSocialHistoryStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationSocialHistoryStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationEpisodeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationOperations.validateSocialHistoryObservationEpisodeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryStatusObservation getSocialHistoryStatusObservation() {
		return SocialHistoryObservationOperations.getSocialHistoryStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation getEpisodeObservation() {
		return SocialHistoryObservationOperations.getEpisodeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHESocialHistoryObservationNoRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoRepeatNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHESocialHistoryObservationNoInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoInterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHESocialHistoryObservationNoMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoMethodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHESocialHistoryObservationNoTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHESocialHistoryObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations.validateIHESocialHistoryObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHESocialHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations.validateIHESocialHistoryObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistoryObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // SocialHistoryObservationImpl
