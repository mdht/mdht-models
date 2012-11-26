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
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.VitalSignOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Sign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignImpl extends ObservationImpl implements VitalSign
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VitalSignImpl()
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
    return SdtmPackage.Literals.VITAL_SIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignInterpretationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignAssociatedPosition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignAssociatedPosition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignEventStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignExclusionReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignVitalSignCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignVitalSignCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignVitalSignSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignVitalSignSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignConsciousnessState(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignConsciousnessState(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionPosition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionPosition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignCategoryAssociationVitalSignCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationVitalSignCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignconsciousnessStateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignconsciousnessStateClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignconsciousnessStateCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignconsciousnessStateCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignconsciousnessStateCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignconsciousnessStateCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignconsciousnessStateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignconsciousnessStateMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignconsciousnessStateValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignconsciousnessStateValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay getEventStudyDay()
  {
    return VitalSignOperations.getEventStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return VitalSignOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return VitalSignOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionReason()
  {
    return VitalSignOperations.getExclusionReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return VitalSignOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return VitalSignOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return VitalSignOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VitalSign init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VitalSign init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //VitalSignImpl
