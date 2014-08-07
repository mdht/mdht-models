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

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2;

import org.openhealthtools.mdht.uml.cda.consol.operations.CurrentSmokingStatus2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Smoking Status2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CurrentSmokingStatus2Impl extends SmokingStatusObservationImpl implements CurrentSmokingStatus2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentSmokingStatus2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CURRENT_SMOKING_STATUS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCurrentSmokingStatus2EffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateCurrentSmokingStatus2EffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCurrentSmokingStatus2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateCurrentSmokingStatus2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateTobaccoUseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateSmokingStatusObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateSmokingStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateSmokingStatusObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateSmokingStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentSmokingStatus2Operations.validateSmokingStatusObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentSmokingStatus2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentSmokingStatus2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CurrentSmokingStatus2Impl
