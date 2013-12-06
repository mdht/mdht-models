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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeliveryTimeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetal Delivery Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FetalDeliveryTimeImpl extends ObservationImpl implements FetalDeliveryTime {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FetalDeliveryTimeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.FETAL_DELIVERY_TIME;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliveryTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliveryTimeOperations.validateFetalDeliveryTimeTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliveryTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliveryTimeOperations.validateFetalDeliveryTimeMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliveryTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliveryTimeOperations.validateFetalDeliveryTimeCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliveryTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliveryTimeOperations.validateFetalDeliveryTimeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliveryTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliveryTimeOperations.validateFetalDeliveryTimeValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeliveryTimeParticipatingLocation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeliveryTimeOperations.validateFetalDeliveryTimeParticipatingLocation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeliveryTime init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FetalDeliveryTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // FetalDeliveryTimeImpl
