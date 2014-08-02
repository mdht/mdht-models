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

import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PregnancyRiskFactorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregnancy Risk Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PregnancyRiskFactorImpl extends ObservationImpl implements PregnancyRiskFactor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PregnancyRiskFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.PREGNANCY_RISK_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyRiskFactorEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyRiskFactorOperations.validatePregnancyRiskFactorEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyRiskFactor init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyRiskFactor init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PregnancyRiskFactorImpl
