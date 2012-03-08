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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HealthStatusObservationImpl extends ObservationImpl implements HealthStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} // HealthStatusObservationImpl
