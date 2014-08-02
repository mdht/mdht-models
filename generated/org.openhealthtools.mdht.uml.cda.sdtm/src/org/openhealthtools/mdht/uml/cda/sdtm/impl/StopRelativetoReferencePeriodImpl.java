/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StopRelativetoReferencePeriodOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Relativeto Reference Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StopRelativetoReferencePeriodImpl extends ObservationImpl implements StopRelativetoReferencePeriod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopRelativetoReferencePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStopRelativetoReferencePeriodValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StopRelativetoReferencePeriodOperations.validateStopRelativetoReferencePeriodValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StopRelativetoReferencePeriod init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StopRelativetoReferencePeriodImpl
