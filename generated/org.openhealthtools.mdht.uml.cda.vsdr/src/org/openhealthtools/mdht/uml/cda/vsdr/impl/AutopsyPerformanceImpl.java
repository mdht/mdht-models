/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.AutopsyPerformanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autopsy Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AutopsyPerformanceImpl extends ObservationImpl implements AutopsyPerformance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutopsyPerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.AUTOPSY_PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutopsyPerformance init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public AutopsyPerformance init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AutopsyPerformanceImpl
