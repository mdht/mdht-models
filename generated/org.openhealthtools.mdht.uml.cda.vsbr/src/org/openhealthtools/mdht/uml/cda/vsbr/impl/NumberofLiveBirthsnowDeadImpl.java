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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofLiveBirthsnowDeadOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Live Birthsnow Dead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberofLiveBirthsnowDeadImpl extends ObservationImpl implements NumberofLiveBirthsnowDead {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NumberofLiveBirthsnowDeadImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHSNOW_DEAD;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofLiveBirthsnowDeadTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofLiveBirthsnowDeadOperations.validateNumberofLiveBirthsnowDeadTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofLiveBirthsnowDeadClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofLiveBirthsnowDeadOperations.validateNumberofLiveBirthsnowDeadClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofLiveBirthsnowDeadMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofLiveBirthsnowDeadOperations.validateNumberofLiveBirthsnowDeadMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofLiveBirthsnowDeadCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofLiveBirthsnowDeadOperations.validateNumberofLiveBirthsnowDeadCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofLiveBirthsnowDeadCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofLiveBirthsnowDeadOperations.validateNumberofLiveBirthsnowDeadCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumberofLiveBirthsnowDeadValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return NumberofLiveBirthsnowDeadOperations.validateNumberofLiveBirthsnowDeadValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NumberofLiveBirthsnowDead init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NumberofLiveBirthsnowDead init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NumberofLiveBirthsnowDeadImpl
