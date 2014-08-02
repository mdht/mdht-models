/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DateandTimeofDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dateand Timeof Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DateandTimeofDeathImpl extends ObservationImpl implements DateandTimeofDeath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateandTimeofDeathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.DATEAND_TIMEOF_DEATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDateandTimeofDeathText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateandTimeofDeathOperations.validateDateandTimeofDeathText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateandTimeofDeath init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DateandTimeofDeath init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DateandTimeofDeathImpl
