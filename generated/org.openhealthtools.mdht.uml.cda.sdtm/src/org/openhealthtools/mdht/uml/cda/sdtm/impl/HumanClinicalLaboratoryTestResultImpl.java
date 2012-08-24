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
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalLaboratoryTestResultOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HumanClinicalLaboratoryTestResultImpl extends ObservationImpl implements HumanClinicalLaboratoryTestResult
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalLaboratoryTestResultImpl()
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
    return SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultFastingAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return HumanClinicalLaboratoryTestResultOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return HumanClinicalLaboratoryTestResultOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return HumanClinicalLaboratoryTestResultOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return HumanClinicalLaboratoryTestResultOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalLaboratoryTestResult init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanClinicalLaboratoryTestResult init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalLaboratoryTestResultImpl
