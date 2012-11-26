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

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ActivityEndTimingReferenceOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity End Timing Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ActivityEndTimingReferenceImpl extends ActImpl implements ActivityEndTimingReference
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityEndTimingReferenceImpl()
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
    return SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityEndTimingReference init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityEndTimingReference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ActivityEndTimingReferenceImpl
