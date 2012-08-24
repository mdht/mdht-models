/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.TimingReferenceOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TimingReferenceImpl extends ActImpl implements TimingReference
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimingReferenceImpl()
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
    return SdtmPackage.Literals.TIMING_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociationAnchorTimePointCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimingReferenceAnchorAssociationAnchorTimePoint(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePoint(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimingReference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TimingReferenceImpl
