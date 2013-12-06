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

import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PlannedHomeBirthOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Home Birth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedHomeBirthImpl extends ObservationImpl implements PlannedHomeBirth {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PlannedHomeBirthImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.PLANNED_HOME_BIRTH;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlannedHomeBirthTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlannedHomeBirthOperations.validatePlannedHomeBirthTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlannedHomeBirthClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlannedHomeBirthOperations.validatePlannedHomeBirthClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlannedHomeBirthMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlannedHomeBirthOperations.validatePlannedHomeBirthMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlannedHomeBirthCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlannedHomeBirthOperations.validatePlannedHomeBirthCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlannedHomeBirthCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlannedHomeBirthOperations.validatePlannedHomeBirthCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlannedHomeBirthValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlannedHomeBirthOperations.validatePlannedHomeBirthValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlannedHomeBirth init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlannedHomeBirth init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlannedHomeBirthImpl
