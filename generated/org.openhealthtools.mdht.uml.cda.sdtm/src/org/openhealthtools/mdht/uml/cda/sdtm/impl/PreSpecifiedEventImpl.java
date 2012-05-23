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

import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PreSpecifiedEventOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Specified Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PreSpecifiedEventImpl extends ObservationImpl implements PreSpecifiedEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreSpecifiedEventImpl()
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
    return SdtmPackage.Literals.PRE_SPECIFIED_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreSpecifiedEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreSpecifiedEventOperations.validatePreSpecifiedEventTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreSpecifiedEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreSpecifiedEventOperations.validatePreSpecifiedEventClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreSpecifiedEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreSpecifiedEventOperations.validatePreSpecifiedEventCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreSpecifiedEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreSpecifiedEventOperations.validatePreSpecifiedEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreSpecifiedEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreSpecifiedEventOperations.validatePreSpecifiedEventMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreSpecifiedEventValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreSpecifiedEventOperations.validatePreSpecifiedEventValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PreSpecifiedEventImpl
