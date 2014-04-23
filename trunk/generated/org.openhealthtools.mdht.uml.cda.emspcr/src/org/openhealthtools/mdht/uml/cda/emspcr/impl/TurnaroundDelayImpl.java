/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TurnaroundDelayOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnaround Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TurnaroundDelayImpl extends ObservationImpl implements TurnaroundDelay {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnaroundDelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TURNAROUND_DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnaroundDelayTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TurnaroundDelayOperations.validateTurnaroundDelayTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnaroundDelayMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TurnaroundDelayOperations.validateTurnaroundDelayMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnaroundDelayCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TurnaroundDelayOperations.validateTurnaroundDelayCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnaroundDelayCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TurnaroundDelayOperations.validateTurnaroundDelayCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnaroundDelayValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TurnaroundDelayOperations.validateTurnaroundDelayValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnaroundDelayValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TurnaroundDelayOperations.validateTurnaroundDelayValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnaroundDelay init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnaroundDelay init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // TurnaroundDelayImpl
