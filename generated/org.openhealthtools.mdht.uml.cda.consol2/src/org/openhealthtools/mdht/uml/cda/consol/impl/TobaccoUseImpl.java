/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.consol.operations.TobaccoUseOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tobacco Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return ConsolPackage.Literals.TOBACCO_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseEffectiveTimeLow(this, diagnostics, context);
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
	public boolean validateTobaccoUseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseStatusCodeP(this, diagnostics, context);
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
	public boolean validateTobaccoUseValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUseCDCodeTermAssertionOrLoinc(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseCDCodeTermAssertionOrLoinc(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUseCDCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUseCDCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUseOperations.validateTobaccoUseCDCodeSystem(this, diagnostics, context);
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
} // TobaccoUseImpl
