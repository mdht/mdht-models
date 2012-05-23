/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonHumanExposureOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Human Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonHumanExposureImpl extends SubstanceAdministrationImpl implements NonHumanExposure
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonHumanExposureImpl()
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
    return SdtmPackage.Literals.NON_HUMAN_EXPOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureRouteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureMaxDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanExposureOperations.validateNonHumanExposureApproachSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonHumanExposure init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NonHumanExposureImpl
