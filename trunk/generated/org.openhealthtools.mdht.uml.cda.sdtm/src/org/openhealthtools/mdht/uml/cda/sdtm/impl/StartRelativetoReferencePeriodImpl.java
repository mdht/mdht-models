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
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StartRelativetoReferencePeriodOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Relativeto Reference Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StartRelativetoReferencePeriodImpl extends ObservationImpl implements StartRelativetoReferencePeriod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartRelativetoReferencePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.START_RELATIVETO_REFERENCE_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStartRelativetoReferencePeriodValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartRelativetoReferencePeriodOperations.validateStartRelativetoReferencePeriodValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StartRelativetoReferencePeriod init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StartRelativetoReferencePeriodImpl
