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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
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
  public boolean validateECGTestResultBaselineIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultBaselineIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultDerivedDataIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultDerivedDataIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateECGTestResultEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultEventStudyDay(this, diagnostics, context);
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
  public boolean validateECGTestResultecgTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationTypeCode(this, diagnostics, context);
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
  public boolean validateECGTestResultassociatedPositionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ECGTestResultOperations.validateECGTestResultassociatedPositionTypeCode(this, diagnostics, context);
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
  public BaselineIndicator getBaselineIndicator()
  {
    return ECGTestResultOperations.getBaselineIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedDataIndicator getDerivedDataIndicator()
  {
    return ECGTestResultOperations.getDerivedDataIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay getEventStudyDay()
  {
    return ECGTestResultOperations.getEventStudyDay(this);
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
  public ECGTestResult init() {
    	CDAUtil.init(this);
    	return this;
  }
} //ECGTestResultImpl
