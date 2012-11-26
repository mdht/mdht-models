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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ECGTestResultOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECG Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ECGTestResultImpl extends ObservationImpl implements ECGTestResult
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECGTestResultImpl()
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
    return SdtmPackage.Literals.ECG_TEST_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultEcgTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultEcgTestResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultEcgTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultEcgTestResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultAssociatedPosition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultAssociatedPosition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultLeadLocationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultLeadLocationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultAssociatedConsciousness(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultAssociatedConsciousness(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedPositionpositionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedPositionpositionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedPositionpositionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedPositionpositionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedPositionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedPositionPosition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionPosition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationecgLeadLocationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationecgLeadLocationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultleadLocationAssociationEcgLeadLocation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultleadLocationAssociationEcgLeadLocation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultassociatedConsciousnessConsciousnessState(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessConsciousnessState(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return ECGTestResultOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return ECGTestResultOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return ECGTestResultOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return ECGTestResultOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return ECGTestResultOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECGTestResult init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ECGTestResult init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ECGTestResultImpl
