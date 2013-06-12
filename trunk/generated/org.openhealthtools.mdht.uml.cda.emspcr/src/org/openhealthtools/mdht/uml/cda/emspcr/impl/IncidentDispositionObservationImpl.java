/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.IncidentDispositionObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incident Disposition Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IncidentDispositionObservationImpl extends ObservationImpl implements IncidentDispositionObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentDispositionObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentDispositionObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IncidentDispositionObservationOperations.validateIncidentDispositionObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentDispositionObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IncidentDispositionObservationOperations.validateIncidentDispositionObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentDispositionObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IncidentDispositionObservationOperations.validateIncidentDispositionObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentDispositionObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IncidentDispositionObservationOperations.validateIncidentDispositionObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentDispositionObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IncidentDispositionObservationOperations.validateIncidentDispositionObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentDispositionObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IncidentDispositionObservationOperations.validateIncidentDispositionObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentDispositionObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncidentDispositionObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //IncidentDispositionObservationImpl
