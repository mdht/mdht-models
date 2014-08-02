/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofLiveBirthsNowDeadOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Live Births Now Dead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberofLiveBirthsNowDeadImpl extends ObservationImpl implements NumberofLiveBirthsNowDead {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberofLiveBirthsNowDeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDeadTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDeadClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDeadMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDeadCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDeadCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLiveBirthsNowDeadValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLiveBirthsNowDead init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLiveBirthsNowDead init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NumberofLiveBirthsNowDeadImpl
