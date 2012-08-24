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

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanLaboratoryTestResultOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanLaboratoryTestResultImpl extends ObservationImpl implements NonhumanLaboratoryTestResult
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanLaboratoryTestResultImpl()
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
    return SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultReferenceRangeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultReferenceRangeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultFastingAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultLabToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultLabToxicityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultExclusionIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultExclusionIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return NonhumanLaboratoryTestResultOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return NonhumanLaboratoryTestResultOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return NonhumanLaboratoryTestResultOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionIndicator()
  {
    return NonhumanLaboratoryTestResultOperations.getExclusionIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return NonhumanLaboratoryTestResultOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return NonhumanLaboratoryTestResultOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return NonhumanLaboratoryTestResultOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanLaboratoryTestResult init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanLaboratoryTestResult init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanLaboratoryTestResultImpl
