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
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SeverityObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Severity Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SeverityObservation2Impl extends SeverityObservationImpl implements SeverityObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeverityObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SEVERITY_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservation2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeverityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservation2Operations.validateSeverityObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SeverityObservation2Impl
