/**
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
import org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.CriticalityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criticality Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CriticalityObservationImpl extends ObservationImpl implements CriticalityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriticalityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CRITICALITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriticalityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriticalityObservationOperations.validateCriticalityObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalityObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CriticalityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CriticalityObservationImpl
