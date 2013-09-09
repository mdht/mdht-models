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

import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.OtherPregnancyOutcomeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Pregnancy Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OtherPregnancyOutcomeImpl extends ObservationImpl implements OtherPregnancyOutcome
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherPregnancyOutcomeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomeEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherPregnancyOutcome init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OtherPregnancyOutcome init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OtherPregnancyOutcomeImpl
