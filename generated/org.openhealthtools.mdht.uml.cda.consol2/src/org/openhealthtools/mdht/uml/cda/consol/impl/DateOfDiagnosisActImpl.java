/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.DateOfDiagnosisActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Of Diagnosis Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DateOfDiagnosisActImpl extends ActImpl implements DateOfDiagnosisAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateOfDiagnosisActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActEffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActEffectiveTimehigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActEffectiveTimehigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOfDiagnosisActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DateOfDiagnosisActOperations.validateDateOfDiagnosisActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOfDiagnosisAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOfDiagnosisAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DateOfDiagnosisActImpl
