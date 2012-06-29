/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPersonnelAdverseEventOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Personnel Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPersonnelAdverseEventImpl extends DerivedCDASectionImpl implements EMSPersonnelAdverseEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPersonnelAdverseEventImpl()
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
    return EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEventEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPersonnelAdverseEventOperations.validateEMSPersonnelAdverseEventEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPersonnelAdverseEvent init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSPersonnelAdverseEventImpl
