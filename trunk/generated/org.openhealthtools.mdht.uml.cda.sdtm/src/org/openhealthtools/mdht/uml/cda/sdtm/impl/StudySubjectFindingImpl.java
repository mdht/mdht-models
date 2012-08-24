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

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Subject Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudySubjectFindingImpl extends ObservationImpl implements StudySubjectFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudySubjectFindingImpl()
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
    return SdtmPackage.Literals.STUDY_SUBJECT_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingReferenceRangeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingReferenceRangeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingFastingAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingToxicityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingreferenceRangeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingfastingAssociationfastingStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingfastingAssociationfastingStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingfastingAssociationfastingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingfastingAssociationfastingStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingtoxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return StudySubjectFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return StudySubjectFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return StudySubjectFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectFinding init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudySubjectFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudySubjectFindingImpl
