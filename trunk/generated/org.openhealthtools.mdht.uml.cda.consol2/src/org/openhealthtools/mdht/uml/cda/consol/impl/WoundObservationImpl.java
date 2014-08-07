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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.WoundObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.WoundObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wound Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WoundObservationImpl extends ObservationImpl implements WoundObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.WOUND_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationWoundMeasurementObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationWoundMeasurementObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationWoundCharacteristics(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationWoundCharacteristics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationHighestPressureUlcerStage(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationHighestPressureUlcerStage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCDCRCDCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCDCRCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCDCRName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCDCRName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCDCRNameP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCDCRNameP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCDCRValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCDCRValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundObservationCDQualifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundObservationOperations.validateWoundObservationCDQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WoundMeasurementObservation> getWoundMeasurementObservations() {
		return WoundObservationOperations.getWoundMeasurementObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WoundCharacteristics> getWoundCharacteristicss() {
		return WoundObservationOperations.getWoundCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighestPressureUlcerStage getHighestPressureUlcerStage() {
		return WoundObservationOperations.getHighestPressureUlcerStage(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // WoundObservationImpl
