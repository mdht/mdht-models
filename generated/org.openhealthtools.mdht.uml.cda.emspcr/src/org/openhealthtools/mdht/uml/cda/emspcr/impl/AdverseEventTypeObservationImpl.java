/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdverseEventTypeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event Type Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AdverseEventTypeObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements AdverseEventTypeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventTypeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventTypeObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventTypeObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventTypeObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventTypeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventTypeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventTypeObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventTypeObservation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AdverseEventTypeObservation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // AdverseEventTypeObservationImpl
