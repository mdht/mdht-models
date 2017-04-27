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
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smoking Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SmokingStatusObservationImpl extends ObservationImpl implements SmokingStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmokingStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SMOKING_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationCDCodeTermAssertionOrLoinc(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationCDCodeTermAssertionOrLoinc(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationCDCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationCDCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationCDCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationIVLTSCenter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSCenter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationIVLTSWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusObservationOperations.validateSmokingStatusObservationValue(this, diagnostics, context);
	}
} // SmokingStatusObservationImpl
