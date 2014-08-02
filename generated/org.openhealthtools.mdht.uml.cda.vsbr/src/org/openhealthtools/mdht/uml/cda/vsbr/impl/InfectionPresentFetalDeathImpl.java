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

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfectionPresentFetalDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infection Present Fetal Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfectionPresentFetalDeathImpl extends ObservationImpl implements InfectionPresentFetalDeath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfectionPresentFetalDeathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentFetalDeathValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectionPresentFetalDeath init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectionPresentFetalDeath init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InfectionPresentFetalDeathImpl
