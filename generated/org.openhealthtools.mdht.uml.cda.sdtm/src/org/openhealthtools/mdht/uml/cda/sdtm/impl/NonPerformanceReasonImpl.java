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

import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonPerformanceReasonOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Performance Reason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonPerformanceReasonImpl extends ObservationImpl implements NonPerformanceReason {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonPerformanceReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.NON_PERFORMANCE_REASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonPerformanceReasonValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonPerformanceReasonOperations.validateNonPerformanceReasonValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public NonPerformanceReason init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonPerformanceReasonImpl
