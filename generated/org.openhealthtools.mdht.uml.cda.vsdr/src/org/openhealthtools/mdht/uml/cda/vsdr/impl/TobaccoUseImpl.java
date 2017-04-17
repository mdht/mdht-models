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
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.TobaccoUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tobacco Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TobaccoUseImpl extends ObservationImpl implements TobaccoUse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TobaccoUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.TOBACCO_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TobaccoUse init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TobaccoUse init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TobaccoUseImpl
