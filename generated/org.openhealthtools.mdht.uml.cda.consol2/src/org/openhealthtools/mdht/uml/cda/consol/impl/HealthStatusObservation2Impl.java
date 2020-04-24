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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HealthStatusObservation2Impl extends HealthStatusObservationImpl implements HealthStatusObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservation2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservation2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationHasTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationHasTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservation2Operations.validateHealthStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HealthStatusObservation2Impl
