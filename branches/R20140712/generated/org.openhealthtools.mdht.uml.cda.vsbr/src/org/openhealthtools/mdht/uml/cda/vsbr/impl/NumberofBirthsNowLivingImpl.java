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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofBirthsNowLivingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Births Now Living</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberofBirthsNowLivingImpl extends ObservationImpl implements NumberofBirthsNowLiving {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NumberofBirthsNowLivingImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.NUMBEROF_BIRTHS_NOW_LIVING;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofBirthsNowLivingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofBirthsNowLivingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofBirthsNowLivingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofBirthsNowLivingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofBirthsNowLivingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofBirthsNowLivingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NumberofBirthsNowLiving init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NumberofBirthsNowLiving init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NumberofBirthsNowLivingImpl
