/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistoryImpl extends ObservationImpl implements SocialHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryCodeValueSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryCodeValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryNoRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryNoRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryNoInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryNoInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryNoMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryNoMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryNoTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryNoTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySocialHistoryStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistorySocialHistoryStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryEpisodeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryOperations.validateSocialHistoryEpisodeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryStatusObservation getSocialHistoryStatusObservation() {
		return SocialHistoryOperations.getSocialHistoryStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation getEpisodeObservation() {
		return SocialHistoryOperations.getEpisodeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistory init() {
    	CDAUtil.init(this);
    	return this;
	}
} //SocialHistoryImpl
