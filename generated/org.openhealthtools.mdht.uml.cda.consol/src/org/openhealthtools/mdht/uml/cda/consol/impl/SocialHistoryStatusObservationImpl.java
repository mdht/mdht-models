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
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryStatusObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistoryStatusObservationImpl extends ObservationImpl implements SocialHistoryStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationTargetOfEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationTargetOfEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationNoAdditionalParticipants(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationNoAdditionalParticipants(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationNoAdditionalRelationships(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationNoAdditionalRelationships(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryStatusObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //SocialHistoryStatusObservationImpl
