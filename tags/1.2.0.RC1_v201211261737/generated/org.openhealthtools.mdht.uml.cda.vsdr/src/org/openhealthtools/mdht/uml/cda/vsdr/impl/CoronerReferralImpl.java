/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.CoronerReferralOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coroner Referral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoronerReferralImpl extends ObservationImpl implements CoronerReferral
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoronerReferralImpl()
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
    return VsdrPackage.Literals.CORONER_REFERRAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferralTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerReferralOperations.validateCoronerReferralTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferralClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerReferralOperations.validateCoronerReferralClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferralCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerReferralOperations.validateCoronerReferralCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferralCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerReferralOperations.validateCoronerReferralCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferralMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerReferralOperations.validateCoronerReferralMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferralValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerReferralOperations.validateCoronerReferralValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoronerReferral init() {
    	CDAUtil.init(this);
    	return this;
  }
} //CoronerReferralImpl
