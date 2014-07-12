/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LastMenstrualPeriodDateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Last Menstrual Period Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LastMenstrualPeriodDateImpl extends ObservationImpl implements LastMenstrualPeriodDate {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LastMenstrualPeriodDateImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLastMenstrualPeriodDateTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLastMenstrualPeriodDateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLastMenstrualPeriodDateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLastMenstrualPeriodDateCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLastMenstrualPeriodDateCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLastMenstrualPeriodDateValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LastMenstrualPeriodDate init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LastMenstrualPeriodDate init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // LastMenstrualPeriodDateImpl
