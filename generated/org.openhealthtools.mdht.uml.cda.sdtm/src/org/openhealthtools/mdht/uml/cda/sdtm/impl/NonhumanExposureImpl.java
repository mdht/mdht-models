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

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanExposureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanExposureImpl extends SubstanceAdministrationImpl implements NonhumanExposure
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanExposureImpl()
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
    return SdtmPackage.Literals.NONHUMAN_EXPOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureRouteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureMaxDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureApproachSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureConsumableMaterial(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureDoseAdjustmentReasonAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureDoseAdjustmentReasonAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposureStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposureStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return NonhumanExposureOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return NonhumanExposureOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanExposure init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanExposure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanExposureImpl
