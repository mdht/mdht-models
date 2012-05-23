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
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonHumanLaboratoryTestResultOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Human Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonHumanLaboratoryTestResultImpl extends ObservationImpl implements NonHumanLaboratoryTestResult
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonHumanLaboratoryTestResultImpl()
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
    return SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultReferenceRangeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultReferenceRangeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultBaselineIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultBaselineIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultDerivedDataIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultDerivedDataIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultFastingAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultLabToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultLabToxicityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanLaboratoryTestResultOperations.validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return NonHumanLaboratoryTestResultOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return NonHumanLaboratoryTestResultOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return NonHumanLaboratoryTestResultOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaselineIndicator getBaselineIndicator()
  {
    return NonHumanLaboratoryTestResultOperations.getBaselineIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedDataIndicator getDerivedDataIndicator()
  {
    return NonHumanLaboratoryTestResultOperations.getDerivedDataIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonHumanLaboratoryTestResult init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NonHumanLaboratoryTestResultImpl
