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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofInfantsBornAliveOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Infants Born Alive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberofInfantsBornAliveImpl extends ObservationImpl implements NumberofInfantsBornAlive {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NumberofInfantsBornAliveImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.NUMBEROF_INFANTS_BORN_ALIVE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofInfantsBornAliveTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofInfantsBornAliveOperations.validateNumberofInfantsBornAliveTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofInfantsBornAliveClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofInfantsBornAliveOperations.validateNumberofInfantsBornAliveClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofInfantsBornAliveMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofInfantsBornAliveOperations.validateNumberofInfantsBornAliveMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofInfantsBornAliveCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofInfantsBornAliveOperations.validateNumberofInfantsBornAliveCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofInfantsBornAliveCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofInfantsBornAliveOperations.validateNumberofInfantsBornAliveCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofInfantsBornAliveValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofInfantsBornAliveOperations.validateNumberofInfantsBornAliveValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NumberofInfantsBornAlive init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NumberofInfantsBornAlive init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NumberofInfantsBornAliveImpl
