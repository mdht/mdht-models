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

import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.OtherTreatmentActionTakenOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Treatment Action Taken</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OtherTreatmentActionTakenImpl extends ObservationImpl implements OtherTreatmentActionTaken {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherTreatmentActionTakenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOtherTreatmentActionTakenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherTreatmentActionTakenOperations.validateOtherTreatmentActionTakenTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOtherTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherTreatmentActionTakenOperations.validateOtherTreatmentActionTakenClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOtherTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherTreatmentActionTakenOperations.validateOtherTreatmentActionTakenMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOtherTreatmentActionTakenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherTreatmentActionTakenOperations.validateOtherTreatmentActionTakenCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOtherTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherTreatmentActionTakenOperations.validateOtherTreatmentActionTakenCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOtherTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherTreatmentActionTakenOperations.validateOtherTreatmentActionTakenValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherTreatmentActionTaken init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OtherTreatmentActionTaken init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OtherTreatmentActionTakenImpl
