/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SocialHistoryObservation2Impl extends SocialHistoryObservationImpl implements SocialHistoryObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2ReferenceAttribute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2ReferenceAttribute(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2IfNotLoincRequireTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2IfNotLoincRequireTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2CDTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2CDTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation2CDTranslationP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservation2CDTranslationP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservation2Operations.validateSocialHistoryObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistoryObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistoryObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SocialHistoryObservation2Impl
