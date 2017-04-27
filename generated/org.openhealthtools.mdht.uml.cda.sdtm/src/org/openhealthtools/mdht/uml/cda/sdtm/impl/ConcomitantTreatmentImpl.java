/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConcomitantTreatmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concomitant Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcomitantTreatmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ConcomitantTreatment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcomitantTreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.CONCOMITANT_TREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantTreatmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantTreatmentOperations.validateConcomitantTreatmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantTreatmentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantTreatmentOperations.validateConcomitantTreatmentClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantTreatmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantTreatmentOperations.validateConcomitantTreatmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantTreatmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantTreatmentOperations.validateConcomitantTreatmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantTreatmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantTreatmentOperations.validateConcomitantTreatmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantTreatmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantTreatmentOperations.validateConcomitantTreatmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcomitantTreatment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ConcomitantTreatment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ConcomitantTreatmentImpl
