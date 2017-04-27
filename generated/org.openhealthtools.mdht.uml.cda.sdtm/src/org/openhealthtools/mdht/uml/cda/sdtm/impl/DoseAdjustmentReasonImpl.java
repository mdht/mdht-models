/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DoseAdjustmentReasonOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dose Adjustment Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DoseAdjustmentReasonImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements DoseAdjustmentReason {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoseAdjustmentReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.DOSE_ADJUSTMENT_REASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDoseAdjustmentReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DoseAdjustmentReasonOperations.validateDoseAdjustmentReasonTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDoseAdjustmentReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DoseAdjustmentReasonOperations.validateDoseAdjustmentReasonClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDoseAdjustmentReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DoseAdjustmentReasonOperations.validateDoseAdjustmentReasonCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDoseAdjustmentReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DoseAdjustmentReasonOperations.validateDoseAdjustmentReasonCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDoseAdjustmentReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DoseAdjustmentReasonOperations.validateDoseAdjustmentReasonValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoseAdjustmentReason init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DoseAdjustmentReason init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //DoseAdjustmentReasonImpl
