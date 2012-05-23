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

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.DerivedDataIndicatorOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Data Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DerivedDataIndicatorImpl extends ObservationImpl implements DerivedDataIndicator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DerivedDataIndicatorImpl()
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
    return SdtmPackage.Literals.DERIVED_DATA_INDICATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedDataIndicatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DerivedDataIndicatorOperations.validateDerivedDataIndicatorTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedDataIndicatorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DerivedDataIndicatorOperations.validateDerivedDataIndicatorCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedDataIndicatorCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DerivedDataIndicatorOperations.validateDerivedDataIndicatorCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedDataIndicatorValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DerivedDataIndicatorOperations.validateDerivedDataIndicatorValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedDataIndicator init() {
    	CDAUtil.init(this);
    	return this;
  }
} //DerivedDataIndicatorImpl
