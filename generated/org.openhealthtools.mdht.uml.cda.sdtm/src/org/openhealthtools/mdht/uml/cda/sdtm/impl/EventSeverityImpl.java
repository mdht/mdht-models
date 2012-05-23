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

import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventSeverityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Severity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventSeverityImpl extends ObservationImpl implements EventSeverity
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSeverityImpl()
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
    return SdtmPackage.Literals.EVENT_SEVERITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventSeverityValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EventSeverityOperations.validateEventSeverityValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EventSeverityImpl
