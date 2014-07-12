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

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfectionPresentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infection Present</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfectionPresentImpl extends ObservationImpl implements InfectionPresent {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InfectionPresentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.INFECTION_PRESENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInfectionPresentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return InfectionPresentOperations.validateInfectionPresentTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInfectionPresentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return InfectionPresentOperations.validateInfectionPresentClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInfectionPresentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return InfectionPresentOperations.validateInfectionPresentMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInfectionPresentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return InfectionPresentOperations.validateInfectionPresentCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInfectionPresentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return InfectionPresentOperations.validateInfectionPresentCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInfectionPresentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return InfectionPresentOperations.validateInfectionPresentValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InfectionPresent init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InfectionPresent init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // InfectionPresentImpl
