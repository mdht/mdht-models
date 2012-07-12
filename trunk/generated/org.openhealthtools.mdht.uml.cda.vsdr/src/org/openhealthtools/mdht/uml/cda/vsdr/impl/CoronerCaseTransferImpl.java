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

import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.CoronerCaseTransferOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coroner Case Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoronerCaseTransferImpl extends ObservationImpl implements CoronerCaseTransfer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoronerCaseTransferImpl()
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
    return VsdrPackage.Literals.CORONER_CASE_TRANSFER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransferValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoronerCaseTransferOperations.validateCoronerCaseTransferValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoronerCaseTransfer init() {
    	CDAUtil.init(this);
    	return this;
  }
} //CoronerCaseTransferImpl
