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
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.WoundMeasurementObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wound Measurement Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WoundMeasurementObservationImpl extends ObservationImpl implements WoundMeasurementObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundMeasurementObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundMeasurementObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundMeasurementObservationOperations.validateWoundMeasurementObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundMeasurementObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundMeasurementObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // WoundMeasurementObservationImpl
